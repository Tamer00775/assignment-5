package ex2;

public class VideoDataProcessor extends DataProcessor {
    @Override
    public Data createData(Data data) {
        Data data1 = new Data();
        data1.setType("Video");
        data1.setContent(data.getContent());
        return data1;
    }
}
