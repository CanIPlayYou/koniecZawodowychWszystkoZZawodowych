using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    /*******************************************
     klasa: Notatka
     opis: Klasa Notatka zawiera 4 pola, jeden konstruktor oraz dwie metody. Konstruktor przypisuje wartości do wszystkich 4 pól,
            metoda WyswietlTytulTresc wyświetla tytuł oraz treść notatki, klasa MetodaDiagnostyczna wypisuje zawartość każdego pola
     pola: licznikNotatek - przechowuje liczby do zliczania notatek,
           id - przechowuje liczby do zapisu unikalnego identyfikatora notatki,
           tytulNotatki - przechowuje stringa który zawiera tytuł notatki,
           trescNotatki - przechowuje stringa który zawiera treść notatki
     autor: Maciej Dawid
     *******************************************/
    class Notatka
    {
        protected static int licznikNotatek = 0;
        protected int id;
        protected string tytulNotatki;
        protected string trescNotatki;

        public Notatka(string tytul, string tresc)
        {
            licznikNotatek++;
            this.id = licznikNotatek;

            this.tytulNotatki = tytul;
            this.trescNotatki = tresc;
        }

        public void WyswietlTytulTresc()
        {
            Console.WriteLine("\nTytuł: "+ tytulNotatki + ", treść: "+ trescNotatki);
        }

        public void MetodaDiagnostyczna()
        {
            Console.WriteLine("\nNr. notatki: "+ licznikNotatek+ "; id notatki: "+ id + "; tytuł notatki: "+ tytulNotatki+ "; treść notatki: "+ trescNotatki);
        }


    }

    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Podaj tytuł notatki: ");
            string podanyTytulNotatki = Console.ReadLine();

            Console.Write("Podaj treść notatki: ");
            string podanaTreśćNotatki = Console.ReadLine();


            Notatka notatka = new Notatka(podanyTytulNotatki, podanaTreśćNotatki);

            notatka.WyswietlTytulTresc();

            notatka.MetodaDiagnostyczna();


            Console.ReadKey();
        }
    }
}
