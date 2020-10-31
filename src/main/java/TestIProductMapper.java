import com.works.bryant.entity.Product;
import com.works.bryant.mapper.IProductMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestIProductMapper {
    public static void main(String[] args) {
        //加载文件,初始化
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(
           TestIProductMapper.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
        );

        //开启连接
        SqlSession sqlSession = build.openSession(true);

        //获取mapper,获取代理对象
        IProductMapper mapper = sqlSession.getMapper(IProductMapper.class);

        //根据代理对象执行sql语句
        Product product = new Product();
        product.setpName("");
        product.setpImage("xxxx/xxx/xxx");
        int i = mapper.addProduct(product);
        System.out.println(i);
    }
}
