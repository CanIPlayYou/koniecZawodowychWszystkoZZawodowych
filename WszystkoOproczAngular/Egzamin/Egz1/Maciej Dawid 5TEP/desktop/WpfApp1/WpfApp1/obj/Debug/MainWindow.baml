   M S B A M L   `   `   `  ����B  >WpfApp1, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null!clr-namespace:WpfApp1WpfApp1  5   	       WpfApp1.MainWindow   5   	   R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   'localclr-namespace:WpfApp1     5   	     � Title$,  &Nadaj przesyłkę, PESEL: Maciej Dawid��5   	   $	��600��66   $	��800��6C    � 
ResizeMode$ NoResize=�6O    � SizeToContent$ WidthAndHeight=�6e   .��5	      � .+�5
   
   �� -   5         ��Name$ rodzajPrzesylkiGroup��5
      $��Rodzaj przesyłki��61   $��200px��6K   $��115px��6Y   $��31,82,569,387q�6h   .��5      � .+�5      	� -   5         	�Name$ radioPocztowka��5      $��
Pocztówka��66   $
��Left=�6J   $��	10,10,0,0q�6e   $	��Top=�6x    d� 	IsChecked$
 TrueY�6�   	� 5      -   5        $ 	radioList��5      $
��List��61   $
��Left=�6@   $��	10,40,0,0q�6[   $	��Top=�6n   	� 5      -   5        $ radioPaczka��5      $��Paczka��63   $
��Left=�6D   $��	10,70,0,0q�6_   $	��Top=�6r   5      5      �� 5   
   -   5         ��Name$ sprawdzCene��5      $��Sprawdź cene��6&   $
��Left=�6=   $��
31,207,0,0q�6X   $	��Top=�6l   $	��200��6�   6�   �� 5   
   -   5         ��Name$
 img1��5      $
��Left=�6   $��63��69   $��
38,242,0,0q�6E   $	��Top=�6Y   $	��100��6q   $��/images/pocztowka.png��6}   $
��Fill=�6�   �� 5   
   -   5         ��Name$ textCena��5      $��Cena: ��6"   $
��Left=�63   $��143,255,0,0q�6N   $	��Top=�6c   $
��Bold"�6{   $
��20px(�6�   �� 5   
   -   5        $ zatwierdzButton��5      $��
Zatwierdź��6*   $��Center=�6>   $��	0,388,0,0q�6[   $	��Top=�6n   $	��672��6�   6�   �� 5   
   $��Dane adresowe��6   $��300px��6*   $��190px��68   $��436,82,64,312q�6G   .��5      � .+�5      �� $��Ulica z numerem��6   $
��Left=�62   $��	10,10,0,0q�6M   $	��Top=�6`   �� 5      -	   5        	 ��Name$	 ulicaNumerTextBox��5      $
��Left=�65   $��	10,36,0,0q�6P   
 �� TextWrapping$

 Wrap=�6c   $�� ��6w   $	��Top=�6   $	��120��6�   �� 5       $��Kod pocztowy��6   $
��Left=�6/   $��	10,60,0,0q�6J   $	��Top=�6]   �� 5!      -
   5        $	 kodPocztowyTextBox��5!      $
��Left=�66   $��	10,86,0,0q�6Q   $

 Wrap=�6d   $�� ��6x   $	��Top=�6�   $	��120��6�   �� 5#      $��Miasto��6   $
��Left=�6)   $��
10,110,0,0q�6D   $	��Top=�6X   �� 5$      -   5        $	 miastoTextBox��5$      $
��Left=�61   $��
10,136,0,0q�6L   $

 Wrap=�6`   $�� ��6t   $	��Top=�6|   $	��120��6�   5&      5'      5+      5,      