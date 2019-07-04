
public class InterfaceName {
	String interfaceName;
	String ipAddress;
	String description;
	String ifSpeed;
	String duplexMode;
	String adminStatus;
	String operationStatus;
	String macAddress;
	String mtu;
	

	public InterfaceName() {
	}


	public InterfaceName(String interfaceName, String ipAddress, String description, String ifSpeed, String duplexMode,
			String adminStatus, String operationStatus, String macAddress, String mtu) {
		super();
		this.interfaceName = interfaceName;
		this.ipAddress = ipAddress;
		this.description = description;
		this.ifSpeed = ifSpeed;
		this.duplexMode = duplexMode;
		this.adminStatus = adminStatus;
		this.operationStatus = operationStatus;
		this.macAddress = macAddress;
		this.mtu = mtu;
	}


	public String getInterfaceName() {
		return interfaceName;
	}


	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}


	public String getIpAddress() {
		return ipAddress;
	}


	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getIfSpeed() {
		return ifSpeed;
	}


	public void setIfSpeed(String ifSpeed) {
		this.ifSpeed = ifSpeed;
	}


	public String getDuplexMode() {
		return duplexMode;
	}


	public void setDuplexMode(String duplexMode) {
		this.duplexMode = duplexMode;
	}


	public String getAdminStatus() {
		return adminStatus;
	}


	public void setAdminStatus(String adminStatus) {
		this.adminStatus = adminStatus;
	}


	public String getOperationStatus() {
		return operationStatus;
	}


	public void setOperationStatus(String operationStatus) {
		this.operationStatus = operationStatus;
	}


	public String getMacAddress() {
		return macAddress;
	}


	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}


	public String getMtu() {
		return mtu;
	}


	public void setMtu(String mtu) {
		this.mtu = mtu;
	}
	

}
