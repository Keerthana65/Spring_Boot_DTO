package com.sgic.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.library.model.Classification;
import com.sgic.library.repository.ClassificationRepository;

@Service
public class ClassificationServiceImpl implements ClassificationSerivce {
 
	@Autowired
	private ClassificationRepository classificationRepository;

	@Override
	public Classification saveClassification(Classification classification) {
		return classificationRepository.save(classification);
	}

	@Override
	public List<Classification> listClassification() {
		return classificationRepository.findAll();
	}

	@Override
	public Classification deleteClassificationById(Long classificationId) {
		 classificationRepository.deleteById(classificationId);
		return null;
	}

	@Override
	public void updateClassification(Classification classification) {
		classificationRepository.save(classification);
	}
	

}
