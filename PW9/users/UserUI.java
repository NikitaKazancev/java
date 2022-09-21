package PW9.users;

import PW9.users.ui.INNInput;
import PW9.users.ui.UserSearch;
import PW9.users.ui.UserSortBtn;
import javax.swing.JFrame;

public class UserUI {

   public UserUI(JFrame window) {
      new INNInput(window);
      new UserSearch(window);
      new UserSortBtn(window);
   }
}
