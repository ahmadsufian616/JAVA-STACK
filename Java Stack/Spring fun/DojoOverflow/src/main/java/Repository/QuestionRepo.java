package Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.DojoOverflow.Model.Questions;

@Repository
public interface QuestionRepo extends CrudRepository<Questions, Long> {
	
	List<Questions> findAll();
	
	

}
