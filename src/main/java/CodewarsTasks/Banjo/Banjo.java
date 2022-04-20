package CodewarsTasks.Banjo;
/*Codewars Aufgabe: Are You Playing Banjo?
* Create a function which answers the question "Are you playing banjo?".
* If your name starts with the letter "R" or lower case "r", you are playing banjo!
* The function takes a name as its only argument, and returns one of the following strings:
* name + "plays banjo"
* name + "does not play banjo"
*/


public class Banjo {
    public static String areYouPlayingBanjo(String name){
          String firstLetter = String.valueOf(name.charAt(0));
          if (firstLetter.equalsIgnoreCase("R")){
              return name + " plays banjo";
          }
          else{
            return name + " does not play banjo";
        }
//        if (name.toUpperCase().startsWith("R")){
//            return name + " plays banjo";
//        }
//        else{
//            return name + " does not play banjo";
//        }
    }
}
