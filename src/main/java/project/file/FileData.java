package project.file;

import java.io.File;
import java.util.Date;
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

    /////////////////////////////////
    // Tarih

    // Dosya Oluştur

    // Dosya Listele

    // Dosya Özellikleri

    // Dosya Yaz

    // Dosya Oku

    // Dosya Sil

    /////////////////////////////////
    // GETTER AND SETTER

    public static void main(String[] args) {
        // System.out.println(UUID.randomUUID().toString());
        FileData fd=new FileData();

    }

} //end Class
