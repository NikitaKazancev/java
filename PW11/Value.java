package PW11;

public class Value {

   enum ValueType {
      VAR,
      VALUE,
      CONST,
   }

   String var1 = null;
   String var2 = null;
   Float float1 = null;
   Float float2 = null;
   Value value1 = null;
   Value value2 = null;
   ValueType type = null;
   String operation = null;

   public Value(String var1) {
      this.var1 = var1;
   }

   public Value(Float float1) {
      this.float1 = float1;
   }

   public Value(Value value1) {
      this.value1 = value1;
   }

   public Value(Float float1, ValueType type) {
      this.float1 = float1;
      this.type = type;
   }

   public Value(String var1, ValueType type) {
      this.var1 = var1;
      this.type = type;
   }
}
