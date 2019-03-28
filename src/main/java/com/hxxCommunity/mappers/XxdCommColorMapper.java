package com.hxxCommunity.mappers;

import com.hxxCommunity.models.XxdCommColor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface XxdCommColorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_color
     *
     * @mbggenerated
     */
    @Delete({
        "delete from comm_color",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_color
     *
     * @mbggenerated
     */
    @Insert({
        "insert into comm_color (id, color_id, ",
        "color_name, color_rgb, ",
        "color_state)",
        "values (#{id,jdbcType=INTEGER}, #{colorId,jdbcType=VARCHAR}, ",
        "#{colorName,jdbcType=VARCHAR}, #{colorRgb,jdbcType=VARCHAR}, ",
        "#{colorState,jdbcType=CHAR})"
    })
    int insert(XxdCommColor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_color
     *
     * @mbggenerated
     */
    @InsertProvider(type=XxdCommColorSqlProvider.class, method="insertSelective")
    int insertSelective(XxdCommColor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_color
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, color_id, color_name, color_rgb, color_state",
        "from comm_color",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="color_id", property="colorId", jdbcType=JdbcType.VARCHAR),
        @Result(column="color_name", property="colorName", jdbcType=JdbcType.VARCHAR),
        @Result(column="color_rgb", property="colorRgb", jdbcType=JdbcType.VARCHAR),
        @Result(column="color_state", property="colorState", jdbcType=JdbcType.CHAR)
    })
    XxdCommColor selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_color
     *
     * @mbggenerated
     */
    @UpdateProvider(type=XxdCommColorSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XxdCommColor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_color
     *
     * @mbggenerated
     */
    @Update({
        "update comm_color",
        "set color_id = #{colorId,jdbcType=VARCHAR},",
          "color_name = #{colorName,jdbcType=VARCHAR},",
          "color_rgb = #{colorRgb,jdbcType=VARCHAR},",
          "color_state = #{colorState,jdbcType=CHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XxdCommColor record);
}