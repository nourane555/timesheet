package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.repository.DepartementRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Service
public class DepartementServiceImpl implements IDepartementService {


	@Autowired
	DepartementRepository deptRepoistory;

	private static final Logger log = LogManager.getLogger(DepartementServiceImpl.class);

	public List<Departement> getAllDepartements() {
		
		List<Departement> dep = (List<Departement>) deptRepoistory.findAll();
		log.info(dep);
		return (List<Departement>) deptRepoistory.findAll();
	}

}
