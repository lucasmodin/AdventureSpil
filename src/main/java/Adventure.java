public class Adventure {
    Rooms dungeon = new Rooms("Dungeon", "Dark place where light is dim", -1, 1, 3, -1);

    private Rooms currentRoom = dungeon;

    public Adventure(){

    }



    public String look(String lookingAround){
        return currentRoom.getName() + currentRoom.getDescription();
    }
//    public Rooms getRoom(){
//        return currentRoom
//    }
}
