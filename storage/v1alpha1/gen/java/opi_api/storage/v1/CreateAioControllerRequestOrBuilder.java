// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_aio.proto

package opi_api.storage.v1;

public interface CreateAioControllerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.CreateAioControllerRequest)
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
   * <code>.opi_api.storage.v1.AioController aio_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the aioController field is set.
   */
  boolean hasAioController();
  /**
   * <code>.opi_api.storage.v1.AioController aio_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The aioController.
   */
  opi_api.storage.v1.AioController getAioController();
  /**
   * <code>.opi_api.storage.v1.AioController aio_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.storage.v1.AioControllerOrBuilder getAioControllerOrBuilder();

  /**
   * <code>string aio_controller_id = 3;</code>
   * @return The aioControllerId.
   */
  java.lang.String getAioControllerId();
  /**
   * <code>string aio_controller_id = 3;</code>
   * @return The bytes for aioControllerId.
   */
  com.google.protobuf.ByteString
      getAioControllerIdBytes();
}
