package com.kmh.spring.entity;

import java.io.Serializable;

public class Department implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private String phone;
	private Integer numOfEmployee;

	public Department() {
		super();
	}

	public Department(final Integer id, final String name, final String phone, final Integer numOfEmployee) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.numOfEmployee = numOfEmployee;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(final String phone) {
		this.phone = phone;
	}

	public Integer getNumOfEmployee() {
		return this.numOfEmployee;
	}

	public void setNumOfEmployee(final Integer numOfEmployee) {
		this.numOfEmployee = numOfEmployee;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((this.id == null) ? 0 : this.id.hashCode());
		result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
		result = (prime * result) + ((this.numOfEmployee == null) ? 0 : this.numOfEmployee.hashCode());
		result = (prime * result) + ((this.phone == null) ? 0 : this.phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final Department other = (Department) obj;
		if (this.id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!this.id.equals(other.id)) {
			return false;
		}
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		if (this.numOfEmployee == null) {
			if (other.numOfEmployee != null) {
				return false;
			}
		} else if (!this.numOfEmployee.equals(other.numOfEmployee)) {
			return false;
		}
		if (this.phone == null) {
			if (other.phone != null) {
				return false;
			}
		} else if (!this.phone.equals(other.phone)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Department [id=" + this.id + ", name=" + this.name + ", phone=" + this.phone + ", numOfEmployee="
				+ this.numOfEmployee + "]";
	}
}