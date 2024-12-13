using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Zadanie2
{
    internal class Program
    {
        class BmiCalculator
        {
            double bmi = 0;

            public void CalculateBmi(double weight, double height)
            {
                bmi = weight/(height * height);
            }

            public void GetBmiCategory()
            {
                if(bmi < 18.49)
                {
                    Console.WriteLine("Niedowaga");
                }
                else if(bmi > 18.5 && bmi < 24.99)
                {
                    Console.WriteLine("Waga prawidłowa");
                }
                else if(bmi > 25.0 && bmi < 29.99)
                {
                    Console.WriteLine("Nadwaga");
                }
                else if(bmi > 30.0 && bmi < 34.99)
                {
                    Console.WriteLine("1 stopień otyłości");
                }
                else if(bmi > 35.0 && bmi < 39.99)
                {
                    Console.WriteLine("2 stopień otyłości");
                }
                else if(bmi > 40)
                {
                    Console.WriteLine("3 stopień otyłości");
                }
            }
        }

        static void Main(string[] args)
        {
            double bmi = 0;

            Console.Write("Podaj swoją wage(kg): ");
            double podanaWaga = Convert.ToDouble(Console.ReadLine());

            Console.Write("\nPodaj swój wzrost(m): ");
            double podanyWzrost = Convert.ToDouble(Console.ReadLine());


            BmiCalculator bmiCalculator = new BmiCalculator();

            bmiCalculator.CalculateBmi(podanaWaga, podanyWzrost);
            bmiCalculator.GetBmiCategory();
        }
    }
}
