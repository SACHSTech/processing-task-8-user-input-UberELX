import processing.core.PApplet;

public class Sketch extends PApplet {
  
  public void settings() {
    size(400, 400);
  }

  public void setup(){
    background(32);
  }

  public void draw() {
      if (mousePressed) {
        fill(255);
        ellipse(mouseX, mouseY, 25, 25);
        //draws circle if mouse is pressed
   }
  }
 
  void draw2() {
    if (keyPressed) {

      if (key == 'm') {
        background(120, 0, 0);
      }
      else if (key == 'g') {
        background(0, 140, 0);
      }
      else if (key == 'k') {
        background(0, 0, 160);
      }
    }
    else {
      background(32);
      //changes background color if either m, g, or k is pressed
    }
  }

  void draw3(){
    textSize(120);
    text(key, 110, 180);
    //enters key you pressed onto screen
  }


  
}

  
  