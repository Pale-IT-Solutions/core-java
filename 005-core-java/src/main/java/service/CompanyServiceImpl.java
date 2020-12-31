package service;

import java.util.List;

import dao.CompanyDao;
import dao.CompanyDaoImpl;
import entity.Company;

public class CompanyServiceImpl implements CompanyService {

	CompanyDao dao = new CompanyDaoImpl();

	public void save(Company com) {
		// TODO
		// business logic
		dao.save(com);
	}

	public void update(Company com) {
		dao.update(com);
	}

	public void delete(Company com) {
		// TODO Auto-generated method stub

	}

	public Company finbyById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Company> findAll() {
		return dao.findAll();
	}

}
