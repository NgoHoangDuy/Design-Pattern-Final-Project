package org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.facade.library.codec;



public class OggCompressionCodec implements Codec {
    private String type;

    public OggCompressionCodec() {
        this.type = "ogg";
    }

    @Override
    public String getType() {
        return type;
    }
}
