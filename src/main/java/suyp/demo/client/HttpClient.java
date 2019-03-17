package suyp.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "user", url = "${vertx.url}")
public interface HttpClient {

    //feign独有的注解方式
//    @RequestLine("GET /user/index")
//    String index();

    /*auther suyp
    * post请求
    * @param str 请求体
    * */
    @RequestMapping(value = "/sendurl", method = RequestMethod.POST)
    String ret(@RequestBody String str);

//    @RequestMapping(value = "/get0/{id}", method = RequestMethod.GET)
//    User findById(@PathVariable("id") Long id);
//
//    @RequestMapping(value = "/get1", method = RequestMethod.GET)
//    User get1(@RequestParam("id") Long id, @RequestParam("name") String name);
//
//    @RequestMapping(value = "/get2", method = RequestMethod.GET)
//    User get2(@RequestParam Map<String, Object> map);
//
//    @RequestMapping(value = "/hello2", method=RequestMethod.GET)
//    User hello2(@RequestHeader("name") String name, @RequestHeader("age") Integer age);
//
//    @RequestMapping(value = "/hello3", method=RequestMethod.POST)
//    String hello3(@RequestBody User user);
}
