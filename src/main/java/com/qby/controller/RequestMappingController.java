package com.qby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 为当前所有的方法的请求地址指定一个基准路径
 *
 * @author qby
 * @date 2020/6/23 23:34
 */
@RequestMapping("/haha")
@Controller
public class RequestMappingController {

    @RequestMapping("/handle01")
    public String handle01() {
        return "success";
    }


    /**
     * method：限定请求方法
     * GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE
     * 指定请求方式时 只接收指定请求方式的请求
     * method = RequestMethod.POST 只接受这种类型请求，默认时什么都可以
     * 不是规定方式时报错，HTTP状态 405 - 方法不允许
     * 4XX错误都是客户端错误
     *
     * params：规定请求参数
     * params和headers 支持简单的表达式
     * param1：表示必须包含 param1 的请求参数
     *      params = {"username"} 发送请求时必须带上一个名为 username 的参数
     *      没带参数：HTTP状态 400 - 错误的请求
     * !param1：表示不能包含 param1 的请求参数
     *      params = {"!username"} 发送请求时不能有一个名为 username 的参数
     *      带上参数：HTTP状态 400 - 错误的请求
     * param1 != value1 ：表示请求包含名为 param1的请求参数，但是其值不能为 value1
     *      params = {"username!=123"} 发送请求时不能有 username=123 的参数
     *      带上参数：HTTP状态 400 - 错误的请求
     * params = {"username!=123", "pwd", "!age"}：请求参数必须满足所有条件
     *      params = {"username!=123", "pwd", "!age"} 发送请求时不能有 username=123 的参数 并且有参数pwd 并且不能有age参数
     *
     * headers：规定请求头 也和 params 一样能写简单表达式
     *      headers = {"User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:76.0) Gecko/20100101 Firefox/76.0"}
     *      谷歌
     *      User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.61 Safari/537.36
     *      火狐
     *      User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:76.0) Gecko/20100101 Firefox/76.0
     *
     * consumes：只接受内容类型时那种的请求，规定请求头中的 Content-Type
     *
     * produces：告诉浏览器返回的内容类型是什么，给响应头中加上 Content-Type:text/heml;charset=utf-8
     *
     *
     * @return
     */
    @RequestMapping(value = "/handle02", method = RequestMethod.POST)
    public String handle02() {
        return "success";
    }

    @RequestMapping(value = "/handle03", params = {"username!=123"})
    public String handle03() {
        return "success";
    }

    /**
     * User-Agent：浏览器信息
     * 让火狐能访问，谷歌不能访问
     *
     * 谷歌
     * User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.61 Safari/537.36
     *
     * 火狐
     * User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:76.0) Gecko/20100101 Firefox/76.0
     *
     * @return
     */
    @RequestMapping(value = "/handle04", headers = {"User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:76.0) Gecko/20100101 Firefox/76.0"})
    public String handle04() {
        return "success";
    }
}
