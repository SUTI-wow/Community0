package com.suti.community;

import com.suti.community.dao.DiscussPostMapper;
import com.suti.community.dao.UserMapper;
import com.suti.community.entity.DiscussPost;
import com.suti.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
//导入NewCoderCommunity的配置类
@ContextConfiguration(classes = NewcoderCommunityApplication.class)
public class MapperTest {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectUser(){
        User user = userMapper.selectById(101);
        System.out.println(user);

        user = userMapper.selectByName("liubei");
        System.out.println(user);

        user = userMapper.selectByEmail("nowcoder101@sina.com");
        System.out.println(user);
    }

    @Test
    public void testInsertUser(){
        User user = new User();
        user.setUsername("suti");
        user.setPassword("123456");
        user.setSalt("asd");
        user.setEmail("test@qq.com");
        user.setHeaderUrl("http://www.nowcoder.com/101.png");
        user.setCreateTime(new Date());

        int rows = userMapper.insert(user);
        System.out.println(rows);
        System.out.println(user.getId());
    }

    @Test
    public void testUpdateUser(){
        int rows = userMapper.updateStatus(150,1);
        System.out.println(rows);

        rows = userMapper.updateHeader(150,"http://www.nowcoder.com/102.png");
        System.out.println(rows);

        rows = userMapper.updatePassword(150,"asdfgh");
        System.out.println(rows);
    }

    @Test
    public void testSelectPosts(){
        List<DiscussPost> postList =  discussPostMapper.selectDiscussPosts(0,0,20);
        for(DiscussPost post:postList)
            System.out.println(post);

        int rows = discussPostMapper.selectDiscussPostRows(0);
        System.out.println(rows);

        List<DiscussPost> postList1 =  discussPostMapper.selectDiscussPosts(149,0,20);
        for(DiscussPost post1:postList1)
            System.out.println(post1);

        int rows1 = discussPostMapper.selectDiscussPostRows(149);
        System.out.println(rows1);
    }
}
