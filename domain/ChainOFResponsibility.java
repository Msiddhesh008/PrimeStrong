public class ChainOFResponsibility {

    String value = "";
    int no;

    public ChainOFResponsibility(int no){
        this.no = no;
    }
    
    public String find(FindInterface findInterface) {
        value = findInterface.find();
        return value;    
    }

}