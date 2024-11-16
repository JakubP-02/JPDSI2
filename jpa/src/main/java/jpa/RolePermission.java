package jpa;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the role_permission database table.
 * 
 */
@Entity
@Table(name="role_permission")
@NamedQuery(name="RolePermission.findAll", query="SELECT r FROM RolePermission r")
public class RolePermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ROLE_PERMISSION")
	private int idRolePermission;

	//bi-directional many-to-one association to Permission
	@ManyToOne
	@JoinColumn(name="ID_PERMISSION")
	private Permission permission;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="ID_ROLE")
	private Role role;

	public RolePermission() {
	}

	public int getIdRolePermission() {
		return this.idRolePermission;
	}

	public void setIdRolePermission(int idRolePermission) {
		this.idRolePermission = idRolePermission;
	}

	public Permission getPermission() {
		return this.permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}