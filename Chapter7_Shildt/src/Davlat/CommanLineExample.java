package Davlat;

public class CommanLineExample {
    public static void main(String[]args){
        for(int i = 0; i< args.length;i++){
            System.out.println("args[" + i + "]: " + args[i]);
        }

    }
}
//C:\Users\Admin\IdeaProjects\Chapter7_Shildt\src\Davlat>java CommanLineExample.java this is a test 100 -1