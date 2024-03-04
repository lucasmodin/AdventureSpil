public class Rooms {

    //Declaring the room attributes
    private String name;
    private String description;
    private int n;
    private int e;
    private int s;
    private int w;


    //Setting up the constructor for the rooms
    public Rooms(String name, String description,int n, int e, int s, int w){
        this.name = name;
        this.description = description;

        this.n = n;
        this.e = e;
        this.s = s;
        this.w = w;
    }

    //Getter and setter methods
    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public int getN() {
        return n;
    }

    public int getE(){
        return e;
    }

    public int getS(){
        return s;
    }

    public int getW(){
        return w;
    }

    public void setN(int n){
        this.n = n;
    }

    public void setE(int e){
        this.e = e;
    }

    public void setS(int s){
        this.s = s;
    }

    public void setW(int w) {
        this.w = w;
    }



}
