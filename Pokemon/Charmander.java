public class Charmander extends Pokemon {

    public Charmander() {
	
	// Pokemon( int index, String name, int lvl, Move move1, Move move2, Move move3, Move move4 )
	//  Move( String name, int pp, int dmg, int accuracy, int category, int stat, int boost )
	super( 4, "Charmander", 5, new Move( "Scratch", 35, 40, 100, 0, 0, 0 ), new Move( "Growl", 40, 0, 100, 0, 2, 5 ), null, null );
	
    }

}
