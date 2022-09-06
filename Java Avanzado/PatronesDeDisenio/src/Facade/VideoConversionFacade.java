package Facade;

import java.io.File;

public class VideoConversionFacade {

    public File convertVideo(String fileName, String format){
    System.out.println("comienzo la convercion de videoFacade...");

    VideoFile file= new VideoFile("fichero.mp4");
    Codec sourceCodec= CodecFactory.extract(file);

    Codec destinationCodec;


        if (format.equals("mp4")){
        destinationCodec= new OggCompressionCodec();
    }else {
        destinationCodec= new MPEG4CompressionCodec();
    }

    VideoFile buffer= BitRateReader.read(file, sourceCodec);

    VideoFile intermediateResult= BitRateReader.convert(buffer, destinationCodec);

    File result= (new audioMixer()).fix(intermediateResult);
        System.out.println("ya he terminado la conversion de VideoFacade");
        return result;
    }
}
