package gusev.service;

import org.json.JSONException;
import org.telegram.telegrambots.meta.api.objects.Message;
import gusev.entity.AppDocument;

public interface FileService {
    AppDocument processDoc(Message externalMessage) throws JSONException;
}
