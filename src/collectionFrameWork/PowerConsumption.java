package collectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;

public class PowerConsumption {
	
	String date ;
	int machineNo ;
	int consumptionInHp ;
	
	public PowerConsumption( String date , int machineNo , int consumptionInHp ) {
		this.date = date ;
		this.machineNo = machineNo ;
		this.consumptionInHp = consumptionInHp ;
	}
	
	public String toString() {
		
		StringBuffer str = new StringBuffer() ;
		str.append( date );
		str.append( "\t\t" );
		str.append( String.valueOf( machineNo ) );
		str.append( "\t\t" );
		str.append( String.valueOf( consumptionInHp ) );
		return str.toString() ;
	}
	
	public static void main( String ar[] ) {
		
		PowerConsumption p[] = new PowerConsumption[6] ;
		
		p[0] = new PowerConsumption ( "10.05.08" , 10 , 100 ) ;
		p[1] = new PowerConsumption ( "10.05.08" , 11 , 120 ) ;
		p[2] = new PowerConsumption ( "10.05.08" , 12 , 125 ) ;
		p[3] = new PowerConsumption ( "11.05.08" , 10 , 145 ) ;
		p[4] = new PowerConsumption ( "11.05.08" , 11 , 155 ) ;
		p[5] = new PowerConsumption ( "12.05.08" , 12 , 165 ) ;
		
		ArrayList<Integer> m10 = new ArrayList<>();
		ArrayList<Integer> m11 = new ArrayList<>();
		ArrayList<Integer> m12 = new ArrayList<>();
		
		int mm10 = 0;
		int mm11 = 0;
		int mm12 = 0;
		
		int md10 = 0;
		int md11 = 0;
		int md12 = 0;
		
		System.out.println("Date\t\tMachine\t\tConsumption");
		for( int i = 0 ; i < p.length ; i++ ) {
			System.out.println(p[i]) ;
			if(p[i].machineNo == 10) {
				mm10 += p[i].consumptionInHp;
				m10.add(p[i].consumptionInHp);
			}
			if(p[i].machineNo == 11) {
				mm11 += p[i].consumptionInHp;
				m11.add(p[i].consumptionInHp);
			}
			if(p[i].machineNo == 12) {
				mm12 += p[i].consumptionInHp;
				m12.add(p[i].consumptionInHp);
			}
			if(p[i].date == "10.05.08") {
				md10 += p[i].consumptionInHp;
			}
			if(p[i].date == "11.05.08") {
				md11 += p[i].consumptionInHp;
			}
			if(p[i].date == "12.05.08") {
				md12 += p[i].consumptionInHp;
			}
			
		}
		
		System.out.println();
		
		System.out.println("Machine/Date\t" + p[0].date + "\t" + p[3].date + "\t" + p[5].date + "\t Total");
		
		System.out.print("10\t\t   ");
		for(Integer i: m10) {
			System.out.print(i + " \t\t ");
		}
		System.out.println(0 + "  \t\t  "+mm10);
		
		System.out.print("11\t\t   ");
		for(Integer i: m11) {
			System.out.print(i + " \t\t ");
		}
		System.out.println(0 + "  \t\t  "+mm11);
		
		boolean b = true;
		System.out.print("12\t\t   ");
		for(Integer i: m12) {
			System.out.print(i + " \t\t ");
			if(b) {
				System.out.print(0 + " \t\t ");
				b = false;
			}
		}
		
		System.out.println(" "+mm12);
		int t = mm10+mm11+mm12;
		System.out.println("Total\t\t   " + md10 + "\t\t " + md11 + "\t\t " + md12 + "\t\t  "+ t);
	}
}
