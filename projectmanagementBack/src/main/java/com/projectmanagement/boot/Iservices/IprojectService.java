package com.projectmanagement.boot.Iservices;


import com.projectmanagement.boot.models.Project;

import java.util.List;

public interface IprojectService {

    boolean projectSave(Project project);
    boolean projectUpdated(Project project);
    boolean deleteById(Long id);
    Project findById(Long id);
    List<Project> findAllProject();
}
