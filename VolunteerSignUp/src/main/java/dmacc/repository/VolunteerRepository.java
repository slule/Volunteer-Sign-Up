/**  
* @Author Shalom Lule - slule@dmacc.edu  
* CIS175 <Spring 2024>
* Apr 10, 2024 
*/ 
package dmacc.repository;

import org.springframework.stereotype.Repository;

import dmacc.beans.Volunteer;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface VolunteerRepository extends JpaRepository <Volunteer, Long> {

}
