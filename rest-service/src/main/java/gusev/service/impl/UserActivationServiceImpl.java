package gusev.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import gusev.dao.AppUserDAO;
import gusev.service.UserActivationService;
import gusev.utils.CryptoTool;

@RequiredArgsConstructor
@Service
public class UserActivationServiceImpl implements UserActivationService {

    private final AppUserDAO appUserDAO;

    private final CryptoTool cryptoTool;

    @Override
    public boolean activation(String cryptoUserId) {
        var userId = cryptoTool.idOf(cryptoUserId);
        var optional = appUserDAO.findById(userId);
        if (optional.isPresent()) {
            var user = optional.get();
            user.setIsActive(true);
            appUserDAO.save(user);
            return true;
        }
        return false;
    }
}
