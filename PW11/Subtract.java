package PW11;

public class Subtract extends BinaryOperation implements IOperation {

   public Subtract(IOperation firstOperation, IOperation secondOperation) {
      super(firstOperation, secondOperation);
      value.operation = "-";
   }

   @Override
   public Value getValue() {
      return value;
   }
}
