# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: networktypes.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x12networktypes.proto\x12%opi_api.network.opinetcommon.v1alpha1\"v\n\tIPAddress\x12\x37\n\x02\x61\x66\x18\x01 \x01(\x0e\x32+.opi_api.network.opinetcommon.v1alpha1.IpAf\x12\x11\n\x07v4_addr\x18\x02 \x01(\x07H\x00\x12\x11\n\x07v6_addr\x18\x03 \x01(\x0cH\x00\x42\n\n\x08v4_or_v6\"W\n\x08IPPrefix\x12>\n\x04\x61\x64\x64r\x18\x01 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddress\x12\x0b\n\x03len\x18\x02 \x01(\x05\"\'\n\nIPv4Prefix\x12\x0c\n\x04\x61\x64\x64r\x18\x01 \x01(\x07\x12\x0b\n\x03len\x18\x02 \x01(\x05\"\'\n\nIPv6Prefix\x12\x0c\n\x04\x61\x64\x64r\x18\x01 \x01(\x0c\x12\x0b\n\x03len\x18\x02 \x01(\x05\"X\n\x08\x45ncapVal\x12\x11\n\x07vlan_id\x18\x01 \x01(\x05H\x00\x12\x12\n\x08mpls_tag\x18\x02 \x01(\x05H\x00\x12\x0e\n\x04vnid\x18\x03 \x01(\x05H\x00\x12\x0e\n\x04vsid\x18\x05 \x01(\x05H\x00\x42\x05\n\x03val\"\x87\x01\n\x05\x45ncap\x12>\n\x04type\x18\x01 \x01(\x0e\x32\x30.opi_api.network.opinetcommon.v1alpha1.EncapType\x12>\n\x05value\x18\x02 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.EncapVal\"0\n\tPortRange\x12\x10\n\x08port_low\x18\x01 \x01(\x05\x12\x11\n\tport_high\x18\x02 \x01(\x05\"\x88\x01\n\x07IPRange\x12=\n\x03low\x18\x01 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddress\x12>\n\x04high\x18\x02 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddress\"\xa3\x01\n\x0c\x41\x64\x64ressRange\x12\x44\n\nipv4_range\x18\x01 \x01(\x0b\x32..opi_api.network.opinetcommon.v1alpha1.IPRangeH\x00\x12\x44\n\nipv6_range\x18\x02 \x01(\x0b\x32..opi_api.network.opinetcommon.v1alpha1.IPRangeH\x00\x42\x07\n\x05range\"\xad\x01\n\x07IPEntry\x12\x41\n\x06prefix\x18\x01 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefixH\x00\x12\x44\n\x05range\x18\x02 \x01(\x0b\x32\x33.opi_api.network.opinetcommon.v1alpha1.AddressRangeH\x00\x12\r\n\x03tag\x18\x03 \x01(\x05H\x00\x42\n\n\x08ip_entry\"L\n\x06IPList\x12\x42\n\nip_entries\x18\x01 \x03(\x0b\x32..opi_api.network.opinetcommon.v1alpha1.IPEntry\"\xed\x04\n\x0bRuleL3Match\x12\x13\n\tproto_num\x18\x01 \x01(\x05H\x00\x12O\n\x0fproto_wild_card\x18\x02 \x01(\x0e\x32\x34.opi_api.network.opinetcommon.v1alpha1.WildcardMatchH\x00\x12\x45\n\nsrc_prefix\x18\x03 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefixH\x01\x12H\n\tsrc_range\x18\x04 \x01(\x0b\x32\x33.opi_api.network.opinetcommon.v1alpha1.AddressRangeH\x01\x12\x11\n\x07src_tag\x18\x05 \x01(\x05H\x01\x12\x44\n\x0bsrc_ip_list\x18\x06 \x01(\x0b\x32-.opi_api.network.opinetcommon.v1alpha1.IPListH\x01\x12\x45\n\ndst_prefix\x18\x07 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefixH\x02\x12H\n\tdst_range\x18\x08 \x01(\x0b\x32\x33.opi_api.network.opinetcommon.v1alpha1.AddressRangeH\x02\x12\x11\n\x07\x64st_tag\x18\t \x01(\x05H\x02\x12\x44\n\x0b\x64st_ip_list\x18\n \x01(\x0b\x32-.opi_api.network.opinetcommon.v1alpha1.IPListH\x02\x42\x0c\n\nprotomatchB\n\n\x08srcmatchB\n\n\x08\x64stmatch\"\x9f\x01\n\tPortMatch\x12H\n\x0esrc_port_range\x18\x01 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.PortRange\x12H\n\x0e\x64st_port_range\x18\x02 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.PortRange\"\xe3\x01\n\tICMPMatch\x12\x0e\n\x04type\x18\x01 \x01(\x05H\x00\x12M\n\rtype_wildcard\x18\x02 \x01(\x0e\x32\x34.opi_api.network.opinetcommon.v1alpha1.WildcardMatchH\x00\x12\x0e\n\x04\x63ode\x18\x03 \x01(\x05H\x01\x12M\n\rcode_wildcard\x18\x04 \x01(\x0e\x32\x34.opi_api.network.opinetcommon.v1alpha1.WildcardMatchH\x01\x42\x0b\n\ttypematchB\x0b\n\tcodematch\"\xa3\x01\n\rPortListMatch\x12H\n\x0esrc_port_range\x18\x01 \x03(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.PortRange\x12H\n\x0e\x64st_port_range\x18\x02 \x03(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.PortRange\"Z\n\rICMPMatchList\x12I\n\x0ficmp_match_list\x18\x01 \x03(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.ICMPMatch\"\xbd\x02\n\x0bRuleL4Match\x12\x41\n\x05ports\x18\x01 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.PortMatchH\x00\x12\x45\n\ttype_code\x18\x02 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.ICMPMatchH\x00\x12I\n\tport_list\x18\x03 \x01(\x0b\x32\x34.opi_api.network.opinetcommon.v1alpha1.PortListMatchH\x00\x12O\n\x0ficmp_match_list\x18\x04 \x01(\x0b\x32\x34.opi_api.network.opinetcommon.v1alpha1.ICMPMatchListH\x00\x42\x08\n\x06l4info\"\x97\x01\n\tRuleMatch\x12\x44\n\x08l3_match\x18\x01 \x01(\x0b\x32\x32.opi_api.network.opinetcommon.v1alpha1.RuleL3Match\x12\x44\n\x08l4_match\x18\x02 \x01(\x0b\x32\x32.opi_api.network.opinetcommon.v1alpha1.RuleL4Match\"\x17\n\x08HwHandle\x12\x0b\n\x03idx\x18\x01 \x01(\x04*r\n\x12SecurityRuleAction\x12\x1d\n\x19SECURITY_RULE_ACTION_NONE\x10\x00\x12\x1e\n\x1aSECURITY_RULE_ACTION_ALLOW\x10\x01\x12\x1d\n\x19SECURITY_RULE_ACTION_DENY\x10\x02*>\n\x04IpAf\x12\x15\n\x11IP_AF_UNSPECIFIED\x10\x00\x12\x0e\n\nIP_AF_INET\x10\x01\x12\x0f\n\x0bIP_AF_INET6\x10\x02*\x87\x01\n\tEncapType\x12\x1a\n\x16\x45NCAP_TYPE_UNSPECIFIED\x10\x00\x12\x14\n\x10\x45NCAP_TYPE_DOT1Q\x10\x01\x12\x1c\n\x18\x45NCAP_TYPE_MPLS_OVER_UDP\x10\x02\x12\x14\n\x10\x45NCAP_TYPE_VXLAN\x10\x03\x12\x14\n\x10\x45NCAP_TYPE_NVGRE\x10\x04*\x81\x01\n\tRouteType\x12\x1a\n\x16ROUTE_TYPE_UNSPECIFIED\x10\x00\x12\x14\n\x10ROUTE_TYPE_OTHER\x10\x01\x12\x15\n\x11ROUTE_TYPE_REJECT\x10\x02\x12\x14\n\x10ROUTE_TYPE_LOCAL\x10\x03\x12\x15\n\x11ROUTE_TYPE_REMOTE\x10\x04*|\n\rRouteProtocol\x12\x1e\n\x1aROUTE_PROTOCOL_UNSPECIFIED\x10\x00\x12\x18\n\x14ROUTE_PROTOCOL_LOCAL\x10\x01\x12\x19\n\x15ROUTE_PROTOCOL_STATIC\x10\x02\x12\x16\n\x12ROUTE_PROTOCOL_BGP\x10\x03*Z\n\nAdminState\x12\x1b\n\x17\x41\x44MIN_STATE_UNSPECIFIED\x10\x00\x12\x16\n\x12\x41\x44MIN_STATE_ENABLE\x10\x01\x12\x17\n\x13\x41\x44MIN_STATE_DISABLE\x10\x02*V\n\tPolicyDir\x12\x1a\n\x16POLICY_DIR_UNSPECIFIED\x10\x00\x12\x16\n\x12POLICY_DIR_INGRESS\x10\x01\x12\x15\n\x11POLICY_DIR_EGRESS\x10\x02*/\n\rWildcardMatch\x12\x0e\n\nMATCH_NONE\x10\x00\x12\x0e\n\tMATCH_ANY\x10\x80\x02\x42\x80\x01\n%opi_api.network.opinetcommon.v1alpha1B\x11NetworkTypesProtoP\x01ZBgithub.com/opiproject/opi-api/network/opinetcommon/v1alpha1/gen/gob\x06proto3')

