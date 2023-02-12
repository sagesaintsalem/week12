public class Pilot {

    private String name;
    private CrewRank rank;
    private String licenseNumber;

    public Pilot(String name, CrewRank rank, String licenseNumber){
        this.name = name;
        this.rank = rank;
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return this.name;
    }

    public CrewRank getRank() {
        return this.rank;
    }

    public String getLicense() {
        return this.licenseNumber;
    }

    public String fly() {
        return "it fly";
    }
}
