package springioc;

import json.Person;

/**
 * @author: LiGX
 * @Date: 2019/3/6 0006
 */
public class Demo01 {
    public static void main(String[] args)throws Exception{
        // 反转控制
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Users userEntity = (Users) classPathXmlApplicationContext.getBean("user2");
        System.out.println(userEntity.getUsername()+"----"+userEntity.getPassword());
        Person person = (Person) classPathXmlApplicationContext.getBean("person");
        System.out.println(person);
    }
}
