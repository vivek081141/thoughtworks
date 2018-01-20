package com.thoughtworks.recruitme.equalityProblem;

import com.thoughtworks.recruitme.services.MethodNotImplementedException;

public class Player {
  private  String name;
  private int jersyNumber;

  public Player(String name, int jerseyNumber) {
    this.name=name;
    this.jersyNumber=jerseyNumber;
  }

  @Override
  public boolean equals(Object o) {
    Player player = (Player) o;
    if (this == player) return true;

    if (jersyNumber != player.jersyNumber) return false;
    if (name != null ? !name.equals(player.name) : player.name != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + jersyNumber;
    return result;
  }

  /* public boolean equals(Player other)  {
    throw new MethodNotImplementedException("Method eqauls in class Player not implemented yet");
  }*/

}
