/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Work;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author phaniginjupalli
 */
    

public abstract class WorkRequest {

    private String id;
    protected String message;
    private LocalDateTime requestDate;
    private LocalDateTime resolveDate;
    protected String status;
    
    
    public WorkRequest(){
        this.id = UUID.randomUUID().toString().substring(0,5);
        this.requestDate = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDateTime requestDate) {
        this.requestDate = requestDate;
    }

    public LocalDateTime getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(LocalDateTime resolveDate) {
        this.resolveDate = resolveDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
