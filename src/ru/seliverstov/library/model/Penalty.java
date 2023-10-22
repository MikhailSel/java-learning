package ru.seliverstov.library.model;

import java.math.BigDecimal;
import java.util.Random;

public class Penalty {
    private Long id;
    private Long bookIssueId;
    private BigDecimal sum;
    private String status;

    public Penalty(Long bookIssueId, BigDecimal sum, String status) {
        this.id = new Random().nextLong();
        this.bookIssueId = bookIssueId;
        this.sum = sum;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookIssueId() {
        return bookIssueId;
    }

    public void setBookIssueId(Long bookIssueId) {
        this.bookIssueId = bookIssueId;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Penalty{" +
                "id=" + id +
                ", bookIssueId=" + bookIssueId +
                ", sum=" + sum +
                ", status='" + status + '\'' +
                '}';
    }
}
