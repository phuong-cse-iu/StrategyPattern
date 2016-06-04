/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatterndemo;

/**
 *
 * @author TranT.Phuong
 */
public class StrategyPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Strategy addOp = new OperationAdd();
        Context addContext = new Context(addOp);
        System.out.println(addContext.executeStrategy(23, 15));
        
        Context subContext = new Context(new OperationSubstract());
        System.out.println(subContext.executeStrategy(15, 35));
    }
    
}
