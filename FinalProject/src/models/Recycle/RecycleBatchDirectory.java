/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Recycle;

import java.util.ArrayList;

/**
 *
 * @author phaniginjupalli
 */
public class RecycleBatchDirectory {
    
    ArrayList<RecycleBatch> batches;
    
    public RecycleBatchDirectory() {
        this.batches = new ArrayList<>();
    }

    public ArrayList<RecycleBatch> getBatches() {
        return batches;
    }
    
    public RecycleBatch addRecycleBatch(RecycleBatch recycleBatch) {
        this.batches.add(recycleBatch);
        return recycleBatch;
    }
    
}