_SECURITYRULEACTION = DESCRIPTOR.enum_types_by_name['SecurityRuleAction']
SecurityRuleAction = enum_type_wrapper.EnumTypeWrapper(_SECURITYRULEACTION)
_IPAF = DESCRIPTOR.enum_types_by_name['IpAf']
IpAf = enum_type_wrapper.EnumTypeWrapper(_IPAF)
_ENCAPTYPE = DESCRIPTOR.enum_types_by_name['EncapType']
EncapType = enum_type_wrapper.EnumTypeWrapper(_ENCAPTYPE)
_ROUTETYPE = DESCRIPTOR.enum_types_by_name['RouteType']
RouteType = enum_type_wrapper.EnumTypeWrapper(_ROUTETYPE)
_ROUTEPROTOCOL = DESCRIPTOR.enum_types_by_name['RouteProtocol']
RouteProtocol = enum_type_wrapper.EnumTypeWrapper(_ROUTEPROTOCOL)
_ADMINSTATE = DESCRIPTOR.enum_types_by_name['AdminState']
AdminState = enum_type_wrapper.EnumTypeWrapper(_ADMINSTATE)
_POLICYDIR = DESCRIPTOR.enum_types_by_name['PolicyDir']
PolicyDir = enum_type_wrapper.EnumTypeWrapper(_POLICYDIR)
_WILDCARDMATCH = DESCRIPTOR.enum_types_by_name['WildcardMatch']
WildcardMatch = enum_type_wrapper.EnumTypeWrapper(_WILDCARDMATCH)
SECURITY_RULE_ACTION_NONE = 0
SECURITY_RULE_ACTION_ALLOW = 1
SECURITY_RULE_ACTION_DENY = 2
IP_AF_UNSPECIFIED = 0
IP_AF_INET = 1
IP_AF_INET6 = 2
ENCAP_TYPE_UNSPECIFIED = 0
ENCAP_TYPE_DOT1Q = 1
ENCAP_TYPE_MPLS_OVER_UDP = 2
ENCAP_TYPE_VXLAN = 3
ENCAP_TYPE_NVGRE = 4
ROUTE_TYPE_UNSPECIFIED = 0
ROUTE_TYPE_OTHER = 1
ROUTE_TYPE_REJECT = 2
ROUTE_TYPE_LOCAL = 3
ROUTE_TYPE_REMOTE = 4
ROUTE_PROTOCOL_UNSPECIFIED = 0
ROUTE_PROTOCOL_LOCAL = 1
ROUTE_PROTOCOL_STATIC = 2
ROUTE_PROTOCOL_BGP = 3
ADMIN_STATE_UNSPECIFIED = 0
ADMIN_STATE_ENABLE = 1
ADMIN_STATE_DISABLE = 2
POLICY_DIR_UNSPECIFIED = 0
POLICY_DIR_INGRESS = 1
POLICY_DIR_EGRESS = 2
MATCH_NONE = 0
MATCH_ANY = 256


