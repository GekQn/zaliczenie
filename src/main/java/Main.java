import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Zadanie 2.1: Hello World
        System.out.println("Hello World!!!");

        // Zadanie 2.2: Wypisywanie liczby
        int number = 42;
        System.out.println("Wartość zmiennej: " + number);

        // Zadanie 2.3: Suma
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        double a = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        double b = scanner.nextDouble();
        double sum = a + b;
        System.out.println("Suma: " + sum);

        // Zadanie 2.4: Kalkulator
        System.out.println("Wybierz operację: 1 - suma, 2 - różnica, 3 - iloczyn, 4 - iloraz");
        int operation = scanner.nextInt();
        System.out.println("Podaj pierwszą liczbę:");
        double x = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        double y = scanner.nextDouble();
        double result = 0;
        switch (operation) {
            case 1:
                result = x + y;
                break;
            case 2:
                result = x - y;
                break;
            case 3:
                result = x * y;
                break;
            case 4:
                if (y != 0)
                    result = x / y;
                else
                    System.out.println("Nie można dzielić przez zero!");
                break;
            default:
                System.out.println("Niepoprawny wybór operacji.");
        }
        if (operation >= 1 && operation <= 4) {
            System.out.println("Wynik: " + result);
        }

        // Zadanie 2.5: Liczby parzyste
        System.out.println("Liczby parzyste do 100:");
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }

        // Zadanie 2.6: Test liczby pierwszej
        System.out.println("Podaj liczbę do sprawdzenia czy jest liczbą pierwszą:");
        int numToCheck = scanner.nextInt();
        boolean isPrime = true;
        if (numToCheck <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numToCheck); i++) {
                if (numToCheck % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime)
            System.out.println(numToCheck + " jest liczbą pierwszą.");
        else
            System.out.println(numToCheck + " nie jest liczbą pierwszą.");




        // RÓWNANIE KWADRATOWE
        
              System.out.print("Wpisz a: ");
              int a = scanner.nextInt();
              System.out.print("Wpisz b: ");
              int b = scanner.nextInt();
              System.out.print("Wpisz c: ");
              int c = scanner.nextInt();

             int delta = b * b - 4 * a * c; 
             if (delta<0) {

                    System.out.println("Brak rozwiazania pierwiastka ");
                  } else if (delta == 0) {
                    double x = -b / (2 * a);
                    System.out.println(" pierwiastek wynosi: " + x);
                  } else if (delta > 0) {
                    double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                    System.out.println("Dwa pierwiastki wynosza: " + x1 + " i " + x2);
                  }

                  scanner.close();
                
              -Napisz program, który wyświetla liczy pierwsze z 500 liczb naturalnych.

              public class Main 
              {
                  public static void main(String[] args) 
                  {
                      int limit = 500; 
                      System.out.println("Liczby pierwsze z pierwszych 500 liczb naturalnych:");

                      for (int i = 2; i <= limit; i++) 
                      {
                          if (isPrime(i)) {
                              System.out.println(i);
                          }
                      }
                  }


                  public static boolean isPrime(int num)
                  {
                      if (num <= 1) {
                          return false;
                      }
                      for (int i = 2; i <= Math.sqrt(num); i++) 
                      {
                          if (num % i == 0) {
                              return false;
                          }
                      }
                      return true;
                  }
              }
              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
              -Napisz program, który sprawdzi, czy liczba jest dodatnia czy ujemna.

              import java.util.Scanner;
              public class Main 
              {
                public static void main(String[] args)
                {
                  Scanner scanner = new Scanner(System.in);
                  System.out.println("podaj wartość");
                  double a = scanner.nextDouble(); 
                  if( a>0)
                  {
                    System.out.println("wartość dodatnai" + a);
                  }
                  else if(a<0)
                  {
                    System.out.println("wartość ujemna" + a);
                  }
                  scanner.close(); 
                }
              }
              -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
              -Napisz program, który pobierze od użytkownika trzy liczby i wypisze największą z nich.

              import java.util.Scanner;
              public class Main 
              {
                public static void main(String[] args)
                {
                  Scanner scanner = new Scanner(System.in);
                  System.out.println("Podaj wartość");
                  double a = scanner.nextDouble();
                  double b = scanner.nextDouble();
                  double c = scanner.nextDouble();
                  if(a>=c && a>=b)
                  {
                    System.out.println("Największa liczba to: " + a );
                  }
                  else if(b>=c && b>a)
                  {
                    System.out.println("Największa liczba to: " + b );
                  }
                  else 
                  {
                    System.out.println("Największa liczba to: " + c); 
                  }
                  scanner.close(); 
                }
              }
              ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
              -Napisz program, który składa się z dwóch funkcji obliczach silnię liczby podanej jako argument: w sposób iteracyjny i rekurencyjny.



              import java.util.Scanner;

              public class Silnia {


                  public static long silniaIteracyjnie(int n) {
                      long wynik = 1;
                      for (int i = 1; i <= n; i++) {
                          wynik *= i;
                      }
                      return wynik;
                  }


                  public static long silniaRekurencyjnie(int n) {
                      if (n == 0) {
                          return 1;
                      } else {
                          return n * silniaRekurencyjnie(n - 1);
                      }
                  }

                  public static void main(String[] args) {
                      Scanner scanner = new Scanner(System.in);


                      System.out.println("Wpisz liczbę:");
                      int liczba = scanner.nextInt();


                      long wynikIteracyjny = silniaIteracyjnie(liczba);
                      System.out.println("Silnia liczby " + liczba + " (iteracyjnie) to: " + wynikIteracyjny);


                      long wynikRekurencyjny = silniaRekurencyjnie(liczba);
                      System.out.println("Silnia liczby " + liczba + " (rekurencyjnie) to: " + wynikRekurencyjny);


                      scanner.close();
                  }
              }
              ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
              -Napisz program, który znajduje Największą Wspólną Wielokrotność dwóch liczb.

              public class Main 
              {

              //eukalidesa na nwd
                  public static int nwd(int a, int b)
                  {
                      while (b != 0) {
                          int temp = b;
                          b = a % b;
                          a = temp;
                      }
                      return a;
                  }


                  public static int nww(int a, int b) 
                  {
                      return Math.abs(a * b) / nwd(a, b);
                  }

                  public static void main(String[] args)
                  {
                      Scanner scanner = new Scanner(System.in);


                      System.out.print("Podaj pierwszą liczbę: ");
                      int liczba1 = scanner.nextInt();

                      System.out.print("Podaj drugą liczbę: ");
                      int liczba2 = scanner.nextInt();


                      int wynik = nww(liczba1, liczba2);
                      System.out.println("Największa Wspólna Wielokrotność (NWW) " + 
                        liczba1 + " i " + liczba2 + " wynosi: " + wynik);

                      scanner.close();
                  }
              }    
              -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
              -Napisz program, który przelicza prędkość z m/s na km/h.

              import java.util.Scanner;
              public class Main {
                public static void main(String[] args) 
                {
                  Scanner scanner = new Scanner(System.in);
                  System.out.println("Kalulator prędkości   ");
                  System.out.println("Przelicz z m/s na km/h");
                  System.out.println("Przelicz z km/h na m/s");
                  System.out.println("Wybierz opcje: ");
                  int wybór = scanner.nextInt();
                  switch (wybór) 
                  {
                    case 1:
                      System.out.println("Podaj wartość w m/s");
                      double x = scanner.nextDouble();
                      double waga = 3.6;
                      double a = x * waga;

                      System.out.println("Prędkość wynosi: " + a + "km/h");
                      break;
                    case 2:
                     System.out.println("Podaj wartość w km/h:");
                      double y = scanner.nextDouble();   
                      double kurss= 3.6;
                      double b= y/kurss;
                      System.out.println(" Prędkość wynosi: " + b + "m/s");
                      break;

                  }
                  if(wybór >= 3)
                    {
                      System.out.println("Patrz co klikasz");
                    }
                   scanner.close();
                }
              }
              -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

              -Napisz program, który będzie kalkulatorem walut z PLN na EUR i odwrotnie.

              import java.util.Scanner;
              public class Main {
                public static void main(String[] args) 
                {
                  Scanner scanner = new Scanner(System.in);
                  System.out.println("Kantor  ");
                  System.out.println("1.Euro na złoty ");
                  System.out.println("2.Złoty na euro ");
                  System.out.println("Wybierz opcje: ");
                  int wybór = scanner.nextInt();
                  switch (wybór) 
                  {
                    case 1:
                      System.out.println("Podaj kwotę:");
                      double x = scanner.nextDouble();
                      double kurs = 4.5;
                      double a = x * kurs;
                      System.out.println(" Twoja kwota: " + (x) + "Eur na złotówki wynosi" + a + "zł");
                      break;
                    case 2:
                     System.out.println("Podaj kwotę:");
                      double y = scanner.nextDouble();   
                      double kurss= 4.6;
                      double b= y/kurss;
                      System.out.println(" Twoja kwota: " + (y) + "Złoty na euro wynosi: " + b + "Eur");
                      break;

                  }
                  if(wybór >= 3)
                    {
                      System.out.println("Patrz co klikasz");
                    }
                }
              }
              --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
              -Napisz program, który sprawdza czy dane słowo jest palindromem

              import java.util.Scanner;

              public class Main 
              {

                  // Metoda sprawdzająca, czy słowo jest palindromem
                  public static boolean czyPalindrom(String slowo)
               {
                      int dlugosc = slowo.length();
                      for (int i = 0; i < dlugosc / 2; i++) {
                          if (slowo.charAt(i) != slowo.charAt(dlugosc - 1 - i)) 
              {
                              return false;
                          }
                      }
                      return true;
                  }

                  public static void main(String[] args) 
              {
                      Scanner scanner = new Scanner(System.in);

                      // Pobieranie słowa od użytkownika
                      System.out.print("Podaj słowo: ");
                      String slowo = scanner.nextLine();

                      // Sprawdzanie, czy słowo jest palindromem
                      if (czyPalindrom(slowo)) {
                          System.out.println("Słowo " + slowo + " jest palindromem.");
                      } else {
                          System.out.println("Słowo " + slowo + " nie jest palindromem.");
                      }

                      scanner.close();
                  }
              }
              -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
              --Napisz program, który liczy obecny wiek osoby na podstawie jej daty urodzenia

              import java.util.Scanner;
              import java.time.LocalDate;
              import java.time.Period;

              public class Main {
                public static void main(String[] args) 
                {
                 Scanner scanner = new Scanner(System.in);
                  System.out.println("Podaj dzień urodzenia: ");
                  int dzien = scanner.nextInt();
                  System.out.println("Podaj miesiąc urodzenia: ");
                  int miesiac = scanner.nextInt();
                  System.out.println("Podaj rok urodzenia: ");
                   int rok = scanner.nextInt();
                   LocalDate dataUrodzenia = LocalDate.of(rok, miesiac, dzien);
                   LocalDate dzisiaj = LocalDate.now();
                   Period wiek = Period.between(dataUrodzenia, dzisiaj);
                   System.out.println("Twój wiek to: " + wiek.getYears() + " lat");
                   scanner.close();
                }
              }
              //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

              import java.util.Scanner;

              public class Main
               {
                  public static void main(String[] args) 
              {
                      Scanner scanner = new Scanner(System.in);
                      System.out.println("Witaj");
                      System.out.println("Podaj dzisiejszą datę w formacie dd-mm-yyyy:");

                      int dzisiaj_dzien = scanner.nextInt();
                      int dzisiaj_miesiac = scanner.nextInt();
                      int dzisiaj_rok = scanner.nextInt();

                      System.out.println("Podaj datę urodzenia w formacie dd-mm-yyyy:");

                      int urodzenie_dzien = scanner.nextInt();
                      int urodzenie_miesiac = scanner.nextInt();
                      int urodzenie_rok = scanner.nextInt();

                      int wiek = dzisiaj_rok - urodzenie_rok;

                      if (urodzenie_miesiac > dzisiaj_miesiac || (urodzenie_miesiac == dzisiaj_miesiac && urodzenie_dzien > dzisiaj_dzien)) {
                          wiek--;
                      }

                      System.out.println("Twój wiek to: " + wiek + " lat.");
                  }
              }
              ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
              -Napisz program, który wylosuje dowolną liczbę całkowitą od 0 do 100, a następnie prosi użytkownika o jej zgadnięcie tak długo, aż ten poda poprawną wartość. 

              import java.util.Random;
              import java.util.Scanner;

              public class Main 
              {

                  public static void main(String[] args) 
                  {
                      Random random = new Random();
                      Scanner scanner = new Scanner(System.in);


                      int wylosowanaLiczba = random.nextInt(101); 
                      System.out.println("Zgadnij liczbę od 0 do 100:");
                      int zgadywanaLiczba = -1;

                      do 
                      {
                          System.out.print("Podaj swoją liczbę: ");
                          zgadywanaLiczba = scanner.nextInt();

                          if (zgadywanaLiczba < wylosowanaLiczba)
                          {
                              System.out.println("Podana liczba jest za mała.");
                          } else if (zgadywanaLiczba > wylosowanaLiczba) {
                              System.out.println("Podana liczba jest za duża.");
                          } else
                          {
                              System.out.println("Gratulacje! Zgadłeś liczbę.");
                          }
                      } while (zgadywanaLiczba != wylosowanaLiczba);

                      scanner.close();
                  }
              }
              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
              --Napisz program, który losuje liczbę oczek (od 1 do 6) dla dwóch kostek i porównuje wynik. Ta sama liczba czek oznacza wygraną.

              import java.util.Random;

              public class Main
                  {
                  public static void main(String[] args) 
                  {
                      Random random = new Random();
                      int kostka1 = random.nextInt(6) + 1;
                      int kostka2 = random.nextInt(6) + 1; 

                      System.out.println("Wynik rzutu pierwszą kostką: " + kostka1);
                      System.out.println("Wynik rzutu drugą kostką: " + kostka2);
                      if (kostka1 == kostka2) 
                      {
                          System.out.println("Wygrana! Obie kostki mają taką samą liczbę oczek.");
                      } else
                      {
                          System.out.println("Przegrana. Kostki mają różne liczby oczek.");
                      }
                  }
               }
              --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
              --Napisz program, który wypisze długość danego łańcucha.

              mport java.util.Scanner;

              public class Main {

                  public static void main(String[] args) {
                      Scanner scanner = new Scanner(System.in);


                      System.out.print("Podaj łańcuch znaków: ");
                      String lancuch = scanner.nextLine();


                      int dlugosc = lancuch.length();
                      System.out.println("Długość podanego łańcucha: " + dlugosc);

                      scanner.close();
                  }
              }
              --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
              --Napisz program, który sprawdza, czy równanie jest równaniem liniowym.

              import java.util.Scanner;

              public class Main {

                  public static void main(String[] args) {
                      Scanner scanner = new Scanner(System.in);

                      // Pobieranie równania od użytkownika
                      System.out.print("Podaj równanie w postaci 'ax + b = c': ");
                      String rownanie = scanner.nextLine();

                      // Usunięcie białych znaków z równania
                      rownanie = rownanie.replaceAll("\\s", "");

                      // Sprawdzanie, czy równanie jest liniowe
                      boolean czyLiniowe = czyRownanieLiniowe(rownanie);

                      // Wyświetlanie wyniku
                      if (czyLiniowe) {
                          System.out.println("Podane równanie jest równaniem liniowym.");
                      } else {
                          System.out.println("Podane równanie nie jest równaniem liniowym.");
                      }

                      scanner.close();
                  }

                     public static boolean czyRownanieLiniowe(String rownanie)
               {
                              if (!rownanie.contains("x")) 
              {
                          return false;
                      }

                            String[] strony = rownanie.split("=");


                      if (strony.length != 2 || strony[0].indexOf('x') == -1 || strony[1].indexOf('x') == -1) {
                          return false;
                      }

                             String[] lewaStrona = strony[0].split("x");

                              try {
                          Double.parseDouble(lewaStrona[0]);
                      } catch (NumberFormatException e) 
              {
                          return false;
                      }

                             try 
              {
                          Double.parseDouble(lewaStrona[1]);
                      } catch (NumberFormatException e) {
                          return false;
                      }

                      return true;
                  }
              }
              ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który znajduje pierwiastki równania kwadratowego.

              import java.util.Scanner;

              public class Main {

                  public static void main(String[] args) {
                      Scanner scanner = new Scanner(System.in);


                      System.out.println("Podaj współczynniki równania kwadratowego ax^2 + bx + c = 0:");
                      System.out.print("a: ");
                      double a = scanner.nextDouble();
                      System.out.print("b: ");
                      double b = scanner.nextDouble();
                      System.out.print("c: ");
                      double c = scanner.nextDouble();


                      double delta = b * b - 4 * a * c;


                      if (delta > 0) {
                          double pierwiastekDelta = Math.sqrt(delta);
                          double x1 = (-b + pierwiastekDelta) / (2 * a);
                          double x2 = (-b - pierwiastekDelta) / (2 * a);
                          System.out.println("Równanie ma dwa pierwiastki rzeczywiste:");
                          System.out.println("x1 = " + x1);
                          System.out.println("x2 = " + x2);
                      } else if (delta == 0) {
                          double x = -b / (2 * a);
                          System.out.println("Równanie ma jeden podwójny pierwiastek rzeczywisty:");
                          System.out.println("x = " + x);
                      } else {
                          System.out.println("Równanie nie ma pierwiastków rzeczywistych.");
                      }

                      scanner.close();
                  }
              }
              ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który zliczania liczbę słów w ciągu znaków.

              import java.util.Scanner;

              public class Main {

                  public static void main(String[] args) {
                      Scanner scanner = new Scanner(System.in);


                      System.out.print("Podaj ciąg znaków: ");
                      String ciag = scanner.nextLine();


                      int liczbaSlow = zliczLiczbeSlow(ciag);


                      System.out.println("Liczba słów w podanym ciągu: " + liczbaSlow);

                      scanner.close();
                  }


                  public static int zliczLiczbeSlow(String ciag) {
                      if (ciag == null || ciag.isEmpty()) {
                          return 0;
                      }
                      String[] slowa = ciag.trim().split("\\s+");

                      return slowa.length;
                  }
              }
              --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
              -Napisz program, który na podstawie daty stwierdza czy jest to rok przestępny czy nie.

              import java.util.Scanner;

              public class Main 
              {
                public static void main(String[] args) 
                {
                  System.out.println("Podaj rok: ");
                  Scanner scanner = new Scanner(System.in);
                  int rok = scanner.nextInt();
                  if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0))
                  {
                    System.out.println("rok jest przestępny");
                  } else 
                  {
                    System.out.println("rok nie jest przestępny");
                  }



                }
              } 
              ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który do określania płci osoby na podstawie jej peselu.

              import java.util.Scanner;

              public class Main 
              {
                public static void main(String[] args)
                {
                  Scanner scanner = new Scanner(System.in);
                  System.out.println("Podaj PSEL:");
                  int a = scanner.nextInt();
                  int b = scanner.nextInt();
                  int c = scanner.nextInt();
                  int d = scanner.nextInt();
                  int e = scanner.nextInt();
                  int f = scanner.nextInt();
                  int g = scanner.nextInt();
                  int h = scanner.nextInt();
                  int y = scanner.nextInt();
                  int szukana = scanner.nextInt();
                  int z = scanner.nextInt();

                   if( szukana % 2 == 0)
                   {
                     System.out.println("Kobieta:");
                   } else if(szukana % 2 != 0)
                   {
                     System.out.println("mężczyzna:");
                     scanner.close();
                   } 
                }

              }
              ------------------------------------------------------------------
              import java.util.Scanner;

              public class Main
                  {


                  public static String okreslPlec(String pesel)
                  {

                      if (pesel.length() != 11) {
                          return "Nieprawidłowy numer PESEL.";
                      }


                      char znakPlec = pesel.charAt(9);


                      int cyfraPlec = Character.getNumericValue(znakPlec);


                      if (cyfraPlec % 2 == 0) 
                      {
                          return "Płeć: Kobieta";
                      } else {
                          return "Płeć: Mężczyzna";
                      }
                  }

                  public static void main(String[] args)
                      {
                      Scanner scanner = new Scanner(System.in);


                      System.out.print("Podaj numer PESEL: ");
                      String pesel = scanner.nextLine();


                      String plec = okreslPlec(pesel);
                      System.out.println(plec);

                      scanner.close();
                  }
              }
              ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który zlicza sumę elementów macierzy.
              import java.util.Scanner;

              public class Main 
              {

                  public static void main(String[] args) 
                  {
                      Scanner scanner = new Scanner(System.in);


                      System.out.print("Podaj liczbę wierszy macierzy: ");
                      int wiersze = scanner.nextInt();

                      System.out.print("Podaj liczbę kolumn macierzy: ");
                      int kolumny = scanner.nextInt();


                      int[][] macierz = new int[wiersze][kolumny];


                      System.out.println("Podaj elementy macierzy:");

                      for (int i = 0; i < wiersze; i++) 
                      {
                          for (int j = 0; j < kolumny; j++) 
                          {
                              System.out.print("Podaj element [" + i + "][" + j + "]: ");
                              macierz[i][j] = scanner.nextInt();
                          }
                      }

                      int suma = 0;
                      for (int i = 0; i < wiersze; i++)
                          {
                          for (int j = 0; j < kolumny; j++) 
                          {
                              suma += macierz[i][j];
                          }
                      }

                      System.out.println("Suma elementów macierzy: " + suma);

                      scanner.close();
                  }
              }
              ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który zlicza całkowitą liczbę znaków interpunkcyjnych w danym ciągu.

              import java.util.Scanner;

              public class Main {

                  public static void main(String[] args) {
                      Scanner scanner = new Scanner(System.in);


                      System.out.print("Podaj ciąg znaków: ");
                      String ciag = scanner.nextLine();


                      int liczbaZnakowInterpunkcyjnych = 0;
                      for (int i = 0; i < ciag.length(); i++) {
                          char znak = ciag.charAt(i);
                          if (Character.isLetterOrDigit(znak)) {
                              continue; 
                          }

                          if (znak == '!' || znak == '"' || znak == '#') {
                              liczbaZnakowInterpunkcyjnych++;
                          }
                      }


                      System.out.println("Liczba znaków interpunkcyjnych w podanym ciągu: " + liczbaZnakowInterpunkcyjnych);

                      scanner.close();
                  }
              }
              ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który pozwala znaleźć najmniejszą liczbę spośród trzech liczb.

              import java.util.Scanner;

              public class Main 
              {

                  public static void main(String[] args) 
                  {
                      Scanner scanner = new Scanner(System.in);

                      System.out.print("Podaj pierwszą liczbę: ");
                      int liczba1 = scanner.nextInt();

                      System.out.print("Podaj drugą liczbę: ");
                      int liczba2 = scanner.nextInt();

                      System.out.print("Podaj trzecią liczbę: ");
                      int liczba3 = scanner.nextInt();


                      int najmniejsza = liczba1;

                      if (liczba2 < najmniejsza) {
                          najmniejsza = liczba2;
                      }

                      if (liczba3 < najmniejsza) {
                          najmniejsza = liczba3;
                      }


                      System.out.println("Najmniejsza liczba spośród podanych to: " + najmniejsza);

                      scanner.close();
                  }
              }

              ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który zliczania liczbę słów w ciągu znaków.

              import java.util.Scanner;

              public class Main
                  {

                  public static void main(String[] args) 
                      {
                      Scanner scanner = new Scanner(System.in);
                      System.out.print("Podaj ciąg znaków: ");
                      String ciag = scanner.nextLine();
                      int liczbaSlow = zliczLiczbeSlow(ciag);
                      System.out.println("Liczba słów w podanym ciągu: " + liczbaSlow);

                      scanner.close();
                  }
                  public static int zliczLiczbeSlow(String ciag) 
                      {
                      if (ciag == null || ciag.isEmpty())
                      {
                          return 0;
                      }
                      String[] slowa = ciag.trim().split("\\s+");

                      return slowa.length;
                  }
              }
              ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program, który obliczy sumę cyfr w liczbie całkowitej.

              import java.util.Scanner;

              public class Main 
              {
                  public static void main(String[] args) 
                  {
                      Scanner scanner = new Scanner(System.in);

                      System.out.print("Podaj liczbę całkowitą: ");
                      int liczba = scanner.nextInt();

                      int suma = 0;
                      liczba = Math.abs(liczba);

                      while (liczba != 0) 
                      {
                          suma += liczba % 10;
                          liczba /= 10;
                      }

                      System.out.println("Suma cyfr w podanej liczbie: " + suma);

                      scanner.close();
                  }
              }

              ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Napisz program w java który zamieni podane dwa elementy w tablicy znakowej.

              import java.util.Arrays;

              public class Main 
              {
                  public static void main(String[] args)
                  {
                      char[] tablica = {'a', 'b', 'c', 'd', 'e'};
                      int indeks1 = 1;
                      int indeks2 = 3;
                      System.out.println("Tablica przed zamianą: " + Arrays.toString(tablica));
                      zamienElementy(tablica, indeks1, indeks2);
                      System.out.println("Tablica po zamianie: " + Arrays.toString(tablica));
                  }
                  public static void zamienElementy(char[] tablica, int indeks1, int indeks2) {
                      if (indeks1 < 0 || indeks1 >= tablica.length || indeks2 < 0 || indeks2 >= tablica.length) {
                          System.out.println("Błąd: Podane indeksy są poza zakresem tablicy.");
                          return;
                      }

                      char temp = tablica[indeks1];
                      tablica[indeks1] = tablica[indeks2];
                      tablica[indeks2] = temp;
                  }
              }
              --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
              //Napisz program, który kopiuje wszystkie elementy jednej tablicy do drugiej.

              import java.util.Arrays;

              public class Main {

                  public static void main(String[] args) {
                      // Pierwsza tablica
                      int[] tablica1 = {1, 2, 3, 4, 5};

                      // Tworzenie drugiej tablicy o tej samej wielkości co pierwsza
                      int[] tablica2 = new int[tablica1.length];

                      // Kopiowanie elementów z pierwszej do drugiej tablicy
                      for (int i = 0; i < tablica1.length; i++) {
                          tablica2[i] = tablica1[i];
                      }

                      // Wyświetlanie obu tablic
                      System.out.println("Pierwsza tablica: " + Arrays.toString(tablica1));
                      System.out.println("Druga tablica: " + Arrays.toString(tablica2));
                  }
              }
              --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                //Napisz program, który posortuje tablicę liczb całkowitych w porządku rosnącym

                  import java.util.Arrays;

                  public class Main {

                      public static void main(String[] args) {

                          int[] tablica = {5, 3, 8, 4, 2, 7, 1, 6};


                          System.out.println("Oryginalna tablica: " + Arrays.toString(tablica));


                          sortujTablice(tablica);


                          System.out.println("Tablica po sortowaniu: " + Arrays.toString(tablica));
                      }


                      public static void sortujTablice(int[] tablica) {
                          Arrays.sort(tablica);
                      }
                  }
              --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                  // -Napisz program, który posortuje tablicę liczb całkowitych w porządku malejącym

                  import java.util.Arrays;

                  public class Main {

                      public static void main(String[] args) {

                          int[] tablica = {5, 3, 8, 4, 2, 7, 1, 6};


                          System.out.println("Oryginalna tablica: " + Arrays.toString(tablica));


                          sortujTabliceMalejaco(tablica);


                          System.out.println("Tablica po sortowaniu malejącym: " + Arrays.toString(tablica));
                      }


                      public static void sortujTabliceMalejaco(int[] tablica) {
                          int n = tablica.length;
                          for (int i = 0; i < n - 1; i++) {
                              for (int j = 0; j < n - 1 - i; j++) {
                                  if (tablica[j] < tablica[j + 1]) {

                                      int temp = tablica[j];
                                      tablica[j] = tablica[j + 1];
                                      tablica[j + 1] = temp;
                                  }
                              }
                          }
                      }
                  }
    }
}

