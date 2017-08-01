package po;

/**
 * Created by yzy on 2017/07/03 下午 2:25.
 * email: mia5121@163.com
 * leader
 */
public class Cadre {

	private String name;

	private String company;

	private String office;

	private String date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Cadre{" +
				"name='" + name + '\'' +
				", company='" + company + '\'' +
				", office='" + office + '\'' +
				", date='" + date + '\'' +
				'}';
	}


}
