package session1_intro;

public class StringExample
{
  public static void main(String[] args)
  {
    String multiline = "Bla bla \nBla bla\nbla bla";
    System.out.println(multiline);

    String quote = "She said, \"Hello!\"";
    String singleQuote = "It's a sunny day.";
    String backslash = "This is a backslash: \\";
    String newLine = "This is the first line.\nThis is the second line.";
    String tabbed = "This is a tab:\tTabbed text.";
    System.out.println(quote + '\n'
        + singleQuote + '\n'
        + backslash + '\n'
        + newLine + '\n'
        + tabbed);

  }
}
