package com.javarush.redis;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Language {
  private String language;
  private Boolean isOfficial;
  private BigDecimal percentage;
}
