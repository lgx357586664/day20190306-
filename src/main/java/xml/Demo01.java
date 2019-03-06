package xml;

import org.apache.commons.lang3.StringUtils;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/**
 * @author: LiGX
 * @Date: 2019/3/6 0006
 */
public class Demo01 {
    public static void main(String[] args)throws Exception{
       //创建一个解析器
        SAXReader reader =new SAXReader();
        Document document = reader.read(new File("D:\\JavaWeb\\day08\\笔记\\student.xml"));
        //在一个容器中只有一个最大的节点
        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());
        getNote(rootElement);
    }

    public static void getNote(Element rootElement) {
        List<Element> elements = rootElement.elements();
        for (Element element:elements) {
            System.out.println(element.getName());
            List<Attribute> attributes = element.attributes();
            if(attributes.size()!=0){
                Attribute id = attributes.get(0);
                System.out.println(id.getName());
                String val = element.attributeValue(id.getQName());
                System.out.println(val);
            }
            String textTrim = element.getTextTrim();
            if(!StringUtils.isEmpty(textTrim)){
                System.out.println("textTrim:"+textTrim);
            }
            getNote(element);
        }
//        getNodes(rootElement);
//
//    }
//
//    static public void getNodes(Element rootElement) {
//        System.out.println("当前节点名称:" + rootElement.getName());
//        // 获取属性ID
//        List<Attribute> attributes = rootElement.attributes();
//        for (Attribute attribute : attributes) {
//            System.out.println("属性:" + attribute.getName() + "---" + attribute.getText());
//        }
//        if (!rootElement.getTextTrim().equals("")) {
//            System.out.println(rootElement.getName() + "--" + rootElement.getText());
//        }
//        // 使用迭代器遍历
//        Iterator<Element> elementIterator = rootElement.elementIterator();
//        while (elementIterator.hasNext()) {
//            Element next = elementIterator.next();
//            getNodes(next);
//        }
    }

}
