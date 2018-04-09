# dependency-exercise
Solve dependencies for practice.


# Instructions
## General Guidelines
- Prefer code readability and cleanliness over efficiency (both "production" and tests); Although we can also talk about performance if you like
- You're welcome to use any external lib as long as you program the dependency solver algorithm itself by yourself
- Feel free to ask questions
- Timebox: try to have a solution in 1h

## The goal
The DependenciesSolver's public interface is already created.
It should return an array of String elements sorted according to the provided dependencies.
Example: if "a" depends on "b", then "b" must precede "a" in the resulting solution.

Notes:
- For a given set of dependencies there might be several solutions
- You can assume there aren't any circular dependencies in the input data