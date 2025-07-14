CREATE DATABASE IF NOT EXISTS optidata;
USE optidata;

-- Table: patients
CREATE TABLE IF NOT EXISTS patients (
    id_patient BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    identity_document VARCHAR(20) NOT NULL UNIQUE,
    document_type VARCHAR(20) NOT NULL,
    birth_date DATE NOT NULL,
    email VARCHAR(150),
    phone VARCHAR(20),
    active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- Table: consultations
CREATE TABLE IF NOT EXISTS consultations (
    id_consultation BIGINT AUTO_INCREMENT PRIMARY KEY,
    patient_id BIGINT NOT NULL,
    consultation_date DATETIME NOT NULL,
    reason VARCHAR(500) NOT NULL,
    observations VARCHAR(2000),
    active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (patient_id) REFERENCES patients(id_patient)
);

-- Table: prescriptions
CREATE TABLE IF NOT EXISTS prescriptions (
    id_prescription BIGINT AUTO_INCREMENT PRIMARY KEY,
    consultation_id BIGINT NOT NULL,
    sphere_od DECIMAL(4,2),
    cylinder_od DECIMAL(4,2),
    axis_od INT CHECK (axis_od >= 0 AND axis_od <= 180),
    sphere_os DECIMAL(4,2),
    cylinder_os DECIMAL(4,2),
    axis_os INT CHECK (axis_os >= 0 AND axis_os <= 180),
    addition DECIMAL(4,2),
    lens_type VARCHAR(50) NOT NULL, -- Corresponds to LensType enum (MONOFOCAL, BIFOCAL, PROGRESSIVE, etc.)
    prescription_date DATE NOT NULL,
    pupillary_distance DECIMAL(5,2),
    diagnosis_type VARCHAR(50) NOT NULL, -- Corresponds to DiagnosisType enum (MYOPIA, ASTIGMATIMS, GLAUCOMA, etc.)
    notes VARCHAR(1000),
    active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (consultation_id) REFERENCES consultations(id_consultation)
);