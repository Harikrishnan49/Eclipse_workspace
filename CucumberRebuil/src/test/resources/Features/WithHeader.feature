Feature: Login to the Orange HRM
 Scenario: Login with datatable values with header
    Given when i go to the website
    When I give the data
    | UserName | Password |
    | Admin    | admin123 |
    Then click the login button