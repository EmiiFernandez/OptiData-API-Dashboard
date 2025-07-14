-- src/main/resources/sql/data.sql

-- #############################################
-- #               INSERT PATIENTS             #
-- #############################################

INSERT INTO patients (first_name, last_name, identity_document, document_type, birth_date, email, phone) VALUES
('Juan', 'Perez', '12345678', 'DNI', '1985-05-10', 'juan.perez@example.com', '1123456789'),
('Maria', 'Gomez', '87654321', 'DNI', '1990-11-22', 'maria.gomez@example.com', '1198765432'),
('Carlos', 'Rodriguez', '23456789', 'DNI', '1978-03-15', 'carlos.r@example.com', '1134567890'),
('Ana', 'Lopez', '98765432', 'PASAPORTE', '2000-07-01', 'ana.lopez@example.com', '1109876543'),
('Pedro', 'Martinez', '34567890', 'DNI', '1965-01-20', 'pedro.m@example.com', '1145678901'),
('Laura', 'Diaz', '09876543', 'DNI', '1995-09-05', 'laura.d@example.com', '1156789012'),
('Fernando', 'Sanchez', '45678901', 'DNI', '1980-04-18', 'fernando.s@example.com', '1167890123'),
('Sofia', 'Garcia', '10987654', 'DNI', '2005-12-03', 'sofia.g@example.com', '1178901234'),
('Gonzalo', 'Ruiz', '56789012', 'DNI', '1972-08-25', 'gonzalo.r@example.com', '1189012345'),
('Valeria', 'Torres', '21098765', 'PASAPORTE', '1998-02-14', 'valeria.t@example.com', '1190123456'),
('Marcelo', 'Herrera', '67890123', 'DNI', '1960-06-30', 'marcelo.h@example.com', '1102345678'),
('Gabriela', 'Flores', '32109876', 'DNI', '1983-10-11', 'gabriela.f@example.com', '1113456789'),
('Ricardo', 'Acosta', '78901234', 'DNI', '1992-04-01', 'ricardo.a@example.com', '1124567890'),
('Lucia', 'Benitez', '43210987', 'DNI', '2002-01-28', 'lucia.b@example.com', '1135678901'),
('Agustin', 'Romero', '89012345', 'DNI', '1975-07-19', 'agustin.r@example.com', '1146789012'),
('Florencia', 'Morales', '54321098', 'PASAPORTE', '1993-09-17', 'florencia.m@example.com', '1157890123'),
('Esteban', 'Castro', '90123456', 'DNI', '1988-12-06', 'esteban.c@example.com', '1168901234'),
('Carolina', 'Navarro', '65432109', 'DNI', '1970-02-23', 'carolina.n@example.com', '1179012345'),
('Diego', 'Gil', '01234567', 'DNI', '1997-03-08', 'diego.g@example.com', '1180123456'),
('Emilia', 'Fernandez', '76543210', 'DNI', '1991-07-14', 'emilia.f@example.com', '1191234567');


-- #############################################
-- #             INSERT CONSULTATIONS          #
-- #############################################
-- Asumiendo que los IDs de pacientes se auto-incrementan de 1 a 20

-- Consultas para Juan Perez (id_patient=1)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(1, '2024-01-15 10:00:00', 'Revision anual', 'Paciente reporta vision borrosa de lejos.'),
(1, '2025-02-20 14:30:00', 'Control post-operatorio', 'Excelente recuperación tras cirugía de cataratas.');

-- Consultas para Maria Gomez (id_patient=2)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(2, '2023-09-01 09:00:00', 'Dolor de cabeza y fatiga visual', 'Uso prolongado de pantallas.');

-- Consultas para Carlos Rodriguez (id_patient=3)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(3, '2024-03-05 11:15:00', 'Revision rutinaria', 'Sospecha de presbicia incipiente.');

-- Consultas para Ana Lopez (id_patient=4)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(4, '2025-01-10 16:00:00', 'Ojo seco', 'Recomendacion de lagrimas artificiales.');

-- Consultas para Pedro Martinez (id_patient=5)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(5, '2024-07-22 10:30:00', 'Cambio de graduacion', 'Vision de cerca dificultosa.');

