package dao;

import java.util.List;

import entity.Company;

public class CompanyDaoImpl implements CompanyDao {

	public void save(Company com) {
		DBUtils.getInstance().add(com);
		System.out.println("Successful Save....... in DAO");
	}

	public void update(Company com) {
		DBUtils.getInstance().edit(com);
		System.out.println("Successful Update....... in DAO");
	}

	public void delete(Company com) {
		// TODO Auto-generated method stub

	}

	public Company finbyById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Company> findAll() {
		if (0 == DBUtils.getInstance().findAllCompanies().size()) {
			System.out.println("Company Data is empty ....... in DAO");
		} else {
			System.out.println("Company Data is not empty ....... in DAO");
		}
		return DBUtils.getInstance().findAllCompanies();
	}

}
