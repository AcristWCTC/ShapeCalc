package Part3;

import Part2.*;
import Part1.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class CircleCalcService {
    
        public String calcCircle(double radius) {
        double area = 0;
        String stringArea = null;

        area = Math.PI * (radius * radius);
        stringArea = Double.toString(area);

        return "The Area of the circle is " + stringArea;

    }
    
}
