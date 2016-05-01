package notes;

import java.util.*;
import java.sql.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class NotesController {


    @RequestMapping(value="/sendNotes") 
    public String receivePayload() throws Exception {

            	
    	Class.forName("com.mysql.jdbc.Driver");
    	Connection c;
    	c=DriverManager.getConnection("jdbc:mysql://localhost:3306/msgdb", "example", "pallav");
    	Statement s;
    	s=c.createStatement();
    	s.executeUpdate("insert into state values(7,'Chal gya re')");
    	s.close();
    	c.close();
    	System.out.println("Record Inserted");
        return "updated Database";
/*        String decodedPayload = java.net.URLDecoder.decode(payload, "UTF-8");
	System.out.println(decodedPayload);
	String [] notes = decodedPayload.split("\\|");
	System.out.println(Arrays.toString(notes));
	int i=0;
	String hashedNote;
	
	while (i< notes.length)
	{
		hashedNote = notes[i];
		String [] noteDetails = hashedNote.split("\\#");
		System.out.println(Arrays.toString(noteDetails));
		i++;
		
	}
	*/
       }

	
	@RequestMapping("/receiveNotes")
    public String sendPayload() {
        //return new Note();
        return "Directly sending note as string";
	
	}



}

