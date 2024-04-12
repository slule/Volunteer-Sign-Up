/**  
* @Author Shalom Lule - slule@dmacc.edu  
* CIS175 <Spring 2024>
* Apr 10, 2024 
*/ 
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.Shift;

public interface ShiftRepository extends JpaRepository<Shift, Long> {

}
