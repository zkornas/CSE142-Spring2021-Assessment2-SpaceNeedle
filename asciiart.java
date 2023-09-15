// Zacharia Kornas
// 04.13.2021
// CSE 142 Section AX
// TA: Paul George Druta
// Take-home Assessment #2: AsciiArt
//
// This program produces ascii art of a tree

public class AsciiArt {
   public static void main (String[] args) {
      topTree();
      bottomTree();
      trunk();
      treeBranch();
      trunk();
      trunk();
      grass();
   }
   
   // Produces the top part of the head of tree
   public static void topTree() {
      for (int i = 1; i <= 6; i++) {
         for (int j = 1; j <= -3 * i + 18; j++) {
            System.out.print(" ");
         }
         for (int j = 1;  j <= 3; j++) {
            System.out.print("A");
         }
         for (int j = 1; j <= 6 * i + -6; j++) {
            System.out.print("V");
         }
         for (int j = 1; j <= 3; j++) {
            System.out.print("A");
         }
         System.out.println();
      }
      
   }
   
   // Produces the bottom part of the head of tree
   public static void bottomTree() {
      for (int i = 1; i <= 6; i++) {
         for (int j = 1; j <= 3 * i - 3; j++) {
            System.out.print(" ");
         }
         for (int j = 1; j <= 3; j++) {
            System.out.print("A");
         }
         for (int j = 1; j <= -6 * i + 36; j++) {
            System.out.print("V");
         }
         for (int j = 1; j <= 3; j++) {
            System.out.print("A");
         }
         System.out.println();
      }
   }
   
   // Produces a segment of the tree trunk
   public static void trunk(){
      for (int i = 1; i <= 3; i++) {
         for (int j = 1; j <= 16; j++) {
            System.out.print(" ");
         }
         for (int j = 1; j <= 4; j++) {
            System.out.print("|");
         }
         System.out.println();
      }
   }
   
   // Produces a segment of the tree trunk with a branch
   public static void treeBranch() {
      for (int i = 1; i <= 16; i++) {
         System.out.print(" ");
      }
      for (int i = 1; i <= 4; i++) {
         System.out.print("|");
      }
      for (int i = 1; i <= 3; i++) {
         System.out.print("_");
      }
      for (int i = 1; i <= 3; i++) {
         System.out.print("-");
      }
      for (int i = 1; i <= 3; i++) {
         System.out.print(">");
      }
      System.out.println();  
   }
   
   // Produces grass at the base of tree
   public static void grass() {
      for (int i = 1; i <= 36; i++) {
         System.out.print("^");
      }
      System.out.println();
   }
}
