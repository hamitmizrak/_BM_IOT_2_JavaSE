void setup(){

// Digital pin seçmeliyim
pinMode(2,OUTPUT);
}



void loop(){
digitalWrite(2,HIGH);//lamba yan
delay(2000);
digitalWrite(2,LOW);// Lamba son
delay(1000);
}