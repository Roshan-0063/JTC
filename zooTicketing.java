package proj;

public class zooTicketing {
	String guestName;
	int guestAge;
	int total;
public zooTicketing() {
		// TODO Auto-generated constructor stub
	}
	//	public zooTicketing(String guestName, int guestAge, int total) {
//		super();
//		this.guestName = guestName;
//		this.guestAge = guestAge;
//		this.total = total;
//	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public int getGuestAge() {
		return guestAge;
	}
	public void setGuestAge(int guestAge) {
		this.guestAge = guestAge;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int calculateBill()
	{
		
		
	  if(this.guestAge>2 && this.guestAge<18)	
	  {	  
		this.total = (this.total+100);
		
	  }
	  else if(this.guestAge>=18 && this.guestAge<60) {
		  this.total = (this.total+500);
	  }
	  else if(this.guestAge>=60) {
		  this.total = (this.total+300);
	  }
	  else if(this.guestAge<2) {
		  this.total = (this.total+0);
	  }
	  return this.total;
	  }
	  
	
	
	
	
	
	

}
