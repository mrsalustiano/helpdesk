package br.com.mrsalustiano.helpdesk.domain.enums;

public enum Status {
	
	ABERTO(0, "ABERTO"),
	ANDAMENTO(1, "ANDAMENTO"),
	ENCERRADO(2, "ENCERRADO");

	private Integer codigo;
	private String descricao;
	
	private Status(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
	public static Status toEnum(Integer code) {
		if (code == null) {
			return null;
		} 
		
		for (Status perf : Status.values()) {
			if (code.equals(perf.getCodigo())) {
				return perf;
			}
		}
		throw new IllegalArgumentException("STATUS Invalido");
	}
	

	

}
