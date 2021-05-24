package free.com.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name = "t_creating_menu_mid")
@IdClass(MenuKey.class)
public class CreatingMenuMid implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CreatingMenuMid() {
	}

	@Id
	@Column(name = "dmp_menu_id")
	private String dmpMenuId;
	
	@Column(name = "dmp_menu_memo")
	private String dmpMenuMemo;
	
	@Column(name = "dmp_menu_crt_flg")
	private String dmpMenuCrtFlg;
	
	@Column(name = "dmp_menu_crt_end_flg")
	private String dmpMenuCrtEndFlg;
	
	@Column(name = "dmp_menu_crt_process")
	private String dmpMenuCrtProcess;
	
	@Column(name = "menu_group_id")
	private String menuGroupId;

	@Column(name = "menu_group_name")
	private String menuGroupName;

	@Column(name = "menu_id")
	private String menuId;

	@Column(name = "menu_name")
	private String menuName;

	@Column(name = "ins_date")
	private Date insDate;

	@Column(name = "ins_user_id")
	private String insUserId;

	@Column(name = "ins_program")
	private String insProgram;

	@Column(name = "upd_date")
	private Date updDate;

	@Column(name = "upd_user_id")
	private String updUserId;

	@Column(name = "upd_program")
	private String updProgram;

	@Column(name = "lock_version")
	private String lockVersion;

	public String getDmpMenuId() {
		return dmpMenuId;
	}

	public void setDmpMenuId(String dmpMenuId) {
		this.dmpMenuId = dmpMenuId;
	}

	public String getDmpMenuMemo() {
		return dmpMenuMemo;
	}

	public void setDmpMenuMemo(String dmpMenuMemo) {
		this.dmpMenuMemo = dmpMenuMemo;
	}

	public String getDmpMenuCrtFlg() {
		return dmpMenuCrtFlg;
	}

	public void setDmpMenuCrtFlg(String dmpMenuCrtFlg) {
		this.dmpMenuCrtFlg = dmpMenuCrtFlg;
	}

	public String getDmpMenuCrtEndFlg() {
		return dmpMenuCrtEndFlg;
	}

	public void setDmpMenuCrtEndFlg(String dmpMenuCrtEndFlg) {
		this.dmpMenuCrtEndFlg = dmpMenuCrtEndFlg;
	}

	public String getDmpMenuCrtProcess() {
		return dmpMenuCrtProcess;
	}

	public void setDmpMenuCrtProcess(String dmpMenuCrtProcess) {
		this.dmpMenuCrtProcess = dmpMenuCrtProcess;
	}

	public String getMenuGroupId() {
		return menuGroupId;
	}

	public void setMenuGroupId(String menuGroupId) {
		this.menuGroupId = menuGroupId;
	}

	public String getMenuGroupName() {
		return menuGroupName;
	}

	public void setMenuGroupName(String menuGroupName) {
		this.menuGroupName = menuGroupName;
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public Date getInsDate() {
		return insDate;
	}

	public void setInsDate(Date insDate) {
		this.insDate = insDate;
	}

	public String getInsUserId() {
		return insUserId;
	}

	public void setInsUserId(String insUserId) {
		this.insUserId = insUserId;
	}

	public String getInsProgram() {
		return insProgram;
	}

	public void setInsProgram(String insProgram) {
		this.insProgram = insProgram;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	public String getUpdUserId() {
		return updUserId;
	}

	public void setUpdUserId(String updUserId) {
		this.updUserId = updUserId;
	}

	public String getUpdProgram() {
		return updProgram;
	}

	public void setUpdProgram(String updProgram) {
		this.updProgram = updProgram;
	}

	public String getLockVersion() {
		return lockVersion;
	}

	public void setLockVersion(String lockVersion) {
		this.lockVersion = lockVersion;
	}

}
