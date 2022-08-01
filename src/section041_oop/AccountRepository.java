package section041_oop;

/**
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 **/
public interface AccountRepository {

    Account findByEmail(String email);

    void update(Account account);
}