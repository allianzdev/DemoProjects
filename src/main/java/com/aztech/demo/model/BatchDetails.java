package com.aztech.pulse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ir_claim_batch_status")
public class BatchDetails implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 531234284192075592L;

    @Id
    @Column(name = "claim_batch_id", nullable = false)
    private Integer claimBatchId;

    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "since_date")
    private Date sinceDate;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "status")
    private String status;

    public void setClaimBatchId(Integer claimBatchId) {
        this.claimBatchId = claimBatchId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getSinceDate() {
        return sinceDate;
    }

    public void setSinceDate(Date sinceDate) {
        this.sinceDate = sinceDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
