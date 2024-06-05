package project.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.UUID;

public class FileData {

    // Variable
    private String id;
    private Date systemCreatedDate;

    // private java.io.File file;
    private File file;
    private String fileName;
    private String specialUrl;
    private String url;

    // Constructor
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
                this.url=FilePathUrl.FILE_PATH.concat("\\atm.txt");
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
    public String logLocalTurkishDate(){
        Locale locale=new Locale("tr","TR");
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss", locale);
        Date date=new Date();
        String changeTurhishTime=sdf.format(date).toString();
        System.out.println(changeTurhishTime);
        return changeTurhishTime;
    }
    
    // Dosya Oluştur
    public void createFile(){
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

    // Dosya Yaz (hesaptaki para miktarını yaz)

    // Dosya Oku (hesaptaki para miktarını oku)

    // Dosya Sil (hesabı sileceğim)

    // interface

    // inheritance | abstract
    // Login

    /////////////////////////////////
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
    }
} //end Class
