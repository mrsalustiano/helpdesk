package br.com.mrsalustiano.helpdesk.domain.enums;

public enum Perfil {
	
	ADMIN(0, "ROLE_ADMIN"),
	CLIENTE(1, "ROLE_CLIENTE"),
	TECNICO(2, "ROLE_TECNICO");

	private Integer codigo;
	private String descricao;
	
	private Perfil(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
	public static Perfil toEnum(Integer code) {
		if (code == null) {
			return null;
		} 
		
		for (Perfil perf : Perfil.values()) {
			if (code.equals(perf.getCodigo())) {
				return perf;
			}
		}
		throw new IllegalArgumentException("Perfil Invalido");
	}
	

	

}
