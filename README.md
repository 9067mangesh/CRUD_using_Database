CRUD_using_Database
CRUD (Create, Read, Update, Delete) operations using a database involve interacting with a database to perform basic data manipulation. CRUD operations can be implemented using a database in a Spring Boot application.

Components of CRUD Operations 1.Model (Entity): Represents the data structure of the database table. 2.Repository: Provides CRUD operations for the entity. 3.Service: Contains the business logic and calls the repository. 4.Controller: Handles HTTP requests and responses.

#Request Handling 1.GetMapping https://localhost:8081/api/models

2.PostMapping https://localhost:8081/api/models

3.PutMapping https://localhost:8081/api/models/{id}

4.DeleteMapping https://localhost:8081/api/models/{id}
