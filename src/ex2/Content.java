package ex2;

public class Content {

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Content{" +
                "data=" + data +
                '}';
    }
}
