package PW21_22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;

public class Frame extends JFrame {

   private ICreateDocument createDocument;

   public Frame(ICreateDocument createDocument) {
      super("Editor");
      this.createDocument = createDocument;

      render();
   }

   private void render() {
      setSize(500, 500);
      setVisible(true);

      JMenuBar menuBar = new JMenuBar();
      JMenu menu = new JMenu("File");
      JMenuItem newItem = new JMenuItem("New");
      JMenuItem openItem = new JMenuItem("Open");
      JMenuItem saveItem = new JMenuItem("Save");
      JMenuItem exitItem = new JMenuItem("Exit");
      menu.add(newItem);
      menu.add(openItem);
      menu.add(saveItem);
      menu.add(exitItem);
      menuBar.add(menu);

      newItem.addActionListener(new Frame.NewItemListener());
      openItem.addActionListener(new Frame.OpenItemListener());

      setJMenuBar(menuBar);
   }

   class NewItemListener implements ActionListener {

      public void actionPerformed(ActionEvent e) {
         createDocument.createNew();
         System.out.println("Created!");
      }
   }

   class OpenItemListener implements ActionListener {

      public void actionPerformed(ActionEvent e) {
         createDocument.createOpen();
         System.out.println("Opened!");
      }
   }
}
