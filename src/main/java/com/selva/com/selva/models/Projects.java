package com.selva.com.selva.models;

/**
 * Created by Selva on 4/5/17.
 */
public class Projects {

    public int projectId;
    public String projectName;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                '}';
    }

    public Projects(int projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Projects projects = (Projects) o;

        if (projectId != projects.projectId) return false;
        return projectName.equals(projects.projectName);
    }

    @Override
    public int hashCode() {
        int result = projectId;
        result = 31 * result + projectName.hashCode();
        return result;
    }
}
