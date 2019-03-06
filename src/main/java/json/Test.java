package json;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author: LiGX
 * @Date: 2019/3/6 0006
 * 从前有座山，山上有座庙，庙里有三个和尚。和尚的名字为：小强，三丰，唐僧 年龄都是90后
 *         这座庙有100年的历史了，庙的名字叫 得道长生庙
 *          要求：将庙作为一个对象，来将和尚的信息打印出来。
 */
public class Test {
    public static void main(String[] args){
        JSONArray jsonArray = new JSONArray();
        JSONObject monk1 = new JSONObject();
        JSONObject monk2 = new JSONObject();
        JSONObject monk3 = new JSONObject();
        monk1.put("mName","小强");
        monk1.put("mAge","25");
        monk2.put("mName","三丰");
        monk2.put("mAge","27");
        monk3.put("mName","唐僧");
        monk3.put("mAge","23");
        jsonArray.add(monk1);
        jsonArray.add(monk2);
        jsonArray.add(monk3);
        JSONObject temple = new JSONObject();
        temple.put("age","100");
        temple.put("name","得到长生庙");
        temple.put("monks",jsonArray);
        System.out.println(temple);
    }
}
