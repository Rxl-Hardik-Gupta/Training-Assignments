package grails3app

class Department {

    String departmentName
    int departmentId
    String location
    static hasMany = [employees: Employee] ;

    static constraints = {
        departmentId(unique: true)
    }
}
