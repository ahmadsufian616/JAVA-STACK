import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.DojoOverflow.Model.Questions;
import com.example.DojoOverflow.Service.ServicesQA;

@Controller
public class Controllers {
	private final ServicesQA S; 
	
	
	public Controllers(ServicesQA s) {
		
		S = s;
	}

	

	@RequestMapping("/")
	public String index(Model m) {
		List<Questions> q= S.findAllQuestions();
		m.addAttribute("All_Questions",q);
		
		
		
		
		return "questions.jsp";
		
		
	}
	
	
	
	
	

}
