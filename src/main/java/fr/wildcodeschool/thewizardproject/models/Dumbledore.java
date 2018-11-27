package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Dumbledore")
public class Dumbledore implements WizardInterface {
	
	private OutfitInterface myOutfit;
	
	public Dumbledore(@Qualifier("BlueOutfit") OutfitInterface wizardOutfit) {
        myOutfit = wizardOutfit;
    }
	
	public String giveAdvice() { 
		return "Happiness can be found, even in the darkest of times, if one only remembers to turn on the light.";
	}
	
	 public String changeDress() {
	        return this.myOutfit.whatIsMyColor();
	    }

}
