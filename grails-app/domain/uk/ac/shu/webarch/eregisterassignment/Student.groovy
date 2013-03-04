package uk.ac.shu.webarch.eregisterassignment

class Student {
 String StudentId
 String StudentFirstName
 String StudentLastName

Set classes

static mappedBy = [classes: 'registerentry', 'enrollment']

  static hasMany = [classes: Registerentry, Enrollment]
    static constraints = {
    }
}


