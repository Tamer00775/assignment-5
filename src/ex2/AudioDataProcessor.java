package ex2;

public class AudioDataProcessor extends DataProcessor {
    @Override
    public Data createData(Data data) {
        Data data1 = new Data();
        data1.setType("Audio");
        data1.setContent(data.getContent());
        return data1;
    }
}
