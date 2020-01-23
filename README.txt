PS C:\Users\username\Desktop\spring-configurationproperties-test\demo> mvn clean install
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------------< com.example:demo >--------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:3.1.0:clean (default-clean) @ demo ---
[INFO] Deleting C:\Users\username\Desktop\spring-configurationproperties-test\demo\target
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 3 source files to C:\Users\username\Desktop\spring-configurationproperties-test\demo\target\classes
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\username\Desktop\spring-configurationproperties-test\demo\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to C:\Users\username\Desktop\spring-configurationproperties-test\demo\target\test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ demo ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.example.demo.DemoApplicationTests
21:05:07.353 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
21:05:07.371 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.contex
t.CacheAwareContextLoaderDelegate)]
21:05:07.413 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [com.example.demo.DemoApplicationTests] from class [org.springframework.boot.test.context.SpringBootTestContextBoots
trapper]
21:05:07.442 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.example.demo.DemoApplicationTests], using SpringBootContextLoader
21:05:07.451 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.example.demo.DemoApplicationTests]: class path resource [com/example/demo/DemoApplicationTest
s-context.xml] does not exist
21:05:07.452 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.example.demo.DemoApplicationTests]: class path resource [com/example/demo/DemoApplicationTest
sContext.groovy] does not exist
21:05:07.452 [main] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [com.example.demo.DemoApplicationTests]: no resource found for suffixes {-context.xml, Context.g
roovy}.
21:05:07.514 [main] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [com.example.demo.DemoApplica
tionTests]
21:05:07.632 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [com.example.demo.DemoApplicationTests]: using defaults.
21:05:07.633 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTes
tExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestSe
rviceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springfram
ework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.
test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.ev
ent.EventPublishingTestExecutionListener]
21:05:07.643 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Skipping candidate TestExecutionListener [org.springframework.test.context.web.ServletTestExecutionListener] due to a missing dependency. Specify
 custom listener classes or make the default listener classes and their required dependencies available. Offending class: [javax/servlet/ServletContext]
21:05:07.654 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@2b48a640, org.springframewo
rk.boot.test.mock.mockito.MockitoTestExecutionListener@1e683a3e, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@2053d869, org.springframework.test.context.support.DirtiesContextTestExecutionListene
r@7a419da4, org.springframework.test.context.transaction.TransactionalTestExecutionListener@14555e0a, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@4bb33f74, org.springframework.test.context.event.EventPublishingTestExecu
tionListener@759d26fb, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@3c73951, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@3d5c822d, org.springframework.boot.test.autoconfigure.w
eb.client.MockRestServiceServerResetTestExecutionListener@6f46426d, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@73700b80, org.springframework.boot.test.autoconfigure.web.servlet.WebDrive
rTestExecutionListener@49c7b90e]
21:05:07.658 [main] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener - Before test class: context [DefaultTestContext@67c33749 testClass = DemoApplicationTests, testInstance = [null], testMethod = [null]
, testException = [null], mergedContextConfiguration = [MergedContextConfiguration@fba92d3 testClass = DemoApplicationTests, locations = '{}', classes = '{class com.example.demo.DemoDataSourceConfig, class com.example.demo.DemoDataSourceConfig}'
, contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.
boot.test.context.filter.ExcludeFilterContextCustomizer@e056f20, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@10e41621, org.springframework.boot.test.mock.mockito.MockitoCont
extCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@6ca8564a, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.serv
let.WebDriverContextCustomizerFactory$Customizer@7722c3c3], contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map[[empty]]], class annotated with @DirtiesContext [false] with mode [nu
ll].
21:05:07.670 [main] DEBUG org.springframework.test.context.support.DependencyInjectionTestExecutionListener - Performing dependency injection for test context [[DefaultTestContext@67c33749 testClass = DemoApplicationTests, testInstance = com.exa
mple.demo.DemoApplicationTests@4fb3ee4e, testMethod = [null], testException = [null], mergedContextConfiguration = [MergedContextConfiguration@fba92d3 testClass = DemoApplicationTests, locations = '{}', classes = '{class com.example.demo.DemoDat
aSourceConfig, class com.example.demo.DemoDataSourceConfig}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootst
rapper=true}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@e056f20, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@10e4
1621, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@6ca8564a, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustom
izer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@7722c3c3], contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map[[empty]]]
].
21:05:07.701 [main] DEBUG org.springframework.test.context.support.TestPropertySourceUtils - Adding inlined properties to environment: {spring.jmx.enabled=false, org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true, serve
r.port=-1}

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.2.4.RELEASE)

