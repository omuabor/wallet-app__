package com.wallettapp.transfer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "WLT_T_DAY2DAY_RECORDS")
public class DaytoDayRecords {

    @Column(name = "transactionId")
    private long transactionId;

    @Column (name = "accountnumber")
    private String accountNumber;

    @Column (name = "transaction")
    private String transaction;
}
