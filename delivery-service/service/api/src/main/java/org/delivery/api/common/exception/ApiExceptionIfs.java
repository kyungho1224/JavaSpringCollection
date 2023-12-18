package org.delivery.api.common.exception;

import org.delivery.api.common.error.ErrorCodeIfs;

/**
 * Created by KimKyungHo on 2023-12-18(018)
 */
public interface ApiExceptionIfs {

    ErrorCodeIfs getErrorCodeIfs();

    String getErrorDescription();
}
