package com.emp.gae.endpoints.tut01.model;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;


@PersistenceCapable ( identityType =  IdentityType.APPLICATION )
public class Mensaje {
    @PrimaryKey
    @Persistent ( valueStrategy =  IdGeneratorStrategy.IDENTITY )	
	Long id;
	String nick;
	String msg;
	Date fecha;
	
	private Mensaje() {}
	
	public Mensaje(String nick, String msg) {
		this.nick = nick;
		this.msg = msg;
		this.fecha = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
