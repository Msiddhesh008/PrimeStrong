public class FindArmStrong implements FindInterface {

    int num, digit, strong_udv, product, counter, rem, armstrong, flag,arm;

    public FindArmStrong(int no){        
    rem=digit=armstrong=product=counter=flag=0;
    no=arm=num;

    }

    @Override
    public String find() {
        
        while(num != 0)
		{
			digit++;
			num/=10;
		}

		num=strong_udv;

		while(num != 0)
		{
			rem = num % 10;

			product = 1;
			counter = 1;

			while(counter <= digit)
			{
				product = product * rem;
				counter++;
			}

			armstrong += product;
			num/=10;
		}

        if(arm == armstrong)
			return arm+" is Armstrong";
		else
        return arm+" is Armstrong";
    }
    
}
