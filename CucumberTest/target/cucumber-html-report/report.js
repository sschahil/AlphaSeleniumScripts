$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyApplication.feature");
formatter.feature({
  "line": 1,
  "name": "Test Facebook smoke scenario",
  "description": "",
  "id": "test-facebook-smoke-scenario",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter valid \"\u003cusername\u003e\" and valid \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "application should be closed",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "example@gmail.com",
        "password1"
      ],
      "line": 11,
      "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials;;2"
    },
    {
      "cells": [
        "example1@gmail.com",
        "password2"
      ],
      "line": 12,
      "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials;;3"
    },
    {
      "cells": [
        "example2@gmail.com",
        "password3"
      ],
      "line": 13,
      "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials;;4"
    },
    {
      "cells": [
        "example3@gmail.com",
        "password4"
      ],
      "line": 14,
      "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter valid \"example@gmail.com\" and valid \"password1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "application should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.open_chrome_and_start_application()"
});
formatter.result({
  "duration": 5913186737,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "example@gmail.com",
      "offset": 15
    },
    {
      "val": "password1",
      "offset": 45
    }
  ],
  "location": "SmokeTest.i_enter_valid_and_valid(String,String)"
});
formatter.result({
  "duration": 689243871,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 4938100689,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.application_should_be_closed()"
});
formatter.result({
  "duration": 1009037693,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter valid \"example1@gmail.com\" and valid \"password2\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "application should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.open_chrome_and_start_application()"
});
formatter.result({
  "duration": 4366423336,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "example1@gmail.com",
      "offset": 15
    },
    {
      "val": "password2",
      "offset": 46
    }
  ],
  "location": "SmokeTest.i_enter_valid_and_valid(String,String)"
});
formatter.result({
  "duration": 590129681,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 1951879987,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.application_should_be_closed()"
});
formatter.result({
  "duration": 872829447,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter valid \"example2@gmail.com\" and valid \"password3\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "application should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.open_chrome_and_start_application()"
});
formatter.result({
  "duration": 4469012558,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "example2@gmail.com",
      "offset": 15
    },
    {
      "val": "password3",
      "offset": 46
    }
  ],
  "location": "SmokeTest.i_enter_valid_and_valid(String,String)"
});
formatter.result({
  "duration": 525200855,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 3411379012,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.application_should_be_closed()"
});
formatter.result({
  "duration": 918729805,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter valid \"example3@gmail.com\" and valid \"password4\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "application should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.open_chrome_and_start_application()"
});
formatter.result({
  "duration": 4497112771,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "example3@gmail.com",
      "offset": 15
    },
    {
      "val": "password4",
      "offset": 46
    }
  ],
  "location": "SmokeTest.i_enter_valid_and_valid(String,String)"
});
formatter.result({
  "duration": 539572621,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 2675032119,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.application_should_be_closed()"
});
formatter.result({
  "duration": 848207996,
  "status": "passed"
});
});