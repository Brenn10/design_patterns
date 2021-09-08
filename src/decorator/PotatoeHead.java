package decorator;

import java.util.Arrays;

/**
 * A potato head.
 * @author Brennan Cain (Brenn10)
 */
public class PotatoeHead extends Character{

    /**
     * Creates a potato head by initializing the sections.
     */
    public PotatoeHead() {
        String[] basicSections = { "    ____",
                                    "   /    \\",
                                    "  /      \\ ",
                                    " |        | ",
                                    " |        | ",
                                    "  \\      / ",
                                    "   \\____/ "};
        sections.addAll(Arrays.asList(basicSections));
    }
}
