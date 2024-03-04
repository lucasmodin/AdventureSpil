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
        room1 = new Rooms("\"Dungeon\": " ,
                "Dark place where light is dim", setEast.room2, setSouth.room4);
        room2 = new Rooms("\"Dungeon\": " ,
                "Dark place where light is dim",  setEast.room3, setWest.room1);
        room3 = new Rooms("\"Dungeon\": " ,
                "Dark place where light is dim", setSouth.room6, setWest.room2);
        room4 = new Rooms("\"Dungeon\": " ,
                "Dark place where light is dim", setNorth.room1, setSouth.Room7);
        room5 = new Rooms("\"Dungeon\": " ,
                "Dark place where light is dim", setSouth.room8);
        room6 = new Rooms("\"Dungeon\": " ,
                "Dark place where light is dim", setNorth.room3, setSouth.room9);
        room7 = new Rooms("\"Dungeon\": " ,
                "Dark place where light is dim", setNorth.Room4, setEast.room8);
        room8 = new Rooms("\"Dungeon\": " ,
                "Dark place where light is dim", setNorth.room5, setEast.room9, setWest.room7);

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
