package com.sgic.library.service;

import java.util.List;

import com.sgic.library.model.SubClassification;

public interface SubClassificationService {
	SubClassification saveSubClassification(SubClassification subClassification);
	List<SubClassification> listSubClassification();
	SubClassification deleteSubClassificationById(Long subClassificationId);
	void updateSubClassification(SubClassification subClassification);
}
