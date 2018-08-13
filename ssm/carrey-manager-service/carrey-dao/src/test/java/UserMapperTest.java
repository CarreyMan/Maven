import com.carrey.manager.dao.UserMapper;
import com.carrey.manager.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Carrey on 2018/8/13.
 */
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void queryAllUser(){
        ArrayList<User> users = userMapper.queryAllUser();
    }
}
