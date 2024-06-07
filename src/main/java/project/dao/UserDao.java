package project.dao;

import project.utils.FilePathUrl;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.UUID;

// KASA (ANA MERKEZ)
public class UserDao implements IUser,Serializable{

    // Serializable
    public static final Long serialVersionUID = 1L;

    // Variable
    private String id;
    private Date systemCreatedDate;

    // private java.io.File file;
    private File file;
    private String fileName;
    private String specialUrl;
    private String url;

    // Constructor (Parametresiz Constructor)
    public UserDao() {
        this.id= UUID.randomUUID().toString();
        this.systemCreatedDate = new Date(System.currentTimeMillis());

        // File Create
        try{
            // Önce Dizin oluştur
            this.specialUrl= FilePathUrl.FILE_PATH;
            this.file= new File(specialUrl);
            boolean directoryMakeDirs=file.mkdirs();
            if(directoryMakeDirs){
                System.out.println(specialUrl+" adlı dizin oluşturuldu. "+directoryMakeDirs);
                // Sonra Dosya oluştur
                this.url=FilePathUrl.FILE_PATH.concat("\\user.txt");
                this.file= new File(url);
                // Eğer benim belirlediğim dosya yoksa yeni dosya ekle
                if(file.exists()){
                    System.out.println(url+ " böyle bir dosya mevcuttur tekrar oluşturulamaz.");
                }else{
                    file.createNewFile();
                    System.out.println(url+ " dosyanız oluşturuldu.");

                    // Promosyon Ekle
                    //customerAddPromosyonMoneyInAccount("C:\\io\\bm\\user.txt", 1000.0);
                }
            }else{
                System.out.println(specialUrl+ "  dizini oluşturulmadı");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        // Bu dosya 1 yıl sonra kendi kendine silinsin.
        // delete()
    }

    // toString
    @Override
    public String toString() {
        return "FileData{" +
                "url='" + url + '\'' +
                ", id='" + id + '\'' +
                ", systemCreatedDate=" + systemCreatedDate +
                ", file=" + file +
                ", fileName='" + fileName + '\'' +
                ", directoryUrl='" + specialUrl + '\'' +
                '}';
    }

    /////////////////////////////////
    // Tarih
    @Override
    public String turkishNowDate(){
        Locale locale=new Locale("tr","TR");
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss", locale);
        Date date=new Date();
        String changeTurhishTime=sdf.format(date).toString();
        System.out.println(changeTurhishTime);
        return changeTurhishTime;
    }
    
    // Dosya Oluştur
    @Override
    public void fileCreateCustomize(){
        Scanner scannerCreate=new Scanner(System.in);
        // File Create
        try{
            // Önce Dizin oluştur
            char disk;
            String directory="",subDirectory="",fileName="";
            System.out.println("\nÖncelikle disk yazınız. c veya d gibi");
            disk=scannerCreate.nextLine().toUpperCase().charAt(0);
            System.out.println("Dizin adı yazınız ?");
            directory=scannerCreate.nextLine();
            System.out.println("Alt dizin adı yazınız ?");
            subDirectory=scannerCreate.nextLine();

            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder
                    .append(disk).append(":\\").append(directory)
                    .append("\\").append(subDirectory);
            String specialDirectorUrl=stringBuilder.toString();

            this.file= new File(specialDirectorUrl);
            boolean directoryMakeDirs=file.mkdirs();
            if(directoryMakeDirs){
                System.out.println(specialDirectorUrl+" adlı dizin oluşturuldu. "+directoryMakeDirs);
                // Sonra Dosya oluştur
                System.out.println("Dosya adını yazınız ?");
                fileName=scannerCreate.nextLine();
                this.url=stringBuilder.append("\\").append(fileName).append(".txt"). toString();
                this.file= new File(url);
                // Eğer benim belirlediğim dosya yoksa yeni dosya ekle
                if(file.exists()){
                    System.err.println(url+ " böyle bir dosya mevcuttur tekrar oluşturulamaz.");
                }else{
                    file.createNewFile();
                    System.out.println(url+ " dosyanız oluşturuldu.");
                }
            }else{
                System.err.println(specialUrl+ " url dizini oluşturulmadı");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // Dosya Listele
    @Override
    public void fileList(String url){
        String specialUrl=null;
        File fileList;
        try {
            // Eğer kullanıcı herhangi bir url girmezse default url alsın.
            if(url==null || url.isEmpty()){
                specialUrl=FilePathUrl.FILE_PATH;
                fileList=new File(specialUrl);
                for(File temp : fileList.listFiles()){
                    System.out.println(temp.getName());
                }
            }else{
                fileList=new File(url);
                for(File temp : fileList.listFiles()){
                    System.out.println(temp.getName());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // Dosya Özellikleri
    @Override
    public void fileInformation(String url){
        String specialUrl=null,fileName=null;
        Scanner scannerInformation=new Scanner(System.in);
        File fileInformation;
        // url:"" bilerek böyle girdim çünkü default url gelsin

        try {
            // Eğer kullanıcı herhangi bir url girmezse default url alsın.
            if(url==null || url.isEmpty()){
                fileList("");
                System.out.println("Dosya adını yazınız ?");
                fileName=scannerInformation.nextLine();
                specialUrl=FilePathUrl.FILE_PATH.concat("\\").concat(fileName).concat(".txt");
                fileInformation=new File(specialUrl);
            }else{
                fileList("");
                //fileList(url);
                System.out.println("Dosya adını yazınız ?");
                fileName=scannerInformation.nextLine();
                specialUrl=FilePathUrl.FILE_PATH.concat("\\").concat(fileName).concat(".txt");
                fileInformation=new File(specialUrl);
            }
            System.out.println("PATH: "+fileInformation.getPath());
            System.out.println("LENGTH: "+fileInformation.length());
            System.out.println("PARENT: "+fileInformation.getParent());

            System.out.println("IS READ ? "+fileInformation.canRead());
            System.out.println("IS WRITE ? "+fileInformation.canWrite());
            System.out.println("IS EXECUTE ? "+fileInformation.canExecute());

            System.out.println("IS FILE ? "+fileInformation.isFile());
            System.out.println("IS DIRECTORY ? "+fileInformation.isDirectory());
            System.out.println("IS HIDDEN ? "+fileInformation.isHidden());

            System.out.println("Harddisk TOTAL SPACE: "+fileInformation.getTotalSpace());
            System.out.println("Harddisk FREE SPACE: "+fileInformation.getFreeSpace());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // Banka bir kereliğe mahsus 1000.0 TL promosyon eklesin
    @Override
    public void customerAddPromosyonMoneyInAccount(String url, Double money){
        customerAddMoneyInAccount(url,money);
    }

    // Hesaba para ekle
    @Override
    public void customerAddMoneyInAccount(String url, Double money){
        System.out.println(customerAccountMoney(url));
        Double accountMoney=customerAccountMoney(url);
        try(BufferedWriter bWriter=new BufferedWriter(new FileWriter(url,false))){
            turkishNowDate();

            // Para Ekle
            Double add=accountMoney+money;

            bWriter.write(String.valueOf(add));
            bWriter.flush();

            // Para için validation: -(eksi giremezsin) 0
            System.out.println("Hesabınızdaki para: "+accountMoney);
            System.out.println("Eklenen para: "+money+" Toplam Paranız "+add);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // Hesapta para sorgula
    @Override
    public Double customerAccountMoney(String url){
        String rows=null; // okunan satır
        Double money=0.0;
        try(BufferedReader bReader=new BufferedReader(new FileReader(url))){
            while((rows=bReader.readLine())!=null){
                money= Double.valueOf(rows);
            }
            turkishNowDate();
            System.out.println("Hesabınızdaki para: "+money);
        }catch (Exception e){
            e.printStackTrace();
        }
        return money;
    }

    // Hesaptan Para Çek
    @Override
    public void customerMinusMoneyInAccount(String url,Double money){
        try{

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // Hesabı Sil
    @Override
    public void customerDeleteUserAccount(String url){
        String fileName,filePathName;
        Scanner scannerDelete=new Scanner(System.in);
        fileList(url);
        System.out.println("Silmek istediğiniz dosya adını yazınız ?");
        fileName=scannerDelete.nextLine().concat(".txt");
        System.out.println(fileName);
        filePathName=FilePathUrl.FILE_PATH.concat("\\").concat(fileName);
        System.out.println("Silinecek url "+filePathName);

        // Kullanıcıdan gelen isteğe göre sil
        char chooise;
        System.out.println(fileName+" bu dosyayı gerçekten silmek istiyor musunuz ? E/H");
        chooise= scannerDelete.nextLine().toUpperCase().charAt(0);
        System.out.println(chooise);
        if(chooise=='E'){
            System.out.println("Evet alanındayım");
            try{
                File fileDelete= new File(filePathName);
                System.out.println("fileDelete: "+fileDelete);
                // Böyle bir dosya var mı ? yok mu?
                if(fileDelete.exists()){ //eğer böyle bir dosya varsa dosyayı sil
                    fileDelete.delete();
                    System.out.println("Dosyanız silindi");
                }else{
                    System.err.println("Olmayan dosyayı silemem");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            System.err.println(fileName+" Dosya Silinmedi");
        }
    }

    // Havale Yap
    @Override
    public void customerMoneyDoTransfer(String url){}

    // Eft Yap
    @Override
    public void customerMoneyDoEft(String url){}

    // Bağış yap
    @Override
    public void customerMoneyDoDonate(String url){}

    // inheritance | abstract

    ////////////////////////////////////////////////////////////////////////
    // GETTER AND SETTER

    public static void main(String[] args) {
        UserDao userDao= new UserDao();
        userDao.customerAddMoneyInAccount("C:\\io\\bm\\user.txt", 500.0);
        userDao.customerAddMoneyInAccount("C:\\io\\bm\\user.txt", 700.0);
    }

} //end Class
