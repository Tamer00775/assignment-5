package ex2;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Content content = new Content();
        content.setData("Audio Content");
        data.setContent(content);
        DataCreateProcessor dataCreateProcessor = new DataCreateProcessor();
        dataCreateProcessor.setDataProcessor(new AudioDataProcessor());
        System.out.println(dataCreateProcessor.createData(data));

        content.setData("Video Content");
        data.setContent(content);
        dataCreateProcessor.setDataProcessor(new VideoDataProcessor());
        System.out.println(dataCreateProcessor.createData(data));
    }
}
