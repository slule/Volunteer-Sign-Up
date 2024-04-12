/**  
* @Author Shalom Lule - slule@dmacc.edu  
* CIS175 <Spring 2024>
* Apr 10, 2024 
*/ 
package dmacc.controller;

import org.springframework.stereotype.Service;


import dmacc.beans.Volunteer;
import dmacc.repository.VolunteerRepository;

@Service
public class VolunteerServiceImpl implements VolunteerService {

    private final VolunteerRepository volunteerRepository;

    public VolunteerServiceImpl(VolunteerRepository volunteerRepository) {
        this.volunteerRepository = volunteerRepository;
    }

    @Override
    public void signUp(Volunteer volunteer) {
        volunteerRepository.save(volunteer);
    }
}


