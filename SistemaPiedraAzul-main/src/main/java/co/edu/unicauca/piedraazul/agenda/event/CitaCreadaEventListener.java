package co.edu.unicauca.piedraazul.agenda.event;

import co.edu.unicauca.piedraazul.agenda.client.NotificationServiceClient;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CitaCreadaEventListener {

    private final NotificationServiceClient notificationServiceClient;

    public CitaCreadaEventListener(NotificationServiceClient notificationServiceClient) {
        this.notificationServiceClient = notificationServiceClient;
    }

    @EventListener
    public void manejarCitaCreada(CitaCreadaEvent event) {
        System.out.println("AGENDA-SERVICE -> EVENTO CITA_CREADA");
        System.out.println("Cita ID: " + event.getCitaId());
        System.out.println("Paciente: " + event.getPaciente());
        System.out.println("Médico/Terapista: " + event.getMedico());
        System.out.println("Fecha: " + event.getFecha());
        System.out.println("Hora: " + event.getHora());

        notificationServiceClient.notificarCitaCreada(event);
    }
}