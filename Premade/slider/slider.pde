Slider slider1 = new Slider(20, 100, 400, 30, 30, 20);

void setup() {
  size(600, 600);
  background(0);
  
  slider1.toString();
}

void draw() {
  
  slider1.bepaalSliderPositie();
  slider1.tekenSlider();
}