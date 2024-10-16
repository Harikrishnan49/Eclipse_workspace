$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:FeatureFile/LezDo_API.feature");
formatter.feature({
  "name": "API Automation check in Demo Pet Store URL",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "To implement the API checks get,post,update and delete",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "I want to get the available pets in the store",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.i_want_to_get_the_available_pets_in_the_store()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to post a new pet as available in the store",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.i_need_to_post_a_new_pet_as_available_in_the_store()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to update the status of the pet as sold",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.i_need_to_update_the_status_of_the_pet_as_sold()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to delete that pet",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.i_need_to_delete_that_pet()"
});
formatter.result({
  "status": "passed"
});
});