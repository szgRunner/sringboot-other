package sun.zhao.guo.javaguide.dynamicagent.cglib;

public class CglibSmsService {

    public String send(String message){
        System.out.println("send message: " + message);
        return message;
    }

}
