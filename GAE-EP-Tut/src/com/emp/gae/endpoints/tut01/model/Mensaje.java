package com.emp.gae.endpoints.tut01.model;

import java.util.Date;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;


@Entity
public class Mensaje {
	@Id Long id;
	String nick;
	String msg;
	Date fecha;
	
	private Mensaje() {}
	
	public Mensaje(String nick, String msg) {
		this.nick = nick;
		this.msg = msg;
		this.fecha = new Date();
	}
}
