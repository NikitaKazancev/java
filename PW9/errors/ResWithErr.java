package PW9.errors;

import java.util.List;

public class ResWithErr {

   protected Exception err;

   public ResWithErr(Exception err) {
      this.err = err;
   }

   public Exception getErr() {
      return err;
   }

   public static class ToStringField<T> {

      String fieldName;
      T fieldValue;

      public ToStringField(String fieldName, T fieldValue) {
         this.fieldName = fieldName;
         this.fieldValue = fieldValue;
      }

      @Override
      public String toString() {
         return ", " + fieldName + ": " + fieldValue + "";
      }
   }

   public <T> String toString(List<ToStringField<T>> args) {
      String message =
         "{error: " + (err == null ? "null" : err.getMessage()) + "";

      for (ToStringField<T> toStringField : args) {
         message += toStringField;
      }
      message += "}";

      return message;
   }
}
