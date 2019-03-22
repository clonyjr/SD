/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainProgram;

import monitors.RepairArea;

/**
 *
 * @author clonyjr
 */
public class Mechanic extends Thread{
    
     /**
     * Identificação do mecanico
     *
     * @serialField mechanicId
     */
    private int mechanicId;
       
    /**
     * Área de Reparo
     * rArea
     */
    private RepairArea rArea;
            
            
    /**
     * 
     * @param mechanicId
     * @param rArea 
     */

    Mechanic(int mechanicId, RepairArea rArea) {
        this.mechanicId = mechanicId;
        this.rArea = rArea;
    }
    
    
   /**
   *  Concertando um carro (operação interna).
   */

   private void fixIt ()
   {
      try
      { sleep ((long) (1 + 100 * Math.random ()));
      }
      catch (InterruptedException e) {}
   }

}
