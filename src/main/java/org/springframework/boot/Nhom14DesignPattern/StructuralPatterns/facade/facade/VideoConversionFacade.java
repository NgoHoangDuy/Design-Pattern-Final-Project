package org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.facade.facade;

import java.io.File;

import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.facade.library.codec.Codec;
import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.facade.library.codec.MPEG4CompressionCodec;
import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.facade.library.codec.OggCompressionCodec;
import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.facade.library.factory.AudioMixer;
import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.facade.library.factory.BitrateReader;
import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.facade.library.factory.CodecFactory;
import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.facade.library.factory.VideoFile;



public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}