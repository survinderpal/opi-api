// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_scsi.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.CreateVirtioScsiControllerRequest}
 */
public final class CreateVirtioScsiControllerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.CreateVirtioScsiControllerRequest)
    CreateVirtioScsiControllerRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateVirtioScsiControllerRequest.newBuilder() to construct.
  private CreateVirtioScsiControllerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateVirtioScsiControllerRequest() {
    parent_ = "";
    virtioScsiControllerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateVirtioScsiControllerRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateVirtioScsiControllerRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            opi_api.storage.v1.VirtioScsiController.Builder subBuilder = null;
            if (virtioScsiController_ != null) {
              subBuilder = virtioScsiController_.toBuilder();
            }
            virtioScsiController_ = input.readMessage(opi_api.storage.v1.VirtioScsiController.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(virtioScsiController_);
              virtioScsiController_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            virtioScsiControllerId_ = s;
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
    return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_CreateVirtioScsiControllerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_CreateVirtioScsiControllerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.CreateVirtioScsiControllerRequest.class, opi_api.storage.v1.CreateVirtioScsiControllerRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VIRTIO_SCSI_CONTROLLER_FIELD_NUMBER = 2;
  private opi_api.storage.v1.VirtioScsiController virtioScsiController_;
  /**
   * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the virtioScsiController field is set.
   */
  @java.lang.Override
  public boolean hasVirtioScsiController() {
    return virtioScsiController_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The virtioScsiController.
   */
  @java.lang.Override
  public opi_api.storage.v1.VirtioScsiController getVirtioScsiController() {
    return virtioScsiController_ == null ? opi_api.storage.v1.VirtioScsiController.getDefaultInstance() : virtioScsiController_;
  }
  /**
   * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.VirtioScsiControllerOrBuilder getVirtioScsiControllerOrBuilder() {
    return getVirtioScsiController();
  }

  public static final int VIRTIO_SCSI_CONTROLLER_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object virtioScsiControllerId_;
  /**
   * <code>string virtio_scsi_controller_id = 3;</code>
   * @return The virtioScsiControllerId.
   */
  @java.lang.Override
  public java.lang.String getVirtioScsiControllerId() {
    java.lang.Object ref = virtioScsiControllerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      virtioScsiControllerId_ = s;
      return s;
    }
  }
  /**
   * <code>string virtio_scsi_controller_id = 3;</code>
   * @return The bytes for virtioScsiControllerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVirtioScsiControllerIdBytes() {
    java.lang.Object ref = virtioScsiControllerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      virtioScsiControllerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (virtioScsiController_ != null) {
      output.writeMessage(2, getVirtioScsiController());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(virtioScsiControllerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, virtioScsiControllerId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (virtioScsiController_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVirtioScsiController());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(virtioScsiControllerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, virtioScsiControllerId_);
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
    if (!(obj instanceof opi_api.storage.v1.CreateVirtioScsiControllerRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.CreateVirtioScsiControllerRequest other = (opi_api.storage.v1.CreateVirtioScsiControllerRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasVirtioScsiController() != other.hasVirtioScsiController()) return false;
    if (hasVirtioScsiController()) {
      if (!getVirtioScsiController()
          .equals(other.getVirtioScsiController())) return false;
    }
    if (!getVirtioScsiControllerId()
        .equals(other.getVirtioScsiControllerId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasVirtioScsiController()) {
      hash = (37 * hash) + VIRTIO_SCSI_CONTROLLER_FIELD_NUMBER;
      hash = (53 * hash) + getVirtioScsiController().hashCode();
    }
    hash = (37 * hash) + VIRTIO_SCSI_CONTROLLER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getVirtioScsiControllerId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.CreateVirtioScsiControllerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateVirtioScsiControllerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateVirtioScsiControllerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateVirtioScsiControllerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateVirtioScsiControllerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateVirtioScsiControllerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateVirtioScsiControllerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateVirtioScsiControllerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateVirtioScsiControllerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateVirtioScsiControllerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateVirtioScsiControllerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateVirtioScsiControllerRequest parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.CreateVirtioScsiControllerRequest prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.CreateVirtioScsiControllerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.CreateVirtioScsiControllerRequest)
      opi_api.storage.v1.CreateVirtioScsiControllerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_CreateVirtioScsiControllerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_CreateVirtioScsiControllerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.CreateVirtioScsiControllerRequest.class, opi_api.storage.v1.CreateVirtioScsiControllerRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.CreateVirtioScsiControllerRequest.newBuilder()
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
      parent_ = "";

      if (virtioScsiControllerBuilder_ == null) {
        virtioScsiController_ = null;
      } else {
        virtioScsiController_ = null;
        virtioScsiControllerBuilder_ = null;
      }
      virtioScsiControllerId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_CreateVirtioScsiControllerRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateVirtioScsiControllerRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.CreateVirtioScsiControllerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateVirtioScsiControllerRequest build() {
      opi_api.storage.v1.CreateVirtioScsiControllerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateVirtioScsiControllerRequest buildPartial() {
      opi_api.storage.v1.CreateVirtioScsiControllerRequest result = new opi_api.storage.v1.CreateVirtioScsiControllerRequest(this);
      result.parent_ = parent_;
      if (virtioScsiControllerBuilder_ == null) {
        result.virtioScsiController_ = virtioScsiController_;
      } else {
        result.virtioScsiController_ = virtioScsiControllerBuilder_.build();
      }
      result.virtioScsiControllerId_ = virtioScsiControllerId_;
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
      if (other instanceof opi_api.storage.v1.CreateVirtioScsiControllerRequest) {
        return mergeFrom((opi_api.storage.v1.CreateVirtioScsiControllerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.CreateVirtioScsiControllerRequest other) {
      if (other == opi_api.storage.v1.CreateVirtioScsiControllerRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasVirtioScsiController()) {
        mergeVirtioScsiController(other.getVirtioScsiController());
      }
      if (!other.getVirtioScsiControllerId().isEmpty()) {
        virtioScsiControllerId_ = other.virtioScsiControllerId_;
        onChanged();
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
      opi_api.storage.v1.CreateVirtioScsiControllerRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.CreateVirtioScsiControllerRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private opi_api.storage.v1.VirtioScsiController virtioScsiController_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.VirtioScsiController, opi_api.storage.v1.VirtioScsiController.Builder, opi_api.storage.v1.VirtioScsiControllerOrBuilder> virtioScsiControllerBuilder_;
    /**
     * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the virtioScsiController field is set.
     */
    public boolean hasVirtioScsiController() {
      return virtioScsiControllerBuilder_ != null || virtioScsiController_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The virtioScsiController.
     */
    public opi_api.storage.v1.VirtioScsiController getVirtioScsiController() {
      if (virtioScsiControllerBuilder_ == null) {
        return virtioScsiController_ == null ? opi_api.storage.v1.VirtioScsiController.getDefaultInstance() : virtioScsiController_;
      } else {
        return virtioScsiControllerBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setVirtioScsiController(opi_api.storage.v1.VirtioScsiController value) {
      if (virtioScsiControllerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        virtioScsiController_ = value;
        onChanged();
      } else {
        virtioScsiControllerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setVirtioScsiController(
        opi_api.storage.v1.VirtioScsiController.Builder builderForValue) {
      if (virtioScsiControllerBuilder_ == null) {
        virtioScsiController_ = builderForValue.build();
        onChanged();
      } else {
        virtioScsiControllerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeVirtioScsiController(opi_api.storage.v1.VirtioScsiController value) {
      if (virtioScsiControllerBuilder_ == null) {
        if (virtioScsiController_ != null) {
          virtioScsiController_ =
            opi_api.storage.v1.VirtioScsiController.newBuilder(virtioScsiController_).mergeFrom(value).buildPartial();
        } else {
          virtioScsiController_ = value;
        }
        onChanged();
      } else {
        virtioScsiControllerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearVirtioScsiController() {
      if (virtioScsiControllerBuilder_ == null) {
        virtioScsiController_ = null;
        onChanged();
      } else {
        virtioScsiController_ = null;
        virtioScsiControllerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.VirtioScsiController.Builder getVirtioScsiControllerBuilder() {
      
      onChanged();
      return getVirtioScsiControllerFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.VirtioScsiControllerOrBuilder getVirtioScsiControllerOrBuilder() {
      if (virtioScsiControllerBuilder_ != null) {
        return virtioScsiControllerBuilder_.getMessageOrBuilder();
      } else {
        return virtioScsiController_ == null ?
            opi_api.storage.v1.VirtioScsiController.getDefaultInstance() : virtioScsiController_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.VirtioScsiController, opi_api.storage.v1.VirtioScsiController.Builder, opi_api.storage.v1.VirtioScsiControllerOrBuilder> 
        getVirtioScsiControllerFieldBuilder() {
      if (virtioScsiControllerBuilder_ == null) {
        virtioScsiControllerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.VirtioScsiController, opi_api.storage.v1.VirtioScsiController.Builder, opi_api.storage.v1.VirtioScsiControllerOrBuilder>(
                getVirtioScsiController(),
                getParentForChildren(),
                isClean());
        virtioScsiController_ = null;
      }
      return virtioScsiControllerBuilder_;
    }

    private java.lang.Object virtioScsiControllerId_ = "";
    /**
     * <code>string virtio_scsi_controller_id = 3;</code>
     * @return The virtioScsiControllerId.
     */
    public java.lang.String getVirtioScsiControllerId() {
      java.lang.Object ref = virtioScsiControllerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        virtioScsiControllerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string virtio_scsi_controller_id = 3;</code>
     * @return The bytes for virtioScsiControllerId.
     */
    public com.google.protobuf.ByteString
        getVirtioScsiControllerIdBytes() {
      java.lang.Object ref = virtioScsiControllerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        virtioScsiControllerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string virtio_scsi_controller_id = 3;</code>
     * @param value The virtioScsiControllerId to set.
     * @return This builder for chaining.
     */
    public Builder setVirtioScsiControllerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      virtioScsiControllerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string virtio_scsi_controller_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVirtioScsiControllerId() {
      
      virtioScsiControllerId_ = getDefaultInstance().getVirtioScsiControllerId();
      onChanged();
      return this;
    }
    /**
     * <code>string virtio_scsi_controller_id = 3;</code>
     * @param value The bytes for virtioScsiControllerId to set.
     * @return This builder for chaining.
     */
    public Builder setVirtioScsiControllerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      virtioScsiControllerId_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.CreateVirtioScsiControllerRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateVirtioScsiControllerRequest)
  private static final opi_api.storage.v1.CreateVirtioScsiControllerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.CreateVirtioScsiControllerRequest();
  }

  public static opi_api.storage.v1.CreateVirtioScsiControllerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateVirtioScsiControllerRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateVirtioScsiControllerRequest>() {
    @java.lang.Override
    public CreateVirtioScsiControllerRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateVirtioScsiControllerRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateVirtioScsiControllerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateVirtioScsiControllerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.CreateVirtioScsiControllerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

