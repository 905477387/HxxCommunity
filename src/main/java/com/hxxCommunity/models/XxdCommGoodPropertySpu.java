package com.hxxCommunity.models;

public class XxdCommGoodPropertySpu {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comm_good_property_spu.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comm_good_property_spu.good_id
     *
     * @mbggenerated
     */
    private String goodId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comm_good_property_spu.spu_id
     *
     * @mbggenerated
     */
    private Integer spuId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comm_good_property_spu.id
     *
     * @return the value of comm_good_property_spu.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comm_good_property_spu.id
     *
     * @param id the value for comm_good_property_spu.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comm_good_property_spu.good_id
     *
     * @return the value of comm_good_property_spu.good_id
     *
     * @mbggenerated
     */
    public String getGoodId() {
        return goodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comm_good_property_spu.good_id
     *
     * @param goodId the value for comm_good_property_spu.good_id
     *
     * @mbggenerated
     */
    public void setGoodId(String goodId) {
        this.goodId = goodId == null ? null : goodId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comm_good_property_spu.spu_id
     *
     * @return the value of comm_good_property_spu.spu_id
     *
     * @mbggenerated
     */
    public Integer getSpuId() {
        return spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comm_good_property_spu.spu_id
     *
     * @param spuId the value for comm_good_property_spu.spu_id
     *
     * @mbggenerated
     */
    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }
}