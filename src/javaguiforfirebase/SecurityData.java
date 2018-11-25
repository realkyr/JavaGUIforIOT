/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiforfirebase;

/**
 *
 * @author phureekanusont
 */
public class SecurityData {
    private static String current_temp = "";
    private static String control_temp = "";

    public static String getCurrent_temp() {
        return current_temp;
    }

    public static void setCurrent_temp(String current_temp) {
        SecurityData.current_temp = current_temp;
    }

    public static String getControl_temp() {
        return control_temp;
    }

    public static void setControl_temp(String control_temp) {
        SecurityData.control_temp = control_temp;
    }
    
    public static boolean is_danger(){
        if (Double.parseDouble(current_temp) > Double.parseDouble(control_temp)){
            return true;
        }
        else return false;
    }
    
}
