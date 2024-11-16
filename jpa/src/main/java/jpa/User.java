package jpa;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_USER")
	private int idUser;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="LAST_NAME")
	private String lastName;

	private String login;

	@Column(name="PASSWORD_HASH")
	private String passwordHash;

	//bi-directional many-to-one association to EntryKey
	@OneToMany(mappedBy="user")
	private List<EntryKey> entryKeys;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="ID_ROLE")
	private Role role;

	public User() {
	}

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPasswordHash() {
		return this.passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public List<EntryKey> getEntryKeys() {
		return this.entryKeys;
	}

	public void setEntryKeys(List<EntryKey> entryKeys) {
		this.entryKeys = entryKeys;
	}

	public EntryKey addEntryKey(EntryKey entryKey) {
		getEntryKeys().add(entryKey);
		entryKey.setUser(this);

		return entryKey;
	}

	public EntryKey removeEntryKey(EntryKey entryKey) {
		getEntryKeys().remove(entryKey);
		entryKey.setUser(null);

		return entryKey;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}