package com.sgic.library.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.library.dto.ClassificationDTO;
import com.sgic.library.dtomapper.ClassificationDTOMapper;

@RestController
public class ClassificationController {
	
	@Autowired
	private ClassificationDTOMapper classificationDTOMapper;
	
	@PostMapping("/saveclassification")
	public HttpStatus saveClassification(@Valid @RequestBody ClassificationDTO classificationDTO) {
		classificationDTOMapper.saveClassification(classificationDTO);
		return HttpStatus.CREATED;
	}
	
	@GetMapping("/getAll")
	public List<ClassificationDTO> getAllClassification(){
		return classificationDTOMapper.getAllClassification();	
	}

	@DeleteMapping("/deleteClassificationId/{classificationId}")
	public ResponseEntity<ClassificationDTO> deleteClassificationById(@PathVariable("classificationId") Long classificationId){
		return new ResponseEntity<ClassificationDTO>(classificationDTOMapper.deleteClassification(classificationId), HttpStatus.OK);	
	}
	
	@PutMapping("/updateClassification")
	public ResponseEntity<ClassificationDTO> updateClassification(@Valid @RequestBody ClassificationDTO classificationDTO){
		classificationDTOMapper.updateClassification(classificationDTO);
		return new ResponseEntity<ClassificationDTO>(classificationDTO,HttpStatus.ACCEPTED);
	}
}
