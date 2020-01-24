package com.gil.mediaplayer.exceptions;

import java.io.FileNotFoundException;

public class VideoNotFoundException extends FileNotFoundException {

    public VideoNotFoundException() {
        super("video was not found");
    }
}
