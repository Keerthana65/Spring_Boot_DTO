package com.sgic.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sgic.library.model.Classification;

public interface ClassificationRepository extends JpaRepository<Classification, Long> {

}
