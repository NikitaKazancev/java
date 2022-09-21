package PW11;

public class Divide extends BinaryOperation implements IOperation {

   public Divide(IOperation firstOperation, IOperation secondOperation) {
      super(firstOperation, secondOperation);
      value.operation = "/";
   }

   @Override
   public Value getValue() {
      return value;
   }
}
