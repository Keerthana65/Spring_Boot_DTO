package com.sgic.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.library.model.SubClassification;
import com.sgic.library.repository.SubClassificationRepository;

@Service
public class SubClassificationServiceImpl implements SubClassificationService {

	@Autowired
	private SubClassificationRepository subClassificationRepository;
	
	@Override
	public SubClassification saveSubClassification(SubClassification subClassification) {
		return subClassificationRepository.save(subClassification);
	}

	@Override
	public List<SubClassification> listSubClassification() {
		return subClassificationRepository.findAll();
	}

	@Override
	public SubClassification deleteSubClassificationById(Long subClassificationId) {
		subClassificationRepository.deleteById(subClassificationId);
		return null;
	}

	@Override
	public void updateSubClassification(SubClassification subClassification) {
		subClassificationRepository.save(subClassification);
	}

}
