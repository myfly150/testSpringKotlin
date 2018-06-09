package per.mapt.kt.testkt.mapper

import org.apache.ibatis.annotations.Param
import per.mapt.kt.testkt.BusiInfoVO

interface BusiInfoMapper {
    fun getBusiInfoByTenant(@Param("tenantId") tenantId: String): Array<BusiInfoVO>
    fun insertBusiInfo(info: BusiInfoVO)
}