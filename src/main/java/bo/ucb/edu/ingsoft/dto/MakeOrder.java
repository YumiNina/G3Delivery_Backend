package bo.ucb.edu.ingsoft.dto;

import java.math.BigDecimal;
import java.util.Date;

public class MakeOrder {
    private Integer productId;
    private Integer addressId;
    private Integer userId;
    private Date date;
    private Integer status;
    private Integer state;
    private BigDecimal total;

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "MakeOrder{" +
                "productId=" + productId +
                ", addressId=" + addressId +
                ", userId=" + userId +
                ", date=" + date +
                ", status=" + status +
                ", state=" + state +
                ", total=" + total +
                '}';
    }
}