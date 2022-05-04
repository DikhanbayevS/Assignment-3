package com.company;

public class HashTable {
    private final Data[] table;

    public HashTable(int tableSize) {
        this.table = new Data[tableSize];
    }

    public void placeData(Data data) {
        int index = data.hashCode() % table.length;
