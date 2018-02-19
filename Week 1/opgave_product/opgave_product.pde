class Product {
  String naam;
  int prijs;
}

void setup() {
  Product product1 = new Product();
  Product product2 = new Product();
  Product product3 = new Product();
  Product product4 = new Product();
  
  product1.naam = "potje met honing";
  product1.prijs = 50;
  
  product2.naam = "snickers";
  product2.prijs = 2000;
  
  product3.naam = "perenboomzaden";
  product3.prijs = 5;
  
  product4.naam = "aardappelsalade";
  product4.prijs = 3;
  
  Product[] productLijst = {product1, product2, product3, product4};
  
  for (int i = 0; i < productLijst.length; i++) {
    println(productLijst[i].naam + " kost: " + productLijst[i].prijs + " euro");
  }
}