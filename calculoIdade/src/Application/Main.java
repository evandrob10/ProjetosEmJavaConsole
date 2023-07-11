package Application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		LocalDate dataHojeLocal = LocalDate.now();
		LocalDateTime dataHojeLocalComTime = LocalDateTime.now();
		Instant dataHojeGlobal = Instant.now();
		
		System.out.println(dataHojeLocal);
		System.out.println(dataHojeLocalComTime);
		System.out.println(dataHojeGlobal);
		
		LocalDate r1 = LocalDate.ofInstant(dataHojeGlobal, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(dataHojeGlobal, ZoneId.systemDefault());
		
		System.out.println("teste: "+r2.plusDays(30).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		
	
		
	}
	public static Instant dataAtual () {
		 return Instant.now();
	}
}
