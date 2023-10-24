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

| №  | Test name                                                                      | Status |
|----|--------------------------------------------------------------------------------|--------|
| 1  | Creating №1 order with all fields filled positive data (POST method)           |        |
| 2  | Creating №2 order only with required fields filled positive data (Post method) |        |
| 5  | Getting order id with id "0" (Get method)                                      |        | 
| 6  | Getting order id with id "1" (Get method)                                      |        |
| 7  | Getting order id with id "2" (Get method)                                      |        |
| 8  | Getting order id with id "5" (Get method)                                      |        |
| 9  | Getting order id with id "9" (Get method)                                      |        |
| 10 | Getting order id with id "10" (Get method)                                     |        |
| 11 | Getting order id with id "11" (Get method)                                     |        |
| 12 | Getting order id with id from №3 order (Get method)                            |        |
| 13 | Creating order without "courierId" field (negative test, POST method)          |        |
| 14 | Creating order without "id" field (negative test, POST method)                 |        |
| 15 | Creating order with incorrect Json body (negative test, POST method)           |        |
| 16 | Getting order id with id "15" (negative test, Get method)                      |        |
| 17 | Getting order id with id "-3" (negative test, Get method)                      |        |
| 18 | Getting order id with id "15.6589545" (negative test, Get method)              |        |
| 19 | Getting order id with string "blablabla" (negative test, Get method)           |        |