package section041_oop;

/**
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 **/
public interface EmailService {

    void sendPasswordResetEmail(String email, String code);
}