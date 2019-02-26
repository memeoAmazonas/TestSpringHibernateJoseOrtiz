package com.spring.test.controller;

import com.spring.test.service.AlumnoYCursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hibernate")
public class AlumnoYCursoController {

    @Autowired
    @Qualifier("alumnoYCursolServiceImpl")
    private AlumnoYCursoService alumnoYCursoService;

    private static final String xmlCodeAlumno = " <?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<!DOCTYPE hibernate-mapping PUBLIC \"-//Hibernate/Hibernate Mapping DTD 3.0//EN\" \"http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd\">\n" +
            "<hibernate-mapping package=\"com.spring.test.entity\">\n" +
            "    <class name=\"Alumno\">\n" +
            "        <id name=\"idAlumno\" column=\"idAlumno\">\n" +
            "            <generator class=\"native\"/>\n" +
            "        </id>\n" +
            "        <property name=\"nombre\" type=\"java.lang.String\"/>\n" +
            "        <property name=\"apellido\" type=\"java.lang.String\"/>\n" +
            "        <property name=\"direccion\"  type=\"java.lang.String\"/>\n" +
            "        <property name=\"fechaNacimiento\" type=\"java.lang.String\"/>\n" +
            "        <set name=\"cursos\" inverse=\"true\" cascade=\"all\">\n" +
            "            <key column=\"idCurso\" not-null=\"true\"/>\n" +
            "            <one-to-many class=\"Curso\" />\n" +
            "\n" +
            "        </set>\n" +
            "    </class>\n" +
            "</hibernate-mapping>\n";

    private static final String xmlCodeCurso = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<!DOCTYPE hibernate-mapping PUBLIC \"-//Hibernate/Hibernate Mapping DTD 3.0//EN\" \"http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd\">\n" +
            "<hibernate-mapping package=\"com.spring.test.entity\">\n" +
            "    <class name=\"Curso\">\n" +
            "        <id name=\"idCurso\" column=\"idCurso\">\n" +
            "            <generator class=\"native\"/>\n" +
            "        </id>\n" +
            "        <property name=\"nombreCurso\" type=\"java.lang.String\"/>\n" +
            "        <property name=\"horasDictadas\" type=\"java.lang.Integer\"/>\n" +
            "        <property name=\"profesor\"  type=\"java.lang.String\"/>\n" +
            "        <property name=\"nota\" type=\"java.lang.Integer\"/>\n" +
            "        <property name=\"cantidadAsistencia\" type=\"java.lang.Integer\"/>\n" +
            "        <many-to-one name=\"alumno\" class=\"Alumno\" not-null=\"true\" column=\"idAlumno\"/>\n" +
            "    </class>\n" +
            "</hibernate-mapping>\n";
    private static final String xmlCodeHibernate ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<!DOCTYPE hibernate-configuration PUBLIC\n" +
            "        \"-//Hibernate/Hibernate Configuration DTD 3.0//EN\"\n" +
            "        \"http://hibernate.org/dtd/hibernate-configuration-3.0.dtd\">\n" +
            "<hibernate-configuration>\n" +
            "    <session-factory>\n" +
            "        <property name=\"hibernate.connection.driver_class\">com.mysql.jdbc.Driver</property>\n" +
            "        <property name=\"hibernate.connection.url\">jdbc:mysql://localhost/testSpring?createDatabaseIfNotExist=true</property>\n" +
            "        <property name=\"hibernate.connection.username\">root</property>\n" +
            "        <property name=\"hibernate.connection.password\"></property>\n" +
            "        <property name=\"hibernate.connection.pool_size\">1</property>\n" +
            "        <property name=\"hibernate.current_session_context_class\">thread</property>\n" +
            "        <property name=\"hibernate.show_sql\">true</property>\n" +
            "        <property name=\"hibernate.dialect\">org.hibernate.dialect.MySQL5Dialect</property>\n" +
            "        <property name=\"hbm2ddl.auto\">create</property>\n" +
            "        <mapping resource=\"Alumno.hbm.xml\" />\n" +
            "        <mapping resource=\"Curso.hbm.xml\"/>\n" +
            "    </session-factory>\n" +
            "</hibernate-configuration>\n";

    @GetMapping("/alumnoCurso")
    public ModelAndView viewAlumnnoAndCurso(){
        ModelAndView modelAndView = new ModelAndView("alumnoAndCurso");
        System.out.println(alumnoYCursoService.averageNotasPedro());
        modelAndView.addObject("xmlCodeCurso", xmlCodeCurso);
        modelAndView.addObject("xmlCodeAlumno", xmlCodeAlumno);
        modelAndView.addObject("xmlCodeHibernate", xmlCodeHibernate);
        modelAndView.addObject("listCursosJuan", alumnoYCursoService.listCursoJuan());
        modelAndView.addObject("listPersonCalculo", alumnoYCursoService.getAlumnosMaximoCalculo());
        modelAndView.addObject("average", alumnoYCursoService.averageNotasPedro());
        modelAndView.addObject("listPersonA", alumnoYCursoService.listCursosNombreEqualA());
        return  modelAndView;
    }
    @GetMapping("/codigos")
    public String viewCodeHibernate(){
        return "hibernateCode";
    }


}
