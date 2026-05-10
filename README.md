# Sistema Piedra Azul – Segundo Corte

Sistema de agendamiento de citas médicas desarrollado para la asignatura Ingeniería de Software II.  
En esta segunda iteración el proyecto fue refactorizado hacia una arquitectura distribuida basada en microservicios y comunicación mediante APIs REST, con el objetivo de mejorar la escalabilidad, mantenibilidad y organización del sistema.

---

# Descripción General

El sistema permite gestionar procesos relacionados con el agendamiento de citas médicas para pacientes, médicos, terapeutas, administradores y agendadores.

La solución implementa una separación entre frontend y backend, utilizando una aplicación de escritorio desarrollada en JavaFX y múltiples microservicios desarrollados con Spring Boot.

---

# Estructura del Proyecto

SistemaPiedraAzul-main/

├── PiedraAzul/  
│   └── Aplicación principal JavaFX (Frontend)

├── piedraazul-agenda-service/  
│   └── Microservicio de agenda y gestión de citas

└── piedraazul-notification-service/  
    └── Microservicio de notificaciones

---

# Funcionalidades Implementadas

## RF1 – Listar citas por médico y fecha

Permite consultar las citas médicas programadas para un médico o terapista en una fecha determinada.

## RF2 – Crear citas desde el rol agendador

Permite registrar manualmente nuevas citas médicas desde el rol de agendador.

## RF3 – Agendamiento autónomo de citas

Permite que los pacientes consulten disponibilidad y agenden citas de manera autónoma desde la aplicación.

## RF4 – Configuración de disponibilidad médica

Permite a los administradores configurar horarios, días de atención e intervalos entre citas para médicos y terapeutas.

---

# Arquitectura del Sistema

La arquitectura implementada sigue un modelo distribuido basado en microservicios.

- El frontend JavaFX consume los servicios REST expuestos por el backend.
- `piedraazul-agenda-service` gestiona citas, pacientes, médicos, autenticación y disponibilidad.
- `piedraazul-notification-service` gestiona el envío de notificaciones y eventos relacionados con citas.
- Los servicios se comunican mediante APIs REST utilizando formato JSON.

---

# Tecnologías Utilizadas

## Frontend

- JavaFX

## Backend

- Spring Boot
- Spring Data JPA
- API REST

## Base de Datos

- MySQL

## Herramientas

- Maven
- Git
- Jira
- PlantUML

---

# Patrones GoF Implementados

| Patrón | Tipo | Propósito |
|---|---|---|
| Builder | Creacional | Construcción flexible de objetos relacionados con citas |
| Factory | Creacional | Centralización de creación de objetos |
| Facade | Estructural | Simplificación de acceso a servicios internos |
| Adapter | Estructural | Integración entre componentes y servicios externos |
| Strategy | Comportamiento | Manejo de estrategias de disponibilidad médica |
| Observer | Comportamiento | Gestión de eventos y notificaciones |

---

# Servicios

| Servicio | Puerto |
|---|---|
| piedraazul-agenda-service | http://localhost:8081 |
| piedraazul-notification-service | http://localhost:8082 |

---

# Ejecución del Proyecto

## 1. Clonar el repositorio

```bash
git clone <url-repositorio>
2. Ejecutar el microservicio de agenda
cd piedraazul-agenda-service
mvn spring-boot:run
3. Ejecutar el microservicio de notificaciones
cd piedraazul-notification-service
mvn spring-boot:run
4. Ejecutar el frontend JavaFX

Ejecutar la aplicación PiedraAzul desde el IDE o mediante Maven.

Integrantes
Brayan Steven Charry Vela
Sebastian Ruiz Segura
Jhoiner Alberto Puentes Figueroa

Curso

Ingeniería de Software II
Universidad del Cauca
2026-1
