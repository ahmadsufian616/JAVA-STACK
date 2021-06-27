package com.example.DojoOverflow.Service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.example.DojoOverflow.Model.Answer;
import com.example.DojoOverflow.Model.Questions;
import com.example.DojoOverflow.Model.Tag;
import com.example.DojoOverflow.Model.Tags_Questions;

import Repository.AnswerRepo;
import Repository.QuestionRepo;
import Repository.tagRepo;
import Repository.tags_questionRepo;

@Service
public class ServicesQA {
	
	private final QuestionRepo QR;
	private final tagRepo TR;
	private final AnswerRepo AR;
	private final tags_questionRepo TQR;
	public ServicesQA(QuestionRepo qR, tagRepo tR, AnswerRepo aR, tags_questionRepo tQR) {
		
		QR = qR;
		TR = tR;
		AR = aR;
		TQR = tQR;
	}
	
	public List<Questions> findAllQuestions(){
		return QR.findAll();
		
		
	}
	
	public List<Tag>findALLtag_Q(Questions Q) {
		return  TR.findBytagsContains(Q) ;
		
		
	}
	public List<Tag> findAllTag(){
		return TR.findAll();
		
		
	}
	public List<Answer> findAllAnswer(){
		return AR.findAll();
		
		
	}
	public List<Tags_Questions> findAllTagsQuestions(){
		return TQR.findAll();
		
		
	}
	
	
	

}
