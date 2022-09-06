package Facade;

public class CodecFactory {
    public static Codec extract(VideoFile file){
        String type= file.getCodecType();
        if (type.equals("mp4")){
            System.out.println("codecFcatory: extracting mpge audio...");
            return new MPEG4CompressionCodec();
        }else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
