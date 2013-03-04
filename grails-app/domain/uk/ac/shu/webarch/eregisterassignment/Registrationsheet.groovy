package uk.ac.shu.webarch.eregisterassignment

class Registrationsheet {
	String RegisterStreetId
	String ClassId
	
Set classes

static mappedBy = [classes: 'registerentry']

  static hasMany = [classes: Registerentry]

Class class
    static constraints = {
    }
}