_IPADDRESS = DESCRIPTOR.message_types_by_name['IPAddress']
_IPPREFIX = DESCRIPTOR.message_types_by_name['IPPrefix']
_IPV4PREFIX = DESCRIPTOR.message_types_by_name['IPv4Prefix']
_IPV6PREFIX = DESCRIPTOR.message_types_by_name['IPv6Prefix']
_ENCAPVAL = DESCRIPTOR.message_types_by_name['EncapVal']
_ENCAP = DESCRIPTOR.message_types_by_name['Encap']
_PORTRANGE = DESCRIPTOR.message_types_by_name['PortRange']
_IPRANGE = DESCRIPTOR.message_types_by_name['IPRange']
_ADDRESSRANGE = DESCRIPTOR.message_types_by_name['AddressRange']
_IPENTRY = DESCRIPTOR.message_types_by_name['IPEntry']
_IPLIST = DESCRIPTOR.message_types_by_name['IPList']
_RULEL3MATCH = DESCRIPTOR.message_types_by_name['RuleL3Match']
_PORTMATCH = DESCRIPTOR.message_types_by_name['PortMatch']
_ICMPMATCH = DESCRIPTOR.message_types_by_name['ICMPMatch']
_PORTLISTMATCH = DESCRIPTOR.message_types_by_name['PortListMatch']
_ICMPMATCHLIST = DESCRIPTOR.message_types_by_name['ICMPMatchList']
_RULEL4MATCH = DESCRIPTOR.message_types_by_name['RuleL4Match']
_RULEMATCH = DESCRIPTOR.message_types_by_name['RuleMatch']
_HWHANDLE = DESCRIPTOR.message_types_by_name['HwHandle']
IPAddress = _reflection.GeneratedProtocolMessageType('IPAddress', (_message.Message,), {
  'DESCRIPTOR' : _IPADDRESS,
  '__module__' : 'networktypes_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.IPAddress)
  })
