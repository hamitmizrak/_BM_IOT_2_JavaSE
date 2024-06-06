package project.dao;

public interface IUser {

    // Tarih
    String turkishNowDate();

    // Dosya Oluştur
    void fileCreateCustomize();

    // Dosya Listele
    void fileList(String url);

    // Dosya Özellikleri
    void fileInformation(String url);

    // Banka bir kereliğe mahsus 1000.0 TL promosyon eklesin
    void customerAddPromosyonMoneyInAccount(String url, Double money);

    // Hesaba para ekle
    void customerAddMoneyInAccount(String url, Double money);

    // Hesapta para sorgula
    Double customerAccountMoney(String url);

    // Hesaptan Para Çek
    void customerMinusMoneyInAccount(String url, Double money);

    // Hesabı Sil
    void customerDeleteUserAccount(String url);

    // Havale Yap
    void customerMoneyDoTransfer(String url);

    // Eft Yap
    void customerMoneyDoEft(String url);

    // Bağış yap
    void customerMoneyDoDonate(String url);
}