2020-01-23 21:05:08.031  INFO 1624 --- [           main] com.example.demo.DemoApplicationTests    : Starting DemoApplicationTests on BLS-CIHATZAFER with PID 1624 (started by username in C:\Users\username\Desktop\spring-configurationproperties-test\d
emo)
2020-01-23 21:05:08.033  INFO 1624 --- [           main] com.example.demo.DemoApplicationTests    : No active profile set, falling back to default profiles: default
2020-01-23 21:05:08.184  INFO 1624 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2020-01-23 21:05:08.207  INFO 1624 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 13ms. Found 0 JPA repository interfaces.
2020-01-23 21:05:08.409  WARN 1624 --- [           main] s.c.a.AnnotationConfigApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyExceptio
n: Error creating bean with name 'demoEntityManagerFactory' defined in com.example.demo.DemoDataSourceConfig: Unsatisfied dependency expressed through method 'demoEntityManagerFactory' parameter 0; nested exception is org.springframework.beans.f
actory.BeanCreationException: Error creating bean with name 'demoDataSource' defined in com.example.demo.DemoDataSourceConfig: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException
: Failed to instantiate [com.zaxxer.hikari.HikariDataSource]: Factory method 'demoDataSource' threw exception; nested exception is org.springframework.boot.autoconfigure.jdbc.DataSourceProperties$DataSourceBeanCreationException: Failed to determ
ine a suitable driver class
2020-01-23 21:05:08.415 ERROR 1624 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   :

***************************
APPLICATION FAILED TO START
***************************

Description:

Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.

Reason: Failed to determine a suitable driver class


Action:

Consider the following:
        If you want an embedded database (H2, HSQL or Derby), please put it on the classpath.
        If you have database settings to be loaded from a particular profile you may need to activate it (no profiles are currently active).


  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.2.4.RELEASE)

2020-01-23 21:05:08.457  INFO 1624 --- [           main] com.example.demo.DemoApplicationTests    : Starting DemoApplicationTests on BLS-CIHATZAFER with PID 1624 (started by username in C:\Users\username\Desktop\spring-configurationproperties-test\d
emo)
2020-01-23 21:05:08.457  INFO 1624 --- [           main] com.example.demo.DemoApplicationTests    : No active profile set, falling back to default profiles: default
2020-01-23 21:05:08.479  INFO 1624 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2020-01-23 21:05:08.483  INFO 1624 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 3ms. Found 0 JPA repository interfaces.
2020-01-23 21:05:08.548  WARN 1624 --- [           main] s.c.a.AnnotationConfigApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyExceptio
n: Error creating bean with name 'demoEntityManagerFactory' defined in com.example.demo.DemoDataSourceConfig: Unsatisfied dependency expressed through method 'demoEntityManagerFactory' parameter 0; nested exception is org.springframework.beans.f
actory.BeanCreationException: Error creating bean with name 'demoDataSource' defined in com.example.demo.DemoDataSourceConfig: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException
: Failed to instantiate [com.zaxxer.hikari.HikariDataSource]: Factory method 'demoDataSource' threw exception; nested exception is org.springframework.boot.autoconfigure.jdbc.DataSourceProperties$DataSourceBeanCreationException: Failed to determ
ine a suitable driver class
2020-01-23 21:05:08.550 ERROR 1624 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   :

***************************
APPLICATION FAILED TO START
***************************

Description:

Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.

Reason: Failed to determine a suitable driver class


Action:

Consider the following:
        If you want an embedded database (H2, HSQL or Derby), please put it on the classpath.
        If you have database settings to be loaded from a particular profile you may need to activate it (no profiles are currently active).

2020-01-23 21:05:08.556 ERROR 1624 --- [           main] o.s.test.context.TestContextManager      : Caught exception while allowing TestExecutionListener [org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionList
ener@2053d869] to prepare test instance [com.example.demo.DemoApplicationTests@4fb3ee4e]

