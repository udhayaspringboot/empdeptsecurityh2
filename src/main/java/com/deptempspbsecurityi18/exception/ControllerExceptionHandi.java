
  package com.deptempspbsecurityi18.exception;
  
  import org.springframework.web.bind.annotation.ControllerAdvice; import
  org.springframework.web.bind.annotation.ExceptionHandler; import
  org.springframework.web.servlet.ModelAndView;
  
 // @ControllerAdvice 
  public class ControllerExceptionHandi {
  
  
  @ExceptionHandler(Exception.class) public ModelAndView excepti() {
 
  return new ModelAndView("exceptionview"); }
  
  }
 