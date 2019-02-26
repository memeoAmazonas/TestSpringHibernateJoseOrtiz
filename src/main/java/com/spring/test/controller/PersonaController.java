package com.spring.test.controller;

import com.spring.test.service.PersonaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/persona")
public class PersonaController {

    private static final String XMLCODE = "        <?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "        <beans xmlns=\"http://www.springframework.org/schema/beans\"\n" +
            "               xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
            "               xmlns:context=\"http://www.springframework.org/schema/context\"\n" +
            "               xsi:schemaLocation=\"http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd\">\n" +
            "            <context:property-placeholder location=\"classpath:application.properties\" />\n" +
            "\n" +
            "            <bean name=\"persona\" class=\"com.spring.test.model.Persona\">\n" +
            "                <constructor-arg name=\"name\" value=\"Juan\"></constructor-arg>\n" +
            "                <constructor-arg name=\"id\" value=\"3597174-5\"></constructor-arg>\n" +
            "                <constructor-arg name=\"lastName\" value=\"perez\"></constructor-arg>\n" +
            "                <constructor-arg name=\"birthDate\" value=\"10/10/1985\"></constructor-arg>\n" +
            "                <property name=\"aplication\" value=\"${test.application}\"/>\n" +
            "            </bean>\n" +
            "\n" +
            "        </beans>";
    @Autowired
    @Qualifier("personaServiceImpl")
    private PersonaService personaService;

    @GetMapping("/bean")
    public ModelAndView viewBean(){
        ModelAndView modelAndView = new ModelAndView("persona");
        modelAndView.addObject("persona",personaService.getBeanPersona());
        return  modelAndView;
    }
    @GetMapping("/codigos")
    public ModelAndView viewCodeBean(){
        ModelAndView modelAndView = new ModelAndView("personaCode");
        modelAndView.addObject("xmlCode", XMLCODE);
        return modelAndView;
    }

}
