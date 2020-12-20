package com.core.java.builder;

public class Company {

	private Integer id;
	private String name;
	private String address;
	private String phone;
	private CompanyType type;
	private CompanySize size;

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
				+ ", type=" + this.type + ", size=" + this.size.getSize() + "]";
	}

}