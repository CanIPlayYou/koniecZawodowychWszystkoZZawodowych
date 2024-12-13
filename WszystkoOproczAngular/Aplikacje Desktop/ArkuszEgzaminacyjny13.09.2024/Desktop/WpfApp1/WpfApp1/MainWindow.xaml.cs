using System;
using System.Collections.Generic;
using System.IO;
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
        List<string> nazwyWykonawcow = new List<string>();
        List<string> nazwyAlbumow = new List<string>();
        List<string> liczbyUtworow = new List<string>();
        List<string> rokiWydan = new List<string>();
        List<string> liczbyPobran = new List<string>();

        public MainWindow()
        {
            InitializeComponent();

            List<string> dane = new List<string>();


            using (StreamReader sr = new StreamReader("Data.txt"))
            {
                string line;
                while ((line = sr.ReadLine()) != null)
                {
                    dane.Add(line);
                }
            }    


            for(int i = 0; i < dane.Count; i+=6)
            {
                nazwyWykonawcow.Add(dane[i]);
            }

            for(int i = 1; i < dane.Count; i+=6)
            {
                nazwyAlbumow.Add(dane[i]);
            }

            for(int i = 2; i < dane.Count; i+=6)
            {
                liczbyUtworow.Add(dane[i]);
            }

            for(int i = 3; i < dane.Count; i+=6)
            {
                rokiWydan.Add(dane[i]);
            }

            for(int i = 4; i < dane.Count; i+=6)
            {
                liczbyPobran.Add(dane[i]);
            }

            nazwaWykonawcyText.Content = nazwyWykonawcow[0];
            nazwaAlbumuText.Content = nazwyAlbumow[0];
            liczbaUtworowText.Content = liczbyUtworow[0]+ " utworów";
            rokWydaniaText.Content = rokiWydan[0];
            liczbaPobranText.Content = liczbyPobran[0];

        }

        int currentAlbum = 0;

        private void leftButton_Click(object sender, RoutedEventArgs e)
        {
            if(currentAlbum == 0)
            {
                currentAlbum = 13;

                nazwaWykonawcyText.Content = nazwyWykonawcow[currentAlbum];
                nazwaAlbumuText.Content = nazwyAlbumow[currentAlbum];
                liczbaUtworowText.Content = liczbyUtworow[currentAlbum] + " utworów";
                rokWydaniaText.Content = rokiWydan[currentAlbum];
                liczbaPobranText.Content = liczbyPobran[currentAlbum];
            }
            else
            {
                currentAlbum--;

                nazwaWykonawcyText.Content = nazwyWykonawcow[currentAlbum];
                nazwaAlbumuText.Content = nazwyAlbumow[currentAlbum];
                liczbaUtworowText.Content = liczbyUtworow[currentAlbum] + " utworów";
                rokWydaniaText.Content = rokiWydan[currentAlbum];
                liczbaPobranText.Content = liczbyPobran[currentAlbum];
            }    
        }

        private void rightButton_Click(object sender, RoutedEventArgs e)
        {
            if (currentAlbum == 13)
            {
                currentAlbum = 0;

                nazwaWykonawcyText.Content = nazwyWykonawcow[currentAlbum];
                nazwaAlbumuText.Content = nazwyAlbumow[currentAlbum];
                liczbaUtworowText.Content = liczbyUtworow[currentAlbum] + " utworów";
                rokWydaniaText.Content = rokiWydan[currentAlbum];
                liczbaPobranText.Content = liczbyPobran[currentAlbum];
            }
            else
            {
                currentAlbum++;

                nazwaWykonawcyText.Content = nazwyWykonawcow[currentAlbum];
                nazwaAlbumuText.Content = nazwyAlbumow[currentAlbum];
                liczbaUtworowText.Content = liczbyUtworow[currentAlbum] + " utworów";
                rokWydaniaText.Content = rokiWydan[currentAlbum];
                liczbaPobranText.Content = liczbyPobran[currentAlbum];
            }
        }

        private void pobierzButton_Click(object sender, RoutedEventArgs e)
        {
            int aktualnaLiczbaPobran = Convert.ToInt32(liczbyPobran[currentAlbum]);
            liczbyPobran[currentAlbum] = (aktualnaLiczbaPobran+1).ToString();
            liczbaPobranText.Content = liczbyPobran[currentAlbum];
        }
    }
}
