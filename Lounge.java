/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitors;

/**
 *
 * @author clonyjr
 */
public class Lounge {
    
    /**
     * Número de carros reparado - contador 
     */
    private int nCarsRepaired;
    
    /**
     * Número de iterações do cliente
     */
    private int nIterCustomer;

    /**
     * Número de iterações do mecanico
     */
    private int nIterMechanic;

    /**
     * Número de iterações Geral
     */
    private int nIterGeral;
    
   /**
   *  Fila de clientes aguardando atendimento
   *
   *    @serialField queueCustomerWaitingAttending
   */
   private int [] queueCustomerWaitingAttending;

   /**
   *  Fila de mecânicos aguardando comunicar com gerente
   *
   *    @serialField queueMechanicWaitingManager
   */
   private int [] queueMechanicWaitingManager;
   
   /**
   *  Número de vezes que o cliente foi à loja
   *
   *    @serialField nTimesCustomerVisitRepair
   */
   private int nTimesCustomerVisitRepair;
   
  /**
   *  Número de carros para substituição
   *
   *    @serialField nReplaceCars
   */
   private int nReplaceCars;
  
  /**
   *  Fila de chaves dos carros
   *
   *    @serialField queueKey
   */
   private int [] queueKey;
   
   
}