-- Consultas para Laura Diaz (id_patient=6)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(6, '2023-11-12 13:00:00', 'Revision anual', 'Control de miopia. Sin cambios significativos.');

-- Consultas para Fernando Sanchez (id_patient=7)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(7, '2024-05-01 10:45:00', 'Ardor y picazon', 'Posible conjuntivitis. Tratamiento prescrito.');

-- Consultas para Sofia Garcia (id_patient=8)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(8, '2025-03-01 09:30:00', 'Primer control oftalmologico', 'Revision general sin problemas graves.');

-- Consultas para Gonzalo Ruiz (id_patient=9)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(9, '2024-02-28 15:00:00', 'Vision doble', 'Derivacion a especialista en estrabismo.');

-- Consultas para Valeria Torres (id_patient=10)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(10, '2023-10-10 11:00:00', 'Control de lentes de contacto', 'Sin complicaciones. Educacion sobre higiene.');

-- Consultas para Marcelo Herrera (id_patient=11)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(11, '2024-06-18 14:00:00', 'Revision glaucoma', 'Presion intraocular estable. Continuar medicacion.');

-- Consultas para Gabriela Flores (id_patient=12)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(12, '2025-04-03 10:00:00', 'Control post-lasik', 'Vision 20/20. No requiere correccion.');

-- Consultas para Ricardo Acosta (id_patient=13)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(13, '2024-01-25 11:30:00', 'Consulta por trauma ocular', 'Recomendacion de reposo y medicacion.');

-- Consultas para Lucia Benitez (id_patient=14)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(14, '2023-12-07 16:45:00', 'Dolor en los ojos', 'Posible fatiga visual por estudio intenso.');

-- Consultas para Agustin Romero (id_patient=15)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(15, '2024-08-01 09:00:00', 'Revision diabeticos', 'Control de fondo de ojo. Retinopatia leve.');

-- Consultas para Florencia Morales (id_patient=16)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(16, '2025-05-09 13:00:00', 'Vision borrosa', 'Necesidad de cambio de graduacion.');

-- Consultas para Esteban Castro (id_patient=17)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(17, '2024-04-12 10:15:00', 'Control de presbicia', 'Ajuste de adicion para lentes progresivos.');

-- Consultas para Carolina Navarro (id_patient=18)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(18, '2023-11-20 14:00:00', 'Lagrimeo constante', 'Posible obstruccion de conducto lagrimal.');

-- Consultas para Diego Gil (id_patient=19)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(19, '2025-06-15 11:00:00', 'Revision general', 'Salud ocular optima. Sin anomalias.');

-- Consultas para Emilia Fernandez (id_patient=20)
INSERT INTO consultations (patient_id, consultation_date, reason, observations) VALUES
(20, '2024-03-01 12:00:00', 'Examen de agudeza visual', 'Necesidad de correccion para miopia leve.'),
(20, '2024-10-01 12:00:00', 'Control de graduacion', 'Confirmacion de estabilidad de miopia.');

-- #############################################
-- #           INSERT PRESCRIPTIONS            #
-- #############################################
-- Asumiendo que los IDs de consultas se auto-incrementan secuencialmente.
-- Los IDs de consulta serán 1 para la primera consulta de Juan, 2 para la segunda de Juan, 3 para Maria, etc.

-- Prescripciones para Juan Perez (id_consultation=1)
INSERT INTO prescriptions (consultation_id, sphere_od, cylinder_od, axis_od, sphere_os, cylinder_os, axis_os, addition, lens_type, prescription_date, pupillary_distance, diagnosis_type, notes) VALUES
(1, -2.50, -0.75, 170, -2.75, -0.50, 10, NULL, 'MONOFOCAL', '2024-01-15', 62.0, 'MIOPIA', 'Lentes para lejos.');

-- Prescripciones para Maria Gomez (id_consultation=3)
INSERT INTO prescriptions (consultation_id, sphere_od, cylinder_od, axis_od, sphere_os, cylinder_os, axis_os, addition, lens_type, prescription_date, pupillary_distance, diagnosis_type, notes) VALUES
(3, -0.50, NULL, NULL, -0.75, NULL, NULL, NULL, 'MONOFOCAL', '2023-09-01', 60.0, 'MIOPIA', 'Fatiga visual por uso de pc. Prescripcion leve.');

