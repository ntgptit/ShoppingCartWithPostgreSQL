package com.giapnt.shoppingcart.postgresql.model;

import java.util.Date;

public class Category {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.category.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.category.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.category.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.category.isactive
     *
     * @mbg.generated
     */
    private Integer isactive;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.category.created_by
     *
     * @mbg.generated
     */
    private String createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.category.updated_by
     *
     * @mbg.generated
     */
    private String updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.category.created_timestamp
     *
     * @mbg.generated
     */
    private Date createdTimestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.category.updated_timestamp
     *
     * @mbg.generated
     */
    private Date updatedTimestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.category.picture
     *
     * @mbg.generated
     */
    private byte[] picture;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.category.id
     *
     * @return the value of core_data.category.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.category.id
     *
     * @param id the value for core_data.category.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.category.name
     *
     * @return the value of core_data.category.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.category.name
     *
     * @param name the value for core_data.category.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.category.description
     *
     * @return the value of core_data.category.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.category.description
     *
     * @param description the value for core_data.category.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.category.isactive
     *
     * @return the value of core_data.category.isactive
     *
     * @mbg.generated
     */
    public Integer getIsactive() {
        return isactive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.category.isactive
     *
     * @param isactive the value for core_data.category.isactive
     *
     * @mbg.generated
     */
    public void setIsactive(Integer isactive) {
        this.isactive = isactive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.category.created_by
     *
     * @return the value of core_data.category.created_by
     *
     * @mbg.generated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.category.created_by
     *
     * @param createdBy the value for core_data.category.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.category.updated_by
     *
     * @return the value of core_data.category.updated_by
     *
     * @mbg.generated
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.category.updated_by
     *
     * @param updatedBy the value for core_data.category.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.category.created_timestamp
     *
     * @return the value of core_data.category.created_timestamp
     *
     * @mbg.generated
     */
    public Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.category.created_timestamp
     *
     * @param createdTimestamp the value for core_data.category.created_timestamp
     *
     * @mbg.generated
     */
    public void setCreatedTimestamp(Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.category.updated_timestamp
     *
     * @return the value of core_data.category.updated_timestamp
     *
     * @mbg.generated
     */
    public Date getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.category.updated_timestamp
     *
     * @param updatedTimestamp the value for core_data.category.updated_timestamp
     *
     * @mbg.generated
     */
    public void setUpdatedTimestamp(Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.category.picture
     *
     * @return the value of core_data.category.picture
     *
     * @mbg.generated
     */
    public byte[] getPicture() {
        return picture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.category.picture
     *
     * @param picture the value for core_data.category.picture
     *
     * @mbg.generated
     */
    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}