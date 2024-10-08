package com.czk.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.czk.gulimall.product.entity.BrandEntity;
import com.czk.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {


    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("HuaWei");
//        brandEntity.setDescript("国产品牌");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
        list.forEach((item) -> {
            System.out.println(item);
        });
    }

}
