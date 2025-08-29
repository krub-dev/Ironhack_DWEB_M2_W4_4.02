# Ironhack_DWEB_M2_W4_4.02

Intro to Spring Boot
Repositorio del lab con rutas y modelos para gestionar empleados y pacientes de un hospital distribuido en varias ciudades.

## Tablas y datos

- **employee:** Tabla de empleados (doctores) con campos: employee_id, department, name, status.
- **patient:** Tabla de pacientes con campos: patient_id, name, date_of_birth, admitted_by (FK a employee).

Incluye datos de ejemplo para ambos.

## Especificaciones de las rutas

- Obtener todos los doctores
- Obtener doctor por ID
- Obtener doctores por status
- Obtener doctores por departamento
- Obtener todos los pacientes
- Obtener paciente por ID
- Obtener pacientes por rango de fecha de nacimiento
- Obtener pacientes por departamento del doctor que los admitió
- Obtener pacientes cuyo doctor tiene status OFF

## Esquema

Consulta el diagrama ER incluido en este repositorio para ver las relaciones entre las entidades.

![Hosp Manager](./schema-hosp-manager.png)

---
