/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainProgram;

import monitors.RepairArea;
import monitors.OutSideWorld;
import monitors.Lounge;

/**
 *
 * @author clonyjr
 */
public class Customer extends Thread {

    /**
     * Identificação do cliente
     *
     * @serialField customerId
     */
    private int customerId;

    /**
     * Número de iterações do ciclo de vida do cliente
     *
     * @serialField nIter
     */
    private int nIter = 0;

    /**
     * Identificação do carro
     *
     * @serialField carId
     */
    private int customerCarId = 0;

    /**
     * Lounge
     */
    private Lounge lounge;
    
    /**
     * Mundo
     */
    private OutSideWorld oSWorld;

    /**
     * Área de reparo
     */
    private RepairArea rArea;

    /**
     * Instanciação do thread cliente.
     *
     * @param customerId identificação do cliente
     * @param lounge Lounge
     * @param nIter número de iterações do ciclo de vida do cliente
     * @param customerCarId identificação do carro
     * @param oSWorld mundo
     * @param rArea Área de reparo
     */
    public Customer(int customerId, int nIter, int customerCarId, RepairArea rArea) {
        this.customerId = customerId;
        this.customerCarId = customerCarId;
        this.rArea = rArea;
        if (nIter > 0) {
            this.nIter = nIter;
        }
    }


    /**
     * Ciclo de vida do thread cliente.
     */
    @Override
    public void run() {
        for (int i = 0; i < nIter; i++) {
                                          
            while (!oSWorld.decideOnRepair(customerId))         // o cliente leva o carro para reparo
            {
                livingNormalLife();                           // o cliente realiza as tarefas do dia a dia (com ou sem carro)
            }
        }
    }
    
    /**
     * Vivendo a vida normal (operação interna)
     */
    private void livingNormalLife() {
        try {
            sleep((long) (1 + 40 * Math.random()));
        } catch (InterruptedException e) {
        }
    }
}
