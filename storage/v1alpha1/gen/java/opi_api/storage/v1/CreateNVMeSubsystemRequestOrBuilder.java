// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface CreateNVMeSubsystemRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.CreateNVMeSubsystemRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <code>.opi_api.storage.v1.NVMeSubsystem nv_me_subsystem = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nvMeSubsystem field is set.
   */
  boolean hasNvMeSubsystem();
  /**
   * <code>.opi_api.storage.v1.NVMeSubsystem nv_me_subsystem = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nvMeSubsystem.
   */
  opi_api.storage.v1.NVMeSubsystem getNvMeSubsystem();
  /**
   * <code>.opi_api.storage.v1.NVMeSubsystem nv_me_subsystem = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.storage.v1.NVMeSubsystemOrBuilder getNvMeSubsystemOrBuilder();

  /**
   * <code>string nv_me_subsystem_id = 3;</code>
   * @return The nvMeSubsystemId.
   */
  java.lang.String getNvMeSubsystemId();
  /**
   * <code>string nv_me_subsystem_id = 3;</code>
   * @return The bytes for nvMeSubsystemId.
   */
  com.google.protobuf.ByteString
      getNvMeSubsystemIdBytes();
}
