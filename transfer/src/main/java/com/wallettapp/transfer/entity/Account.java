package com.wallettapp.transfer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table (name = "WLT_T_ACCOUNT_DETAILS")
public class Account {

    @Column (name = "accountnumber")
    private String accountnumber;

    @Column (name = "customername")
    private String customerName;

//    @Column
//    private Date DOB;

    @Column (name = "customerBVN")
    private String BVN;

    @Column (name = "email")
    private String email;

    @Column
    private String password;

}
