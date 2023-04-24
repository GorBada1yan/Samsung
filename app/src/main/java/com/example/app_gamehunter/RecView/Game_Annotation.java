package com.example.app_gamehunter.RecView;

public class Game_Annotation {
    private String Game_Name, Game_Description, Game_Price;
    private  int Game_id;


    public Game_Annotation (String game_Name, String game_Description, String game_Price, int game_id){
        this.Game_Name = game_Name;
        this.Game_Description = game_Description;
        this.Game_id = game_id;
        this.Game_Price= game_Price;

    }

    public String getGame_Name() {
        return Game_Name;
    }

    public void setGame_Name(String game_Name) {
        Game_Name = game_Name;
    }

    public String getGame_Description() {
        return Game_Description;
    }

    public void setGame_Description(String game_Description) {
        Game_Description = game_Description;
    }

    public int getGame_id() {
        return Game_id;
    }

    public void setGame_id(int game_id) {
        Game_id = game_id;
    }

    public String getGame_Price() {
        return Game_Price;
    }

    public void setGame_Tag(String game_Tag) {
        Game_Price = game_Tag;
    }
}
