package PW11;

import PW11.Value.ValueType;

public abstract class BinaryOperation {

   Value value;

   public BinaryOperation(
      IOperation firstOperation,
      IOperation secondOperation
   ) {
      Value firstV = firstOperation.getValue();
      Value secondV = secondOperation.getValue();
      switch (firstV.type) {
         case VALUE:
            value = new Value(firstV);
            switch (secondV.type) {
               case VALUE:
                  value.value2 = secondV;
                  break;
               case CONST:
                  value.float2 = secondV.float1;
                  break;
               case VAR:
                  value.var2 = secondV.var1;
                  break;
               default:
                  break;
            }
            break;
         case VAR:
            value = new Value(firstV.var1);
            switch (secondV.type) {
               case VALUE:
                  value.value2 = secondV;
                  break;
               case CONST:
                  value.float2 = secondV.float1;
                  break;
               case VAR:
                  value.var2 = secondV.var1;
                  break;
               default:
                  break;
            }
            break;
         case CONST:
            value = new Value(firstV.float1);
            switch (secondV.type) {
               case VALUE:
                  value.value2 = secondV;
                  break;
               case CONST:
                  value.float2 = secondV.float1;
                  break;
               case VAR:
                  value.var2 = secondV.var1;
                  break;
               default:
                  break;
            }
            break;
         default:
            break;
      }
      value.type = ValueType.VALUE;
   }

   public float evaluate(float var, Value res) {
      if (res.var1 != null) {
         if (res.var2 != null) {
            return Functions.getAfterOp(res.operation, var, var);
         }
         if (res.float2 != null) {
            return Functions.getAfterOp(res.operation, var, res.float2);
         }
         if (res.value2 != null) {
            return Functions.getAfterOp(
               res.operation,
               var,
               evaluate(var, res.value2)
            );
         }
      }

      if (res.float1 != null) {
         if (res.var2 != null) {
            return Functions.getAfterOp(res.operation, res.float1, var);
         }
         if (res.float2 != null) {
            return Functions.getAfterOp(res.operation, res.float1, res.float2);
         }
         if (res.value2 != null) {
            return Functions.getAfterOp(
               res.operation,
               res.float1,
               evaluate(var, res.value2)
            );
         }
      }

      if (res.value1 != null) {
         if (res.var2 != null) {
            return Functions.getAfterOp(
               res.operation,
               evaluate(var, res.value1),
               var
            );
         }
         if (res.float2 != null) {
            return Functions.getAfterOp(
               res.operation,
               evaluate(var, res.value1),
               res.float2
            );
         }
         if (res.value2 != null) {
            return Functions.getAfterOp(
               res.operation,
               evaluate(var, res.value1),
               evaluate(var, res.value2)
            );
         }
      }

      return 0;
   }

   public float evaluate(float var) {
      return evaluate(var, value);
   }
}
