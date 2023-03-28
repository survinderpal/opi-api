// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

public final class BackendNvmeTcpProto {
  private BackendNvmeTcpProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteController_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteController_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_CreateNVMfRemoteControllerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_CreateNVMfRemoteControllerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_DeleteNVMfRemoteControllerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_DeleteNVMfRemoteControllerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_UpdateNVMfRemoteControllerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_UpdateNVMfRemoteControllerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListNVMfRemoteControllersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListNVMfRemoteControllersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListNVMfRemoteControllersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListNVMfRemoteControllersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_GetNVMfRemoteControllerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_GetNVMfRemoteControllerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerResetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerResetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026backend_nvme_tcp.proto\022\022opi_api.storag" +
      "e.v1\032\027google/api/client.proto\032\031google/ap" +
      "i/resource.proto\032\033google/protobuf/empty." +
      "proto\032\034google/api/annotations.proto\032\037goo" +
      "gle/api/field_behavior.proto\032 google/pro" +
      "tobuf/field_mask.proto\032\020object_key.proto" +
      "\032\017opicommon.proto\"\361\002\n\024NVMfRemoteControll" +
      "er\022(\n\002id\030\001 \001(\0132\034.opi_api.common.v1.Objec" +
      "tKey\0225\n\006trtype\030\002 \001(\0162%.opi_api.storage.v" +
      "1.NvmeTransportType\0225\n\006adrfam\030\003 \001(\0162%.op" +
      "i_api.storage.v1.NvmeAddressFamily\022\016\n\006tr" +
      "addr\030\004 \001(\t\022\017\n\007trsvcid\030\005 \001(\003\022\016\n\006subnqn\030\006 " +
      "\001(\t\022\r\n\005hdgst\030\007 \001(\010\022\r\n\005ddgst\030\010 \001(\010\0224\n\tmul" +
      "tipath\030\t \001(\0162!.opi_api.storage.v1.NvmeMu" +
      "ltipath\022\027\n\017io_queues_count\030\n \001(\003\022\022\n\nqueu" +
      "e_size\030\013 \001(\003\022\017\n\007hostnqn\030\014 \001(\t\"\330\001\n!Create" +
      "NVMfRemoteControllerRequest\022?\n\006parent\030\001 " +
      "\001(\tB/\340A\002\372A)\n\'opi_api.storage.v1/NVMfRemo" +
      "teController\022N\n\027nv_mf_remote_controller\030" +
      "\002 \001(\0132(.opi_api.storage.v1.NVMfRemoteCon" +
      "trollerB\003\340A\002\022\"\n\032nv_mf_remote_controller_" +
      "id\030\003 \001(\t\"y\n!DeleteNVMfRemoteControllerRe" +
      "quest\022=\n\004name\030\001 \001(\tB/\340A\002\372A)\n\'opi_api.sto" +
      "rage.v1/NVMfRemoteController\022\025\n\rallow_mi" +
      "ssing\030\002 \001(\010\"\237\001\n!UpdateNVMfRemoteControll" +
      "erRequest\022I\n\027nv_mf_remote_controller\030\001 \001" +
      "(\0132(.opi_api.storage.v1.NVMfRemoteContro" +
      "ller\022/\n\013update_mask\030\002 \001(\0132\032.google.proto" +
      "buf.FieldMask\"\212\001\n ListNVMfRemoteControll" +
      "ersRequest\022?\n\006parent\030\001 \001(\tB/\340A\002\372A)\n\'opi_" +
      "api.storage.v1/NVMfRemoteController\022\021\n\tp" +
      "age_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"\210\001\n!L" +
      "istNVMfRemoteControllersResponse\022J\n\030nv_m" +
      "f_remote_controllers\030\001 \003(\0132(.opi_api.sto" +
      "rage.v1.NVMfRemoteController\022\027\n\017next_pag" +
      "e_token\030\002 \001(\t\"_\n\036GetNVMfRemoteController" +
      "Request\022=\n\004name\030\001 \001(\tB/\340A\002\372A)\n\'opi_api.s" +
      "torage.v1/NVMfRemoteController\"L\n NVMfRe" +
      "moteControllerResetRequest\022(\n\002id\030\001 \001(\0132\034" +
      ".opi_api.common.v1.ObjectKey\"L\n NVMfRemo" +
      "teControllerStatsRequest\022(\n\002id\030\001 \001(\0132\034.o" +
      "pi_api.common.v1.ObjectKey\"S\n!NVMfRemote" +
      "ControllerStatsResponse\022.\n\005stats\030\001 \001(\0132\037" +
      ".opi_api.storage.v1.VolumeStats*\264\001\n\021Nvme" +
      "TransportType\022#\n\037NVME_TRANSPORT_TYPE_UNS" +
      "PECIFIED\020\000\022\025\n\021NVME_TRANSPORT_FC\020\001\022\027\n\023NVM" +
      "E_TRANSPORT_PCIE\020\002\022\027\n\023NVME_TRANSPORT_RDM" +
      "A\020\003\022\026\n\022NVME_TRANSPORT_TCP\020\004\022\031\n\025NVME_TRAN" +
      "SPORT_CUSTOM\020\005*\250\001\n\021NvmeAddressFamily\022#\n\037" +
      "NVME_ADDRESS_FAMILY_UNSPECIFIED\020\000\022\024\n\020NVM" +
      "F_ADRFAM_IPV4\020\001\022\024\n\020NVMF_ADRFAM_IPV6\020\002\022\022\n" +
      "\016NVMF_ADRFAM_IB\020\003\022\022\n\016NVMF_ADRFAM_FC\020\004\022\032\n" +
      "\026NVMF_ADRFAM_INTRA_HOST\020\005*\206\001\n\rNvmeMultip" +
      "ath\022\036\n\032NVME_MULTIPATH_UNSPECIFIED\020\000\022\032\n\026N" +
      "VME_MULTIPATH_DISABLE\020\001\022\033\n\027NVME_MULTIPAT" +
      "H_FAILOVER\020\002\022\034\n\030NVME_MULTIPATH_MULTIPATH" +
      "\020\0032\204\n\n\033NVMfRemoteControllerService\022\363\001\n\032C" +
      "reateNVMfRemoteController\0225.opi_api.stor" +
      "age.v1.CreateNVMfRemoteControllerRequest" +
      "\032(.opi_api.storage.v1.NVMfRemoteControll" +
      "er\"t\202\323\344\223\0022\"\027/v1/{parent=subsystems}:\027nv_" +
      "mf_remote_controller\332A9parent,nv_mf_remo" +
      "te_controller,nv_mf_remote_controller_id" +
      "\022\235\001\n\032DeleteNVMfRemoteController\0225.opi_ap" +
      "i.storage.v1.DeleteNVMfRemoteControllerR" +
      "equest\032\026.google.protobuf.Empty\"0\202\323\344\223\002#*!" +
      "/v1/{name=subsystems}/{subsystem}\332A\004name" +
      "\022\363\001\n\032UpdateNVMfRemoteController\0225.opi_ap" +
      "i.storage.v1.UpdateNVMfRemoteControllerR" +
      "equest\032(.opi_api.storage.v1.NVMfRemoteCo" +
      "ntroller\"t\202\323\344\223\002H2-/v1/{nv_mf_remote_cont" +
      "roller.name=subsystems}:\027nv_mf_remote_co" +
      "ntroller\332A#nv_mf_remote_controller,updat" +
      "e_mask\022\262\001\n\031ListNVMfRemoteControllers\0224.o" +
      "pi_api.storage.v1.ListNVMfRemoteControll" +
      "ersRequest\0325.opi_api.storage.v1.ListNVMf" +
      "RemoteControllersResponse\"(\202\323\344\223\002\031\022\027/v1/{" +
      "parent=subsystems}\332A\006parent\022\251\001\n\027GetNVMfR" +
      "emoteController\0222.opi_api.storage.v1.Get" +
      "NVMfRemoteControllerRequest\032(.opi_api.st" +
      "orage.v1.NVMfRemoteController\"0\202\323\344\223\002#\022!/" +
      "v1/{name=subsystems}/{subsystem}\332A\004name\022" +
      "k\n\031NVMfRemoteControllerReset\0224.opi_api.s" +
      "torage.v1.NVMfRemoteControllerResetReque" +
      "st\032\026.google.protobuf.Empty\"\000\022\212\001\n\031NVMfRem" +
      "oteControllerStats\0224.opi_api.storage.v1." +
      "NVMfRemoteControllerStatsRequest\0325.opi_a" +
      "pi.storage.v1.NVMfRemoteControllerStatsR" +
      "esponse\"\000Bb\n\022opi_api.storage.v1B\023Backend" +
      "NvmeTcpProtoP\001Z5github.com/opiproject/op" +
      "i-api/storage/v1alpha1/gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          opi_api.common.v1.ObjectKeyProto.getDescriptor(),
          opi_api.storage.v1.OpiCommonProto.getDescriptor(),
        });
    internal_static_opi_api_storage_v1_NVMfRemoteController_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_NVMfRemoteController_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteController_descriptor,
        new java.lang.String[] { "Id", "Trtype", "Adrfam", "Traddr", "Trsvcid", "Subnqn", "Hdgst", "Ddgst", "Multipath", "IoQueuesCount", "QueueSize", "Hostnqn", });
    internal_static_opi_api_storage_v1_CreateNVMfRemoteControllerRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_storage_v1_CreateNVMfRemoteControllerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_CreateNVMfRemoteControllerRequest_descriptor,
        new java.lang.String[] { "Parent", "NvMfRemoteController", "NvMfRemoteControllerId", });
    internal_static_opi_api_storage_v1_DeleteNVMfRemoteControllerRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_storage_v1_DeleteNVMfRemoteControllerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_DeleteNVMfRemoteControllerRequest_descriptor,
        new java.lang.String[] { "Name", "AllowMissing", });
    internal_static_opi_api_storage_v1_UpdateNVMfRemoteControllerRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_storage_v1_UpdateNVMfRemoteControllerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_UpdateNVMfRemoteControllerRequest_descriptor,
        new java.lang.String[] { "NvMfRemoteController", "UpdateMask", });
    internal_static_opi_api_storage_v1_ListNVMfRemoteControllersRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_storage_v1_ListNVMfRemoteControllersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListNVMfRemoteControllersRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_opi_api_storage_v1_ListNVMfRemoteControllersResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_storage_v1_ListNVMfRemoteControllersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListNVMfRemoteControllersResponse_descriptor,
        new java.lang.String[] { "NvMfRemoteControllers", "NextPageToken", });
    internal_static_opi_api_storage_v1_GetNVMfRemoteControllerRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_storage_v1_GetNVMfRemoteControllerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_GetNVMfRemoteControllerRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerResetRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerResetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerResetRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NVMfRemoteControllerStatsResponse_descriptor,
        new java.lang.String[] { "Stats", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ClientProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    opi_api.common.v1.ObjectKeyProto.getDescriptor();
    opi_api.storage.v1.OpiCommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
