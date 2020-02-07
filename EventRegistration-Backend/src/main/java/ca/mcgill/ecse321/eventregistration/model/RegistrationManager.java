package ca.mcgill.ecse321.eventregistration.model;
import Event;
import Registration;

import javax.persistence.Entity;
import ca.mcgill.ecse321.eventregistration.model.Person;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;

@Entity
public class RegistrationManager{
   private Set<Person> participants;
   
   @OneToMany(cascade={CascadeType.ALL})
   public Set<Person> getParticipants() {
      return this.participants;
   }
   
   public void setParticipants(Set<Person> participantss) {
      this.participants = participantss;
   }
   
   private Set<Registration> registrations;
   
   @OneToMany(cascade={CascadeType.ALL})
   public Set<Registration> getRegistrations() {
      return this.registrations;
   }
   
   public void setRegistrations(Set<Registration> registrationss) {
      this.registrations = registrationss;
   }
   
   private Set<Event> events;
   
   @OneToMany(cascade={CascadeType.ALL})
   public Set<Event> getEvents() {
      return this.events;
   }
   
   public void setEvents(Set<Event> eventss) {
      this.events = eventss;
   }
   
   private Integer id;

public void setId(Integer value) {
    this.id = value;
}
public Integer getId() {
    return this.id;
}
   private Set<Registration> registration1;
   
   @ManyToMany(mappedBy="registrationManager" )
   public Set<Registration> getRegistration1() {
      return this.registration1;
   }
   
   public void setRegistration1(Set<Registration> registration1s) {
      this.registration1 = registration1s;
   }
   
   }
