package bowling;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//  Rules of TDD: (Transforms that change behavior w/o changing structure)
//  1.  You are not allowed to write production code unless it 
//      is to make a failing test pass
//  2.  You are not allowed to write any more of a unit test 
//      than is sufficient to fail...compile errors count as failing.
//  3.  You are not allowed to write any more code than 
//      required to make the test pass

//  Rules of Refactoring (Refactors change structure w/o changing behavior)
//  1.  You are not allowed to refactor unless all of your tests are green (or disabled/skipped)
//  2.  You are not allowed to change any behavior
//  3.  Run your tests on EVERY code change

class GameTest {
    @Test void testSomeLibraryMethod() {
        Game game = new Game();
        assertTrue(game.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
}
