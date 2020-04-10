package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	
	public Skill getSkillBylD(Long id) throws Exception {
		
		Connection cn=ConnectionManager.getconnection();
		Statement st=cn.createStatement();
		ResultSet rs=st.executeQuery("select * from skill3");
		Skill skill=new Skill();
		
		while(rs.next())
		{
			long checkid=rs.getLong(1);
			if(checkid==id)
			{
				String name=rs.getString(2);
				skill.setSkillid(checkid);
				skill.setSkillName(name);
				
				
				
			}
		rs.close();
		st.close();
		cn.close();
		
		
		
		
	}
		
		return skill;
		
}
}
