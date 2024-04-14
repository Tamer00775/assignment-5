package ex2;

public class TextDataProcessor extends DataProcessor{
    @Override
    public Data createData(Data data) {
        Data data1 = new Data();
        data1.setType("Text");
        data1.setContent(data.getContent());
        return data1;
    }
}
