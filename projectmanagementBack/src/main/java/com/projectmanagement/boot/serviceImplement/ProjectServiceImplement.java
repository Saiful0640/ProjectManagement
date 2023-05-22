package com.projectmanagement.boot.serviceImplement;

import com.projectmanagement.boot.Iservices.IprojectService;
import com.projectmanagement.boot.Repositories.ProjectRepo;
import com.projectmanagement.boot.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImplement implements IprojectService {

    @Autowired
    ProjectRepo projectRepo;

    @Override
    public boolean projectSave(Project project) {


        Project project1 = projectRepo.save(project);
        boolean iSsuccess = project1.getId()>0;
        return iSsuccess;
    }

    @Override
    public boolean projectUpdated(Project project) {
         projectRepo.save(project);
        return true;
    }

    @Override
    public boolean deleteById(Long id) {
        projectRepo.deleteById(id);
        return true;
    }

    @Override
    public Project findById(Long id) {
        Optional<Project> opt = projectRepo.findById(id);
        if(opt.isPresent()){
            return  opt.get();
        }
        return null;
    }

    @Override
    public List<Project> findAllProject() {
        return projectRepo.findAll();
    }
}
