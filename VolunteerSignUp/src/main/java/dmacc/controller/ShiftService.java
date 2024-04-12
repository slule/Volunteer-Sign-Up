/**  
* @Author Shalom Lule - slule@dmacc.edu  
* CIS175 <Spring 2024>
* Apr 10, 2024 
*/
package dmacc.controller;

import java.util.List;

import dmacc.beans.Shift;

public interface ShiftService {
	List<Shift> getAllShifts();

	Shift getShiftById(Long id);

	Shift saveShift(Shift shift);

	void deleteShift(Long id);
}
