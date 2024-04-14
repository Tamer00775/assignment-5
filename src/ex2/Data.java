package ex2;

public class Data {
    private String type;
    private Content content;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content data) {
        this.content = data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "type='" + type + '\'' +
                ", data=" + content +
                '}';
    }
}
