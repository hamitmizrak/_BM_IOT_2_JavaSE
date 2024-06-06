package project.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.file.FileData;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

// LOMBOK
@Data
@AllArgsConstructor
// @NoArgsConstructor
public class UserLogin  implements Serializable {

    // Serializable
    public static final Long serialVersionUID = 1L;

    // Variable
    private Long userID;
    private String username;
    private String name;
    private String surname;
    private String password;
    private String email;
    private Date createdDate;

    // Class Calling
    FileData fileData;

    // Constructor(Parametresiz)
    public UserLogin() {
        fileData= new FileData();
    }

    // Kullanıcıdan veri almak
    private static String[] userInformation () {
        String[] userAll=new String[2];

        Scanner scanner=new Scanner(System.in);
        String email,password;

        System.out.println("\nLütfen email yazınız.");
        email=scanner.nextLine();

        System.out.println("Lütfen şifre giriniz.");
        password=scanner.nextLine();
        userAll[0]=email;
        userAll[1]=password;
        return userAll;
    }

    // Login
    private boolean isLogin(){
        // database veya statik datadan geliyor
        String defaultEmail,defaultPassword;
        defaultEmail=DefaultBankLogin.USER_EMAIL;
        defaultPassword=DefaultBankLogin.USER_PASSWORD;

        String[] dataArray= userInformation();
        System.out.println("emailiniz: "+dataArray[0]);
        System.out.println("Şifreniz: "+dataArray[1]);

        if(defaultEmail.equals(dataArray[0]) && defaultPassword.equals(dataArray[1])){
            System.out.println("Sisteme giriş yapılıyor.  Hesaba yönlendiriliyor");
            fileData.allMethod();
            return true;
        }else{
            System.out.println("Şifreniz veya kullanıcı adınız yanlış");
        }
        // Validation ...
        return false;
    }

    public void isloginValidation(){
        UserLogin  userLogin=new UserLogin();
        //while(true){}
            Boolean isLogin=   userLogin.isLogin();
        if(isLogin){
            System.out.println(isLogin);
        }else{
            userLogin.isLogin();
        }


    }
}
