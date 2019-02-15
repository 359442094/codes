package cn.blooming.bep.crawler.model.mapper;

import cn.blooming.bep.crawler.model.entity.Cardbin;
import cn.blooming.bep.crawler.model.entity.CardbinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardbinMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cardbin
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	long countByExample(CardbinExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cardbin
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	int deleteByExample(CardbinExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cardbin
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	int deleteByPrimaryKey(String cardbin);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cardbin
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	int insert(Cardbin record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cardbin
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	int insertSelective(Cardbin record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cardbin
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	List<Cardbin> selectByExample(CardbinExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cardbin
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	Cardbin selectByPrimaryKey(String cardbin);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cardbin
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Cardbin record, @Param("example") CardbinExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cardbin
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	int updateByExample(@Param("record") Cardbin record, @Param("example") CardbinExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cardbin
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	int updateByPrimaryKeySelective(Cardbin record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cardbin
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	int updateByPrimaryKey(Cardbin record);
}