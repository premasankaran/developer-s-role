class spallindrome {
   public static void main(String[] var0) {
      String var1 = "racecar";
      String var2 = "";
      int var3 = var1.length();

      for(int var4 = var3 - 1; var4 >= 0; --var4) {
         var2 = var2 + var1.charAt(var4);
      }

      if (var1.toLowerCase().equals(var2.toLowerCase())) {
         System.out.println(var1 + " is a Palindrome String.");
      } else {
         System.out.println(var1 + " is not a Palindrome String.");
      }

   }
}