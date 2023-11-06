package dto;

public class TestOrderDtoForNegativeTests {
    private String status;
    private int courierId;
    private String customerName;
    private String customerPhone;
    private String comment;


    public TestOrderDtoForNegativeTests(int courierId, String customerName, String customerPhone, String comment) {
        this.status = "OPEN";
        this.courierId = courierId;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.comment = comment;
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

    public int getCourierId() {
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
}
