package com.femsa.oxxo.mermaautorizada.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "MAP_PERMISO_MERMA_PLAZA")
public class XxmapPermisoMermaPlaza {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="CR_PLAZA", length=50, nullable=false)
private String crPlaza; 

@Column(name="MERMA_EMPODERADA", nullable=false)
private Integer mermaEmpoderada; 

@Column(name="REGISTRO_ACTIVO", nullable=false)
private Integer registroActivo; 

@Column(name="CREATED_BY", length=50, nullable=false)
private String createdBy;

@Column(name="CREATION_DATE", nullable=false)
private Date creationDate;

@Column(name="MODIFIED_BY", length=50, nullable=false)
private String modifiedBy; 

@Column(name="MODIFIED_DATE", nullable=false)
private Date modifiedDate;



}