-- Prescripciones para Carlos Rodriguez (id_consultation=4)
INSERT INTO prescriptions (consultation_id, sphere_od, cylinder_od, axis_od, sphere_os, cylinder_os, axis_os, addition, lens_type, prescription_date, pupillary_distance, diagnosis_type, notes) VALUES
(4, +0.75, NULL, NULL, +0.50, NULL, NULL, +1.00, 'PROGRESIVO', '2024-03-05', 64.0, 'PRESBICIA', 'Lentes progresivos por inicio de presbicia.');

-- Prescripciones para Pedro Martinez (id_consultation=6)
INSERT INTO prescriptions (consultation_id, sphere_od, cylinder_od, axis_od, sphere_os, cylinder_os, axis_os, addition, lens_type, prescription_date, pupillary_distance, diagnosis_type, notes) VALUES
(6, +1.50, -0.25, 90, +1.75, -0.50, 85, +2.00, 'PROGRESIVO', '2024-07-22', 63.5, 'PRESBICIA', 'Ajuste de adicion para vision cercana.');

-- Prescripciones para Laura Diaz (id_consultation=7)
INSERT INTO prescriptions (consultation_id, sphere_od, cylinder_od, axis_od, sphere_os, cylinder_os, axis_os, addition, lens_type, prescription_date, pupillary_distance, diagnosis_type, notes) VALUES
(7, -1.00, -1.25, 10, -1.25, -1.00, 175, NULL, 'MONOFOCAL', '2023-11-12', 61.0, 'ASTIGMATISMO', 'Control anual de miopia y astigmatismo.');

-- Prescripciones para Gonzalo Ruiz (id_consultation=10)
INSERT INTO prescriptions (consultation_id, sphere_od, cylinder_od, axis_od, sphere_os, cylinder_os, axis_os, addition, lens_type, prescription_date, pupillary_distance, diagnosis_type, notes) VALUES
(10, +0.25, -0.50, 45, +0.25, -0.75, 135, NULL, 'MONOFOCAL', '2023-10-10', 60.5, 'HIPERMETROPIA', 'Lentes para trabajo con computadora.');

-- Prescripciones para Marcelo Herrera (id_consultation=12)
INSERT INTO prescriptions (consultation_id, sphere_od, cylinder_od, axis_od, sphere_os, cylinder_os, axis_os, addition, lens_type, prescription_date, pupillary_distance, diagnosis_type, notes) VALUES
(12, +2.00, NULL, NULL, +2.25, NULL, NULL, +2.50, 'PROGRESIVO', '2024-06-18', 64.0, 'GLAUCOMA', 'Control de progresivos para paciente con glaucoma.');

-- Prescripciones para Agustin Romero (id_consultation=16)
INSERT INTO prescriptions (consultation_id, sphere_od, cylinder_od, axis_od, sphere_os, cylinder_os, axis_os, addition, lens_type, prescription_date, pupillary_distance, diagnosis_type, notes) VALUES
(16, +0.50, -0.25, 100, +0.75, -0.25, 80, NULL, 'MONOFOCAL', '2024-08-01', 63.0, 'RETINOPATIA_DIABETICA', 'Revision por retinopatia diabetica. Leve correccion.');

-- Prescripciones para Esteban Castro (id_consultation=18)
INSERT INTO prescriptions (consultation_id, sphere_od, cylinder_od, axis_od, sphere_os, cylinder_os, axis_os, addition, lens_type, prescription_date, pupillary_distance, diagnosis_type, notes) VALUES
(18, -0.25, -0.75, 160, -0.50, -0.50, 10, +1.75, 'PROGRESIVO', '2024-04-12', 62.5, 'PRESBICIA', 'Ajuste de graduacion para progresivos.');

-- Prescripciones para Emilia Fernandez (id_consultation=21)
INSERT INTO prescriptions (consultation_id, sphere_od, cylinder_od, axis_od, sphere_os, cylinder_os, axis_os, addition, lens_type, prescription_date, pupillary_distance, diagnosis_type, notes) VALUES
(21, -1.00, -0.25, 5, -1.25, -0.50, 175, NULL, 'MONOFOCAL', '2024-03-01', 61.5, 'MIOPIA', 'Primera prescripcion. Lentes de uso diario.');