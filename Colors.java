public class Colors {
    private String ANSI_BLACK = "\u001B[30m";
    private String ANSI_RED = "\u001B[31m";
    private String ANSI_GREEN = "\u001B[32m";
    private String ANSI_YELLOW = "\u001B[33m";
    private String ANSI_BLUE = "\u001B[34m";
    private String ANSI_PURPLE = "\u001B[35m";
    private String ANSI_CYAN = "\u001B[36m";
    private String ANSI_WHITE = "\u001B[37m";

    void printBlue(String text){
        System.out.print(ANSI_BLUE + text);
    }
    void printRed(String text ){
        System.out.print(ANSI_RED + text);
    }
    void printYellow(String text ){
        System.out.print(ANSI_YELLOW + text);
    }
    void printGreen(String text ){
        System.out.print(ANSI_GREEN + text);
    }
    void printPurple(String text ) {
        System.out.print(ANSI_PURPLE + text);
    }
    void printCyan(String text ) {
        System.out.print(ANSI_CYAN + text);
    }
    void printWhite(String text ) {
        System.out.print(ANSI_WHITE + text);
    }
    void printBlack(String text ) {
        System.out.print(ANSI_BLACK + text);
    }
}
