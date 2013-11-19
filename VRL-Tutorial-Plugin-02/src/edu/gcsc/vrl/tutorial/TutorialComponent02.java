/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gcsc.vrl.tutorial;

import eu.mihosoft.vrl.annotation.ComponentInfo;
import eu.mihosoft.vrl.annotation.ParamInfo;
import java.io.Serializable;

/**
 *
 * @author Michael Hoffer <info@michaelhoffer.de>
 */
@ComponentInfo(name="TutorialComponent02", category="TutorialPlugin/02",description = "Creates Circle Objects")
public class TutorialComponent02 implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    
    public Circle createCircle(@ParamInfo(name="radius", style="slider", options="min=1; max=80;invokeOnChange=true") int radius) {
        return new Circle(radius);
    }
    
}
