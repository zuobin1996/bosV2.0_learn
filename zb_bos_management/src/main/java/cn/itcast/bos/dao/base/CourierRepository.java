package cn.itcast.bos.dao.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import cn.itcast.bos.domain.base.Courier;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CourierRepository extends JpaRepository<Courier, Integer>,
JpaSpecificationExecutor<Courier> {

    @Query(value = "update Courier set deltag= '1' where id = ? ")
    @Modifying
    public void updateDelTag(Integer id);

}
