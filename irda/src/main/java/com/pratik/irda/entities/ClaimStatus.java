package com.pratik.irda.entities;

import javax.persistence.*;

@Entity
@Table(name = "claim_status")
public class ClaimStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stage;
    private int count;

    public ClaimStatus() {
    }

    public ClaimStatus(String stage, int count) {
        this.stage = stage;
        this.count = count;
    }

    @Override
    public String toString() {
        return "ClaimStatus{" +
                "stage='" + stage + '\'' +
                ", count=" + count +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

