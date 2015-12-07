/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closermeapp.Presentation.Controllers;

import closermeapp.Bussiness.Entities.Event;
import closermeapp.Bussiness.EventManager.EventManager;
import closermeapp.Presentation.Views.EventManagement.EventRegistrationView;
import javax.swing.WindowConstants;

/**
 *
 * @author JoseJulio
 */
public class EventRegistrationController extends AbstractController {
     private EventRegistrationView eventRegistrationView;
     private EventViewerController eventViewerController;

     public EventRegistrationController(EventViewerController eventViewerController) {
            initializeView();
            this.eventViewerController = eventViewerController;
     }
     
     public void registerEvent(Event newEvent){
         EventManager.getEventManager().addEvent(newEvent);
     }
     
     private void initializeView(){
         configureWindow();
         setEvents();
     }

    private void configureWindow() {
        this.eventRegistrationView = new EventRegistrationView();
        this.eventRegistrationView.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.eventRegistrationView.setResizable(false);
        this.eventRegistrationView.setLocationRelativeTo(null);
    }


    protected void setEvents(){
        eventRegistrationView.getCancelButton().addActionListener(actionEvent -> closeWindow());
        eventRegistrationView.getConfirmButton().addActionListener(acionEvent -> processEventCreation());
    }

    private void closeWindow(){
        eventRegistrationView.setVisible(false);
    }

    private void processEventCreation(){
        String eventName = eventRegistrationView.getEventNameTextBox().getText();
        String eventStartDate = eventRegistrationView.getEventStartDateTextBox().getText();
        String eventStartTime = eventRegistrationView.getEventStartTimeTextBox().getText();
        String eventEndDate = eventRegistrationView.getEventEndDateTextBox().getText();
        String eventEndTime = eventRegistrationView.getEventEndTimeTextBox().getText();
        String clientName = eventRegistrationView.getClientNameTextBox().getText();
        String clientPhone = eventRegistrationView.getClientPhoneTextBox().getText();

        Event newEvent = EventManager.getEventManager().createEvent(eventName, eventStartDate, eventStartTime, eventEndDate, eventEndTime, clientName, clientPhone);

        registerEvent(newEvent);
    }

    @Override
    protected void openWindow() {
        this.eventRegistrationView.setVisible(true);
    }



}
