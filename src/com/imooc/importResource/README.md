通过   @ImportResource注解导入配置文件
	 @Value注解获取properties中的key-value值（获取jdbc的url,username,password)
	 
	  
spring配置文件中通过context:property-placeholder location="//"/>加载properties文件

注意获取username是要用变量.属性的方式  否则获取的username是当前系统的用户名


	