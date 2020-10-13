$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test_openweathermap_login.feature");
formatter.feature({
  "line": 1,
  "name": "Test login feature",
  "description": "",
  "id": "test-login-feature",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I launch the page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I open the login page",
  "keyword": "And "
});
formatter.match({
  "location": "CommonStepDefs.launchLoginPage()"
});
formatter.result({
  "duration": 2442752856,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.launchLoginPage()"
});
formatter.result({
  "duration": 2377426596,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Users login successfully",
  "description": "",
  "id": "test-login-feature;users-login-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I enter user name \u0027wizetest1@gmail.com\u0027 and password \u0027autotest\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I see the message \u0027Signed in successfully.\u0027 on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I see the home page menu",
  "rows": [
    {
      "cells": [
        "New Products",
        "Services",
        "API keys",
        "Billing plans",
        "Payments",
        "Block logs",
        "My orders",
        "My profile"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "wizetest1@gmail.com",
      "offset": 19
    },
    {
      "val": "autotest",
      "offset": 54
    }
  ],
  "location": "LoginStepDefs.verifyLoginSuccessfullyCucumber(String,String)"
});
formatter.result({
  "duration": 2347329666,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Signed in successfully.",
      "offset": 19
    }
  ],
  "location": "HomePageStepDefs.checkLoginMessage(String)"
});
formatter.result({
  "duration": 27144950,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefs.checkHomePageMenu(DataTable)"
});
formatter.result({
  "duration": 127550293,
  "status": "passed"
});
formatter.after({
  "duration": 116010520,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 14,
  "name": "Verify Invalid Login",
  "description": "",
  "id": "test-login-feature;verify-invalid-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I enter user name \u0027\u003cusername\u003e\u0027 and password \u0027\u003cpassword\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I see the message \u0027\u003cerror_message\u003e\u0027 on home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "test-login-feature;verify-invalid-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "error_message"
      ],
      "line": 19,
      "id": "test-login-feature;verify-invalid-login;;1"
    },
    {
      "cells": [
        "invalidUsername",
        "autotest",
        "Invalid Email or password."
      ],
      "line": 20,
      "id": "test-login-feature;verify-invalid-login;;2"
    },
    {
      "cells": [
        "wizetest1@gmail.com",
        "invalidPassword",
        "Invalid Email or password."
      ],
      "line": 21,
      "id": "test-login-feature;verify-invalid-login;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I launch the page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I open the login page",
  "keyword": "And "
});
formatter.match({
  "location": "CommonStepDefs.launchLoginPage()"
});
formatter.result({
  "duration": 1113736842,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.launchLoginPage()"
});
formatter.result({
  "duration": 2197034095,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify Invalid Login",
  "description": "",
  "id": "test-login-feature;verify-invalid-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I enter user name \u0027invalidUsername\u0027 and password \u0027autotest\u0027",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I see the message \u0027Invalid Email or password.\u0027 on home page",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "invalidUsername",
      "offset": 19
    },
    {
      "val": "autotest",
      "offset": 50
    }
  ],
  "location": "LoginStepDefs.verifyLoginSuccessfullyCucumber(String,String)"
});
formatter.result({
  "duration": 510037360,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid Email or password.",
      "offset": 19
    }
  ],
  "location": "HomePageStepDefs.checkLoginMessage(String)"
});
formatter.result({
  "duration": 29734632,
  "status": "passed"
});
formatter.after({
  "duration": 95974569,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I launch the page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I open the login page",
  "keyword": "And "
});
formatter.match({
  "location": "CommonStepDefs.launchLoginPage()"
});
formatter.result({
  "duration": 1188818364,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.launchLoginPage()"
});
formatter.result({
  "duration": 3111720656,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Verify Invalid Login",
  "description": "",
  "id": "test-login-feature;verify-invalid-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I enter user name \u0027wizetest1@gmail.com\u0027 and password \u0027invalidPassword\u0027",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I see the message \u0027Invalid Email or password.\u0027 on home page",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "wizetest1@gmail.com",
      "offset": 19
    },
    {
      "val": "invalidPassword",
      "offset": 54
    }
  ],
  "location": "LoginStepDefs.verifyLoginSuccessfullyCucumber(String,String)"
});
formatter.result({
  "duration": 709824599,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid Email or password.",
      "offset": 19
    }
  ],
  "location": "HomePageStepDefs.checkLoginMessage(String)"
});
formatter.result({
  "duration": 30942806,
  "status": "passed"
});
formatter.after({
  "duration": 106903260,
  "status": "passed"
});
});