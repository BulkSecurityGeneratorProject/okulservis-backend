package com.okulservis.service;

import com.okulservis.domain.OkuYolcu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing OkuYolcu.
 */
public interface OkuYolcuService {

    /**
     * Save a okuYolcu.
     *
     * @param okuYolcu the entity to save
     * @return the persisted entity
     */
    OkuYolcu save(OkuYolcu okuYolcu);

    /**
     *  Get all the okuYolcus.
     *
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    Page<OkuYolcu> findAll(Pageable pageable);

    /**
     *  Get the "id" okuYolcu.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    OkuYolcu findOne(Long id);

    /**
     *  Delete the "id" okuYolcu.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);

    /**
     * Search for the okuYolcu corresponding to the query.
     *
     *  @param query the query of the search
     *  
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    Page<OkuYolcu> search(String query, Pageable pageable);
}
