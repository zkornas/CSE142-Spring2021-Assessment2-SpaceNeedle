// Zacharia Kornas
// 04.13.2021
// CSE 142 Section AX
// TA: Paul George Druta
// Take-home Assessment #2: SpaceNeedle
//
// This program produces ascii art of the Space Needle, 
// and can be scaleable to any size >= 2

public class SpaceNeedle {
   public static final int SIZE = 2; // Used to scale the Space Needle, can be >= 2
   
   public static void main (String[] args) {
      needle();
      topPyramid();
      bottomPyramid();
      needle();
      body();
      topPyramid();
   }
   
   // Produces the "needle" above and below the head of the space needle
   public static void needle() {
      for (int i = 1; i <= SIZE; i++) {
         for (int j = 1; j <= 3 * SIZE; j++) {
            System.out.print(" ");
         }
         System.out.println("||");
      }
   }
   
   // Produces the pattern used for the
   // top half of the head of the space needle and the base of the space needle
   public static void topPyramid() {
      for (int i = 1; i <= SIZE; i++) {
         for (int j = 1; j <= -3 * i + (3 * SIZE); j++) {
            System.out.print(" ");
         }
         System.out.print("__/");
         for (int j = 1; j <= 3 * i -3; j++) {
            System.out.print(":");
         }
         System.out.print("||");
         for (int j = 1; j <= 3 * i -3; j++) {
            System.out.print(":");
         }
         System.out.println("\\__");
      }
      System.out.print("|");
      for (int i = 1; i <= 6 * SIZE; i++) {
         System.out.print("\"");
      }
      System.out.println("|");
   }
   
   // Produces the bottom half of the head of the space needle
   public static void bottomPyramid() {
      for (int i = 1; i <= SIZE; i++) {
         for (int j = 1; j <= 2 * i - 2; j++) {
            System.out.print(" ");
         }
         System.out.print("\\_/");
         for (int j = 1; j <= -2 * i + (3 * SIZE); j++) {
            System.out.print("\\/");
         }
         System.out.println("\\_/");
      }
   }
   
   // Produces the "body" of the space needle
   public static void body() {
      for (int i = 1; i <= SIZE * SIZE; i++) {
         for (int j = 1; j <= 2 * SIZE + 1; j++) {
            System.out.print(" ");
         }
         System.out.print("|");
         for (int j = 1; j <= SIZE - 2; j++) {
            System.out.print("%");
         }
         System.out.print("||");
         for (int j = 1; j <= SIZE - 2; j++) {
            System.out.print("%");
         }
         System.out.println("|");
      }    
   }
}
