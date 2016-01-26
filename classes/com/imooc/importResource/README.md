通过   @ImportResource注解导入配置文件
	 @Value注解获取properties中的key-value值（获取jdbc的url,username,password)
	 
	  
spring配置文件中通过context:property-placeholder location="//"/>加载properties文件

注意获取username是要用变量.属性的方式  否则获取的username是当前系统的用户名

还有另外一种方式直接通过在spring配置文件中配置实现配置jdbc

<context:property-placeholder location="classpath:springconfig/jdbc.properties"/>
<bean class="org.springframework.jdbc.datasource.DriverManagerDataSource">
   		<property name="url" value="${jdbc.url}"></property>
   		<property name="username" value="${jdbc.username}"></property>
   		<property name="password" value="${jdbc.password}"></property>
</bean>

@scope一栏是生成bean的模式（默认是单例singleton）


	