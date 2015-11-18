package hello.repository;

import hello.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * Created by kraichura on 11/18/2015.
 */

@RepositoryRestResource(collectionResourceRel = "account", path = "account")
public interface AccountRepository extends JpaRepository<Account,Long> {

    public Account findByUserName(@Param("name")String userName);
    public Account findById(@Param("id")Long id);
}
