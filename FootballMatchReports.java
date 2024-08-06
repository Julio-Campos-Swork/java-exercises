public class FootballMatchReports {
    public static String onField(int shirtNum) {
        switch (shirtNum) {
            case 1:
                return "goalie";
            case 2:
                return "left back";
            case 3:
                return "center back";
            case 4:
                return "center back";
            case 5:
                return "right back";
            case 6:
                return "midfielder";
            case 7:
                return "midfielder";
            case 8:
                return "midfielder";
            case 9:
                return "left wing";
            case 10:
                return "striker";
            case 11:
                return "right wing";
            default:
             throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        System.out.println(FootballMatchReports.onField(10));
        System.out.println(FootballMatchReports.onField(13));
    }
}
