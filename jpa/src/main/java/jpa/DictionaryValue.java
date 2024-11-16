package jpa;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the dictionary_value database table.
 * 
 */
@Entity
@Table(name="dictionary_value")
@NamedQuery(name="DictionaryValue.findAll", query="SELECT d FROM DictionaryValue d")
public class DictionaryValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_DICTIONARY_VALUE")
	private int idDictionaryValue;

	private byte editable;

	private String wartosc;

	//bi-directional many-to-one association to DictionaryType
	@ManyToOne
	@JoinColumn(name="ID_DICTIONARY_TYPE")
	private DictionaryType dictionaryType;

	//bi-directional many-to-one association to EntryKey
	@OneToMany(mappedBy="dictionaryValue1")
	private List<EntryKey> entryKeys1;

	//bi-directional many-to-one association to EntryKey
	@OneToMany(mappedBy="dictionaryValue2")
	private List<EntryKey> entryKeys2;

	//bi-directional many-to-one association to EntryKey
	@OneToMany(mappedBy="dictionaryValue3")
	private List<EntryKey> entryKeys3;

	//bi-directional many-to-one association to EntryKey
	@OneToMany(mappedBy="dictionaryValue4")
	private List<EntryKey> entryKeys4;

	//bi-directional many-to-one association to EntryKey
	@OneToMany(mappedBy="dictionaryValue5")
	private List<EntryKey> entryKeys5;

	public DictionaryValue() {
	}

	public int getIdDictionaryValue() {
		return this.idDictionaryValue;
	}

	public void setIdDictionaryValue(int idDictionaryValue) {
		this.idDictionaryValue = idDictionaryValue;
	}

	public byte getEditable() {
		return this.editable;
	}

	public void setEditable(byte editable) {
		this.editable = editable;
	}

	public String getWartosc() {
		return this.wartosc;
	}

	public void setWartosc(String wartosc) {
		this.wartosc = wartosc;
	}

	public DictionaryType getDictionaryType() {
		return this.dictionaryType;
	}

	public void setDictionaryType(DictionaryType dictionaryType) {
		this.dictionaryType = dictionaryType;
	}

	public List<EntryKey> getEntryKeys1() {
		return this.entryKeys1;
	}

	public void setEntryKeys1(List<EntryKey> entryKeys1) {
		this.entryKeys1 = entryKeys1;
	}

	public EntryKey addEntryKeys1(EntryKey entryKeys1) {
		getEntryKeys1().add(entryKeys1);
		entryKeys1.setDictionaryValue1(this);

		return entryKeys1;
	}

	public EntryKey removeEntryKeys1(EntryKey entryKeys1) {
		getEntryKeys1().remove(entryKeys1);
		entryKeys1.setDictionaryValue1(null);

		return entryKeys1;
	}

	public List<EntryKey> getEntryKeys2() {
		return this.entryKeys2;
	}

	public void setEntryKeys2(List<EntryKey> entryKeys2) {
		this.entryKeys2 = entryKeys2;
	}

	public EntryKey addEntryKeys2(EntryKey entryKeys2) {
		getEntryKeys2().add(entryKeys2);
		entryKeys2.setDictionaryValue2(this);

		return entryKeys2;
	}

	public EntryKey removeEntryKeys2(EntryKey entryKeys2) {
		getEntryKeys2().remove(entryKeys2);
		entryKeys2.setDictionaryValue2(null);

		return entryKeys2;
	}

	public List<EntryKey> getEntryKeys3() {
		return this.entryKeys3;
	}

	public void setEntryKeys3(List<EntryKey> entryKeys3) {
		this.entryKeys3 = entryKeys3;
	}

	public EntryKey addEntryKeys3(EntryKey entryKeys3) {
		getEntryKeys3().add(entryKeys3);
		entryKeys3.setDictionaryValue3(this);

		return entryKeys3;
	}

	public EntryKey removeEntryKeys3(EntryKey entryKeys3) {
		getEntryKeys3().remove(entryKeys3);
		entryKeys3.setDictionaryValue3(null);

		return entryKeys3;
	}

	public List<EntryKey> getEntryKeys4() {
		return this.entryKeys4;
	}

	public void setEntryKeys4(List<EntryKey> entryKeys4) {
		this.entryKeys4 = entryKeys4;
	}

	public EntryKey addEntryKeys4(EntryKey entryKeys4) {
		getEntryKeys4().add(entryKeys4);
		entryKeys4.setDictionaryValue4(this);

		return entryKeys4;
	}

	public EntryKey removeEntryKeys4(EntryKey entryKeys4) {
		getEntryKeys4().remove(entryKeys4);
		entryKeys4.setDictionaryValue4(null);

		return entryKeys4;
	}

	public List<EntryKey> getEntryKeys5() {
		return this.entryKeys5;
	}

	public void setEntryKeys5(List<EntryKey> entryKeys5) {
		this.entryKeys5 = entryKeys5;
	}

	public EntryKey addEntryKeys5(EntryKey entryKeys5) {
		getEntryKeys5().add(entryKeys5);
		entryKeys5.setDictionaryValue5(this);

		return entryKeys5;
	}

	public EntryKey removeEntryKeys5(EntryKey entryKeys5) {
		getEntryKeys5().remove(entryKeys5);
		entryKeys5.setDictionaryValue5(null);

		return entryKeys5;
	}

}