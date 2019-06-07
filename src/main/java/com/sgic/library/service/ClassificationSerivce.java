package com.sgic.library.service;

import java.util.List;

import com.sgic.library.model.Classification;

public interface ClassificationSerivce {

	Classification saveClassification(Classification classification);
	List<Classification> listClassification();
	Classification deleteClassificationById(Long classificationId);
	void updateClassification(Classification classification);
}
