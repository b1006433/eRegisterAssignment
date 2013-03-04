package uk.ac.shu.webarch.eregisterassignment

class Class {
String ClassId
String ClassName
Set classes

static mappedBy = [classes: 'regclass']

  static hasMany = [classes: InstructorClasses, CourseClass, Enrollment, Registrationsheet]
    static constraints = {
    }
}