java.lang.IllegalStateException: Failed to load ApplicationContext
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:132) ~[spring-test-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:123) ~[spring-test-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependencies(DependencyInjectionTestExecutionListener.java:118) ~[spring-test-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:83) ~[spring-test-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener.prepareTestInstance(SpringBootDependencyInjectionTestExecutionListener.java:43) ~[spring-boot-test-autoconfigure-2.2.4.RELEASE.jar:2.2.4.RE
LEASE]
        at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:244) ~[spring-test-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.test.context.junit.jupiter.SpringExtension.postProcessTestInstance(SpringExtension.java:98) [spring-test-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$5(ClassBasedTestDescriptor.java:337) [junit-jupiter-engine-5.5.2.jar:5.5.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.executeAndMaskThrowable(ClassBasedTestDescriptor.java:342) [junit-jupiter-engine-5.5.2.jar:5.5.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$6(ClassBasedTestDescriptor.java:337) [junit-jupiter-engine-5.5.2.jar:5.5.2]
        at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193) ~[na:1.8.0_211]
        at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:175) ~[na:1.8.0_211]
        at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1382) ~[na:1.8.0_211]
        at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:481) ~[na:1.8.0_211]
        at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471) ~[na:1.8.0_211]
        at java.util.stream.StreamSpliterators$WrappingSpliterator.forEachRemaining(StreamSpliterators.java:312) ~[na:1.8.0_211]
        at java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:743) ~[na:1.8.0_211]
        at java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:742) ~[na:1.8.0_211]
        at java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:580) ~[na:1.8.0_211]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeTestInstancePostProcessors(ClassBasedTestDescriptor.java:336) [junit-jupiter-engine-5.5.2.jar:5.5.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.instantiateAndPostProcessTestInstance(ClassBasedTestDescriptor.java:259) [junit-jupiter-engine-5.5.2.jar:5.5.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$2(ClassBasedTestDescriptor.java:252) [junit-jupiter-engine-5.5.2.jar:5.5.2]
        at java.util.Optional.orElseGet(Optional.java:267) ~[na:1.8.0_211]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$3(ClassBasedTestDescriptor.java:251) [junit-jupiter-engine-5.5.2.jar:5.5.2]
        at org.junit.jupiter.engine.execution.TestInstancesProvider.getTestInstances(TestInstancesProvider.java:29) ~[junit-jupiter-engine-5.5.2.jar:5.5.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$prepare$0(TestMethodTestDescriptor.java:106) ~[junit-jupiter-engine-5.5.2.jar:5.5.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:105) ~[junit-jupiter-engine-5.5.2.jar:5.5.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:69) ~[junit-jupiter-engine-5.5.2.jar:5.5.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$prepare$1(NodeTestTask.java:107) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.prepare(NodeTestTask.java:107) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:75) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at java.util.ArrayList.forEach(ArrayList.java:1257) ~[na:1.8.0_211]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:122) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:80) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at java.util.ArrayList.forEach(ArrayList.java:1257) ~[na:1.8.0_211]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:122) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:80) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:32) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:51) ~[junit-platform-engine-1.5.2.jar:1.5.2]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220) ~[junit-platform-launcher-1.3.1.jar:1.3.1]
        at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188) ~[junit-platform-launcher-1.3.1.jar:1.3.1]
        at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202) ~[junit-platform-launcher-1.3.1.jar:1.3.1]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181) ~[junit-platform-launcher-1.3.1.jar:1.3.1]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128) ~[junit-platform-launcher-1.3.1.jar:1.3.1]
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150) ~[surefire-junit-platform-2.22.2.jar:2.22.2]
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124) ~[surefire-junit-platform-2.22.2.jar:2.22.2]
        at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384) ~[surefire-booter-2.22.2.jar:2.22.2]
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345) ~[surefire-booter-2.22.2.jar:2.22.2]
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126) ~[surefire-booter-2.22.2.jar:2.22.2]
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418) ~[surefire-booter-2.22.2.jar:2.22.2]
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'demoEntityManagerFactory' defined in com.example.demo.DemoDataSourceConfig: Unsatisfied dependency expressed through method 'demoEntityMa
nagerFactory' parameter 0; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'demoDataSource' defined in com.example.demo.DemoDataSourceConfig: Bean instantiation via factory method failed
; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.zaxxer.hikari.HikariDataSource]: Factory method 'demoDataSource' threw exception; nested exception is org.springframework.boot.autoconfigure.j
dbc.DataSourceProperties$DataSourceBeanCreationException: Failed to determine a suitable driver class
        at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:798) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:539) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1338) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1177) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:557) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:517) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:323) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:222) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:321) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1108) ~[spring-context-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:868) ~[spring-context-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:550) ~[spring-context-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:747) ~[spring-boot-2.2.4.RELEASE.jar:2.2.4.RELEASE]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:397) ~[spring-boot-2.2.4.RELEASE.jar:2.2.4.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:315) ~[spring-boot-2.2.4.RELEASE.jar:2.2.4.RELEASE]
        at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:126) ~[spring-boot-test-2.2.4.RELEASE.jar:2.2.4.RELEASE]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:99) ~[spring-test-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:124) ~[spring-test-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        ... 66 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'demoDataSource' defined in com.example.demo.DemoDataSourceConfig: Bean instantiation via factory method failed; nested exception is org.springfram
ework.beans.BeanInstantiationException: Failed to instantiate [com.zaxxer.hikari.HikariDataSource]: Factory method 'demoDataSource' threw exception; nested exception is org.springframework.boot.autoconfigure.jdbc.DataSourceProperties$DataSourceB
eanCreationException: Failed to determine a suitable driver class
        at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:656) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:484) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1338) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1177) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:557) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:517) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:323) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:222) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:321) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1287) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1207) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:885) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:789) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        ... 84 common frames omitted
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.zaxxer.hikari.HikariDataSource]: Factory method 'demoDataSource' threw exception; nested exception is org.springframework.boot.autoconfigure.jdbc.DataSou
rceProperties$DataSourceBeanCreationException: Failed to determine a suitable driver class
        at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:185) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:651) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        ... 98 common frames omitted
