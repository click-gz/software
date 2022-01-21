package software.xmclass.Software_engineering._course.controller;

import net.sourceforge.pinyin4j.PinyinHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import software.xmclass.Software_engineering._course.utils.JsonData;

import java.util.Map;

@RestController
@RequestMapping("test")
public class text {
    @GetMapping("test")
    public JsonData getPracticalUserList(@RequestBody Map<String , String> info){
        String[] pinyin = PinyinHelper.toHanyuPinyinStringArray( info.get("name").charAt(0));
        pinyin[0] = pinyin[0].toUpperCase();
        return JsonData.buildSuccess(200,pinyin);
    }
}
