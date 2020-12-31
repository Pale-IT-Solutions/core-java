package com.kmh.spring.entity.types;

public enum EmployeeType {

	//@formatter:off
	OFFICE_STAFF(0, "Office Staff"),
	PROGRAMMER(1, "Programmer"),
	SOFTWARE_ENGINEER(2, "Software Engineer"),
	NETWORK_ENIGNEER(3, "Netword Engineer"),
	PROJECT_MANAGER(4, "Project Manager"),
	DEPARTMENT_NANAGER(5, "Department Manager"),
	CEO(6, "CEO"),
	DIRECTOR(7, "Director"),
	PRESIDENT(8, "President");
	//@formatter:on

	private int id;
	private String type;

	private EmployeeType() {
	}

	private EmployeeType(final int id, final String type) {
		this.id = id;
		this.type = type;
	}

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(final String type) {
		this.type = type;
	}
}