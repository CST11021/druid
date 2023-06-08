package druid.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DruidConfig {

    // @Value("${spring.datasource.url}")
    // private String dbUrl;
    //
    // @Value("${spring.datasource.username}")
    // private String username;
    //
    // @Value("${spring.datasource.password}")
    // private String password;
    //
    // @Value("${spring.datasource.driver-class-name}")
    // private String driverClassName;
    //
    // @Value("${spring.datasource.initialSize}")
    // private int initialSize;
    //
    // @Value("${spring.datasource.minIdle}")
    // private int minIdle;
    //
    // // @Value("${spring.datasource.maxActive}")
    // // private int maxActive;
    //
    // @Value("${spring.datasource.maxWait}")
    // private int maxWait;
    //
    // @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
    // private int timeBetweenEvictionRunsMillis;
    //
    // @Value("${spring.datasource.minEvictableIdleTimeMillis}")
    // private int minEvictableIdleTimeMillis;
    //
    // @Value("${spring.datasource.validationQuery}")
    // private String validationQuery;
    //
    // @Value("${spring.datasource.testWhileIdle}")
    // private boolean testWhileIdle;
    //
    // @Value("${spring.datasource.testOnBorrow}")
    // private boolean testOnBorrow;
    //
    // @Value("${spring.datasource.testOnReturn}")
    // private boolean testOnReturn;
    //
    // @Value("${spring.datasource.poolPreparedStatements}")
    // private boolean poolPreparedStatements;
    //
    // @Value("${spring.datasource.filters}")
    // private String filters;
    //
    // @Value("${spring.datasource.logSlowSql}")
    // private String logSlowSql;

    // /**
    //  * 将所有前缀为spring.datasource下的配置项都加载DataSource中
    //  *
    //  * @return
    //  */
    // @Primary
    // @Bean(initMethod = "init", destroyMethod = "close")
    // @ConfigurationProperties(prefix = "spring.datasource.druid")
    // public DruidDataSource druidDataSource() {
    //     DruidDataSource dataSource = new DruidDataSource();
    //     return dataSource;
    // }



    // spring.datasource.druid.filters=stat,wall,log4j
    // spring.datasource.druid.web-stat-filter.enabled=true
    // spring.datasource.druid.web-stat-filter.url-pattern=/*
    // spring.datasource.druid.web-stat-filter.exclusions=*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*
    // spring.datasource.druid.web-stat-filter.session-stat-enable=true
    // spring.datasource.druid.web-stat-filter.session-stat-max-count=10
    // spring.datasource.druid.web-stat-filter.principal-session-name=
    // spring.datasource.druid.web-stat-filter.principal-cookie-name=
    // spring.datasource.druid.web-stat-filter.profile-enable=true


    // /**
    //  * Primary 注解作用是当程序选择dataSource时选择被注解的这个
    //  *
    //  * @return
    //  */
    // @Primary
    // @Bean(initMethod = "init", destroyMethod = "close")
    // public DruidDataSource dataSource() {
    //     DruidDataSource datasource = new DruidDataSource();
    //     datasource.setUrl(dbUrl);
    //     datasource.setUsername(username);
    //     datasource.setPassword(password);
    //     datasource.setDriverClassName(driverClassName);
    //     // configuration
    //     datasource.setInitialSize(initialSize);
    //     datasource.setMinIdle(minIdle);
    //     datasource.setMaxActive(maxActive);
    //     datasource.setMaxWait(maxWait);
    //     datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
    //     datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
    //     datasource.setValidationQuery(validationQuery);
    //     datasource.setTestWhileIdle(testWhileIdle);
    //     datasource.setTestOnBorrow(testOnBorrow);
    //     datasource.setTestOnReturn(testOnReturn);
    //     datasource.setPoolPreparedStatements(poolPreparedStatements);
    //     try {
    //         datasource.setFilters(filters);
    //     } catch (SQLException e) {
    //         e.printStackTrace();
    //     }
    //     return datasource;
    // }


    // /**
    //  * 配置Druid的监控统计功能
    //  * 启动后访问如下地址即可查看druid监控统计的sql执行记录(端口需要替换成实际项目中的端口，spring-boot启动默认端口为8080)
    //  * http://localhost:8080/druid
    //  *
    //  * @return
    //  */
    // @Bean
    // public ServletRegistrationBean druidServlet() {
    //     ServletRegistrationBean reg = new ServletRegistrationBean();
    //     reg.setServlet(new StatViewServlet());
    //     reg.addUrlMappings("/druid/*");
    //     // IP白名单
    //     // reg.addInitParameter("allow", "192.168.2.25");
    //     // IP黑名单(共同存在时，deny优先于allow)
    //     // reg.addInitParameter("deny", "127.0.0.1,10.201.98.85");
    //     // 控制台管理用户
    //     reg.addInitParameter("loginUsername", "admin");
    //     reg.addInitParameter("loginPassword", "admin");
    //     // 是否能够重置数据 禁用HTML页面上的“Reset All”功能
    //     reg.addInitParameter("resetEnable", "false");
    //     reg.addInitParameter("logSlowSql", true);
    //
    //     return reg;
    // }
    //
    // /**
    //  * 配置Druid监控 之  web 监控的 filter
    //  * WebStatFilter：用于配置Web和Druid数据源之间的管理关联监控统计
    //  *
    //  * @return
    //  */
    // @Bean
    // public FilterRegistrationBean filterRegistrationBean() {
    //     FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
    //     filterRegistrationBean.setFilter(new WebStatFilter());
    //     filterRegistrationBean.addUrlPatterns("/*");
    //     // 不进行统计的请求
    //     filterRegistrationBean.addInitParameter("exclusions", "*.html,*.js,*.gif,*.jpg,*.png,*.cs*.html,*.js,*.gif,*.jpg,*.png,*.css,*.ico,s,*.ico,/druid/*");
    //     filterRegistrationBean.addInitParameter("profileEnable", "true");
    //     return filterRegistrationBean;
    // }
    //
    // @Bean
    // public WallFilter wallFilter(){
    //     WallConfig wallConfig = new WallConfig();
    //     wallConfig.setMultiStatementAllow(true);
    //     //允许一次执行多条语句
    //     wallConfig.setNoneBaseStatementAllow(true);
    //     //是否允许非以上基本语句的其他语句
    //     wallConfig.setStrictSyntaxCheck(false);
    //
    //     WallFilter wallFilter = new WallFilter();
    //     wallFilter.setConfig(wallConfig);
    //     return wallFilter;
    // }

}

