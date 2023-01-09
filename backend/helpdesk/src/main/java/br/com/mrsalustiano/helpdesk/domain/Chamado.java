package br.com.mrsalustiano.helpdesk.domain;

import java.io.Serializable;
import java.time.LocalDate;

import br.com.mrsalustiano.helpdesk.domain.enums.Prioridade;
import br.com.mrsalustiano.helpdesk.domain.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Chamado  implements Serializable{
 
	private static final long serialVersionUID = 1L;

	
	private Long id;
	private LocalDate dataAbertura = LocalDate.now();
	private LocalDate dataFechamento;
	private Prioridade prioridade;
	private Status status;
	private String titulo;
	private String observacoes;
	private Tecnico tecnico;
	private Cliente cliente;
	
	
}
