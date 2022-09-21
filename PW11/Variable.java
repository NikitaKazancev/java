package PW11;

import PW11.Value.ValueType;

public class Variable implements IOperation {

   private String var;

   Variable(String var) {
      this.var = var;
   }

   @Override
   public Value getValue() {
      return new Value(var, ValueType.VAR);
   }
}
