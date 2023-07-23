# UserManagement

1. Framework and Language Used :
   Framework : SpringBoot
   Language : Java

2. Data Flow
   Controller :-
   @GetMapping :- getAllUsers(), getUsersById()
   @PostMapping :- addUsers()
   @PutMapping :- updateUserInformation()
   @DeleteMapping :- deleteUsers()
   Others Annotaion Used :- @RestController, @Autowired, @PathVariable, @RequestBody

3. Services :-
   Method Used :- getAllUsers(),addUsers(), getUsersById(), updateUserInformation(), removeUsersById()
   Others Annotaion Used :- @Service, @Autowired

4. Repository :-
   Method Used :- getUsers(),addUsers(), removeUsers()
   Others Annotaion Used :- @Repository, @Autowired

5. DataBase Design/Bean Factory :-
   Method Used :- getUserList()
   Others Annotaion Used :- @Configuration, @Bean

6. Data Structure used in my Project
   Used :- ArrayList --> But Mostly used Java Concept, oops, collection

7. Project Summary
This is basically good project for learning purpose springboot basics, annotaion, api, spring mvc and CRUD Operation. In this project i just add users, get users, remove user data, update userInformation, get user by id , a lot of things i learned from this project.
