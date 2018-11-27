package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Gandalf")
public class Gandalf implements WizardInterface {
	
	private OutfitInterface myOutfit;

    public Gandalf(@Qualifier("WhiteOutfit") OutfitInterface wizardOutfit) {
        myOutfit = wizardOutfit;
    }
	
	public String giveAdvice() { 
		return "A wizard is never late. Nor is he early; he arrives precisely when he means to.";
	}
	
    public String changeDress() {
        return this.myOutfit.whatIsMyColor();
    }
}
