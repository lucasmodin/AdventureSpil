public class Adventure {
    Rooms room1;
    Rooms room2;
    Rooms room3;
    Rooms room4;
    Rooms room5;
    Rooms room6;
    Rooms room7;
    Rooms room8;
    Rooms room9;

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
        room9 = new Rooms("\"Dungeon\": " , "Dark place where light is dim");

        room1.setW(room2);
        room1.setS(room4);

        room2.setE(room3);
        room2.setW(room1);

        room3.setS(room6);
        room3.setW(room2);

        room4.setN(room1);
        room4.setS(room7);

        room5.setS(room8);

        room6.setS(room9);
        room6.setN(room3);

        room7.setN(room4);
        room7.setE(room8);

        room8.setN(room5);
        room8.setE(room9);
        room8.setW(room7);

        room9.setN(room6);
        room9.setW(room8);

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
