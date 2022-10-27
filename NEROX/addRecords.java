
public class addRecords {
      
private String name,complain,contact;
private int age,bill,id;
static int num;


//SETTERS
public void setName(String name){
    this.name = name;
}

public void setComplain(String complain){
    this.complain = complain;
}

public void setContact(String contact){
    this.contact = contact;
}

public void setId(int id){
    this.id = id;
}

public void setAge(int age){
    this.age = age;
}

public void setBill(int bill){
    this.bill = bill;
}

//SETTERS
public String getName(){
    return this.name;
}

public String getComplain(){
   return this.complain;
}

public String getContact(){
    return this.contact;
}

public int getId(){
    return this.id;
}

public int getAge(){
    return this.age;
}

public int setBill(){
    return this.bill;
}

//TOSTRING METHOD
public String displayRecords(){
    return "Name= " + this.name + ", Id= " + this.id + ", Age= " + this.age + ", Complain= " + this.complain + ", Contact= " + this.contact + ", Bill=" + this.bill;
}
//To String method which is overriden in this class for object to show  string content
@Override
public String toString()
{
        return "Name= " + this.name + ", Id= " + this.id + ", Age= " + this.age + ", Complain= " + this.complain + ", Contact= " + this.contact + ", Bill=" + this.bill;

}
//DEFAULT CONSTRUCTOR
public addRecords(){

}

//CUSTOM CONSTRUCTOR
public addRecords(int id,int age,int bill,String name,String complain,String contact){
    this.name = name;
    this.complain = complain;
    this.contact = contact;
    this.age = age;
    this.bill = bill;
    this.id = id;
}
}
