package ca.mcgill.ecse321.eventregistration.model;
import Event;

import javax.persistence.Entity;
import javax.persistence.Id;
import ca.mcgill.ecse321.eventregistration.model.Person;
import javax.persistence.ManyToOne;
import java.util.Set;
import javax.persistence.ManyToMany;

@Entity
public class Registration{
   private Integer id;

public void setId(Integer value) {
    this.id = value;
}
@Id
public Integer getId() {
    return this.id;
}
   private Person participant;
   
   @ManyToOne(optional=false)
   public Person getParticipant() {
      return this.participant;
   }
   
   public void setParticipant(Person participant) {
      this.participant = participant;
   }
   
   private Event event;
   
   @ManyToOne(optional=false)
   public Event getEvent() {
      return this.event;
   }
   
   public void setEvent(Event event) {
      this.event = event;
   }
   
   private Set<RegistrationManager> registrationManager;
   
   @ManyToMany
   public Set<RegistrationManager> getRegistrationManager() {
      return this.registrationManager;
   }
   
   public void setRegistrationManager(Set<RegistrationManager> registrationManagers) {
      this.registrationManager = registrationManagers;
   }
   
   }
