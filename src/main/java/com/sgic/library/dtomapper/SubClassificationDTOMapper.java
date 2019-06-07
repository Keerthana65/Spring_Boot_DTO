package com.sgic.library.dtomapper;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.library.dto.SubClassificationDTO;
import com.sgic.library.model.SubClassification;
import com.sgic.library.service.SubClassificationService;

@Service
public class SubClassificationDTOMapper {
	
	@Autowired
	private SubClassificationService subClassificationService;

	ModelMapper modelMapper = new ModelMapper();

	
	@SuppressWarnings("unused")
	private SubClassificationDTOMapper EntityToDTO(SubClassification subClassification) {
		SubClassificationDTOMapper subClassificationDTO = modelMapper.map(subClassification, SubClassificationDTOMapper.class);
		return subClassificationDTO;
	}
	
   //Save SubClassification
	public SubClassification saveSubClassification(SubClassificationDTO subClassificationDTO) {
		SubClassification subClassification = modelMapper.map(subClassificationDTO, SubClassification.class);
		return subClassificationService.saveSubClassification(subClassification);	
	}
	
	//List SubClassification
	public List<SubClassificationDTO> getAllSubClassification(){
		List<SubClassification> subClassification = subClassificationService.listSubClassification();
		Type listType = new TypeToken<List<SubClassificationDTO>>() {}.getType();
		List<SubClassificationDTO> getsubList = new ModelMapper().map(subClassification, listType);
		return getsubList;
	}
	
	//Delete SubClassification
	public SubClassificationDTO deleteSubClassificatin(Long subClassificationId) {
		subClassificationService.deleteSubClassificationById(subClassificationId);
		return null;	
	}
	
	//Update SubClassification
	public void updateSubClassification(SubClassificationDTO subClassificationDTO) {
		SubClassification subClassification = modelMapper.map(subClassificationDTO, SubClassification.class);
		EntityToDTO(subClassificationService.saveSubClassification(subClassification));
	}
}
