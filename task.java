class Book{
    String name;
    String auther;
    String genre;

    book(String name , String auther , String genre){
        this.name= name;
        this.auther= auther;
        this.genre= genre;
    }
    public String get (){
        System.out.println("this.name"+ name);
        System.out.println("this.auther"+auther);
        System.out.println("this.genre"+genre);
    }
}
    public class task{
        public static void main(string[] args){
        book bc=new book("the book title"+ "honesty is best policy");
        bc.get();

    }
}
