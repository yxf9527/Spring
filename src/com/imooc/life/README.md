spring容器中bean的生命周期包括定义，初始化，使用和销毁

重点注意初始化和销毁

使用和销毁都存在3种方式
1，xml配置文件中配置init-method指定bean中的初始化方法

2，实现特定的接口方法

3，在配置文件中配置一个全局的默认的方法
