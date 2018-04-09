package es.unileon.prg.date;

public class Date {
	private int day;
	private int month;
	private int year;

	//No mal constructor, pero en este caso no bueno porque da cabida a fechas inexistentes.
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	//Comienzo del:  "if" statement (isSame*****If).
	public int getYear(){
		return this.year;
	}

	boolean isSameYearIf(Date another){
		if (this.year ==another.getYear()){
			return true;
		}return false;
	}

	public int getMonth(){
		return this.month;
	}

	boolean isSameMonthIf(Date another){
		if(this.month == another.getMonth()){
			return true;
		}return false;
	}

	public int getDay(){
		return this.day;
	}

	boolean isSameDayIf(Date another){
		if(this.day == another.getDay()){
			return true;
		}return false;
	}

	boolean isSameDateIf(Date another){
		if( (this.day == another.getDay())&&(this.month == another.getMonth())&&(this.year == another.getYear()) ){
			return true;
		}return false;
	}
	//Fin del: "if" statement (isSame*****If).




	//Comienzo del: isSame***** sin el "if" statement.

	boolean isSameYear(Date another){
		boolean Verdadero;
		Verdadero = ( this.year == another.getYear() );
		return Verdadero;
	}

	boolean isSameMonth(Date another){
		boolean Verdadero;
		Verdadero = ( this.month == another.getMonth() );
		return Verdadero;
	}

	boolean isSameDay(Date another){
		boolean Verdadero;
		Verdadero = ( this.day == another.getDay() );
		return Verdadero;
	}

	boolean isSameDate(Date another){
		boolean Verdadero;
		Verdadero = (  (this.day == another.getDay() ) && (this.month == another.getMonth() ) && (this.year == another.getYear() )  );
		return Verdadero;
	}

	//Fin del: isSame***** sin el "if" statement.


	//Comienzo del método "getMonthName()" el cual imprime el nombre del mes de la fecha.

	public String getMonthName(){
		StringBuffer monthName = new StringBuffer();

		
		switch (this.month){
			case 1: monthName.append("Enero");
			break;
			
			case 2: monthName.append("Febrero");
			break;
			
			case 3: monthName.append("Marzo");
			break;
			
			case 4: monthName.append("Abril");
			break;
			
			case 5: monthName.append("Mayo");
			break;
			
			case 6: monthName.append("Junio");
			break;
			
			case 7: monthName.append("Julio");
			break;
			
			case 8: monthName.append("Agosto");
			break;
			
			case 9: monthName.append("Septiembre");
			break;
			
			case 10: monthName.append("Octubre");
			break;
			
			case 11: monthName.append("Noviembre");
			break;
			
			case 12: monthName.append("Diciembre");
			break;

		}return	monthName.toString();

	}

	//Fin del método "getMonthName()".

	public String toString(){
		return this.day +"/"+ this.month +"/"+this.year;
	}

	//Comienzo del método "isDayRight()" que indica si la fecha es la correcta.

	boolean isDayRight(){
		if( ( (this.month<=12)&&(this.day<=31) )&&( (this.month>=1)&&(this.day>=1) ) ){
			switch(this.month){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 12:if(this.day<=31){
						return true;
					}else{
						return false;
					 }
				case 4:
				case 6:
				case 9:
				case 11:if(this.day<=30){
						return true;
					}else{
						return false;
					 }
				case 2:if(this.day<=28){
						return true;
					}else{
						return false;
					 }			
			}
		}return false;
	}

	//Fin del método "isDayRight()".

	//Comienzo del método "getSeasonName()" el cual imprime la estación a la que pertenece la fecha dada.

	public String getSeasonName(){
		StringBuffer seasonName = new StringBuffer();
		switch(this.month){
			case 4:
			case 5: seasonName.append("Primavera");
				break;
				
			case 7:
			case 8: seasonName.append("Verano");
				break;
				
			case 10:
			case 11: seasonName.append("Otoño");
				break;
				
			case 3:if(day>20){
					seasonName.append("Primavera");
				}else{
					seasonName.append("Invierno");
				 }
				break;
				
			case 6:if(day>20){
					seasonName.append("Verano");
				}else{
					seasonName.append("Primavera");
				 }
				break;
				
			case 9:if(day>22){
					seasonName.append("Otoño");
				}else{
					seasonName.append("Verano");
				 }
				break;
				
			case 12:if(day>20){
					seasonName.append("Invierno");
				}else{
					seasonName.append("Otoño");
				 }
				break;
				
		}return seasonName.toString();
	} 

	//Fin del método "getSeasonName()".


	//Comienzo del método "getMonthsLeft()" el cual, según la fecha, imprime los meses restantes para acabar el anyo.

	public String getMonthsLeft(){
		StringBuffer monthsLeft = new StringBuffer();
		int counter=0;
		for(int i=this.month;i<=12;i++){
			monthsLeft.append(getMonthName()+ "\n");
			this.month = this.month +1;
			counter = counter +1;	
		}
		this.month=this.month - counter;
		return monthsLeft.toString();
	}

	//Fin del método "getMonthsLeft()".

	//Comienzo del método "randomDate()", la cual genera una fecha aleatoria.

	public String randomDate(){
		StringBuffer randDate = new StringBuffer();
		randDate.append((int)Math.floor(Math.random()*(31)+1)+"/");
		randDate.append((int)Math.floor(Math.random()*(12)+1)+"/");
		randDate.append((int)Math.floor(Math.random()*(2118)+1));
		return randDate.toString();
	}

