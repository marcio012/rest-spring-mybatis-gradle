package website.marcioheleno.restspringmybatisgradle.entity;

public class Topic {

    int topicNo;
    String topicTitle;
    String topicContent;

    public int getTopicNo() {
        return topicNo;
    }
    public void setTopicNo(int topicNo) {
        this.topicNo = topicNo;
    }
    public String getTopicTitle() {
        return topicTitle;
    }
    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }
    public String getTopicContent() {
        return topicContent;
    }
    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent;
    }
}
