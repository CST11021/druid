package druid.mapper;

import druid.entity.UcUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UcUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UcUser record);

    int insertSelective(UcUser record);

    UcUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UcUser record);

    int updateByPrimaryKey(UcUser record);
}