package Queries;

import entities.HaveScheduleEntity;
import entities.ScheduleEntity;
import entities.SchoolBusEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SchoolBusQuery {
    public List makeQuery(String licensePlate, String destination, String capacity,String driverId,String schoolName) {
        Session session = HibarnateSupporter.getSessionFactory().openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<SchoolBusEntity> criteria = criteriaBuilder.createQuery(SchoolBusEntity.class);
        Root<SchoolBusEntity> root = criteria.from(SchoolBusEntity.class);
        List <Predicate>  predicates = new ArrayList<>();
        if(licensePlate != null){
            predicates.add(criteriaBuilder.like(root.get("licensePlate"),licensePlate));
        }
        if(destination != null){
            predicates.add(criteriaBuilder.like(root.get("destination"),destination));
        }
        if(driverId!= null){
            predicates.add(criteriaBuilder.like(root.get("driverId"),driverId));
        }
        if(schoolName!= null){
            predicates.add(criteriaBuilder.like(root.get("schoolName"),schoolName));
        }
        if(capacity!= null){
            predicates.add(criteriaBuilder.like(root.get("capacity"),capacity));
        }
        criteria.select(root).where((Predicate[]) predicates.toArray(new Predicate[0]));
        Query<SchoolBusEntity> query = session.createQuery(criteria);

        return query.list();
    }
}
