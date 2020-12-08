package com.lti.admininputs;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="admininputs")
public class AdminInputs {
@Id
private long ReferenceId ;
@Temporal(TemporalType.DATE)
private Date AporovalDate;
@Column
private  String APPROVAL;
@Column
private  String ACCOUNT_NO;
@Column
private  String ADMIN_REMARKS;

}
