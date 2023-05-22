package com.projectmanagement.boot.Iservices;

import com.projectmanagement.boot.models.Project;

@org.springframework.stereotype.Service
public interface Service {
    boolean saveProject(Project project);
    boolean updateProject(Project project);
    boolean deletByIdProject(long id);
}
