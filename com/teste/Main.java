package com.teste;

public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main( String[] args ) {
    System.out.println( encontrarMaiorNumeroDeIteracoes( 1, 1000000 ) );

  }

  public static int processar( int num ) {
    int resultado;

    if ( num % 2 == 0 ) {
      resultado = processarPar( num );
    }
    else {
      resultado = processarImpar( num );
    }

    return resultado;
  }

  public static int processarPar( int num ) {
    return num / 2;
  }

  public static int processarImpar( int num ) {
    return (3 * num) + 1;
  }

  public static int interar( int num ) {
    int iteracoes = 0;
    while ( num > 1 ) {
      num = processar( num );
      iteracoes++;
    }
    return iteracoes;
  }

  public static int encontrarMaiorNumeroDeIteracoes( int inicio, int fim ) {
    int maiorIteracoesAtual = 0;
    int maiorNumeroAtual = 0;

    for ( int i = inicio; i <= fim; i++ ) {
      int iteracoes = interar( i );
      if ( maiorIteracoesAtual < iteracoes ) {
        maiorNumeroAtual = i;
        maiorIteracoesAtual = iteracoes;
      }
    }

    return maiorNumeroAtual;
  }

}
