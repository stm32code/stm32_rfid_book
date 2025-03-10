package com.bs.glr.mapper;

import com.bs.glr.bean.BsBookInfo;
import com.bs.glr.bean.BsBookInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BsBookInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_book_info
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    long countByExample(BsBookInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_book_info
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    int deleteByExample(BsBookInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_book_info
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_book_info
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    int insert(BsBookInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_book_info
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    int insertSelective(BsBookInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_book_info
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    List<BsBookInfo> selectByExample(BsBookInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_book_info
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    BsBookInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_book_info
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    int updateByExampleSelective(@Param("record") BsBookInfo record, @Param("example") BsBookInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_book_info
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    int updateByExample(@Param("record") BsBookInfo record, @Param("example") BsBookInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_book_info
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    int updateByPrimaryKeySelective(BsBookInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_book_info
     *
     * @mbg.generated Thu Mar 31 22:47:47 CST 2022
     */
    int updateByPrimaryKey(BsBookInfo record);
}