package com.sgic.library.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="subclassification")
public class SubClassification implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="subclassification_id")
	private long subClassificationId;
	
	@Column(name="subclassification_name")
	private String subClassificationName;

	@ManyToOne
	@JoinColumn(name="classification_id", nullable=false)
	private Classification classificationId;
	

	public Classification getClassificationId() {
		return classificationId;
	}

	public void setClassificationId(Classification classificationId) {
		this.classificationId = classificationId;
	}

	public long getSubClassificationId() {
		return subClassificationId;
	}

	public void setSubClassificationId(long subClassificationId) {
		this.subClassificationId = subClassificationId;
	}

	public String getSubClassificationName() {
		return subClassificationName;
	}

	public void setSubClassificationName(String subClassificationName) {
		this.subClassificationName = subClassificationName;
	}
	
	
	

}
