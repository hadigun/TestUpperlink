/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apiconsumptionusingjaxb;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import ng.upperlink.model.Person;

/**
 *
 * @author Adigun Hammed
 */
public class ApiConsumptionUsingJaxb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person();
        
        person.setName("Adigun Hammed");
        person.setEmail("adigun.hmd@gmail.com");
        person.setPhonenumber("08099444264");
        person.setGender("Male");
       
        
       try {

		File file = new File("C:\\file.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.marshal(person, file);
		jaxbMarshaller.marshal(person, System.out);

	      } catch (JAXBException e) {
		e.printStackTrace();
	      }

    }
    
}
