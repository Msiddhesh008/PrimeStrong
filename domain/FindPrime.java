public class FindPrime implements FindInterface {

    int div, num, flag;

    public FindPrime(int no){
        flag=0;
        num=no;
    }

    @Override
    public String find() {
        for(div=0; div <= num/2; div++)
		{
			if(num%2 == 0)
			{
				flag=1;
				break;
			}
		}
		if(flag == 0)
      return "Number is Prime";
    else   
    return "Number is Non-Prime";      
        
    }
    
}
