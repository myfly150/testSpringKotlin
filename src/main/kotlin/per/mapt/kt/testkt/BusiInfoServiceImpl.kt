package per.mapt.kt.testkt

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import per.mapt.kt.testkt.mapper.BusiInfoMapper
import java.util.*

// Do not need open modifier because of  spring compiler plugin of kotlin
@Service
class BusiInfoServiceImpl : BusiInfoService {

    @Autowired
    lateinit var mapper: BusiInfoMapper

    override fun getBusiInfoByTenant(tenantId: String): Array<BusiInfoVO> {
        return mapper.getBusiInfoByTenant(tenantId)
    }

    @Transactional
    override fun addBusiInfo(busiInfoVO: BusiInfoVO) {
        busiInfoVO.id = UUID.randomUUID().toString()
        busiInfoVO.activeDate = Date()
        mapper.insertBusiInfo(busiInfoVO)
    }

}