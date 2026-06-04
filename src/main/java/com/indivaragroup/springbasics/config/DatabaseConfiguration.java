package com.indivaragroup.springbasics.config;

public class DatabaseConfiguration {
  private static DatabaseConfiguration databaseConfiguration;

  private DatabaseConfiguration(){
    // code would be implemented here
  }

  public static DatabaseConfiguration getInstance(){
    if (databaseConfiguration == null) {
      databaseConfiguration = new DatabaseConfiguration();
    }
    return databaseConfiguration;
  }
}
