package SpringController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

//kalýtým ile bir controller
public class Controller1 extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mav = new ModelAndView();
		// Team name Galatasaray value sahip bir obje.
		mav.addObject("Team", "Galasatasary");
		mav.setViewName("page1");
		return mav;
	}

}
