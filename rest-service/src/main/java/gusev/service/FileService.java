package gusev.service;

import gusev.entity.AppDocument;
import gusev.entity.AppPhoto;

public interface FileService {

    AppDocument getDocument(String id);

    AppPhoto getPhoto(String id);
}
