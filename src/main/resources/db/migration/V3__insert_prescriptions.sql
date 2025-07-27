
-- ##############################
-- #       PRESCRIPTIONS       #
-- ##############################

INSERT INTO prescriptions (
    patient_id, sphere_od, cylinder_od, axis_od, sphere_os, cylinder_os, axis_os,
    addition, lens_type, prescription_date, pupillary_distance, diagnosis_type, notes
)
VALUES
(1, -2.50, -0.75, 170, -2.75, -0.50, 10, NULL, 'DISTANCE', '2024-01-15', 62.0, 'MYOPIA', 'Lentes para lejos.'),
(2, -0.50, NULL, NULL, -0.75, NULL, NULL, NULL, 'DISTANCE', '2023-09-01', 60.0, 'MYOPIA', 'Fatiga visual por uso de pc. Prescripción leve.'),
(3, 0.75, NULL, NULL, 0.50, NULL, NULL, 1.00, 'PROGRESSIVE', '2024-03-05', 64.0, 'PRESBYOPIA', 'Lentes progresivos por inicio de PRESBYOPIA.'),
(4, -1.25, -0.50, 85, -1.50, -0.25, 95, NULL, 'DISTANCE', '2024-05-01', 62.5, 'MYOPIA', 'Control anual.'),
(5, 1.50, -0.25, 90, 1.75, -0.50, 85, 2.00, 'PROGRESSIVE', '2024-07-22', 63.5, 'PRESBYOPIA', 'Ajuste de adición para visión cercana.'),
(6, -1.00, -1.25, 10, -1.25, -1.00, 175, NULL, 'DISTANCE', '2023-11-12', 61.0, 'ASTIGMATISM', 'Control anual de miopía y ASTIGMATISM.'),
(7, -0.75, NULL, NULL, -1.00, NULL, NULL, NULL, 'DISTANCE', '2024-01-10', 61.0, 'MYOPIA', 'Uso para lectura.'),
(8, 1.25, -0.50, 60, 1.50, -0.75, 65, 2.25, 'PROGRESSIVE', '2024-02-15', 63.0, 'PRESBYOPIA', 'Lentes progresivos.'),
(9, 0.25, -0.50, 45, 0.25, -0.75, 135, NULL, 'DISTANCE', '2023-10-10', 60.5, 'HYPEROPIA', 'Lentes para trabajo con computadora.'),
(10, 2.00, -1.00, 120, 1.75, -0.75, 110, NULL, 'DISTANCE', '2023-12-20', 64.0, 'ASTIGMATISM', 'Miopía y astigmatismo.'),
(11, 2.00, NULL, NULL, 2.25, NULL, NULL, 2.50, 'PROGRESSIVE', '2024-06-18', 64.0, 'GLAUCOMA', 'Control de progresivos para paciente con glaucoma.'),
(12, -1.00, NULL, NULL, -1.25, NULL, NULL, 1.50, 'PROGRESSIVE', '2024-03-15', 60.5, 'PRESBYOPIA', 'Inicio presbicia.'),
(13, -2.25, -0.25, 90, -2.50, -0.25, 95, NULL, 'DISTANCE', '2024-07-10', 61.0, 'MYOPIA', 'Miopía moderada.'),
(15, 0.50, -0.25, 100, 0.75, -0.25, 80, NULL, 'DISTANCE', '2024-08-01', 63.0, 'DIABETIC_RETINOPATHY', 'Revisión por retinopatía diabética. Leve corrección.'),
(14, 0.00, NULL, NULL, -0.25, NULL, NULL, NULL, 'DISTANCE', '2024-06-05', 62.0, 'HYPEROPIA', 'Corrección leve.'),
(16, 0.50, -0.50, 180, 0.75, -0.25, 170, NULL, 'DISTANCE', '2024-07-18', 63.0, 'ASTIGMATISM', 'Astigmatismo controlado.'),
(17, -0.25, -0.75, 160, -0.50, -0.50, 10, 1.75, 'PROGRESSIVE', '2024-04-12', 62.5, 'PRESBYOPIA', 'Ajuste de graduación para progresivos.'),
(18, 1.00, NULL, NULL, 1.25, NULL, NULL, 2.00, 'PROGRESSIVE', '2024-02-28', 64.0, 'PRESBYOPIA', 'Paciente mayor.'),
(19, -0.50, NULL, NULL, -0.75, NULL, NULL, NULL, 'DISTANCE', '2024-05-14', 60.0, 'MYOPIA', 'Corrección básica.'),
(20, -1.00, -0.25, 5, -1.25, -0.50, 175, NULL, 'DISTANCE', '2024-03-01', 61.5, 'MYOPIA', 'Primera prescripción. Lentes de uso diario.'),
(21, -2.00, -0.75, 150, -2.25, -0.50, 160, NULL, 'DISTANCE', '2024-06-22', 62.5, 'MYOPIA', 'Fatiga visual.'),
(22, 1.00, -0.25, 45, 1.25, -0.50, 55, 2.50, 'PROGRESSIVE', '2024-04-10', 64.0, 'PRESBYOPIA', 'Lentes progresivos nuevos.'),
(23, -1.50, -1.00, 90, -1.75, -1.25, 100, NULL, 'DISTANCE', '2024-03-18', 61.5, 'ASTIGMATISM', 'Astigmatismo severo.'),
(24, 0.75, NULL, NULL, 1.00, NULL, NULL, 1.50, 'PROGRESSIVE', '2024-01-30', 62.0, 'PRESBYOPIA', 'Inicio de presbicia.'),
(25, -0.25, -0.25, 45, -0.50, -0.50, 50, NULL, 'DISTANCE', '2024-06-01', 60.0, 'MYOPIA', 'Miopía leve.'),
(26, 1.75, NULL, NULL, 2.00, NULL, NULL, 2.25, 'PROGRESSIVE', '2024-03-21', 63.5, 'GLAUCOMA', 'Paciente con glaucoma.'),
(27, -0.75, -0.25, 30, -1.00, -0.50, 40, NULL, 'DISTANCE', '2024-05-05', 62.0, 'ASTIGMATISM', 'Uso diario.'),
(28, 2.25, -0.50, 70, 2.50, -0.75, 80, 2.00, 'PROGRESSIVE', '2024-04-25', 64.5, 'PRESBYOPIA', 'Lentes progresivos.'),
(29, -1.25, NULL, NULL, -1.50, NULL, NULL, NULL, 'DISTANCE', '2024-07-25', 61.5, 'MYOPIA', 'Paciente joven.'),
(30, 0.00, NULL, NULL, -0.25, NULL, NULL, NULL, 'DISTANCE', '2024-08-01', 60.0, 'MYOPIA', 'Uso ocasional.');
