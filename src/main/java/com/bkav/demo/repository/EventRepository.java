package com.bkav.demo.repository;

import com.bkav.demo.entities.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Events, Long> {
    @Query(value = "select * from acount_event_table aet join accounts ac on aet.username=ac.username "+
            "join events e on e.id=aet.id_event "+
            "where ac.username=?1", nativeQuery = true)
    List<Events> getListEventByAccountMemberId(String accountMemberUsername);
    //join account_event  ae on e.id=ae.id

}
