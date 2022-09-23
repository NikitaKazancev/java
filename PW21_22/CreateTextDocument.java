package PW21_22;

public class CreateTextDocument implements ICreateDocument {

   @Override
   public IDocument createNew() {
      System.out.println("new text document");
      return new TextDocument();
   }

   @Override
   public IDocument createOpen() {
      System.out.println("open text document");
      return new TextDocument();
   }
}
