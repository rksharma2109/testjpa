package testjpa.testjpa.repo;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import testjpa.testjpa.domain.State;

@Repository
public interface stateRepoistory extends JpaRepository<State, Long>
{
	
	 public List<State> findBystateCode(String statecode);
}

