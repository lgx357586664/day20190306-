package json;

import java.util.List;

/**
 * @author: LiGX
 * @Date: 2019/3/6 0006
 */
public class Person {
    private String id;
    private String name;
    private List<Project> project;

    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }

    public Person(String id, String name, List<Project> project) {
        this.id = id;
        this.name = name;
        this.project = project;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", project=" + project +
                '}';
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
class Project{
    private String pId;
    private String pName;

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Project(String pId, String pName) {
        this.pId = pId;
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "Project{" +
                "pId='" + pId + '\'' +
                ", pName='" + pName + '\'' +
                '}';
    }

    public Project() {
    }
}