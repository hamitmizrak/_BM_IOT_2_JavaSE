void setup() {
  // put your setup code here, to run once:
  /*multiple*/

  // Digital 13 Pini Çıkış yapmak istiyorum
  pinMode(13, OUTPUT);  // ; unutma
}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(13, HIGH);  // Lambayı yak
  delay(2000);             // 2.saniye bekle
  digitalWrite(13, LOW);   // Lambayı söndür
  delay(1000);             // 1. saniye bekle(uyu)

  // Döngüyü 20 kez çalışsın sonrasında dursun.
  /*
  bool isFlag=true;
  for(int i=0; i<20; i++){
    if(i==20)
      break;
  }       
  */

  // Döngüyü 20 kez çalışsın sonrasında dursun.
  bool isFlag = true;
  for (int i = 0; i < 20 && isFlag; i++) {
    if (i == 20) {
      isFlag = false;
    }
  }
}