Caused by: org.springframework.boot.autoconfigure.jdbc.DataSourceProperties$DataSourceBeanCreationException: Failed to determine a suitable driver class
        at org.springframework.boot.autoconfigure.jdbc.DataSourceProperties.determineDriverClassName(DataSourceProperties.java:233) ~[spring-boot-autoconfigure-2.2.4.RELEASE.jar:2.2.4.RELEASE]
        at org.springframework.boot.autoconfigure.jdbc.DataSourceProperties.initializeDataSourceBuilder(DataSourceProperties.java:174) ~[spring-boot-autoconfigure-2.2.4.RELEASE.jar:2.2.4.RELEASE]
        at com.example.demo.DemoDataSourceConfig.demoDataSource(DemoDataSourceConfig.java:39) ~[classes/:na]
        at com.example.demo.DemoDataSourceConfig$$EnhancerBySpringCGLIB$$dcc26129.CGLIB$demoDataSource$3(<generated>) ~[classes/:na]
        at com.example.demo.DemoDataSourceConfig$$EnhancerBySpringCGLIB$$dcc26129$$FastClassBySpringCGLIB$$87650645.invoke(<generated>) ~[classes/:na]
        at org.springframework.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:244) ~[spring-core-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at org.springframework.context.annotation.ConfigurationClassEnhancer$BeanMethodInterceptor.intercept(ConfigurationClassEnhancer.java:363) ~[spring-context-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        at com.example.demo.DemoDataSourceConfig$$EnhancerBySpringCGLIB$$dcc26129.demoDataSource(<generated>) ~[classes/:na]
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_211]
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_211]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_211]
        at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_211]
        at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:154) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
        ... 99 common frames omitted

[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 2.299 s <<< FAILURE! - in com.example.demo.DemoApplicationTests
[ERROR] contextLoads  Time elapsed: 0 s  <<< ERROR!
java.lang.IllegalStateException: Failed to load ApplicationContext
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'demoEntityManagerFactory' defined in com.example.demo.DemoDataSourceConfig: Unsatisfied dependency expressed through method 'demoEntityMa
nagerFactory' parameter 0; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'demoDataSource' defined in com.example.demo.DemoDataSourceConfig: Bean instantiation via factory method failed
; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.zaxxer.hikari.HikariDataSource]: Factory method 'demoDataSource' threw exception; nested exception is org.springframework.boot.autoconfigure.j
dbc.DataSourceProperties$DataSourceBeanCreationException: Failed to determine a suitable driver class
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'demoDataSource' defined in com.example.demo.DemoDataSourceConfig: Bean instantiation via factory method failed; nested exception is org.springfram
ework.beans.BeanInstantiationException: Failed to instantiate [com.zaxxer.hikari.HikariDataSource]: Factory method 'demoDataSource' threw exception; nested exception is org.springframework.boot.autoconfigure.jdbc.DataSourceProperties$DataSourceB
eanCreationException: Failed to determine a suitable driver class
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.zaxxer.hikari.HikariDataSource]: Factory method 'demoDataSource' threw exception; nested exception is org.springframework.boot.autoconfigure.jdbc.DataSou
rceProperties$DataSourceBeanCreationException: Failed to determine a suitable driver class
Caused by: org.springframework.boot.autoconfigure.jdbc.DataSourceProperties$DataSourceBeanCreationException: Failed to determine a suitable driver class

[INFO]
[INFO] Results:
[INFO]
[ERROR] Errors: 
[ERROR]   DemoApplicationTests.contextLoads » IllegalState Failed to load ApplicationCon...
[INFO]
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  8.867 s
[INFO] Finished at: 2020-01-23T21:05:10+03:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.2:test (default-test) on project demo: There are test failures.
[ERROR]
[ERROR] Please refer to C:\Users\username\Desktop\spring-configurationproperties-test\demo\target\surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
PS C:\Users\username\Desktop\spring-configurationproperties-test\demo>
