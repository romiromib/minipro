package miniPro;

public class phone {

	private String name;
	private String hp;
	private String company;
	
	
	public phone() {
		super();
	}

	public phone(String name, String hp, String company) {
		super();
		this.name = name;
		this.hp = hp;
		this.company = company;
	}

	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHp() {
		return hp;
	}


	public void setHp(String hp) {
		this.hp = hp;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "phone [name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}
	
	public void showInfo() {
		System.out.println("\t"+name +"\t"+ hp + "\t" + company);
	}
	
	public String enroll() {
		return name+","+hp+","+company ;
	}

	
	
}
