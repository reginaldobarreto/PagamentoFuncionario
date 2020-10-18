package entities;

public class OutSourceEmployee extends Employee{
	
	private Double additionalCharge;

	public OutSourceEmployee() {
		super();
	}

	public OutSourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return super.getValuePerHour() * super.getHours() + (additionalCharge * 1.1d);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("PAYMENTS: \n");
		sb.append(super.getName() + " - $" + payment());
		return sb.toString();
	}

}
