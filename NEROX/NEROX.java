
import java.util.*;

public class NEROX {
    static int num;
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
                
        String name,complain,contact;
        int age,bill,id;
        int choice,idSearch=0,option;
        String nameSearch="";   
        ArrayList<addRecords> n1 = new ArrayList<addRecords>();
        while(true){
            System.out.println("Press 1 for Add Patients Records.");
            System.out.println("Press 2 for Display Patients Records.");
            System.out.println("Press 3 to Delete Patient Record.");
            System.out.println("Press 4 to Search Patient Record.");
            System.out.println("Press 5 to exit.");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Enter Number Of Records You Want To Enter:");
                    num = sc.nextInt();
                    for(int i =0; i<num;i++){
                
                        System.out.println("Enter Patient ID: " );
                        id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Patient Name: " );
                        name = sc.nextLine();
                        System.out.println("Enter Patient Age: " );
                        age = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Patient Complain: " );
                        complain = sc.nextLine();
                        System.out.println("Enter Patient Contact: " );
                        contact = sc.nextLine();
                        System.out.println("Enter Patient Bill: " );
                        bill = sc.nextInt(); 
                        
                        n1.add(new addRecords(id,age,bill,name,complain,contact));
                    }
                    break;

                    case 2:
                    int count=1;
                        if(n1.size() > 0){
                            for(addRecords i:n1){                 
                                System.out.println("Patient " + count + " Data: \n" + i + "\n\n");
                                count++;
                            }
                        }else{
                            System.out.println("No record found!!");
                        }
                        break;
                
                
                case 3:
                    
                    System.out.println("Press 1 to delete by patient id");
                    System.out.println("Press 2 to delete by patient name");
                    option = sc.nextInt();
                    if(option == 1){
                        System.out.println("Enter Any Patient Id To Delete: ");
                        idSearch = sc.nextInt(); 
                        if(n1.size() > 0){
                            for(addRecords i:n1){ 
                                if(i.getId() == idSearch && i.getId() != 0){
                                    n1.remove(i);
                                    System.out.println("Record Deleted Successfully!");
                                }else{
                                    System.out.println("No record of this id was found!");
                                }
                            }
                        }else{
                            System.out.println("No Records Found!Please Enter Any Records First!");
                        }
                    }
                    else if(option == 2){
                        System.out.println("Enter Any Patient Name To Delete: ");
                        nameSearch = sc.nextLine();
                        if(n1.size() > 0){
                            for(addRecords i:n1){ 
                                if(i.getName() == nameSearch && i.getName() != null){
                                    n1.remove(i);
                                    System.out.println("Record Deleted Successfully!");
                                }else{
                                    System.out.println("No record of this name was found!");
                                }
                            }
                        }else{
                            System.out.println("No Records Found!Please Enter Any Records First!");
                        }
                    }else{
                        System.out.println("Wrong Option Entered!");
                    }
                    
                    break;
                    
                case 4:
                    
                    System.out.println("Press 1 to search by patient id");
                    System.out.println("Press 2 to search by patient name");
                    option = sc.nextInt();
                    if(option == 1){
                        System.out.println("Enter Any Patient Id To Search: ");
                        idSearch = sc.nextInt();
                        if(n1.size() > 0){
                            for(addRecords i:n1){ 
                                if(i.getId() == idSearch && i.getId() != 0){
                                    System.out.println(i);
                                }else{
                                    System.out.println("No record of this id was found!");
                                }
                            }
                        }else{
                            System.out.println("No Records Found!Please Enter Any Records First!");
                        }
                    }
                    else if(option == 2){
                        System.out.println("Enter Any Patient Name To Search: ");
                        nameSearch = sc.nextLine();
                        if(n1.size() > 0){
                            for(addRecords i:n1){ 
                                if(i.getName() == nameSearch && i.getName() != null){
                                    System.out.println(i);
                                }else{
                                    System.out.println("No record of this name was found!");
                                }
                            }
                        }else{
                            System.out.println("No Records Found!Please Enter Any Records First!");
                        }

                    }else{
                        System.out.println("Wrong Option Entered!");
                    }
                    break;
                    
                case 5:
                sc.close();
                    return;
                    
            }     
        }
    }
}
