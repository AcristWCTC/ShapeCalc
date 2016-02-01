package Part2;

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
public class RectCalcService {

    public String calcRectangle(double length, double width) {
        double area = 0;
        String stringArea = null;

        area = length * width;
        stringArea = Double.toString(area);

        return "The Area of the rectangle is " + stringArea;

    }
}
