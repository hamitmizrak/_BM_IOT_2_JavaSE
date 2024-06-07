package project.controller;

import project.dao.IUser;
import project.dao.UserDao;
import project.dto.UserDto;
import project.utils.FilePathUrl;

import java.io.Serializable;
import java.util.Scanner;


public class UserController implements IUser, Serializable {

    // Serializable
    public static final Long serialVersionUID = 1L;

    // Injection
    private UserDao userDao = new UserDao();
    private UserDto userDto = new UserDto();

    /////////////////////////////////////////////////////////
    private void isloginValidationAllProcess(){
       boolean islogin = userDto.isLogin();
        if(islogin){
            Scanner scannerSuccess = new Scanner(System.in);
            String fileName,url = "";
            System.out.println("\nSeçim için Kullanıcı URL adını giriniz");
            String isLoginFileName=scannerSuccess.nextLine().concat(".txt");
            System.out.println(isLoginFileName);
            try{
                url= FilePathUrl.FILE_PATH.concat("\\").concat(isLoginFileName);
                System.out.println(url);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Lütfen Seçiminizi Yapınız");
            System.out.println("1-)Dosya Listele\n2-)Dosya Özellikleri\n3-)Kullanıcı Oluştur\n4-)Hesaptan para sorgula");
            System.out.println("5-)Hesaptan Para Çek\n6-)Havale Yap\n7-)Eft Yap\n8-)Bağış Yap\n9-)Müşteri Hizmetlerini Ara\n10-)Çıkış");
            int chooiseUser= scannerSuccess.nextInt();
            switch (chooiseUser){
                case 1:
                    userDao.fileList(url);
                    break;
                case 2:
                    userDao.fileInformation(url);
                    break;
                case 3:
                    userDao.fileCreateCustomize();
                    break;
                case 4:
                    userDao.customerAccountMoney(url);
                    break;
                case 5:
                    System.out.println("Çekmek istediğiniz para miktarını giriniz");
                    Double moneyAdd=scannerSuccess.nextDouble();
                    userDao.customerMinusMoneyInAccount(url,moneyAdd);
                    break;
                case 6:
                    System.out.println("Havale Yapmak için istediğiniz para miktarını giriniz");
                    Double moneyTransfer=scannerSuccess.nextDouble();
                    userDao.customerMoneyDoTransfer( url, moneyTransfer);
                    break;
                case 7:
                    System.out.println("EFT Yapmak için istediğiniz para miktarını giriniz");
                    Double moneyEft=scannerSuccess.nextDouble();
                    userDao.customerMoneyDoEft( url, moneyEft);
                    break;
                case 8:
                    System.out.println("EFT Yapmak için istediğiniz para miktarını giriniz");
                    Double moneyDonate=scannerSuccess.nextDouble();
                    userDao.customerMoneyDoDonate( url, moneyDonate);
                    break;
                case 9:
                    userDao.customerServise();
                    break;
                case 10:
                    userDto.logout();
                    break;
            }
        }else{
            System.out.println("Lütfen kayıt olunuz");
        }
    }

    public void successAllProject(){
        // Kullanıcı logout olana kadar sonsuz döngü olarak çalışsın
        while(true){
            isloginValidationAllProcess();
        }
    }

    /////////////////////////////////////////////////////////
    // Tarih
    @Override
    public String turkishNowDate() {
        return userDao.turkishNowDate();
    }

    // Dosya Oluştur
    @Override
    public void fileCreateCustomize() {
        userDao.fileCreateCustomize();
    }

    // Dosya Listele
    @Override
    public void fileList(String url) {
        userDao.fileList(url);
    }

    // Dosya Özellikleri
    @Override
    public void fileInformation(String url) {
        userDao.fileInformation( url);
    }

    // Banka bir kereliğe mahsus 1000.0 TL promosyon eklesin
    @Override
    public void customerAddPromosyonMoneyInAccount(String url, Double money) {
        userDao.customerAddPromosyonMoneyInAccount( url, money);
    }

    // Money Validation
    @Override
    public Double moneyValidation(Double money) {
        return userDao.moneyValidation(money);
    }

    // Hesaba para ekle
    @Override
    public void customerAddMoneyInAccount(String url, Double money) {
        userDao.customerAddMoneyInAccount( url, money);
    }

    // Hesapta para sorgula
    @Override
    public Double customerAccountMoney(String url) {
        return userDao.customerAccountMoney(url);
    }

    // Hesaptan Para Çek
    @Override
    public void customerMinusMoneyInAccount(String url, Double money) {
        userDao.customerMinusMoneyInAccount( url, money);
    }

    // Havale Yap
    @Override
    public void customerMoneyDoTransfer(String url, Double money) {
        userDao.customerMoneyDoTransfer( url, money);
    }

    // EFT Yap
    @Override
    public void customerMoneyDoEft(String url, Double money) {
        userDao.customerMoneyDoEft( url,  money);
    }

    // Bağış Yap
    @Override
    public void customerMoneyDoDonate(String url, Double money) {
        userDao.customerMoneyDoDonate( url,  money);
    }

    // Hesabı Sil
    @Override
    public void customerDeleteUserAccount(String url) {
        userDao.customerDeleteUserAccount( url);
    }

    @Override
    public void customerServise() {
        userDao.customerServise();
    }

} //end UserController
