package com.kmh.spring.entity;

import java.io.Serializable;

import com.kmh.spring.entity.types.CompanySize;
import com.kmh.spring.entity.types.CompanyType;

public class Company implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private String address;
	private String phone;
	private CompanyType type;
	private CompanySize size;

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

	public static CompanyBuilder builder() {
		return new CompanyBuilder();
	}

	public static class CompanyBuilder {

		private Integer id;
		private String name;
		private String address;
		private String phone;
		private CompanyType type;
		private CompanySize size;

		public CompanyBuilder id(final Integer id) {
			this.id = id;
			return this;
		}

		public CompanyBuilder name(final String name) {
			this.name = name;
			return this;
		}

		public CompanyBuilder address(final String address) {
			this.address = address;
			return this;
		}

		public CompanyBuilder phone(final String phone) {
			this.phone = phone;
			return this;
		}

		public CompanyBuilder type(final CompanyType companyType) {
			this.type = companyType;
			return this;
		}

		public CompanyBuilder size(final CompanySize companySize) {
			this.size = companySize;
			return this;
		}

		public Company build() {
			final Company company = new Company();
			company.id = this.id;
			company.name = this.name;
			company.address = this.address;
			company.phone = this.phone;
			company.type = this.type;
			company.size = this.size;

			return company;
		}
	}

	@Override
	public String toString() {
		return "Company [id=" + this.id + ", name=" + this.name + ", address=" + this.address + ", phone=" + this.phone
				+ ", type=" + this.type + ", size=" + this.size + "]";
	}

}