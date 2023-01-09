package br.com.mrsalustiano.helpdesk.domain.enums;

public enum Prioridade {
	
	BAIXA(0, "BAIXA"),
	MEDIA(1, "MEDIA"),
	ALTA(2, "ALTA");

	private Integer codigo;
	private String descricao;
	
	private Prioridade(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
	public static Prioridade toEnum(Integer code) {
		if (code == null) {
			return null;
		} 
		
		for (Prioridade perf : Prioridade.values()) {
			if (code.equals(perf.getCodigo())) {
				return perf;
			}
		}
		throw new IllegalArgumentException("PRIORIDADE Invalida");
	}
	

	

}
