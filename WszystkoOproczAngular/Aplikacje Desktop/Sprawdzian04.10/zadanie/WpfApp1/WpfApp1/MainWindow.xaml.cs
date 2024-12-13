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
        int pozostaleRzuty = 3;
        int aktualnyWynik = 0;

        List<string> sourceList = new List<string>() { 
            "images/1.png",
            "images/2.png",
            "images/3.png",
            "images/4.png",
            "images/5.png",
            "images/6.png"
        };

        List<int> randomValues = new List<int>();

        List<int> pointsFromDice = new List<int>();

        public MainWindow()
        {
            InitializeComponent();
            pozostaleRzutyTextBox.Text = pozostaleRzuty.ToString();
            aktualnyWynikTextBox.Text = aktualnyWynik.ToString();
        }

        private void rzucKoscmiButton_Click(object sender, RoutedEventArgs e)
        {
            aktualnyWynik = 0;

            if (pozostaleRzuty > 0)
            {
                Random rnd = new Random();

                for (int i = 0; i < 5; i++)
                {
                    int liczbaRandom = rnd.Next(0, 6);
                    randomValues.Add(liczbaRandom);
                    pointsFromDice.Add(liczbaRandom+1);
                    aktualnyWynik += liczbaRandom + 1;
                }

                btnDice1Image.Source = new BitmapImage(new Uri(sourceList[randomValues[0]], UriKind.Relative));
                btnDice2Image.Source = new BitmapImage(new Uri(sourceList[randomValues[1]], UriKind.Relative));
                btnDice3Image.Source = new BitmapImage(new Uri(sourceList[randomValues[2]], UriKind.Relative));
                btnDice4Image.Source = new BitmapImage(new Uri(sourceList[randomValues[3]], UriKind.Relative));
                btnDice5Image.Source = new BitmapImage(new Uri(sourceList[randomValues[4]], UriKind.Relative));

                randomValues.Clear();

                if(pozostaleRzuty > 1)
                {
                    pointsFromDice.Clear(); //DoZmiany
                }
                

                pozostaleRzuty--;
                pozostaleRzutyTextBox.Text = pozostaleRzuty.ToString();
                aktualnyWynikTextBox.Text = aktualnyWynik.ToString();
            }

            if(pozostaleRzuty == 0)
            {
                rzucKoscmiButton.IsEnabled = false;
                tabelaWynikowListBox.Items.Add(pointsFromDice[0] + pointsFromDice[1] + pointsFromDice[2] + pointsFromDice[3] + pointsFromDice[4]);
            }
        }

        private void nowaGraButton_Click(object sender, RoutedEventArgs e)
        {
            pozostaleRzuty = 3;
            aktualnyWynik = 0;

            pozostaleRzutyTextBox.Text = pozostaleRzuty.ToString();
            aktualnyWynikTextBox.Text = aktualnyWynik.ToString();

            rzucKoscmiButton.IsEnabled = true;

            btnDice1Image.Source = new BitmapImage(new Uri("images/question.png", UriKind.Relative));
            btnDice2Image.Source = new BitmapImage(new Uri("images/question.png", UriKind.Relative));
            btnDice3Image.Source = new BitmapImage(new Uri("images/question.png", UriKind.Relative));
            btnDice4Image.Source = new BitmapImage(new Uri("images/question.png", UriKind.Relative));
            btnDice5Image.Source = new BitmapImage(new Uri("images/question.png", UriKind.Relative));
        }
    }
}
