package com.cap.service;

import java.util.Optional;

import com.cap.entity.EmployeeDocumentDto;
import com.cap.entity.VerificationDto;

public interface BcgService {

	EmployeeDocumentDto getById(int id);

	EmployeeDocumentDto getByName(String name);

	VerificationDto setStatus(VerificationDto verificationdto);

	//Optional<EmployeeDocumentDto>  getFile(Integer fileId);

}
