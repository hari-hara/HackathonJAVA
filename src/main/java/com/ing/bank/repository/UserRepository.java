package com.ing.bank.repository;



import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ing.bank.model.ProductDetails;
@Repository
public interface UserRepository extends CrudRepository<ProductDetails, Long> {
    @Transactional
    @Modifying
    @Query(value = "UPDATE product_details u set count = count+1  WHERE u.product_group_id = :productGpId and u.sub_product_name_id=:productSubId",
            nativeQuery = true)
void updateUser(@Param("productGpId") String productGpId, @Param("productSubId")  String productSubId);
}

