using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace ConsoleApp1
{
    class StrukturaDanych
    {
        public string artist;
        public string album;
        public int songsNumber;
        public int year;
        public int downloadNumber;
    }

    internal class Program
    {
        static void Main(string[] args)
        {
            List<string> daneZPliku = new List<string>();

            WczytywanieZPliku();
            WypisanieDanychZPliku();


            void WczytywanieZPliku()
            {
                using (StreamReader sr = new StreamReader("Data.txt"))
                {
                    string line;
                    while ((line = sr.ReadLine()) != null)
                    {
                        daneZPliku.Add(line);
                    }
                }
            }

            void WypisanieDanychZPliku()
            {
                foreach(string line in daneZPliku)
                {
                    Console.WriteLine(line);
                }
            }
        }
    }
}
