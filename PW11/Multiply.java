package PW11;

public class Multiply extends BinaryOperation implements IOperation {

   public Multiply(IOperation firstOperation, IOperation secondOperation) {
      super(firstOperation, secondOperation);
      value.operation = "*";
   }

   @Override
   public Value getValue() {
      return value;
   }
}
