package project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import project.dao.UserDao;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

// LOMBOK
@Data
@AllArgsConstructor
// @NoArgsConstructor
public class UserDto implements Serializable {

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
    UserDao userDao;

    // Constructor(Parametresiz)
    public UserDto() {
        userDao = new UserDao();
    }

    // Kullanıcıdan veri almak
    private static String[] userInformation () {
        String[] userAll=new String[2];

        Scanner scanner=new Scanner(System.in);
        String email,password;

        System.out.println("\nLütfen email yazınız.");
        email=scanner.nextLine().trim();

        System.out.println("Lütfen şifre giriniz.");
        password=scanner.nextLine().trim();
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

        // Kullanıcıya sisteme giriş için 3 kere yanlış yapma hakkı verelim
        int attemp=3; // 3 tane hak verdim
        while(attemp>0){
            userInformation();

            if(defaultEmail.equals(dataArray[0]) && defaultPassword.equals(dataArray[1])){
                System.out.println(" Kullanıcı bilgileri doğrudur.");
                // show
                System.out.println("Sisteme giriş yapılıyor.  Hesaba yönlendiriliyor");
                // userDao.allMethod();
                return true;
            }else{
                --attemp; // 1 tane hak azalt
                System.out.println("Şifreniz veya kullanıcı adınız yanlış");
                System.out.println("Kalan Hakkınız: "+attemp);

                // Kullanıcı hakkı kalmazsa Kartı bloke yap
                if(attemp==0){
                    System.out.println("Kalan hakkınız kalmadı. Müşteri hizmetlerine başvuru yapınız");
                    System.out.println("Müşteri hizmetlerini arama mı ister misiniz ? E/H");
                    logout();
                }
            }
        }
        // Validation ...
        return false;
    }

    // Login validaiton
    public void isloginValidation(){
        UserDto userLogin=new UserDto();
        //while(true){}
            Boolean isLogin=   userLogin.isLogin();
        if(isLogin){
            System.out.println(isLogin);
        }else{
            userLogin.isLogin();
        }
    }

    // Logout
    public void logout(){
        System.out.println("Sistemnde çıkılıyor");
        System.exit(0);
    }
}
