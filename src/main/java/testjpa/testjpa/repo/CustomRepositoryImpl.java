package testjpa.testjpa.repo;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class CustomRepositoryImpl implements  CustomRepoistory {

	@Autowired
    private EntityManager entityManager;
	
@Override
public List<Object> getDocumentType(String documentcode) {
	return entityManager.createNativeQuery("select document_type from documenttype where document_code =(?1)")
			.setParameter(1, "DLDOC").getResultList();
}
}
