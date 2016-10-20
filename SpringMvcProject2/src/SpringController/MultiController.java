package SpringController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MultiController extends MultiActionController{

	public String login(HttpServletRequest req, HttpServletResponse resp){
		req.setAttribute("LoginInfo", "Kullanici_Name_Login");
		return "/loginMulti";
	}
	public ModelAndView logout(HttpServletRequest req, HttpServletResponse resp){
		ModelAndView mav = new ModelAndView();
		mav.addObject("LogoutInfo", "Kullanici_Name_LogOut");
		mav.setViewName("/logoutMulti");
		return mav;
//		istersek modelandview'i bu sýnýfa parametre olarak verebilriiz. 	
	}
}
