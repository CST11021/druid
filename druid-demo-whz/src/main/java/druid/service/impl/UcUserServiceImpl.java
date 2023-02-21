package druid.service.impl;

import druid.entity.UcUser;
import druid.mapper.UcUserMapper;
import druid.service.UcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ww
 * @date 2020/6/6 下午2:44
 */
@Service
public class UcUserServiceImpl implements UcUserService {
    @Autowired
    private UcUserMapper ucUserMapper;

    @Override
    public UcUser selectById(){
        return this.ucUserMapper.selectByPrimaryKey(1L);
    }

}
