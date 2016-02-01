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
public class TriangleCalcService {
    
        public String calcTriangle(double side1, double side2) {
        double side3 = 0;
        String stringSide3 = null;

        side3 = (side1 * side1) + (side2 * side2);
        side3 = Math.sqrt(side3);
        stringSide3 = Double.toString(side3);

        return "The Third side of that triangle is " + stringSide3;

    }
    
}
