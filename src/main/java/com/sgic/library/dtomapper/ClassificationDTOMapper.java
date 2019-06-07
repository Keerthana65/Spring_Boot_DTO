package com.sgic.library.dtomapper;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.TypeMap;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.library.dto.ClassificationDTO;
import com.sgic.library.model.Classification;
import com.sgic.library.service.ClassificationSerivce;


@Service
public class ClassificationDTOMapper {

	@Autowired
	private ClassificationSerivce classificationSerivce;
	
	ModelMapper modelMapper = new ModelMapper();
	
	PropertyMap<ClassificationDTO, Classification> classificationMap = new PropertyMap<ClassificationDTO, Classification>() {
		protected void configure() {
			map().setClassificationName(source.getClassificationName());
		}
		
	};
	
	@SuppressWarnings("unused")
	private ClassificationDTOMapper EntityToDTO(Classification classification) {
		ClassificationDTOMapper classificationDTO = modelMapper.map(classification, ClassificationDTOMapper.class);
		return classificationDTO;	
	}
	
	//Save Classification
	public Classification saveClassification(ClassificationDTO classificationDTO) {
		TypeMap<ClassificationDTO,Classification> typeMap = modelMapper.getTypeMap(ClassificationDTO.class, Classification.class);
		if(typeMap == null) {
			modelMapper.addMappings(classificationMap);
		}
		Classification classification = modelMapper.map(classificationDTO, Classification.class);
		return classificationSerivce.saveClassification(classification);
		
	}
	
	//List Classification
	public List<ClassificationDTO> getAllClassification(){
		List<Classification> classification = classificationSerivce.listClassification();
		Type listType = new TypeToken<List<ClassificationDTO>>() {}.getType();
		List<ClassificationDTO> getList = new ModelMapper().map(classification, listType);
		return getList;
		
	}
	
	//Delete Classification
	public ClassificationDTO deleteClassification(Long classificationId) {
		classificationSerivce.deleteClassificationById(classificationId);
		return null;
	}

	//Update Classification
	public void updateClassification(ClassificationDTO classificationDTO) {
		Classification classification = modelMapper.map(classificationDTO, Classification.class);
		EntityToDTO(classificationSerivce.saveClassification(classification));
	}
}
