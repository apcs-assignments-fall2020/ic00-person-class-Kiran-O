public class Person {
    private String Firstname;
    private String Lastname;

    public Person(String x, String y){
        Firstname = x;
        Lastname = y; 
    }

    public void doSomething(){
        System.out.println("I am watching Dino-King on TikTok at the moment");
    }

    public String toString(){
        return (Firstname + " " + Lastname);
    }

    public String getFirstname(){
        return (this.Firstname);

    }

    public void setFirstname (String Firstname){
        if (Firstname.trim().length()!= 0){
            this.Firstname = Firstname;
        }
    }


    public String getLastname(){
        return (this.Lastname);
    }

    public void setLastname (String Lastname){
        if (Lastname.trim().length()!= 0){
            this.Lastname = Lastname;
        }
    }

}

   










