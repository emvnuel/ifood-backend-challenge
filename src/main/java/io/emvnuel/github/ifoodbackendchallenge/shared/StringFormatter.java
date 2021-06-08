package io.emvnuel.github.ifoodbackendchallenge.shared;

import java.util.List;

public class StringFormatter {

    public static String format(List<String> strings) {
        String formatted = "";

        for (String string : strings) {
            if (strings.indexOf(string) == strings.size() - 1)
                formatted += string;
            else if (strings.indexOf(string) == strings.size() - 2)
                formatted += string+" and ";
            else
                formatted += string+", ";
        }

        return formatted;
    }
}
