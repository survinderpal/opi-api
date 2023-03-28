// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_aio.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.AioController}
 */
public final class AioController extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.AioController)
    AioControllerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AioController.newBuilder() to construct.
  private AioController(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AioController() {
    filename_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AioController();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AioController(
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
            if (handle_ != null) {
              subBuilder = handle_.toBuilder();
            }
            handle_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(handle_);
              handle_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            blockSize_ = input.readInt64();
            break;
          }
          case 24: {

            blocksCount_ = input.readInt64();
            break;
          }
          case 34: {
            opi_api.common.v1.Uuid.Builder subBuilder = null;
            if (uuid_ != null) {
              subBuilder = uuid_.toBuilder();
            }
            uuid_ = input.readMessage(opi_api.common.v1.Uuid.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(uuid_);
              uuid_ = subBuilder.buildPartial();
            }

            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            filename_ = s;
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
    return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioController_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioController_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.AioController.class, opi_api.storage.v1.AioController.Builder.class);
  }

  public static final int HANDLE_FIELD_NUMBER = 1;
  private opi_api.common.v1.ObjectKey handle_;
  /**
   * <pre>
   * handle is an opaque object handle that is not user settable.
   * handle will be returned with created object
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
   * @return Whether the handle field is set.
   */
  @java.lang.Override
  public boolean hasHandle() {
    return handle_ != null;
  }
  /**
   * <pre>
   * handle is an opaque object handle that is not user settable.
   * handle will be returned with created object
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
   * @return The handle.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getHandle() {
    return handle_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : handle_;
  }
  /**
   * <pre>
   * handle is an opaque object handle that is not user settable.
   * handle will be returned with created object
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getHandleOrBuilder() {
    return getHandle();
  }

  public static final int BLOCK_SIZE_FIELD_NUMBER = 2;
  private long blockSize_;
  /**
   * <code>int64 block_size = 2;</code>
   * @return The blockSize.
   */
  @java.lang.Override
  public long getBlockSize() {
    return blockSize_;
  }

  public static final int BLOCKS_COUNT_FIELD_NUMBER = 3;
  private long blocksCount_;
  /**
   * <code>int64 blocks_count = 3;</code>
   * @return The blocksCount.
   */
  @java.lang.Override
  public long getBlocksCount() {
    return blocksCount_;
  }

  public static final int UUID_FIELD_NUMBER = 4;
  private opi_api.common.v1.Uuid uuid_;
  /**
   * <code>.opi_api.common.v1.Uuid uuid = 4;</code>
   * @return Whether the uuid field is set.
   */
  @java.lang.Override
  public boolean hasUuid() {
    return uuid_ != null;
  }
  /**
   * <code>.opi_api.common.v1.Uuid uuid = 4;</code>
   * @return The uuid.
   */
  @java.lang.Override
  public opi_api.common.v1.Uuid getUuid() {
    return uuid_ == null ? opi_api.common.v1.Uuid.getDefaultInstance() : uuid_;
  }
  /**
   * <code>.opi_api.common.v1.Uuid uuid = 4;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.UuidOrBuilder getUuidOrBuilder() {
    return getUuid();
  }

  public static final int FILENAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object filename_;
  /**
   * <code>string filename = 5;</code>
   * @return The filename.
   */
  @java.lang.Override
  public java.lang.String getFilename() {
    java.lang.Object ref = filename_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filename_ = s;
      return s;
    }
  }
  /**
   * <code>string filename = 5;</code>
   * @return The bytes for filename.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFilenameBytes() {
    java.lang.Object ref = filename_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filename_ = b;
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
    if (handle_ != null) {
      output.writeMessage(1, getHandle());
    }
    if (blockSize_ != 0L) {
      output.writeInt64(2, blockSize_);
    }
    if (blocksCount_ != 0L) {
      output.writeInt64(3, blocksCount_);
    }
    if (uuid_ != null) {
      output.writeMessage(4, getUuid());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filename_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, filename_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (handle_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHandle());
    }
    if (blockSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, blockSize_);
    }
    if (blocksCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, blocksCount_);
    }
    if (uuid_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getUuid());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filename_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, filename_);
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
    if (!(obj instanceof opi_api.storage.v1.AioController)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.AioController other = (opi_api.storage.v1.AioController) obj;

    if (hasHandle() != other.hasHandle()) return false;
    if (hasHandle()) {
      if (!getHandle()
          .equals(other.getHandle())) return false;
    }
    if (getBlockSize()
        != other.getBlockSize()) return false;
    if (getBlocksCount()
        != other.getBlocksCount()) return false;
    if (hasUuid() != other.hasUuid()) return false;
    if (hasUuid()) {
      if (!getUuid()
          .equals(other.getUuid())) return false;
    }
    if (!getFilename()
        .equals(other.getFilename())) return false;
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
    if (hasHandle()) {
      hash = (37 * hash) + HANDLE_FIELD_NUMBER;
      hash = (53 * hash) + getHandle().hashCode();
    }
    hash = (37 * hash) + BLOCK_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBlockSize());
    hash = (37 * hash) + BLOCKS_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBlocksCount());
    if (hasUuid()) {
      hash = (37 * hash) + UUID_FIELD_NUMBER;
      hash = (53 * hash) + getUuid().hashCode();
    }
    hash = (37 * hash) + FILENAME_FIELD_NUMBER;
    hash = (53 * hash) + getFilename().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.AioController parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.AioController parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.AioController parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.AioController parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.AioController parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.AioController parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.AioController parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.AioController parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.AioController parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.AioController parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.AioController parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.AioController parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.AioController prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.AioController}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.AioController)
      opi_api.storage.v1.AioControllerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioController_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioController_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.AioController.class, opi_api.storage.v1.AioController.Builder.class);
    }

    // Construct using opi_api.storage.v1.AioController.newBuilder()
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
      if (handleBuilder_ == null) {
        handle_ = null;
      } else {
        handle_ = null;
        handleBuilder_ = null;
      }
      blockSize_ = 0L;

      blocksCount_ = 0L;

      if (uuidBuilder_ == null) {
        uuid_ = null;
      } else {
        uuid_ = null;
        uuidBuilder_ = null;
      }
      filename_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioController_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.AioController getDefaultInstanceForType() {
      return opi_api.storage.v1.AioController.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.AioController build() {
      opi_api.storage.v1.AioController result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.AioController buildPartial() {
      opi_api.storage.v1.AioController result = new opi_api.storage.v1.AioController(this);
      if (handleBuilder_ == null) {
        result.handle_ = handle_;
      } else {
        result.handle_ = handleBuilder_.build();
      }
      result.blockSize_ = blockSize_;
      result.blocksCount_ = blocksCount_;
      if (uuidBuilder_ == null) {
        result.uuid_ = uuid_;
      } else {
        result.uuid_ = uuidBuilder_.build();
      }
      result.filename_ = filename_;
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
      if (other instanceof opi_api.storage.v1.AioController) {
        return mergeFrom((opi_api.storage.v1.AioController)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.AioController other) {
      if (other == opi_api.storage.v1.AioController.getDefaultInstance()) return this;
      if (other.hasHandle()) {
        mergeHandle(other.getHandle());
      }
      if (other.getBlockSize() != 0L) {
        setBlockSize(other.getBlockSize());
      }
      if (other.getBlocksCount() != 0L) {
        setBlocksCount(other.getBlocksCount());
      }
      if (other.hasUuid()) {
        mergeUuid(other.getUuid());
      }
      if (!other.getFilename().isEmpty()) {
        filename_ = other.filename_;
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
      opi_api.storage.v1.AioController parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.AioController) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.common.v1.ObjectKey handle_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> handleBuilder_;
    /**
     * <pre>
     * handle is an opaque object handle that is not user settable.
     * handle will be returned with created object
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
     * @return Whether the handle field is set.
     */
    public boolean hasHandle() {
      return handleBuilder_ != null || handle_ != null;
    }
    /**
     * <pre>
     * handle is an opaque object handle that is not user settable.
     * handle will be returned with created object
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
     * @return The handle.
     */
    public opi_api.common.v1.ObjectKey getHandle() {
      if (handleBuilder_ == null) {
        return handle_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : handle_;
      } else {
        return handleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * handle is an opaque object handle that is not user settable.
     * handle will be returned with created object
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
     */
    public Builder setHandle(opi_api.common.v1.ObjectKey value) {
      if (handleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        handle_ = value;
        onChanged();
      } else {
        handleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * handle is an opaque object handle that is not user settable.
     * handle will be returned with created object
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
     */
    public Builder setHandle(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (handleBuilder_ == null) {
        handle_ = builderForValue.build();
        onChanged();
      } else {
        handleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * handle is an opaque object handle that is not user settable.
     * handle will be returned with created object
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
     */
    public Builder mergeHandle(opi_api.common.v1.ObjectKey value) {
      if (handleBuilder_ == null) {
        if (handle_ != null) {
          handle_ =
            opi_api.common.v1.ObjectKey.newBuilder(handle_).mergeFrom(value).buildPartial();
        } else {
          handle_ = value;
        }
        onChanged();
      } else {
        handleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * handle is an opaque object handle that is not user settable.
     * handle will be returned with created object
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
     */
    public Builder clearHandle() {
      if (handleBuilder_ == null) {
        handle_ = null;
        onChanged();
      } else {
        handle_ = null;
        handleBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * handle is an opaque object handle that is not user settable.
     * handle will be returned with created object
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getHandleBuilder() {
      
      onChanged();
      return getHandleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * handle is an opaque object handle that is not user settable.
     * handle will be returned with created object
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getHandleOrBuilder() {
      if (handleBuilder_ != null) {
        return handleBuilder_.getMessageOrBuilder();
      } else {
        return handle_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : handle_;
      }
    }
    /**
     * <pre>
     * handle is an opaque object handle that is not user settable.
     * handle will be returned with created object
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getHandleFieldBuilder() {
      if (handleBuilder_ == null) {
        handleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getHandle(),
                getParentForChildren(),
                isClean());
        handle_ = null;
      }
      return handleBuilder_;
    }

    private long blockSize_ ;
    /**
     * <code>int64 block_size = 2;</code>
     * @return The blockSize.
     */
    @java.lang.Override
    public long getBlockSize() {
      return blockSize_;
    }
    /**
     * <code>int64 block_size = 2;</code>
     * @param value The blockSize to set.
     * @return This builder for chaining.
     */
    public Builder setBlockSize(long value) {
      
      blockSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 block_size = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlockSize() {
      
      blockSize_ = 0L;
      onChanged();
      return this;
    }

    private long blocksCount_ ;
    /**
     * <code>int64 blocks_count = 3;</code>
     * @return The blocksCount.
     */
    @java.lang.Override
    public long getBlocksCount() {
      return blocksCount_;
    }
    /**
     * <code>int64 blocks_count = 3;</code>
     * @param value The blocksCount to set.
     * @return This builder for chaining.
     */
    public Builder setBlocksCount(long value) {
      
      blocksCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 blocks_count = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlocksCount() {
      
      blocksCount_ = 0L;
      onChanged();
      return this;
    }

    private opi_api.common.v1.Uuid uuid_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.Uuid, opi_api.common.v1.Uuid.Builder, opi_api.common.v1.UuidOrBuilder> uuidBuilder_;
    /**
     * <code>.opi_api.common.v1.Uuid uuid = 4;</code>
     * @return Whether the uuid field is set.
     */
    public boolean hasUuid() {
      return uuidBuilder_ != null || uuid_ != null;
    }
    /**
     * <code>.opi_api.common.v1.Uuid uuid = 4;</code>
     * @return The uuid.
     */
    public opi_api.common.v1.Uuid getUuid() {
      if (uuidBuilder_ == null) {
        return uuid_ == null ? opi_api.common.v1.Uuid.getDefaultInstance() : uuid_;
      } else {
        return uuidBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.common.v1.Uuid uuid = 4;</code>
     */
    public Builder setUuid(opi_api.common.v1.Uuid value) {
      if (uuidBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        uuid_ = value;
        onChanged();
      } else {
        uuidBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.Uuid uuid = 4;</code>
     */
    public Builder setUuid(
        opi_api.common.v1.Uuid.Builder builderForValue) {
      if (uuidBuilder_ == null) {
        uuid_ = builderForValue.build();
        onChanged();
      } else {
        uuidBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.Uuid uuid = 4;</code>
     */
    public Builder mergeUuid(opi_api.common.v1.Uuid value) {
      if (uuidBuilder_ == null) {
        if (uuid_ != null) {
          uuid_ =
            opi_api.common.v1.Uuid.newBuilder(uuid_).mergeFrom(value).buildPartial();
        } else {
          uuid_ = value;
        }
        onChanged();
      } else {
        uuidBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.Uuid uuid = 4;</code>
     */
    public Builder clearUuid() {
      if (uuidBuilder_ == null) {
        uuid_ = null;
        onChanged();
      } else {
        uuid_ = null;
        uuidBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.Uuid uuid = 4;</code>
     */
    public opi_api.common.v1.Uuid.Builder getUuidBuilder() {
      
      onChanged();
      return getUuidFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.common.v1.Uuid uuid = 4;</code>
     */
    public opi_api.common.v1.UuidOrBuilder getUuidOrBuilder() {
      if (uuidBuilder_ != null) {
        return uuidBuilder_.getMessageOrBuilder();
      } else {
        return uuid_ == null ?
            opi_api.common.v1.Uuid.getDefaultInstance() : uuid_;
      }
    }
    /**
     * <code>.opi_api.common.v1.Uuid uuid = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.Uuid, opi_api.common.v1.Uuid.Builder, opi_api.common.v1.UuidOrBuilder> 
        getUuidFieldBuilder() {
      if (uuidBuilder_ == null) {
        uuidBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.Uuid, opi_api.common.v1.Uuid.Builder, opi_api.common.v1.UuidOrBuilder>(
                getUuid(),
                getParentForChildren(),
                isClean());
        uuid_ = null;
      }
      return uuidBuilder_;
    }

    private java.lang.Object filename_ = "";
    /**
     * <code>string filename = 5;</code>
     * @return The filename.
     */
    public java.lang.String getFilename() {
      java.lang.Object ref = filename_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filename_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string filename = 5;</code>
     * @return The bytes for filename.
     */
    public com.google.protobuf.ByteString
        getFilenameBytes() {
      java.lang.Object ref = filename_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string filename = 5;</code>
     * @param value The filename to set.
     * @return This builder for chaining.
     */
    public Builder setFilename(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filename_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string filename = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFilename() {
      
      filename_ = getDefaultInstance().getFilename();
      onChanged();
      return this;
    }
    /**
     * <code>string filename = 5;</code>
     * @param value The bytes for filename to set.
     * @return This builder for chaining.
     */
    public Builder setFilenameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filename_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.AioController)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.AioController)
  private static final opi_api.storage.v1.AioController DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.AioController();
  }

  public static opi_api.storage.v1.AioController getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AioController>
      PARSER = new com.google.protobuf.AbstractParser<AioController>() {
    @java.lang.Override
    public AioController parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AioController(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AioController> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AioController> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.AioController getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

