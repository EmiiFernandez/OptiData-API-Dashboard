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
(3, 4, 'ORD-003', 'Lentes progresivos gama media', 25000, 15000, 'IN_PROGRESS', '2025-08-25', NULL, 'Cliente pidió tonalidad gris.'),
(4, 5, 'ORD-004', 'Lentes de lectura simples', 12000, 12000, 'DELIVERED', '2025-07-20', '2025-07-19', 'Sin observaciones.'),
(5, 6, 'ORD-005', 'Lentes con filtro azul', 18000, 5000, 'PENDING', '2025-08-18', NULL, 'A pagar saldo.'),
(6, 7, 'ORD-006', 'Lentes monofocales premium', 20000, 20000, 'DELIVERED', '2025-07-22', '2025-07-21', 'Cliente conforme.'),
(7, 8, 'ORD-007', 'Lentes antireflejo y filtro UV', 19000, 19000, 'DELIVERED', '2025-07-23', '2025-07-22', 'Entregado sin novedad.'),
(8, 9, 'ORD-008', 'Lentes progresivos de policarbonato', 28000, 10000, 'IN_PROGRESS', '2025-08-10', NULL, 'Falta saldo.'),
(9, 10, 'ORD-009', 'Lentes simples con estuche', 14000, 14000, 'DELIVERED', '2025-07-24', '2025-07-23', 'Incluye estuche rígido.'),
(20, 10, 'ORD-010', 'Lentes monofocales con filtro azul', 18000.00, 10000.00, 'IN_PROGRESS', '2025-08-20', NULL, 'Pedir en laboratorio. Pago parcial.'),
(10, 11, 'ORD-011', 'Lentes de descanso', 10000, 10000, 'DELIVERED', '2025-07-25', '2025-07-24', 'Uso ocasional.'),
(11, 12, 'ORD-012', 'Lentes con filtro azul y antirreflejo', 22000, 12000, 'PENDING', '2025-08-10', NULL, 'Esperando confirmación.'),
(12, 13, 'ORD-013', 'Lentes de lectura básicos', 11000, 11000, 'DELIVERED', '2025-07-26', '2025-07-26', 'Entregado al paciente.'),
(13, 14, 'ORD-014', 'Lentes progresivos personalizados', 30000, 10000, 'IN_PROGRESS', '2025-08-15', NULL, 'Alta precisión.'),
(14, 15, 'ORD-015', 'Lentes con aumento +1.50', 9500, 9500, 'DELIVERED', '2025-07-27', '2025-07-27', 'Corrección leve.'),
(15, 16, 'ORD-016', 'Lentes para astigmatismo', 16000, 16000, 'DELIVERED', '2025-07-28', '2025-07-28', 'Buen ajuste.'),
(16, 17, 'ORD-017', 'Lentes para miopía', 13000, 8000, 'PENDING', '2025-08-22', NULL, 'Falta abonar saldo.'),
(17, 18, 'ORD-018', 'Lentes de visión intermedia', 17000, 17000, 'DELIVERED', '2025-07-29', '2025-07-29', 'Sin observaciones.'),
(18, 19, 'ORD-019', 'Lentes simples antirreflejo', 15000, 15000, 'DELIVERED', '2025-07-30', '2025-07-30', 'Entrega sin novedades.'),
(21, 21, 'ORD-021', 'Lentes de descanso + filtro UV', 14500, 5000, 'PENDING', '2025-08-25', NULL, 'Cliente pagará el saldo.'),
(22, 22, 'ORD-022', 'Lentes progresivos', 27000, 27000, 'DELIVERED', '2025-08-01', '2025-08-01', 'Revisión completa.'),
(23, 23, 'ORD-023', 'Lentes para astigmatismo severo', 21000, 10000, 'IN_PROGRESS', '2025-08-10', NULL, 'Laboratorio en proceso.'),
(24, 24, 'ORD-024', 'Lentes para presbicia', 19500, 19500, 'DELIVERED', '2025-08-02', '2025-08-02', 'Con funda blanda.'),
(25, 25, 'ORD-025', 'Lentes con aumento +0.50', 10500, 10500, 'DELIVERED', '2025-08-03', '2025-08-03', 'Entrega al día.'),
(26, 26, 'ORD-026', 'Lentes para glaucoma', 29000, 10000, 'IN_PROGRESS', '2025-08-20', NULL, 'Pendiente entrega.'),
(27, 27, 'ORD-027', 'Lentes de uso diario', 15000, 15000, 'DELIVERED', '2025-08-04', '2025-08-04', 'Buen confort.'),
(28, 28, 'ORD-028', 'Lentes progresivos alta gama', 32000, 32000, 'DELIVERED', '2025-08-05', '2025-08-05', 'Alta calidad.'),
(29, 29, 'ORD-029', 'Lentes para miopía leve', 13000, 13000, 'DELIVERED', '2025-08-06', '2025-08-06', 'Cliente joven.'),
(30, 30, 'ORD-030', 'Lentes de uso ocasional', 9000, 9000, 'DELIVERED', '2025-08-07', '2025-08-07', 'Entrega rápida.');