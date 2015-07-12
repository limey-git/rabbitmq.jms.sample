**************************************************************************************************************
*                                                                                                            *
* In case anybody's wondering, the handles «limey-git» and  «pommie.twit» are self-deprecating inside-jokes. *
*                                                                                                            *
**************************************************************************************************************
                                                                                                            

The source code in this project was copied pretty much verbatim from http://blog.pivotal.io/pivotal/products/messaging-with-jms-and-rabbitmq.

Unfortunately, the source code provided at http://blog.pivotal.io/pivotal/products/messaging-with-jms-and-rabbitmq does not work.

If you copy, paste compile and run the code precisely as it is provided on http://blog.pivotal.io/pivotal/products/messaging-with-jms-and-rabbitmq as of July 12, 2015, the producer will successfully enQ the message. However, the consumer does absolutely nothing.


This is the stdout for a run...
...
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 11.668s
[INFO] Finished at: Sun Jul 12 17:21:37 BST 2015
[INFO] Final Memory: 21M/251M
[INFO] ------------------------------------------------------------------------

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.2.5.RELEASE)

2015-07-12 17:21:44.479  INFO 8344 --- [           main] pommie.twit.jms.StockQuoter              : Starting StockQuoter v0.0.0-alpha on boyd with PID 8344 (D:\development\projects\mule\BGLpractice\target\BGLpractice-0.0.0-alpha.jar started by williamcboyd in D:\development\projects\mule\BGLpractice)
2015-07-12 17:21:44.620  INFO 8344 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@7213a906: startup date [Sun Jul 12 17:21:44 BST 2015]; root of context hierarchy
2015-07-12 17:21:46.788  INFO 8344 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.scheduling.annotation.SchedulingConfiguration' of type [class org.springframework.scheduling.annotation.SchedulingConfiguration$$EnhancerBySpringCGLIB$$1ea51b25] is not eligible for getting processed by all BeanPostProcessors (for example:
2015-07-12 17:21:46.835  INFO 8344 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.amqp.rabbit.annotation.RabbitBootstrapConfiguration' of type [class org.springframework.amqp.rabbit.annotation.RabbitBootstrapConfiguration$$EnhancerBySpringCGLIB$$b7b72878] is not eligible for getting processed by all BeanPostProcessors (
2015-07-12 17:21:46.897  INFO 8344 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.jms.annotation.JmsBootstrapConfiguration' of type [class org.springframework.jms.annotation.JmsBootstrapConfiguration$$EnhancerBySpringCGLIB$$5ccae5ad] is not eligible for getting processed by all BeanPostProcessors (for example: not eligi
2015-07-12 17:21:48.551  INFO 8344 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2015-07-12 17:21:48.566  INFO 8344 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 2147483647
2015-07-12 17:21:48.800  INFO 8344 --- [           main] pommie.twit.jms.StockQuoter              : Started StockQuoter in 5.179 seconds (JVM running for 6.505)
2015-07-12 17:21:48.800  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 115.0
2015-07-12 17:21:48.800  INFO 8344 --- [           main] pommie.twit.jms.StockQuoter              : connectionFactory => RMQConnectionFactory{user='guest', password=xxxxxxxx, host='localhost', port=5672, virtualHost='/', queueBrowserReadMax=0}
2015-07-12 17:21:53.808  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...AAPL is now 464.0
2015-07-12 17:21:58.816  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...AAPL is now 436.0
2015-07-12 17:22:03.808  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 84.0
2015-07-12 17:22:08.815  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 115.0
2015-07-12 17:22:13.807  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 89.0
2015-07-12 17:22:18.815  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 108.0
2015-07-12 17:22:23.807  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 80.0
2015-07-12 17:22:28.814  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 82.0
2015-07-12 17:22:33.806  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...AAPL is now 414.0
2015-07-12 17:22:38.814  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 116.0
2015-07-12 17:22:43.806  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...AAPL is now 385.0
2015-07-12 17:22:48.814  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...AAPL is now 354.0
2015-07-12 17:22:53.806  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 77.0
2015-07-12 17:22:58.813  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 114.0
2015-07-12 17:23:03.805  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 106.0
2015-07-12 17:23:08.813  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 113.0
2015-07-12 17:23:13.805  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 73.0
2015-07-12 17:23:18.812  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 107.0
2015-07-12 17:23:23.820  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 72.0
2015-07-12 17:23:28.812  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 66.0
2015-07-12 17:23:33.820  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 60.0
2015-07-12 17:23:38.812  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...AAPL is now 322.0
2015-07-12 17:23:43.819  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...AAPL is now 344.0
2015-07-12 17:23:48.811  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 100.0
2015-07-12 17:23:53.819  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 94.0
2015-07-12 17:23:58.811  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 65.0
2015-07-12 17:24:03.819  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 96.0
2015-07-12 17:24:08.811  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 70.0
2015-07-12 17:24:13.818  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 90.0
2015-07-12 17:24:18.810  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 76.0
2015-07-12 17:24:23.818  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 69.0
2015-07-12 17:24:28.810  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 65.0
2015-07-12 17:24:33.817  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 95.0
2015-07-12 17:24:38.809  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 95.0
2015-07-12 17:24:43.817  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...AAPL is now 333.0
2015-07-12 17:24:48.809  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 88.0
2015-07-12 17:24:53.817  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 80.0
2015-07-12 17:24:58.809  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 84.0
2015-07-12 17:25:03.816  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 63.0
2015-07-12 17:25:08.808  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 81.0
2015-07-12 17:25:13.816  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 64.0
2015-07-12 17:25:18.823  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 62.0
2015-07-12 17:25:23.815  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 62.0
2015-07-12 17:25:28.823  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 79.0
2015-07-12 17:25:33.815  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...AAPL is now 342.0
2015-07-12 17:25:38.823  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 57.0
2015-07-12 17:25:43.815  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...AAPL is now 318.0
2015-07-12 17:25:48.822  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...AAPL is now 314.0
2015-07-12 17:25:53.814  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 80.0
2015-07-12 17:25:58.822  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 55.0
2015-07-12 17:26:03.814  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...AAPL is now 301.0
2015-07-12 17:26:08.822  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 52.0
2015-07-12 17:26:13.814  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...AAPL is now 294.0
2015-07-12 17:26:18.821  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...AAPL is now 299.0
2015-07-12 17:26:23.813  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 54.0
2015-07-12 17:26:28.821  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 87.0
2015-07-12 17:26:33.813  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 54.0
2015-07-12 17:26:38.820  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 50.0
2015-07-12 17:26:43.812  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 84.0
2015-07-12 17:26:48.820  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 52.0
2015-07-12 17:26:53.812  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...AAPL is now 287.0
2015-07-12 17:26:58.820  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 77.0
2015-07-12 17:27:03.812  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 53.0
2015-07-12 17:27:08.819  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 83.0
2015-07-12 17:27:13.827  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 83.0
2015-07-12 17:27:18.819  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 52.0
2015-07-12 17:27:23.826  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 86.0
2015-07-12 17:27:28.819  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...AAPL is now 301.0
2015-07-12 17:27:33.826  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 48.0
2015-07-12 17:27:38.818  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...AAPL is now 291.0
2015-07-12 17:27:43.826  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 93.0
2015-07-12 17:27:48.818  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 47.0
2015-07-12 17:27:53.825  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 47.0
2015-07-12 17:27:58.817  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 42.0
2015-07-12 17:28:03.825  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 42.0
2015-07-12 17:28:08.817  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 38.0
2015-07-12 17:28:13.825  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 37.0
2015-07-12 17:28:18.817  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...BRK.B is now 91.0
2015-07-12 17:28:23.824  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...GD is now 37.0
2015-07-12 17:28:28.816  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...AAPL is now 276.0
2015-07-12 17:28:33.824  INFO 8344 --- [pool-5-thread-1] pommie.twit.jms.StockQuoter              : Quote...AAPL is now 256.0
2015-07-12 17:28:35.649  INFO 8344 --- [       Thread-2] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@7213a906: startup date [Sun Jul 12 17:21:44 BST 2015]; root of context hierarchy
2015-07-12 17:28:35.665  INFO 8344 --- [       Thread-2] o.s.c.support.DefaultLifecycleProcessor  : Stopping beans in phase 2147483647
2015-07-12 17:28:35.992  INFO 8344 --- [       Thread-2] o.s.j.e.a.AnnotationMBeanExporter        : Unregistering JMX-exposed beans on shutdown
...










 