   M S B A M L   `   `   `  ����B  >WpfApp1, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null!clr-namespace:WpfApp1WpfApp1  5   	       WpfApp1.MainWindow   5   	   R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   'localclr-namespace:WpfApp1     5   	     � Title$  
MainWindow��5   	   $	��450��6   $	��800��6)   ���#6c757d.��5	      �  � RowDefinitions 5
   
   �� 5      $	��200 �6   �� 5      $��* �6   .+�5   
   � $��0��6    � ColumnDefinitions 5      �� 5      $
��50px �6#   �� 5      $��* �6#   �� 5      $��* �6#   �� 5      $��* �6#   �� 5      $��* �6#   �� 5      $��* �6#   �� 5      $
��50px �6#   .+�5      �� -   5         ��Name$ 	imageBox1��5      $��1��6'   $��Center=�67   $	��166��6T   $��Center=�6a   $	��112��6|   $��/Imagess/backOfCard.png��6�   $
��Fill=�6�   �� 5      -   5        $ 	imageBox2��5      $��2��6'   $��Center=�67   $	��166��6T   $��Center=�6a   $	��112��6|   $��/Imagess/backOfCard.png��6�   $
��Fill=�6�   �� 5      -   5        $ 	imageBox3��5      $��3��6'   $��Center=�67   $	��166��6T   $��Center=�6a   $	��112��6|   $��/Imagess/backOfCard.png��6�   $
��Fill=�6�   �� 5      -   5        $ 	imageBox4��5      $��4��6'   $��Center=�67   $	��166��6T   $��Center=�6a   $	��112��6|   $��/Imagess/backOfCard.png��6�   $
��Fill=�6�   �� 5      -   5        $ 	imageBox5��5      $��5��6'   $��Center=�67   $	��166��6T   $��Center=�6a   $	��112��6|   $��/Imagess/backOfCard.png��6�   $
��Fill=�6�   5!      �� 5#   
   -   5         ��Name$ losujButton��5#      ���#495057���#212529$	��3pxq�6Q   
�������$��Losuj��6z   $��Center=�6�   $��0,17,0,0q�6�   $��1��6�   $	��Top=�6�   $��40��6�   $	��106��6�   $
��Bold"�6  �� 5$   
   -   5        $ resetButton��5$      ���#495057���#212529$	��3pxq�6Q   
�������$��Resetuj��6z   $��Center=�6�   $��	0,156,0,0q�6�   $��1��6�   $	��Top=�6�   $��40��6�   $	��106��6�   $
��Bold"�6  �� 5%   
   -   5         ��Name$ labelPktWartosci��5%      $"��Suma punktów za wartości: ��6*   $��Center=�6O   
�������$��0,62,0,0q�6   $��1��6�   $	��Top=�6�   $��20(�6�   $
��Bold"�6�   5'      5(      