
package packageFX;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.control.Alert.AlertType; 

import java.util.*;

public class GameController {

    @FXML
    private ListView adventureLog;

    @FXML
    private Label playerStrength;

    @FXML
    private Label enemyStrength;

    @FXML
    private Label playerDex;

    @FXML
    private Label enemyDex;

    @FXML
    private Label playerInt;

    @FXML
    private Label enemyInt;

    @FXML
    private Label playerHealth;

    @FXML
    private Rectangle playerHealthBarInner;

    @FXML
    private Rectangle playerHealthBarOuter;

    @FXML
    private Label enemyHealth;

    @FXML
    private Label enemyHealthDenominator;

    @FXML
    private Rectangle enemyHealthBarInner;

    @FXML
    private Rectangle enemyHealthBarOuter;

    @FXML
    private Button north;

    @FXML
    private Button east;

    @FXML
    private Button south;

    @FXML
    private Button west;

    @FXML
    private Button fight;

    @FXML
    private Button sleep;

    @FXML
    private Button search;

    @FXML
    private Label totalBucks;

    @FXML
    private Label playerName;

    @FXML
    private Label enemyName;

    private Player playerCharacter;

    //Two sets of parallel arrays mapping characters to their list of viable moves
    private List<String> playerCharacters = new ArrayList<>();
    private List<List<String>> playerCharacterMoves = new ArrayList<>();

    private List<String> enemyCharacters = new ArrayList<>();
    private List<List<String>> enemyCharacterMoves = new ArrayList<>();

    private Random rng;

    //Game State Flags
    private Enemy enemyPresent;

    private String currentWallDirection;

    private boolean currentRoomSearched;


    public void initialize() {
        this.rng = new Random();
        adventureLog.getItems().add("Adventure Log");
        initializeCharacters();

        String playerCharacters[] = {"Beast", "Duke", "Rider"};

        ChoiceDialog d = new ChoiceDialog(playerCharacters[0], playerCharacters);
        d.setHeaderText(
            "Welcome to the Adventure Game!!" + 
            " You have three options to choose from:\n" + 
            "Beast\n" + 
            "Duke\n" + 
            "Rider"
        );
        d.showAndWait();
        String animalType = d.getSelectedItem().toString();

        TextInputDialog namer = new TextInputDialog();
        namer.setHeaderText("Please enter a name");
        namer.showAndWait();
        String animalName = namer.getEditor().getText();
        
        int choice = 0;
        switch(animalType) {
            case "Beast":
                choice = 2;
                break;
            case "Duke":
                choice = 0;
                break;
            case "Rider":
            default:
                choice = 1;
                break;
        }

        this.playerCharacter = new Player(animalName, playerCharacterMoves.get(choice));
        this.playerName.setText(this.playerCharacter.getName() + " Stats:");
        this.playerHealth.setText("20");
        this.playerStrength.setText(Integer.toString(this.playerCharacter.getStrength()));
        this.playerDex.setText(Integer.toString(this.playerCharacter.getDexterity()));
        this.playerInt.setText(Integer.toString(this.playerCharacter.getIntelligence()));
        this.changeWhereWallIs();
    }

    private void changeWhereWallIs() {
        List<String> directions = Arrays.asList("north", "south", "east", "west");
        this.currentWallDirection = directions.get(rng.nextInt(directions.size()));
    }

