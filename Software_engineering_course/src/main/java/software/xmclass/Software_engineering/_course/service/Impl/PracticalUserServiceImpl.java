package software.xmclass.Software_engineering._course.service.Impl;

import net.sourceforge.pinyin4j.PinyinHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.xmclass.Software_engineering._course.domain.PracticalUserList.PracticalUserSingle;
import software.xmclass.Software_engineering._course.mapper.PracticalUserMapper;
import software.xmclass.Software_engineering._course.service.PracticalUserService;
import software.xmclass.Software_engineering._course.utils.JsonData;

import java.util.List;

@Service
public class PracticalUserServiceImpl implements PracticalUserService {
    @Autowired
    PracticalUserMapper pM;
    @Override
    public JsonData getList(int i) {
        List<PracticalUserSingle> res = pM.getList(1);
        if(i == 1){

            for(int j=0;j<res.size();j++){
                String name = res.get(j).getUserName();
                if((name.charAt(0)>'a'&&name.charAt(0)<'z')||(name.charAt(0)>'A'&&name.charAt(0)<'A')){
                    res.get(j).setGroup(name.toUpperCase().charAt(0));
                }
                else{
                    String[] pinyin = PinyinHelper.toHanyuPinyinStringArray( name.charAt(0));
                    if(pinyin == null){
                        res.get(j).setGroup('*');
                    }else{
                        pinyin[0] = pinyin[0].toUpperCase();
                        res.get(j).setGroup(pinyin[0].charAt(0));
                    }
                }


            }
        }
        return JsonData.buildSuccess(200,res);
    }
}
