package com.reiosse.gastei.service.impl;

import com.reiosse.gastei.exceptions.NotFoundException;
import com.reiosse.gastei.model.Category;
import com.reiosse.gastei.model.CreditCard;
import com.reiosse.gastei.repository.CreditCardRepository;
import com.reiosse.gastei.service.CreditCardService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreditCardServiceImpl implements CreditCardService {
  private CreditCardRepository creditCardRepository;

  @Override
  public CreditCard getById(long id) {
    return creditCardRepository.findById(id)
        .orElseThrow(() -> new NotFoundException("Credit Card", id));
  }

  @Override
  public List<CreditCard> getAll() {
    return creditCardRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
  }

  @Override
  public CreditCard save(CreditCard creditCard) {
    return creditCardRepository.save(creditCard);
  }

  @Override
  public void delete(Long creditCardId) {
    creditCardRepository.deleteById(creditCardId);
  }
}
