// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networktypes.proto

package opi_api.network.opinetcommon.v1alpha1;

/**
 * <pre>
 * PortRange object has low and high end of the port ranges
 * </pre>
 *
 * Protobuf type {@code opi_api.network.opinetcommon.v1alpha1.PortRange}
 */
public final class PortRange extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.opinetcommon.v1alpha1.PortRange)
    PortRangeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PortRange.newBuilder() to construct.
  private PortRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PortRange() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PortRange();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PortRange(
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

            portLow_ = input.readInt32();
            break;
          }
          case 16: {

            portHigh_ = input.readInt32();
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
    return opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.internal_static_opi_api_network_opinetcommon_v1alpha1_PortRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.internal_static_opi_api_network_opinetcommon_v1alpha1_PortRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.opinetcommon.v1alpha1.PortRange.class, opi_api.network.opinetcommon.v1alpha1.PortRange.Builder.class);
  }

  public static final int PORT_LOW_FIELD_NUMBER = 1;
  private int portLow_;
  /**
   * <pre>
   * range:0-65535
   * </pre>
   *
   * <code>int32 port_low = 1;</code>
   * @return The portLow.
   */
  @java.lang.Override
  public int getPortLow() {
    return portLow_;
  }

  public static final int PORT_HIGH_FIELD_NUMBER = 2;
  private int portHigh_;
  /**
   * <pre>
   * range:0-65535
   * </pre>
   *
   * <code>int32 port_high = 2;</code>
   * @return The portHigh.
   */
  @java.lang.Override
  public int getPortHigh() {
    return portHigh_;
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
    if (portLow_ != 0) {
      output.writeInt32(1, portLow_);
    }
    if (portHigh_ != 0) {
      output.writeInt32(2, portHigh_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (portLow_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, portLow_);
    }
    if (portHigh_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, portHigh_);
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
    if (!(obj instanceof opi_api.network.opinetcommon.v1alpha1.PortRange)) {
      return super.equals(obj);
    }
    opi_api.network.opinetcommon.v1alpha1.PortRange other = (opi_api.network.opinetcommon.v1alpha1.PortRange) obj;

    if (getPortLow()
        != other.getPortLow()) return false;
    if (getPortHigh()
        != other.getPortHigh()) return false;
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
    hash = (37 * hash) + PORT_LOW_FIELD_NUMBER;
    hash = (53 * hash) + getPortLow();
    hash = (37 * hash) + PORT_HIGH_FIELD_NUMBER;
    hash = (53 * hash) + getPortHigh();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.opinetcommon.v1alpha1.PortRange parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.opinetcommon.v1alpha1.PortRange parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.opinetcommon.v1alpha1.PortRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.opinetcommon.v1alpha1.PortRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.opinetcommon.v1alpha1.PortRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.opinetcommon.v1alpha1.PortRange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.opinetcommon.v1alpha1.PortRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.opinetcommon.v1alpha1.PortRange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.opinetcommon.v1alpha1.PortRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.opinetcommon.v1alpha1.PortRange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.opinetcommon.v1alpha1.PortRange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.opinetcommon.v1alpha1.PortRange parseFrom(
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
  public static Builder newBuilder(opi_api.network.opinetcommon.v1alpha1.PortRange prototype) {
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
   * PortRange object has low and high end of the port ranges
   * </pre>
   *
   * Protobuf type {@code opi_api.network.opinetcommon.v1alpha1.PortRange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.opinetcommon.v1alpha1.PortRange)
      opi_api.network.opinetcommon.v1alpha1.PortRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.internal_static_opi_api_network_opinetcommon_v1alpha1_PortRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.internal_static_opi_api_network_opinetcommon_v1alpha1_PortRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.opinetcommon.v1alpha1.PortRange.class, opi_api.network.opinetcommon.v1alpha1.PortRange.Builder.class);
    }

    // Construct using opi_api.network.opinetcommon.v1alpha1.PortRange.newBuilder()
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
      portLow_ = 0;

      portHigh_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.internal_static_opi_api_network_opinetcommon_v1alpha1_PortRange_descriptor;
    }

    @java.lang.Override
    public opi_api.network.opinetcommon.v1alpha1.PortRange getDefaultInstanceForType() {
      return opi_api.network.opinetcommon.v1alpha1.PortRange.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.opinetcommon.v1alpha1.PortRange build() {
      opi_api.network.opinetcommon.v1alpha1.PortRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.opinetcommon.v1alpha1.PortRange buildPartial() {
      opi_api.network.opinetcommon.v1alpha1.PortRange result = new opi_api.network.opinetcommon.v1alpha1.PortRange(this);
      result.portLow_ = portLow_;
      result.portHigh_ = portHigh_;
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
      if (other instanceof opi_api.network.opinetcommon.v1alpha1.PortRange) {
        return mergeFrom((opi_api.network.opinetcommon.v1alpha1.PortRange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.opinetcommon.v1alpha1.PortRange other) {
      if (other == opi_api.network.opinetcommon.v1alpha1.PortRange.getDefaultInstance()) return this;
      if (other.getPortLow() != 0) {
        setPortLow(other.getPortLow());
      }
      if (other.getPortHigh() != 0) {
        setPortHigh(other.getPortHigh());
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
      opi_api.network.opinetcommon.v1alpha1.PortRange parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.opinetcommon.v1alpha1.PortRange) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int portLow_ ;
    /**
     * <pre>
     * range:0-65535
     * </pre>
     *
     * <code>int32 port_low = 1;</code>
     * @return The portLow.
     */
    @java.lang.Override
    public int getPortLow() {
      return portLow_;
    }
    /**
     * <pre>
     * range:0-65535
     * </pre>
     *
     * <code>int32 port_low = 1;</code>
     * @param value The portLow to set.
     * @return This builder for chaining.
     */
    public Builder setPortLow(int value) {
      
      portLow_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * range:0-65535
     * </pre>
     *
     * <code>int32 port_low = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPortLow() {
      
      portLow_ = 0;
      onChanged();
      return this;
    }

    private int portHigh_ ;
    /**
     * <pre>
     * range:0-65535
     * </pre>
     *
     * <code>int32 port_high = 2;</code>
     * @return The portHigh.
     */
    @java.lang.Override
    public int getPortHigh() {
      return portHigh_;
    }
    /**
     * <pre>
     * range:0-65535
     * </pre>
     *
     * <code>int32 port_high = 2;</code>
     * @param value The portHigh to set.
     * @return This builder for chaining.
     */
    public Builder setPortHigh(int value) {
      
      portHigh_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * range:0-65535
     * </pre>
     *
     * <code>int32 port_high = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPortHigh() {
      
      portHigh_ = 0;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.opinetcommon.v1alpha1.PortRange)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.PortRange)
  private static final opi_api.network.opinetcommon.v1alpha1.PortRange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.opinetcommon.v1alpha1.PortRange();
  }

  public static opi_api.network.opinetcommon.v1alpha1.PortRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PortRange>
      PARSER = new com.google.protobuf.AbstractParser<PortRange>() {
    @java.lang.Override
    public PortRange parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PortRange(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PortRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PortRange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.opinetcommon.v1alpha1.PortRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

