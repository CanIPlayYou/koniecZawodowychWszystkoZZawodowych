using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace WpfApp1
{
    /// <summary>
    /// Logika interakcji dla klasy MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        List<string> karty = new List<string>
        {
                "Imagess/clubs_3.png",//trefle
                "Imagess/clubs_4.png",
                "Imagess/clubs_5.png",
                "Imagess/clubs_6.png",
                "Imagess/clubs_7.png",
                "Imagess/clubs_8.png",
                "Imagess/clubs_9.png",
                "Imagess/clubs_10.png",
                "Imagess/clubs_J.png",
                "Imagess/clubs_Q.png",
                "Imagess/clubs_K.png",
                "Imagess/clubs_A.png",
                "Imagess/diamonds_2.png",// poduszki
                "Imagess/diamonds_3.png",
                "Imagess/diamonds_4.png",
                "Imagess/diamonds_5.png",
                "Imagess/diamonds_6.png",
                "Imagess/diamonds_7.png",
                "Imagess/diamonds_8.png",
                "Imagess/diamonds_9.png",
                "Imagess/diamonds_10.png",
                "Imagess/diamonds_J.png",
                "Imagess/diamonds_Q.png",
                "Imagess/diamonds_K.png",
                "Imagess/diamonds_A.png",
                "Imagess/hearts_2.png", // serca
                "Imagess/hearts_3.png",
                "Imagess/hearts_4.png",
                "Imagess/hearts_5.png",
                "Imagess/hearts_6.png",
                "Imagess/hearts_7.png",
                "Imagess/hearts_8.png",
                "Imagess/hearts_9.png",
                "Imagess/hearts_10.png",
                "Imagess/hearts_J.png",
                "Imagess/hearts_Q.png",
                "Imagess/hearts_K.png",
                "Imagess/hearts_A.png",
                "Imagess/spades_2.png",//Pik
                "Imagess/spades_3.png",
                "Imagess/spades_4.png",
                "Imagess/spades_5.png",
                "Imagess/spades_6.png",
                "Imagess/spades_7.png",
                "Imagess/spades_8.png",
                "Imagess/spades_9.png",
                "Imagess/spades_10.png",
                "Imagess/spades_J.png",
                "Imagess/spades_Q.png",
                "Imagess/spades_K.png",
                "Imagess/spades_A.png",
            };

        List<int> wartoscKart = new List<int>
        {
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10,
            11, //jopek
            12, //dama
            13, //król
            1, // as
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10,
            11,
            12,
            13,
            1,//
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10,
            11,
            12,
            13,
            1,//
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10,
            11,
            12,
            13,
            1,//
        };

        List<int> numerKarty = new List<int>();

        int sumaPktZaWartosc = 0;

        public MainWindow()
        {
            
            InitializeComponent();
            
        }

        private void losujButton_Click(object sender, RoutedEventArgs e)
        {
            if (numerKarty != null)
            {
                numerKarty.Clear();
            }

            sumaPktZaWartosc = 0;
            
            Random rnd = new Random();

            for(int i = 0; i < 6; i++)
            {
                int randomNumber = rnd.Next(0, karty.Count);
                numerKarty.Add(randomNumber);
            }

            imageBox1.Source = new BitmapImage(new Uri(karty[numerKarty[0]], UriKind.Relative));
            imageBox2.Source = new BitmapImage(new Uri(karty[numerKarty[1]], UriKind.Relative));
            imageBox3.Source = new BitmapImage(new Uri(karty[numerKarty[2]], UriKind.Relative));
            imageBox4.Source = new BitmapImage(new Uri(karty[numerKarty[3]], UriKind.Relative));
            imageBox5.Source = new BitmapImage(new Uri(karty[numerKarty[4]], UriKind.Relative));

            int wartoscKarty1 = wartoscKart[numerKarty[0]];
            int wartoscKarty2 = wartoscKart[numerKarty[1]];
            int wartoscKarty3 = wartoscKart[numerKarty[2]];
            int wartoscKarty4 = wartoscKart[numerKarty[3]];
            int wartoscKarty5 = wartoscKart[numerKarty[4]];

            List<int> wartosci = new List<int>();

            wartosci.Add(wartoscKarty1);
            wartosci.Add(wartoscKarty2);
            wartosci.Add(wartoscKarty3);
            wartosci.Add(wartoscKarty4);
            wartosci.Add(wartoscKarty5);

            for(int i = 0; i < wartosci.Count; i++)
            {
                for(int j = 0; j < wartosci.Count; j++)
                {
                    if (wartosci[j] == wartosci[i] && j != i)
                    {
                        sumaPktZaWartosc += wartosci[i];
                    }
                }
            }
            labelPktWartosci.Content = "Suma punktów za wartości: " + sumaPktZaWartosc;
        }

        private void resetButton_Click(object sender, RoutedEventArgs e)
        {
            imageBox1.Source = new BitmapImage(new Uri("Imagess/backOfCard.png", UriKind.Relative));
            imageBox2.Source = new BitmapImage(new Uri("Imagess/backOfCard.png", UriKind.Relative));
            imageBox3.Source = new BitmapImage(new Uri("Imagess/backOfCard.png", UriKind.Relative));
            imageBox4.Source = new BitmapImage(new Uri("Imagess/backOfCard.png", UriKind.Relative));
            imageBox5.Source = new BitmapImage(new Uri("Imagess/backOfCard.png", UriKind.Relative));

            sumaPktZaWartosc = 0;
            labelPktWartosci.Content = "Suma punktów za wartości: " + sumaPktZaWartosc;
        }
    }
}