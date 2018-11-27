package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("BlueOutfit")
public class BlueOutfit implements OutfitInterface{
	
	public String whatIsMyColor() { 
		return "I have a blue dress!";
	}

}