    private void initializeCharacters() {
        final String bear = "bear";
        final List<String> bearMoves = Arrays.asList("Set on Fire", "Turbo Blaze!", "Smoke in your Eyes", "11th Degree Burn");

        final String wolf = "Wolf";
        final List<String> wolfMoves = Arrays.asList("Drown and Suffocate", "Wet Attack!", "Make Soggy", "Soaked Socks");
        
        final String cougar = "cougar";
        final List<String> cougarMoves = Arrays.asList("Poisonous Attack", "Tripping over Vines", "Thorns!", "Leaf Throw");

        playerCharacters.add(bear);
        playerCharacterMoves.add(bearMoves);

        playerCharacters.add(wolf);
        playerCharacterMoves.add(wolfMoves);

        playerCharacters.add(cougar);
        playerCharacterMoves.add(cougarMoves);


        enemyCharacters.add(bear);
        enemyCharacterMoves.add(bearMoves);

        enemyCharacters.add(wolf);
        enemyCharacterMoves.add(wolfMoves);

        enemyCharacters.add(cougar);
        enemyCharacterMoves.add(cougarMoves);

        enemyCharacters.add("Bear");
        enemyCharacterMoves.add(Arrays.asList("Crawl", "scratch", "Poison Attack"));

        enemyCharacters.add("Wolf");
        enemyCharacterMoves.add(Arrays.asList("scratch", "super howl", "bite"));

        enemyCharacters.add("Cougar");
        enemyCharacterMoves.add(Arrays.asList("scratch", "bite", "super leap"));

        enemyCharacters.add("Dragon");
        enemyCharacterMoves.add(Arrays.asList("Coupon ", "Car", "Flying", "Fire Breath"));
    }

    private void move(String direction) {
        if (this.enemyPresent != null) {
            //Can't move if in combat
            this.adventureLog.getItems().add("You can't move");
            return;
        }
        if (this.currentWallDirection == direction) {
            adventureLog.getItems().add("You went " + direction + " but there is a wall");
            return;
        } else {
            this.currentRoomSearched = false;
            adventureLog.getItems().add("You went " + direction);
        }

        boolean encounter = rng.nextInt(3) == 0;
        if (encounter) {
            this.enemyPresent = generateRandomMonster();
            setEnemyText();
            adventureLog.getItems().add("You encountered " + this.enemyPresent.getName());
        }
    }

    private void setEnemyText() {
        if (this.enemyPresent == null) {
            return;
        }

        this.enemyHealthDenominator.setText(Integer.toString(this.enemyPresent.getTotalHP()));
        this.enemyHealth.setText(Integer.toString(this.enemyPresent.getCurrentHP()));
        this.enemyStrength.setText(Integer.toString(this.enemyPresent.getStrength()));
        this.enemyDex.setText(Integer.toString(this.enemyPresent.getDexterity()));
        this.enemyInt.setText(Integer.toString(this.enemyPresent.getIntelligence()));
        this.enemyName.setText(this.enemyPresent.getName() + " Stats:");
    }

    private void clearEnemyText() {
        this.enemyHealthDenominator.setText("0");
        this.enemyHealth.setText("0");
        this.enemyStrength.setText("0");
        this.enemyDex.setText("0");
        this.enemyInt.setText("0");
        this.enemyName.setText("Looking");
    }

    private Enemy generateRandomMonster() {
        int monsterIndex = rng.nextInt(enemyCharacters.size());
        return new Enemy(enemyCharacters.get(monsterIndex), enemyCharacterMoves.get(monsterIndex));
    }

    public void goNorth() {
        move("north");
    }
    public void goSouth() {
        move("south");
    }
    public void goEast() {
        move("east");
    }
    public void goWest() {
        move("west");
    }

    public void onSearch() {
        if (this.enemyPresent != null) {
            this.adventureLog.getItems().add("In battle you may not serach");
            return;
        }
        if (this.currentRoomSearched) {
            this.adventureLog.getItems().add("You already searched this room");
            return;
        }
        this.currentRoomSearched = true;
        boolean goldFound = rng.nextInt(20) + 1 < this.playerCharacter.getIntelligence();
        if (goldFound) {
            int amtBucks = rng.nextInt(901) + 100;
            this.playerCharacter.addAnimalBucks(amtBucks);
            String Bucks = null;
            this.adventureLog.getItems().add(
                "Fighting resulted in !\n" +
                "\n" + 
                "You found " + Bucks + " "
            );
            this.totalBucks.setText(Integer.toString(this.playerCharacter.getTotalAnimalBucks()));
        } else {
            
        }
    }

