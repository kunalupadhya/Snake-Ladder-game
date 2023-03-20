package com.example.snakes_and_ladder;

import javafx.util.Pair;

import java.util.ArrayList;

public class Board {
   private ArrayList<Pair<Integer,Integer>> positionCoordinates;
   private ArrayList<Integer>Snakeandladder;

   public Board(){
       populatePositionCoordinates();
       setSnakeandladder();
   }
   private void populatePositionCoordinates(){
       positionCoordinates= new ArrayList<>();
       positionCoordinates.add(new Pair<>(0,0));
       for(int i = 0; i< SnakeLadder.height; i++){
           for(int j = 0; j< SnakeLadder.width; j++){
               //x-axis
               int xCord=0;
               if(i%2==0){
                   xCord=j*SnakeLadder.tileSize+SnakeLadder.tileSize/2;
               }
               else{
                   xCord=SnakeLadder.height*SnakeLadder.tileSize-j*SnakeLadder.tileSize-SnakeLadder.tileSize/2;
               }
               //y-axis
               int yCord=SnakeLadder.height*SnakeLadder.tileSize-i*SnakeLadder.tileSize-SnakeLadder.tileSize/2;
               positionCoordinates.add(new Pair<>(xCord,yCord));

           }
       }
   }

   private void setSnakeandladder(){
       Snakeandladder=new ArrayList<>();
       for(int i=0;i<101;i++){
           Snakeandladder.add(i);
       }
       Snakeandladder.set(4,25);
       Snakeandladder.set(13,46);
       Snakeandladder.set(27,5);
       Snakeandladder.set(33,49);
       Snakeandladder.set(40,3);
       Snakeandladder.set(42,63);
       Snakeandladder.set(43,18);
       Snakeandladder.set(50,69);
       Snakeandladder.set(54,31);
       Snakeandladder.set(62,81);
       Snakeandladder.set(66,45);
       Snakeandladder.set(74,92);
       Snakeandladder.set(76,58);
       Snakeandladder.set(89,53);
       Snakeandladder.set(99,41);
   }

   public int getXCoordinates(int position) {
       if (position > 0 && position <= 100) {
           return positionCoordinates.get(position).getKey();
       }
       return -1;
   }

    public int getYCoordinates(int position) {
        if (position > 0 && position <= 100) {
            return positionCoordinates.get(position).getValue();
        }
        return -1;
    }

    public int getSnakeandladder(int position){
        return Snakeandladder.get(position);
    }


    public static void main(String[] args) {
        Board board=new Board();
for(int i=0;i<board.positionCoordinates.size();i++){
    System.out.println(i+" $ X : "+board.positionCoordinates.get(i).getKey()+" Y : "+board.positionCoordinates.get(i).getValue());
}
    }

}
