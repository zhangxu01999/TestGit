package cn.zx.my.modules.index.web;
@Controller
public class IndexController {

    @RequestMapping("/")
    @ResponseBody


    public String index(){
        return "index";
    }
}
