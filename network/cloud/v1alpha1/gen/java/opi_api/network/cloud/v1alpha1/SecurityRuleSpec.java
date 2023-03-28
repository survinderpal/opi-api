// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networkpolicy.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * security rule configuration
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.SecurityRuleSpec}
 */
public final class SecurityRuleSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.SecurityRuleSpec)
    SecurityRuleSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SecurityRuleSpec.newBuilder() to construct.
  private SecurityRuleSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SecurityRuleSpec() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SecurityRuleSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SecurityRuleSpec(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (id_ != null) {
              subBuilder = id_.toBuilder();
            }
            id_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(id_);
              id_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (securityPolicyId_ != null) {
              subBuilder = securityPolicyId_.toBuilder();
            }
            securityPolicyId_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(securityPolicyId_);
              securityPolicyId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            opi_api.network.cloud.v1alpha1.SecurityRuleAttrs.Builder subBuilder = null;
            if (attrs_ != null) {
              subBuilder = attrs_.toBuilder();
            }
            attrs_ = input.readMessage(opi_api.network.cloud.v1alpha1.SecurityRuleAttrs.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(attrs_);
              attrs_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.network.cloud.v1alpha1.NetworkPolicyProto.internal_static_opi_api_network_cloud_v1alpha1_SecurityRuleSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.NetworkPolicyProto.internal_static_opi_api_network_cloud_v1alpha1_SecurityRuleSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.SecurityRuleSpec.class, opi_api.network.cloud.v1alpha1.SecurityRuleSpec.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private opi_api.common.v1.ObjectKey id_;
  /**
   * <pre>
   * unique identifier of security rule
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return id_ != null;
  }
  /**
   * <pre>
   * unique identifier of security rule
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getId() {
    return id_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : id_;
  }
  /**
   * <pre>
   * unique identifier of security rule
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getIdOrBuilder() {
    return getId();
  }

  public static final int SECURITY_POLICY_ID_FIELD_NUMBER = 2;
  private opi_api.common.v1.ObjectKey securityPolicyId_;
  /**
   * <pre>
   * security policy this rule belongs to
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey security_policy_id = 2;</code>
   * @return Whether the securityPolicyId field is set.
   */
  @java.lang.Override
  public boolean hasSecurityPolicyId() {
    return securityPolicyId_ != null;
  }
  /**
   * <pre>
   * security policy this rule belongs to
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey security_policy_id = 2;</code>
   * @return The securityPolicyId.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getSecurityPolicyId() {
    return securityPolicyId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : securityPolicyId_;
  }
  /**
   * <pre>
   * security policy this rule belongs to
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey security_policy_id = 2;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getSecurityPolicyIdOrBuilder() {
    return getSecurityPolicyId();
  }

  public static final int ATTRS_FIELD_NUMBER = 3;
  private opi_api.network.cloud.v1alpha1.SecurityRuleAttrs attrs_;
  /**
   * <pre>
   * rule information
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityRuleAttrs attrs = 3;</code>
   * @return Whether the attrs field is set.
   */
  @java.lang.Override
  public boolean hasAttrs() {
    return attrs_ != null;
  }
  /**
   * <pre>
   * rule information
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityRuleAttrs attrs = 3;</code>
   * @return The attrs.
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.SecurityRuleAttrs getAttrs() {
    return attrs_ == null ? opi_api.network.cloud.v1alpha1.SecurityRuleAttrs.getDefaultInstance() : attrs_;
  }
  /**
   * <pre>
   * rule information
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityRuleAttrs attrs = 3;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.SecurityRuleAttrsOrBuilder getAttrsOrBuilder() {
    return getAttrs();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != null) {
      output.writeMessage(1, getId());
    }
    if (securityPolicyId_ != null) {
      output.writeMessage(2, getSecurityPolicyId());
    }
    if (attrs_ != null) {
      output.writeMessage(3, getAttrs());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getId());
    }
    if (securityPolicyId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSecurityPolicyId());
    }
    if (attrs_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAttrs());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.SecurityRuleSpec)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.SecurityRuleSpec other = (opi_api.network.cloud.v1alpha1.SecurityRuleSpec) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (hasSecurityPolicyId() != other.hasSecurityPolicyId()) return false;
    if (hasSecurityPolicyId()) {
      if (!getSecurityPolicyId()
          .equals(other.getSecurityPolicyId())) return false;
    }
    if (hasAttrs() != other.hasAttrs()) return false;
    if (hasAttrs()) {
      if (!getAttrs()
          .equals(other.getAttrs())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
    }
    if (hasSecurityPolicyId()) {
      hash = (37 * hash) + SECURITY_POLICY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSecurityPolicyId().hashCode();
    }
    if (hasAttrs()) {
      hash = (37 * hash) + ATTRS_FIELD_NUMBER;
      hash = (53 * hash) + getAttrs().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.SecurityRuleSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.SecurityRuleSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SecurityRuleSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.SecurityRuleSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SecurityRuleSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.SecurityRuleSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SecurityRuleSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.SecurityRuleSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SecurityRuleSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.SecurityRuleSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SecurityRuleSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.SecurityRuleSpec parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.SecurityRuleSpec prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * security rule configuration
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.SecurityRuleSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.SecurityRuleSpec)
      opi_api.network.cloud.v1alpha1.SecurityRuleSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.NetworkPolicyProto.internal_static_opi_api_network_cloud_v1alpha1_SecurityRuleSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.NetworkPolicyProto.internal_static_opi_api_network_cloud_v1alpha1_SecurityRuleSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.SecurityRuleSpec.class, opi_api.network.cloud.v1alpha1.SecurityRuleSpec.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.SecurityRuleSpec.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (idBuilder_ == null) {
        id_ = null;
      } else {
        id_ = null;
        idBuilder_ = null;
      }
      if (securityPolicyIdBuilder_ == null) {
        securityPolicyId_ = null;
      } else {
        securityPolicyId_ = null;
        securityPolicyIdBuilder_ = null;
      }
      if (attrsBuilder_ == null) {
        attrs_ = null;
      } else {
        attrs_ = null;
        attrsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.NetworkPolicyProto.internal_static_opi_api_network_cloud_v1alpha1_SecurityRuleSpec_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.SecurityRuleSpec getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.SecurityRuleSpec.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.SecurityRuleSpec build() {
      opi_api.network.cloud.v1alpha1.SecurityRuleSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.SecurityRuleSpec buildPartial() {
      opi_api.network.cloud.v1alpha1.SecurityRuleSpec result = new opi_api.network.cloud.v1alpha1.SecurityRuleSpec(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (securityPolicyIdBuilder_ == null) {
        result.securityPolicyId_ = securityPolicyId_;
      } else {
        result.securityPolicyId_ = securityPolicyIdBuilder_.build();
      }
      if (attrsBuilder_ == null) {
        result.attrs_ = attrs_;
      } else {
        result.attrs_ = attrsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof opi_api.network.cloud.v1alpha1.SecurityRuleSpec) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.SecurityRuleSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.SecurityRuleSpec other) {
      if (other == opi_api.network.cloud.v1alpha1.SecurityRuleSpec.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasSecurityPolicyId()) {
        mergeSecurityPolicyId(other.getSecurityPolicyId());
      }
      if (other.hasAttrs()) {
        mergeAttrs(other.getAttrs());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      opi_api.network.cloud.v1alpha1.SecurityRuleSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.SecurityRuleSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.common.v1.ObjectKey id_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> idBuilder_;
    /**
     * <pre>
     * unique identifier of security rule
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return idBuilder_ != null || id_ != null;
    }
    /**
     * <pre>
     * unique identifier of security rule
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     * @return The id.
     */
    public opi_api.common.v1.ObjectKey getId() {
      if (idBuilder_ == null) {
        return id_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : id_;
      } else {
        return idBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * unique identifier of security rule
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public Builder setId(opi_api.common.v1.ObjectKey value) {
      if (idBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        id_ = value;
        onChanged();
      } else {
        idBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * unique identifier of security rule
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public Builder setId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (idBuilder_ == null) {
        id_ = builderForValue.build();
        onChanged();
      } else {
        idBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * unique identifier of security rule
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public Builder mergeId(opi_api.common.v1.ObjectKey value) {
      if (idBuilder_ == null) {
        if (id_ != null) {
          id_ =
            opi_api.common.v1.ObjectKey.newBuilder(id_).mergeFrom(value).buildPartial();
        } else {
          id_ = value;
        }
        onChanged();
      } else {
        idBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * unique identifier of security rule
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public Builder clearId() {
      if (idBuilder_ == null) {
        id_ = null;
        onChanged();
      } else {
        id_ = null;
        idBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * unique identifier of security rule
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getIdBuilder() {
      
      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * unique identifier of security rule
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getIdOrBuilder() {
      if (idBuilder_ != null) {
        return idBuilder_.getMessageOrBuilder();
      } else {
        return id_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : id_;
      }
    }
    /**
     * <pre>
     * unique identifier of security rule
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getId(),
                getParentForChildren(),
                isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private opi_api.common.v1.ObjectKey securityPolicyId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> securityPolicyIdBuilder_;
    /**
     * <pre>
     * security policy this rule belongs to
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey security_policy_id = 2;</code>
     * @return Whether the securityPolicyId field is set.
     */
    public boolean hasSecurityPolicyId() {
      return securityPolicyIdBuilder_ != null || securityPolicyId_ != null;
    }
    /**
     * <pre>
     * security policy this rule belongs to
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey security_policy_id = 2;</code>
     * @return The securityPolicyId.
     */
    public opi_api.common.v1.ObjectKey getSecurityPolicyId() {
      if (securityPolicyIdBuilder_ == null) {
        return securityPolicyId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : securityPolicyId_;
      } else {
        return securityPolicyIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * security policy this rule belongs to
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey security_policy_id = 2;</code>
     */
    public Builder setSecurityPolicyId(opi_api.common.v1.ObjectKey value) {
      if (securityPolicyIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        securityPolicyId_ = value;
        onChanged();
      } else {
        securityPolicyIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * security policy this rule belongs to
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey security_policy_id = 2;</code>
     */
    public Builder setSecurityPolicyId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (securityPolicyIdBuilder_ == null) {
        securityPolicyId_ = builderForValue.build();
        onChanged();
      } else {
        securityPolicyIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * security policy this rule belongs to
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey security_policy_id = 2;</code>
     */
    public Builder mergeSecurityPolicyId(opi_api.common.v1.ObjectKey value) {
      if (securityPolicyIdBuilder_ == null) {
        if (securityPolicyId_ != null) {
          securityPolicyId_ =
            opi_api.common.v1.ObjectKey.newBuilder(securityPolicyId_).mergeFrom(value).buildPartial();
        } else {
          securityPolicyId_ = value;
        }
        onChanged();
      } else {
        securityPolicyIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * security policy this rule belongs to
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey security_policy_id = 2;</code>
     */
    public Builder clearSecurityPolicyId() {
      if (securityPolicyIdBuilder_ == null) {
        securityPolicyId_ = null;
        onChanged();
      } else {
        securityPolicyId_ = null;
        securityPolicyIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * security policy this rule belongs to
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey security_policy_id = 2;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getSecurityPolicyIdBuilder() {
      
      onChanged();
      return getSecurityPolicyIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * security policy this rule belongs to
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey security_policy_id = 2;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getSecurityPolicyIdOrBuilder() {
      if (securityPolicyIdBuilder_ != null) {
        return securityPolicyIdBuilder_.getMessageOrBuilder();
      } else {
        return securityPolicyId_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : securityPolicyId_;
      }
    }
    /**
     * <pre>
     * security policy this rule belongs to
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey security_policy_id = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getSecurityPolicyIdFieldBuilder() {
      if (securityPolicyIdBuilder_ == null) {
        securityPolicyIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getSecurityPolicyId(),
                getParentForChildren(),
                isClean());
        securityPolicyId_ = null;
      }
      return securityPolicyIdBuilder_;
    }

    private opi_api.network.cloud.v1alpha1.SecurityRuleAttrs attrs_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.SecurityRuleAttrs, opi_api.network.cloud.v1alpha1.SecurityRuleAttrs.Builder, opi_api.network.cloud.v1alpha1.SecurityRuleAttrsOrBuilder> attrsBuilder_;
    /**
     * <pre>
     * rule information
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityRuleAttrs attrs = 3;</code>
     * @return Whether the attrs field is set.
     */
    public boolean hasAttrs() {
      return attrsBuilder_ != null || attrs_ != null;
    }
    /**
     * <pre>
     * rule information
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityRuleAttrs attrs = 3;</code>
     * @return The attrs.
     */
    public opi_api.network.cloud.v1alpha1.SecurityRuleAttrs getAttrs() {
      if (attrsBuilder_ == null) {
        return attrs_ == null ? opi_api.network.cloud.v1alpha1.SecurityRuleAttrs.getDefaultInstance() : attrs_;
      } else {
        return attrsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * rule information
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityRuleAttrs attrs = 3;</code>
     */
    public Builder setAttrs(opi_api.network.cloud.v1alpha1.SecurityRuleAttrs value) {
      if (attrsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        attrs_ = value;
        onChanged();
      } else {
        attrsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * rule information
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityRuleAttrs attrs = 3;</code>
     */
    public Builder setAttrs(
        opi_api.network.cloud.v1alpha1.SecurityRuleAttrs.Builder builderForValue) {
      if (attrsBuilder_ == null) {
        attrs_ = builderForValue.build();
        onChanged();
      } else {
        attrsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * rule information
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityRuleAttrs attrs = 3;</code>
     */
    public Builder mergeAttrs(opi_api.network.cloud.v1alpha1.SecurityRuleAttrs value) {
      if (attrsBuilder_ == null) {
        if (attrs_ != null) {
          attrs_ =
            opi_api.network.cloud.v1alpha1.SecurityRuleAttrs.newBuilder(attrs_).mergeFrom(value).buildPartial();
        } else {
          attrs_ = value;
        }
        onChanged();
      } else {
        attrsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * rule information
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityRuleAttrs attrs = 3;</code>
     */
    public Builder clearAttrs() {
      if (attrsBuilder_ == null) {
        attrs_ = null;
        onChanged();
      } else {
        attrs_ = null;
        attrsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * rule information
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityRuleAttrs attrs = 3;</code>
     */
    public opi_api.network.cloud.v1alpha1.SecurityRuleAttrs.Builder getAttrsBuilder() {
      
      onChanged();
      return getAttrsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * rule information
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityRuleAttrs attrs = 3;</code>
     */
    public opi_api.network.cloud.v1alpha1.SecurityRuleAttrsOrBuilder getAttrsOrBuilder() {
      if (attrsBuilder_ != null) {
        return attrsBuilder_.getMessageOrBuilder();
      } else {
        return attrs_ == null ?
            opi_api.network.cloud.v1alpha1.SecurityRuleAttrs.getDefaultInstance() : attrs_;
      }
    }
    /**
     * <pre>
     * rule information
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityRuleAttrs attrs = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.SecurityRuleAttrs, opi_api.network.cloud.v1alpha1.SecurityRuleAttrs.Builder, opi_api.network.cloud.v1alpha1.SecurityRuleAttrsOrBuilder> 
        getAttrsFieldBuilder() {
      if (attrsBuilder_ == null) {
        attrsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.SecurityRuleAttrs, opi_api.network.cloud.v1alpha1.SecurityRuleAttrs.Builder, opi_api.network.cloud.v1alpha1.SecurityRuleAttrsOrBuilder>(
                getAttrs(),
                getParentForChildren(),
                isClean());
        attrs_ = null;
      }
      return attrsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.SecurityRuleSpec)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.SecurityRuleSpec)
  private static final opi_api.network.cloud.v1alpha1.SecurityRuleSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.SecurityRuleSpec();
  }

  public static opi_api.network.cloud.v1alpha1.SecurityRuleSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecurityRuleSpec>
      PARSER = new com.google.protobuf.AbstractParser<SecurityRuleSpec>() {
    @java.lang.Override
    public SecurityRuleSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SecurityRuleSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SecurityRuleSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecurityRuleSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.SecurityRuleSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

