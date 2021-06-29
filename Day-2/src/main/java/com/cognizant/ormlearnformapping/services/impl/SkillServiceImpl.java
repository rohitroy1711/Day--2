package com.cognizant.ormlearnformapping.services.impl;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearnformapping.model.Skill;
import com.cognizant.ormlearnformapping.repository.SkillRepository;
import com.cognizant.ormlearnformapping.services.SkillService;

@Service
public class SkillServiceImpl implements SkillService {

	@Autowired
	private SkillRepository skillRepository;

	private static final Logger LOGGER = LoggerFactory.getLogger(SkillServiceImpl.class);

	// handson 4
	@Transactional
	public Skill getById(int id) {

		LOGGER.info("GET by ID method in SkillService Start");

		return skillRepository.findById(id).get();
	}

	// handson 4
	@Transactional
	public void save(Skill skill) {

		LOGGER.info("save method in SkillService Start");

		skillRepository.save(skill);

		LOGGER.info("save method in SkillService End");

	}

}
