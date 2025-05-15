https://notebook.zohopublic.in/public/notes/bietv2018487e1de84b009904a4dfeda24def

What is bean?
Bean is a Java Object, which is managed by Spring Container(knows as IOC Container).

IOC Container -> contains all the beans which get created and also manages them.

Bean Creation Ways -

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

How SpringBoot find Beans??

1. Using @ComponentScan, it will scan the specified package and specified sub-package for classes annotated with
   @Component, @Service etc.
2. Search @Configuration and find all @Bean methods