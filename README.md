# 🧾 ecommerce-order-service

- El Order Service gestiona la creación, consulta y actualización del estado de las órdenes dentro del sistema de ecommerce.
- Es el servicio encargado de iniciar el flujo de compra y coordinarse con Inventory Service mediante Apache Kafka para validar cada pedido.

## Funciones principales

- Crear nuevas órdenes con estado inicial PENDING

- Listar y consultar órdenes por ID

- Publicar eventos en Kafka:

	- ecommerce.orders.placed (cuando se crea una orden)

Consumir eventos de inventario:

	- ecommerce.orders.confirmed

	- ecommerce.orders.cancelled

Actualizar el estado final de la orden según respuesta de inventario

Responsabilidad dentro de la arquitectura

Centraliza el flujo de compra, garantizando que cada orden siga un proceso claro y coordinado en el ecosistema de microservicios.