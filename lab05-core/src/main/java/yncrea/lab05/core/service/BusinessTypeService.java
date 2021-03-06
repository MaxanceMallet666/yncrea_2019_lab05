package yncrea.lab05.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab05.core.dao.BusinessTypeDAO;
import yncrea.lab05.core.entity.BusinessType;

@Service
@Transactional
public class BusinessTypeService {

    private BusinessTypeDAO businessTypeDAO;


    public BusinessTypeService(final BusinessTypeDAO businessTypeDAO) {
        this.businessTypeDAO = businessTypeDAO;
    }


    public void deleteAll() {
        businessTypeDAO.deleteAll();
    }


    public void save(final BusinessType businessType) {
        businessTypeDAO.save(businessType);
    }


    public long countAll() {
       return businessTypeDAO.count();
    }
}
