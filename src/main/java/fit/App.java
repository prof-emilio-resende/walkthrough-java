package fit;

import fit.basic.Variables;

import java.util.Collection;

import fit.basic.FlowControl;
import fit.basic.Operators;
import fit.basic.Types;
import fit.intermediate.Collections;
import fit.intermediate.Dynamics;
import fit.intermediate.Streams;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Variables.doTry();
        Types.doTry();
        Operators.doTry();
        FlowControl.doTry(2);
        Collections.doTry();
        Dynamics.doTry();
        Streams.doTry();
    }
}
