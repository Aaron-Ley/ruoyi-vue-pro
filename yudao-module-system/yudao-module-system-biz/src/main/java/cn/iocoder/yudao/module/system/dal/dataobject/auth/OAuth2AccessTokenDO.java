package cn.iocoder.yudao.module.system.dal.dataobject.auth;

import cn.iocoder.yudao.framework.common.enums.UserTypeEnum;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * OAuth2 访问令牌 DO
 *
 * @author 芋道源码
 */
@TableName("system_oauth2_access_token")
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class OAuth2AccessTokenDO extends BaseDO {

    /**
     * 编号，数据库递增
     */
    private Long id;
    /**
     * 访问令牌
     */
    private String accessToken;
    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 用户类型
     *
     * 枚举 {@link UserTypeEnum}
     */
    private Integer userType;
    /**
     * 应用编号
     *
     * 关联 {@link OAuth2ApplicationDO#getId()}
     */
    private Long applicationId;
    /**
     * 过期时间
     */
    private Date expiresTime;

}