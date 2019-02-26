package com.spring.test.service.impl;

import com.spring.test.model.Persona;
import com.spring.test.service.PersonaService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("personaServiceImpl")
public class PersonaServiceImpl implements PersonaService {

    @Override
    public Persona getBeanPersona() {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("springConfiguration.xml");
        Persona persona = ctx.getBean("persona", Persona.class);
        ctx.close();
        return persona;
    }
}
