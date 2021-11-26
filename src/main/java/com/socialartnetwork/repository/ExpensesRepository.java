package com.socialartnetwork.repository;

import com.socialartnetwork.entity.Expense;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.cloud.gcp.data.datastore.repository.query.Query;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "expenses", path = "expenses")
public interface ExpensesRepository extends DatastoreRepository<Expense, String> {

    @Query("select * from  |com.socialartnetwork.entity.Expense| where partnumber = @name")
    Slice<Expense> findExpenseByPartnumber(@Param("name") String name, Pageable pageable);

}
