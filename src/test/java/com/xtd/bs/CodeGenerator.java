package com.xtd.bs;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

/**
 *
 * 代码生成器
 */
public class CodeGenerator {

    @Test
    public void run() {

        // 1、创建代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 2、全局配置
        GlobalConfig gc = new GlobalConfig();
        //得到当前文件夹的路径，有个时候路径得到会有问题，建议使用绝对路径
        //String projectPath = System.getProperty("user.dir");
        //代码生成的最终路径
        gc.setOutputDir("C:\\Users\\谢腾达\\Desktop\\springboot+layui\\bs" + "/src/main/java");
        //设置作者
        gc.setAuthor("谢腾达");
        //写对写错都无所谓
        gc.setOpen(false); //生成后是否打开资源管理器
        //不需要改
        gc.setFileOverride(false); //重新生成时文件是否覆盖
        //这是一种命名规范
        gc.setServiceName("%sService");	//去掉Service接口的首字母I
        //还有一个     IdType.ID.WORKER_STR
        //如果id是long类型，就是用ID_WORKER，如果id是字符串类型，就是用ID_WORKER_STR
        gc.setIdType(IdType.ID_WORKER); //主键策略
        gc.setDateType(DateType.ONLY_DATE);//定义生成的实体类中日期类型
        //gc.setSwagger2(true);//开启Swagger2模式

        mpg.setGlobalConfig(gc);

        // 3、数据源配置
        //mp用的和项目里面的配置不是一个，
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/bs?serverTimezone=GMT%2B8&useUnicode=true&charcterEncoding=UTF-8");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        // 4、包配置
        PackageConfig pc = new PackageConfig();

        //包 com.atgugui.eduservice
        pc.setParent("com.xtd");
        pc.setModuleName("bs");
        pc.setController("controller");
        pc.setEntity("entity");
        pc.setService("service");
        pc.setMapper("mapper");
        mpg.setPackageInfo(pc);

        // 5、策略配置
        StrategyConfig strategy = new StrategyConfig();
        //表名,可以一次生成多个代码
        strategy.setInclude("semester");
        strategy.setNaming(NamingStrategy.underline_to_camel);//数据库表映射到实体的命名策略
        strategy.setTablePrefix(pc.getModuleName() + "_"); //生成实体时去掉表前缀

        strategy.setColumnNaming(NamingStrategy.underline_to_camel);//数据库表字段映射到实体的命名策略

        strategy.setEntityLombokModel(true); // lombok 模型 @Accessors(chain = true) setter链式操作

        strategy.setRestControllerStyle(true); //restful api风格控制器
        strategy.setControllerMappingHyphenStyle(true); //url中驼峰转连字符

        mpg.setStrategy(strategy);


        // 6、执行
        mpg.execute();
    }
}
