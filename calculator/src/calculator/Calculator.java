/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.rmi.RemoteException;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author prasad
 */
public class Calculator extends UnicastRemoteObject implements calculatorinterface{
    
    public Calculator() throws RemoteException
    {
        double a,b;
    }
    @Override
    public double add(double a,double b) throws RemoteException
    {
        return a+b;
    }
    @Override
      public double sub(double a,double b) throws RemoteException
    {
        return a-b;
    }
    @Override
    public double mul(double a,double b) throws RemoteException
    {
        return a*b;
    }
    @Override
    public double div(double a,double b) throws RemoteException
    {
        return a/b;
    }

    /**
     * @param args the command line arguments
     */
 
    
}
