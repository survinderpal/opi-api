// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_blk.proto

package opi_api.storage.v1;

public interface UpdateVirtioBlkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.UpdateVirtioBlkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.storage.v1.VirtioBlk virtio_blk = 1;</code>
   * @return Whether the virtioBlk field is set.
   */
  boolean hasVirtioBlk();
  /**
   * <code>.opi_api.storage.v1.VirtioBlk virtio_blk = 1;</code>
   * @return The virtioBlk.
   */
  opi_api.storage.v1.VirtioBlk getVirtioBlk();
  /**
   * <code>.opi_api.storage.v1.VirtioBlk virtio_blk = 1;</code>
   */
  opi_api.storage.v1.VirtioBlkOrBuilder getVirtioBlkOrBuilder();

  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
