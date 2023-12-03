package gusev.service;

import gusev.dto.MailParams;

public interface MailSenderService {

    void send(MailParams mailParams);
}
