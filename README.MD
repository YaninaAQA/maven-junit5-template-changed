# Checklist for calculator

| №  | Test name                                    | Status |
|----|----------------------------------------------|--------|
| 1  | Adding two positive integer                  | pass   |
| 2  | Adding positive integer and zero             | pass   |
| 3  | Adding negative integer and positive integer | pass   |
| 4  | Adding large integer                         | pass   |
| 5  | First argument larger                        | pass   |
| 6  | Second argument larger                       | pass   |
| 7  | Both arguments equal                         | pass   |
| 8  | Divide floats numbers                        | pass   |
| 9  | Multiple floats numbers                      | pass   |
| 10 | Parameterized Square floats numbers          | pass   |

# Checklist for Solver

| № | Test name                                                      | Status |
|---|----------------------------------------------------------------|--------|
| 1 | Calculating number of roots with positive numbers              | pass   |
| 2 | Calculating number of roots with negative numbers              | pass   |
| 3 | Calculating number of roots with positive and negative numbers | pass   |
| 4 | Calculating number of roots with positive numbers and zero     | pass   |
| 5 | Calculating number of roots with negative numbers and zero     | pass   | 

# Checklist for test-order-controller

| № | Test name                                                                                                                                                                                                                     | Status |
|---|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------|
| 1 | Creating order with all fields filled positive data (Post method): <br> "status": "OPEN"; <br> "courierId": 1; <br> "customerName": "Nestle"; <br> "customerPhone": "505253"; <br> "comment": "without comment"; <br> "id": 1 |        |
| 2 | Creating order without "courierId" field (negative test, POST method)                                                                                                                                                         |        |
| 3 | Creating order with "courierId" field: "###" (negative test, POST method)                                                                                                                                                     |        |
| 4 | Creating order with incorrect Json body (negative test, POST method)                                                                                                                                                          |        |
| 5 | Getting order id with next test data: "id" from 1 to 10 (positive test, Get method)                                                                                                                                           |        |
| 6 | Getting order id with next test data: "id": "11", "-3", "15.6589545", "0" (negative test, Get method)                                                                                                                         |        |
| 7 | Getting order id with string "blablabla" (negative test, Get method)                                                                                                                                                          |        | 


# Checklist of the Tallin delivery UI

| № | Test name                                                                          | Status |
|---|------------------------------------------------------------------------------------|--------|
| 1 | Check the possibility Sign in with the correct login and password (EN)             |        |
| 2 | Check the possibility Sign in with the correct login and incorrect password (EN)   |        |
| 3 | Check the possibility Sign in with the incorrect login and correct password (EN)   |        |
| 4 | Check the possibility Sign in with the incorrect login and incorrect password (EN) |        |
| 5 | Check the possibility Sign in with the correct login and password (RU)             |        |
| 6 | Check the possibility Sign in with the incorrect login and incorrect password (RU) |        |

# List of web elements

| № | Name of element | Xpath selector                       |
|---|-----------------|--------------------------------------|
| 1 | Login field     | //input[@data-name="username-input"] |
| 2 | Password field  | //input[@data-name="password-input"] |
| 3 | Sign in button  | //button[@data-name="signIn-button"] |
| 4 | EN button       | //button[text()="EN"]                |
| 5 | RU button       | //button[text()="RU"]                |
