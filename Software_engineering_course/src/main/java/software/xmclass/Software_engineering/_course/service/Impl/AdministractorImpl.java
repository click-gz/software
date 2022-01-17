package software.xmclass.Software_engineering._course.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.xmclass.Software_engineering._course.domain.CommentModel;
import software.xmclass.Software_engineering._course.domain.PracticalUserModel;
import software.xmclass.Software_engineering._course.mapper.CommentMapper;
import software.xmclass.Software_engineering._course.mapper.PracticalUserMapper;
import software.xmclass.Software_engineering._course.service.AdministratorService;
import software.xmclass.Software_engineering._course.utils.CommonUtils;
import software.xmclass.Software_engineering._course.utils.JsonData;

import java.util.List;
import java.util.Map;

@Service
public class AdministractorImpl implements AdministratorService {
    @Autowired
    CommentMapper commentmapper;

    @Autowired
    PracticalUserMapper practicalusermapper;

    @Override
    public JsonData GetComment() {
        List<CommentModel> commetList = commentmapper.GetUComment(0);
        return JsonData.buildSuccess(200,commetList);
    }

    @Override
    public int CheckComment(Map<String, String> info) {
        if(info.containsKey("state") && info.containsKey("id")){
            return commentmapper.CheckComment(Integer.parseInt(info.get("state")),Integer.parseInt(info.get("id")));
        }
        return -1;
    }

    @Override
    public JsonData getPracticalUser() {
        List<PracticalUserModel> PUList = practicalusermapper.GetUPracticalUser(0);
        return JsonData.buildSuccess(200,PUList);
    }

    @Override
    public int CheckPracticalUser(Map<String, String> info) {
        if(info.containsKey("state") && info.containsKey("id")){
            return practicalusermapper.CheckPracticalUser(Integer.parseInt(info.get("state")),Integer.parseInt(info.get("id")));
        }
        return -1;
    }
}
