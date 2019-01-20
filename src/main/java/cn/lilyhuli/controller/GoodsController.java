package cn.lilyhuli.controller;

import cn.lilyhuli.domain.MiaoshaUser;
import cn.lilyhuli.redis.RedisService;
import cn.lilyhuli.service.GoodsService;
import cn.lilyhuli.service.MiaoshaUserService;
import cn.lilyhuli.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    MiaoshaUserService userService;

    @Autowired
    RedisService redisService;

    @Autowired
    GoodsService goodsService;

    @RequestMapping("/to_list")
    public String list(Model model, MiaoshaUser user) {
        model.addAttribute("user", user);
        //查询商品列表
        List<GoodsVo> goodsList = goodsService.listGoodsVo();
        model.addAttribute("goodsList", goodsList);

        return "goods_list";
    }
}
