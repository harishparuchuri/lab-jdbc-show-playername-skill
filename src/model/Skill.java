package model;
public class Skill{
	
	private Long Skillid;
	private String SkillName;
	public Long getSkillid() {
		return Skillid;
	}
	public void setSkillid(Long skillid) {
		Skillid = skillid;
	}
	public String getSkillName() {
		return SkillName;
	}
	public void setSkillName(String skillName) {
		SkillName = skillName;
	}
	public Skill(Long skillid, String skillName) {
		super();
		Skillid = skillid;
		SkillName = skillName;
	}
	public Skill() {
		// TODO Auto-generated constructor stub
	}
}