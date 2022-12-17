import java.util.ArrayList;
import java.util.Scanner;

public class Ladder {

  // Panels are the physical glass or tempered glass sheets
  public int panels;
  // ladder is the ladder structure (2d array)
  public int[][] ladder;
  // round counter
  public int round = 1;
  // array list for user selections
  public ArrayList<Integer> selections = new ArrayList<>();

  // make a ladder object with no parameter (default 5 panels)
  public Ladder() {
      this.panels = 5;
      this.ladder = createLadder();
  }

  // make a ladder object with a panel parameter and assign the panels to that int
  public Ladder(int panels) {
      this.panels = panels;
      this.ladder = createLadder();
  }

  // int method to get selection from user
  public int getSelection() {
      Scanner scanner = new Scanner(System.in);
      int convertedSelection;

      System.out.print("Enter L or R: ");
      String selection = scanner.nextLine();

      if (selection.equalsIgnoreCase("L")) {
          convertedSelection = 0;
          System.out.println("You selected L");
          return convertedSelection;
      } else if (selection.equalsIgnoreCase("R")) {
          convertedSelection = 1;
          System.out.println("You selected R");
          return convertedSelection;
      } else {
          System.out.println("Selection is invalid.");
          return -1;
      }
  }

  // method to create ladder
  public int[][] createLadder() {
      int[][] ladder = new int[panels][2];

      for (int i = 0; i < ladder.length; i++) {
          for (int j = 0; j < ladder[i].length; j++) {
              ladder[i][j] = (int)(2 * Math.random());
          }

          if (ladder[i][0] == ladder[i][1]) {
              if (ladder[i][0] == 0) {
                  ladder[i][0] = 1;
              } else {
                  ladder[i][0] = 0;
              }
          }
      }

      return ladder;
  }

  // method to calculate panel and check user selections
  public boolean calcPanel(int[][] ladder, ArrayList<Integer> selections) {
    int size = selections.size();
    System.out.println("Round " + round + ": ");
    int[] temp = new int[2];
    for (int i = 0; i < ladder[0].length; i++) {
        temp[i] = ladder[size][i];
    }
    int currentSelection = getSelection();
    selections.add(currentSelection);
    int choice = selections.get(selections.size() - 1);
    if (temp[choice] == 1) {
        System.out.println("Answer is correct!");
        round++;
        return true;
    } else {
        selections.remove(selections.size() - 1);
        round++;
        System.out.println("You lose 1 life.");
        return false;
    } 
  }
    public void printLadder() {
        try {
            System.out.println("|||||| ---- Start");
            for (int i = 0; i < ladder.length; i++) {
                for (int j = 0; j < ladder[i].length; j++) {
                    System.out.print("|"+ladder[i][j] + "|");
                }
                System.out.println();
            }
            System.out.println("|||||| ---- Finish");
        } catch (Exception e) {
            System.out.println("ERROR LADDER IS NOT CREATED OR IS NULL...");
        }
    }
    
    public void printCurrentLadder() {
        System.out.println("|||||| ---- Start");
        for (int i = 0; i < selections.size(); i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                System.out.print("|"+ladder[i][j] + "|");
            }
            System.out.println();
        }
        for (int i = selections.size(); i < ladder.length; i++) {
            System.out.println("|?||?|");
        }
        System.out.println("|||||| ---- Finish");
    }
    

}
