package uk.ac.shu.webarch.eregisterassignment

class Course {
String CourseId
String CourseName

Set classes

static mappedBy = [classes: 'course']

  static hasMany = [classes: CourseClasses, InstructorClasses, Enrollment, RegistrationSheet]
    static constraints = {
    }
}
