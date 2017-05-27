val iamVal = "Hi, I am val!" //evaluated

lazy val imaLazyVal = "Hi, I am lazy val!" //evaluated, this is surprising !
//Reason: It's already inside the main() method
//try REPL to get the original thing !!

def iamDef = "Hi, I am def!" // not evaluted

def letsSee = iamDef // not evaluated

letsSee //iamDef is evaluated when invoked

// --- let's go one step further ----

val imaValRandom = Math.random()

def imaDefRandom =  Math.random()

def letsSeeValRandom = imaValRandom

def letsSeeDefRandom = imaDefRandom

//Now,

letsSeeValRandom
//whatever gets initialised in the val above is printed here

letsSeeDefRandom
//thsi siprinted here quite randomly