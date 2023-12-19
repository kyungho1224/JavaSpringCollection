package org.delivery.api.domain.token.ifs;

import org.delivery.api.domain.token.model.TokenDto;

import java.util.Map;

/**
 * Created by KimKyungHo on 2023-12-19(019)
 */
public interface TokenHelperIfs {

    TokenDto issueAccessToken(Map<String, Object> data);

    TokenDto issueRefreshToken(Map<String, Object> data);

    Map<String, Object> validationTokenWithThrow(String token);

}
