package project.controller;

import project.dao.IUser;
import project.dao.UserDao;

import java.io.Serializable;


public class UserController implements IUser, Serializable {

    // Serializable
    public static final Long serialVersionUID = 1L;

    // Injection
    private UserDao userDao = new UserDao();


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

} //end UserController
