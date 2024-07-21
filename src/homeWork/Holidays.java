package homeWork;

public enum Holidays {
    FEBRUARY_23("23.02"),
    MARCH_8 ("08.03"),
    NEW_YEAR("01.01");

    //    private SimpleDateFormat sdf = new SimpleDateFormat("dd.MM");
    private String date;

    Holidays(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }


}
