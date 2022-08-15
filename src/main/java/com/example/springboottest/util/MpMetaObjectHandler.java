package com.example.springboottest.util;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

/**
 * @author cfl
 * @date 2022/8/15 15:22
 */

@Component
public class MpMetaObjectHandler implements MetaObjectHandler {


    /**
     * 插入时的填充策略
     *
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        metaObject.setValue("activated", (byte) 1);
    }

    /**
     * 更新时的填充策略
     *
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        metaObject.setValue("updateAt", System.currentTimeMillis());
    }

}
