package com.bkav.demo.repository;

import com.bkav.demo.entities.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, String> {
    @Query("select a from Accounts  a where a.username=?1")
    Accounts findByUsername(String username);

    @Query("select ae.accountCreator from Events e join AccountEvent ae on e.id=ae.events.id where e.id=?1")
    public Accounts getAccountCreatorByEventId(Long idEvent);

    @Query(value = "select * from acount_event_table aet join accounts ac on aet.username=ac.username \n" +
            "join events e on e.id=aet.id_event\n" +
            " where ac.username='1'", nativeQuery = true)
    List<Accounts> getListAccountByIdEvent(Long idEvent);
    //join account_event  ae on e.id=ae.id
}
