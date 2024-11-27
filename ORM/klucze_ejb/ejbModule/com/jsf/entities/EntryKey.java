package com.jsf.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;


/**
 * The persistent class for the entry_key database table.
 * 
 */
@Entity
@Table(name="entry_key")
@NamedQuery(name="EntryKey.findAll", query="SELECT e FROM EntryKey e")
public class EntryKey implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ENTRY_KEY")
	private int idEntryKey;

	private String note;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="OPERATION_DATE")
	private Date operationDate;

	private byte quantity;

	private int symbol;

	//bi-directional many-to-one association to DictionaryValue
	@ManyToOne
	@JoinColumn(name="ID_DICTIONARY_INVESTMENT")
	private DictionaryValue dictionaryValue1;

	//bi-directional many-to-one association to DictionaryValue
	@ManyToOne
	@JoinColumn(name="ID_DICTIONARY_ISSUER")
	private DictionaryValue dictionaryValue2;

	//bi-directional many-to-one association to DictionaryValue
	@ManyToOne
	@JoinColumn(name="ID_DICTIONARY_OPERATION")
	private DictionaryValue dictionaryValue3;

	//bi-directional many-to-one association to DictionaryValue
	@ManyToOne
	@JoinColumn(name="ID_DICTIONARY_RECIPIENT")
	private DictionaryValue dictionaryValue4;

	//bi-directional many-to-one association to DictionaryValue
	@ManyToOne
	@JoinColumn(name="ID_DICTIONARY_TYPE_KEY")
	private DictionaryValue dictionaryValue5;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="ID_USER")
	private User user;

	public EntryKey() {
	}

	public int getIdEntryKey() {
		return this.idEntryKey;
	}

	public void setIdEntryKey(int idEntryKey) {
		this.idEntryKey = idEntryKey;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getOperationDate() {
		return this.operationDate;
	}

	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}

	public byte getQuantity() {
		return this.quantity;
	}

	public void setQuantity(byte quantity) {
		this.quantity = quantity;
	}

	public int getSymbol() {
		return this.symbol;
	}

	public void setSymbol(int symbol) {
		this.symbol = symbol;
	}

	public DictionaryValue getDictionaryValue1() {
		return this.dictionaryValue1;
	}

	public void setDictionaryValue1(DictionaryValue dictionaryValue1) {
		this.dictionaryValue1 = dictionaryValue1;
	}

	public DictionaryValue getDictionaryValue2() {
		return this.dictionaryValue2;
	}

	public void setDictionaryValue2(DictionaryValue dictionaryValue2) {
		this.dictionaryValue2 = dictionaryValue2;
	}

	public DictionaryValue getDictionaryValue3() {
		return this.dictionaryValue3;
	}

	public void setDictionaryValue3(DictionaryValue dictionaryValue3) {
		this.dictionaryValue3 = dictionaryValue3;
	}

	public DictionaryValue getDictionaryValue4() {
		return this.dictionaryValue4;
	}

	public void setDictionaryValue4(DictionaryValue dictionaryValue4) {
		this.dictionaryValue4 = dictionaryValue4;
	}

	public DictionaryValue getDictionaryValue5() {
		return this.dictionaryValue5;
	}

	public void setDictionaryValue5(DictionaryValue dictionaryValue5) {
		this.dictionaryValue5 = dictionaryValue5;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}