package dto;

public class TestOrderDto {
    private String status;
    private int courierId;
    private String customerName;
    private String customerPhone;
    private String comment;
    private long id;

    public TestOrderDto(String customerName, String customerPhone, String comment) {
        this.status = "OPEN";
        this.courierId = 0;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.comment = comment;
        this.id = 1;
    }

    public TestOrderDto() {
        this.status = "OPEN";
        this.courierId = 1;
        this.id = 0;
    }

    public String getStatus() {
        return status;
    }

    public int getCourierId() {
        return courierId;
    }

    public void setCourierId(int courierId) {
        this.courierId = courierId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public long getId() {
        return id;
    }
}
