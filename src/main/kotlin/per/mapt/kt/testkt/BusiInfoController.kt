package per.mapt.kt.testkt

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/busiInfo")
class BusiInfoController {
    @Autowired
    lateinit var service: BusiInfoService

    @GetMapping("/{tenantId}")
    fun getBusiInfoByTenant(@PathVariable("tenantId") tenantId: String,
                            @RequestParam(name = "pId", required = false) pId: String?): Array<BusiInfoVO>? {
        // the type of pId must 'String?', because of the interaction of Java
        // just have a try of grammar of kotlin (*^_^*)
        return service.getBusiInfoByTenant(tenantId).filter {
            if (pId != null)
                return@filter it.productId == pId
            true
        }.toTypedArray()
    }

    @PostMapping
    fun addBusiInfoForTenant(@RequestBody busiInfo: BusiInfoVO): Boolean {
        service.addBusiInfo(busiInfo)
        return true
    }

}