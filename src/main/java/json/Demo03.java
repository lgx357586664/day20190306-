package json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**组装json
 * @author: LiGX
 * @Date: 2019/3/6 0006
 */
public class Demo03 {
    public static void main(String[] args){
        JSONArray jsonArray =new JSONArray();
        JSONObject project =new JSONObject();
        project.put("pId","01");
        project.put("pName","chinese");
        JSONObject project1 =new JSONObject();
        project1.put("pId","02");
        project1.put("pName","english");
        jsonArray.add(project);
        jsonArray.add(project1);
        JSONObject jsonObject =new JSONObject();
        jsonObject.put("id","001");
        jsonObject.put("name","zhangsan");
        jsonObject.put("project",jsonArray);
        System.out.println(jsonObject);
    }
}
