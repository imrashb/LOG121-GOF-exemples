package Strategie.Rabais;

import Decorateur.Repas.Repas;

public class StrategiePourcentageRemise implements IRabais {
  
  private IRabais rabais = null;
  private Double pourcentageRemise = 0.0;

  public StrategiePourcentageRemise(IRabais rabais, Double pourcentageRemise){
    assert(pourcentageRemise >= 0);
    assert(pourcentageRemise <= 1);
    this.pourcentageRemise = pourcentageRemise;
    this.rabais = rabais;
  }

  public Double getCost(){
    Double cost = this.rabais.getCost();
    return cost  - (cost * this.pourcentageRemise);
  }

}