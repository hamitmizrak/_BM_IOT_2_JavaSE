package project.file;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.UUID;

// KASA (ANA MERKEZ)
public class FileData implements Serializable{

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
    public  FileData() {
        this.id= UUID.randomUUID().toString();
        this.systemCreatedDate = new Date(System.currentTimeMillis());

        // File Create
        try{
            // Önce Dizin oluştur
            this.specialUrl=FilePathUrl.FILE_PATH;
            this.file= new File(specialUrl);
            boolean directoryMakeDirs=file.mkdirs();
            if(directoryMakeDirs){
                System.out.println(specialUrl+" adlı dizin oluşturuldu. "+directoryMakeDirs);
                // Sonra Dosya oluştur
                this.url=FilePathUrl.FILE_PATH.concat("\\user.txt");
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
    public String turkishNowDate(){
        Locale locale=new Locale("tr","TR");
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss", locale);
        Date date=new Date();
        String changeTurhishTime=sdf.format(date).toString();
        System.out.println(changeTurhishTime);
        return changeTurhishTime;
    }
    
    // Dosya Oluştur
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
    public void customerAddPromosyonMoneyInAccount(String url, Double money){
    }

    // Hesaba para ekle
    public void customerAddMoneyInAccount(String url, Double money){
        try(BufferedWriter bWriter=new BufferedWriter(new FileWriter(url,false))){
            Double accountMoney=0.0;

            turkishNowDate();
            accountMoney=customerAccountMoney("C:\\io\\bm\\user.txt");
            bWriter.write(String.valueOf(money));
            bWriter.flush();

            // Para için validation: -(eksi giremezsin) 0
            System.out.println("Hesabınızdaki para: "+money);
            System.out.println("Eklenen para: "+money+" Toplam Paranız ??? ");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // Hesapta para sorgula
    public Double customerAccountMoney(String url){
        String rows=null; // okunan satır
        Double money=null;
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
    public void customerMinusMoneyInAccount(String url,Double money){
        try{

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // Hesabı Sil
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

    // interface
    // inheritance | abstract
    // Login

    ////////////////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////////////////
    // GETTER AND SETTER

    // PSVM
    public static void main(String[] args) {
        // System.out.println(UUID.randomUUID().toString());
        FileData fd=new FileData();
        //System.out.println(fd);
        //fd.logLocalTurkishDate();

        // *****CREATE ***************
       //fd.createFile();

        // *****LIST ***************
        /*
        Scanner scannerList=new Scanner(System.in);
        char disk;
        String directory="",subDirectory="";
        System.out.println("\nFile Listelemek için öncelikle disk yazınız. c veya d gibi");
        disk=scannerList.nextLine().toUpperCase().charAt(0);
        System.out.println("Dizin adı yazınız ?");
        directory=scannerList.nextLine();
        System.out.println("Alt dizin adı yazınız ?");
        subDirectory=scannerList.nextLine();

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder
                .append(disk).append(":\\").append(directory)
                .append("\\").append(subDirectory);
        String specialListUrl=stringBuilder.toString();
        fd.fileList(specialListUrl);
        */

        // FILE INFORMATION
        /*
        Scanner scannerList=new Scanner(System.in);
        char disk;
        String directory="",subDirectory="";
        System.out.println("\nFile bilgisi için öncelikle disk yazınız. c veya d gibi");
        disk=scannerList.nextLine().toUpperCase().charAt(0);
        System.out.println("Dizin adı yazınız ?");
        directory=scannerList.nextLine();
        System.out.println("Alt dizin adı yazınız ?");
        subDirectory=scannerList.nextLine();

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder
                .append(disk).append(":\\").append(directory)
                .append("\\").append(subDirectory);
        String specialFileInformationUrl=stringBuilder.toString();
        fd.fileInformation(specialFileInformationUrl);
        */

        // FILE MONEY WRITER
        /*
        Scanner scannerWriter=new Scanner(System.in);
        System.out.println("Hesaba para eklemek için para girişi yapınız");
        Double money=scannerWriter.nextDouble();
        fd.customerAddMoney("C:\\io\\bm\\user.txt", money);
        */

        // FILE MONEY READER
        //fd.customerAccountMoney("C:\\io\\bm\\user.txt");

        // FILE DELETE
        fd.customerDeleteUserAccount("C:\\io\\bm");


        //System.out.println(fd.customerAccountMoney("C:\\io\\bm\\user.txt"));
        //Double accountMoney=fd.customerAccountMoney("C:\\io\\bm\\user.txt");
        //System.out.println("sonuç:"+accountMoney);

    }
} //end Class
