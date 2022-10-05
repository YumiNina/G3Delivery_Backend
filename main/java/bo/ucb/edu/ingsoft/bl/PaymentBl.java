package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.AddressDao;
import bo.ucb.edu.ingsoft.dao.PaymentDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dao.UserDao;
import bo.ucb.edu.ingsoft.dto.PaymentAdd;
import bo.ucb.edu.ingsoft.dto.Transaction;
import bo.ucb.edu.ingsoft.dto.UserCreate;
import bo.ucb.edu.ingsoft.model.Address;
import bo.ucb.edu.ingsoft.model.Payment;
import bo.ucb.edu.ingsoft.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentBl {

    private PaymentDao paymentDao;
    private TransactionDao transactionDao;


    @Autowired
    public PaymentBl(PaymentDao paymentDao, TransactionDao transactionDao) {
        this.paymentDao = paymentDao;
        this.transactionDao = transactionDao;
    }

    public PaymentAdd createPayment(PaymentAdd paymentAdd, Transaction transaction)
    {
        paymentAdd.setFirstname(paymentAdd.getFirstname());
        paymentAdd.setLastname(paymentAdd.getLastname());
        paymentAdd.setCardNumber(paymentAdd.getCardNumber());
        paymentAdd.setSecurityCode(paymentAdd.getSecurityCode());
        paymentAdd.setDateExpire(paymentAdd.getDateExpire());




        return paymentAdd;
    }
}
