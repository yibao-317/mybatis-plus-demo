package com.yibao.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yibao.mybatisplus.entity.ProductVO;
import com.yibao.mybatisplus.entity.User;
import com.yibao.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisplusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void findAll() {
        // 不加任何条件遍历
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    void delete() {
        userMapper.deleteById("1");
    }

    @Test
    void insert() {
        // 新增
        User user = new User();
        user.setName("yibao");
        user.setAge(43);
        userMapper.insert(user);
    }

    @Test
    void update() {
        // 修改
        User user = userMapper.selectById("2");
        user.setAge(111);
        userMapper.updateById(user);

    }


    // =========================================================================================================

    @Test
    void selectMethod() {
        // 不加条件，查询所有
//        userMapper.selectList(null);

        // 根据条件查询
        QueryWrapper wrapper = new QueryWrapper();
//        wrapper.eq("name", "张三");
//        List users = userMapper.selectList(wrapper);

        // 单个查询
//        wrapper.eq("name", "张三");
//        User users = userMapper.selectOne(wrapper);

        // 根据多条件查询
//        Map<String,Object> map = new HashMap<>();
//        map.put("name", "张三");
//        map.put("age", 99);
//        List<User> users = userMapper.selectByMap(map);

        // 模糊查询 & 左模糊 & 右模糊
//        QueryWrapper queryWrapper = new QueryWrapper();
//        queryWrapper.like("name", "张");
//        List users = userMapper.selectList(queryWrapper);

        // 联合查询
//        wrapper.inSql("id", "select id from user where id < 3");
//        wrapper.inSql("age", "select age from user where age > 10");
//        List users = userMapper.selectList(wrapper);

        // 排序 + having
//        wrapper.orderByAsc("age");
//        wrapper.having("id > 2");
//        List users = userMapper.selectList(wrapper);

        // 根据多个 id 查询
//        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));

        // 将查询的结果封装到 Map中
//        List users = userMapper.selectList(null);


//        System.out.println(users);

    }


    @Test
    void selectMethod2() {
        // 分页查询
        Page<User> page = new Page<>(1, 2);
        Page<User> result = userMapper.selectPage(page, null);
        System.out.println("总页数： " + result.getSize());
        System.out.println("总个数： " + result.getTotal());
        // 数据
        List<User> users = result.getRecords();
        System.out.println(users);
    }

    @Test
    void selectMethod03() {
        // 分页查询  --- 结果用 map 封装
        Page<Map<String, Object>> page = new Page<>(1, 2);
        List<Map<String, Object>> userMaps = userMapper.selectMapsPage(page, null).getRecords();
        System.out.println(userMaps);
    }


    @Test
    void productVO() {
        List<ProductVO> productVO = userMapper.selectByUid("3");
        System.out.println(productVO);
    }


}
