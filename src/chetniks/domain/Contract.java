/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chetniks.domain;

import java.time.LocalDateTime;

/**
 *
 * @author user
 */
public class Contract {
    public int contractId;
    public LocalDateTime start;
    public LocalDateTime finish;
    public boolean active;

    public Contract(int contractId, LocalDateTime start, LocalDateTime finish, boolean active) {
        this.contractId = contractId;
        this.start = start;
        this.finish = finish;
        this.active = active;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    
}
