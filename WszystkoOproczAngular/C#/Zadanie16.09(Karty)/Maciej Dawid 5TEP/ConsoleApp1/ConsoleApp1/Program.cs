using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
        class Karta
        {
            public string kolor;
            public string wartosc;
            public string sciezkaDoPliku;
        }

        static void Main(string[] args)
        {
            List<string> karty = new List<string>();
            int indexKarty = 0;

            using (StreamReader sr = new StreamReader("karty.txt"))
            {
                string line;
                while ((line = sr.ReadLine()) != null)
                {
                    karty.Add(line);
                }
            }

            Random rnd = new Random();

            for (int i = 0; i < 6; i++)
            {
                Karta kartaClass = new Karta();
  
                indexKarty = 0;

                indexKarty = rnd.Next(1, karty.Count);

                kartaClass.wartosc = karty[indexKarty].Split(' ').First();
                kartaClass.kolor = karty[indexKarty].Split(' ').Last();
                kartaClass.sciezkaDoPliku = kartaClass.wartosc + "_" + kartaClass.kolor + ".png";

                Console.Write(kartaClass.wartosc + " ");
                Console.Write(kartaClass.kolor + " ");
                Console.WriteLine(", Ścieżka do pliku: "+ kartaClass.sciezkaDoPliku);

                
            }

            Console.ReadKey();
        }
    }
}
