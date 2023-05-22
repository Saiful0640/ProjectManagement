package com.projectmanagement.boot.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="project")
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @Column(name="projectname")
    private String projectName;
    @Column(name="projectintroduce")
    private String projectIntroduce;
    @Column(name="projectowner")
    private String projectOwner;
    @Enumerated(EnumType.STRING)
    @Column(name="projectstatus")
    private ProjectStatus projectStatus;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate startTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate deadline;
    @ElementCollection
    private List<String> projectMembers ;

}
