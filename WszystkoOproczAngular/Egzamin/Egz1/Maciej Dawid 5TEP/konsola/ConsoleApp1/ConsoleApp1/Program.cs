using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
        /*
         nazwa funkcji:  wypelnienieTablicy
         parametry wejściowe: A - tablice intow
         wartość zwracana: -
         informacje: funkcja wypełnia tablice cyframi od 1 do 100
         autor: Maciej Dawid
        */
        public static void wypelnienieTablicy(int[] A)
        {
            for(int i = 1; i < 101; i++)
            {
                A[i-1] = i;
            }
        }

        static void Main(string[] args)
        {

            int[] A = new int[100];
            wypelnienieTablicy(A);

            /*for(int i = 2; i < 11; i++)
            {
                if(A[i] == i)
                {
                    Console.WriteLine(A[i]);
                }
            }*/

            Console.ReadKey();
        }
    }
}
