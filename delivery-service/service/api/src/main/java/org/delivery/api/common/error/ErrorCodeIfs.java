package org.delivery.api.common.error;

/**
 * Created by KimKyungHo on 2023-12-18(018)
 */
public interface ErrorCodeIfs {
    Integer getHttpStatusCode();
    Integer getErrorCode();
    String getDescription();
}
