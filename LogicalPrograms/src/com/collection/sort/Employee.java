package com.collection.sort;

public class Employee implements Comparable{

	
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return 5;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}*/
	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}
	@Override
	public int compareTo(Object o) {
		return 1;
	}
	
	
	
	
	
	
}
