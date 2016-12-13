import java.beans.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * Created by xuwei on 2016/11/10.
 */
public class TestIntrospection {
    public static void main(String[] args) throws IntrospectionException, InvocationTargetException, IllegalAccessException {
        Person user =new Person("zhangsan", 21);
        String propertyName = "name";
        PropertyDescriptor pd = new PropertyDescriptor(propertyName, user.getClass());// 直接指定要访问的属性
        Method readMethod = pd.getReadMethod();//获取到读方法
        Object invoke = readMethod.invoke(user, null);// 反射机制调用
        System.out.println("名字：" + invoke);
        pd.getWriteMethod().invoke(user, "lisi");
        invoke = readMethod.invoke(user, null);
        System.out.println("名字：" + invoke);

        // 获取整个Bean的信息
//        BeanInfo beanInfo= Introspector.getBeanInfo(user.getClass());
        BeanInfo beanInfo= Introspector.getBeanInfo(user.getClass(), Object.class);// 在Object类时候停止检索，可以选择在任意一个父类停止

        System.out.println("所有属性描述：");
        PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();// 获取所有的属性描述
        for (PropertyDescriptor propertyDescriptor: pds) {
            System.out.println(propertyDescriptor.getName());
        }
        System.out.println("所有方法描述：");
        for (MethodDescriptor methodDescriptor: beanInfo.getMethodDescriptors()) {
            System.out.println(methodDescriptor.getName());
//            Method method = methodDescriptor.getMethod();
        }
    }
}

