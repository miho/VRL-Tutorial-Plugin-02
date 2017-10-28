/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.gcsc.vrl.tutorial;

import eu.mihosoft.vrl.annotation.TypeInfo;
import eu.mihosoft.vrl.types.BufferedImageType;
import eu.mihosoft.vrl.visual.ImageUtils;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

@TypeInfo(type=Circle.class, input = false, output = true, style="default")
public class CircleType extends BufferedImageType {

   public CircleType(){
       setValueName(" ");
   }

   @Override
   public void setViewValue(Object o) {
       Circle circle = (Circle)o;
       
       BufferedImage image = ImageUtils.createCompatibleImage(300,300);
       Graphics2D g2 = image.createGraphics();

       g2.setColor(Color.green);
       int thickness = 5;
       g2.setStroke(new BasicStroke(thickness));

       int centerX=image.getWidth()/2;
       int centerY=image.getHeight()/2;

       int x = centerX + thickness/2 - circle.radius;
       int y = centerY + thickness/2 - circle.radius;

       int width = 2 * circle.radius-thickness/2 - 1;
       int height = 2 * circle.radius-thickness/2 - 1;

       g2.drawOval(x,y,width,height);
       g2.dispose();

       super.setViewValue(image);
   }

   @Override
   public Object getViewValue() {
       return this.value;
   }
 }