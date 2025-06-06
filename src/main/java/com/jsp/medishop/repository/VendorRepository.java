package com.jsp.medishop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.medishop.dto.Vendor;

/**
 * @author MD Kamran Irshad
 */
public interface VendorRepository extends JpaRepository<Vendor, Integer> {

	public Vendor findByEmail(String email);
}
