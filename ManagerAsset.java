/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ibrahim_Gökdemir;

/**
 *
 * @author ieren
 */
public class ManagerAsset extends assets {

    String managername;
    int mnumber;

    public ManagerAsset(String name, String serialno, String acquisitiondate, String value, String category, String fragile, String managername, int mnumber) {
        super.name = name;
        super.serialno = serialno;
        super.acquisitiondate = acquisitiondate;
        super.value = value;
        super.category = category;
        super.fragile = fragile;
        this.managername = managername;
        this.mnumber = mnumber;

    }

}
