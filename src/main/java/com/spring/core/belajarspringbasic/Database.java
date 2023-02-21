package com.spring.core.belajarspringbasic;

/**
 * @author Novin on 21/02/2023
 * @project Belajar-Spring-Basic
 */
public class Database {

    private static Database database;

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    private Database() {

    }
}
