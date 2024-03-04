public class Adventure {
    Rooms room1 = new Rooms("\"Dungeon\": " , "Dark place where light is dim", -1, 1, 3, -1);
    Rooms room2 = new Rooms("\"Dungeon\": " , "Dark place where light is dim", -1, 1, -1, 0);
    Rooms room3 = new Rooms("\"Dungeon\": " , "Dark place where light is dim", -1, -1, 5, 1);
    Rooms room4 = new Rooms("\"Dungeon\": " , "Dark place where light is dim", 0, -1, 6, -1);
    Rooms room5 = new Rooms("\"Dungeon\": " , "Dark place where light is dim", -1, -1, 7, -1);
    Rooms room6 = new Rooms("\"Dungeon\": " , "Dark place where light is dim", 2, -1, 8, -1);
    Rooms room7 = new Rooms("\"Dungeon\": " , "Dark place where light is dim", 3, 7, -1, -1);
    Rooms room8 = new Rooms("\"Dungeon\": " , "Dark place where light is dim", 4, 8, -1, 6);

    private Rooms currentRoom;

    public Adventure(){
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
