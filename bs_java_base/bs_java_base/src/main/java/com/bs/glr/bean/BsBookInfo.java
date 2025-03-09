package com.bs.glr.bean;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BsBookInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_book_info.id
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_book_info.b_name
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    private String bName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_book_info.b_msg
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    private String bMsg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_book_info.b_price
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    private BigDecimal bPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_book_info.b_number
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    private Integer bNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_book_info.b_rfid
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    private String bRfid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_book_info.id
     *
     * @return the value of bs_book_info.id
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_book_info.id
     *
     * @param id the value for bs_book_info.id
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_book_info.b_name
     *
     * @return the value of bs_book_info.b_name
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    public String getbName() {
        return bName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_book_info.b_name
     *
     * @param bName the value for bs_book_info.b_name
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_book_info.b_msg
     *
     * @return the value of bs_book_info.b_msg
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    public String getbMsg() {
        return bMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_book_info.b_msg
     *
     * @param bMsg the value for bs_book_info.b_msg
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    public void setbMsg(String bMsg) {
        this.bMsg = bMsg == null ? null : bMsg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_book_info.b_price
     *
     * @return the value of bs_book_info.b_price
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    public BigDecimal getbPrice() {
        return bPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_book_info.b_price
     *
     * @param bPrice the value for bs_book_info.b_price
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    public void setbPrice(BigDecimal bPrice) {
        this.bPrice = bPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_book_info.b_number
     *
     * @return the value of bs_book_info.b_number
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    public Integer getbNumber() {
        return bNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_book_info.b_number
     *
     * @param bNumber the value for bs_book_info.b_number
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    public void setbNumber(Integer bNumber) {
        this.bNumber = bNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_book_info.b_rfid
     *
     * @return the value of bs_book_info.b_rfid
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    public String getbRfid() {
        return bRfid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_book_info.b_rfid
     *
     * @param bRfid the value for bs_book_info.b_rfid
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    public void setbRfid(String bRfid) {
        this.bRfid = bRfid == null ? null : bRfid.trim();
    }
}