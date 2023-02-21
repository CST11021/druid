package druid.controller;

import com.alibaba.druid.stat.DruidStatManagerFacade;
import druid.entity.UcUser;
import druid.service.UcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ww
 * @date 2020/6/6 下午2:46
 */
@RequestMapping("/user")
@RestController
public class UcUserController {

    @Autowired
    private UcUserService ucUserService;

    @GetMapping("/selectById")
    public UcUser selectById(){
        return this.ucUserService.selectById();
    }

    @GetMapping("/durid/stat")
    public Object druidStat(){
        // DruidStatManagerFacade#getDataSourceStatDataList 该方法可以获取所有数据源的监控数据，除此之外 DruidStatManagerFacade 还提供了一些其他方法，你可以按需选择使用。
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }

}
