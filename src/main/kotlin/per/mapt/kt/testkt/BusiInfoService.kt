package per.mapt.kt.testkt

interface BusiInfoService {
    fun getBusiInfoByTenant(tenantId: String): Array<BusiInfoVO>
    fun addBusiInfo(busiInfoVO: BusiInfoVO)
}