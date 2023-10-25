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
| 3  | Getting order id with id "1" (Get method)                                      |        |
| 4  | Getting order id with id "2" (Get method)                                      |        |
| 5  | Getting order id with id "5" (Get method)                                      |        |
| 6  | Getting order id with id "9" (Get method)                                      |        |
| 7  | Getting order id with id "10" (Get method)                                     |        |
| 8  | Creating order without "courierId" field (negative test, POST method)          |        |
| 9  | Creating order without "id" field (negative test, POST method)                 |        |
| 10 | Creating order with incorrect Json body (negative test, POST method)           |        |
| 11 | Getting order id with id "15" (negative test, Get method)                      |        |
| 12 | Getting order id with id "-3" (negative test, Get method)                      |        |
| 13 | Getting order id with id "15.6589545" (negative test, Get method)              |        |
| 14 | Getting order id with id "0" (negative test, Get method)                       |        |
| 15 | Getting order id with string "blablabla" (negative test, Get method)           |        |
| 16 | Getting order id with id "11" (negative test, Get method)                      |        |