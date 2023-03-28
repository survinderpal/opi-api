// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: interface.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * types of interfaces
 * </pre>
 *
 * Protobuf enum {@code opi_api.network.cloud.v1alpha1.IfType}
 */
public enum IfType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * unspecified
   * </pre>
   *
   * <code>IF_TYPE_UNSPECIFIED = 0;</code>
   */
  IF_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * uplink interface
   * </pre>
   *
   * <code>IF_TYPE_UPLINK = 1;</code>
   */
  IF_TYPE_UPLINK(1),
  /**
   * <pre>
   * uplink port-channel interface
   * </pre>
   *
   * <code>IF_TYPE_UPLINK_PC = 2;</code>
   */
  IF_TYPE_UPLINK_PC(2),
  /**
   * <pre>
   * L3 interface
   * </pre>
   *
   * <code>IF_TYPE_L3 = 3;</code>
   */
  IF_TYPE_L3(3),
  /**
   * <pre>
   * loopback interface
   * </pre>
   *
   * <code>IF_TYPE_LOOPBACK = 4;</code>
   */
  IF_TYPE_LOOPBACK(4),
  /**
   * <pre>
   * inband management/control interface
   * </pre>
   *
   * <code>IF_TYPE_CONTROL = 5;</code>
   */
  IF_TYPE_CONTROL(5),
  /**
   * <pre>
   * host visible PF/VF device
   * </pre>
   *
   * <code>IF_TYPE_HOST = 6;</code>
   */
  IF_TYPE_HOST(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * unspecified
   * </pre>
   *
   * <code>IF_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int IF_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * uplink interface
   * </pre>
   *
   * <code>IF_TYPE_UPLINK = 1;</code>
   */
  public static final int IF_TYPE_UPLINK_VALUE = 1;
  /**
   * <pre>
   * uplink port-channel interface
   * </pre>
   *
   * <code>IF_TYPE_UPLINK_PC = 2;</code>
   */
  public static final int IF_TYPE_UPLINK_PC_VALUE = 2;
  /**
   * <pre>
   * L3 interface
   * </pre>
   *
   * <code>IF_TYPE_L3 = 3;</code>
   */
  public static final int IF_TYPE_L3_VALUE = 3;
  /**
   * <pre>
   * loopback interface
   * </pre>
   *
   * <code>IF_TYPE_LOOPBACK = 4;</code>
   */
  public static final int IF_TYPE_LOOPBACK_VALUE = 4;
  /**
   * <pre>
   * inband management/control interface
   * </pre>
   *
   * <code>IF_TYPE_CONTROL = 5;</code>
   */
  public static final int IF_TYPE_CONTROL_VALUE = 5;
  /**
   * <pre>
   * host visible PF/VF device
   * </pre>
   *
   * <code>IF_TYPE_HOST = 6;</code>
   */
  public static final int IF_TYPE_HOST_VALUE = 6;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static IfType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IfType forNumber(int value) {
    switch (value) {
      case 0: return IF_TYPE_UNSPECIFIED;
      case 1: return IF_TYPE_UPLINK;
      case 2: return IF_TYPE_UPLINK_PC;
      case 3: return IF_TYPE_L3;
      case 4: return IF_TYPE_LOOPBACK;
      case 5: return IF_TYPE_CONTROL;
      case 6: return IF_TYPE_HOST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IfType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IfType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IfType>() {
          public IfType findValueByNumber(int number) {
            return IfType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return opi_api.network.cloud.v1alpha1.InterfaceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final IfType[] VALUES = values();

  public static IfType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private IfType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opi_api.network.cloud.v1alpha1.IfType)
}

