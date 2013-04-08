package uk.ac.shu.webarch.eregisterassignment

class RegClass {

  String ClassId
  String ClassName

  Set instructorclass
	Course Course
  static mappedBy = [classes: 'regclass', instructorclass: 'instructorclasses']
  static hasMany = [classes: CourseClasses, instructorclass: InstructorClasses]

    static constraints = {
    }
}
