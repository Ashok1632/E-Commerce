package com.ashok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashok.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
