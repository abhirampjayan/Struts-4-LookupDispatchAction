package com.apj.actions;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.LookupDispatchAction;

import com.apj.forms.UserForm;

public class UserAction extends LookupDispatchAction {
	private final static String SUCCESS = "success";

	@Override
	protected Map getKeyMethodMap() {
		Map map = new HashMap<>();
		map.put("UserForm.add", "add");
		map.put("UserForm.update", "update");
		map.put("UserForm.delete", "delete");
		return map;
	}

	public ActionForward add(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		UserForm userForm = (UserForm) form;
		userForm.setMessage("From add method.");
		return mapping.findForward(SUCCESS);
	}

	public ActionForward update(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		UserForm userForm = (UserForm) form;
		userForm.setMessage("From update method.");
		return mapping.findForward(SUCCESS);
	}

	public ActionForward delete(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		UserForm userForm = (UserForm) form;
		userForm.setMessage("From delete method.");
		return mapping.findForward(SUCCESS);
	}
}
