该包目录下：bean的定义annoatation和作用域scope以及如何用注解实现

注意使用注解时xml配置文件:
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd" >
        
</beans>
然后配置自动扫描

在类上加的注解@Component，当启动后，扫描器会自动产生一个bean（id为该类名首字母小写）

@Scope("prototype") 每次生成的bean不同
@Scope("singleton") 启动至结束  只有一个实例


@Autowired可以注释属性，构造方法，属性的set方法  都能达到初始化赋值的效果
