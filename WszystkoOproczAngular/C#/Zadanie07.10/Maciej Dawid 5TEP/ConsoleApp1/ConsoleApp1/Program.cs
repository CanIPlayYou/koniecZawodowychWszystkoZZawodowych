using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
        class SamogloskiClass
        {
            public void liczSamogloski(string tekst)
            {
                int licznik = 0;
                char[] samogloski = "aąeęiouóyAĄEĘIOUÓY".ToCharArray();
                char[] wprowadzonyTekst = tekst.ToCharArray();
                

                if(tekst == null || tekst == "")
                {
                    Console.WriteLine("Nie wprowadzono tekstu");
                }
                else
                {
                    for(int i = 0; i < wprowadzonyTekst.Length; i++)
                    {
                        char aktualnyZnak = wprowadzonyTekst[i];
                        
                        for(int j = 0; j < samogloski.Length; j++)
                        {
                            if(aktualnyZnak == samogloski[j])
                            {
                                licznik++;
                            }
                        }
                    }
                    Console.WriteLine("Liczba samogłosek w podanym tekście: "+ licznik);
                }

            }

            public void usunPowtorzenia(string tekst)
            {
                char[] wprowadzonyTekst = tekst.ToCharArray();

                if(tekst == null || tekst == "")
                {
                    Console.WriteLine("Nie wprowadzono tekstu");
                }
                else
                {
                    for (int i = 1; i < wprowadzonyTekst.Length; i++)
                    {
                        if (wprowadzonyTekst[i] == wprowadzonyTekst[i - 1])
                        {
                            wprowadzonyTekst[i - 1] = (char)0;
                        }
                    }
                    Console.Write("Tekst bez powtórzeń: ");
                    for(int i = 0; wprowadzonyTekst.Length > i; i++)
                    {
                        Console.Write(wprowadzonyTekst[i]);
                    }
                    Console.WriteLine("\n");
                }
            }
        }

        static void Main(string[] args)
        {
            Console.Write("Podaj tekst: ");

            string podanyTekst = Console.ReadLine();

            SamogloskiClass samogloskiClass = new SamogloskiClass();
            
            samogloskiClass.liczSamogloski(podanyTekst);
            samogloskiClass.usunPowtorzenia(podanyTekst);
        }
    }
}
