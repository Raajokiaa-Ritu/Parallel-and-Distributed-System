/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author prasad
 */
public interface calculatorinterface extends Remote{
    public double add(double x,double y) throws RemoteException;
    public double sub(double x,double y) throws RemoteException;
    public double mul(double x,double y) throws RemoteException;
    public double div(double x,double y) throws RemoteException;
}
