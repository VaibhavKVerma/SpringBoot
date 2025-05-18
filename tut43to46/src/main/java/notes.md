https://notebook.zohopublic.in/public/notes/bietv2018487e1de84b009904a4dfeda24def

What is bean?
Bean is a Java Object, which is managed by Spring Container(knows as IOC Container).

IOC Container -> contains all the beans which get created and also manages them.

### Bean Creation Ways -

- @Component Annotation
- @Bean Annotation

1. Using @Component Annotation

- Follows "Convention over configuration" approach.
- Meaning SpringBoot will create Object and manage its lifecycle and it uses auto-configure(Default constructor if there
  is any) to create object.
- @Controller, @Repository, @Service etc. uses @Component Annotation

2. Using @Bean Annotation

- Create a @Configuration Class and create Bean for those classes.

If using @Component and @Bean both for a class, then @Bean is given more priority.
If I create multiple Beans of same class, Spring will create multiple beans.

### How SpringBoot find Beans??

1. Using @ComponentScan, it will scan the specified package and specified sub-package for classes annotated with
   @Component, @Service etc.
2. Search @Configuration and find all @Bean methods

### At what time beans get created ?

Eagerness -> Beans get created when application starts. Eg. Singleton
Lazy -> Beans get created when they are needed. Eg. Prototype or @Lazy

### Bean LifeCycle

`Application Start -> IOC Container Loaded -> Construct Bean -> Inject Dependency into Constructed bean ->
@PostConstruct -> Use the Bean -> @PreDestroy -> Bean Destroy`

- Step 1:
  - During Application Startup, Spring Boot invokes IOC Container
  - IOC Container use Configuration and Component to scan all class and try to construct beans
- Step 2:
  - Construct the Beans
- Step 3:
  - Inject Dependency into Constructed bean.
  - @Autowired first look for the required bean.
  - If bean is found. Bean is injected using:
    - Constructor Injection
    - Setter Injection
    - Field Injection
  - If bean is not found, then Spring created Bean and then bean is injected.
- Step 4:
  - Perform any task before Bean is ready to use.
- Step 5:
  - Bean is usable
- Step 6:
  - Perform any task before Bean is getting destroyed.(Disconnect DB Connection)

https://notebook.zohopublic.in/public/notes/bietv964a637b52be4a1bbfde8d0309040a79

### What is DI?
Using dependency injection, we can make our classes independent of its dependencies.
It helps to remove the dependency on concrete implementation and inject the dependencies from external source.

Use @Autowired

### Different ways of injection:
- Field Injection
- Setter Injection
- Constructor Injection(Mostly Used)


- Field Injection
  - Use @Autowired
  - Easy to use and implement
  - Cannot be used with immutable fields(final).
  - Chance of NPE.
- Setter Injection
  - Use setter method with @Autowired
  - Dependency can be changed anytime, even after the object is created.
  - Testing is easy.
  - Final fields cannot be used.
  - Difficult to read and maintained.
- Constructor Injection
  - Dependency gets resolved at the time of initialization of the Object itself.
  - Recommended
  - Also from Spring 4.3, when only one constructor is present using @Autowired is also not mandatory.
  - Use immutable object(final).
  - Fail Fast: If there is any missing dependency it will fail during compilation rather than runtime.
  - Unit testing is easy

### Disadvantages of DI
- Circular Dependency
  - Refactoring by making more classes.
  - Use @Lazy on @Autowired
  - Using @PostConstruct
- Unsatisfied Dependency
  - If using Interface, and concrete implementations, mark one of the implementation as @Primary
  - Use @Qualifier("name") and use the @Qualifier with @Autowired

https://notebook.zohopublic.in/public/notes/bietv379bff087eca47eaa84a3024d7e14b46

## Scopes
Use @Scope(value = ConfigurableBeanFactory._____) or @Scope("_____")
- Singleton
  - Default Scope
  - Only one instance created per IOC
  - Eagerly initialized by IOC