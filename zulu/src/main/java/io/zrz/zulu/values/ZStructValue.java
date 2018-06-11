package io.zrz.zulu.values;

import io.zrz.zulu.types.ZStructType;

public interface ZStructValue extends ZValue {

  @Override
  ZStructType valueType();

}
