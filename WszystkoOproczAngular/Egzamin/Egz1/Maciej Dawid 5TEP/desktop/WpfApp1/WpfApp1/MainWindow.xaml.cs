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
        public MainWindow()
        {
            InitializeComponent();
        }
        /*
         nazwa funkcji: sprawdzCene_Click
         parametry wejściowe: sender - object
         wartość zwracana: -
         informacje: funkcja po kliknięciu buttona "sprawdzCene", sprawdza który checkbox jest zaznaczony i na tej podstawie zmienia source zdjecia i content textu
         autor: Maciej Dawid
        */
        private void sprawdzCene_Click(object sender, RoutedEventArgs e)
        {
            if(radioPocztowka.IsChecked == true)
            {
                img1.Source = new BitmapImage(new Uri("images/pocztowka.png", UriKind.Relative));
                textCena.Content = "Cena: 1 zł";
            }
            else if(radioPaczka.IsChecked == true)
            {
                img1.Source = new BitmapImage(new Uri("images/paczka.png", UriKind.Relative));
                textCena.Content = "Cena: 10 zł";
            }
            else if(radioList.IsChecked == true) {
                img1.Source = new BitmapImage(new Uri("images/list.png", UriKind.Relative));
                textCena.Content = "Cena: 1,5 zł";
            }
        }


        /*
         nazwa funkcji: zatwierdzButton_Click
         parametry wejściowe: sender - object
         wartość zwracana: -
         informacje: funkcja po kliknięciu buttona "zatwierdzButton", waliduje poprawność wpisanego kodu pocztowego i zależnie od poprawności wyświetla odpowiedni komunikat
         autor: Maciej Dawid
        */
        private void zatwierdzButton_Click(object sender, RoutedEventArgs e)
        {
            if(kodPocztowyTextBox.Text.Length != 5)
            {
                MessageBox.Show("Nieprawidłowa liczba cyfr w kodzie pocztowym");
                 
            }
            else
            {
                MessageBox.Show("Dane przesyłki zostały wprowadzone");
            }
        }
    }
}
