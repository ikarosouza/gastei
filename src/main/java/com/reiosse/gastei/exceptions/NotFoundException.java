package com.reiosse.gastei.exceptions;

public class NotFoundException extends RuntimeException{

  public NotFoundException(String type, Long id) {
    super(String.format("%s with id: %d", type, id));
  }
}
