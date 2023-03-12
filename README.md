# Init option of class Bean with spring
> All init bean run on main thread, that mean Sequential
 
> If one of them will be throw un catch exception -> Application will be failed

# Getting Started
Run `InitBeanApplication`
```text
2023-03-12T08:31:07.950+02:00  INFO 22084 --- [           main] com.github.rbaul.initbean.BaseInit       : Construct Run: AInit
2023-03-12T08:31:07.967+02:00  INFO 22084 --- [           main] com.github.rbaul.initbean.BaseInit       : PostConstruct Run: AInit
2023-03-12T08:31:07.972+02:00  INFO 22084 --- [           main] com.github.rbaul.initbean.BaseInit       : Construct Run: BInit
2023-03-12T08:31:07.974+02:00  INFO 22084 --- [           main] com.github.rbaul.initbean.BaseInit       : PostConstruct Run: BInit
2023-03-12T08:31:07.975+02:00  INFO 22084 --- [           main] com.github.rbaul.initbean.BaseInit       : Construct Run: CInit
2023-03-12T08:31:07.976+02:00  INFO 22084 --- [           main] com.github.rbaul.initbean.BaseInit       : PostConstruct Run: CInit
2023-03-12T08:31:08.146+02:00  INFO 22084 --- [           main] c.g.rbaul.initbean.InitBeanApplication   : Started InitBeanApplication in 2.35 seconds (process running for 3.064)
2023-03-12T08:31:08.147+02:00  INFO 22084 --- [           main] com.github.rbaul.initbean.BaseInit       : EventListener: ApplicationStartedEvent Event: AInit
2023-03-12T08:31:08.147+02:00  INFO 22084 --- [           main] com.github.rbaul.initbean.BaseInit       : EventListener: ApplicationStartedEvent Event: BInit
2023-03-12T08:31:08.148+02:00  INFO 22084 --- [           main] com.github.rbaul.initbean.BaseInit       : EventListener: ApplicationStartedEvent Event: CInit
2023-03-12T08:31:08.151+02:00  INFO 22084 --- [           main] com.github.rbaul.initbean.BaseInit       : ApplicationRunner Run: AInit
2023-03-12T08:31:08.151+02:00  INFO 22084 --- [           main] com.github.rbaul.initbean.BaseInit       : CommandLineRunner: AInit
2023-03-12T08:31:08.152+02:00  INFO 22084 --- [           main] com.github.rbaul.initbean.BaseInit       : ApplicationRunner Run: BInit
2023-03-12T08:31:08.152+02:00  INFO 22084 --- [           main] com.github.rbaul.initbean.BaseInit       : CommandLineRunner: BInit
2023-03-12T08:31:08.152+02:00  INFO 22084 --- [           main] com.github.rbaul.initbean.BaseInit       : ApplicationRunner Run: CInit
2023-03-12T08:31:08.152+02:00  INFO 22084 --- [           main] com.github.rbaul.initbean.BaseInit       : CommandLineRunner: CInit
2023-03-12T08:31:08.154+02:00  INFO 22084 --- [           main] com.github.rbaul.initbean.BaseInit       : ApplicationListener Event: AInit
2023-03-12T08:31:08.155+02:00  INFO 22084 --- [           main] com.github.rbaul.initbean.BaseInit       : ApplicationListener Event: BInit
2023-03-12T08:31:08.156+02:00  INFO 22084 --- [           main] com.github.rbaul.initbean.BaseInit       : ApplicationListener Event: CInit
```