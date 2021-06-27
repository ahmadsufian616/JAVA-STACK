package Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.DojoOverflow.Model.Questions;
import com.example.DojoOverflow.Model.Tag;

@Repository
public interface tagRepo extends CrudRepository<Tag, Long>{
	
	List<Tag> findAll();
	List<Tag> findBytagsContains(Questions Q);

}
