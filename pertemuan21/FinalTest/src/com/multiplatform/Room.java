package com.multiplatform;

public class Room {
    private Bed myBed;
    private Table myTable;
    private Chair myChair;
    private Cupboard myCupboard;

    public Room(Bed myBed, Table myTable, Chair myChair, Cupboard myCupboard) {
        this.myBed = myBed;
        this.myTable = myTable;
        this.myChair = myChair;
        this.myCupboard = myCupboard;
    }

    public void content(){
        getMyBed().bedSize();
        getMyTable().tableSize();
        getMyChair().chairSize();
        getMyCupboard().CupboardSize();
    }

    private Bed getMyBed() {
        return myBed;
    }

    private Table getMyTable() {
        return myTable;
    }

    private Chair getMyChair() {
        return myChair;
    }

    private Cupboard getMyCupboard() {
        return myCupboard;
    }
}