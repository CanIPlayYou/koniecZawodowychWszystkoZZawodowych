using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {      
        class DateCalculator
        {
            public void isLeapYear(int year)
            {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                {
                    Console.WriteLine("Rok jest przestępny");
                }
                else
                {
                    Console.WriteLine("Rok nie jest przestępny");
                }
            }

            public void obliczenieWyniku(int dzien, int miesiac, int rok)
            {
                List<string> dniTygodnia = new List<string>() {
                "Sobota",
                "Niedziela",
                "Poniedziałek",
                "Wtorek",
                "Środa",
                "Czwartek",
                "Piątek"
                };

                if (miesiac == 1)
                {
                    miesiac = 13;
                }
                if(miesiac == 2)
                {
                    miesiac = 14;
                }

                int wynik = (dzien + (((miesiac + 1) * 13) / 5) + (rok % 100) + ((rok % 100) / 4) + ((rok / 100) / 4) - (2 * (rok / 100))) % 7;

                Console.WriteLine(dzien+"."+miesiac+"."+rok+" to " + dniTygodnia[wynik]);
            }
        }

        static void Main(string[] args)
        {
            

            Console.Write("Podaj dane w formacie dd.MM.yyyy : ");
            string podanaData = Console.ReadLine();

            string podanyDzien = podanaData.Split('.').First();
            string podanyMiesiac = podanaData.Split('.').ElementAt(1);
            string podanyRok = podanaData.Split('.').Last();

            DateCalculator dateCalculator = new DateCalculator();

            dateCalculator.isLeapYear(Convert.ToInt32(podanyRok));
            dateCalculator.obliczenieWyniku(Convert.ToInt32(podanyDzien), Convert.ToInt32(podanyMiesiac), Convert.ToInt32(podanyRok));
        }
    }
}
