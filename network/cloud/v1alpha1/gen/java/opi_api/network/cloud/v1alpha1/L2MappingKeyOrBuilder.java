// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mapping.proto

package opi_api.network.cloud.v1alpha1;

public interface L2MappingKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.L2MappingKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * subnet id of this MAC
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey subnet_id = 1;</code>
   * @return Whether the subnetId field is set.
   */
  boolean hasSubnetId();
  /**
   * <pre>
   * subnet id of this MAC
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey subnet_id = 1;</code>
   * @return The subnetId.
   */
  opi_api.common.v1.ObjectKey getSubnetId();
  /**
   * <pre>
   * subnet id of this MAC
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey subnet_id = 1;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getSubnetIdOrBuilder();

  /**
   * <pre>
   * MAC address of this mapping
   * </pre>
   *
   * <code>bytes mac_address = 2;</code>
   * @return The macAddress.
   */
  com.google.protobuf.ByteString getMacAddress();
}
