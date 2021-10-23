package com.yibao.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yibao.mybatisplus.entity.ProductVO;
import com.yibao.mybatisplus.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 接口：UserMapper
 *
 * @author liyi
 * @create 2021 -10 -19 -11:44
 */
// 使用 Mybatis-Plus 只需要继承，泛型采用 <对应的实体类>
//@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

    // 联表查询
    @Select("SELECT\n" +
            "\tp.id pid,\n" +
            "\tp.`name` pname,\n" +
            "\tu.id uid,\n" +
            "\tu.`name` uname \n" +
            "FROM\n" +
            "\tproduct p\n" +
            "\tLEFT JOIN `user` u ON p.user_id = u.id \n" +
            "WHERE\n" +
            "\tu.id = #{uid}")
    List<ProductVO> selectByUid(String uid);

}
