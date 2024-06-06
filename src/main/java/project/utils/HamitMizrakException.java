package project.utils;

// Exception: İstisnaları yakalamak için kendi exceptionu yazdım
public class HamitMizrakException extends RuntimeException{

    public HamitMizrakException(String message) {
        super(message);
    }
}
