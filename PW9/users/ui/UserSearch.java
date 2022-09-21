package PW9.users.ui;

import PW9.users.UserController;
import PW9.users.dto.UserSearchDto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UserSearch {

   JLabel nameLabel = new JLabel("Введите имя");
   JLabel surnameLabel = new JLabel("Введите фамилию");
   JTextField nameInput = new JTextField(10);
   JTextField surnameInput = new JTextField(10);
   String name = "";
   String surname = "";

   public UserSearch(JFrame window) {
      window.add(nameLabel);
      window.add(nameInput);
      window.add(surnameLabel);
      window.add(surnameInput);

      nameInput.addActionListener(new UserSearch.UserSearchListener());
      surnameInput.addActionListener(new UserSearch.UserSearchListener());
   }

   class UserSearchListener implements ActionListener {

      @Override
      public void actionPerformed(ActionEvent e) {
         name = nameInput.getText();
         surname = surnameInput.getText();
         System.out.println(
            UserController.search(new UserSearchDto(name, surname))
         );
      }
   }
}
