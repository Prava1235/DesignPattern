import java.util.*;
public class SingleResponsibility {
	
	
		  private String employeeId;
		  private String name;
		  private String address; 
		  private Date dateOfJoining;
		  public String getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(String employeeId) {
			this.employeeId = employeeId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Date getDateOfJoining() {
			return dateOfJoining;
		}
		public void setDateOfJoining(Date dateOfJoining) {
			this.dateOfJoining = dateOfJoining;
		}
		public boolean isPromotionDueThisYear(){
		    //return truepromotion logic implementation
			return true;
		  }
		  public Double calcIncomeTaxForCurrentYear(){
		    //income tax logic implementation
			  return 1.0;
		  }


	}

