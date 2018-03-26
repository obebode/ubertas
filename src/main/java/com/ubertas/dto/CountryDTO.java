package com.ubertas.dto;

import javax.validation.constraints.NotNull;

public class CountryDTO {

    @NotNull
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String isoCode;

    public CountryDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CountryDTO{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", isoCode='").append(isoCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
