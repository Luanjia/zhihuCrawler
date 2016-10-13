package cn.edu.njust.entity;

/**
 * Created by luanjia on 16-10-12.
 */
public class Zhihu_body {
    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getQuestionTtitle() {
        return questionTtitle;
    }

    public void setQuestionTtitle(String questionTtitle) {
        this.questionTtitle = questionTtitle;
    }

    public String getQuestionDetail() {
        return questionDetail;
    }

    public void setQuestionDetail(String questionDetail) {
        this.questionDetail = questionDetail;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public String getQuestionLink() {
        return questionLink;
    }

    public void setQuestionLink(String questionLink) {
        this.questionLink = questionLink;
    }

    private String html;
    private String questionTtitle;
    private String questionDetail;
    private String questionLink;

    private String answer;  //
    private String authorName;
    private int voteCount;

    @Override
    public String toString() {
        return "Zhihu_body{" +
                "html='" + html + '\'' +
                ", questionTtitle='" + questionTtitle + '\'' +
                ", questionDetail='" + questionDetail + '\'' +
                ", questionLink='" + questionLink + '\'' +
                ", answer='" + answer + '\'' +
                ", authorName='" + authorName + '\'' +
                ", voteCount=" + voteCount +
                '}';
    }
}
