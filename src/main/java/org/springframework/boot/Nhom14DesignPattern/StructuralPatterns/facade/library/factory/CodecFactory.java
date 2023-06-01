package org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.facade.library.factory;

import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.facade.library.codec.Codec;
import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.facade.library.codec.MPEG4CompressionCodec;
import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.facade.library.codec.OggCompressionCodec;

public class CodecFactory {

    private CodecFactory() {
    }

    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
