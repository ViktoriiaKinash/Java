public class lab03
{
 public static void main(String args[])
 {
  Wydzial wydzial = new Wydzial();
  Student One = new Student(27236, "Jan", "Nowak");
  Student Two = new Student(89347, "Ela", "Kowalski");
  Student Three = new Student(9546, "Entomologia", "Motylkowska");
  wydzial.Dodaj(One);
  wydzial.Dodaj(Two);
  wydzial.Dodaj(Three);
  wydzial.Wypisz();
 }
}