package com.abdul.toolkit.domain.auth.port.in;

import javax.crypto.SecretKey;

public interface GetSignInKeyUseCase {

    SecretKey get();
}
