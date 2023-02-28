package com.fran.json.entidades;

import java.util.Objects;

public class Jokes {
	
	private String id;
	private String value;
	
	public Jokes() {
		
	}

	public Jokes(String id, String value) {
		super();
		this.id = id;
		this.value = value;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "La frase de chuck es: " + value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jokes other = (Jokes) obj;
		return Objects.equals(id, other.id);
	}

	
}
