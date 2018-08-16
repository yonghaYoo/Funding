package Funding.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Funding.Controller.ActionFoward;

public interface Action {
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
