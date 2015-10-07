package com.teste;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class MainTest {

  @Test
  public void quandoInformarNumeroParRetornarEleMesmoDivididoPor2Test() {
    assertEquals( 5, Main.processar( 10 ) );
  }

  @Test
  public void quandoInformarNumeroImparRetornarEleMesmoMultiplicadoPor3Mais1Test() {
    assertEquals( 10, Main.processar( 3 ) );
  }

  @Test
  public void quandoInformarNumero13DeveIterar9VezesTest() {
    assertEquals( 9, Main.interar( 13 ) );
  }

  @Test
  public void quandoIntervaloForDe1a4DeveRetornar3() {
    assertEquals( 3, Main.encontrarMaiorNumeroDeIteracoes( 1, 4 ) );
  }

}
