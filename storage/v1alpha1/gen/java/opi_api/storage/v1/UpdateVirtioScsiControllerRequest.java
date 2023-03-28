// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_scsi.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.UpdateVirtioScsiControllerRequest}
 */
public final class UpdateVirtioScsiControllerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.UpdateVirtioScsiControllerRequest)
    UpdateVirtioScsiControllerRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateVirtioScsiControllerRequest.newBuilder() to construct.
  private UpdateVirtioScsiControllerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateVirtioScsiControllerRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateVirtioScsiControllerRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateVirtioScsiControllerRequest(
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
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
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
    return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_UpdateVirtioScsiControllerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_UpdateVirtioScsiControllerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.UpdateVirtioScsiControllerRequest.class, opi_api.storage.v1.UpdateVirtioScsiControllerRequest.Builder.class);
  }

  public static final int VIRTIO_SCSI_CONTROLLER_FIELD_NUMBER = 1;
  private opi_api.storage.v1.VirtioScsiController virtioScsiController_;
  /**
   * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 1;</code>
   * @return Whether the virtioScsiController field is set.
   */
  @java.lang.Override
  public boolean hasVirtioScsiController() {
    return virtioScsiController_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 1;</code>
   * @return The virtioScsiController.
   */
  @java.lang.Override
  public opi_api.storage.v1.VirtioScsiController getVirtioScsiController() {
    return virtioScsiController_ == null ? opi_api.storage.v1.VirtioScsiController.getDefaultInstance() : virtioScsiController_;
  }
  /**
   * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.VirtioScsiControllerOrBuilder getVirtioScsiControllerOrBuilder() {
    return getVirtioScsiController();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (virtioScsiController_ != null) {
      output.writeMessage(1, getVirtioScsiController());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (virtioScsiController_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getVirtioScsiController());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof opi_api.storage.v1.UpdateVirtioScsiControllerRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.UpdateVirtioScsiControllerRequest other = (opi_api.storage.v1.UpdateVirtioScsiControllerRequest) obj;

    if (hasVirtioScsiController() != other.hasVirtioScsiController()) return false;
    if (hasVirtioScsiController()) {
      if (!getVirtioScsiController()
          .equals(other.getVirtioScsiController())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasVirtioScsiController()) {
      hash = (37 * hash) + VIRTIO_SCSI_CONTROLLER_FIELD_NUMBER;
      hash = (53 * hash) + getVirtioScsiController().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.UpdateVirtioScsiControllerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.UpdateVirtioScsiControllerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.UpdateVirtioScsiControllerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.UpdateVirtioScsiControllerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.UpdateVirtioScsiControllerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.UpdateVirtioScsiControllerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.UpdateVirtioScsiControllerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.UpdateVirtioScsiControllerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.UpdateVirtioScsiControllerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.UpdateVirtioScsiControllerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.UpdateVirtioScsiControllerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.UpdateVirtioScsiControllerRequest parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.UpdateVirtioScsiControllerRequest prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.UpdateVirtioScsiControllerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.UpdateVirtioScsiControllerRequest)
      opi_api.storage.v1.UpdateVirtioScsiControllerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_UpdateVirtioScsiControllerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_UpdateVirtioScsiControllerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.UpdateVirtioScsiControllerRequest.class, opi_api.storage.v1.UpdateVirtioScsiControllerRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.UpdateVirtioScsiControllerRequest.newBuilder()
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
      if (virtioScsiControllerBuilder_ == null) {
        virtioScsiController_ = null;
      } else {
        virtioScsiController_ = null;
        virtioScsiControllerBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_UpdateVirtioScsiControllerRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.UpdateVirtioScsiControllerRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.UpdateVirtioScsiControllerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.UpdateVirtioScsiControllerRequest build() {
      opi_api.storage.v1.UpdateVirtioScsiControllerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.UpdateVirtioScsiControllerRequest buildPartial() {
      opi_api.storage.v1.UpdateVirtioScsiControllerRequest result = new opi_api.storage.v1.UpdateVirtioScsiControllerRequest(this);
      if (virtioScsiControllerBuilder_ == null) {
        result.virtioScsiController_ = virtioScsiController_;
      } else {
        result.virtioScsiController_ = virtioScsiControllerBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof opi_api.storage.v1.UpdateVirtioScsiControllerRequest) {
        return mergeFrom((opi_api.storage.v1.UpdateVirtioScsiControllerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.UpdateVirtioScsiControllerRequest other) {
      if (other == opi_api.storage.v1.UpdateVirtioScsiControllerRequest.getDefaultInstance()) return this;
      if (other.hasVirtioScsiController()) {
        mergeVirtioScsiController(other.getVirtioScsiController());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      opi_api.storage.v1.UpdateVirtioScsiControllerRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.UpdateVirtioScsiControllerRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.storage.v1.VirtioScsiController virtioScsiController_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.VirtioScsiController, opi_api.storage.v1.VirtioScsiController.Builder, opi_api.storage.v1.VirtioScsiControllerOrBuilder> virtioScsiControllerBuilder_;
    /**
     * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 1;</code>
     * @return Whether the virtioScsiController field is set.
     */
    public boolean hasVirtioScsiController() {
      return virtioScsiControllerBuilder_ != null || virtioScsiController_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 1;</code>
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
     * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 1;</code>
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
     * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 1;</code>
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
     * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 1;</code>
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
     * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 1;</code>
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
     * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 1;</code>
     */
    public opi_api.storage.v1.VirtioScsiController.Builder getVirtioScsiControllerBuilder() {
      
      onChanged();
      return getVirtioScsiControllerFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 1;</code>
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
     * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 1;</code>
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

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.UpdateVirtioScsiControllerRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateVirtioScsiControllerRequest)
  private static final opi_api.storage.v1.UpdateVirtioScsiControllerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.UpdateVirtioScsiControllerRequest();
  }

  public static opi_api.storage.v1.UpdateVirtioScsiControllerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateVirtioScsiControllerRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateVirtioScsiControllerRequest>() {
    @java.lang.Override
    public UpdateVirtioScsiControllerRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateVirtioScsiControllerRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateVirtioScsiControllerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateVirtioScsiControllerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.UpdateVirtioScsiControllerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

