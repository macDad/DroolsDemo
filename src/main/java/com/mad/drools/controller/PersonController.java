package com.mad.drools.controller;

import com.mad.drools.model.Person;
import com.mad.drools.service.DroolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {

  @Autowired DroolsService droolsService;

  @GetMapping("/checkDiscount/{name}/{age}")
  public Person checkDiscount(@PathVariable String name, @PathVariable int age) {
    Person person = new Person(name, age);

    return droolsService.processDiscount(person);
  }
}
