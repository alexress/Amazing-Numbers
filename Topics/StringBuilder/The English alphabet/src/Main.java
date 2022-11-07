class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        StringBuilder builder = new StringBuilder();
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            builder.append(letter+" ");
        }
        builder.deleteCharAt(builder.length()-1);
        return builder;
    }
}