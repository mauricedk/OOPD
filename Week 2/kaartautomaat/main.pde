KaartAutomaat automaat1 = new KaartAutomaat(20); //20 is geldvoorraad

void setup() {
  println("KaartAutomaat gestart...");
  println("Werp geld in: ");
  println("1: 1 euro");
  println("2: 2 euro");
  println("3: 5 euro");
  println("9: toon geldvoorraad");
  println("0: leeg automaat");
}

void draw() {
}

void keyPressed() {
  switch (keyCode) {
    case 49:
      automaat1.koopKaartje(1);
      break;
    case 50:
      automaat1.koopKaartje(2);
      break;
    case 51:
      automaat1.koopKaartje(5);
      break;
    case 57:
      automaat1.voorraad();
      break;
    case 48:
      automaat1.leeg();
      break;
  }
}