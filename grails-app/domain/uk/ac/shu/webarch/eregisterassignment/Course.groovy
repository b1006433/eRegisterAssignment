package uk.ac.shu.webarch.eregisterassignment

class Course {
  String CourseId
  String CourseName

  Set classes
  static hasMany = [classes: RegClass]

  static mappedBy = [classes: 'course']

 
    static constraints = {
    }
}