_sym_db.RegisterMessage(IPAddress)

IPPrefix = _reflection.GeneratedProtocolMessageType('IPPrefix', (_message.Message,), {
  'DESCRIPTOR' : _IPPREFIX,
  '__module__' : 'networktypes_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.IPPrefix)
  })
_sym_db.RegisterMessage(IPPrefix)

IPv4Prefix = _reflection.GeneratedProtocolMessageType('IPv4Prefix', (_message.Message,), {
  'DESCRIPTOR' : _IPV4PREFIX,
  '__module__' : 'networktypes_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.IPv4Prefix)
  })
_sym_db.RegisterMessage(IPv4Prefix)

IPv6Prefix = _reflection.GeneratedProtocolMessageType('IPv6Prefix', (_message.Message,), {
  'DESCRIPTOR' : _IPV6PREFIX,
  '__module__' : 'networktypes_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.IPv6Prefix)
  })
_sym_db.RegisterMessage(IPv6Prefix)

EncapVal = _reflection.GeneratedProtocolMessageType('EncapVal', (_message.Message,), {
  'DESCRIPTOR' : _ENCAPVAL,
  '__module__' : 'networktypes_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.EncapVal)
  })
_sym_db.RegisterMessage(EncapVal)

Encap = _reflection.GeneratedProtocolMessageType('Encap', (_message.Message,), {
  'DESCRIPTOR' : _ENCAP,
  '__module__' : 'networktypes_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.Encap)
  })
_sym_db.RegisterMessage(Encap)

PortRange = _reflection.GeneratedProtocolMessageType('PortRange', (_message.Message,), {
  'DESCRIPTOR' : _PORTRANGE,
  '__module__' : 'networktypes_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.PortRange)
  })
_sym_db.RegisterMessage(PortRange)

IPRange = _reflection.GeneratedProtocolMessageType('IPRange', (_message.Message,), {
  'DESCRIPTOR' : _IPRANGE,
  '__module__' : 'networktypes_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.IPRange)
  })
_sym_db.RegisterMessage(IPRange)

AddressRange = _reflection.GeneratedProtocolMessageType('AddressRange', (_message.Message,), {
  'DESCRIPTOR' : _ADDRESSRANGE,
  '__module__' : 'networktypes_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.AddressRange)
  })
_sym_db.RegisterMessage(AddressRange)

IPEntry = _reflection.GeneratedProtocolMessageType('IPEntry', (_message.Message,), {
  'DESCRIPTOR' : _IPENTRY,
  '__module__' : 'networktypes_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.IPEntry)
  })
_sym_db.RegisterMessage(IPEntry)

IPList = _reflection.GeneratedProtocolMessageType('IPList', (_message.Message,), {
  'DESCRIPTOR' : _IPLIST,
  '__module__' : 'networktypes_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.IPList)
  })
_sym_db.RegisterMessage(IPList)

RuleL3Match = _reflection.GeneratedProtocolMessageType('RuleL3Match', (_message.Message,), {
  'DESCRIPTOR' : _RULEL3MATCH,
  '__module__' : 'networktypes_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.RuleL3Match)
  })
_sym_db.RegisterMessage(RuleL3Match)

PortMatch = _reflection.GeneratedProtocolMessageType('PortMatch', (_message.Message,), {
  'DESCRIPTOR' : _PORTMATCH,
  '__module__' : 'networktypes_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.PortMatch)
  })
_sym_db.RegisterMessage(PortMatch)

ICMPMatch = _reflection.GeneratedProtocolMessageType('ICMPMatch', (_message.Message,), {
  'DESCRIPTOR' : _ICMPMATCH,
  '__module__' : 'networktypes_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.ICMPMatch)
  })
