package json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**解析JSON
 * @author: LiGX
 * @Date: 2019/3/6 0006
 */
public class Demo01 {
    static String str="{\"id\": \"001\",\"name\": \"zhangsan\",\"project\": [{\"pId\": \"01\",\"pName\": \"chinese\"}, {\"pId\": \"02\",\"pName\": \"english\"}]}";
    public static void main(String[] args){
//        System.out.println(str);
        JSONObject jsonObject = JSONObject.parseObject(str);
        String id = jsonObject.getString("id");
        System.out.println("id = "+id);
        String name = jsonObject.getString("name");
        System.out.println("name = "+name);
        JSONArray jsonArray = jsonObject.getJSONArray("project");
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject project = jsonArray.getJSONObject(i);
            String pId = project.getString("pId");
            String pName = project.getString("pName");
            System.out.println("pId = "+pId);
            System.out.println("pName = "+pName);
        }


    }

}
