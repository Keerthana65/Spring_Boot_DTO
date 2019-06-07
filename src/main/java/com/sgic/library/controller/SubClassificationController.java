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
import com.sgic.library.dto.SubClassificationDTO;
import com.sgic.library.dtomapper.SubClassificationDTOMapper;

@RestController
public class SubClassificationController {

	@Autowired
	private SubClassificationDTOMapper subClassificationDTOMapper;
	
	@PostMapping("/saveSubClassification")
	public HttpStatus saveSubClassification(@Valid @RequestBody SubClassificationDTO subClassificationDTO) {
		subClassificationDTOMapper.saveSubClassification(subClassificationDTO);
		return HttpStatus.CREATED;
	}
	
	@GetMapping("/getAllSub")
	public List<SubClassificationDTO> getAllSubClassification(){
		return subClassificationDTOMapper.getAllSubClassification();
	}
	
	@DeleteMapping("/deleteSubClassificationId/{subClassificationId}")
	public ResponseEntity<SubClassificationDTO> deleteSubClassificationById(@PathVariable("subClassificationId") Long subClassificationId){
		return new ResponseEntity<SubClassificationDTO>(subClassificationDTOMapper.deleteSubClassificatin(subClassificationId), HttpStatus.OK);	
	}
	
	@PutMapping("/updateSubClassification")
	public ResponseEntity<SubClassificationDTO> updateSubClassification(@Valid @RequestBody SubClassificationDTO subClassificationDTO){
		subClassificationDTOMapper.updateSubClassification(subClassificationDTO);
		return new ResponseEntity<SubClassificationDTO>(subClassificationDTO,HttpStatus.ACCEPTED);
	}
}
