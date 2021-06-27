package Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.DojoOverflow.Model.Tags_Questions;

@Repository
public interface tags_questionRepo extends CrudRepository<Tags_Questions, Long> {
	
	List<Tags_Questions> findAll();
	

}
