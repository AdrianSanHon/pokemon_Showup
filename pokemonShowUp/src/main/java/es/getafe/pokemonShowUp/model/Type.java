package es.getafe.pokemonShowUp.model;

import java.util.Objects;

public class Type {
	
	private String type;
	private int damage_type_id;
	private int type_id;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDamage_type_id() {
		return damage_type_id;
	}
	public void setDamage_type_id(int damage_type_id) {
		this.damage_type_id = damage_type_id;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	@Override
	public String toString() {
		return "Type [type=" + type + ", damage_type_id=" + damage_type_id + ", type_id=" + type_id + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(type_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Type other = (Type) obj;
		return type_id == other.type_id;
	}

	


}
