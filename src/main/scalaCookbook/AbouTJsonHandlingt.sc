import play.api.libs.json.Json

val jsVal = Json.parse(
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
)

val jsVal1 = Json.parse(
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
    		"taxsAgent": {
    			"uar": "V3264H",
    			"link": "/taxsAgent/V3264H"
    		},
    		"agent": {
    			"agentCode": "ABCDEF123456",
    			"agentUserRole": "admin",
    			"agentUserId": "ZMOQ1hrrP-9ZmnFw0kIA5vlc-mo",
    			"payeReference": "HZ1234",
    			"agentBusinessUtr": "JARN1234567",
    			"link": "/agent/ABCDEF123456"
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
)


/*

val userType1 = {
  jsVal \ "accounts" \ "ated" \ "utr"
}.asOpt[String]
*/


val userType2 = {jsVal1 \ "accounts" \ "agent" \ "agentBusinessUtr"}.asOpt[String].fold("client")( a => "agent")
//val userType1 = {jsVal \ "accounts" \ "agent" \ "agentBusinessUtr"}.asOpt[String].fold("agent"){ a => {a \ "accounts" \ "ated" \ "utr"}.as[String] }


val numbers = List(5, 4, 8, 6, 2)
val numbers1 = List()

val res = numbers1.fold(0) { (z, i) =>
  z + i
}

