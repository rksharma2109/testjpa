package testjpa.testjpa.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import testjpa.testjpa.domain.RootEntity;
@Repository
public interface  QueryNativeRepository extends JpaRepository<RootEntity, Integer>
 {

//  @Autowired
//  private EntityManager entityManager;
//
//  @Override
//  public List<Object> runNativeQuery() {
//      return entityManager.createNativeQuery("select * from documenttype  where document_code=?")
//    		  .setParameter("1", "DL").getResultList();
//  }
	
	 @Query("select documentcode,documenttype from documenttype where document_code = ?1")
	  List<Object> FinddocumentType(String documentcode);
}