_sym_db.RegisterMessage(ICMPMatch)

PortListMatch = _reflection.GeneratedProtocolMessageType('PortListMatch', (_message.Message,), {
  'DESCRIPTOR' : _PORTLISTMATCH,
  '__module__' : 'networktypes_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.PortListMatch)
  })
_sym_db.RegisterMessage(PortListMatch)

ICMPMatchList = _reflection.GeneratedProtocolMessageType('ICMPMatchList', (_message.Message,), {
  'DESCRIPTOR' : _ICMPMATCHLIST,
  '__module__' : 'networktypes_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.ICMPMatchList)
  })
_sym_db.RegisterMessage(ICMPMatchList)

RuleL4Match = _reflection.GeneratedProtocolMessageType('RuleL4Match', (_message.Message,), {
  'DESCRIPTOR' : _RULEL4MATCH,
  '__module__' : 'networktypes_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.RuleL4Match)
  })
_sym_db.RegisterMessage(RuleL4Match)

RuleMatch = _reflection.GeneratedProtocolMessageType('RuleMatch', (_message.Message,), {
  'DESCRIPTOR' : _RULEMATCH,
  '__module__' : 'networktypes_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.RuleMatch)
  })
_sym_db.RegisterMessage(RuleMatch)

HwHandle = _reflection.GeneratedProtocolMessageType('HwHandle', (_message.Message,), {
  'DESCRIPTOR' : _HWHANDLE,
  '__module__' : 'networktypes_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.HwHandle)
  })
_sym_db.RegisterMessage(HwHandle)

if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%opi_api.network.opinetcommon.v1alpha1B\021NetworkTypesProtoP\001ZBgithub.com/opiproject/opi-api/network/opinetcommon/v1alpha1/gen/go'
  _SECURITYRULEACTION._serialized_start=2962
  _SECURITYRULEACTION._serialized_end=3076
  _IPAF._serialized_start=3078
  _IPAF._serialized_end=3140
  _ENCAPTYPE._serialized_start=3143
  _ENCAPTYPE._serialized_end=3278
  _ROUTETYPE._serialized_start=3281
  _ROUTETYPE._serialized_end=3410
  _ROUTEPROTOCOL._serialized_start=3412
  _ROUTEPROTOCOL._serialized_end=3536
  _ADMINSTATE._serialized_start=3538
  _ADMINSTATE._serialized_end=3628
  _POLICYDIR._serialized_start=3630
  _POLICYDIR._serialized_end=3716
  _WILDCARDMATCH._serialized_start=3718
  _WILDCARDMATCH._serialized_end=3765
  _IPADDRESS._serialized_start=61
  _IPADDRESS._serialized_end=179
  _IPPREFIX._serialized_start=181
  _IPPREFIX._serialized_end=268
  _IPV4PREFIX._serialized_start=270
  _IPV4PREFIX._serialized_end=309
  _IPV6PREFIX._serialized_start=311
  _IPV6PREFIX._serialized_end=350
  _ENCAPVAL._serialized_start=352
  _ENCAPVAL._serialized_end=440
  _ENCAP._serialized_start=443
  _ENCAP._serialized_end=578
  _PORTRANGE._serialized_start=580
  _PORTRANGE._serialized_end=628
  _IPRANGE._serialized_start=631
  _IPRANGE._serialized_end=767
  _ADDRESSRANGE._serialized_start=770
  _ADDRESSRANGE._serialized_end=933
  _IPENTRY._serialized_start=936
  _IPENTRY._serialized_end=1109
  _IPLIST._serialized_start=1111
  _IPLIST._serialized_end=1187
  _RULEL3MATCH._serialized_start=1190
  _RULEL3MATCH._serialized_end=1811
  _PORTMATCH._serialized_start=1814
  _PORTMATCH._serialized_end=1973
  _ICMPMATCH._serialized_start=1976
  _ICMPMATCH._serialized_end=2203
  _PORTLISTMATCH._serialized_start=2206
  _PORTLISTMATCH._serialized_end=2369
  _ICMPMATCHLIST._serialized_start=2371
  _ICMPMATCHLIST._serialized_end=2461
  _RULEL4MATCH._serialized_start=2464
  _RULEL4MATCH._serialized_end=2781
  _RULEMATCH._serialized_start=2784
  _RULEMATCH._serialized_end=2935
  _HWHANDLE._serialized_start=2937
  _HWHANDLE._serialized_end=2960
# @@protoc_insertion_point(module_scope)
