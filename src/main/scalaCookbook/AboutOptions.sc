//import play.api.libs.json.Json
//Understanding map

//http://alvinalexander.com/scala/best-practice-option-some-none-pattern-scala-idioms

val x = Some(1234)

val y = x map (a => a)


//Understanding getOrElse

case class Contact(telephone:Option[Int], mobile: Int)

case class Email(email: String, confirmEmail: String)


case class Details(email: Option[Email] = None,
                   contact: Option[Contact] = None)


val details1 = Details(email = Some(Email("aa@bb.com", "aa@bb.com")))
val details2 = Details(email = None)

//as contact is None by default - no need to specify

//val result1 = details1.email.map(_.email).getOrElse(throw new RuntimeException("email not cached"))
//val result2 = details2.email.map(_.email).getOrElse(throw new RuntimeException("email not cached"))


case class A(emails: Seq[Email])

val someA = Some(A(Seq(Email("aa@bb.com", "aa@bb.com"),Email("zz@bzzb.com", "do@yu.com"))))

val emails1 = Seq(Email("aa@bb.com", "aa@bb.com"),Email("cc@cc.com", "dd@dd.com"), Email("tt@tt.com", "uu@uu.com"))

val hello = someA.map {
  a => a.copy(emails = emails1)
}

val details3 = Details(Some(Email("aa@bb.com", "aa@bb.com")), Some(Contact(None, 123456789)))

def toInt(in: String): Option[Int] = {
  try {
    Some(Integer.parseInt(in.trim))
  } catch {
    case e: NumberFormatException => None
  }
}

val bag = List("1", "2", "foo", "3", "bar")

val lst1 = bag.flatMap(toInt)

val lst2 = bag.map(toInt).flatten // = bag.flatMap(toInt)


//==========================================
/*

val x10 = Json.parse (
  """{"uri": "/auth/oid/576aa7634a00004a00f8a043",
    "confidenceLevel": 50,
    "credentialStrength": "strong",
    "userDetailsLink": "http://localhost:9978/user-details/id/578ca5c4200000200018f922",
    "legacyOid": "576aa7634a00004a00f8a043",
    "new-session": "/auth/oid/576aa7634a00004a00f8a043/session",
    "ids": "/auth/oid/576aa7634a00004a00f8a043/ids",
    "credentials": {
      "gatewayId": "cred-id-2345235235"
    },
    "accounts": {
      "ated": {
      "utr": "XN1200000100001",
      "link": "/ated/XN1200000100001"
    },
      "org": {
      "org": "9tuPYSf-1gqhPLtuqKZhFC2YNiI",
      "link": "/org/9tuPYSf-1gqhPLtuqKZhFC2YNiI"
    }
    },
    "lastUpdated": "2016-10-07T09:44:20.002Z",
    "loggedInAt": "2016-10-07T09:44:20.002Z",
    "previouslyLoggedInAt": "2016-10-06T12:20:13.051Z",
    "levelOfAssurance": "1",
    "enrolments": "/auth/oid/576aa7634a00004a00f8a043/enrolments",
    "affinityGroup": "Organisation",
    "correlationId": "57984ae153ff47737a650f84fa16183f72c3ab17853825b03bd76d0e18f9fdf4",
    "credId": "cred-id-2345235235"
  }"""
)*/
