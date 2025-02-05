// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nexthop.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * Overlay nexthop information
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.OverlayNextHopSpec}
 */
public final class OverlayNextHopSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.OverlayNextHopSpec)
    OverlayNextHopSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OverlayNextHopSpec.newBuilder() to construct.
  private OverlayNextHopSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OverlayNextHopSpec() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OverlayNextHopSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OverlayNextHopSpec(
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
            if (tunnelId_ != null) {
              subBuilder = tunnelId_.toBuilder();
            }
            tunnelId_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tunnelId_);
              tunnelId_ = subBuilder.buildPartial();
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
    return opi_api.network.cloud.v1alpha1.NextHopProto.internal_static_opi_api_network_cloud_v1alpha1_OverlayNextHopSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.NextHopProto.internal_static_opi_api_network_cloud_v1alpha1_OverlayNextHopSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.OverlayNextHopSpec.class, opi_api.network.cloud.v1alpha1.OverlayNextHopSpec.Builder.class);
  }

  public static final int TUNNEL_ID_FIELD_NUMBER = 1;
  private opi_api.common.v1.ObjectKey tunnelId_;
  /**
   * <pre>
   * tunnel id
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey tunnel_id = 1;</code>
   * @return Whether the tunnelId field is set.
   */
  @java.lang.Override
  public boolean hasTunnelId() {
    return tunnelId_ != null;
  }
  /**
   * <pre>
   * tunnel id
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey tunnel_id = 1;</code>
   * @return The tunnelId.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getTunnelId() {
    return tunnelId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : tunnelId_;
  }
  /**
   * <pre>
   * tunnel id
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey tunnel_id = 1;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getTunnelIdOrBuilder() {
    return getTunnelId();
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
    if (tunnelId_ != null) {
      output.writeMessage(1, getTunnelId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tunnelId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTunnelId());
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.OverlayNextHopSpec)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.OverlayNextHopSpec other = (opi_api.network.cloud.v1alpha1.OverlayNextHopSpec) obj;

    if (hasTunnelId() != other.hasTunnelId()) return false;
    if (hasTunnelId()) {
      if (!getTunnelId()
          .equals(other.getTunnelId())) return false;
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
    if (hasTunnelId()) {
      hash = (37 * hash) + TUNNEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTunnelId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.OverlayNextHopSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.OverlayNextHopSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.OverlayNextHopSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.OverlayNextHopSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.OverlayNextHopSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.OverlayNextHopSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.OverlayNextHopSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.OverlayNextHopSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.OverlayNextHopSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.OverlayNextHopSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.OverlayNextHopSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.OverlayNextHopSpec parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.OverlayNextHopSpec prototype) {
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
   * Overlay nexthop information
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.OverlayNextHopSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.OverlayNextHopSpec)
      opi_api.network.cloud.v1alpha1.OverlayNextHopSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.NextHopProto.internal_static_opi_api_network_cloud_v1alpha1_OverlayNextHopSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.NextHopProto.internal_static_opi_api_network_cloud_v1alpha1_OverlayNextHopSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.OverlayNextHopSpec.class, opi_api.network.cloud.v1alpha1.OverlayNextHopSpec.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.OverlayNextHopSpec.newBuilder()
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
      if (tunnelIdBuilder_ == null) {
        tunnelId_ = null;
      } else {
        tunnelId_ = null;
        tunnelIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.NextHopProto.internal_static_opi_api_network_cloud_v1alpha1_OverlayNextHopSpec_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.OverlayNextHopSpec getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.OverlayNextHopSpec.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.OverlayNextHopSpec build() {
      opi_api.network.cloud.v1alpha1.OverlayNextHopSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.OverlayNextHopSpec buildPartial() {
      opi_api.network.cloud.v1alpha1.OverlayNextHopSpec result = new opi_api.network.cloud.v1alpha1.OverlayNextHopSpec(this);
      if (tunnelIdBuilder_ == null) {
        result.tunnelId_ = tunnelId_;
      } else {
        result.tunnelId_ = tunnelIdBuilder_.build();
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
      if (other instanceof opi_api.network.cloud.v1alpha1.OverlayNextHopSpec) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.OverlayNextHopSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.OverlayNextHopSpec other) {
      if (other == opi_api.network.cloud.v1alpha1.OverlayNextHopSpec.getDefaultInstance()) return this;
      if (other.hasTunnelId()) {
        mergeTunnelId(other.getTunnelId());
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
      opi_api.network.cloud.v1alpha1.OverlayNextHopSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.OverlayNextHopSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.common.v1.ObjectKey tunnelId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> tunnelIdBuilder_;
    /**
     * <pre>
     * tunnel id
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey tunnel_id = 1;</code>
     * @return Whether the tunnelId field is set.
     */
    public boolean hasTunnelId() {
      return tunnelIdBuilder_ != null || tunnelId_ != null;
    }
    /**
     * <pre>
     * tunnel id
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey tunnel_id = 1;</code>
     * @return The tunnelId.
     */
    public opi_api.common.v1.ObjectKey getTunnelId() {
      if (tunnelIdBuilder_ == null) {
        return tunnelId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : tunnelId_;
      } else {
        return tunnelIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * tunnel id
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey tunnel_id = 1;</code>
     */
    public Builder setTunnelId(opi_api.common.v1.ObjectKey value) {
      if (tunnelIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tunnelId_ = value;
        onChanged();
      } else {
        tunnelIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * tunnel id
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey tunnel_id = 1;</code>
     */
    public Builder setTunnelId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (tunnelIdBuilder_ == null) {
        tunnelId_ = builderForValue.build();
        onChanged();
      } else {
        tunnelIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * tunnel id
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey tunnel_id = 1;</code>
     */
    public Builder mergeTunnelId(opi_api.common.v1.ObjectKey value) {
      if (tunnelIdBuilder_ == null) {
        if (tunnelId_ != null) {
          tunnelId_ =
            opi_api.common.v1.ObjectKey.newBuilder(tunnelId_).mergeFrom(value).buildPartial();
        } else {
          tunnelId_ = value;
        }
        onChanged();
      } else {
        tunnelIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * tunnel id
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey tunnel_id = 1;</code>
     */
    public Builder clearTunnelId() {
      if (tunnelIdBuilder_ == null) {
        tunnelId_ = null;
        onChanged();
      } else {
        tunnelId_ = null;
        tunnelIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * tunnel id
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey tunnel_id = 1;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getTunnelIdBuilder() {
      
      onChanged();
      return getTunnelIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * tunnel id
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey tunnel_id = 1;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getTunnelIdOrBuilder() {
      if (tunnelIdBuilder_ != null) {
        return tunnelIdBuilder_.getMessageOrBuilder();
      } else {
        return tunnelId_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : tunnelId_;
      }
    }
    /**
     * <pre>
     * tunnel id
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey tunnel_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getTunnelIdFieldBuilder() {
      if (tunnelIdBuilder_ == null) {
        tunnelIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getTunnelId(),
                getParentForChildren(),
                isClean());
        tunnelId_ = null;
      }
      return tunnelIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.OverlayNextHopSpec)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.OverlayNextHopSpec)
  private static final opi_api.network.cloud.v1alpha1.OverlayNextHopSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.OverlayNextHopSpec();
  }

  public static opi_api.network.cloud.v1alpha1.OverlayNextHopSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OverlayNextHopSpec>
      PARSER = new com.google.protobuf.AbstractParser<OverlayNextHopSpec>() {
    @java.lang.Override
    public OverlayNextHopSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OverlayNextHopSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OverlayNextHopSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OverlayNextHopSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.OverlayNextHopSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

