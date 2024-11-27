package com.jsfcourse.dictionaryType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ejb.EJB;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.faces.context.Flash;
import jakarta.servlet.http.HttpSession;

import com.jsf.dao.DictionaryTypeDAO;
import com.jsf.entities.DictionaryType;



@Named
@RequestScoped
public class DictionaryTypeListBB {
	private static final String PAGE_DICTIONARYTYPE_EDIT = "dictionaryTypeEdit?faces-redirect=true";
	private static final String PAGE_STAY_AT_THE_SAME = null;
	


	private String name;
		
	@Inject
	ExternalContext extcontext;
	
	@Inject
	Flash flash;
	
	@EJB
	DictionaryTypeDAO dictionaryTypeDAO;
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DictionaryType> getFullList(){
		return dictionaryTypeDAO.getFullList();
	}

	public List<DictionaryType> getList(){
		List<DictionaryType> list = null;
		
		//1. Prepare search params
		Map<String,Object> searchParams = new HashMap<String, Object>();
		
		if (name != null && name.length() > 0){
			searchParams.put("name", name);
		}
		
		//2. Get list
		list = dictionaryTypeDAO.getList(searchParams);
		
		return list;
	}

	public String newDictionaryType(){
		DictionaryType dictionaryType = new DictionaryType();
		
		//1. Pass object through session
		//HttpSession session = (HttpSession) extcontext.getSession(true);
		//session.setAttribute("person", person);
			
		//2. Pass object through flash	
		flash.put("dictionaryType", dictionaryType);
		
		return PAGE_DICTIONARYTYPE_EDIT;
	}

	public String editDictionaryType(DictionaryType dictionaryType){
		//1. Pass object through session
		//HttpSession session = (HttpSession) extcontext.getSession(true);
		//session.setAttribute("person", person);
		
		//2. Pass object through flash 
		flash.put("dictionaryType", dictionaryType);
		
		return PAGE_DICTIONARYTYPE_EDIT;
	}

	public String deleteDictionaryType(DictionaryType dictionaryType){
		dictionaryTypeDAO.remove(dictionaryType);
		return PAGE_STAY_AT_THE_SAME;
	}
}
