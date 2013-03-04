package uk.ac.shu.webarch.eregisterassignment

class Instructor {
String InstructorId
String InstructorFirstName
String InstructorLastName
Set classes

static mappedBy = [classes: 'instructor']

  static hasMany = [classes: InstructorClasses]

    static constraints = {
    }
}
