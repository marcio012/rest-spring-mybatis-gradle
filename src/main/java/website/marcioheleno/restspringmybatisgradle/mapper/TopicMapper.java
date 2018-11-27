package website.marcioheleno.restspringmybatisgradle.mapper;

import org.apache.ibatis.annotations.Mapper;
import website.marcioheleno.restspringmybatisgradle.entity.Topic;

import java.util.List;

@Mapper
public interface TopicMapper {

    public List getTopicList();
    public Topic getTopicInfo(int topicNo);
    public int addTopicInfo(Topic topic);
    public int setTopicInfo(Topic topic);
    public int deleteTopicInfo(int topicNo);
}
