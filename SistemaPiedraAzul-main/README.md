Sistema Piedra Azul
Gestión del Proyecto (SCRUM)

La gestión del proyecto Sistema Piedra Azul se realizó mediante la metodología ágil SCRUM, utilizando la herramienta Jira para la planificación, organización y seguimiento de las actividades del equipo de desarrollo.

En el tablero de Jira se gestionaron los siguientes elementos del proyecto:

Épicas del proyecto
Historias de usuario
Planificación de sprints (Sprint Planning)
Asignación de tareas a los integrantes del equipo
Seguimiento del avance del sprint
Control del estado de las tareas (pendiente, en proceso, finalizado)

Enlace al tablero del proyecto (Jira):
🔗 https://jpuentesfigueroa.atlassian.net/jira/software/projects/SCRUM/boards/1

Diseño de Interfaces (Figma)

El diseño de las interfaces gráficas del sistema fue desarrollado utilizando la herramienta Figma, donde se creó el prototipo visual e interactivo del sistema Piedra Azul.

El prototipo incluye las siguientes interfaces principales:

Pantalla de inicio de sesión (Login)
Registro de usuarios
Navegación inicial del sistema
Prototipo interactivo del sistema

Enlace al prototipo en Figma:
🔗 https://www.figma.com/design/YoEGlUqOlbJTpIGclQ1s2t/PIEDRAAZUL?node-id=0-1&t=2hmRGyNtdajBUnYJ-1


## Transformación del monolito a microservicios

El sistema Piedra Azul fue reorganizado para separar responsabilidades del monolito original. La aplicación principal JavaFX se mantiene como cliente de escritorio, mientras que la lógica de agenda y notificaciones fue trasladada a microservicios independientes.
# Sistema Piedra Azul

## Transformación del monolito a microservicios

El sistema Piedra Azul fue refactorizado de manera incremental, pasando de una aplicación monolítica a una arquitectura distribuida basada en microservicios. La estrategia utilizada fue una migración gradual tipo **Strangler Fig**, donde se fueron extrayendo funcionalidades específicas del monolito hacia servicios independientes, manteniendo la aplicación JavaFX como cliente transicional.

## Arquitectura actual

La solución quedó organizada en tres componentes principales:

```txt
SistemaPiedraAzul-main/
│
├── SistemaPiedraAzul-main/
│   └── PiedraAzul
│       └── Cliente JavaFX transicional
│
├── piedraazul-agenda-service
│   └── Microservicio de agenda, citas, médicos y disponibilidad
│
└── piedraazul-notification-service
    └── Microservicio de notificaciones
    
GET  /api/citas?medicoId=16&fecha=2026-05-24
POST /api/citas
POST /api/notificaciones/cita-creada
GET  /api/notificaciones/health