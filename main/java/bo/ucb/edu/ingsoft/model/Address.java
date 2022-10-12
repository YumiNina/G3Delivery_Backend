package bo.ucb.edu.ingsoft.model;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class Address {

   

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", neighbourId=" + neighbourId +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", reference='" + reference + '\'' +
                ", txStatus=" + txStatus +
                ", txDate=" + txDate +
                ", txId=" + txId +
                ", txHost='" + txHost + '\'' +
                ", txUserId=" + txUserId +
                '}';
    }
}
