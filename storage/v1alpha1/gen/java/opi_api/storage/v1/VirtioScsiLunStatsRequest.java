// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_scsi.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.VirtioScsiLunStatsRequest}
 */
public final class VirtioScsiLunStatsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.VirtioScsiLunStatsRequest)
    VirtioScsiLunStatsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VirtioScsiLunStatsRequest.newBuilder() to construct.
  private VirtioScsiLunStatsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VirtioScsiLunStatsRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VirtioScsiLunStatsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VirtioScsiLunStatsRequest(
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
            if (controllerId_ != null) {
              subBuilder = controllerId_.toBuilder();
            }
            controllerId_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(controllerId_);
              controllerId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (lunId_ != null) {
              subBuilder = lunId_.toBuilder();
            }
            lunId_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lunId_);
              lunId_ = subBuilder.buildPartial();
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
    return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_VirtioScsiLunStatsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_VirtioScsiLunStatsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.VirtioScsiLunStatsRequest.class, opi_api.storage.v1.VirtioScsiLunStatsRequest.Builder.class);
  }

  public static final int CONTROLLER_ID_FIELD_NUMBER = 1;
  private opi_api.common.v1.ObjectKey controllerId_;
  /**
   * <code>.opi_api.common.v1.ObjectKey controller_id = 1;</code>
   * @return Whether the controllerId field is set.
   */
  @java.lang.Override
  public boolean hasControllerId() {
    return controllerId_ != null;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey controller_id = 1;</code>
   * @return The controllerId.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getControllerId() {
    return controllerId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : controllerId_;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey controller_id = 1;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getControllerIdOrBuilder() {
    return getControllerId();
  }

  public static final int LUN_ID_FIELD_NUMBER = 2;
  private opi_api.common.v1.ObjectKey lunId_;
  /**
   * <code>.opi_api.common.v1.ObjectKey lun_id = 2;</code>
   * @return Whether the lunId field is set.
   */
  @java.lang.Override
  public boolean hasLunId() {
    return lunId_ != null;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey lun_id = 2;</code>
   * @return The lunId.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getLunId() {
    return lunId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : lunId_;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey lun_id = 2;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getLunIdOrBuilder() {
    return getLunId();
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
    if (controllerId_ != null) {
      output.writeMessage(1, getControllerId());
    }
    if (lunId_ != null) {
      output.writeMessage(2, getLunId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (controllerId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getControllerId());
    }
    if (lunId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLunId());
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
    if (!(obj instanceof opi_api.storage.v1.VirtioScsiLunStatsRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.VirtioScsiLunStatsRequest other = (opi_api.storage.v1.VirtioScsiLunStatsRequest) obj;

    if (hasControllerId() != other.hasControllerId()) return false;
    if (hasControllerId()) {
      if (!getControllerId()
          .equals(other.getControllerId())) return false;
    }
    if (hasLunId() != other.hasLunId()) return false;
    if (hasLunId()) {
      if (!getLunId()
          .equals(other.getLunId())) return false;
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
    if (hasControllerId()) {
      hash = (37 * hash) + CONTROLLER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId().hashCode();
    }
    if (hasLunId()) {
      hash = (37 * hash) + LUN_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLunId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.VirtioScsiLunStatsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.VirtioScsiLunStatsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioScsiLunStatsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.VirtioScsiLunStatsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioScsiLunStatsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.VirtioScsiLunStatsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioScsiLunStatsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.VirtioScsiLunStatsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioScsiLunStatsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.VirtioScsiLunStatsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioScsiLunStatsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.VirtioScsiLunStatsRequest parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.VirtioScsiLunStatsRequest prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.VirtioScsiLunStatsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.VirtioScsiLunStatsRequest)
      opi_api.storage.v1.VirtioScsiLunStatsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_VirtioScsiLunStatsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_VirtioScsiLunStatsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.VirtioScsiLunStatsRequest.class, opi_api.storage.v1.VirtioScsiLunStatsRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.VirtioScsiLunStatsRequest.newBuilder()
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
      if (controllerIdBuilder_ == null) {
        controllerId_ = null;
      } else {
        controllerId_ = null;
        controllerIdBuilder_ = null;
      }
      if (lunIdBuilder_ == null) {
        lunId_ = null;
      } else {
        lunId_ = null;
        lunIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_VirtioScsiLunStatsRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.VirtioScsiLunStatsRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.VirtioScsiLunStatsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.VirtioScsiLunStatsRequest build() {
      opi_api.storage.v1.VirtioScsiLunStatsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.VirtioScsiLunStatsRequest buildPartial() {
      opi_api.storage.v1.VirtioScsiLunStatsRequest result = new opi_api.storage.v1.VirtioScsiLunStatsRequest(this);
      if (controllerIdBuilder_ == null) {
        result.controllerId_ = controllerId_;
      } else {
        result.controllerId_ = controllerIdBuilder_.build();
      }
      if (lunIdBuilder_ == null) {
        result.lunId_ = lunId_;
      } else {
        result.lunId_ = lunIdBuilder_.build();
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
      if (other instanceof opi_api.storage.v1.VirtioScsiLunStatsRequest) {
        return mergeFrom((opi_api.storage.v1.VirtioScsiLunStatsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.VirtioScsiLunStatsRequest other) {
      if (other == opi_api.storage.v1.VirtioScsiLunStatsRequest.getDefaultInstance()) return this;
      if (other.hasControllerId()) {
        mergeControllerId(other.getControllerId());
      }
      if (other.hasLunId()) {
        mergeLunId(other.getLunId());
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
      opi_api.storage.v1.VirtioScsiLunStatsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.VirtioScsiLunStatsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.common.v1.ObjectKey controllerId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> controllerIdBuilder_;
    /**
     * <code>.opi_api.common.v1.ObjectKey controller_id = 1;</code>
     * @return Whether the controllerId field is set.
     */
    public boolean hasControllerId() {
      return controllerIdBuilder_ != null || controllerId_ != null;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey controller_id = 1;</code>
     * @return The controllerId.
     */
    public opi_api.common.v1.ObjectKey getControllerId() {
      if (controllerIdBuilder_ == null) {
        return controllerId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : controllerId_;
      } else {
        return controllerIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey controller_id = 1;</code>
     */
    public Builder setControllerId(opi_api.common.v1.ObjectKey value) {
      if (controllerIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        controllerId_ = value;
        onChanged();
      } else {
        controllerIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey controller_id = 1;</code>
     */
    public Builder setControllerId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (controllerIdBuilder_ == null) {
        controllerId_ = builderForValue.build();
        onChanged();
      } else {
        controllerIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey controller_id = 1;</code>
     */
    public Builder mergeControllerId(opi_api.common.v1.ObjectKey value) {
      if (controllerIdBuilder_ == null) {
        if (controllerId_ != null) {
          controllerId_ =
            opi_api.common.v1.ObjectKey.newBuilder(controllerId_).mergeFrom(value).buildPartial();
        } else {
          controllerId_ = value;
        }
        onChanged();
      } else {
        controllerIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey controller_id = 1;</code>
     */
    public Builder clearControllerId() {
      if (controllerIdBuilder_ == null) {
        controllerId_ = null;
        onChanged();
      } else {
        controllerId_ = null;
        controllerIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey controller_id = 1;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getControllerIdBuilder() {
      
      onChanged();
      return getControllerIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey controller_id = 1;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getControllerIdOrBuilder() {
      if (controllerIdBuilder_ != null) {
        return controllerIdBuilder_.getMessageOrBuilder();
      } else {
        return controllerId_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : controllerId_;
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey controller_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getControllerIdFieldBuilder() {
      if (controllerIdBuilder_ == null) {
        controllerIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getControllerId(),
                getParentForChildren(),
                isClean());
        controllerId_ = null;
      }
      return controllerIdBuilder_;
    }

    private opi_api.common.v1.ObjectKey lunId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> lunIdBuilder_;
    /**
     * <code>.opi_api.common.v1.ObjectKey lun_id = 2;</code>
     * @return Whether the lunId field is set.
     */
    public boolean hasLunId() {
      return lunIdBuilder_ != null || lunId_ != null;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey lun_id = 2;</code>
     * @return The lunId.
     */
    public opi_api.common.v1.ObjectKey getLunId() {
      if (lunIdBuilder_ == null) {
        return lunId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : lunId_;
      } else {
        return lunIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey lun_id = 2;</code>
     */
    public Builder setLunId(opi_api.common.v1.ObjectKey value) {
      if (lunIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lunId_ = value;
        onChanged();
      } else {
        lunIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey lun_id = 2;</code>
     */
    public Builder setLunId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (lunIdBuilder_ == null) {
        lunId_ = builderForValue.build();
        onChanged();
      } else {
        lunIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey lun_id = 2;</code>
     */
    public Builder mergeLunId(opi_api.common.v1.ObjectKey value) {
      if (lunIdBuilder_ == null) {
        if (lunId_ != null) {
          lunId_ =
            opi_api.common.v1.ObjectKey.newBuilder(lunId_).mergeFrom(value).buildPartial();
        } else {
          lunId_ = value;
        }
        onChanged();
      } else {
        lunIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey lun_id = 2;</code>
     */
    public Builder clearLunId() {
      if (lunIdBuilder_ == null) {
        lunId_ = null;
        onChanged();
      } else {
        lunId_ = null;
        lunIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey lun_id = 2;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getLunIdBuilder() {
      
      onChanged();
      return getLunIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey lun_id = 2;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getLunIdOrBuilder() {
      if (lunIdBuilder_ != null) {
        return lunIdBuilder_.getMessageOrBuilder();
      } else {
        return lunId_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : lunId_;
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey lun_id = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getLunIdFieldBuilder() {
      if (lunIdBuilder_ == null) {
        lunIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getLunId(),
                getParentForChildren(),
                isClean());
        lunId_ = null;
      }
      return lunIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.VirtioScsiLunStatsRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioScsiLunStatsRequest)
  private static final opi_api.storage.v1.VirtioScsiLunStatsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.VirtioScsiLunStatsRequest();
  }

  public static opi_api.storage.v1.VirtioScsiLunStatsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VirtioScsiLunStatsRequest>
      PARSER = new com.google.protobuf.AbstractParser<VirtioScsiLunStatsRequest>() {
    @java.lang.Override
    public VirtioScsiLunStatsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VirtioScsiLunStatsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VirtioScsiLunStatsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VirtioScsiLunStatsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.VirtioScsiLunStatsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

