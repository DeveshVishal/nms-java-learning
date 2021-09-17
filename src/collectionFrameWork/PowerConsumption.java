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
//		p[5] = new PowerConsumption ( "12.05.08" , 12 , 165 ) ;

		
		System.out.println("Date\t\tMachine\t\tConsumption");
		for( int i = 0 ; i < p.length ; i++ ) {
			System.out.println(p[i]) ;
		}
		
	}
}
