package com.DisplayDate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDate {

	@RequestMapping("/")
	public String index() {
		return "index2.jsp";

	}
	@RequestMapping("/date")
	public String index2(Model m) {
		Date D =new Date();
		SimpleDateFormat formattedAsDate = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, YYYY");
		m.addAttribute("Date",formattedAsDate.format(D));
		
		return "date.jsp";

}
	
	@RequestMapping("/time")
	public String index3(Model m) {
		Date d = new Date();
		SimpleDateFormat formattedAsTime = new SimpleDateFormat("h:mm a");
		m.addAttribute("theTime", formattedAsTime.format(d));
		return "time.jsp";

}
	
}	