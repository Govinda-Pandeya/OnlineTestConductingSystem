/**
 * 
 */
package com.mum.group2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mum.group2.domain.Question;

/**
 * @author Govinda
 *
 */
@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {

}
