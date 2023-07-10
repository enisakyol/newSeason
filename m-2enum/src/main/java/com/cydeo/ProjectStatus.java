package com.cydeo;

public enum ProjectStatus {
    OPEN, CLOSED,PROGRESS("In Progress");
    String status;

    ProjectStatus(String status) {
        this.status = status;
    }

    ProjectStatus() {
    }
}
