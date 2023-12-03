package gusev.service;

import gusev.entity.AppPhoto;
import gusev.service.enums.LinkType;
import org.json.JSONException;
import org.telegram.telegrambots.meta.api.objects.Message;
import gusev.entity.AppDocument;

public interface FileService {

    AppDocument processDoc(Message telegramMessage);

    AppPhoto processPhoto(Message telegramMessage);

    String generateLink(Long docId, LinkType linkType);
}
