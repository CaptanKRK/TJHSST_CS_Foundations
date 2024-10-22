package Robots;

public abstract class MazeEscaper extends Athlete
   {
      public abstract void walkDownCurrentSegment();
      public abstract void turnToTheNextSegment();
   }