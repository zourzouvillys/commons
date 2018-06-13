package io.zrz.zulu.types;

public abstract class AbstractZField implements ZField {

  @Override
  public String toString() {
    return fieldType() + (constantValue().or(this::defaultValue).map(val -> " = " + val).orElse(""));
  }

}
