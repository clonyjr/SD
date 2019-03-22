/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitors;

import mainProgram.Manager;
import genclass.GenericIO;
import genclass.TextFile;

/**
 *
 * @author clonyjr
 */
public class RepairArea {
    
     /**
   *  Constantes que caracterizam o estado interno dos threads customer, mechanic e manager.
   */

   private final static int SLEEPING = 0,                  // o mecanico está a dormir
                            WORKING  = 0,                  // o mecanico está a trabalhar
                            NORMAL_LIFE_WITH_CAR = 0,      // o cliente vive a vida normal com o carro 
                            NORMAL_LIFE_WITHOUT_CAR  = 0,  // o cliente vive a vida normal sem o carro 
                            WAITING_FOR_REPLACE_CAR = 0,   // o cliente quer o carro reserva
                            ATTENDING_CUSTOMER = 0,        // o manager está atendendo um cliente
                            ALERT_CUSTOMER  = 0,           // o manager está alertando o cliente
                            DECIDE_ON_REPAIR  = 0,         // o customer decide ir à Área de reparo
                            POSTING_JOB     = 0;
  
   /**
   *  Identificação dos mecanicos
   *
   *    @serialField mechacnicId
   */
   private int mechanicId = 0;

  /**
   *  Número de Peças
   *
   *    @serialField nPart
   */

   private int nPart;

  /**
   *  Identificação do carro substituto
   *
   *    @serialField replaceCarId
   */

   private int replaceCarId;

  /**
   *  Número de clientes que frequentam a barbearia
   *
   *    @serialField nCustomer
   */

   private int nCustomer = 0;

   /**
   *  Número de mecanicos na área de reparo
   *
   *    @serialField nMechanic
   */

   private int nMechanics = 0;

   
      /**
   *  Número de gerentes na área de reparo
   *
   *    @serialField nManager
   */

   private Manager manager;

  /**
   *  Estado presente dos mecanicos
   *
   *    @serialField stateMechanic
   */

   private int [] stateMechanic;

  /**
   *  Estado presente dos clientes
   *
   *    @serialField stateCustomer
   */

   private int [] stateCustomer;

  /**
   *  Fila de espera (clientes) aguardando
   *
   *    @serialField sitCustomer
   */

   private MemFIFO sitCustomer;

  /**
   *  Nome do ficheiro de logging
   *
   *    @serialField fileName
   */

   private String fileName = "log.txt";

  /**
   *  Número de iterações do ciclo de vida dos clientes
   *
   *    @serialField nIter
   */

   private int nIter = 0;
   
   /**
   *  Número de visitas do cliente à area de reparo
   *
   *    @serialField nCustomerVisits
   */

   private int nCustomerVisits = 0;
   
     /**
   *  Instanciação da barbearia.
   *
   *    @param nManager número de gerentes na Área de Reparo
   *    @param nMechanic número de mecanicos na Área de Reparo
   *    @param nCustomer número de clientes na Área de Reparo
   *    @param nPart número de peças disponíveis na Área de Reparo
   *    @param fileName nome do ficheiro de logging
   *    @param nIter número de iterações do ciclo de vida dos clientes
   *    @param nCustomerVisits Número de visitas do cliente à area de reparo
    */

    /**
     * Instanciação da Área de Reparo.
     * 
     * @param manager gerentes na Área de Reparo
     * @param nMechanic número de mecanicos na Área de Reparo
     * @param nCustomer número de clientes na Área de Reparo
     * @param nPart número de peças disponíveis na Área de Reparo
     * @param fileName nome do ficheiro de logging
     * @param nIter número de iterações do ciclo de vida dos clientes
     * @param nCustomerVisits Número de visitas do cliente à area de reparo
     */
    public RepairArea(Manager manager, int nMechanics, int nCustomer, int nPart, String fName, int nIter, int nCustomerVisits) {
        
        /* fixar os parâmetros do problema */
        this.manager = manager;
        if (nMechanics > 0) this.nMechanics = nMechanics;
        if (nPart > 0) this.nPart = nPart;
        if (nCustomer > 0) this.nCustomer = nCustomer;
        if (nIter > 0) this.nIter = nIter;
        if (nCustomerVisits > 0) this.nIter = nIter;
        
        /* inicializar o ficheiro de logging */
        if ((fileName != null) && !("".equals (fileName))) this.fileName = fileName;
        reportInitialStatus ();

    }        
      
      public void goToRepairShop(int customerId){
          
      }
      
   /**
   *  Escrever o estado inicial (operação interna).
   *  <p>Os barbeiros estão a dormir e os clientes a realizar as tarefas do dia a dia.
   */
    private void reportInitialStatus (){}
      
      /**
   *  Escrever o estado actual (operação interna).
   *  <p>Uma linha de texto com o estado de actividade dos barbeiros e dos clientes é escrito no ficheiro.
   */

   private void reportStatus (){}
   
     /**
   *  Operação de chamar o cliente (originada pelo barbeiro).
   *
   *    @param barberId identificação do barbeiro
   *
   *    @return identificação do cliente
   */

   public synchronized int callCustomer (int customerId)
   {
      stateMechanic[mechanicId] = WORKING;                            // sinaliza que está em actividade
      customerId = ((Integer) sitCustomer.read ()).intValue ();      // chama o cliente
      stateCustomer[customerId] = 0;                                // sinaliza que o cliente está a cortar o cabelo
      reportStatus ();
      
      return (customerId);
   }

      
}
