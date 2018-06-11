package io.zrz.zulu.values;

public final class ZValues {

  public static ZBoolValue of(boolean value) {
    return new ZBoolValue(value);
  }

  public static ZIntValue of(long value) {
    return new ZIntValue(value);
  }

  public static ZStringValue of(String value) {
    return new ZStringValue(value);
  }

}
