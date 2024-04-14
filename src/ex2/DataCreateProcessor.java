package ex2;

public class DataCreateProcessor {
    private DataProcessor dataProcessor;

    public void setDataProcessor(DataProcessor dataProcessor) {
        this.dataProcessor = dataProcessor;
    }

    public Data createData(Data data) {
        if (dataProcessor != null) {
            return dataProcessor.createData(data);
        } else {
            return null;
        }
    }
}
