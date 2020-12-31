package com.kmh.spring.entity;

import java.io.Serializable;

import com.kmh.spring.entity.types.EmployeeType;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private EmployeeType employeeType;
	private String address;
	private String phone;
	private String email;
	private String password;

	public Employee() {
		super();
	}

	public Employee(final Integer id, final String name, final EmployeeType employeeType, final String address,
			final String phone, final String email, final String password) {
		super();
		this.id = id;
		this.name = name;
		this.employeeType = employeeType;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.password = password;
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

	public EmployeeType getEmployeeType() {
		return this.employeeType;
	}

	public void setEmployeeType(final EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(final String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((this.address == null) ? 0 : this.address.hashCode());
		result = (prime * result) + ((this.email == null) ? 0 : this.email.hashCode());
		result = (prime * result) + ((this.employeeType == null) ? 0 : this.employeeType.hashCode());
		result = (prime * result) + ((this.id == null) ? 0 : this.id.hashCode());
		result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
		result = (prime * result) + ((this.password == null) ? 0 : this.password.hashCode());
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
		final Employee other = (Employee) obj;
		if (this.address == null) {
			if (other.address != null) {
				return false;
			}
		} else if (!this.address.equals(other.address)) {
			return false;
		}
		if (this.email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!this.email.equals(other.email)) {
			return false;
		}
		if (this.employeeType != other.employeeType) {
			return false;
		}
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
		if (this.password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!this.password.equals(other.password)) {
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
		return "Employee [id=" + this.id + ", name=" + this.name + ", employeeType=" + this.employeeType.getType()
				+ ", address=" + this.address + ", phone=" + this.phone + ", email=" + this.email + ", password="
				+ this.password + "]";
	}
}