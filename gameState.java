package missionControl;
import java.util.ArrayList;
public class gameState {
	bombConfig b;
	edgework e;
	/*Souvenir*/String[] s={"Wire Sequence","Simon Says","Memory","Maze","The Button","Switches","Two Bits","Simon States","Listening","Orientation Cube","Morsematics","Adventure Game","Mystic Square","Chess","Mouse In The Maze","3D Maze","Silly Slots","Probing","Skewed Slots","Perspective Pegs","Microcontroller","Murder","The Gamepad","Tic Tac Toe","Monsplode, Fight!","Shape Shift","The Bulb","Sea Shells","Hexamaze","Bitmaps","Colored Squares","Third Base","Souvenir","Broken Buttons","Simon Screams","Text Field","Double-Oh","Cheap Checkout","Coordinates","Rhythms","Only Connect","Neutralization","Chord Qualities","Creation","LED Encryption","Fast Math","Minesweeper","Binary LEDs","Ice Cream","Yahtzee","Color Morse","Gridlock","Big Circle","Morse-A-Maze","Colored Switches","Monsplode Trading Cards","Nonogram","Symbol Cycle","Hunting","Braille","Mafia","Flags","Timezone","Polyhedral Maze","Symbolic Coordinates","Sonic the Hedgehog","Poetry","Button Sequence","Algebra","Visual Impairment","Identity Parade","Blind Maze","Modern Cipher","The iPhone","Human Resources","Skyrim","Burglar Alarm","LEGOs","Pie","The Wire","The London Underground","Logic Gates","Color Decoding","The Moon","The Cube","Dr. Doctor","The Jewel Vault","Logical Buttons","The Code","Tap Code","Simon Sings","Simon Sends","Synonyms","Simon Shrieks","Lasers","Turtle Robot","Calendar","USA Maze","Simon�s Star","Morse War","Maze Scrambler","Double Color","Maritime Flags","Pattern Cube","Splitting The Loot","Simon Samples","Uncolored Squares","Flashing Lights","3D Tunnels","The Switch","Reverse Morse","Horrible Memory","Boggle","Quintuples","The Sphere","Coffeebucks","Snooker","Accumulation","Encrypted Morse","Blockbusters","Retirement","Schlag den Bomb","Mahjong","Kudosudoku","Challenge & Contact","Functions","Ten-Button Color Code","Crackbox","Factory Maze","Hogwarts","Simon Speaks","Discolored Squares","Varicolored Squares","Free Parking","Zoni","Shapes And Bombs","Decolored Squares","LED Math","Simon Scrambles","Unfair Cipher","Melody Sequencer","Passport Control","The Hexabutton","Module Maze","Elder Futhark","Tasha Squeals","Mega Man 2","Wavetapping","The Hypercube","Colored Keys","Planets","The Necronomicon","The Giant�s Drink","Hidden Colors","Vexillology","Brush Strokes","Odd One Out","Mazematics","Equations X","Maze�","Gryphons","Arithmelogic","Simon Stops","Morse Buttons","Simon Stores","Bamboozling Button","Transmitted Morse","Red Arrows","Green Arrows","Yellow Arrows","Ordered Keys","Blue Arrows","Orange Arrows","Purple Arrows","The Ultracube","The Deck of Many Things","Simon Simons","Bamboozled Again","Vectors","Caesar Cycle","Affine Cycle","Pigpen Cycle","Playfair Cycle","Jumble Cycle","Ultimate Cycle","Hill Cycle","Bob Barks","Simon Selects","Cryptic Cycle","Unown Cipher","The Rule","RGB Maze","Faulty RGB Maze","Chinese Counting","N&Ms","Thinking Wires","Hereditary Base Notation","Not Who�s on First","Not Simaze","Not Morse Code","Not Maze","Not Keypad","Not the Button","Sorting","Role Reversal","Placeholder Talk","Shell Game","Forget The Colors","Etterna","Mystery Module","Palindromes"};
	public gameState(String s){e=new edgework(s);System.out.println("Enter boss module names separated by commas");}
	public void bossModules(String s) {String[]r=s.split(",");for(int i=0;i<r.length;i++);}/*incomplete*/
}