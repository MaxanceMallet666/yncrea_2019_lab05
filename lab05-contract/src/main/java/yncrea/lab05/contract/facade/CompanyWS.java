package yncrea.lab05.contract.facade;

import yncrea.lab05.contract.dto.CompanyDTO;

import javax.jws.WebService;
import java.util.Collection;

@WebService
public interface CompanyWS {

    public Collection<CompanyDTO> getAllCompanies();
    public void saveCompany (CompanyDTO companyDTO);

}
