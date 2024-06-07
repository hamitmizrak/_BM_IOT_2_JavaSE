package project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import project.dao.UserDao;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

// LOMBOK
@Getter
@Setter
@AllArgsConstructor
// @NoArgsConstructor
public class UserDto extends BaseDto implements Serializable {

    // Serializable
    public static final Long serialVersionUID = 1L;

    // Variable
    private String username;
    private String name;
    private String surname;
    private String password;
    private String email;

    // Class Calling
   private UserDao userDao;

    // Constructor(Parametresiz)
    public UserDto() {
        userDao = new UserDao();
    }

    // Constructor(Parametreli)
    public UserDto(Long userID, Date createdDate, String username, String name, String surname, String password, String email, UserDao userDao) {
        super(userID, createdDate);
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
        this.userDao = userDao;
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
    @Override
    public boolean isLogin(){
        // database veya statik datadan geliyor
        String defaultEmail,defaultPassword;
        defaultEmail=DefaultBankLogin.USER_EMAIL;
        defaultPassword=DefaultBankLogin.USER_PASSWORD;

        // Kullanıcıya sisteme giriş için 3 kere yanlış yapma hakkı verelim
        int attemp=3; // 3 tane hak verdim
        while(attemp>0){
            String[] dataArray= userInformation();
            //System.out.println("emailiniz: "+dataArray[0]);
            //System.out.println("Şifreniz: "+dataArray[1]);

            if(defaultEmail.equals(dataArray[0]) && defaultPassword.equals(dataArray[1])){
                System.out.println("Kullanıcı bilgileri doğrudur. Sisteme Giriş yapıldı");
                return true;
            }else{
                --attemp; // 1 tane hak azalt
                System.out.println("\nŞifreniz veya kullanıcı adınız yanlış. "+"Kalan Hakkınız: "+attemp);

                // Kullanıcı hakkı kalmazsa Kartı bloke yap
                if(attemp==0){
                    System.out.println("Kalan hakkınız kalmadı. Müşteri hizmetlerine başvuru yapınız");
                    System.out.println("Müşteri hizmetlerini arama mı ister misiniz ? E/H");
                    logout();
                }
            }
        }
        // Validation ...
        return true;
    }

    // Logout
    @Override
    public void logout(){
        System.out.println("Sistemden çıkılıyor");
        System.exit(0);
    }
}
