package yncrea.lab05.web.service.impl;

import yncrea.lab05.contract.dto.CompanyDTO;
import yncrea.lab05.contract.facade.CompanyWS;
import yncrea.lab05.core.dao.CompanyDAO;
import yncrea.lab05.core.entity.Company;
import yncrea.lab05.core.service.CompanyService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Named("companyWS")
@WebService(endpointInterface = "yncrea.lab05.contract.facade.CompanyWS")
public class CompanyWSImpl implements CompanyWS {

    @Inject
    private CompanyService companyService;

    @Override
    public Collection<CompanyDTO> getAllCompanies() {
        final List<Company> companies=companyService.findAllWithProjects();
        List<CompanyDTO> companyDTOs=new ArrayList<>();
        for (Company company:companies)
        {
            companyDTOs.add(new CompanyDTO(company.getName()));
        }
        return companyDTOs;
    }

    @Override
    public void saveCompany(CompanyDTO companyDTO) {
        companyService.save(new Company(companyDTO.getName()));
    }
}
