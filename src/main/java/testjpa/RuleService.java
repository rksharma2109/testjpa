package testjpa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import testjpa.dto.DocumentDto;
import testjpa.testjpa.domain.State;
import testjpa.testjpa.repo.CustomRepositoryImpl;
import testjpa.testjpa.repo.QueryNativeRepository;
import testjpa.testjpa.repo.stateRepoistory;

	

	@Component
	@ComponentScan
	public class RuleService {
		@Autowired stateRepoistory staterep;
		@Autowired CustomRepositoryImpl customrepo;
		//@PersistenceUnit
	
		

		public List<DocumentDto> getProofList()
				throws SQLException {
			//RuleDto ruledto = new RuleDto();
			//PreparedStatement stmt = null;
			//PreparedStatement stmt1 = null;
			//sPreparedStatement stmt2 = null;
			String  stateCode ="HR";
			String documentTypeCode="DL";
			List<DocumentDto> listProof = new ArrayList<>();
			
			try {
				
				List<State> statecodelist =staterep.findBystateCode(stateCode);
				boolean statepresent = false;
				statecodelist.forEach((state)->{
					System.out.println(state.getStatecode());
				});
				for(Object state:statecodelist )
				{
					statepresent = true;
			
	
					
					
				}
				if(statepresent) {
					System.out.println("state present is"+statepresent);
					List<Object> doctypelist = customrepo.getDocumentType("DLDOC");
					System.out.println("dldocdize is"+doctypelist.size());
					for(Object doc:doctypelist )
					{
						System.out.println("docname is"+(String)doc);
						
					}
					

						//stmt1 = conn.prepareStatement(
							//	"select a.id,a.document_code,a.name from document a,state_type_document_ass b  where a.id=b.document_id and b.state_id=? and b.doc_id=?");
						
						//List<Object[]> documents = emf.createNativeQuery(
							//    "select a.id,a.document_code,a.name from document a,state_type_document_ass b  where a.id=b.document_id and b.state_id=? and b.doc_id=?" )
								//.setParameter("1", rs2.getString(1))
								//.setParameter("2", rs2.getString(2))							
							//.getResultList();
						//stmt1.setString(1, rs.getString(1));
						//stmt1.setString(2, rs2.getString(1));
						//ResultSet rs1 = stmt1.executeQuery();
						//for(Object[] Document : documents) {
						  //  System.out.println("document id is"+Document[0]);
						    //DocumentDto d = new DocumentDto();
							//d.setId((String)Document[0]);
							//d.setCode((String)Document[1]);
							//d.setName((String)Document[2]);
							//listProof.add(d);
						//}
//						while (rs1.next()) {
//							DocumentDto d = new DocumentDto();
//							d.setId(rs1.getString(1));
//							d.setCode(rs1.getString(2));
//							d.setName(rs1.getString(3));
//							listProof.add(d);
//						}
					//}
				}
			} finally {
			}
			return listProof;
		}
		
		public int getNumOfYearsToToday(String date, Date d) {
			int year = 0;
			if (date != null) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				sdf.setLenient(false);
				try {
					Date date1 = sdf.parse(date);
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(date1);
					Calendar calendar2 = Calendar.getInstance();
//					Date d = getServerDate();
					calendar2.setTime(d);
					if (calendar.before(calendar2)) {
						year = calendar2.get(Calendar.YEAR)
								- calendar.get(Calendar.YEAR);
						int month = calendar2.get(Calendar.MONTH)
								- calendar.get(Calendar.MONTH);
						int days = calendar2.get(Calendar.DATE)
								- calendar.get(Calendar.DATE);
						year = ((month < 0) || (month == 0 && days < 0)) ? year - 1
								: year;
					}
				} catch (Exception e) {
//					String errorMessage = Sarathi4Exception.sarathi4Exce(e,"In CommonsMethods.java");
//					LOGGER.error("Exception in getNumOfYearsToToday Method==>>"+ errorMessage + "\n\n  " + e.getMessage());
				}
			}
			return year;
		}

	}


