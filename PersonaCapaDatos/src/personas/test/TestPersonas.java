/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.test;
import java.sql.SQLException;
import java.util.List;
import personas.dto.PersonaDTO;
import personas.jdbc.PersonaDao;
import personas.jdbc.PersonaDaoJDBC;
/**
 *
 * @author Mike
 */
public class TestPersonas {
    public static void main(String[] args){
        //Utilizamos el tipo interface como referencia a una clase concreta
        PersonaDao personaDao = new PersonaDaoJDBC();
        
        //creamos un nuevo registro
        //Hacemos uso de la clase persona DTO la cual se usa
        //para transferir la informacion entre las capas
        //no es necesario especificar la llave primaria
        //ya que en este caso es de tipo autonumerico y la BD se encarga
        PersonaDTO persona = new PersonaDTO();
        persona.setNombre("Mario");
        persona.setApellido("Lopez");
        //Utilizamos la capa DAO para persistir el objeto DTO
        try{
            personaDao.insert(persona);
            //eliminadmos un registro, el id 3
            //personaDao.delete(new PersonaDTO(3));
            //actualizamos un registro
            PersonaDTO personaTmp = new PersonaDTO();
            //personaTmp.setId_persona(2); //actualizamos el registro 2
            //personaTmp.setNombre("Mario");
            //personaTmp.setApellido("Lopez");
            //personaDao.update(personaTmp);
            
            //Seleccionamos todos los registros
            List<PersonaDTO> personas = personaDao.select();
            for(PersonaDTO personaDTO : personas){
                System.out.println(personaDTO);
                System.out.println();
            }
        }catch(SQLException e){
            System.out.println("Exception en la capa de prueba");
            e.printStackTrace();
        }
    }
}
