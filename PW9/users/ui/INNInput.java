package PW9.users.ui;

import PW9.users.UserController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class INNInput {

   JLabel INNLabel = new JLabel("Введите ИНН");
   JTextField INNInput = new JTextField(10);
   String INN = "";

   public INNInput(JFrame window) {
      window.add(INNLabel);
      window.add(INNInput);

      INNInput.addActionListener(new INNInput.INNInputListener());
   }

   class INNInputListener implements ActionListener {

      @Override
      public void actionPerformed(ActionEvent e) {
         INN = INNInput.getText();
         System.out.println(UserController.checkINN(INN).toString());
      }
   }
}
