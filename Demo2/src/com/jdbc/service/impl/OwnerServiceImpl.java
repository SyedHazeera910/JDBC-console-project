package com.jdbc.service.impl;


import com.jdbc.dto.OwnerDTO;
import com.jdbc.exception.DuplicateOwnerException;
import com.jdbc.exception.OwnerNotFoundException;
import com.jdbc.service.OwnerService;

import java.time.LocalDate;
import java.util.List;

public class OwnerServiceImpl implements OwnerService {
		
	@Override
	public void saveOwner(OwnerDTO ownerDTO) throws DuplicateOwnerException {

	}

	@Override
	public OwnerDTO findOwner(int ownerId) throws OwnerNotFoundException {
		return null;
	}

	@Override
	public void updatePetDetails(int ownerId, String petName) throws OwnerNotFoundException {
				
	}

	@Override
	public void deleteOwner(int ownerId) throws OwnerNotFoundException {
	}

	@Override
	public List<OwnerDTO> findAllOwners() {
		return null;
	}

	@Override
	public List<OwnerDTO> findOwner(String ownerEmailId, LocalDate petBirthDate) {
		return null;
	}

}
