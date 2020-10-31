import com.works.bryant.entity.Product;
import com.works.bryant.mapper.IProductMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class TestSelect {
    public static void main(String[] args) {
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(
                TestIProductMapper.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
        );

        //开启连接
        SqlSession sqlSession = build.openSession(true);

        //获取mapper,获取代理对象
        IProductMapper mapper = sqlSession.getMapper(IProductMapper.class);
        List<Product> products = mapper.selectAll(0);
        for (Product product:products) {
            System.out.println(product);
        }
    }
}
