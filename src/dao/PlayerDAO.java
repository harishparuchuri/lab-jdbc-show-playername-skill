package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import model.Skill;
import utility.ConnectionManager;
public class PlayerDAO{
	
public List<Player>getAllPlayers() throws SQLException, Exception {
	List<Player> list=new ArrayList<Player>();
	Skill skill = null;
	Player player = null;
		String select_st ="SELECT * FROM players3";
		PreparedStatement ps = ConnectionManager.getconnection().prepareStatement(select_st);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
	String name=rs.getString("name");
	String country= rs.getString("country");
	long playerid= rs.getLong("id");
	long skillid= rs.getLong("skill_id");
	player= new Player();
	player.setCountry(country);
	player.setName(name);
	player.setPlayerid(playerid);
	skill= new Skill();
	skill.setSkillid(skillid);
	player.setSkill(skill);
	list.add(player);
		
		}
		return list;
	
	
	
	
	
	
}
}