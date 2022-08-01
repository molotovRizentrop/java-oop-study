package section041_oop;

/**
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 **/
public final class PasswordResetService {
    private AccountRepository accountRepository;

    private AccountNotFoundByEmailHandler accountNotFoundByEmailHandler;

    private AccountNotActiveHandler accountNotActiveHandler;

    private VerificationCodeGenerator verificationCodeGenerator;

    private EmailService emailService;

    public PasswordResetService(AccountRepository accountRepository,
                                AccountNotFoundByEmailHandler accountNotFoundByEmailHandler,
                                AccountNotActiveHandler accountNotActiveHandler,
                                VerificationCodeGenerator verificationCodeGenerator,
                                EmailService emailService) {
        this.accountRepository = accountRepository;
        this.accountNotFoundByEmailHandler = accountNotFoundByEmailHandler;
        this.accountNotActiveHandler = accountNotActiveHandler;
        this.verificationCodeGenerator = verificationCodeGenerator;
        this.emailService = emailService;
    }

    public String reset(String email) {
        Account account = accountRepository.findByEmail(email);
        if (account == null) {
            return accountNotFoundByEmailHandler.handle(email);
        } else if (account.isNotActive()) {
            String result = accountNotActiveHandler.handle(account);
            if (result != null) {
                return result;
            }
        }
        String code = verificationCodeGenerator.generate();
        account.setCode(code);
        accountRepository.update(account);
        emailService.sendPasswordResetEmail(email, code);
        return "password_reset_success.html";
    }
}