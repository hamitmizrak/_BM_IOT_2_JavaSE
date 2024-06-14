package project.dto;

import lombok.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
abstract public class BaseDto implements Serializable {

    // Serializable
    public static final Long serialVersionUID = 1L;

    // Ortak Verileri
    private Long userID;
    private Date createdDate;

    // Gövdesiz Method (isLogin)
    abstract public boolean isLogin();

    // Gövdesiz Method (logout)
    abstract public void logout();
}
