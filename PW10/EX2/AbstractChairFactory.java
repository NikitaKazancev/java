package PW10.EX2;

public interface AbstractChairFactory {
   VictorianChair createVictorianChair();
   MagicChair createMagicChair();
   FunctionalChair createFunctionalChair();
}
