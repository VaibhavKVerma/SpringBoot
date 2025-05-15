https://notebook.zohopublic.in/public/notes/bietv0de3bac30fbd41e7b1346bf9243ad3b2

# Annotations

- `@Controller`
- `@RestController` -> `@Controller` + `@ResponseBody`
- `@RequestMapping` -> What all API the controller is hosting, needs path and method type(GET,POST,PUT,PATCH), also
  write at class level
- `@GetMapping` -> `@RequestMapping` + GET method
- `@PostMapping` -> `@RequestMapping` + POST method
- `@RequestParam` -> API QUERY PARAMS
  - Used to bind, request parameter to controller method parameter
  - https://www.google.com/?q=VAIBHAV&time=30
  - Can parse primitive, Wrapper class, Strings, Enums.
  - For custom object types we need to use PropertyEditor(`@InitBinder`)
- `@InitBinder` 
  - ```java
      @InitBinder
      protected void initBinder(DataBinder binder) {
        class TimePropertyEditor extends PropertyEditorSupport {
            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                setValue(new Date(Integer.parseInt(text)));
            }
        }
        binder.registerCustomEditor(Date.class, "time", new TimePropertyEditor());
    }
    ```

- `@PathVariable` -> API PATH VARIABLES Used to extract the values of path from the URL and helps it to bind it to controller method parameter
- `@RequestBody` -> API BODY
- `@ResponseEntity` -> Entire HTTP response -> Header, Status, ResponseBody etc.