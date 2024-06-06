package project.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

// LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor
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

    // Kullanıcıdan veri almak
    private static String[] userInformation () {
        String[] userAll=new String[2];

        Scanner scanner=new Scanner(System.in);
        String email,password;

        System.out.println("Lütfen email yazınız.");
        email=scanner.nextLine();

        System.out.println("Lütfen şifre giriniz.");
        password=scanner.nextLine();
        userAll[0]=email;
        userAll[1]=password;
        return userAll;
    }

    // Login
    public boolean isLogin(){

        // database veya statik datadan geliyor
        String defaultEmail,defaultPassword;
        defaultEmail=DefaultBankLogin.USER_EMAIL;
        defaultPassword=DefaultBankLogin.USER_PASSWORD;

        String[] dataArray= userInformation();
        System.out.println("emailiniz: "+dataArray[0]);
        System.out.println("Şifreniz: "+dataArray[1]);

        // Validation ...
        return false;
    }

    public static void main(String[] args) {
        UserLogin  userLogin=new UserLogin();
        userLogin.isLogin();
    }

}
