package com.projectmanagement.boot.models;

public enum ProjectStatus {
    pre, start, end;

    public int getProjectStatusValue() {
        switch (this) {
            case pre:
                return 0;
            case start:
                return 1;
            default:
                return 3;
        }
    }

}
