package com.dani.chucknorris.entidades;

import java.io.Serializable;
import java.util.Objects;

public class Frase implements Serializable {
	
	private String created_at;
	private String id;
	private String updated_at;
	private String value;

	
	public Frase() {
		
	}


	public Frase(String created_at, String id, String updated_at, String value) {
		super();
		this.created_at = created_at;
		this.id = id;
		this.updated_at = updated_at;
		this.value = value;
	}


	public String getCreated_at() {
		return created_at;
	}


	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getUpdated_at() {
		return updated_at;
	}


	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return "Frase [created_at=" + created_at + ", id=" + id + ", updated_at=" + updated_at + ", value=" + value
				+ "]";
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
		Frase other = (Frase) obj;
		return Objects.equals(id, other.id);
	}
	
	
}

