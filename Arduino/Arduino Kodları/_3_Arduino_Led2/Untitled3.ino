void setup(){

// Sar? LED
pinMode(12,OUTPUT);

// Mavi LED
pinMode(9,OUTPUT);
}



void loop(){
// Mavi yans?n
digitalWrite(9,HIGH);
delay(500);

// Sar? Yans?n
digitalWrite(12,HIGH);
delay(1000);

// Mavi S�ns�n
digitalWrite(9,LOW);
delay(1000);

// Sar? S�ns�n
digitalWrite(12,LOW);
delay(1000);

}