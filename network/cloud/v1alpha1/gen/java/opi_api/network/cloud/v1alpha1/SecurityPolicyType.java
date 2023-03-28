// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networkpolicy.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * types of security policies
 * </pre>
 *
 * Protobuf enum {@code opi_api.network.cloud.v1alpha1.SecurityPolicyType}
 */
public enum SecurityPolicyType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * unspecified 
   * </pre>
   *
   * <code>SECURITY_POLICY_TYPE_UNSPECIFIED = 0;</code>
   */
  SECURITY_POLICY_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * UNDERLAY security policy object is singleton object per DSC
   * </pre>
   *
   * <code>SECURITY_POLICY_TYPE_UNDERLAY = 1;</code>
   */
  SECURITY_POLICY_TYPE_UNDERLAY(1),
  /**
   * <pre>
   *&#47; TENANT security policy objects are attached to tenant VPCs
   * </pre>
   *
   * <code>SECURITY_POLICY_TYPE_TENANT = 2;</code>
   */
  SECURITY_POLICY_TYPE_TENANT(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * unspecified 
   * </pre>
   *
   * <code>SECURITY_POLICY_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int SECURITY_POLICY_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * UNDERLAY security policy object is singleton object per DSC
   * </pre>
   *
   * <code>SECURITY_POLICY_TYPE_UNDERLAY = 1;</code>
   */
  public static final int SECURITY_POLICY_TYPE_UNDERLAY_VALUE = 1;
  /**
   * <pre>
   *&#47; TENANT security policy objects are attached to tenant VPCs
   * </pre>
   *
   * <code>SECURITY_POLICY_TYPE_TENANT = 2;</code>
   */
  public static final int SECURITY_POLICY_TYPE_TENANT_VALUE = 2;


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
  public static SecurityPolicyType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SecurityPolicyType forNumber(int value) {
    switch (value) {
      case 0: return SECURITY_POLICY_TYPE_UNSPECIFIED;
      case 1: return SECURITY_POLICY_TYPE_UNDERLAY;
      case 2: return SECURITY_POLICY_TYPE_TENANT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SecurityPolicyType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SecurityPolicyType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SecurityPolicyType>() {
          public SecurityPolicyType findValueByNumber(int number) {
            return SecurityPolicyType.forNumber(number);
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
    return opi_api.network.cloud.v1alpha1.NetworkPolicyProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final SecurityPolicyType[] VALUES = values();

  public static SecurityPolicyType valueOf(
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

  private SecurityPolicyType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opi_api.network.cloud.v1alpha1.SecurityPolicyType)
}

