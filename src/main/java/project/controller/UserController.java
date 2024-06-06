package project.controller;

import project.dao.UserDao;
import project.dto.UserDto;

public class UserController {
    // Injection
    private UserDao userDao = new UserDao();

    // All Method Switch
    public void allMethod(){
        System.out.println("All Method");
    }

    public void allProcess(){
        UserDto userLogin = new UserDto();
        userLogin.isloginValidation();
    }

    // PSVM
    public static void main(String[] args) {
        // System.out.println(UUID.randomUUID().toString());
        UserDao fd=new UserDao();
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
}
