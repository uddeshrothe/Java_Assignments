package fourth;

class Lambda5
{
   private static StringBuilder charBuffer = new StringBuilder();
     
   public static String processWords(String input)
   {
        
        String s[] = input.split("(\\s)+");
         
        for(String values : s)
        {
            charBuffer.append(values.charAt(0));
        }
         
      return charBuffer.toString();
   }
    
   // main function
   public static void main (String[] args)
   {
      String input = "Let's make this world a better place";
      System.out.println(processWords(input));
   }
}