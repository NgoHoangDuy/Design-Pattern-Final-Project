package org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.facade.library.codec;



public class MPEG4CompressionCodec implements Codec {
    private String type;

    public MPEG4CompressionCodec() {
        this.type = "mp4";
    }

    @Override
    public String getType() {
        return type;
    }
}
