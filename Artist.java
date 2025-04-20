public class Artist {

    private String name;
    private int birthYear;
    private int deathYear;

    public Artist() {
        name = "unknown";
        birthYear = -1;
        deathYear = -1;
    }

    public Artist(String artistName, int birthYear, int deathYear) {
        this.name = artistName;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    public void printInfo() {

        if (deathYear == -1 && birthYear != -1) {
            System.out.println("Artist: " + name + " (" + birthYear + " to present)");
        }
        if (deathYear != -1 && birthYear != -1) {
            System.out.println("Artist: " + name + " (" + birthYear + " to " + deathYear + ")");
        }
        if (deathYear == -1 && birthYear == -1) {
            System.out.println("Artist: " + name + " (unknown)");
        }
    }
}
