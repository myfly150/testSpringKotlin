# testSpringKotlin
A simple project to test the kotlin + spring boot + mybatis. A simple tenant order example.
## Quick Start 
* If you have installed maven, just run `mvn spring-boot:run`，the application will start.
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
