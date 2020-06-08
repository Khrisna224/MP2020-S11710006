public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        int a=10;
        System.out.println(a);
        tambah(a);
        overriding over = new overriding();
        over.hello();
    }

    static void tambah(int i){
        System.out.println(i+i);
    }
}

class overriding{
    public void hello(){
        System.out.println("overriding class");
    }
}
