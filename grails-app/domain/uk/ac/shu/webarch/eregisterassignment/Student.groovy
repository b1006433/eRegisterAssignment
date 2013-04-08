package uk.ac.shu.webarch.eregisterassignment

class Student {
 String StudentId
 String StudentFirstName
 String StudentLastName

  Set classes
  Set enrollments

  static hasMany = [classes: Registerentry, enrollments: Enrollment]
    
  static mappedBy = [classes: 'registerentry', enrollments:'student']

static constraints = {
    }

}


