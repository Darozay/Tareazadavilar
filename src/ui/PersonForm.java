package ui;

import java.util.Date;
import java.util.Scanner;

import dol.Estudiante;
import dol.Person;
import misc.DateUtil;

public class PersonForm {
	Scanner scan;
	Estudiante person;
	
	public PersonForm(Scanner scanner) {
		scan = scanner;
	}
	
	public PersonForm(Person p) {
		person = (Estudiante) p;
	}
	
	
	public Estudiante catchPerson() {
		Date fechaInscripcion = DateUtil.catchValidDate(scan, "Fecha de Inscripcion (dd/MM/yyyy): ");
		System.out.println("No de Carnet");
		String NoCarnet=scan.next();
		
		Estudiante p = new Estudiante(NoCarnet , fechaInscripcion);
		System.out.println("Primer nombre: ");
		p.setFirstName(scan.next());
		
		System.out.println("Segundo nombre: ");
		p.setMiddleName(scan.next());
		
		System.out.println("Primer apellido: ");
		p.setSurName(scan.next());
		
		System.out.println("Segundo apellido: ");
		p.setSecondSurname(scan.next());
		
		System.out.println("Género: ");
		p.setGender(scan.next());
		
		Date date = DateUtil.catchValidDate(scan, "Fecha de nacimiento (dd/MM/yyyy): ");
		p.setBirthDate(date);
		
				
		
		return p;
	}
	
	public void showPerson() {
		System.out.printf("Primer nombre: %s\n" , person.getFirstName());		
		
		System.out.printf("Segundo nombre: %s\n", person.getMiddleName());
		
		System.out.printf("Primer apellido: %s\n", person.getSurName());
		
		System.out.printf("Segundo apellido: %s\n", person.getSecondSurname());
		
		System.out.printf("Género: %s\n", person.getGender());
		
		System.out.printf("Fecha de nacimiento: %s\n", DateUtil.dateToString(person.getBirthDate(), "dd/MM/yyyy"));
		
		System.out.printf("No de Carnet: %s\n", person.getNoCarnet());
		
		System.out.printf("Fecha de Inscripción: %s\n", DateUtil.dateToString(person.getFechaInscripcion(), "dd/MM/yyyy"));

			
	}
	
}
