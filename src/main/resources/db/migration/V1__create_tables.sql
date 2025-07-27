CREATE DATABASE IF NOT EXISTS optidata;
USE optidata;

-- Tabla: patients
CREATE TABLE IF NOT EXISTS patients (
    patient_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    document_type VARCHAR(20) NOT NULL,
    document_number VARCHAR(20) NOT NULL UNIQUE,
    birth_date DATE NOT NULL,
    email VARCHAR(150),
    phone VARCHAR(20),
    active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- Tabla: prescriptions
CREATE TABLE IF NOT EXISTS prescriptions (
    prescription_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    patient_id BIGINT NOT NULL,
    sphere_od DECIMAL(4,2),
    cylinder_od DECIMAL(4,2),
    axis_od INT CHECK (axis_od >= 0 AND axis_od <= 180),
    sphere_os DECIMAL(4,2),
    cylinder_os DECIMAL(4,2),
    axis_os INT CHECK (axis_os >= 0 AND axis_os <= 180),
    addition DECIMAL(4,2),
    lens_type VARCHAR(50) NOT NULL,
    prescription_date DATE NOT NULL,
    pupillary_distance DECIMAL(5,2),
    diagnosis_type VARCHAR(50) NOT NULL,
    notes VARCHAR(1000),
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (patient_id) REFERENCES patients(patient_id)
);

-- Tabla: orders
CREATE TABLE IF NOT EXISTS orders (
    order_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    patient_id BIGINT NOT NULL,
    prescription_id BIGINT,
    order_number VARCHAR(255),
    product_description VARCHAR(1000),
    total_amount DECIMAL(10,2),
    paid_amount DECIMAL(10,2) DEFAULT 0,
    order_status VARCHAR(20) DEFAULT 'PENDING',
    estimated_delivery DATE,
    actual_delivery DATE,
    observations VARCHAR(1000),
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (patient_id) REFERENCES patients(patient_id),
    FOREIGN KEY (prescription_id) REFERENCES prescriptions(prescription_id)
);

-- Tabla: sales
CREATE TABLE IF NOT EXISTS sales (
    sale_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    order_id BIGINT NOT NULL,
    delivery_date DATETIME,
    delivery_by VARCHAR(255),
    customer_signature VARCHAR(255),
    notes VARCHAR(1000),
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (order_id) REFERENCES orders(order_id)
);
