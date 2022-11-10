import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class arrangestring {
   public static void main(String[] var0) {
      Collator var1 = Collator.getInstance(new Locale("fr", "FR"));
      String var2 = "cybercrime";
      String[] var3 = var2.split("");
      Arrays.sort(var3, var1);
      String var4 = "";

      for(int var5 = 0; var5 < var3.length; ++var5) {
         var4 = var4 + var3[var5];
      }

      System.out.println(var4);
   }
}