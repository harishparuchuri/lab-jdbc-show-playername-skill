package model;
public class Player{
	private Long playerid;
	private String name;
	private String country;
	private Skill skill;
	
	
	public Player(Long playerid, String name, String country, Skill skill) {
		super();
		this.playerid = playerid;
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Long getPlayerid() {
		return playerid;
	}
	public void setPlayerid(Long playerid) {
		this.playerid = playerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
}
