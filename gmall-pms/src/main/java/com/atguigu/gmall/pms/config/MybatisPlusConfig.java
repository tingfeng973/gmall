package com.atguigu.gmall.pms.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        //设置请求的页面大于最大页面后操作，true跳转至首页，false继续请求。默认为false
        //paginationInterceptor.setOverflow(false);
        //设置最大单页容量，默认500条，-1为不受限制
        //paginationInterceptor.setLimit(500);

        return paginationInterceptor;
    }
}
