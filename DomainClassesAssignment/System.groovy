package grails3app

class System {
    int systemId;
    static belongsTo = [employee: Employee] ;
    static constraints = {
        systemId(unique: true) ;
    }
}