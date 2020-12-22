<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.ListView?>
<?import javafx.scene.control.Separator?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.paint.LinearGradient?>
<?import javafx.scene.paint.Stop?>
<?import javafx.scene.shape.Rectangle?>

<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="800.0" xmlns="http://javafx.com/javafx/11.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="finalproject.GameController">
   <children>
      <ListView id="adventureLog" fx:id="adventureLog" layoutX="127.0" layoutY="36.0" prefHeight="328.0" prefWidth="523.0" />
      <Label fx:id="playerName" layoutX="14.0" layoutY="36.0" text="Your Animal Stats:" />
      <Label fx:id="enemyName" layoutX="671.0" layoutY="21.0" prefHeight="43.0" prefWidth="117.0" text="Violent Fighting Animal Stats:" wrapText="true" />
      <Label layoutX="14.0" layoutY="75.0" text="Strength" />
      <Label layoutX="671.0" layoutY="73.0" text="Strength" />
      <Label layoutX="14.0" layoutY="113.0" text="Dexterity" />
      <Label layoutX="670.0" layoutY="111.0" text="Dexterity" />
      <Label layoutX="14.0" layoutY="158.0" text="Intelligence" />
      <Label layoutX="671.0" layoutY="156.0" text="Intelligence" />
      <Label fx:id="playerStrength" layoutX="110.0" layoutY="75.0" text="0" textFill="#e82626" />
      <Label fx:id="enemyStrength" layoutX="757.0" layoutY="73.0" text="0" textFill="#e82626" />
      <Label fx:id="playerDex" layoutX="110.0" layoutY="113.0" text="0" textFill="#188616" />
      <Label fx:id="enemyDex" layoutX="757.0" layoutY="111.0" text="0" textFill="#188616" />
      <Label fx:id="playerInt" layoutX="110.0" layoutY="158.0" text="0" textFill="#7452e4" />
      <Label fx:id="enemyInt" layoutX="757.0" layoutY="156.0" text="0" textFill="#7452e4" />
      <Separator layoutX="5.0" layoutY="103.0" prefHeight="1.0" prefWidth="117.0" />
      <Separator layoutX="5.0" layoutY="148.0" prefHeight="1.0" prefWidth="117.0" />
      <Separator layoutX="5.0" layoutY="187.0" prefHeight="3.0" prefWidth="117.0" />
      <Separator layoutX="671.0" layoutY="101.0" prefHeight="3.0" prefWidth="107.0" />
      <Separator layoutX="671.0" layoutY="145.0" prefHeight="3.0" prefWidth="107.0" />
      <Separator layoutX="671.0" layoutY="187.0" prefHeight="3.0" prefWidth="107.0" />
      <Rectangle fx:id="playerHealthBarInner" arcHeight="5.0" arcWidth="5.0" height="28.0" layoutX="9.0" layoutY="222.0" stroke="BLACK" strokeType="INSIDE" strokeWidth="0.0" width="108.0">
         <fill>
            <LinearGradient endX="1.0" endY="1.0">
               <stops>
                  <Stop color="#e42a2a" />
                  <Stop color="#f88888" offset="1.0" />
               </stops>
            </LinearGradient>
         </fill>
      </Rectangle>
      <Rectangle fx:id="playerHealthBarOuter" arcHeight="5.0" arcWidth="5.0" fill="#1f93ff00" height="28.0" layoutX="9.0" layoutY="222.0" stroke="BLACK" strokeType="INSIDE" width="108.0" />
      <Rectangle fx:id="enemyHealthBarInner" arcHeight="5.0" arcWidth="5.0" height="28.0" layoutX="671.0" layoutY="220.0" stroke="BLACK" strokeType="INSIDE" strokeWidth="0.0" width="108.0">
         <fill>
            <LinearGradient endX="1.0" endY="1.0">
               <stops>
                  <Stop color="#e42a2a" />
                  <Stop color="#f88888" offset="1.0" />
               </stops>
            </LinearGradient>
         </fill>
      </Rectangle>
      <Rectangle fx:id="enemyHealthBarOuter" arcHeight="5.0" arcWidth="5.0" fill="#1f93ff00" height="28.0" layoutX="671.0" layoutY="220.0" stroke="BLACK" strokeType="INSIDE" width="108.0" />
      <Label layoutX="14.0" layoutY="200.0" text="HP:" />
      <Label fx:id="playerHealth" layoutX="73.0" layoutY="200.0" text="0" textAlignment="RIGHT" />
      <Label layoutX="99.0" layoutY="200.0" text="/ 20" textAlignment="RIGHT" />
      <Label layoutX="670.0" layoutY="198.0" text="HP:" />
      <Label fx:id="enemyHealth" layoutX="744.0" layoutY="198.0" text="0" textAlignment="RIGHT" />
      <Label fx:id="enemyHealthDenominator" layoutX="770.0" layoutY="198.0" prefHeight="17.0" prefWidth="8.0" text="0" />
      <Label layoutX="763.0" layoutY="198.0" text="/" />
      <Button fx:id="north" layoutX="34.0" layoutY="291.0" mnemonicParsing="false" onAction="#goNorth" text="North" />
      <Button fx:id="west" layoutX="10.0" layoutY="318.0" mnemonicParsing="false" onAction="#goWest" text="West" />
      <Button fx:id="east" layoutX="60.0" layoutY="318.0" mnemonicParsing="false" onAction="#goEast" prefHeight="27.0" prefWidth="48.0" text="East" />
      <Button fx:id="south" layoutX="33.0" layoutY="345.0" mnemonicParsing="false" onAction="#goSouth" text="South" />
      <Button fx:id="fight" layoutX="690.0" layoutY="263.0" mnemonicParsing="false" onAction="#onFight" prefHeight="27.0" prefWidth="58.0" text="Fight" />
      <Button fx:id="sleep" layoutX="690.0" layoutY="316.0" mnemonicParsing="false" onAction="#onSleep" prefHeight="27.0" prefWidth="58.0" text="Sleep" />
      <Button fx:id="search" layoutX="690.0" layoutY="343.0" mnemonicParsing="false" onAction="#onSearch" prefHeight="27.0" prefWidth="59.0" text="Search" />
      <Label layoutX="138.0" layoutY="372.0" text="AnimalBucks:" />
      <Label fx:id="totalAnimalBucks" layoutX="250.0" layoutY="372.0" text="0" textFill="#a1981a" />
      <Button fx:id="run" layoutX="689.0" layoutY="289.0" mnemonicParsing="false" onAction="#onRun" prefHeight="27.0" prefWidth="59.0" text="Run" />
   </children>
</AnchorPane>