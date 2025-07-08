package io.github.malczuuu.library;

import java.util.UUID;

public class UUIDStringGenerator implements StringGenerator {

  private final boolean stripHyphens;

  public UUIDStringGenerator() {
    this(false);
  }

  public UUIDStringGenerator(boolean stripHyphens) {
    this.stripHyphens = stripHyphens;
  }

  @Override
  public String generate() {
    String string = UUID.randomUUID().toString();
    if (stripHyphens) {
      string = string.replace("-", "");
    }
    return string;
  }
}
