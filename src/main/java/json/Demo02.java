package json;

import com.alibaba.fastjson.JSONObject;

/**Json转对象
 * @author: LiGX
 * @Date: 2019/3/6 0006
 */
public class Demo02 {
    static String str="{\"id\": \"001\",\"name\": \"zhangsan\",\"project\": [{\"pId\": \"01\",\"pName\": \"chinese\"}, {\"pId\": \"02\",\"pName\": \"english\"}]}";
    public static void main(String[] args){
        Person person = JSONObject.parseObject(str, Person.class);
        System.out.println(person);
    }
}
