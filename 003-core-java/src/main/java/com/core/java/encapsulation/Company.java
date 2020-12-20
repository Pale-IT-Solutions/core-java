package com.core.java.encapsulation;

import java.io.Serializable;

import com.core.java.common.CompanySize;
import com.core.java.common.CompanyType;

public class Company implements Serializable {

	private static final long serialVersionUID = 1L;

	public Integer id;
	private String name;
	private String address;
	private String phone;
	private CompanyType type;
	private CompanySize size;

	public Company() {
		super();
	}

	public Company(final Integer id, final String name, final String address, final String phone,
			final CompanyType type, final CompanySize size) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.type = type;
		this.size = size;
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

	public CompanyType getType() {
		return this.type;
	}

	public void setType(final CompanyType type) {
		this.type = type;
	}

	public CompanySize getSize() {
		return this.size;
	}

	public void setSize(final CompanySize size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((this.address == null) ? 0 : this.address.hashCode());
		result = (prime * result) + ((this.id == null) ? 0 : this.id.hashCode());
		result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
		result = (prime * result) + ((this.phone == null) ? 0 : this.phone.hashCode());
		result = (prime * result) + ((this.size == null) ? 0 : this.size.hashCode());
		result = (prime * result) + ((this.type == null) ? 0 : this.type.hashCode());
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
		final Company other = (Company) obj;
		if (this.address == null) {
			if (other.address != null) {
				return false;
			}
		} else if (!this.address.equals(other.address)) {
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
		if (this.phone == null) {
			if (other.phone != null) {
				return false;
			}
		} else if (!this.phone.equals(other.phone)) {
			return false;
		}
		if (this.size != other.size) {
			return false;
		}
		if (this.type != other.type) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Comapny [id=" + this.id + ", name=" + this.name + ", address=" + this.address + ", phone=" + this.phone
				+ ", type=" + this.type + ", size=" + this.size.getSize() + "]";
	}

}