package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import dao.PlayerDAO;
import dao.SkillDAO;
import model.Player;
import model.Skill;

public class Main{
	
	public static void main(String []args) throws Exception {
		
	Player player=new Player();
	PlayerDAO playerdao=new PlayerDAO();
	Skill skill=new Skill();
	SkillDAO skilldao=new SkillDAO();
	
	
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter skill id");
	
	Long id=Long.parseLong(br.readLine());
	skilldao.getSkillBylD(id);
	
	System.out.println(skill.getSkillName());
	
	List<Player> list=(ArrayList<Player>) playerdao.getAllPlayers();
	
	System.out.println("player Id"+"\t"+"playername"+"\t"+"\t"+"playercountry"+"\t"+"\t"+"skillname");
	System.out.println();
	
	for(Player p:list)
	{
		System.out.println(p.getPlayerid()+"\t"+"\t"+p.getName()+"\t"+"\t"+p.getCountry()+"\t"+"\t"+p.getSkill().getSkillName());
	}
	
		
	}
}