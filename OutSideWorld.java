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
public class OutSideWorld {
    
    /**
     * Número de clientes
     * @serialField nCustomer
     */
    private int nCustomer = 0;
    
    /**
     * Identificação carro de substituição
     * @serialField replaceCarId
     */
    private int replaceCarId = 0;
    
       /**
     * Identificação do carro
     *
     * @serialField carId
     */
    private int customerCarId = 0;
    
    /**
     * Identificação do cliente
     *
     * @serialField customerId
     */
    private int customerId = 0;

    /**
     * Operação interna
     * @param customerId
     * @return 
     */
    public boolean decideOnRepair(int customerId){
          return true;
    }

}
