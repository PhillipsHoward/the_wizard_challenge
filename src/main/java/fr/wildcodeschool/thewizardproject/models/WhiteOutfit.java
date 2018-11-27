package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("WhiteOutfit")
public class WhiteOutfit implements OutfitInterface{
	
	public String whatIsMyColor() { 
		return "I have a white dress!";
	}

}
