package com.hundred.domain.store;

import java.util.Date;

public class Company {

    private String id;
    /**
     * 名称
     */
    private String name;
    /**
     * 注册日期
     */
    private Date expirationDate;
    /**
     * 地址
     */
    private String address;
    /**
     * 营业执照编号
     */
    private String licenseId;
    /**
     * 法人
     */
    private String representative;
    /**
     * 电话
     */
    private String phone;
    /**
     * 规模
     */
    private String companySize;
    /**
     * 所属行业
     */
    private String industry;
    /**
     * 备注/描述
     */
    private String remarks;
    /**
     * 状态
     */
    private Integer state;
    /**
     * 所在地
     */
    private String city;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompanySize() {
        return companySize;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
