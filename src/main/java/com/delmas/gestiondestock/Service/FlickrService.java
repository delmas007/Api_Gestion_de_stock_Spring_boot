package com.delmas.gestiondestock.Service;

import java.io.InputStream;

public interface FlickrService {

    String savePhoto(InputStream photo, String title);
}
