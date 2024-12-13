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
        public int licznik = 0;
        List<string> sourceList = new List<string>() {
            "images/Obrazek1.jpeg",
            "images/Obrazek2.jpeg",
            "images/Obrazek3.jpeg",
            "images/Obrazek4.jpeg",
            "images/Obrazek5.jpeg",
            "images/Obrazek6.jpeg",
            "images/Obrazek7.jpeg",
            "images/Obrazek8.jpeg",
            "images/Obrazek9.jpeg",
            "images/Obrazek10.jpeg",
        };

        public MainWindow()
        {
            InitializeComponent();
            nrZdjeciaLabel.Content = "Zdjęcie nr: " + (licznik + 1);
        }

        private void prevImgButton_Click(object sender, RoutedEventArgs e)
        {
            licznik--;
            if(licznik < 0)
            {
                licznik = 9;
            }

            nrZdjeciaLabel.Content = "Zdjęcie nr: "+ (licznik+1);
            img1.Source = new BitmapImage(new Uri(sourceList[licznik], UriKind.Relative));
        }

        private void nextImgButton_Click(object sender, RoutedEventArgs e)
        {
            licznik++;
            if(licznik > 9)
            {
                licznik = 0;
            }

            nrZdjeciaLabel.Content = "Zdjęcie nr: "+ (licznik+1);
            img1.Source = new BitmapImage(new Uri(sourceList[licznik], UriKind.Relative));
        }
    }
}
