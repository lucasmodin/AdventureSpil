public class Adventure {
    Rooms room1;
    Rooms room2;
    Rooms room3;
    Rooms room4;
    Rooms room5;
    Rooms room6;
    Rooms room7;
    Rooms room8;

    private Rooms currentRoom;

    //Constructor is set to room1 for the starting point
    public Adventure(){
        room1 = new Rooms("\"Dungeon\": " , "Dark place where light is dim");
        room2 = new Rooms("\"Dungeon\": " , "Dark place where light is dim");
        room3 = new Rooms("\"Dungeon\": " , "Dark place where light is dim");
        room4 = new Rooms("\"Dungeon\": " , "Dark place where light is dim");
        room5 = new Rooms("\"Dungeon\": " , "Dark place where light is dim");
        room6 = new Rooms("\"Dungeon\": " , "Dark place where light is dim");
        room7 = new Rooms("\"Dungeon\": " , "Dark place where light is dim");
        room8 = new Rooms("\"Dungeon\": " , "Dark place where light is dim");

        currentRoom = room1;
    }



    public String look(){
        return currentRoom.getName() + currentRoom.getDescription();
    }
//    public Rooms getRoom(){
//        return currentRoom
//    }

    public void goNorth(){

    }

    public void goSouth(){

    }

    public void goWest(){

    }

    public void goEast(){

    }
}
