/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ibrahim_Gökdemir;

/**
 *
 * @author ieren
 */
public class StaffAsset extends assets {
    
    int snumber;

    public StaffAsset(String name, String serialno, String acquisitiondate, String value, String category, String fragile, int snumber) {
        super.name = name;
        super.serialno = serialno;
        super.acquisitiondate = acquisitiondate;
        super.value = value;
        super.category = category;
        super.fragile = fragile;
       
        this.snumber = snumber;

    }
}
