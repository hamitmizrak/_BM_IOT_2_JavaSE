#define Button 8
#define Led 12

void setup(){
// Led
// pinMode(12,OUTPUT);
pinMode(Led,OUTPUT);


// Button 
// pinMode(8,INPUT);
pinMode(Button,INPUT);

}


void loop(){

if(digitalRead(Button) == 1){
	delay(500);
	digitalWrite(Led,HIGH);
}else{

	digitalWrite(Led,LOW);
}

}