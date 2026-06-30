package com.jdbc.repository.impl;


import com.jdbc.dto.OwnerDTO;
import com.jdbc.repository.OwnerRepository;

import java.time.LocalDate;
import java.util.List;

public class OwnerRepositoryImpl implements OwnerRepository {

    @Override
    public void saveOwner(OwnerDTO owner) {
    }

    @Override
    public OwnerDTO findOwner(int ownerId) {
        return null;
    }

    @Override
    public void updatePetDetails(int ownerId, String petName) {
    }

    @Override
    public void deleteOwner(int ownerId) {
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
