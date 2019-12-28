
package singltonpattern;


public class SingltonPattern {

 
    public static void main(String[] args) {
    
        /*
           objectالهدف  منع انشاء اكثر من 
           من نفس الكلاس
        */
        
        /*
                .. للتوضيح فقط
                  synchronized 
                 فقط لحل مشكلة 
                  thread 
        */
    Singlton  sing1 = Singlton.getSingleton();
    sing1.x="mohammed";
    System.out.println(sing1.x);
    
    Singlton  sing2 = Singlton.getSingleton();
    System.out.println(sing2.x);
    
     Singlton  sing3 = Singlton.getSingleton();
    System.out.println(sing3.x);

    }
    
}

class Singlton{
    //  x >>  للتوضيح فقط
     String x;
     
     
    private static Singlton singlton=null;
    private Singlton(){
        
    }
    
    public static Singlton getSingleton(){
        if(singlton == null){
            synchronized(Singlton.class){
                if(singlton == null){
                   singlton =new Singlton();
                }
             }
        }
        return singlton;
    }
   
}
