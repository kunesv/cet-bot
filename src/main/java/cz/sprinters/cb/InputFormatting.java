package cz.sprinters.cb;

public class InputFormatting {
    public String format(String input) {
        return input.toLowerCase()
                .replaceAll("á", "a")
                .replaceAll("č", "c")
                .replaceAll("ď", "d")
                .replaceAll("[éě]", "e")
                .replaceAll("í", "i")
                .replaceAll("ň", "n")
                .replaceAll("ó", "o")
                .replaceAll("ř", "r")
                .replaceAll("š", "s")
                .replaceAll("ť", "t")
                .replaceAll("[úů]", "u")
                .replaceAll("ý", "y")
                .replaceAll("ž", "z")
                .replaceAll("[^\\w\\d ]", "");
    }
}
