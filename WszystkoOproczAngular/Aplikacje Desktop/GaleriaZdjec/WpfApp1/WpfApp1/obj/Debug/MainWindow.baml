   M S B A M L   `   `   `  ����B  >WpfApp1, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null!clr-namespace:WpfApp1WpfApp1  5   	       WpfApp1.MainWindow   5   	   R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   'localclr-namespace:WpfApp1     5   	     � Title$  
MainWindow��5   	   $	��450��6   $	��800��6)   .��5	      �  � RowDefinitions 5
   
   �� 5      $	��300 �6   �� 5      $��* �6    � ColumnDefinitions 5   
   �� 5      $	��200 �6   �� 5      $��* �6   �� 5      $	��200 �6   .+�5   
   �� -   5         ��Name$
 img1��5      $��1��6   $��Center=�6.   $	��232��6K   $��Center=�6X   $	��348��6s   $��/images/Obrazek1.jpeg��6   $
��Fill=�6�   �� 5   
   -   5         ��Name$ prevImgButton��5      $
��Left=�6(   $��
45,100,0,0q�6C   $	��Top=�6W   .��5      �� $��Center=�6   $��Center=�61   $	��100��6L   $	��100��6Y   $��/images/arrow_prev.jpg��6e   $
��Fill=�6�    � Cursor$
 Hand��6�   5      �� 5   
   -   5        $ nextImgButton��5      $��2��6(   $
��Left=�68   $��
50,100,0,0q�6S   $	��Top=�6g   .��5      �� $��Center=�6   $��Center=�61   $	��100��6L   $	��100��6Y   $��/images/arrow_next.jpg��6e   $
��Fill=�6�   $
 Hand��6�   5      �� 5    
   -   5         ��Name$ nrZdjeciaLabel��5       $��1��6(   $��Zdjęcie nr: ��68   $��40(�6O   $
��Bold"�6]   $��Center=�6o   $��1��6�   $��Center=�6�   5$      5%      