package dto;

public class TestOrderDtoForNegativeTests2 {
    private String status;
    private String courierId;
    private String customerName;
    private String customerPhone;
    private String comment;
    private long id;


    public TestOrderDtoForNegativeTests2(String courierId, String customerName, String customerPhone, String comment, long id) {
        this.status = "OPEN";
        this.courierId = courierId;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.comment = comment;
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStatus() {
        return status;
    }

    public String getCourierId() {
        return courierId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public String getComment() {
        return comment;
    }

    public long getId() {
        return id;
    }
}
