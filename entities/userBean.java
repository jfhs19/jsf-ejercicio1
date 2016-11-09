package entities;

import java.util.List;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class userBean {
	private String ID = null;
	private String name = null;
	private HealthPlan healthPlan = null;
	private String healthPlanName = null;
	private List<String> availablePlan =HealthPlanUtils.getAvailablePlans();
	public String getID() {
		return ID;
	}

	public String getHealthPlanName() {
		return healthPlanName;
	}
	public void setAvailablePlan(List<String> availablePlan) {
		this.availablePlan = HealthPlanUtils.getAvailablePlans();
	}
	 public List<String> getAvailablePlan() {
		    return availablePlan;
	 }
	public void setHealthPlanName(String healthPlanName) {
		this.healthPlanName = healthPlanName;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HealthPlan getHealthPlan() {
		return healthPlan;
	}

	public void setHealthPlan(HealthPlan healthPlan) {
		this.healthPlan = healthPlan;
	}

	public String actionCheck() {
		String returnValue = "page";

		if (ID.isEmpty() || name.isEmpty()) {
			returnValue = returnValue + "KO";
		} else {
			healthPlan  = HealthPlanUtils.findPlan(healthPlanName);
			if(!healthPlan.getNombre().isEmpty()){
				returnValue = returnValue + "OK";
			}
			returnValue = returnValue + "KO";
		}

		return returnValue;
	}

}
