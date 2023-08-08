package com.delmas.gestiondestock.Exception;

import ch.qos.logback.core.spi.ErrorCodes;
import lombok.Getter;

public class InvalidOperationException extends RuntimeException {

  @Getter
  private ErrorCodes errorCode;

  public InvalidOperationException(String message) {
    super(message);
  }

  public InvalidOperationException(String message, Throwable cause) {
    super(message, cause);
  }

  public InvalidOperationException(String message, Throwable cause, ErrorCodes errorCode) {
    super(message, cause);
    this.errorCode = errorCode;
  }

  public InvalidOperationException(String message,ErrorCodes errorCode) {
    super(message);
    this.errorCode = errorCode;
  }

    public InvalidOperationException(String s, com.delmas.gestiondestock.Exception.ErrorCodes errorCodes) {
    }
}
