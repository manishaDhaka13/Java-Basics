public class Student {
    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public Student(String id, String name, String dateOfBirth, String classList){
        this.id=id;
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.classList=classList;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }
    public void setClassList(String classList){
        this.classList=classList;
    }

    @Override    // @ denote annotation (statement start from @ is called annotation means data about data means metadata
    // we are overriding this method means we are using same signature to define the method in other class

        public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
}

