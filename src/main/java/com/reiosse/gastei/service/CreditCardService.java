package com.reiosse.gastei.service;

import com.reiosse.gastei.model.CreditCard;
import java.util.List;

public interface CreditCardService {

  CreditCard getById(long id);

  List<CreditCard> getAll();

  CreditCard save(CreditCard creditCard);

  void delete(Long creditCardId);
}
