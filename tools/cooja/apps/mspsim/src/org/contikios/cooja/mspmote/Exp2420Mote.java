package org.contikios.cooja.mspmote;

import java.io.File;

import org.contikios.cooja.Simulation;
import org.contikios.cooja.mspmote.Exp5438Mote;
import org.contikios.cooja.mspmote.MspMoteType;

/**
 * @author Fredrik Osterlind
 */
public class Exp2420Mote extends Exp5438Mote {
  private String desc = "";
  
  public Exp2420Mote(MspMoteType moteType, Simulation sim) {
    super(moteType, sim);
  }

  protected boolean initEmulator(File fileELF) {
    return super.initEmulator(fileELF);
  }

  public String toString() {
    return desc + " " + getID();
  }
}
