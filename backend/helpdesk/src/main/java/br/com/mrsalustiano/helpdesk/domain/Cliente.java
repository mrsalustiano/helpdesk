package br.com.mrsalustiano.helpdesk.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
public class Cliente extends Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Chamado> chamados = new ArrayList<>();
	
	

}
