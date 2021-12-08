/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.util.HashMap;

/**
 *
 * @author phaniginjupalli
 */
public class CategoryDropDownUtil {
    
    private static final HashMap<String, String[]> categoryMap = new HashMap<>();
    
    
    static {
        categoryMap.put("Home Appliances", new String[]{"Microwaves",
            "Home Entertainment Devices",
            "Electric cookers",
            "Heaters",
            "Fans"});
        categoryMap.put("Communications & IT Devices", new String[]{"Smartphones",
            "Desktop Computers",
            "Computer Monitor",
            "Laptops",
            "Circuit boards"});
        categoryMap.put("Home Entertainment Devices", new String[]{"IT Server Racks",
            "IT Servers",
            "Cords and Cables",
            "WiFi Dongle",
            "Audio & Video Equipment",
            "Power Strips & Power Supplies"});
        categoryMap.put("Electronic Utilities", new String[]{"Blu Ray Players",
            "Stereos",
            "Televisions",
            "Video Game Systems",
            "Fax machines",
            "Printers"});
        categoryMap.put("Office and Medical Equipment", new String[]{"Heating Pads",
            "Television Remotes",
            "Electrical Cords",
            "Lamps",
            "Smart Lights",
            "Smart Watches"});
        categoryMap.put("Other", new String[]{"other"});
    }
    
    public static String[] getList(String s) {
        return categoryMap.get(s);
    }
}
