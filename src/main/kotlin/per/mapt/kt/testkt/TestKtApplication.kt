package per.mapt.kt.testkt

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.transaction.annotation.EnableTransactionManagement

@EnableTransactionManagement
@MapperScan("per.mapt.kt.testkt.mapper")
@SpringBootApplication
class TestKtApplication

fun main(args: Array<String>) {
    runApplication<TestKtApplication>(*args)
}
