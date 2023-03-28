# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [backend_aio.proto](#backend_aio-proto)
    - [AioController](#opi_api-storage-v1-AioController)
    - [AioControllerStatsRequest](#opi_api-storage-v1-AioControllerStatsRequest)
    - [AioControllerStatsResponse](#opi_api-storage-v1-AioControllerStatsResponse)
    - [CreateAioControllerRequest](#opi_api-storage-v1-CreateAioControllerRequest)
    - [DeleteAioControllerRequest](#opi_api-storage-v1-DeleteAioControllerRequest)
    - [GetAioControllerRequest](#opi_api-storage-v1-GetAioControllerRequest)
    - [ListAioControllersRequest](#opi_api-storage-v1-ListAioControllersRequest)
    - [ListAioControllersResponse](#opi_api-storage-v1-ListAioControllersResponse)
    - [UpdateAioControllerRequest](#opi_api-storage-v1-UpdateAioControllerRequest)
  
    - [AioControllerService](#opi_api-storage-v1-AioControllerService)
  
- [backend_iscsi.proto](#backend_iscsi-proto)
- [backend_null.proto](#backend_null-proto)
    - [CreateNullDebugRequest](#opi_api-storage-v1-CreateNullDebugRequest)
    - [DeleteNullDebugRequest](#opi_api-storage-v1-DeleteNullDebugRequest)
    - [GetNullDebugRequest](#opi_api-storage-v1-GetNullDebugRequest)
    - [ListNullDebugsRequest](#opi_api-storage-v1-ListNullDebugsRequest)
    - [ListNullDebugsResponse](#opi_api-storage-v1-ListNullDebugsResponse)
    - [NullDebug](#opi_api-storage-v1-NullDebug)
    - [NullDebugStatsRequest](#opi_api-storage-v1-NullDebugStatsRequest)
    - [NullDebugStatsResponse](#opi_api-storage-v1-NullDebugStatsResponse)
    - [UpdateNullDebugRequest](#opi_api-storage-v1-UpdateNullDebugRequest)
  
    - [NullDebugService](#opi_api-storage-v1-NullDebugService)
  
- [backend_nvme_pcie.proto](#backend_nvme_pcie-proto)
- [backend_nvme_tcp.proto](#backend_nvme_tcp-proto)
    - [CreateNVMfRemoteControllerRequest](#opi_api-storage-v1-CreateNVMfRemoteControllerRequest)
    - [DeleteNVMfRemoteControllerRequest](#opi_api-storage-v1-DeleteNVMfRemoteControllerRequest)
    - [GetNVMfRemoteControllerRequest](#opi_api-storage-v1-GetNVMfRemoteControllerRequest)
    - [ListNVMfRemoteControllersRequest](#opi_api-storage-v1-ListNVMfRemoteControllersRequest)
    - [ListNVMfRemoteControllersResponse](#opi_api-storage-v1-ListNVMfRemoteControllersResponse)
    - [NVMfRemoteController](#opi_api-storage-v1-NVMfRemoteController)
    - [NVMfRemoteControllerResetRequest](#opi_api-storage-v1-NVMfRemoteControllerResetRequest)
    - [NVMfRemoteControllerStatsRequest](#opi_api-storage-v1-NVMfRemoteControllerStatsRequest)
    - [NVMfRemoteControllerStatsResponse](#opi_api-storage-v1-NVMfRemoteControllerStatsResponse)
    - [UpdateNVMfRemoteControllerRequest](#opi_api-storage-v1-UpdateNVMfRemoteControllerRequest)
  
    - [NvmeAddressFamily](#opi_api-storage-v1-NvmeAddressFamily)
    - [NvmeMultipath](#opi_api-storage-v1-NvmeMultipath)
    - [NvmeTransportType](#opi_api-storage-v1-NvmeTransportType)
  
    - [NVMfRemoteControllerService](#opi_api-storage-v1-NVMfRemoteControllerService)
  
- [frontend_nvme_pcie.proto](#frontend_nvme_pcie-proto)
    - [CreateNVMeControllerRequest](#opi_api-storage-v1-CreateNVMeControllerRequest)
    - [CreateNVMeNamespaceRequest](#opi_api-storage-v1-CreateNVMeNamespaceRequest)
    - [CreateNVMeSubsystemRequest](#opi_api-storage-v1-CreateNVMeSubsystemRequest)
    - [DeleteNVMeControllerRequest](#opi_api-storage-v1-DeleteNVMeControllerRequest)
    - [DeleteNVMeNamespaceRequest](#opi_api-storage-v1-DeleteNVMeNamespaceRequest)
    - [DeleteNVMeSubsystemRequest](#opi_api-storage-v1-DeleteNVMeSubsystemRequest)
    - [GetNVMeControllerRequest](#opi_api-storage-v1-GetNVMeControllerRequest)
    - [GetNVMeNamespaceRequest](#opi_api-storage-v1-GetNVMeNamespaceRequest)
    - [GetNVMeSubsystemRequest](#opi_api-storage-v1-GetNVMeSubsystemRequest)
    - [ListNVMeControllersRequest](#opi_api-storage-v1-ListNVMeControllersRequest)
    - [ListNVMeControllersResponse](#opi_api-storage-v1-ListNVMeControllersResponse)
    - [ListNVMeNamespacesRequest](#opi_api-storage-v1-ListNVMeNamespacesRequest)
    - [ListNVMeNamespacesResponse](#opi_api-storage-v1-ListNVMeNamespacesResponse)
    - [ListNVMeSubsystemsRequest](#opi_api-storage-v1-ListNVMeSubsystemsRequest)
    - [ListNVMeSubsystemsResponse](#opi_api-storage-v1-ListNVMeSubsystemsResponse)
    - [NVMeController](#opi_api-storage-v1-NVMeController)
    - [NVMeControllerSpec](#opi_api-storage-v1-NVMeControllerSpec)
    - [NVMeControllerStatsRequest](#opi_api-storage-v1-NVMeControllerStatsRequest)
    - [NVMeControllerStatsResponse](#opi_api-storage-v1-NVMeControllerStatsResponse)
    - [NVMeControllerStatus](#opi_api-storage-v1-NVMeControllerStatus)
    - [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace)
    - [NVMeNamespaceSpec](#opi_api-storage-v1-NVMeNamespaceSpec)
    - [NVMeNamespaceStatsRequest](#opi_api-storage-v1-NVMeNamespaceStatsRequest)
    - [NVMeNamespaceStatsResponse](#opi_api-storage-v1-NVMeNamespaceStatsResponse)
    - [NVMeNamespaceStatus](#opi_api-storage-v1-NVMeNamespaceStatus)
    - [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem)
    - [NVMeSubsystemSpec](#opi_api-storage-v1-NVMeSubsystemSpec)
    - [NVMeSubsystemStatsRequest](#opi_api-storage-v1-NVMeSubsystemStatsRequest)
    - [NVMeSubsystemStatsResponse](#opi_api-storage-v1-NVMeSubsystemStatsResponse)
    - [NVMeSubsystemStatus](#opi_api-storage-v1-NVMeSubsystemStatus)
    - [UpdateNVMeControllerRequest](#opi_api-storage-v1-UpdateNVMeControllerRequest)
    - [UpdateNVMeNamespaceRequest](#opi_api-storage-v1-UpdateNVMeNamespaceRequest)
    - [UpdateNVMeSubsystemRequest](#opi_api-storage-v1-UpdateNVMeSubsystemRequest)
  
    - [NVMeNamespacePciOperState](#opi_api-storage-v1-NVMeNamespacePciOperState)
    - [NVMeNamespacePciState](#opi_api-storage-v1-NVMeNamespacePciState)
  
    - [FrontendNvmeService](#opi_api-storage-v1-FrontendNvmeService)
  
- [frontend_virtio_blk.proto](#frontend_virtio_blk-proto)
    - [CreateVirtioBlkRequest](#opi_api-storage-v1-CreateVirtioBlkRequest)
    - [DeleteVirtioBlkRequest](#opi_api-storage-v1-DeleteVirtioBlkRequest)
    - [GetVirtioBlkRequest](#opi_api-storage-v1-GetVirtioBlkRequest)
    - [ListVirtioBlksRequest](#opi_api-storage-v1-ListVirtioBlksRequest)
    - [ListVirtioBlksResponse](#opi_api-storage-v1-ListVirtioBlksResponse)
    - [UpdateVirtioBlkRequest](#opi_api-storage-v1-UpdateVirtioBlkRequest)
    - [VirtioBlk](#opi_api-storage-v1-VirtioBlk)
    - [VirtioBlkStatsRequest](#opi_api-storage-v1-VirtioBlkStatsRequest)
    - [VirtioBlkStatsResponse](#opi_api-storage-v1-VirtioBlkStatsResponse)
  
    - [FrontendVirtioBlkService](#opi_api-storage-v1-FrontendVirtioBlkService)
  
- [frontend_virtio_fs.proto](#frontend_virtio_fs-proto)
- [frontend_virtio_scsi.proto](#frontend_virtio_scsi-proto)
    - [CreateVirtioScsiControllerRequest](#opi_api-storage-v1-CreateVirtioScsiControllerRequest)
    - [CreateVirtioScsiLunRequest](#opi_api-storage-v1-CreateVirtioScsiLunRequest)
    - [CreateVirtioScsiTargetRequest](#opi_api-storage-v1-CreateVirtioScsiTargetRequest)
    - [DeleteVirtioScsiControllerRequest](#opi_api-storage-v1-DeleteVirtioScsiControllerRequest)
    - [DeleteVirtioScsiLunRequest](#opi_api-storage-v1-DeleteVirtioScsiLunRequest)
    - [DeleteVirtioScsiTargetRequest](#opi_api-storage-v1-DeleteVirtioScsiTargetRequest)
    - [GetVirtioScsiControllerRequest](#opi_api-storage-v1-GetVirtioScsiControllerRequest)
    - [GetVirtioScsiLunRequest](#opi_api-storage-v1-GetVirtioScsiLunRequest)
    - [GetVirtioScsiTargetRequest](#opi_api-storage-v1-GetVirtioScsiTargetRequest)
    - [ListVirtioScsiControllersRequest](#opi_api-storage-v1-ListVirtioScsiControllersRequest)
    - [ListVirtioScsiControllersResponse](#opi_api-storage-v1-ListVirtioScsiControllersResponse)
    - [ListVirtioScsiLunsRequest](#opi_api-storage-v1-ListVirtioScsiLunsRequest)
    - [ListVirtioScsiLunsResponse](#opi_api-storage-v1-ListVirtioScsiLunsResponse)
    - [ListVirtioScsiTargetsRequest](#opi_api-storage-v1-ListVirtioScsiTargetsRequest)
    - [ListVirtioScsiTargetsResponse](#opi_api-storage-v1-ListVirtioScsiTargetsResponse)
    - [UpdateVirtioScsiControllerRequest](#opi_api-storage-v1-UpdateVirtioScsiControllerRequest)
    - [UpdateVirtioScsiLunRequest](#opi_api-storage-v1-UpdateVirtioScsiLunRequest)
    - [UpdateVirtioScsiTargetRequest](#opi_api-storage-v1-UpdateVirtioScsiTargetRequest)
    - [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController)
    - [VirtioScsiControllerStatsRequest](#opi_api-storage-v1-VirtioScsiControllerStatsRequest)
    - [VirtioScsiControllerStatsResponse](#opi_api-storage-v1-VirtioScsiControllerStatsResponse)
    - [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun)
    - [VirtioScsiLunStatsRequest](#opi_api-storage-v1-VirtioScsiLunStatsRequest)
    - [VirtioScsiLunStatsResponse](#opi_api-storage-v1-VirtioScsiLunStatsResponse)
    - [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget)
    - [VirtioScsiTargetStatsRequest](#opi_api-storage-v1-VirtioScsiTargetStatsRequest)
    - [VirtioScsiTargetStatsResponse](#opi_api-storage-v1-VirtioScsiTargetStatsResponse)
  
    - [FrontendVirtioScsiService](#opi_api-storage-v1-FrontendVirtioScsiService)
  
- [middleend.proto](#middleend-proto)
    - [CreateEncryptedVolumeRequest](#opi_api-storage-v1-CreateEncryptedVolumeRequest)
    - [DeleteEncryptedVolumeRequest](#opi_api-storage-v1-DeleteEncryptedVolumeRequest)
    - [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume)
    - [EncryptedVolumeStatsRequest](#opi_api-storage-v1-EncryptedVolumeStatsRequest)
    - [EncryptedVolumeStatsResponse](#opi_api-storage-v1-EncryptedVolumeStatsResponse)
    - [GetEncryptedVolumeRequest](#opi_api-storage-v1-GetEncryptedVolumeRequest)
    - [ListEncryptedVolumesRequest](#opi_api-storage-v1-ListEncryptedVolumesRequest)
    - [ListEncryptedVolumesResponse](#opi_api-storage-v1-ListEncryptedVolumesResponse)
    - [UpdateEncryptedVolumeRequest](#opi_api-storage-v1-UpdateEncryptedVolumeRequest)
  
    - [MiddleendService](#opi_api-storage-v1-MiddleendService)
  
- [opicommon.proto](#opicommon-proto)
    - [PciEndpoint](#opi_api-storage-v1-PciEndpoint)
    - [VolumeStats](#opi_api-storage-v1-VolumeStats)
  
    - [EncryptionType](#opi_api-storage-v1-EncryptionType)
  
- [inventory.proto](#inventory-proto)
    - [BIOSInfo](#opi_api-inventory-v1-BIOSInfo)
    - [BaseboardInfo](#opi_api-inventory-v1-BaseboardInfo)
    - [CPUInfo](#opi_api-inventory-v1-CPUInfo)
    - [ChassisInfo](#opi_api-inventory-v1-ChassisInfo)
    - [InventoryGetRequest](#opi_api-inventory-v1-InventoryGetRequest)
    - [InventoryGetResponse](#opi_api-inventory-v1-InventoryGetResponse)
    - [MemoryInfo](#opi_api-inventory-v1-MemoryInfo)
    - [PCIeDeviceInfo](#opi_api-inventory-v1-PCIeDeviceInfo)
    - [SystemInfo](#opi_api-inventory-v1-SystemInfo)
  
    - [InventorySvc](#opi_api-inventory-v1-InventorySvc)
  
- [object_key.proto](#object_key-proto)
    - [ObjectKey](#opi_api-common-v1-ObjectKey)
  
- [uuid.proto](#uuid-proto)
    - [Uuid](#opi_api-common-v1-Uuid)
  
- [Scalar Value Types](#scalar-value-types)



<a name="backend_aio-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_aio.proto



<a name="opi_api-storage-v1-AioController"></a>

### AioController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | handle is an opaque object handle that is not user settable. handle will be returned with created object |
| block_size | [int64](#int64) |  |  |
| blocks_count | [int64](#int64) |  |  |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  |  |
| filename | [string](#string) |  |  |






<a name="opi_api-storage-v1-AioControllerStatsRequest"></a>

### AioControllerStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-AioControllerStatsResponse"></a>

### AioControllerStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-CreateAioControllerRequest"></a>

### CreateAioControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| aio_controller | [AioController](#opi_api-storage-v1-AioController) |  |  |
| aio_controller_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-DeleteAioControllerRequest"></a>

### DeleteAioControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetAioControllerRequest"></a>

### GetAioControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListAioControllersRequest"></a>

### ListAioControllersRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListAioControllersResponse"></a>

### ListAioControllersResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| aio_controllers | [AioController](#opi_api-storage-v1-AioController) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-UpdateAioControllerRequest"></a>

### UpdateAioControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| aio_controller | [AioController](#opi_api-storage-v1-AioController) |  |  |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |





 

 

 


<a name="opi_api-storage-v1-AioControllerService"></a>

### AioControllerService
Back End (network-facing) APIs. This service is for AIO generic kernel block device.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateAioController | [CreateAioControllerRequest](#opi_api-storage-v1-CreateAioControllerRequest) | [AioController](#opi_api-storage-v1-AioController) |  |
| DeleteAioController | [DeleteAioControllerRequest](#opi_api-storage-v1-DeleteAioControllerRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateAioController | [UpdateAioControllerRequest](#opi_api-storage-v1-UpdateAioControllerRequest) | [AioController](#opi_api-storage-v1-AioController) |  |
| ListAioControllers | [ListAioControllersRequest](#opi_api-storage-v1-ListAioControllersRequest) | [ListAioControllersResponse](#opi_api-storage-v1-ListAioControllersResponse) |  |
| GetAioController | [GetAioControllerRequest](#opi_api-storage-v1-GetAioControllerRequest) | [AioController](#opi_api-storage-v1-AioController) |  |
| AioControllerStats | [AioControllerStatsRequest](#opi_api-storage-v1-AioControllerStatsRequest) | [AioControllerStatsResponse](#opi_api-storage-v1-AioControllerStatsResponse) |  |

 



<a name="backend_iscsi-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_iscsi.proto


 

 

 

 



<a name="backend_null-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_null.proto



<a name="opi_api-storage-v1-CreateNullDebugRequest"></a>

### CreateNullDebugRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| null_debug | [NullDebug](#opi_api-storage-v1-NullDebug) |  |  |
| null_debug_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-DeleteNullDebugRequest"></a>

### DeleteNullDebugRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetNullDebugRequest"></a>

### GetNullDebugRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNullDebugsRequest"></a>

### ListNullDebugsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNullDebugsResponse"></a>

### ListNullDebugsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| null_debugs | [NullDebug](#opi_api-storage-v1-NullDebug) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-NullDebug"></a>

### NullDebug



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| block_size | [int64](#int64) |  |  |
| blocks_count | [int64](#int64) |  |  |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  |  |






<a name="opi_api-storage-v1-NullDebugStatsRequest"></a>

### NullDebugStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-NullDebugStatsResponse"></a>

### NullDebugStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-UpdateNullDebugRequest"></a>

### UpdateNullDebugRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| null_debug | [NullDebug](#opi_api-storage-v1-NullDebug) |  |  |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |





 

 

 


<a name="opi_api-storage-v1-NullDebugService"></a>

### NullDebugService
Back End (network-facing) APIs. This is debug interface for null block devices.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateNullDebug | [CreateNullDebugRequest](#opi_api-storage-v1-CreateNullDebugRequest) | [NullDebug](#opi_api-storage-v1-NullDebug) |  |
| DeleteNullDebug | [DeleteNullDebugRequest](#opi_api-storage-v1-DeleteNullDebugRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateNullDebug | [UpdateNullDebugRequest](#opi_api-storage-v1-UpdateNullDebugRequest) | [NullDebug](#opi_api-storage-v1-NullDebug) |  |
| ListNullDebugs | [ListNullDebugsRequest](#opi_api-storage-v1-ListNullDebugsRequest) | [ListNullDebugsResponse](#opi_api-storage-v1-ListNullDebugsResponse) |  |
| GetNullDebug | [GetNullDebugRequest](#opi_api-storage-v1-GetNullDebugRequest) | [NullDebug](#opi_api-storage-v1-NullDebug) |  |
| NullDebugStats | [NullDebugStatsRequest](#opi_api-storage-v1-NullDebugStatsRequest) | [NullDebugStatsResponse](#opi_api-storage-v1-NullDebugStatsResponse) |  |

 



<a name="backend_nvme_pcie-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_nvme_pcie.proto


 

 

 

 



<a name="backend_nvme_tcp-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_nvme_tcp.proto



<a name="opi_api-storage-v1-CreateNVMfRemoteControllerRequest"></a>

### CreateNVMfRemoteControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| nv_mf_remote_controller | [NVMfRemoteController](#opi_api-storage-v1-NVMfRemoteController) |  |  |
| nv_mf_remote_controller_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-DeleteNVMfRemoteControllerRequest"></a>

### DeleteNVMfRemoteControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | object&#39;s unique identifier |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetNVMfRemoteControllerRequest"></a>

### GetNVMfRemoteControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | object&#39;s unique identifier |






<a name="opi_api-storage-v1-ListNVMfRemoteControllersRequest"></a>

### ListNVMfRemoteControllersRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNVMfRemoteControllersResponse"></a>

### ListNVMfRemoteControllersResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nv_mf_remote_controllers | [NVMfRemoteController](#opi_api-storage-v1-NVMfRemoteController) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMfRemoteController"></a>

### NVMfRemoteController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | object&#39;s unique identifier |
| trtype | [NvmeTransportType](#opi_api-storage-v1-NvmeTransportType) |  |  |
| adrfam | [NvmeAddressFamily](#opi_api-storage-v1-NvmeAddressFamily) |  |  |
| traddr | [string](#string) |  |  |
| trsvcid | [int64](#int64) |  |  |
| subnqn | [string](#string) |  |  |
| hdgst | [bool](#bool) |  |  |
| ddgst | [bool](#bool) |  |  |
| multipath | [NvmeMultipath](#opi_api-storage-v1-NvmeMultipath) |  |  |
| io_queues_count | [int64](#int64) |  |  |
| queue_size | [int64](#int64) |  |  |
| hostnqn | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMfRemoteControllerResetRequest"></a>

### NVMfRemoteControllerResetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | object&#39;s unique identifier |






<a name="opi_api-storage-v1-NVMfRemoteControllerStatsRequest"></a>

### NVMfRemoteControllerStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | object&#39;s unique identifier |






<a name="opi_api-storage-v1-NVMfRemoteControllerStatsResponse"></a>

### NVMfRemoteControllerStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-UpdateNVMfRemoteControllerRequest"></a>

### UpdateNVMfRemoteControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nv_mf_remote_controller | [NVMfRemoteController](#opi_api-storage-v1-NVMfRemoteController) |  |  |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |





 


<a name="opi_api-storage-v1-NvmeAddressFamily"></a>

### NvmeAddressFamily


| Name | Number | Description |
| ---- | ------ | ----------- |
| NVME_ADDRESS_FAMILY_UNSPECIFIED | 0 |  |
| NVMF_ADRFAM_IPV4 | 1 |  |
| NVMF_ADRFAM_IPV6 | 2 |  |
| NVMF_ADRFAM_IB | 3 |  |
| NVMF_ADRFAM_FC | 4 |  |
| NVMF_ADRFAM_INTRA_HOST | 5 |  |



<a name="opi_api-storage-v1-NvmeMultipath"></a>

### NvmeMultipath


| Name | Number | Description |
| ---- | ------ | ----------- |
| NVME_MULTIPATH_UNSPECIFIED | 0 |  |
| NVME_MULTIPATH_DISABLE | 1 |  |
| NVME_MULTIPATH_FAILOVER | 2 |  |
| NVME_MULTIPATH_MULTIPATH | 3 |  |



<a name="opi_api-storage-v1-NvmeTransportType"></a>

### NvmeTransportType


| Name | Number | Description |
| ---- | ------ | ----------- |
| NVME_TRANSPORT_TYPE_UNSPECIFIED | 0 |  |
| NVME_TRANSPORT_FC | 1 |  |
| NVME_TRANSPORT_PCIE | 2 |  |
| NVME_TRANSPORT_RDMA | 3 |  |
| NVME_TRANSPORT_TCP | 4 |  |
| NVME_TRANSPORT_CUSTOM | 5 |  |


 

 


<a name="opi_api-storage-v1-NVMfRemoteControllerService"></a>

### NVMfRemoteControllerService
Back End (network-facing) APIs. NVMe/TCP and NVMe/RoCEv2 protocols are covered by this service.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateNVMfRemoteController | [CreateNVMfRemoteControllerRequest](#opi_api-storage-v1-CreateNVMfRemoteControllerRequest) | [NVMfRemoteController](#opi_api-storage-v1-NVMfRemoteController) |  |
| DeleteNVMfRemoteController | [DeleteNVMfRemoteControllerRequest](#opi_api-storage-v1-DeleteNVMfRemoteControllerRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateNVMfRemoteController | [UpdateNVMfRemoteControllerRequest](#opi_api-storage-v1-UpdateNVMfRemoteControllerRequest) | [NVMfRemoteController](#opi_api-storage-v1-NVMfRemoteController) |  |
| ListNVMfRemoteControllers | [ListNVMfRemoteControllersRequest](#opi_api-storage-v1-ListNVMfRemoteControllersRequest) | [ListNVMfRemoteControllersResponse](#opi_api-storage-v1-ListNVMfRemoteControllersResponse) |  |
| GetNVMfRemoteController | [GetNVMfRemoteControllerRequest](#opi_api-storage-v1-GetNVMfRemoteControllerRequest) | [NVMfRemoteController](#opi_api-storage-v1-NVMfRemoteController) |  |
| NVMfRemoteControllerReset | [NVMfRemoteControllerResetRequest](#opi_api-storage-v1-NVMfRemoteControllerResetRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| NVMfRemoteControllerStats | [NVMfRemoteControllerStatsRequest](#opi_api-storage-v1-NVMfRemoteControllerStatsRequest) | [NVMfRemoteControllerStatsResponse](#opi_api-storage-v1-NVMfRemoteControllerStatsResponse) |  |

 



<a name="frontend_nvme_pcie-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_nvme_pcie.proto



<a name="opi_api-storage-v1-CreateNVMeControllerRequest"></a>

### CreateNVMeControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| nv_me_controller | [NVMeController](#opi_api-storage-v1-NVMeController) |  |  |
| nv_me_controller_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-CreateNVMeNamespaceRequest"></a>

### CreateNVMeNamespaceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| nv_me_namespace | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) |  |  |
| nv_me_namespace_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-CreateNVMeSubsystemRequest"></a>

### CreateNVMeSubsystemRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| nv_me_subsystem | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) |  |  |
| nv_me_subsystem_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-DeleteNVMeControllerRequest"></a>

### DeleteNVMeControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-DeleteNVMeNamespaceRequest"></a>

### DeleteNVMeNamespaceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-DeleteNVMeSubsystemRequest"></a>

### DeleteNVMeSubsystemRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetNVMeControllerRequest"></a>

### GetNVMeControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-GetNVMeNamespaceRequest"></a>

### GetNVMeNamespaceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-GetNVMeSubsystemRequest"></a>

### GetNVMeSubsystemRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNVMeControllersRequest"></a>

### ListNVMeControllersRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNVMeControllersResponse"></a>

### ListNVMeControllersResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nv_me_controllers | [NVMeController](#opi_api-storage-v1-NVMeController) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNVMeNamespacesRequest"></a>

### ListNVMeNamespacesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNVMeNamespacesResponse"></a>

### ListNVMeNamespacesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nv_me_namespaces | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNVMeSubsystemsRequest"></a>

### ListNVMeSubsystemsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNVMeSubsystemsResponse"></a>

### ListNVMeSubsystemsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nv_me_subsystems | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMeController"></a>

### NVMeController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [NVMeControllerSpec](#opi_api-storage-v1-NVMeControllerSpec) |  |  |
| status | [NVMeControllerStatus](#opi_api-storage-v1-NVMeControllerStatus) |  |  |






<a name="opi_api-storage-v1-NVMeControllerSpec"></a>

### NVMeControllerSpec



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | object&#39;s unique identifier |
| nvme_controller_id | [int32](#int32) |  | subsystem controller id range: 0 to 65535. must not be reused under the same subsystem |
| subsystem_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | subsystem information |
| pcie_id | [PciEndpoint](#opi_api-storage-v1-PciEndpoint) |  | xPU&#39;s PCI ID for the controller |
| max_nsq | [int32](#int32) |  | maximum number of host submission queues allowed. If not set, the xPU will provide a default. |
| max_ncq | [int32](#int32) |  | maximum number of host completion queues allowed. If not set, the xPU will provide a default. |
| sqes | [int32](#int32) |  | maximum number of submission queue entries per submission queue, as a power of 2. default value as per spec is 6 |
| cqes | [int32](#int32) |  | maximum number of completion queue entries per completion queue, as a power of 2. default value as per spec is 4 |
| max_namespaces | [int32](#int32) |  | maximum Number of namespaces that will be provisioned under the controller. |






<a name="opi_api-storage-v1-NVMeControllerStatsRequest"></a>

### NVMeControllerStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-NVMeControllerStatsResponse"></a>

### NVMeControllerStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-NVMeControllerStatus"></a>

### NVMeControllerStatus



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| active | [bool](#bool) |  | Device is in use by host nvme driver |






<a name="opi_api-storage-v1-NVMeNamespace"></a>

### NVMeNamespace



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [NVMeNamespaceSpec](#opi_api-storage-v1-NVMeNamespaceSpec) |  |  |
| status | [NVMeNamespaceStatus](#opi_api-storage-v1-NVMeNamespaceStatus) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceSpec"></a>

### NVMeNamespaceSpec



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | namespace&#39;s unique key |
| subsystem_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | subsystem for this namespace |
| host_nsid | [int32](#int32) |  | NSID present to the host by the NVMe PCIe controller. If not provided, then the controller will assign an unused NSID within the max namespace range - auto assigned nsid may not work for live migration |
| nguid | [string](#string) |  | Globally unique identifier for the namespace |
| eui64 | [int64](#int64) |  | 64bit Extended unique identifier for the namespace mandatory if guid is not specified |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  | Globally unique identifier for the namespace |
| volume_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | The back/middle-end volume to back this namespace. |






<a name="opi_api-storage-v1-NVMeNamespaceStatsRequest"></a>

### NVMeNamespaceStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceStatsResponse"></a>

### NVMeNamespaceStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceStatus"></a>

### NVMeNamespaceStatus



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pci_state | [NVMeNamespacePciState](#opi_api-storage-v1-NVMeNamespacePciState) |  | config state of the namespace object, (enabled, disable, deleting) |
| pci_oper_state | [NVMeNamespacePciOperState](#opi_api-storage-v1-NVMeNamespacePciOperState) |  | Operational state of the namespace object, (connected, disconnected) |






<a name="opi_api-storage-v1-NVMeSubsystem"></a>

### NVMeSubsystem



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [NVMeSubsystemSpec](#opi_api-storage-v1-NVMeSubsystemSpec) |  |  |
| status | [NVMeSubsystemStatus](#opi_api-storage-v1-NVMeSubsystemStatus) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemSpec"></a>

### NVMeSubsystemSpec



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | object&#39;s unique identifier |
| nqn | [string](#string) |  | NVMe subsystem NQN to which the controller belongs Refer to the NQN format in the NVMe base specifications, must not exceed &#39;NSV_NVME_SUBSYSTEM_NQN_LEN&#39; bytes |
| serial_number | [string](#string) |  | serial number must not exceed &#39;NSV_CTRLR_SERIAL_NO_LEN&#39; bytes |
| model_number | [string](#string) |  | model number, must not exceed &#39;NSV_CTRLR_MODEL_NO_LEN&#39; bytes |
| max_namespaces | [int64](#int64) |  | maximum namespaces within a subsystem |






<a name="opi_api-storage-v1-NVMeSubsystemStatsRequest"></a>

### NVMeSubsystemStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemStatsResponse"></a>

### NVMeSubsystemStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemStatus"></a>

### NVMeSubsystemStatus



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| firmware_revision | [string](#string) |  | firmware revision, must not exceed &#39;NSV_CTRLR_FW_REV_LEN&#39; |
| fru_guid | [bytes](#bytes) |  | FRU identfier, 16bytes opaque identity for the type of unit |






<a name="opi_api-storage-v1-UpdateNVMeControllerRequest"></a>

### UpdateNVMeControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nv_me_controller | [NVMeController](#opi_api-storage-v1-NVMeController) |  |  |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |






<a name="opi_api-storage-v1-UpdateNVMeNamespaceRequest"></a>

### UpdateNVMeNamespaceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nv_me_namespace | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) |  |  |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |






<a name="opi_api-storage-v1-UpdateNVMeSubsystemRequest"></a>

### UpdateNVMeSubsystemRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nv_me_subsystem | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) |  |  |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |





 


<a name="opi_api-storage-v1-NVMeNamespacePciOperState"></a>

### NVMeNamespacePciOperState
Namespace PCIe operational states

| Name | Number | Description |
| ---- | ------ | ----------- |
| NV_ME_NAMESPACE_PCI_OPER_STATE_UNSPECIFIED | 0 | unspecified |
| NVME_NAMESPACE_PCI_OPER_STATE_ONLINE | 1 | namespace is online and operational |
| NVME_NAMESPACE_PCI_OPER_STATE_OFFLINE | 2 | namespace is offline |



<a name="opi_api-storage-v1-NVMeNamespacePciState"></a>

### NVMeNamespacePciState
Namespace  Administrative States

| Name | Number | Description |
| ---- | ------ | ----------- |
| NV_ME_NAMESPACE_PCI_STATE_UNSPECIFIED | 0 | unspecified |
| NVME_NAMESPACE_PCI_STATE_DISABLED | 1 | namespace disabled state |
| NVME_NAMESPACE_PCI_STATE_ENABLED | 2 | namespace enabled state |
| NVME_NAMESPACE_PCI_STATE_DELETING | 3 | namespace being deleted |


 

 


<a name="opi_api-storage-v1-FrontendNvmeService"></a>

### FrontendNvmeService
Front End (host-facing) APIs. Mostly used for NVMe/PCIe emulation and host presentation.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateNVMeSubsystem | [CreateNVMeSubsystemRequest](#opi_api-storage-v1-CreateNVMeSubsystemRequest) | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) |  |
| DeleteNVMeSubsystem | [DeleteNVMeSubsystemRequest](#opi_api-storage-v1-DeleteNVMeSubsystemRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateNVMeSubsystem | [UpdateNVMeSubsystemRequest](#opi_api-storage-v1-UpdateNVMeSubsystemRequest) | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) |  |
| ListNVMeSubsystems | [ListNVMeSubsystemsRequest](#opi_api-storage-v1-ListNVMeSubsystemsRequest) | [ListNVMeSubsystemsResponse](#opi_api-storage-v1-ListNVMeSubsystemsResponse) |  |
| GetNVMeSubsystem | [GetNVMeSubsystemRequest](#opi_api-storage-v1-GetNVMeSubsystemRequest) | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) |  |
| NVMeSubsystemStats | [NVMeSubsystemStatsRequest](#opi_api-storage-v1-NVMeSubsystemStatsRequest) | [NVMeSubsystemStatsResponse](#opi_api-storage-v1-NVMeSubsystemStatsResponse) |  |
| CreateNVMeController | [CreateNVMeControllerRequest](#opi_api-storage-v1-CreateNVMeControllerRequest) | [NVMeController](#opi_api-storage-v1-NVMeController) |  |
| DeleteNVMeController | [DeleteNVMeControllerRequest](#opi_api-storage-v1-DeleteNVMeControllerRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateNVMeController | [UpdateNVMeControllerRequest](#opi_api-storage-v1-UpdateNVMeControllerRequest) | [NVMeController](#opi_api-storage-v1-NVMeController) |  |
| ListNVMeControllers | [ListNVMeControllersRequest](#opi_api-storage-v1-ListNVMeControllersRequest) | [ListNVMeControllersResponse](#opi_api-storage-v1-ListNVMeControllersResponse) |  |
| GetNVMeController | [GetNVMeControllerRequest](#opi_api-storage-v1-GetNVMeControllerRequest) | [NVMeController](#opi_api-storage-v1-NVMeController) |  |
| NVMeControllerStats | [NVMeControllerStatsRequest](#opi_api-storage-v1-NVMeControllerStatsRequest) | [NVMeControllerStatsResponse](#opi_api-storage-v1-NVMeControllerStatsResponse) |  |
| CreateNVMeNamespace | [CreateNVMeNamespaceRequest](#opi_api-storage-v1-CreateNVMeNamespaceRequest) | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) |  |
| DeleteNVMeNamespace | [DeleteNVMeNamespaceRequest](#opi_api-storage-v1-DeleteNVMeNamespaceRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateNVMeNamespace | [UpdateNVMeNamespaceRequest](#opi_api-storage-v1-UpdateNVMeNamespaceRequest) | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) |  |
| ListNVMeNamespaces | [ListNVMeNamespacesRequest](#opi_api-storage-v1-ListNVMeNamespacesRequest) | [ListNVMeNamespacesResponse](#opi_api-storage-v1-ListNVMeNamespacesResponse) |  |
| GetNVMeNamespace | [GetNVMeNamespaceRequest](#opi_api-storage-v1-GetNVMeNamespaceRequest) | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) |  |
| NVMeNamespaceStats | [NVMeNamespaceStatsRequest](#opi_api-storage-v1-NVMeNamespaceStatsRequest) | [NVMeNamespaceStatsResponse](#opi_api-storage-v1-NVMeNamespaceStatsResponse) |  |

 



<a name="frontend_virtio_blk-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_virtio_blk.proto



<a name="opi_api-storage-v1-CreateVirtioBlkRequest"></a>

### CreateVirtioBlkRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| virtio_blk | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  |  |
| virtio_blk_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-DeleteVirtioBlkRequest"></a>

### DeleteVirtioBlkRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetVirtioBlkRequest"></a>

### GetVirtioBlkRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioBlksRequest"></a>

### ListVirtioBlksRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioBlksResponse"></a>

### ListVirtioBlksResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_blks | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-UpdateVirtioBlkRequest"></a>

### UpdateVirtioBlkRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_blk | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  |  |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |






<a name="opi_api-storage-v1-VirtioBlk"></a>

### VirtioBlk



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| pcie_id | [PciEndpoint](#opi_api-storage-v1-PciEndpoint) |  | The PCI endpoint where this device should appear |
| volume_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | The back/middle-end volume to back this controller |
| max_io_qps | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioBlkStatsRequest"></a>

### VirtioBlkStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-VirtioBlkStatsResponse"></a>

### VirtioBlkStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |





 

 

 


<a name="opi_api-storage-v1-FrontendVirtioBlkService"></a>

### FrontendVirtioBlkService
Front End (host-facing) APIs. Mostly used for Virtio-blk emulation emulation and host presentation as alternative to Nvme.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateVirtioBlk | [CreateVirtioBlkRequest](#opi_api-storage-v1-CreateVirtioBlkRequest) | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  |
| DeleteVirtioBlk | [DeleteVirtioBlkRequest](#opi_api-storage-v1-DeleteVirtioBlkRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateVirtioBlk | [UpdateVirtioBlkRequest](#opi_api-storage-v1-UpdateVirtioBlkRequest) | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  |
| ListVirtioBlks | [ListVirtioBlksRequest](#opi_api-storage-v1-ListVirtioBlksRequest) | [ListVirtioBlksResponse](#opi_api-storage-v1-ListVirtioBlksResponse) |  |
| GetVirtioBlk | [GetVirtioBlkRequest](#opi_api-storage-v1-GetVirtioBlkRequest) | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  |
| VirtioBlkStats | [VirtioBlkStatsRequest](#opi_api-storage-v1-VirtioBlkStatsRequest) | [VirtioBlkStatsResponse](#opi_api-storage-v1-VirtioBlkStatsResponse) |  |

 



<a name="frontend_virtio_fs-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_virtio_fs.proto


 

 

 

 



<a name="frontend_virtio_scsi-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_virtio_scsi.proto



<a name="opi_api-storage-v1-CreateVirtioScsiControllerRequest"></a>

### CreateVirtioScsiControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| virtio_scsi_controller | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |  |
| virtio_scsi_controller_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-CreateVirtioScsiLunRequest"></a>

### CreateVirtioScsiLunRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| virtio_scsi_lun | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |  |
| virtio_scsi_lun_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-CreateVirtioScsiTargetRequest"></a>

### CreateVirtioScsiTargetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| virtio_scsi_target | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) |  |  |
| virtio_scsi_target_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-DeleteVirtioScsiControllerRequest"></a>

### DeleteVirtioScsiControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-DeleteVirtioScsiLunRequest"></a>

### DeleteVirtioScsiLunRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-DeleteVirtioScsiTargetRequest"></a>

### DeleteVirtioScsiTargetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetVirtioScsiControllerRequest"></a>

### GetVirtioScsiControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-GetVirtioScsiLunRequest"></a>

### GetVirtioScsiLunRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-GetVirtioScsiTargetRequest"></a>

### GetVirtioScsiTargetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioScsiControllersRequest"></a>

### ListVirtioScsiControllersRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioScsiControllersResponse"></a>

### ListVirtioScsiControllersResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_controllers | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioScsiLunsRequest"></a>

### ListVirtioScsiLunsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioScsiLunsResponse"></a>

### ListVirtioScsiLunsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_luns | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioScsiTargetsRequest"></a>

### ListVirtioScsiTargetsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioScsiTargetsResponse"></a>

### ListVirtioScsiTargetsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_targets | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-UpdateVirtioScsiControllerRequest"></a>

### UpdateVirtioScsiControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_controller | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |  |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |






<a name="opi_api-storage-v1-UpdateVirtioScsiLunRequest"></a>

### UpdateVirtioScsiLunRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_lun | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |  |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |






<a name="opi_api-storage-v1-UpdateVirtioScsiTargetRequest"></a>

### UpdateVirtioScsiTargetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_target | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) |  |  |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |






<a name="opi_api-storage-v1-VirtioScsiController"></a>

### VirtioScsiController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| pcie_id | [PciEndpoint](#opi_api-storage-v1-PciEndpoint) |  | xPU&#39;s PCI ID for the controller |






<a name="opi_api-storage-v1-VirtioScsiControllerStatsRequest"></a>

### VirtioScsiControllerStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-VirtioScsiControllerStatsResponse"></a>

### VirtioScsiControllerStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLun"></a>

### VirtioScsiLun



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| target_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | The target that this LUN is in |
| volume_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | The middle/back-end volume for this LLUN |






<a name="opi_api-storage-v1-VirtioScsiLunStatsRequest"></a>

### VirtioScsiLunStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| lun_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunStatsResponse"></a>

### VirtioScsiLunStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-VirtioScsiTarget"></a>

### VirtioScsiTarget



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| max_luns | [int32](#int32) |  | maximum LUNs within a target |






<a name="opi_api-storage-v1-VirtioScsiTargetStatsRequest"></a>

### VirtioScsiTargetStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| target_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-VirtioScsiTargetStatsResponse"></a>

### VirtioScsiTargetStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |





 

 

 


<a name="opi_api-storage-v1-FrontendVirtioScsiService"></a>

### FrontendVirtioScsiService
Front End (host-facing) APIs. Mostly used for Virtio-scsi emulation and host presentation as alternative to Virtio-blk.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateVirtioScsiTarget | [CreateVirtioScsiTargetRequest](#opi_api-storage-v1-CreateVirtioScsiTargetRequest) | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) |  |
| DeleteVirtioScsiTarget | [DeleteVirtioScsiTargetRequest](#opi_api-storage-v1-DeleteVirtioScsiTargetRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateVirtioScsiTarget | [UpdateVirtioScsiTargetRequest](#opi_api-storage-v1-UpdateVirtioScsiTargetRequest) | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) |  |
| ListVirtioScsiTargets | [ListVirtioScsiTargetsRequest](#opi_api-storage-v1-ListVirtioScsiTargetsRequest) | [ListVirtioScsiTargetsResponse](#opi_api-storage-v1-ListVirtioScsiTargetsResponse) |  |
| GetVirtioScsiTarget | [GetVirtioScsiTargetRequest](#opi_api-storage-v1-GetVirtioScsiTargetRequest) | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) |  |
| VirtioScsiTargetStats | [VirtioScsiTargetStatsRequest](#opi_api-storage-v1-VirtioScsiTargetStatsRequest) | [VirtioScsiTargetStatsResponse](#opi_api-storage-v1-VirtioScsiTargetStatsResponse) |  |
| CreateVirtioScsiController | [CreateVirtioScsiControllerRequest](#opi_api-storage-v1-CreateVirtioScsiControllerRequest) | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |
| DeleteVirtioScsiController | [DeleteVirtioScsiControllerRequest](#opi_api-storage-v1-DeleteVirtioScsiControllerRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateVirtioScsiController | [UpdateVirtioScsiControllerRequest](#opi_api-storage-v1-UpdateVirtioScsiControllerRequest) | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |
| ListVirtioScsiControllers | [ListVirtioScsiControllersRequest](#opi_api-storage-v1-ListVirtioScsiControllersRequest) | [ListVirtioScsiControllersResponse](#opi_api-storage-v1-ListVirtioScsiControllersResponse) |  |
| GetVirtioScsiController | [GetVirtioScsiControllerRequest](#opi_api-storage-v1-GetVirtioScsiControllerRequest) | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |
| VirtioScsiControllerStats | [VirtioScsiControllerStatsRequest](#opi_api-storage-v1-VirtioScsiControllerStatsRequest) | [VirtioScsiControllerStatsResponse](#opi_api-storage-v1-VirtioScsiControllerStatsResponse) |  |
| CreateVirtioScsiLun | [CreateVirtioScsiLunRequest](#opi_api-storage-v1-CreateVirtioScsiLunRequest) | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |
| DeleteVirtioScsiLun | [DeleteVirtioScsiLunRequest](#opi_api-storage-v1-DeleteVirtioScsiLunRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateVirtioScsiLun | [UpdateVirtioScsiLunRequest](#opi_api-storage-v1-UpdateVirtioScsiLunRequest) | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |
| ListVirtioScsiLuns | [ListVirtioScsiLunsRequest](#opi_api-storage-v1-ListVirtioScsiLunsRequest) | [ListVirtioScsiLunsResponse](#opi_api-storage-v1-ListVirtioScsiLunsResponse) |  |
| GetVirtioScsiLun | [GetVirtioScsiLunRequest](#opi_api-storage-v1-GetVirtioScsiLunRequest) | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |
| VirtioScsiLunStats | [VirtioScsiLunStatsRequest](#opi_api-storage-v1-VirtioScsiLunStatsRequest) | [VirtioScsiLunStatsResponse](#opi_api-storage-v1-VirtioScsiLunStatsResponse) |  |

 



<a name="middleend-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## middleend.proto



<a name="opi_api-storage-v1-CreateEncryptedVolumeRequest"></a>

### CreateEncryptedVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| encrypted_volume | [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume) |  |  |
| encrypted_volume_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-DeleteEncryptedVolumeRequest"></a>

### DeleteEncryptedVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-EncryptedVolume"></a>

### EncryptedVolume



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| encrypted_volume_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| volume_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | The back/middle-end volume to back this volume |
| key | [bytes](#bytes) |  | Key to be used for encryption |
| cipher | [EncryptionType](#opi_api-storage-v1-EncryptionType) |  | Cipher to use |






<a name="opi_api-storage-v1-EncryptedVolumeStatsRequest"></a>

### EncryptedVolumeStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| encrypted_volume_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-EncryptedVolumeStatsResponse"></a>

### EncryptedVolumeStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| encrypted_volume_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-GetEncryptedVolumeRequest"></a>

### GetEncryptedVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListEncryptedVolumesRequest"></a>

### ListEncryptedVolumesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListEncryptedVolumesResponse"></a>

### ListEncryptedVolumesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| encrypted_volumes | [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-UpdateEncryptedVolumeRequest"></a>

### UpdateEncryptedVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| encrypted_volume | [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume) |  |  |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |





 

 

 


<a name="opi_api-storage-v1-MiddleendService"></a>

### MiddleendService
Middle End (Storage Services) APIs. For example, encryption, compression, raid, QoS, multipath, ...

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateEncryptedVolume | [CreateEncryptedVolumeRequest](#opi_api-storage-v1-CreateEncryptedVolumeRequest) | [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume) |  |
| DeleteEncryptedVolume | [DeleteEncryptedVolumeRequest](#opi_api-storage-v1-DeleteEncryptedVolumeRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateEncryptedVolume | [UpdateEncryptedVolumeRequest](#opi_api-storage-v1-UpdateEncryptedVolumeRequest) | [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume) |  |
| ListEncryptedVolumes | [ListEncryptedVolumesRequest](#opi_api-storage-v1-ListEncryptedVolumesRequest) | [ListEncryptedVolumesResponse](#opi_api-storage-v1-ListEncryptedVolumesResponse) |  |
| GetEncryptedVolume | [GetEncryptedVolumeRequest](#opi_api-storage-v1-GetEncryptedVolumeRequest) | [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume) |  |
| EncryptedVolumeStats | [EncryptedVolumeStatsRequest](#opi_api-storage-v1-EncryptedVolumeStatsRequest) | [EncryptedVolumeStatsResponse](#opi_api-storage-v1-EncryptedVolumeStatsResponse) |  |

 



<a name="opicommon-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## opicommon.proto



<a name="opi_api-storage-v1-PciEndpoint"></a>

### PciEndpoint
Many front-ends expose PCI devices to the host. This represents that endpoint.
This device will ultimately be surfaced by the operating system at some
Bus:Device:Function, but note that the values set here are not necessarily
the same values that the operating system will choose. Instead, these are
xPU-internal values.
While the term &#34;device&#34; is often used for the entity attached to a PCI slot,
we&#39;ll use the term &#34;port&#34; which also commonly used with PCI switches and avoids
confusion with storage &#34;devices&#34;.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| port_id | [int32](#int32) |  | The &#34;port&#34; or &#34;device&#34;. In other words, the connector/cable that&#39;s plugged into a particular host. This number may end up matching the host-assigned &#34;device&#34; value in the bus:device:function identifier, but it does not strictly have to and that should not be relied upon. |
| physical_function | [int32](#int32) |  | Physical function index. This may end up matching the host-assigned &#34;function&#34; value in the bus:device:function identifier, but it does not strictly have to and that should not be relied upon. |
| virtual_function | [int32](#int32) |  | Virtual function index. This may end up matching the host-assigned &#34;function&#34; value in the bus:device:function identifier, but it does not strictly have to and that should not be relied upon. |






<a name="opi_api-storage-v1-VolumeStats"></a>

### VolumeStats



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| read_bytes_count | [int32](#int32) |  |  |
| read_ops_count | [int32](#int32) |  |  |
| write_bytes_count | [int32](#int32) |  |  |
| write_ops_count | [int32](#int32) |  |  |
| unmap_bytes_count | [int32](#int32) |  |  |
| unmap_ops_count | [int32](#int32) |  |  |
| read_latency_ticks | [int32](#int32) |  |  |
| write_latency_ticks | [int32](#int32) |  |  |
| unmap_latency_ticks | [int32](#int32) |  |  |





 


<a name="opi_api-storage-v1-EncryptionType"></a>

### EncryptionType
AES encryption types

| Name | Number | Description |
| ---- | ------ | ----------- |
| ENCRYPTION_TYPE_UNSPECIFIED | 0 |  |
| ENCRYPTION_TYPE_AES_CBC_128 | 1 |  |
| ENCRYPTION_TYPE_AES_CBC_192 | 2 |  |
| ENCRYPTION_TYPE_AES_CBC_256 | 3 |  |
| ENCRYPTION_TYPE_AES_XTS_128 | 4 |  |
| ENCRYPTION_TYPE_AES_XTS_192 | 5 |  |
| ENCRYPTION_TYPE_AES_XTS_256 | 6 |  |


 

 

 



<a name="inventory-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## inventory.proto



<a name="opi_api-inventory-v1-BIOSInfo"></a>

### BIOSInfo
BIOS Information (Type 0)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vendor | [string](#string) |  | String number of the BIOS Vendor’s Name. |
| version | [string](#string) |  | String number of the BIOS Version. This value is a free-form string that may contain Core and OEM version information. |
| date | [string](#string) |  | String number of the BIOS release date. The date string, if supplied, is in either mm/dd/yy or mm/dd/yyyy format. If the year portion of the string is two digits, the year is assumed to be 19yy. NOTE: The mm/dd/yyyy format is required for SMBIOS version 2.3 and later |






<a name="opi_api-inventory-v1-BaseboardInfo"></a>

### BaseboardInfo
Baseboard (or Module) Information (Type 2)
 The information in this structure defines attributes of a system baseboard (for
 example, a motherboard, planar, server blade, or other standard system module)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| asset_tag | [string](#string) |  | Number of a null-terminated string |
| serial_number | [string](#string) |  | Number of null-terminated string |
| vendor | [string](#string) |  | Number of null-terminated string |
| version | [string](#string) |  | Number of null-terminated string |
| product | [string](#string) |  | Number of null-terminated string |






<a name="opi_api-inventory-v1-CPUInfo"></a>

### CPUInfo
Processor Information (Type 4)
 The information in this structure (see Table 21) defines the attributes of a single processor; a separate
 structure instance is provided for each system processor socket/slot. For example, a system with an
 IntelDX2™ processor would have a single structure instance while a system with an IntelSX2™ processor
 would have a structure to describe the main CPU and a second structure to describe the 80487 co1054 processor.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| total_cores | [int32](#int32) |  | Number of cores per processor socket See 7.5.6. If the value is unknown, the field is set to 0. For core counts of 256 or greater, the Core Count field is set to FFh and the Core Count 2 field is set to the number of cores. |
| total_threads | [int32](#int32) |  | Number of threads per processor socket See 7.5.8. If the value is unknown, the field is set to 0. For thread counts of 256 or greater, the Thread Count field is set to FFh and the Thread Count 2 field is set to the number of threads. |






<a name="opi_api-inventory-v1-ChassisInfo"></a>

### ChassisInfo
System Enclosure or Chassis (Type 3)
 The information in this structure (see Table 16) defines attributes of the system’s mechanical
 enclosure(s). For example, if a system included a separate enclosure for its peripheral devices, two
 structures would be returned: one for the main system enclosure and the second for the peripheral device
 enclosure. The additions to this structure in version 2.1 of this specification support the population of the
 CIM_Chassis class.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| asset_tag | [string](#string) |  | Number of null-terminated string |
| serial_number | [string](#string) |  | Number of null-terminated string |
| type | [string](#string) |  | Bit 7 Chassis lock is present if 1. Otherwise, either a lock is not present, or it is unknown if the enclosure has a lock. Bits 6:0 Enumeration value; see below. |
| type_description | [string](#string) |  | Table 17 shows the byte values for the System Enclosure or Chassis Types field Number of null-terminated string |
| vendor | [string](#string) |  | Number of null-terminated string |
| version | [string](#string) |  | Number of null-terminated string |






<a name="opi_api-inventory-v1-InventoryGetRequest"></a>

### InventoryGetRequest
Empty






<a name="opi_api-inventory-v1-InventoryGetResponse"></a>

### InventoryGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| bios | [BIOSInfo](#opi_api-inventory-v1-BIOSInfo) |  |  |
| system | [SystemInfo](#opi_api-inventory-v1-SystemInfo) |  |  |
| baseboard | [BaseboardInfo](#opi_api-inventory-v1-BaseboardInfo) |  |  |
| chassis | [ChassisInfo](#opi_api-inventory-v1-ChassisInfo) |  |  |
| processor | [CPUInfo](#opi_api-inventory-v1-CPUInfo) |  |  |
| memory | [MemoryInfo](#opi_api-inventory-v1-MemoryInfo) |  |  |
| pci | [PCIeDeviceInfo](#opi_api-inventory-v1-PCIeDeviceInfo) | repeated |  |






<a name="opi_api-inventory-v1-MemoryInfo"></a>

### MemoryInfo
Physical Memory Array (Type 16)
 This structure describes a collection of memory devices that operate together to form a memory address
 space.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| total_physical_bytes | [int64](#int64) |  | Maximum memory capacity, in kilobytes, for this array If the capacity is not represented in this field, then this field contains 8000 0000h and the Extended Maximum Capacity field should be used. Values 2 TB (8000 0000h) or greater must be represented in the Extended Maximum Capacity field. |
| total_usable_bytes | [int64](#int64) |  | TBD |






<a name="opi_api-inventory-v1-PCIeDeviceInfo"></a>

### PCIeDeviceInfo
PCI device information
 TBD: Type 9 or Type 41 ?
 This structure describes a collection of PCI devices.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| driver | [string](#string) |  | Driver assiociated with the device |
| address | [string](#string) |  | BDF address in a string format, for example &#34;0000:00:17.7&#34; |
| vendor | [string](#string) |  | string vendor info |
| product | [string](#string) |  | string product info |
| revision | [string](#string) |  | string revision info |
| subsystem | [string](#string) |  | string subsystem info |
| class | [string](#string) |  | string class info |
| subclass | [string](#string) |  | string subclass info |






<a name="opi_api-inventory-v1-SystemInfo"></a>

### SystemInfo
System Information (Type 1)
 The information in this structure defines attributes of the overall system and is intended to be associated
 with the Component ID group of the system’s MIF. An SMBIOS implementation is associated with a single
 system instance and contains one and only one System Information (Type 1) structure. Table 10 shows
 the contents of this structure.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| family | [string](#string) |  | Number of null-terminated string This text string identifies the family to which a particular computer belongs. A family refers to a set of computers that are similar but not identical from a hardware or software point of view. Typically, a family is composed of different computer models, which have different configurations and pricing points. Computers in the same family often have similar branding and cosmetic features. |
| name | [string](#string) |  | Number of null-terminated string |
| vendor | [string](#string) |  | Number of null-terminated string |
| serial_number | [string](#string) |  | Number of null-terminated string |
| uuid | [string](#string) |  | A UUID is an identifier that is designed to be unique across both time and space. It requires no central registration process. The UUID is 128 bits long. Its format is described in RFC4122, but the actual field contents are opaque and not significant to the SMBIOS specification, which is only concerned with the byte order. Table 11 shows the field names; these field names, particularly for multiplexed fields, follow historical practice. |
| sku | [string](#string) |  | Number of null-terminated string This text string identifies a particular computer configuration for sale. It is sometimes also called a product ID or purchase order number. This number is frequently found in existing fields, but there is no standard format. Typically for a given system board from a given OEM, there are tens of unique processor, memory, hard drive, and optical drive configurations. |
| version | [string](#string) |  | Number of null-terminated string |





 

 

 


<a name="opi_api-inventory-v1-InventorySvc"></a>

### InventorySvc
Service functions for the device inventory data

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| InventoryGet | [InventoryGetRequest](#opi_api-inventory-v1-InventoryGetRequest) | [InventoryGetResponse](#opi_api-inventory-v1-InventoryGetResponse) | retrieves the inventory data for the device |

 



<a name="object_key-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## object_key.proto



<a name="opi_api-common-v1-ObjectKey"></a>

### ObjectKey
Object Keys are opaque values. The object key uniquely
identifies a given configuration object. The key used must be unique within
the agent&#39;s context for the give object type and must be non-zero. No other
restrictions apply on the usage of the key.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  | The value of the ObjectKey |





 

 

 

 



<a name="uuid-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## uuid.proto



<a name="opi_api-common-v1-Uuid"></a>

### Uuid
A universally unique identifier (UUID) is a 128-bit label
When generated according to the standard methods, UUIDs are, for practical purposes, unique.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  | The value of the UUID |





 

 

 

 



## Scalar Value Types

| .proto Type | Notes | C++ | Java | Python | Go | C# | PHP | Ruby |
| ----------- | ----- | --- | ---- | ------ | -- | -- | --- | ---- |
| <a name="double" /> double |  | double | double | float | float64 | double | float | Float |
| <a name="float" /> float |  | float | float | float | float32 | float | float | Float |
| <a name="int32" /> int32 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint32 instead. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="int64" /> int64 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint64 instead. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="uint32" /> uint32 | Uses variable-length encoding. | uint32 | int | int/long | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="uint64" /> uint64 | Uses variable-length encoding. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum or Fixnum (as required) |
| <a name="sint32" /> sint32 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int32s. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sint64" /> sint64 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int64s. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="fixed32" /> fixed32 | Always four bytes. More efficient than uint32 if values are often greater than 2^28. | uint32 | int | int | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="fixed64" /> fixed64 | Always eight bytes. More efficient than uint64 if values are often greater than 2^56. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum |
| <a name="sfixed32" /> sfixed32 | Always four bytes. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sfixed64" /> sfixed64 | Always eight bytes. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="bool" /> bool |  | bool | boolean | boolean | bool | bool | boolean | TrueClass/FalseClass |
| <a name="string" /> string | A string must always contain UTF-8 encoded or 7-bit ASCII text. | string | String | str/unicode | string | string | string | String (UTF-8) |
| <a name="bytes" /> bytes | May contain any arbitrary sequence of bytes. | string | ByteString | str | []byte | ByteString | string | String (ASCII-8BIT) |

