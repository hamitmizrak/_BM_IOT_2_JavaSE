package project.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public class FileData {

    // Variable
    private String id;
    private Date systemCreatedDate;

    // private java.io.File file;
    private File file;
    private String fileName;
    private String directoryUrl;
    private String url;

    // Constructor
    public  FileData() {
        this.id= UUID.randomUUID().toString();
        this.systemCreatedDate = new Date(System.currentTimeMillis());

        // File Create
        try{
            // Önce Dizin oluştur
            this.directoryUrl=FilePathUrl.FILE_PATH;
            this.file= new File(directoryUrl);
            boolean directoryMakeDirs=file.mkdirs();
            if(directoryMakeDirs){
                System.out.println(directoryUrl+" adlı dizin oluşturuldu. "+directoryMakeDirs);
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
                System.err.println(directoryUrl+ " url dizini oluşturulmadı");
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
                ", directoryUrl='" + directoryUrl + '\'' +
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

    // Dosya Listele

    // Dosya Özellikleri

    // Dosya Yaz

    // Dosya Oku

    // Dosya Sil

    /////////////////////////////////
    // GETTER AND SETTER

    // PSVM
    public static void main(String[] args) {
        // System.out.println(UUID.randomUUID().toString());
        FileData fd=new FileData();
        System.out.println(fd);
        fd.logLocalTurkishDate();

    }

} //end Class
