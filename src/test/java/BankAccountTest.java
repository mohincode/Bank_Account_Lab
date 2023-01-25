import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAcc;

    @BeforeEach
     void setUp() {
        bankAcc = new BankAccount();
    }


    @Test
    void testDeposit() {
        bankAcc = new BankAccount();
        bankAcc.deposit(300);
        assertThat(bankAcc.getBalance()).isEqualTo(0);
    }

    @Test
    void testWithdraw() {
        bankAcc = new BankAccount();
        bankAcc.withdraw(300);
        assertThat(bankAcc.getBalance()).isEqualTo(-300);
    }




}
