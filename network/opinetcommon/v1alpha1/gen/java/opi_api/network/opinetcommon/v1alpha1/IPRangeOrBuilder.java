// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networktypes.proto

package opi_api.network.opinetcommon.v1alpha1;

public interface IPRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.opinetcommon.v1alpha1.IPRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * starting IP address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress low = 1;</code>
   * @return Whether the low field is set.
   */
  boolean hasLow();
  /**
   * <pre>
   * starting IP address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress low = 1;</code>
   * @return The low.
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddress getLow();
  /**
   * <pre>
   * starting IP address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress low = 1;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddressOrBuilder getLowOrBuilder();

  /**
   * <pre>
   * ending IP address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress high = 2;</code>
   * @return Whether the high field is set.
   */
  boolean hasHigh();
  /**
   * <pre>
   * ending IP address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress high = 2;</code>
   * @return The high.
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddress getHigh();
  /**
   * <pre>
   * ending IP address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress high = 2;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddressOrBuilder getHighOrBuilder();
}
