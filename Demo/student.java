public class student {
    public String name;
    public int age;
    public String group;
    

/* main Methods */
public static void main(String[] args) {
    student somsri = new student();
    //somsri.name = "somsri";
    //somsri.age = 15;
    //somsri.group = "65/25";
    
    somsri.setData("somsri",15,"65/25");
    somsri.getData();

    //somsri.prinnName();
    //somsri.prinAge();
   // somsri.printlnGroup();
   System.out.println("-------------------------------------------");
   somsri.setData("somsak",25,"65/25");
    somsri.getData();

    //somsri.prinnName();
    //somsri.prinAge();
   // somsri.printlnGroup();


}
public void setData(String name,int age, String group ){
    this.name = name;
    this.age = age;
    this.group = group;
}
public void getData(){
    System.out.println(this.name + " is " + this.age + " year old and is in group " + this.group);
}
public void printlnName(){
    System.out.println( "Student name \\" + this.name);
}
public void printlnAge(){
    System.out.println( "Student age \\ "+ this.age);
}
public void printlnGroup(){
    System.out.println( "Student group \\ "+ this.group);
}
}
    

    
   
