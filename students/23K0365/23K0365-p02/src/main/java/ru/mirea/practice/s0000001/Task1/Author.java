package Task1;
public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public void setEmail(String email){this.email=email;}
    public String getName(){return name;}
    public String getEmail(){return email;}
    public char getGender(){return gender;}
    @Override
    public String toString(){
        if(gender=='m'){
        return "Author is "+name+ ". He's email is " +email+". He is a man";}
        else{return "Author is "+name+ ". She's email is " +email+". She is a wOmAn";}}
}