	//Fin del método "randomDate()".


	//Comienzo del método "getDaysLeftMonth()", el cual devuelve las fechas restantes del mes.

	public String getDaysLeftMonth(){
		int counter1=0;
		StringBuffer daysLeftOfMonth = new StringBuffer();

		do{
			daysLeftOfMonth.append(this.day +"/"+ this.month +"/"+ this.year+ "\n");
			this.day= this.day +1;
			counter1=counter1 +1;
		}
		while(isDayRight()==true);
		this.day=this.day - counter1;
		return daysLeftOfMonth.toString();
		}
	
	//Fin del método "getdaysLeftMonth()".


	//Comienzo del método "getMonthsSameDate()", el cual escribe en pantalla los meses con el mismo número de días que el mes de la fecha.

	public String getMonthsSameDate(){
		StringBuffer monthsSameDate = new StringBuffer();

		switch(this.month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		monthsSameDate.append("Enero, marzo, mayo, julio, agosto, octubre, diciembre");
			break;
			
		case 2:
		monthsSameDate.append("Febrero");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
		monthsSameDate.append("Abril, junio, septiembre, noviembre");
			break;
		}return monthsSameDate.toString();
	}

	//Fin del método "getMonthsSameDate()".


	//Comienzo del método "getDaysPast", el cual escribe en pantalla el número del día del año de la fecha.

	public String getDaysPast(){
		int past=0,mesimpar=31,mespar=30,feb=28;
		StringBuffer daysPast = new StringBuffer();
		switch(this.month){
			case 1: daysPast.append( mesimpar*0 + mespar*0 + this.day);
				break;
				
			case 2: daysPast.append( mesimpar*1 + mespar*0 + this.day);
				break;
				
			case 3: daysPast.append( mesimpar*1 + mespar*0 + feb + this.day);
				break;
				
			case 4: daysPast.append( mesimpar*2 + mespar*0 + feb + this.day);
				break;
				
			case 5: daysPast.append( mesimpar*2 + mespar*1 + feb + this.day);
				break;
				
			case 6: daysPast.append( mesimpar*3 + mespar*1 + feb + this.day);
				break;
				
			case 7: daysPast.append( mesimpar*3 + mespar*2 + feb + this.day);
				break;
				
			case 8: daysPast.append( mesimpar*4 + mespar*2 + feb + this.day);
				break;
				
			case 9: daysPast.append( mesimpar*5 + mespar*2 + feb + this.day);
				break;
				
			case 10: daysPast.append( mesimpar*5 + mespar*3 + feb + this.day);
				break;
				
			case 11: daysPast.append( mesimpar*6 + mespar*3 + feb + this.day);
				break;
				
			case 12: daysPast.append( mesimpar*6 + mespar*4 + feb + this.day);
				break;
				
		}return daysPast.toString();
	}

	//Fin del método "getDaysPast()".


	//Comienzo del método "randomTimesEqToDate1()" (con while), el cual cuenta el número de intentos necesarios para generar una fecha aletoria y que ésta coincida con una dada (que coincida solo en día y mes, no en año. Tampoco tener en cuenta años bisiestos).

	public String randomTimesEqToDate1(){
		int attempts=0, _day=0, _month=0;
		StringBuffer times= new StringBuffer();
		while(this.day!=_day && this.month!=_month){
			_day =(int)(Math.floor(Math.random()*(31)+1) );
			_month =(int)(Math.floor(Math.random()*(12)+1) );

			attempts= attempts +1;
		}
		times.append(attempts);
		return times.toString();
	}

	//Fin del método "randomTimesEqToDate1()" (con while).


	//Comienzo del método "randomTimesEqToDate2()" (con do-while), el cual cuenta el número de intentos necesarios para generar una fecha aletoria y que ésta coincida con una dada (que coincida solo en día y mes, no en año. Tampoco tener en cuenta años bisiestos).


	public String randomTimesEqToDate2(){
		int attempts=0, _day=0, _month=0;
		StringBuffer _times= new StringBuffer();
		
		do{
			_day =(int)(Math.floor(Math.random()*(31)+1) );
			_month =(int)(Math.floor(Math.random()*(12)+1) );

			attempts= attempts +1;
		}while(this.day!=_day && this.month!=_month);
			_times.append(attempts);
			return _times.toString();
	}

	//Fin del método "randomTimesEqToDate2()" (con do-while).


	//Comienzo del método "getDayOfTheWeek()", el cual imprime por pantalla el día de la semana de la fecha, suponiendo que todos en los años el 1 de enero es lunes.

	public String getDayOfTheWeek(){
		StringBuffer dayOTweek= new StringBuffer();
		int dia=Integer.parseInt(getDaysPast() );
		
		if(dia%7 == 1){
			dayOTweek.append("Lunes");
		}
		else if(dia%7 == 2){
			dayOTweek.append("Martes");
		}
		else if(dia%7 == 3){
			dayOTweek.append("Miercoles");
		}
		else if(dia%7 == 4){
			dayOTweek.append("Jueves");
		}
		else if(dia%7 == 5){
			dayOTweek.append("Viernes");
		}
		else if(dia%7 == 6){
			dayOTweek.append("Sabado");
		}
		else if(dia%7 == 0){
			dayOTweek.append("Domingo");
		}return dayOTweek.toString();

	}
	
	
	//Fin del método "getDayOfTheWeek()".


//Fin de la práctica Date.
}
