using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
        class TextManipulator
        {
            public void ToUpperCase(string text)
            {
                Console.WriteLine(text.ToUpper());
            }

            public void ReverseText(string text)
            {
                char[] stareSlowo = text.ToCharArray();

                for(int i = text.Length-1; i >= 0; i--)
                {
                    Console.Write(stareSlowo[i]+ " ");
                }
            }

            public void CountWords(string text)
            {
                Console.WriteLine("\nDługość tekstu: "+ text.Count());
            }
        }

        static void Main(string[] args)
        {
            Console.Write("Podaj tekst: ");
            string podanyTekst = Console.ReadLine();

            TextManipulator textManipulator = new TextManipulator();

            textManipulator.ToUpperCase(podanyTekst);
            textManipulator.ReverseText(podanyTekst);
            textManipulator.CountWords(podanyTekst);
       
        }
    }
}
