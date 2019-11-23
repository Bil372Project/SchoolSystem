import Hibernate.Entities.LunchMenuEntity;
import Hibernate.Entities.TeacherEntity;
import Hibernate.Entities.TeachingStaffEntity;
import Hibernate.Generator.DatabaseGeneretor;
import Hibernate.Generator.HibarnateSupporter;
import Hibernate.Queries.SchoolQuery;
import Hibernate.Queries.TeachingStaffQuery;
import com.fasterxml.classmate.AnnotationConfiguration;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javax.imageio.spi.ServiceRegistry;
import javax.persistence.Entity;
import java.sql.Driver;
import java.sql.Time;
import java.util.Date;
import java.util.List;


public class OracleTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*Queries.HibarnateSupporter class has present us to use some basic functions or would be advanced function depending on requirement
        but now it does not have.
            --- create command
            --- delete object
            --- get pointed object literally same
            --- query form to retrieve information from database

         */
        //Created hibarnate supported
        //DatabaseGeneretor databaseGeneretor = new DatabaseGeneretor(git );
       // databaseGeneretor.generator();
        DatabaseGeneretor databaseGeneretor = new DatabaseGeneretor();
        databaseGeneretor.generator();
//        TeachingStaffQuery teachingStaffQuery = new TeachingStaffQuery();
       // List<TeachingStaffEntity> join_list = (List)teachingStaffQuery.getWithNames("TOBB";
       // for(Object object:join_list){
         //   System.out.println(object);
       // }
//        LunchMenuEntity lunchMenuEntity = new LunchMenuEntity();
//        lunchMenuEntity.setFood("nuddle");
//        lunchMenuEntity.setLunchDay(new Time(23425));

//        SchoolQuery sq = new SchoolQuery();
//        List q = sq.makeQuery("TOBB",null,null);

        //supporter.createObject(lunchMenuEntity);
        //This code block only for trial and query example
//        String hql = "FROM EmployeeEntity WHERE SCHOOL_NAME = 'TOBB' ";
        //List courses =  supporter.selectQueryBased(hql);
        //for(Object object:courses){
          //  System.out.println(((EmployeeEntity)object).getEmployeeId());
        //}

    }

}