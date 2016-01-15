通过在配置文件中配置实现自动装配

可以通过name，type，构造器进行自动装配

设置了全局的default-autoWire后系统容器会根根设置的方式（name,type,constructor）去扫描配置文件

default-autowire="byName" bean的属性值的定义名与配置文件中的设置的id相同，即自动装配  （属性要设置set方法）

default-autowire="byType" 按照bean的属性值的类型在配置文件中扫描  即自动装配（属性要设置set方法）

default-autowire="constructor"  按照构造器的参数的类型扫描配置文件  即自动装配

