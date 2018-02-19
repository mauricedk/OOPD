class KaartAutomaat {

  float Fprice,
        Mvoorraad,
        Minworp;

  String Ftitle;


  KaartAutomaat(float voorraad) {

    this.Mvoorraad = voorraad;
    this.Minworp = 0;
    
    this.Ftitle = "Matrix";
    this.Fprice = 6.50;
  }
  
  void koopKaartje (float inworp){
    if ((inworp + this.Minworp) >= this.Fprice) {
      println("Uw wisselgeld = " + ((inworp + this.Minworp) - this.Fprice));
      this.Minworp = inworp - this.Fprice;
      this.Mvoorraad = this.Mvoorraad + this.Fprice;
      FilmKaart filmkaart = new FilmKaart(this.Ftitle, this.Fprice);
      this.Minworp = 0;
      println("-------------------");
      println("Uw kaart gegevens:");
      println("Filmtitel: " + filmkaart.title);
      println("Filmprijs: " + filmkaart.price);
      println("-------------------");
    } else {
      this.Minworp = this.Minworp + inworp;
      println("Inworp niet genoeg voor gekozen film. " + "Ingeworpen bedrag = " + this.Minworp);
    }
  }
  
  void voorraad() {
    println("Actuele geldvoorraad: " + this.Mvoorraad);
  }
  
  void leeg() {
    this.Mvoorraad = 0;
    println("Automaat is geleegd");
  }
}

class FilmKaart {

  float price;
  String title;


  FilmKaart(String naam, float prijs) {

    this.price = prijs;
    this.title = naam;
  }
}