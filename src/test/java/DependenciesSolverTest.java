import com.dependency.exercise.DependenciesSolver;
import com.dependency.exercise.Dependency;
import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class DependenciesSolverTest {
    private DependenciesSolver solver = new DependenciesSolver();

    @Test
    public void shouldSanity() {
        assertNotNull(solver);
    }

    @Test
    public void shouldReturnArrayContainingAllProvidedElements() {
        final Dependency[] dependencies = {
                new Dependency("a", "b"),
                new Dependency("b", "c"),
        };

        final String[] expected = {"a", "b", "c"};

        assertArrayEquals(expected, solver.solve(dependencies));
    }
}
