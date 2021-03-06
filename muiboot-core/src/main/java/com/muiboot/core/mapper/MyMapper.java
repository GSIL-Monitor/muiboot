package com.muiboot.core.mapper;

import com.muiboot.core.mapper.common.InsertByBatchMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertUseGeneratedKeysMapper;
/**
* <p>Description: Mapper操作基类</p>
* @version 1.0 2018/10/12
* @author jin
*/
public interface MyMapper<T> extends Mapper<T>, InsertByBatchMapper<T>, InsertUseGeneratedKeysMapper<T> {

}