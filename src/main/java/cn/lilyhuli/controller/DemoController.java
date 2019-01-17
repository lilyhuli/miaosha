package cn.lilyhuli.controller;

import cn.lilyhuli.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "Hello World";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public Result<String> hello() {
        return Result.success("hello,little boy");
        // return new Result(0, "success", "hello,little boy");
    }
}
