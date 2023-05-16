
package basmalla_2051710203;

//First class holder
public class Holder {//start of class holder block 
    //private attributes of class holder
private String civil_id; //attribute civil _id to save in it the nationalID of the user
private String name;// attribute to save in it the name of user
private double tall;//another attribute of user's tall
private String eye_color;//another attribute of user's eye_color
//zero argument constructor to initialize the attributes with defult values
     public Holder() {
         civil_id="null";//defult value of strings is null 
         name="null";
         tall=0.0;//defult values of double variables is 0.0
         eye_color="null";
    }
     //more argument constructor
     //more argument constructor to put the instance variables in attributes 
    public Holder(String civil_id, String name, double tall, String eye_color) {
    
        this.civil_id = civil_id;//this referd to the current object of the class
        this.name = name;
        this.tall = tall;
        this.eye_color = eye_color;
    }
    
// getter and setter  to access on hidden attributes
    public String getCivil_id() {//start of getcivil_id method
        return civil_id;
    }//end of civil_id method
    // Getter methods of all attributes 
    public String getName() {// getter for name
        
        return name;
    }//end of method

    public double getTall() {//getter for tall
        return tall;
    }//end of method

    public String getEye_color() {//getter for color of eye
        return eye_color;
    }//end of method
    // setter methods for all attributes
    public void setCivil_id(String civil_id) {//setter for civil_id
        this.civil_id = civil_id;
    }//end of civil_id method

    public void setName(String name) {// setter for name
        this.name = name;
    }//end of name method

    public void setTall(double tall) { //setter for tall
        this.tall = tall;
    }//end of tall method

    public void setEye_color(String eye_color) { //setter for eye_color
        this.eye_color = eye_color;
    }//end of eye_color method

    @Override
    public String toString() {//toString method to  print all details about the class
        return "Holder{" + "civil_id=" +  civil_id + ", name=" + name + ", tall=" + tall + ", eye_color=" + eye_color + '}';
    }//end of  toString method

}//end of clas  holder class
