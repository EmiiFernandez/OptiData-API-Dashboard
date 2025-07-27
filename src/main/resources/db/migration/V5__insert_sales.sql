-- ##############################
-- #           SALES           #
-- ##############################

INSERT INTO sales (
    order_id, delivery_date, delivery_by, customer_signature, notes
)
VALUES
((SELECT order_id FROM orders WHERE order_number = 'ORD-002'), '2025-07-14 11:30:00', 'Laura Técnica', 'FirmaDigital123', 'Entregado en mostrador.'),
((SELECT order_id FROM orders WHERE order_number = 'ORD-004'), '2025-07-19 15:00:00', 'Carlos Técnico', 'Firma456', 'Entregado sin novedad.'),
((SELECT order_id FROM orders WHERE order_number = 'ORD-006'), '2025-07-21 10:00:00', 'Marta Técnica', 'Firma789', 'Cliente satisfecho.'),
((SELECT order_id FROM orders WHERE order_number = 'ORD-007'), '2025-07-22 13:00:00', 'Laura Técnica', 'FirmaABC', 'Sin novedades.'),
((SELECT order_id FROM orders WHERE order_number = 'ORD-009'), '2025-07-23 11:45:00', 'Luis Técnico', 'FirmaDEF', 'Entrega sin observaciones.'),
((SELECT order_id FROM orders WHERE order_number = 'ORD-011'), '2025-07-24 14:30:00', 'Juan Técnico', 'FirmaGHI', 'Cliente presente.'),
((SELECT order_id FROM orders WHERE order_number = 'ORD-013'), '2025-07-26 12:00:00', 'Marta Técnica', 'FirmaJKL', 'Sin reclamos.'),
((SELECT order_id FROM orders WHERE order_number = 'ORD-015'), '2025-07-27 17:20:00', 'Ana Técnica', 'FirmaMNO', 'Entrega normal.'),
((SELECT order_id FROM orders WHERE order_number = 'ORD-016'), '2025-07-28 09:45:00', 'Pablo Técnico', 'FirmaPQR', 'Correcta entrega.'),
((SELECT order_id FROM orders WHERE order_number = 'ORD-018'), '2025-07-29 13:10:00', 'Pedro Técnico', 'FirmaSTU', 'Cliente conforme.'),
((SELECT order_id FROM orders WHERE order_number = 'ORD-019'), '2025-07-30 14:15:00', 'Soledad Técnica', 'FirmaVWX', 'Entrega exitosa.'),
((SELECT order_id FROM orders WHERE order_number = 'ORD-022'), '2025-08-01 10:30:00', 'Lucía Técnica', 'FirmaYZA', 'Revisión incluida.'),
((SELECT order_id FROM orders WHERE order_number = 'ORD-024'), '2025-08-02 11:00:00', 'Carlos Técnico', 'FirmaBCD', 'Entrega controlada.'),
((SELECT order_id FROM orders WHERE order_number = 'ORD-025'), '2025-08-03 15:00:00', 'Laura Técnica', 'FirmaEFG', 'Entrega al día.'),
((SELECT order_id FROM orders WHERE order_number = 'ORD-027'), '2025-08-04 12:30:00', 'Pedro Técnico', 'FirmaHIJ', 'Sin novedades.'),
((SELECT order_id FROM orders WHERE order_number = 'ORD-028'), '2025-08-05 16:00:00', 'Martina Técnica', 'FirmaKLM', 'Alta gama entregada.'),
((SELECT order_id FROM orders WHERE order_number = 'ORD-029'), '2025-08-06 09:00:00', 'Joaquín Técnico', 'FirmaNOP', 'Cliente joven conforme.'),
((SELECT order_id FROM orders WHERE order_number = 'ORD-030'), '2025-08-07 14:30:00', 'Diego Técnico', 'FirmaQRS', 'Uso ocasional confirmado.');
