package com.mad.drools.service;

import com.mad.drools.model.Person;
import lombok.AllArgsConstructor;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DroolsService {

  private KieContainer kieContainer;

  public Person processDiscount(Person person) {
    KieSession kieSession = kieContainer.newKieSession();
    kieSession.insert(person);
    kieSession.fireAllRules();
    kieSession.dispose();
    return person;
  }
}
