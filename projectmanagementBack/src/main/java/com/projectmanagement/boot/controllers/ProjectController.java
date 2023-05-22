package com.projectmanagement.boot.controllers;

import com.projectmanagement.boot.Iservices.IprojectService;
import com.projectmanagement.boot.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProjectController {

    @Autowired
    IprojectService iprojectService;

    @PostMapping("/saveProject")
    public ResponseEntity<Boolean> saveProject(@RequestBody Project project){
        iprojectService.projectSave(project);
        return  ResponseEntity.ok(true);
    }

    @PutMapping("/updateProject")
    public ResponseEntity<Boolean> updateProject(@RequestBody Project project){
        iprojectService.projectSave(project);
        return ResponseEntity.ok(true);
    }
    @DeleteMapping("/deleteProject/{id}")
    public ResponseEntity<String> deleteProejct(@PathVariable Long id){
        iprojectService.deleteById(id);
        String message = "Project Delete!"+id;
        return ResponseEntity.ok(message);
    }
    @GetMapping("/getOneProejct/{id}")
    public ResponseEntity<Project>getByIdProject(@PathVariable Long id){
        Project project = iprojectService.findById(id);
        return ResponseEntity.ok(project);
    }
    @GetMapping("/getAllProejct")
    public ResponseEntity<List<Project>> getAllProject(){
        List<Project> project =iprojectService.findAllProject();
        return ResponseEntity.ok(project);
    }
}
