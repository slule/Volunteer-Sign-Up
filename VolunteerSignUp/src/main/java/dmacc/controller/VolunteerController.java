/**  
* @Author Shalom Lule - slule@dmacc.edu  
* CIS175 <Spring 2024>
* Apr 10, 2024 
*/
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import dmacc.beans.Volunteer;
import dmacc.repository.ShiftRepository;

@Controller
public class VolunteerController {
	private final VolunteerService volunteerService;
	private final ShiftRepository shiftRepository;
	
	@Autowired
	public VolunteerController(VolunteerService volunteerService, ShiftRepository shiftRepository) {
		this.volunteerService = volunteerService;
		this.shiftRepository = shiftRepository;

	}

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("volunteer", new Volunteer());
		model.addAttribute("shifts", shiftRepository.findAll());
		return "index";
	}

	@PostMapping("/signup")
	public String signup(@ModelAttribute Volunteer volunteer) {
		volunteerService.signUp(volunteer);
		return "redirect:/";
	}
}