1       Resource简介

       在Spring内部，针对于资源文件有一个统一的接口Resource表示。其主要实现类有ClassPathResource、FileSystemResource、UrlResource、ByteArrayResource、ServletContextResource和InputStreamResource。Resource接口中主要定义有以下方法：
l  exists()：用于判断对应的资源是否真的存在。
l  isReadable()：用于判断对应资源的内容是否可读。需要注意的是当其结果为true的时候，其内容未必真的可读，但如果返回false，则其内容必定不可读。
l  isOpen()：用于判断当前资源是否代表一个已打开的输入流，如果结果为true，则表示当前资源的输入流不可多次读取，而且在读取以后需要对它进行关闭，以防止内存泄露。该方法主要针对于InputStreamResource，实现类中只有它的返回结果为true，其他都为false。
l  getURL()：返回当前资源对应的URL。如果当前资源不能解析为一个URL则会抛出异常。如ByteArrayResource就不能解析为一个URL。
l  getFile()：返回当前资源对应的File。如果当前资源不能以绝对路径解析为一个File则会抛出异常。如ByteArrayResource就不能解析为一个File。
l  getInputStream()：获取当前资源代表的输入流。除了InputStreamResource以外，其它Resource实现类每次调用getInputStream()方法都将返回一个全新的InputStream。
 
   ClassPathResource可用来获取类路径下的资源文件。假设我们有一个资源文件test.txt在类路径下，我们就可以通过给定对应资源文件在类路径下的路径path来获取它，new ClassPathResource(“test.txt”)。
   FileSystemResource可用来获取文件系统里面的资源。我们可以通过对应资源文件的文件路径来构建一个FileSystemResource。FileSystemResource还可以往对应的资源文件里面写内容，当然前提是当前资源文件是可写的，这可以通过其isWritable()方法来判断。FileSystemResource对外开放了对应资源文件的输出流，可以通过getOutputStream()方法获取到。
   UrlResource可用来代表URL对应的资源，它对URL做了一个简单的封装。通过给定一个URL地址，我们就能构建一个UrlResource。
   ByteArrayResource是针对于字节数组封装的资源，它的构建需要一个字节数组。
   ServletContextResource是针对于ServletContext封装的资源，用于访问ServletContext环境下的资源。ServletContextResource持有一个ServletContext的引用，其底层是通过ServletContext的getResource()方法和getResourceAsStream()方法来获取资源的。
   InputStreamResource是针对于输入流封装的资源，它的构建需要一个输入流。
       
       
2     通过ResourceLoader获取资源

       在Spring里面还定义有一个ResourceLoader接口，该接口中只定义了一个用于获取Resource的
       getResource(String location)方法。它的实现类有很多，这里我们先挑一个DefaultResourceLoader来讲。
       DefaultResourceLoader在获取Resource时采用的是这样的策略：首先判断指定的location是否含有“classpath:”
       前缀，如果有则把location去掉“classpath:”前缀返回对应的ClassPathResource；否则就把它当做一个URL来处理，
       封装成一个UrlResource进行返回；如果当成URL处理也失败的话就把location对应的资源当成是一个ClassPathResource
       进行返回。