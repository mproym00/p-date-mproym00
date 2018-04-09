package es.unileon.prg.date;

public class MainDate{
	public static void main(String[] args){
		Date today, tomorrow;
		today = new Date(05,04,2018);
		tomorrow = new Date(06,04,2018);

		if(today.isDayRight() && tomorrow.isDayRight() == true){
			System.out.println("La fecha " + today + " tiene el mismo anyo que " + tomorrow +"? "+ today.isSameYearIf(tomorrow) );
			System.out.println("La fecha " + today + " tiene el mismo mes que " + tomorrow +"? "+ today.isSameMonthIf(tomorrow) );
			System.out.println("La fecha " + today + " tiene el dia anyo que " + tomorrow +"?"+ today.isSameDayIf(tomorrow) );
			System.out.println("La fecha " + today + " es la misma que " + tomorrow +"? "+ today.isSameDayIf(tomorrow) );

			System.out.println( today+ " el mes es: " +today.getMonthName() );
			System.out.println( tomorrow+ " el mes es: "+tomorrow.getMonthName() );

			System.out.println( today+ " esta en la estacion: "+today.getSeasonName() );
			System.out.println( tomorrow+ " esta en la estacion: "+tomorrow.getSeasonName() );

			System.out.println("Desde "+today+" quedan estos meses para acabar el anyo: "+today.getMonthsLeft() );
		}else{
			System.out.println("Fecha inválida, vuelta intentarlo e introduzca una fecha existente, por favor.");
}
			System.out.println("Fecha aleatoria, AVISO, puede no ser correcta: "+today.randomDate() );

			System.out.println("Para acabar el mes desde "+today+" quedan estas fechas: "+today.getDaysLeftMonth( ));

			System.out.println("Meses con los mismos dias que "+today.getMonthName()+": "+today.getMonthsSameDate() );

			System.out.println(today+" es el dia numero "+today.getDaysPast());
		
			System.out.println("Numero de intentos para acertar la fecha "+today+": "+today.randomTimesEqToDate1() );

			System.out.println("Si el anyo comienza en lunes, el "+today+" es "+today.getDayOfTheWeek() );

		
	}
}