    public void Sleep() {
        if (this.enemyPresent != null) {
            this.adventureLog.getItems().add("You can't sleep while fighting");
            return;
        }
        this.adventureLog.getItems().add("You tell them " + this.playerCharacter.getName() + " it's nap time! YAY!");
        boolean enemyAttacks = rng.nextInt(6) == 0;
        if (enemyAttacks) {
            this.enemyPresent = generateRandomMonster();
            setEnemyText();
            this.adventureLog.getItems().add("While asleep, " + this.enemyPresent.getName() + " began to fight");
           
            if (this.playerCharacter.isDead()) {
                this.playerCharacter.setCurrentHP(0);
                endGame();
                return;
            }
            setHealthBars();
        }  
        this.playerCharacter.setCurrentHP(this.playerCharacter.getTotalHP());
        setHealthBars();

        this.adventureLog.getItems().add("By forcing them to sleep, the wounds are gone");
    }

    public void onFight() {
        if (this.enemyPresent == null) { // Can't fight if there's nothing to fight!
            this.adventureLog.getItems().add("That is very mean...");
            return;
        }
        
        if (this.playerCharacter.isDead()) {
            this.playerHealth.setText("0");
            endGame();
        } else if (this.enemyPresent.isDead()) {
            this.enemyPresent = null;
            clearEnemyText();
        } else {
            
            if (this.playerCharacter.isDead()) {
                this.playerHealth.setText("0");
                endGame();
            } else if (this.enemyPresent.isDead()) {
                this.enemyPresent = null;
                clearEnemyText();
            }
        }
        
        setHealthBars();

        if (this.enemyPresent == null) {
            int Bucks = rng.nextInt(901) + 100;
            this.playerCharacter.addAnimalBucks(Bucks);
            this.adventureLog.getItems().add("defeated! You earned " + Bucks + " Bucks");
            this.totalBucks.setText(Integer.toString(this.playerCharacter.getTotalAnimalBucks()));
        }
    }
    public void setHealthBars() {
        this.playerHealth.setText(Integer.toString(this.playerCharacter.getCurrentHP()));
        
        int healthBarWidth = 108;
        this.playerHealthBarInner.setWidth(
            (int)Math.floor(((double)this.playerCharacter.getCurrentHP() / (double)this.playerCharacter.getTotalHP()) * healthBarWidth)
        );
        if (this.enemyPresent != null) {
            this.enemyHealth.setText(Integer.toString(this.enemyPresent.getCurrentHP()));
            this.enemyHealthBarInner.setWidth((int)
                Math.floor(((double)this.enemyPresent.getCurrentHP() / (double)this.enemyPresent.getTotalHP()) * healthBarWidth)
            );
        }
    }

    public void endGame() {
        Alert a = new Alert(
            AlertType.NONE, 
            " " + this.playerCharacter.getName() + " has died.\n" + 
            "You run out of the cave to seek help.\n" +
            "Hope all is well! \n\n" + 
            "Play again?",
            ButtonType.OK
        );

        a.showAndWait();

        System.exit(0);
    }

    public void onRun() {
        if (this.enemyPresent == null) { 
            this.adventureLog.getItems().add("Why are you running?");
            return;
        }
        boolean sawMe = rng.nextInt(20) + 1 < this.enemyPresent.getIntelligence();
        if (sawMe) {
            //Attack!
            this.adventureLog.getItems().add("They saw you trying to run, They start to fight!");
            this.enemyPresent.fight(this.playerCharacter);
            if (this.playerCharacter.isDead()) {
                endGame();
                return;
            }
            setHealthBars();
        }
        this.adventureLog.getItems().add("You escaped");
        this.enemyPresent = null;
        clearEnemyText();

    }
}