class Slider {

  float x,
        y, 
        breedte,
        hoogte,
        pos;

  int npos,
      blokjeBreedte;


  Slider(float sliderX, float sliderY, float sliderBreedte, float sliderHoogte, int aantalPosities, int startPos) {

    this.x = sliderX;
    this.y = sliderY;
    this.breedte = sliderBreedte;
    this.hoogte = sliderHoogte;
    this.npos = aantalPosities;
    this.pos = startPos;
    
    this.blokjeBreedte = (int) sliderBreedte / aantalPosities;
  }

  void tekenSlider() {
    noStroke();
    fill(255);
    rect(x, y, breedte, hoogte);

    fill(#2257F0);
    rect(x + pos * blokjeBreedte, y, blokjeBreedte, hoogte);
  }

  void bepaalSliderPositie() {
    if (mouseX < x) {
      this.pos = 0;
    } else if (mouseX >= breedte + x) {
      this.pos = npos - 1;
    } else {
      this.pos = floor((mouseX  - x) / blokjeBreedte);
    }
  }
  
  void toString() {
    println("The start value = " + this.x);
  }
}