package business;

import EndingChapter.RandomEndingFour;
import EndingChapter.RandomEndingOne;
import EndingChapter.RandomEndingThree;
import EndingChapter.RandomEndingTwo;

public class RandomObject {
  private String objectName;
  private String objName;
  private String randomName;
  private String storeName, storeName2, storeName3, storeName4, storeName5;
  private String characterName;
  private String myName;
  private String holidayName;
  private String theHName;
  
public RandomObject()
{
    
}
public RandomObject (String name){
    this.objectName = objName;
}

public String getObjectName(){
    return objectName;
}

public void setObjectName(String objectName){
    this.objectName = objectName;
}

public RandomObject(String myName, String characterName){
    this.myName = myName;
    this.characterName = characterName;
}

public String getObjectName(String myName){
    return this.myName;
}

public String getRObjectName(){
    return this.myName;
}

public String getRName(){
    return this.characterName;
}

public String getHolidayName(String theHName){
    this.theHName = theHName;
    return theHName;
}

public String getRHolidayName(){
    return myName;
}

public String getRHoliday(){
    this.holidayName = holidayName;
    return holidayName;
}


public String getRandomName(){
    int objectNumber = (int)(Math.random()*4)+1;
    
    switch(objectNumber){
        case 1:
            randomName = "dog";
            break;
        case 2:
            randomName = "chairs";
            break;
        case 3:
            randomName = "hay";
            break;
        case 4:
            randomName = "grass";
            break;
        default:
    }
    storeName = randomName;
    return randomName;
}

public String getRandomNameField(){
    int objectNumber = (int)(Math.random()*4)+1;
    
    switch(objectNumber){
        case 1:
            randomName = "dog";
            break;
        case 2:
            randomName = "chairs";
            break;
        case 3:
            randomName = "hay";
            break;
        case 4:
            randomName = "grass";
            break;
        default:
    }
    storeName2 = randomName;
    return randomName;
}

    
    public void getRandomEnding(Person p){
    int end = (int)(Math.random()*4)+1;
    
    switch(end){
        case 1:
            new RandomEndingOne(p).setVisible(true);
            break;
        case 2:
            new RandomEndingTwo(p).setVisible(true);
            break;
        case 3:
            new RandomEndingThree(p).setVisible(true);
            break;
        case 4:
            new RandomEndingFour(p).setVisible(true);
            break;
    }
}
    
    public RandomObject getRandomCharacter(){
        int end = (int)(Math.random()*9)+1;
        int sub = (int)(2+Math.random()*4)+1;
        switch(end){
            case 1:
                myName = "Johnny Rose";
                characterName = myName.substring(0,1) + myName.substring(sub);
                break;
            case 2:
                myName = "Moira Rose";
                characterName = myName.substring(0,1) + myName.substring(sub);
                break;
            case 3:
                myName = "David Rose";
                characterName = myName.substring(0,1) + myName.substring(sub);
                break;
            case 4:
                myName = "Alexis Rose";
                characterName = myName.substring(0,1) + myName.substring(sub);
                break;
            case 5:
                myName = "Roland Schitt";
                characterName = myName.substring(0,1) + myName.substring(sub);
                break;
            case 6:
                myName = "Jocelyn Schitt";
                characterName = myName.substring(0,1) + myName.substring(sub);
                break;
            case 7:
                myName = "Stevie Budd";
                characterName = myName.substring(0,1) + myName.substring(sub);
                break;
            case 8:
                myName = "Twyla Sands";
                characterName = myName.substring(0,1) + myName.substring(sub);
                break;
            case 9:
                myName = "Mutt Schitt";
                characterName = myName.substring(0,1) + myName.substring(sub);
                break;
            default:
        }
        storeName3 = myName;
        return new RandomObject(myName, characterName);
    }
    
    public String getRandomCharacterField(){
        int end = (int)(Math.random()*10)+1;
        int sub = (int)(2+Math.random()*4)+1;
        switch(end){
            case 1:
                myName = "Johnny Rose";
                characterName = myName.substring(0,1) + myName.substring(sub);
                break;
            case 2:
                myName = "Moira Rose";
                characterName = myName.substring(0,1) + myName.substring(sub);
                break;
            case 3:
                myName = "David Rose";
                characterName = myName.substring(0,1) + myName.substring(sub);
                break;
            case 4:
                myName = "Alexis Rose";
                characterName = myName.substring(0,1) + myName.substring(sub);
                break;
            case 5:
                myName = "Roland Schitt";
                characterName = myName.substring(0,1) + myName.substring(sub);
                break;
            case 6:
                myName = "Jocelyn Schitt";
                characterName = myName.substring(0,1) + myName.substring(sub);
                break;
            case 7:
                myName = "Stevie Budd";
                characterName = myName.substring(0,1) + myName.substring(sub);
                break;
            case 8:
                myName = "Twyla Sands";
                characterName = myName.substring(0,1) + myName.substring(sub);
                break;
            case 9:
                myName = "Ted Mullens";
                characterName = myName.substring(0,1) + myName.substring(sub);
                break;
            case 10:
                myName = "Mutt Schitt";
                characterName = myName.substring(0,1) + myName.substring(sub);
            default:
        }
        storeName4 = myName;
        return myName;
    }
    
    public RandomObject getRandomHoliday(){
        int end = (int)(Math.random()*6)+1;
        int sub = (int)(2+Math.random()*2)+1;
        switch(end){
            case 1:
                theHName = "Christmas";
                holidayName = theHName.substring(0,1) + theHName.substring(sub);
                break;
            case 2:
                theHName = "Halloween";
                holidayName = theHName.substring(0,1) + theHName.substring(sub);
                break;
            case 3:
                theHName = "Fourth of July";
                holidayName = theHName.substring(0,1) + theHName.substring(sub);
                break;
            case 4:
                theHName = "Thanksgiving";
                holidayName = theHName.substring(0,1) + theHName.substring(sub);
                break;
            case 5:
                theHName = "New Year's Eve";
                holidayName = theHName.substring(0,1) + theHName.substring(sub);
                break;
            case 6:
                theHName = "Easter";
                holidayName = theHName.substring(0,1) + theHName.substring(sub);
                break;
            default:
        }
        storeName5 = theHName;
        return new RandomObject(theHName, holidayName);
    }
    
}