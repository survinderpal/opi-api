// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nexthop.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * nexthop group lookup request
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.NextHopGroupLookup}
 */
public final class NextHopGroupLookup extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.NextHopGroupLookup)
    NextHopGroupLookupOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NextHopGroupLookup.newBuilder() to construct.
  private NextHopGroupLookup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NextHopGroupLookup() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NextHopGroupLookup();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NextHopGroupLookup(
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
          case 8: {
            int rawValue = input.readEnum();
            gettypeCase_ = 1;
            gettype_ = rawValue;
            break;
          }
          case 18: {
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (gettypeCase_ == 2) {
              subBuilder = ((opi_api.common.v1.ObjectKey) gettype_).toBuilder();
            }
            gettype_ =
                input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((opi_api.common.v1.ObjectKey) gettype_);
              gettype_ = subBuilder.buildPartial();
            }
            gettypeCase_ = 2;
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
    return opi_api.network.cloud.v1alpha1.NextHopProto.internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupLookup_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.NextHopProto.internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupLookup_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.NextHopGroupLookup.class, opi_api.network.cloud.v1alpha1.NextHopGroupLookup.Builder.class);
  }

  private int gettypeCase_ = 0;
  private java.lang.Object gettype_;
  public enum GettypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    TYPE(1),
    ID(2),
    GETTYPE_NOT_SET(0);
    private final int value;
    private GettypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GettypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static GettypeCase forNumber(int value) {
      switch (value) {
        case 1: return TYPE;
        case 2: return ID;
        case 0: return GETTYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public GettypeCase
  getGettypeCase() {
    return GettypeCase.forNumber(
        gettypeCase_);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * retrieve based on the group type
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHopGroupType type = 1;</code>
   * @return Whether the type field is set.
   */
  public boolean hasType() {
    return gettypeCase_ == 1;
  }
  /**
   * <pre>
   * retrieve based on the group type
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHopGroupType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  public int getTypeValue() {
    if (gettypeCase_ == 1) {
      return (java.lang.Integer) gettype_;
    }
    return 0;
  }
  /**
   * <pre>
   * retrieve based on the group type
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHopGroupType type = 1;</code>
   * @return The type.
   */
  public opi_api.network.cloud.v1alpha1.NextHopGroupType getType() {
    if (gettypeCase_ == 1) {
      @SuppressWarnings("deprecation")
      opi_api.network.cloud.v1alpha1.NextHopGroupType result = opi_api.network.cloud.v1alpha1.NextHopGroupType.valueOf(
          (java.lang.Integer) gettype_);
      return result == null ? opi_api.network.cloud.v1alpha1.NextHopGroupType.UNRECOGNIZED : result;
    }
    return opi_api.network.cloud.v1alpha1.NextHopGroupType.NEXT_HOP_GROUP_TYPE_UNSPECIFIED;
  }

  public static final int ID_FIELD_NUMBER = 2;
  /**
   * <pre>
   * retreive based on nh id
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 2;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return gettypeCase_ == 2;
  }
  /**
   * <pre>
   * retreive based on nh id
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 2;</code>
   * @return The id.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getId() {
    if (gettypeCase_ == 2) {
       return (opi_api.common.v1.ObjectKey) gettype_;
    }
    return opi_api.common.v1.ObjectKey.getDefaultInstance();
  }
  /**
   * <pre>
   * retreive based on nh id
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 2;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getIdOrBuilder() {
    if (gettypeCase_ == 2) {
       return (opi_api.common.v1.ObjectKey) gettype_;
    }
    return opi_api.common.v1.ObjectKey.getDefaultInstance();
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
    if (gettypeCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) gettype_));
    }
    if (gettypeCase_ == 2) {
      output.writeMessage(2, (opi_api.common.v1.ObjectKey) gettype_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gettypeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ((java.lang.Integer) gettype_));
    }
    if (gettypeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (opi_api.common.v1.ObjectKey) gettype_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.NextHopGroupLookup)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.NextHopGroupLookup other = (opi_api.network.cloud.v1alpha1.NextHopGroupLookup) obj;

    if (!getGettypeCase().equals(other.getGettypeCase())) return false;
    switch (gettypeCase_) {
      case 1:
        if (getTypeValue()
            != other.getTypeValue()) return false;
        break;
      case 2:
        if (!getId()
            .equals(other.getId())) return false;
        break;
      case 0:
      default:
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
    switch (gettypeCase_) {
      case 1:
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getTypeValue();
        break;
      case 2:
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.NextHopGroupLookup parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.NextHopGroupLookup parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.NextHopGroupLookup parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.NextHopGroupLookup parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.NextHopGroupLookup parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.NextHopGroupLookup parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.NextHopGroupLookup parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.NextHopGroupLookup parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.NextHopGroupLookup parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.NextHopGroupLookup parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.NextHopGroupLookup parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.NextHopGroupLookup parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.NextHopGroupLookup prototype) {
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
   * nexthop group lookup request
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.NextHopGroupLookup}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.NextHopGroupLookup)
      opi_api.network.cloud.v1alpha1.NextHopGroupLookupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.NextHopProto.internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupLookup_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.NextHopProto.internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupLookup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.NextHopGroupLookup.class, opi_api.network.cloud.v1alpha1.NextHopGroupLookup.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.NextHopGroupLookup.newBuilder()
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
      gettypeCase_ = 0;
      gettype_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.NextHopProto.internal_static_opi_api_network_cloud_v1alpha1_NextHopGroupLookup_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.NextHopGroupLookup getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.NextHopGroupLookup.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.NextHopGroupLookup build() {
      opi_api.network.cloud.v1alpha1.NextHopGroupLookup result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.NextHopGroupLookup buildPartial() {
      opi_api.network.cloud.v1alpha1.NextHopGroupLookup result = new opi_api.network.cloud.v1alpha1.NextHopGroupLookup(this);
      if (gettypeCase_ == 1) {
        result.gettype_ = gettype_;
      }
      if (gettypeCase_ == 2) {
        if (idBuilder_ == null) {
          result.gettype_ = gettype_;
        } else {
          result.gettype_ = idBuilder_.build();
        }
      }
      result.gettypeCase_ = gettypeCase_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.NextHopGroupLookup) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.NextHopGroupLookup)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.NextHopGroupLookup other) {
      if (other == opi_api.network.cloud.v1alpha1.NextHopGroupLookup.getDefaultInstance()) return this;
      switch (other.getGettypeCase()) {
        case TYPE: {
          setTypeValue(other.getTypeValue());
          break;
        }
        case ID: {
          mergeId(other.getId());
          break;
        }
        case GETTYPE_NOT_SET: {
          break;
        }
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
      opi_api.network.cloud.v1alpha1.NextHopGroupLookup parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.NextHopGroupLookup) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int gettypeCase_ = 0;
    private java.lang.Object gettype_;
    public GettypeCase
        getGettypeCase() {
      return GettypeCase.forNumber(
          gettypeCase_);
    }

    public Builder clearGettype() {
      gettypeCase_ = 0;
      gettype_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * retrieve based on the group type
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.NextHopGroupType type = 1;</code>
     * @return Whether the type field is set.
     */
    @java.lang.Override
    public boolean hasType() {
      return gettypeCase_ == 1;
    }
    /**
     * <pre>
     * retrieve based on the group type
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.NextHopGroupType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override
    public int getTypeValue() {
      if (gettypeCase_ == 1) {
        return ((java.lang.Integer) gettype_).intValue();
      }
      return 0;
    }
    /**
     * <pre>
     * retrieve based on the group type
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.NextHopGroupType type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      gettypeCase_ = 1;
      gettype_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * retrieve based on the group type
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.NextHopGroupType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.NextHopGroupType getType() {
      if (gettypeCase_ == 1) {
        @SuppressWarnings("deprecation")
        opi_api.network.cloud.v1alpha1.NextHopGroupType result = opi_api.network.cloud.v1alpha1.NextHopGroupType.valueOf(
            (java.lang.Integer) gettype_);
        return result == null ? opi_api.network.cloud.v1alpha1.NextHopGroupType.UNRECOGNIZED : result;
      }
      return opi_api.network.cloud.v1alpha1.NextHopGroupType.NEXT_HOP_GROUP_TYPE_UNSPECIFIED;
    }
    /**
     * <pre>
     * retrieve based on the group type
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.NextHopGroupType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(opi_api.network.cloud.v1alpha1.NextHopGroupType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      gettypeCase_ = 1;
      gettype_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * retrieve based on the group type
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.NextHopGroupType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      if (gettypeCase_ == 1) {
        gettypeCase_ = 0;
        gettype_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> idBuilder_;
    /**
     * <pre>
     * retreive based on nh id
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 2;</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return gettypeCase_ == 2;
    }
    /**
     * <pre>
     * retreive based on nh id
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 2;</code>
     * @return The id.
     */
    @java.lang.Override
    public opi_api.common.v1.ObjectKey getId() {
      if (idBuilder_ == null) {
        if (gettypeCase_ == 2) {
          return (opi_api.common.v1.ObjectKey) gettype_;
        }
        return opi_api.common.v1.ObjectKey.getDefaultInstance();
      } else {
        if (gettypeCase_ == 2) {
          return idBuilder_.getMessage();
        }
        return opi_api.common.v1.ObjectKey.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * retreive based on nh id
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 2;</code>
     */
    public Builder setId(opi_api.common.v1.ObjectKey value) {
      if (idBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gettype_ = value;
        onChanged();
      } else {
        idBuilder_.setMessage(value);
      }
      gettypeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * retreive based on nh id
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 2;</code>
     */
    public Builder setId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (idBuilder_ == null) {
        gettype_ = builderForValue.build();
        onChanged();
      } else {
        idBuilder_.setMessage(builderForValue.build());
      }
      gettypeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * retreive based on nh id
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 2;</code>
     */
    public Builder mergeId(opi_api.common.v1.ObjectKey value) {
      if (idBuilder_ == null) {
        if (gettypeCase_ == 2 &&
            gettype_ != opi_api.common.v1.ObjectKey.getDefaultInstance()) {
          gettype_ = opi_api.common.v1.ObjectKey.newBuilder((opi_api.common.v1.ObjectKey) gettype_)
              .mergeFrom(value).buildPartial();
        } else {
          gettype_ = value;
        }
        onChanged();
      } else {
        if (gettypeCase_ == 2) {
          idBuilder_.mergeFrom(value);
        }
        idBuilder_.setMessage(value);
      }
      gettypeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * retreive based on nh id
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 2;</code>
     */
    public Builder clearId() {
      if (idBuilder_ == null) {
        if (gettypeCase_ == 2) {
          gettypeCase_ = 0;
          gettype_ = null;
          onChanged();
        }
      } else {
        if (gettypeCase_ == 2) {
          gettypeCase_ = 0;
          gettype_ = null;
        }
        idBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * retreive based on nh id
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 2;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getIdBuilder() {
      return getIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * retreive based on nh id
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 2;</code>
     */
    @java.lang.Override
    public opi_api.common.v1.ObjectKeyOrBuilder getIdOrBuilder() {
      if ((gettypeCase_ == 2) && (idBuilder_ != null)) {
        return idBuilder_.getMessageOrBuilder();
      } else {
        if (gettypeCase_ == 2) {
          return (opi_api.common.v1.ObjectKey) gettype_;
        }
        return opi_api.common.v1.ObjectKey.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * retreive based on nh id
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        if (!(gettypeCase_ == 2)) {
          gettype_ = opi_api.common.v1.ObjectKey.getDefaultInstance();
        }
        idBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                (opi_api.common.v1.ObjectKey) gettype_,
                getParentForChildren(),
                isClean());
        gettype_ = null;
      }
      gettypeCase_ = 2;
      onChanged();;
      return idBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.NextHopGroupLookup)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.NextHopGroupLookup)
  private static final opi_api.network.cloud.v1alpha1.NextHopGroupLookup DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.NextHopGroupLookup();
  }

  public static opi_api.network.cloud.v1alpha1.NextHopGroupLookup getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NextHopGroupLookup>
      PARSER = new com.google.protobuf.AbstractParser<NextHopGroupLookup>() {
    @java.lang.Override
    public NextHopGroupLookup parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NextHopGroupLookup(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NextHopGroupLookup> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NextHopGroupLookup> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.NextHopGroupLookup getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

