package parser;

public class DateOfBirth {
    private String date;
    private String time;
    private String placeOfBirth;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    @Override
    public String toString() {
        return "DateOfBirth{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                '}';
    }
}
