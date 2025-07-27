-- ##############################
-- #         PATIENTS          #
-- ##############################

INSERT INTO patients (first_name, last_name, document_type, document_number, birth_date, email, phone)
VALUES
('Juan', 'Perez', 'DNI', '12345678', '1985-05-10', 'juan.perez@example.com', '1123456789'),
('Maria', 'Gomez', 'DNI', '87654321', '1990-11-22', 'maria.gomez@example.com', '1198765432'),
('Carlos', 'Rodriguez', 'DNI', '23456789', '1978-03-15', 'carlos.r@example.com', '1134567890'),
('Ana', 'Lopez', 'PASAPORTE', '98765432', '2000-07-01', 'ana.lopez@example.com', '1109876543'),
('Pedro', 'Martinez', 'DNI', '34567890', '1965-01-20', 'pedro.m@example.com', '1145678901'),
('Laura', 'Diaz', 'DNI', '09876543', '1995-09-05', 'laura.d@example.com', '1156789012'),
('Fernando', 'Sanchez', 'DNI', '45678901', '1980-04-18', 'fernando.s@example.com', '1167890123'),
('Sofia', 'Garcia', 'DNI', '10987654', '2005-12-03', 'sofia.g@example.com', '1178901234'),
('Gonzalo', 'Ruiz', 'DNI', '56789012', '1972-08-25', 'gonzalo.r@example.com', '1189012345'),
('Valeria', 'Torres', 'PASAPORTE', '21098765', '1998-02-14', 'valeria.t@example.com', '1190123456'),
('Marcelo', 'Herrera', 'DNI', '67890123', '1960-06-30', 'marcelo.h@example.com', '1102345678'),
('Gabriela', 'Flores', 'DNI', '32109876', '1983-10-11', 'gabriela.f@example.com', '1113456789'),
('Ricardo', 'Acosta', 'DNI', '78901234', '1992-04-01', 'ricardo.a@example.com', '1124567890'),
('Lucia', 'Benitez', 'DNI', '43210987', '2002-01-28', 'lucia.b@example.com', '1135678901'),
('Agustin', 'Romero', 'DNI', '89012345', '1975-07-19', 'agustin.r@example.com', '1146789012'),
('Florencia', 'Morales', 'PASAPORTE', '54321098', '1993-09-17', 'florencia.m@example.com', '1157890123'),
('Esteban', 'Castro', 'DNI', '90123456', '1988-12-06', 'esteban.c@example.com', '1168901234'),
('Carolina', 'Navarro', 'DNI', '65432109', '1970-02-23', 'carolina.n@example.com', '1179012345'),
('Diego', 'Gil', 'DNI', '01234567', '1997-03-08', 'diego.g@example.com', '1180123456'),
('Emilia', 'Fernandez', 'DNI', '76543210', '1991-07-14', 'emilia.f@example.com', '1191234567');

-- ##############################
-- #       PRESCRIPTIONS       #
-- ##############################

-- Recordá: prescription_id se genera automáticamente

INSERT INTO prescriptions (
    patient_id, sphere_od, cylinder_od, axis_od, sphere_os, cylinder_os, axis_os,
    addition, lens_type, prescription_date, pupillary_distance, diagnosis_type, notes
)
VALUES
(1, -2.50, -0.75, 170, -2.75, -0.50, 10, NULL, 'MONOFOCAL', '2024-01-15', 62.0, 'MIOPIA', 'Lentes para lejos.'),
(2, -0.50, NULL, NULL, -0.75, NULL, NULL, NULL, 'MONOFOCAL', '2023-09-01', 60.0, 'MIOPIA', 'Fatiga visual por uso de pc. Prescripción leve.'),
(3, 0.75, NULL, NULL, 0.50, NULL, NULL, 1.00, 'PROGRESSIVE', '2024-03-05', 64.0, 'PRESBICIA', 'Lentes progresivos por inicio de presbicia.'),
(5, 1.50, -0.25, 90, 1.75, -0.50, 85, 2.00, 'PROGRESSIVE', '2024-07-22', 63.5, 'PRESBICIA', 'Ajuste de adición para visión cercana.'),
(6, -1.00, -1.25, 10, -1.25, -1.00, 175, NULL, 'MONOFOCAL', '2023-11-12', 61.0, 'ASTIGMATISMO', 'Control anual de miopía y astigmatismo.'),
(9, 0.25, -0.50, 45, 0.25, -0.75, 135, NULL, 'MONOFOCAL', '2023-10-10', 60.5, 'HIPERMETROPIA', 'Lentes para trabajo con computadora.'),
(11, 2.00, NULL, NULL, 2.25, NULL, NULL, 2.50, 'PROGRESSIVE', '2024-06-18', 64.0, 'GLAUCOMA', 'Control de progresivos para paciente con glaucoma.'),
(15, 0.50, -0.25, 100, 0.75, -0.25, 80, NULL, 'MONOFOCAL', '2024-08-01', 63.0, 'RETINOPATIA_DIABETICA', 'Revisión por retinopatía diabética. Leve corrección.'),
(17, -0.25, -0.75, 160, -0.50, -0.50, 10, 1.75, 'PROGRESSIVE', '2024-04-12', 62.5, 'PRESBICIA', 'Ajuste de graduación para progresivos.'),
(20, -1.00, -0.25, 5, -1.25, -0.50, 175, NULL, 'MONOFOCAL', '2024-03-01', 61.5, 'MIOPIA', 'Primera prescripción. Lentes de uso diario.');

-- ##############################
-- #           ORDERS          #
-- ##############################

-- Ejemplo de orden relacionada con la receta 1 (Juan Perez)

INSERT INTO orders (
    patient_id, prescription_id, order_number, product_description,
    total_amount, paid_amount, order_status, estimated_delivery,
    actual_delivery, observations
)
VALUES
(1, 1, 'ORD-001', 'Lentes monofocales con antirreflejo', 20000.00, 5000.00, 'PENDING', '2025-08-15', NULL, 'Entregar con estuche.'),
(2, 2, 'ORD-002', 'Lentes monofocales básicas', 15000.00, 15000.00, 'DELIVERED', '2025-07-15', '2025-07-14', 'Entregado sin novedades.'),
(20, 10, 'ORD-010', 'Lentes monofocales con filtro azul', 18000.00, 10000.00, 'IN_PROGRESS', '2025-08-20', NULL, 'Pedir en laboratorio. Pago parcial.');

-- ##############################
-- #           SALES           #
-- ##############################

INSERT INTO sales (
    order_id, delivery_date, delivery_by, customer_signature, notes
)
VALUES
(2, '2025-07-14 11:30:00', 'Laura Tecnica', 'FirmaDigital123', 'Entregado en mostrador.');
