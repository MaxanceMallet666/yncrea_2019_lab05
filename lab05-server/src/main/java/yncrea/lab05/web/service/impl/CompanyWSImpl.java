package yncrea.lab05.web.service.impl;

import yncrea.lab05.contract.dto.CompanyDTO;
import yncrea.lab05.contract.facade.CompanyWS;
import yncrea.lab05.core.entity.Company;

import javax.inject.Named;
import javax.jws.WebService;
import java.util.Collection;

@Named("companyWS")
@WebService(endpointInterface = "yncrea.lab05.contract.facade.CompanyWS")
public class CompanyWSImpl implements CompanyWS {

    @Override
    public Collection<CompanyDTO> getAllCompanies() {
        //TODO Trouver les implémentations des fonctions présentes également dans CompanyService (Partie Main Service)
        return null;
    }

    @Override
    public void saveCompany(CompanyDTO companyDTO) {
        //TODO Trouver les implémentations des fonctions présentes également dans CompanyService (Partie Main Service)
    }
}
