package yncrea.lab05.contract.dto;

public class CompanyDTO {

    private String name;

    /*
    Constructors
     */
    public CompanyDTO(){}

    public CompanyDTO(String name) {
        this.name = name;
    }


    /*
    Getters ;
     */
    public String getName() {
        return name;
    }


    /*
    Setters
     */
    public void setName(String name) {
        this.name = name;
    }
}
