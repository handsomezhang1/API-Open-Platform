package com.shuai.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shuai.yuapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * 用户接口信息 Mapper
 *
 * @author <a href="https://github.com/handsomezhang1">张德帅</a>
 * 
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




