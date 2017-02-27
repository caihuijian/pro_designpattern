package road;


public class Street extends AbstractRoad{  
    @Override  
    public void run() {  
        // TODO Auto-generated method stub  
        super.run();  
        aCar.run();  
        aPeople.drive();
        System.out.println("在市区街道行驶");  
    }  
}  
