
package task1;

public class Shopping extends Tour {
    
    public Shopping(int cost,String transport,boolean food,int numberOfDays){
        super(cost,transport,food,numberOfDays);
        this.type="shopping";
    }
       
   @Override
    public String toString(){
        return "\n"+"Tour type: "+type+super.toString();
    }
}
