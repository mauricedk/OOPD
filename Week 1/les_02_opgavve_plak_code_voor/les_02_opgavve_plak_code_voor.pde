String[] idLijst = {"8b3", "4bf", "9h0"};


void setup() {
  String[] lijst2 = plakCodeVoorIdLijst(idLijst, "NL");
  println(lijst2[1]);
  //println(checkCodeVoorIdLijstFunctie(lijst2, code););
  
}

String plakCodeVoorId(String id, String code) {
  return code + id;
}

String[] plakCodeVoorIdLijst(String[] lijst, String code) {
  String[] lijst2 = new String[lijst.length];
  for (int i = 0; i < lijst.length; i++) {
    lijst2[i] = plakCodeVoorId(lijst[i], "NL");
  }
  return lijst2;
}

String checkCodeVoorIdLijstFunctie(String[] lijst1, String[] lijst2, String code){
  boolean error = false;
  int errorCode = 0;
  for (int i = 0; i < lijst) {
  }
}