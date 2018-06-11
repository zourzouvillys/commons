package io.zrz.zulu.types;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import io.zrz.zulu.values.ZValue;

public interface ZField {

  /**
   * the datatype of this field.
   */

  ZTypeUse fieldType();

  /**
   * annotations on this field. note that this is distinct from annotations on the type usage.
   */

  default List<ZAnnotation> annotations() {
    return Collections.emptyList();
  }

  /**
   * the default value for this field.
   */

  default Optional<ZValue> defaultValue() {
    return Optional.empty();
  }

}
