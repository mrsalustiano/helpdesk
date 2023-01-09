package br.com.mrsalustiano.helpdesk.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
@EqualsAndHashCode(callSuper = false)
public  class Tecnico extends Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Chamado> chamados = new ArrayList<>();
	
	

}
