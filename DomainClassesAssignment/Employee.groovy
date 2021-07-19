package grails3app

class Employee {
    String empName
    int empNumber
    String location
    static hasMany = [departments:Department]

    static constraints = {
        empNumber(unique: true) ;
    }
}
