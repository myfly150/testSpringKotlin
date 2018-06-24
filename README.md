# testSpringKotlin
A simple project to test the kotlin + spring boot + mybatis. A simple tenant order example.
## Quick Start 
* If you have installed maven, just run `mvn spring-boot:run`，the application will start.
* If you have installed IntelliJ IDEA(maybe AS is also effective), open as a maven project, then run the main method in `src/main/kotlin/per/mapt/kt/testkt/TestKtApplication.kt`
* Then, you need to init the h2 database by `localhost:8080/h2-console`. 
* Default database url is `jdbc:h2:~/test`, username & password is sa.
* There is db.sql to init the database in `src/main/resources/`.

## Interfaces
1. /busiInfo/{tenantId} ,method = GET <br> 
parm: tenantId, the id of a tenant. <br>
parm：pId， the id of product, optional.
2. /busiInfo , method = POST <br>
parm: pkTenant, productId, purNum, activeDate, buziContent
3. /, method = GET no parm 😊


```
u67d0u4e2au4ebau8bf4uff0cu6211u7528u006bu006fu0074u006cu0069u006eu5199u0073u0065u0072u0076u0065u0072u7aefu4e86uff0cu5979u5c31u7528u006bu006fu0074u006cu0069u006eu5199u0041u006eu0064u0072u006fu0069u0064uff0cu6765u4e2au0065u0078u0061u006du0070u006cu0065u7248u7684uff0cu662fu4e0du662fu8be5u6765u4e2au56deu5e94u5462u0028u0020ufe41u0020ufe41u0020u0029u0020u007eu2192
```
