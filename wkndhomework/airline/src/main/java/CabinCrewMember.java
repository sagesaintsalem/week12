public class CabinCrewMember {

    final private String name;
    final private CrewRank rank;

    public CabinCrewMember(String name, CrewRank rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return this.name;
    }

    public CrewRank getRank() {
        return this.rank;
    }

    public String speak(){
        return "Quack";
    }
}
