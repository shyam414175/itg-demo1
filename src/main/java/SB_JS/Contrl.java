package SB_JS;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class Contrl
{
   
	JdbcTemplate jt; 
	
	
     
	    @RequestMapping(value="/form1", method=RequestMethod.GET)
	    public String customerForm(Model model) 
	    {
	        model.addAttribute("customer", new Customer());
	        return "form1";
	    }
	 
	    @RequestMapping(value="/form1", method=RequestMethod.POST)
	    public String customerSubmit(@ModelAttribute Customer customer, Model model) 
	    {
	         
	        model.addAttribute("customer", customer);
	         String.format("Customer Submission: id = %d, firstname = %s, lastname = %s", 
	                                        customer.getId(), customer.getFirstname(), customer.getLastname());
	      
	         long i = customer.getId();
	         String fn = customer.getFirstname();
	         String ln = customer.getLastname();
	         
	         //jt.execute("insert into ms(firstname,lastname,id) values()");
	         return "result";
	    }
	
	
	
}
