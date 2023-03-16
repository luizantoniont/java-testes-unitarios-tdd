package br.com.tdd.service;

import java.math.BigDecimal;

import br.com.tdd.model.Desempenho;
import br.com.tdd.model.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		BigDecimal reajuste = desempenho.percentualReajuste();
		funcionario.reajustarSalario(reajuste);
	}

}
