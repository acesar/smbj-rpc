/**
 * Copyright 2017, Rapid7, Inc.
 *
 * License: BSD-3-clause
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * * Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of the copyright holder nor the names of its contributors
 *   may be used to endorse or promote products derived from this software
 *   without specific prior written permission.
 */
package com.rapid7.client.dcerpc.mserref;

import java.util.HashMap;
import java.util.Map;

public enum SystemErrorCode {
    ERROR_SUCCESS(0x0),
    ERROR_INVALID_FUNCTION(0x1),
    ERROR_FILE_NOT_FOUND(0x2),
    ERROR_PATH_NOT_FOUND(0x3),
    ERROR_TOO_MANY_OPEN_FILES(0x4),
    ERROR_ACCESS_DENIED(0x5),
    ERROR_INVALID_HANDLE(0x6),
    ERROR_ARENA_TRASHED(0x7),
    ERROR_NOT_ENOUGH_MEMORY(0x8),
    ERROR_INVALID_BLOCK(0x9),
    ERROR_BAD_ENVIRONMENT(0xA),
    ERROR_BAD_FORMAT(0xB),
    ERROR_INVALID_ACCESS(0xC),
    ERROR_INVALID_DATA(0xD),
    ERROR_OUTOFMEMORY(0xE),
    ERROR_INVALID_DRIVE(0xF),
    ERROR_CURRENT_DIRECTORY(0x10),
    ERROR_NOT_SAME_DEVICE(0x11),
    ERROR_NO_MORE_FILES(0x12),
    ERROR_WRITE_PROTECT(0x13),
    ERROR_BAD_UNIT(0x14),
    ERROR_NOT_READY(0x15),
    ERROR_BAD_COMMAND(0x16),
    ERROR_CRC(0x17),
    ERROR_BAD_LENGTH(0x18),
    ERROR_SEEK(0x19),
    ERROR_NOT_DOS_DISK(0x1A),
    ERROR_SECTOR_NOT_FOUND(0x1B),
    ERROR_OUT_OF_PAPER(0x1C),
    ERROR_WRITE_FAULT(0x1D),
    ERROR_READ_FAULT(0x1E),
    ERROR_GEN_FAILURE(0x1F),
    ERROR_SHARING_VIOLATION(0x20),
    ERROR_LOCK_VIOLATION(0x21),
    ERROR_WRONG_DISK(0x22),
    ERROR_SHARING_BUFFER_EXCEEDED(0x24),
    ERROR_HANDLE_EOF(0x26),
    ERROR_HANDLE_DISK_FULL(0x27),
    ERROR_NOT_SUPPORTED(0x32),
    ERROR_REM_NOT_LIST(0x33),
    ERROR_DUP_NAME(0x34),
    ERROR_BAD_NETPATH(0x35),
    ERROR_NETWORK_BUSY(0x36),
    ERROR_DEV_NOT_EXIST(0x37),
    ERROR_TOO_MANY_CMDS(0x38),
    ERROR_ADAP_HDW_ERR(0x39),
    ERROR_BAD_NET_RESP(0x3A),
    ERROR_UNEXP_NET_ERR(0x3B),
    ERROR_BAD_REM_ADAP(0x3C),
    ERROR_PRINTQ_FULL(0x3D),
    ERROR_NO_SPOOL_SPACE(0x3E),
    ERROR_PRINT_CANCELLED(0x3F),
    ERROR_NETNAME_DELETED(0x40),
    ERROR_NETWORK_ACCESS_DENIED(0x41),
    ERROR_BAD_DEV_TYPE(0x42),
    ERROR_BAD_NET_NAME(0x43),
    ERROR_TOO_MANY_NAMES(0x44),
    ERROR_TOO_MANY_SESS(0x45),
    ERROR_SHARING_PAUSED(0x46),
    ERROR_REQ_NOT_ACCEP(0x47),
    ERROR_REDIR_PAUSED(0x48),
    ERROR_FILE_EXISTS(0x50),
    ERROR_CANNOT_MAKE(0x52),
    ERROR_FAIL_I24(0x53),
    ERROR_OUT_OF_STRUCTURES(0x54),
    ERROR_ALREADY_ASSIGNED(0x55),
    ERROR_INVALID_PASSWORD(0x56),
    ERROR_INVALID_PARAMETER(0x57),
    ERROR_NET_WRITE_FAULT(0x58),
    ERROR_NO_PROC_SLOTS(0x59),
    ERROR_TOO_MANY_SEMAPHORES(0x64),
    ERROR_EXCL_SEM_ALREADY_OWNED(0x65),
    ERROR_SEM_IS_SET(0x66),
    ERROR_TOO_MANY_SEM_REQUESTS(0x67),
    ERROR_INVALID_AT_INTERRUPT_TIME(0x68),
    ERROR_SEM_OWNER_DIED(0x69),
    ERROR_SEM_USER_LIMIT(0x6A),
    ERROR_DISK_CHANGE(0x6B),
    ERROR_DRIVE_LOCKED(0x6C),
    ERROR_BROKEN_PIPE(0x6D),
    ERROR_OPEN_FAILED(0x6E),
    ERROR_BUFFER_OVERFLOW(0x6F),
    ERROR_DISK_FULL(0x70),
    ERROR_NO_MORE_SEARCH_HANDLES(0x71),
    ERROR_INVALID_TARGET_HANDLE(0x72),
    ERROR_INVALID_CATEGORY(0x75),
    ERROR_INVALID_VERIFY_SWITCH(0x76),
    ERROR_BAD_DRIVER_LEVEL(0x77),
    ERROR_CALL_NOT_IMPLEMENTED(0x78),
    ERROR_SEM_TIMEOUT(0x79),
    ERROR_INSUFFICIENT_BUFFER(0x7A),
    ERROR_INVALID_NAME(0x7B),
    ERROR_INVALID_LEVEL(0x7C),
    ERROR_NO_VOLUME_LABEL(0x7D),
    ERROR_MOD_NOT_FOUND(0x7E),
    ERROR_PROC_NOT_FOUND(0x7F),
    ERROR_WAIT_NO_CHILDREN(0x80),
    ERROR_CHILD_NOT_COMPLETE(0x81),
    ERROR_DIRECT_ACCESS_HANDLE(0x82),
    ERROR_NEGATIVE_SEEK(0x83),
    ERROR_SEEK_ON_DEVICE(0x84),
    ERROR_IS_JOIN_TARGET(0x85),
    ERROR_IS_JOINED(0x86),
    ERROR_IS_SUBSTED(0x87),
    ERROR_NOT_JOINED(0x88),
    ERROR_NOT_SUBSTED(0x89),
    ERROR_JOIN_TO_JOIN(0x8A),
    ERROR_SUBST_TO_SUBST(0x8B),
    ERROR_JOIN_TO_SUBST(0x8C),
    ERROR_SUBST_TO_JOIN(0x8D),
    ERROR_BUSY_DRIVE(0x8E),
    ERROR_SAME_DRIVE(0x8F),
    ERROR_DIR_NOT_ROOT(0x90),
    ERROR_DIR_NOT_EMPTY(0x91),
    ERROR_IS_SUBST_PATH(0x92),
    ERROR_IS_JOIN_PATH(0x93),
    ERROR_PATH_BUSY(0x94),
    ERROR_IS_SUBST_TARGET(0x95),
    ERROR_SYSTEM_TRACE(0x96),
    ERROR_INVALID_EVENT_COUNT(0x97),
    ERROR_TOO_MANY_MUXWAITERS(0x98),
    ERROR_INVALID_LIST_FORMAT(0x99),
    ERROR_LABEL_TOO_LONG(0x9A),
    ERROR_TOO_MANY_TCBS(0x9B),
    ERROR_SIGNAL_REFUSED(0x9C),
    ERROR_DISCARDED(0x9D),
    ERROR_NOT_LOCKED(0x9E),
    ERROR_BAD_THREADID_ADDR(0x9F),
    ERROR_BAD_ARGUMENTS(0xA0),
    ERROR_BAD_PATHNAME(0xA1),
    ERROR_SIGNAL_PENDING(0xA2),
    ERROR_MAX_THRDS_REACHED(0xA4),
    ERROR_LOCK_FAILED(0xA7),
    ERROR_BUSY(0xAA),
    ERROR_DEVICE_SUPPORT_IN_PROGRESS(0xAB),
    ERROR_CANCEL_VIOLATION(0xAD),
    ERROR_ATOMIC_LOCKS_NOT_SUPPORTED(0xAE),
    ERROR_INVALID_SEGMENT_NUMBER(0xB4),
    ERROR_INVALID_ORDINAL(0xB6),
    ERROR_ALREADY_EXISTS(0xB7),
    ERROR_INVALID_FLAG_NUMBER(0xBA),
    ERROR_SEM_NOT_FOUND(0xBB),
    ERROR_INVALID_STARTING_CODESEG(0xBC),
    ERROR_INVALID_STACKSEG(0xBD),
    ERROR_INVALID_MODULETYPE(0xBE),
    ERROR_INVALID_EXE_SIGNATURE(0xBF),
    ERROR_EXE_MARKED_INVALID(0xC0),
    ERROR_BAD_EXE_FORMAT(0xC1),
    ERROR_ITERATED_DATA_EXCEEDS_64k(0xC2),
    ERROR_INVALID_MINALLOCSIZE(0xC3),
    ERROR_DYNLINK_FROM_INVALID_RING(0xC4),
    ERROR_IOPL_NOT_ENABLED(0xC5),
    ERROR_INVALID_SEGDPL(0xC6),
    ERROR_AUTODATASEG_EXCEEDS_64k(0xC7),
    ERROR_RING2SEG_MUST_BE_MOVABLE(0xC8),
    ERROR_RELOC_CHAIN_XEEDS_SEGLIM(0xC9),
    ERROR_INFLOOP_IN_RELOC_CHAIN(0xCA),
    ERROR_ENVVAR_NOT_FOUND(0xCB),
    ERROR_NO_SIGNAL_SENT(0xCD),
    ERROR_FILENAME_EXCED_RANGE(0xCE),
    ERROR_RING2_STACK_IN_USE(0xCF),
    ERROR_META_EXPANSION_TOO_LONG(0xD0),
    ERROR_INVALID_SIGNAL_NUMBER(0xD1),
    ERROR_THREAD_1_INACTIVE(0xD2),
    ERROR_LOCKED(0xD4),
    ERROR_TOO_MANY_MODULES(0xD6),
    ERROR_NESTING_NOT_ALLOWED(0xD7),
    ERROR_EXE_MACHINE_TYPE_MISMATCH(0xD8),
    ERROR_EXE_CANNOT_MODIFY_SIGNED_BINARY(0xD9),
    ERROR_EXE_CANNOT_MODIFY_STRONG_SIGNED_BINARY(0xDA),
    ERROR_FILE_CHECKED_OUT(0xDC),
    ERROR_CHECKOUT_REQUIRED(0xDD),
    ERROR_BAD_FILE_TYPE(0xDE),
    ERROR_FILE_TOO_LARGE(0xDF),
    ERROR_FORMS_AUTH_REQUIRED(0xE0),
    ERROR_VIRUS_INFECTED(0xE1),
    ERROR_VIRUS_DELETED(0xE2),
    ERROR_PIPE_LOCAL(0xE5),
    ERROR_BAD_PIPE(0xE6),
    ERROR_PIPE_BUSY(0xE7),
    ERROR_NO_DATA(0xE8),
    ERROR_PIPE_NOT_CONNECTED(0xE9),
    ERROR_MORE_DATA(0xEA),
    ERROR_VC_DISCONNECTED(0xF0),
    ERROR_INVALID_EA_NAME(0xFE),
    ERROR_EA_LIST_INCONSISTENT(0xFF),
    WAIT_TIMEOUT(0x102),
    ERROR_NO_MORE_ITEMS(0x103),
    ERROR_CANNOT_COPY(0x10A),
    ERROR_DIRECTORY(0x10B),
    ERROR_EAS_DIDNT_FIT(0x113),
    ERROR_EA_FILE_CORRUPT(0x114),
    ERROR_EA_TABLE_FULL(0x115),
    ERROR_INVALID_EA_HANDLE(0x116),
    ERROR_EAS_NOT_SUPPORTED(0x11A),
    ERROR_NOT_OWNER(0x120),
    ERROR_TOO_MANY_POSTS(0x12A),
    ERROR_PARTIAL_COPY(0x12B),
    ERROR_OPLOCK_NOT_GRANTED(0x12C),
    ERROR_INVALID_OPLOCK_PROTOCOL(0x12D),
    ERROR_DISK_TOO_FRAGMENTED(0x12E),
    ERROR_DELETE_PENDING(0x12F),
    ERROR_INCOMPATIBLE_WITH_GLOBAL_SHORT_NAME_REGISTRY_SETTING(0x130),
    ERROR_SHORT_NAMES_NOT_ENABLED_ON_VOLUME(0x131),
    ERROR_SECURITY_STREAM_IS_INCONSISTENT(0x132),
    ERROR_INVALID_LOCK_RANGE(0x133),
    ERROR_IMAGE_SUBSYSTEM_NOT_PRESENT(0x134),
    ERROR_NOTIFICATION_GUID_ALREADY_DEFINED(0x135),
    ERROR_INVALID_EXCEPTION_HANDLER(0x136),
    ERROR_DUPLICATE_PRIVILEGES(0x137),
    ERROR_NO_RANGES_PROCESSED(0x138),
    ERROR_NOT_ALLOWED_ON_SYSTEM_FILE(0x139),
    ERROR_DISK_RESOURCES_EXHAUSTED(0x13A),
    ERROR_INVALID_TOKEN(0x13B),
    ERROR_DEVICE_FEATURE_NOT_SUPPORTED(0x13C),
    ERROR_MR_MID_NOT_FOUND(0x13D),
    ERROR_SCOPE_NOT_FOUND(0x13E),
    ERROR_UNDEFINED_SCOPE(0x13F),
    ERROR_INVALID_CAP(0x140),
    ERROR_DEVICE_UNREACHABLE(0x141),
    ERROR_DEVICE_NO_RESOURCES(0x142),
    ERROR_DATA_CHECKSUM_ERROR(0x143),
    ERROR_INTERMIXED_KERNEL_EA_OPERATION(0x144),
    ERROR_FILE_LEVEL_TRIM_NOT_SUPPORTED(0x146),
    ERROR_OFFSET_ALIGNMENT_VIOLATION(0x147),
    ERROR_INVALID_FIELD_IN_PARAMETER_LIST(0x148),
    ERROR_OPERATION_IN_PROGRESS(0x149),
    ERROR_BAD_DEVICE_PATH(0x14A),
    ERROR_TOO_MANY_DESCRIPTORS(0x14B),
    ERROR_SCRUB_DATA_DISABLED(0x14C),
    ERROR_NOT_REDUNDANT_STORAGE(0x14D),
    ERROR_RESIDENT_FILE_NOT_SUPPORTED(0x14E),
    ERROR_COMPRESSED_FILE_NOT_SUPPORTED(0x14F),
    ERROR_DIRECTORY_NOT_SUPPORTED(0x150),
    ERROR_NOT_READ_FROM_COPY(0x151),
    ERROR_FAIL_NOACTION_REBOOT(0x15E),
    ERROR_FAIL_SHUTDOWN(0x15F),
    ERROR_FAIL_RESTART(0x160),
    ERROR_MAX_SESSIONS_REACHED(0x161),
    ERROR_THREAD_MODE_ALREADY_BACKGROUND(0x190),
    ERROR_THREAD_MODE_NOT_BACKGROUND(0x191),
    ERROR_PROCESS_MODE_ALREADY_BACKGROUND(0x192),
    ERROR_PROCESS_MODE_NOT_BACKGROUND(0x193),
    ERROR_INVALID_ADDRESS(0x1E7),
    ERROR_USER_PROFILE_LOAD(0x1F4),
    ERROR_ARITHMETIC_OVERFLOW(0x216),
    ERROR_PIPE_CONNECTED(0x217),
    ERROR_PIPE_LISTENING(0x218),
    ERROR_VERIFIER_STOP(0x219),
    ERROR_ABIOS_ERROR(0x21A),
    ERROR_WX86_WARNING(0x21B),
    ERROR_WX86_ERROR(0x21C),
    ERROR_TIMER_NOT_CANCELED(0x21D),
    ERROR_UNWIND(0x21E),
    ERROR_BAD_STACK(0x21F),
    ERROR_INVALID_UNWIND_TARGET(0x220),
    ERROR_INVALID_PORT_ATTRIBUTES(0x221),
    ERROR_PORT_MESSAGE_TOO_LONG(0x222),
    ERROR_INVALID_QUOTA_LOWER(0x223),
    ERROR_DEVICE_ALREADY_ATTACHED(0x224),
    ERROR_INSTRUCTION_MISALIGNMENT(0x225),
    ERROR_PROFILING_NOT_STARTED(0x226),
    ERROR_PROFILING_NOT_STOPPED(0x227),
    ERROR_COULD_NOT_INTERPRET(0x228),
    ERROR_PROFILING_AT_LIMIT(0x229),
    ERROR_CANT_WAIT(0x22A),
    ERROR_CANT_TERMINATE_SELF(0x22B),
    ERROR_UNEXPECTED_MM_CREATE_ERR(0x22C),
    ERROR_UNEXPECTED_MM_MAP_ERROR(0x22D),
    ERROR_UNEXPECTED_MM_EXTEND_ERR(0x22E),
    ERROR_BAD_FUNCTION_TABLE(0x22F),
    ERROR_NO_GUID_TRANSLATION(0x230),
    ERROR_INVALID_LDT_SIZE(0x231),
    ERROR_INVALID_LDT_OFFSET(0x233),
    ERROR_INVALID_LDT_DESCRIPTOR(0x234),
    ERROR_TOO_MANY_THREADS(0x235),
    ERROR_THREAD_NOT_IN_PROCESS(0x236),
    ERROR_PAGEFILE_QUOTA_EXCEEDED(0x237),
    ERROR_LOGON_SERVER_CONFLICT(0x238),
    ERROR_SYNCHRONIZATION_REQUIRED(0x239),
    ERROR_NET_OPEN_FAILED(0x23A),
    ERROR_IO_PRIVILEGE_FAILED(0x23B),
    ERROR_CONTROL_C_EXIT(0x23C),
    ERROR_MISSING_SYSTEMFILE(0x23D),
    ERROR_UNHANDLED_EXCEPTION(0x23E),
    ERROR_APP_INIT_FAILURE(0x23F),
    ERROR_PAGEFILE_CREATE_FAILED(0x240),
    ERROR_INVALID_IMAGE_HASH(0x241),
    ERROR_NO_PAGEFILE(0x242),
    ERROR_ILLEGAL_FLOAT_CONTEXT(0x243),
    ERROR_NO_EVENT_PAIR(0x244),
    ERROR_DOMAIN_CTRLR_CONFIG_ERROR(0x245),
    ERROR_ILLEGAL_CHARACTER(0x246),
    ERROR_UNDEFINED_CHARACTER(0x247),
    ERROR_FLOPPY_VOLUME(0x248),
    ERROR_BIOS_FAILED_TO_CONNECT_INTERRUPT(0x249),
    ERROR_BACKUP_CONTROLLER(0x24A),
    ERROR_MUTANT_LIMIT_EXCEEDED(0x24B),
    ERROR_FS_DRIVER_REQUIRED(0x24C),
    ERROR_CANNOT_LOAD_REGISTRY_FILE(0x24D),
    ERROR_DEBUG_ATTACH_FAILED(0x24E),
    ERROR_SYSTEM_PROCESS_TERMINATED(0x24F),
    ERROR_DATA_NOT_ACCEPTED(0x250),
    ERROR_VDM_HARD_ERROR(0x251),
    ERROR_DRIVER_CANCEL_TIMEOUT(0x252),
    ERROR_REPLY_MESSAGE_MISMATCH(0x253),
    ERROR_LOST_WRITEBEHIND_DATA(0x254),
    ERROR_CLIENT_SERVER_PARAMETERS_INVALID(0x255),
    ERROR_NOT_TINY_STREAM(0x256),
    ERROR_STACK_OVERFLOW_READ(0x257),
    ERROR_CONVERT_TO_LARGE(0x258),
    ERROR_FOUND_OUT_OF_SCOPE(0x259),
    ERROR_ALLOCATE_BUCKET(0x25A),
    ERROR_MARSHALL_OVERFLOW(0x25B),
    ERROR_INVALID_VARIANT(0x25C),
    ERROR_BAD_COMPRESSION_BUFFER(0x25D),
    ERROR_AUDIT_FAILED(0x25E),
    ERROR_TIMER_RESOLUTION_NOT_SET(0x25F),
    ERROR_INSUFFICIENT_LOGON_INFO(0x260),
    ERROR_BAD_DLL_ENTRYPOINT(0x261),
    ERROR_BAD_SERVICE_ENTRYPOINT(0x262),
    ERROR_IP_ADDRESS_CONFLICT1(0x263),
    ERROR_IP_ADDRESS_CONFLICT2(0x264),
    ERROR_REGISTRY_QUOTA_LIMIT(0x265),
    ERROR_NO_CALLBACK_ACTIVE(0x266),
    ERROR_PWD_TOO_SHORT(0x267),
    ERROR_PWD_TOO_RECENT(0x268),
    ERROR_PWD_HISTORY_CONFLICT(0x269),
    ERROR_UNSUPPORTED_COMPRESSION(0x26A),
    ERROR_INVALID_HW_PROFILE(0x26B),
    ERROR_INVALID_PLUGPLAY_DEVICE_PATH(0x26C),
    ERROR_QUOTA_LIST_INCONSISTENT(0x26D),
    ERROR_EVALUATION_EXPIRATION(0x26E),
    ERROR_ILLEGAL_DLL_RELOCATION(0x26F),
    ERROR_DLL_INIT_FAILED_LOGOFF(0x270),
    ERROR_VALIDATE_CONTINUE(0x271),
    ERROR_NO_MORE_MATCHES(0x272),
    ERROR_RANGE_LIST_CONFLICT(0x273),
    ERROR_SERVER_SID_MISMATCH(0x274),
    ERROR_CANT_ENABLE_DENY_ONLY(0x275),
    ERROR_FLOAT_MULTIPLE_FAULTS(0x276),
    ERROR_FLOAT_MULTIPLE_TRAPS(0x277),
    ERROR_NOINTERFACE(0x278),
    ERROR_DRIVER_FAILED_SLEEP(0x279),
    ERROR_CORRUPT_SYSTEM_FILE(0x27A),
    ERROR_COMMITMENT_MINIMUM(0x27B),
    ERROR_PNP_RESTART_ENUMERATION(0x27C),
    ERROR_SYSTEM_IMAGE_BAD_SIGNATURE(0x27D),
    ERROR_PNP_REBOOT_REQUIRED(0x27E),
    ERROR_INSUFFICIENT_POWER(0x27F),
    ERROR_MULTIPLE_FAULT_VIOLATION(0x280),
    ERROR_SYSTEM_SHUTDOWN(0x281),
    ERROR_PORT_NOT_SET(0x282),
    ERROR_DS_VERSION_CHECK_FAILURE(0x283),
    ERROR_RANGE_NOT_FOUND(0x284),
    ERROR_NOT_SAFE_MODE_DRIVER(0x286),
    ERROR_FAILED_DRIVER_ENTRY(0x287),
    ERROR_DEVICE_ENUMERATION_ERROR(0x288),
    ERROR_MOUNT_POINT_NOT_RESOLVED(0x289),
    ERROR_INVALID_DEVICE_OBJECT_PARAMETER(0x28A),
    ERROR_MCA_OCCURED(0x28B),
    ERROR_DRIVER_DATABASE_ERROR(0x28C),
    ERROR_SYSTEM_HIVE_TOO_LARGE(0x28D),
    ERROR_DRIVER_FAILED_PRIOR_UNLOAD(0x28E),
    ERROR_VOLSNAP_PREPARE_HIBERNATE(0x28F),
    ERROR_HIBERNATION_FAILURE(0x290),
    ERROR_PWD_TOO_LONG(0x291),
    ERROR_FILE_SYSTEM_LIMITATION(0x299),
    ERROR_ASSERTION_FAILURE(0x29C),
    ERROR_ACPI_ERROR(0x29D),
    ERROR_WOW_ASSERTION(0x29E),
    ERROR_PNP_BAD_MPS_TABLE(0x29F),
    ERROR_PNP_TRANSLATION_FAILED(0x2A0),
    ERROR_PNP_IRQ_TRANSLATION_FAILED(0x2A1),
    ERROR_PNP_INVALID_ID(0x2A2),
    ERROR_WAKE_SYSTEM_DEBUGGER(0x2A3),
    ERROR_HANDLES_CLOSED(0x2A4),
    ERROR_EXTRANEOUS_INFORMATION(0x2A5),
    ERROR_RXACT_COMMIT_NECESSARY(0x2A6),
    ERROR_MEDIA_CHECK(0x2A7),
    ERROR_GUID_SUBSTITUTION_MADE(0x2A8),
    ERROR_STOPPED_ON_SYMLINK(0x2A9),
    ERROR_LONGJUMP(0x2AA),
    ERROR_PLUGPLAY_QUERY_VETOED(0x2AB),
    ERROR_UNWIND_CONSOLIDATE(0x2AC),
    ERROR_REGISTRY_HIVE_RECOVERED(0x2AD),
    ERROR_DLL_MIGHT_BE_INSECURE(0x2AE),
    ERROR_DLL_MIGHT_BE_INCOMPATIBLE(0x2AF),
    ERROR_DBG_EXCEPTION_NOT_HANDLED(0x2B0),
    ERROR_DBG_REPLY_LATER(0x2B1),
    ERROR_DBG_UNABLE_TO_PROVIDE_HANDLE(0x2B2),
    ERROR_DBG_TERMINATE_THREAD(0x2B3),
    ERROR_DBG_TERMINATE_PROCESS(0x2B4),
    ERROR_DBG_CONTROL_C(0x2B5),
    ERROR_DBG_PRINTEXCEPTION_C(0x2B6),
    ERROR_DBG_RIPEXCEPTION(0x2B7),
    ERROR_DBG_CONTROL_BREAK(0x2B8),
    ERROR_DBG_COMMAND_EXCEPTION(0x2B9),
    ERROR_OBJECT_NAME_EXISTS(0x2BA),
    ERROR_THREAD_WAS_SUSPENDED(0x2BB),
    ERROR_IMAGE_NOT_AT_BASE(0x2BC),
    ERROR_RXACT_STATE_CREATED(0x2BD),
    ERROR_SEGMENT_NOTIFICATION(0x2BE),
    ERROR_BAD_CURRENT_DIRECTORY(0x2BF),
    ERROR_FT_READ_RECOVERY_FROM_BACKUP(0x2C0),
    ERROR_FT_WRITE_RECOVERY(0x2C1),
    ERROR_IMAGE_MACHINE_TYPE_MISMATCH(0x2C2),
    ERROR_RECEIVE_PARTIAL(0x2C3),
    ERROR_RECEIVE_EXPEDITED(0x2C4),
    ERROR_RECEIVE_PARTIAL_EXPEDITED(0x2C5),
    ERROR_EVENT_DONE(0x2C6),
    ERROR_EVENT_PENDING(0x2C7),
    ERROR_CHECKING_FILE_SYSTEM(0x2C8),
    ERROR_FATAL_APP_EXIT(0x2C9),
    ERROR_PREDEFINED_HANDLE(0x2CA),
    ERROR_WAS_UNLOCKED(0x2CB),
    ERROR_SERVICE_NOTIFICATION(0x2CC),
    ERROR_WAS_LOCKED(0x2CD),
    ERROR_LOG_HARD_ERROR(0x2CE),
    ERROR_ALREADY_WIN32(0x2CF),
    ERROR_IMAGE_MACHINE_TYPE_MISMATCH_EXE(0x2D0),
    ERROR_NO_YIELD_PERFORMED(0x2D1),
    ERROR_TIMER_RESUME_IGNORED(0x2D2),
    ERROR_ARBITRATION_UNHANDLED(0x2D3),
    ERROR_CARDBUS_NOT_SUPPORTED(0x2D4),
    ERROR_MP_PROCESSOR_MISMATCH(0x2D5),
    ERROR_HIBERNATED(0x2D6),
    ERROR_RESUME_HIBERNATION(0x2D7),
    ERROR_FIRMWARE_UPDATED(0x2D8),
    ERROR_DRIVERS_LEAKING_LOCKED_PAGES(0x2D9),
    ERROR_WAKE_SYSTEM(0x2DA),
    ERROR_WAIT_1(0x2DB),
    ERROR_WAIT_2(0x2DC),
    ERROR_WAIT_3(0x2DD),
    ERROR_WAIT_63(0x2DE),
    ERROR_ABANDONED_WAIT_0(0x2DF),
    ERROR_ABANDONED_WAIT_63(0x2E0),
    ERROR_USER_APC(0x2E1),
    ERROR_KERNEL_APC(0x2E2),
    ERROR_ALERTED(0x2E3),
    ERROR_ELEVATION_REQUIRED(0x2E4),
    ERROR_REPARSE(0x2E5),
    ERROR_OPLOCK_BREAK_IN_PROGRESS(0x2E6),
    ERROR_VOLUME_MOUNTED(0x2E7),
    ERROR_RXACT_COMMITTED(0x2E8),
    ERROR_NOTIFY_CLEANUP(0x2E9),
    ERROR_PRIMARY_TRANSPORT_CONNECT_FAILED(0x2EA),
    ERROR_PAGE_FAULT_TRANSITION(0x2EB),
    ERROR_PAGE_FAULT_DEMAND_ZERO(0x2EC),
    ERROR_PAGE_FAULT_COPY_ON_WRITE(0x2ED),
    ERROR_PAGE_FAULT_GUARD_PAGE(0x2EE),
    ERROR_PAGE_FAULT_PAGING_FILE(0x2EF),
    ERROR_CACHE_PAGE_LOCKED(0x2F0),
    ERROR_CRASH_DUMP(0x2F1),
    ERROR_BUFFER_ALL_ZEROS(0x2F2),
    ERROR_REPARSE_OBJECT(0x2F3),
    ERROR_RESOURCE_REQUIREMENTS_CHANGED(0x2F4),
    ERROR_TRANSLATION_COMPLETE(0x2F5),
    ERROR_NOTHING_TO_TERMINATE(0x2F6),
    ERROR_PROCESS_NOT_IN_JOB(0x2F7),
    ERROR_PROCESS_IN_JOB(0x2F8),
    ERROR_VOLSNAP_HIBERNATE_READY(0x2F9),
    ERROR_FSFILTER_OP_COMPLETED_SUCCESSFULLY(0x2FA),
    ERROR_INTERRUPT_VECTOR_ALREADY_CONNECTED(0x2FB),
    ERROR_INTERRUPT_STILL_CONNECTED(0x2FC),
    ERROR_WAIT_FOR_OPLOCK(0x2FD),
    ERROR_DBG_EXCEPTION_HANDLED(0x2FE),
    ERROR_DBG_CONTINUE(0x2FF),
    ERROR_CALLBACK_POP_STACK(0x300),
    ERROR_COMPRESSION_DISABLED(0x301),
    ERROR_CANTFETCHBACKWARDS(0x302),
    ERROR_CANTSCROLLBACKWARDS(0x303),
    ERROR_ROWSNOTRELEASED(0x304),
    ERROR_BAD_ACCESSOR_FLAGS(0x305),
    ERROR_ERRORS_ENCOUNTERED(0x306),
    ERROR_NOT_CAPABLE(0x307),
    ERROR_REQUEST_OUT_OF_SEQUENCE(0x308),
    ERROR_VERSION_PARSE_ERROR(0x309),
    ERROR_BADSTARTPOSITION(0x30A),
    ERROR_MEMORY_HARDWARE(0x30B),
    ERROR_DISK_REPAIR_DISABLED(0x30C),
    ERROR_INSUFFICIENT_RESOURCE_FOR_SPECIFIED_SHARED_SECTION_SIZE(0x30D),
    ERROR_SYSTEM_POWERSTATE_TRANSITION(0x30E),
    ERROR_SYSTEM_POWERSTATE_COMPLEX_TRANSITION(0x30F),
    ERROR_MCA_EXCEPTION(0x310),
    ERROR_ACCESS_AUDIT_BY_POLICY(0x311),
    ERROR_ACCESS_DISABLED_NO_SAFER_UI_BY_POLICY(0x312),
    ERROR_ABANDON_HIBERFILE(0x313),
    ERROR_LOST_WRITEBEHIND_DATA_NETWORK_DISCONNECTED(0x314),
    ERROR_LOST_WRITEBEHIND_DATA_NETWORK_SERVER_ERROR(0x315),
    ERROR_LOST_WRITEBEHIND_DATA_LOCAL_DISK_ERROR(0x316),
    ERROR_BAD_MCFG_TABLE(0x317),
    ERROR_DISK_REPAIR_REDIRECTED(0x318),
    ERROR_DISK_REPAIR_UNSUCCESSFUL(0x319),
    ERROR_CORRUPT_LOG_OVERFULL(0x31A),
    ERROR_CORRUPT_LOG_CORRUPTED(0x31B),
    ERROR_CORRUPT_LOG_UNAVAILABLE(0x31C),
    ERROR_CORRUPT_LOG_DELETED_FULL(0x31D),
    ERROR_CORRUPT_LOG_CLEARED(0x31E),
    ERROR_ORPHAN_NAME_EXHAUSTED(0x31F),
    ERROR_OPLOCK_SWITCHED_TO_NEW_HANDLE(0x320),
    ERROR_CANNOT_GRANT_REQUESTED_OPLOCK(0x321),
    ERROR_CANNOT_BREAK_OPLOCK(0x322),
    ERROR_OPLOCK_HANDLE_CLOSED(0x323),
    ERROR_NO_ACE_CONDITION(0x324),
    ERROR_INVALID_ACE_CONDITION(0x325),
    ERROR_FILE_HANDLE_REVOKED(0x326),
    ERROR_IMAGE_AT_DIFFERENT_BASE(0x327),
    ERROR_EA_ACCESS_DENIED(0x3E2),
    ERROR_OPERATION_ABORTED(0x3E3),
    ERROR_IO_INCOMPLETE(0x3E4),
    ERROR_IO_PENDING(0x3E5),
    ERROR_NOACCESS(0x3E6),
    ERROR_SWAPERROR(0x3E7),
    ERROR_STACK_OVERFLOW(0x3E9),
    ERROR_INVALID_MESSAGE(0x3EA),
    ERROR_CAN_NOT_COMPLETE(0x3EB),
    ERROR_INVALID_FLAGS(0x3EC),
    ERROR_UNRECOGNIZED_VOLUME(0x3ED),
    ERROR_FILE_INVALID(0x3EE),
    ERROR_FULLSCREEN_MODE(0x3EF),
    ERROR_NO_TOKEN(0x3F0),
    ERROR_BADDB(0x3F1),
    ERROR_BADKEY(0x3F2),
    ERROR_CANTOPEN(0x3F3),
    ERROR_CANTREAD(0x3F4),
    ERROR_CANTWRITE(0x3F5),
    ERROR_REGISTRY_RECOVERED(0x3F6),
    ERROR_REGISTRY_CORRUPT(0x3F7),
    ERROR_REGISTRY_IO_FAILED(0x3F8),
    ERROR_NOT_REGISTRY_FILE(0x3F9),
    ERROR_KEY_DELETED(0x3FA),
    ERROR_NO_LOG_SPACE(0x3FB),
    ERROR_KEY_HAS_CHILDREN(0x3FC),
    ERROR_CHILD_MUST_BE_VOLATILE(0x3FD),
    ERROR_NOTIFY_ENUM_DIR(0x3FE),
    ERROR_DEPENDENT_SERVICES_RUNNING(0x41B),
    ERROR_INVALID_SERVICE_CONTROL(0x41C),
    ERROR_SERVICE_REQUEST_TIMEOUT(0x41D),
    ERROR_SERVICE_NO_THREAD(0x41E),
    ERROR_SERVICE_DATABASE_LOCKED(0x41F),
    ERROR_SERVICE_ALREADY_RUNNING(0x420),
    ERROR_INVALID_SERVICE_ACCOUNT(0x421),
    ERROR_SERVICE_DISABLED(0x422),
    ERROR_CIRCULAR_DEPENDENCY(0x423),
    ERROR_SERVICE_DOES_NOT_EXIST(0x424),
    ERROR_SERVICE_CANNOT_ACCEPT_CTRL(0x425),
    ERROR_SERVICE_NOT_ACTIVE(0x426),
    ERROR_FAILED_SERVICE_CONTROLLER_CONNECT(0x427),
    ERROR_EXCEPTION_IN_SERVICE(0x428),
    ERROR_DATABASE_DOES_NOT_EXIST(0x429),
    ERROR_SERVICE_SPECIFIC_ERROR(0x42A),
    ERROR_PROCESS_ABORTED(0x42B),
    ERROR_SERVICE_DEPENDENCY_FAIL(0x42C),
    ERROR_SERVICE_LOGON_FAILED(0x42D),
    ERROR_SERVICE_START_HANG(0x42E),
    ERROR_INVALID_SERVICE_LOCK(0x42F),
    ERROR_SERVICE_MARKED_FOR_DELETE(0x430),
    ERROR_SERVICE_EXISTS(0x431),
    ERROR_ALREADY_RUNNING_LKG(0x432),
    ERROR_SERVICE_DEPENDENCY_DELETED(0x433),
    ERROR_BOOT_ALREADY_ACCEPTED(0x434),
    ERROR_SERVICE_NEVER_STARTED(0x435),
    ERROR_DUPLICATE_SERVICE_NAME(0x436),
    ERROR_DIFFERENT_SERVICE_ACCOUNT(0x437),
    ERROR_CANNOT_DETECT_DRIVER_FAILURE(0x438),
    ERROR_CANNOT_DETECT_PROCESS_ABORT(0x439),
    ERROR_NO_RECOVERY_PROGRAM(0x43A),
    ERROR_SERVICE_NOT_IN_EXE(0x43B),
    ERROR_NOT_SAFEBOOT_SERVICE(0x43C),
    ERROR_END_OF_MEDIA(0x44C),
    ERROR_FILEMARK_DETECTED(0x44D),
    ERROR_BEGINNING_OF_MEDIA(0x44E),
    ERROR_SETMARK_DETECTED(0x44F),
    ERROR_NO_DATA_DETECTED(0x450),
    ERROR_PARTITION_FAILURE(0x451),
    ERROR_INVALID_BLOCK_LENGTH(0x452),
    ERROR_DEVICE_NOT_PARTITIONED(0x453),
    ERROR_UNABLE_TO_LOCK_MEDIA(0x454),
    ERROR_UNABLE_TO_UNLOAD_MEDIA(0x455),
    ERROR_MEDIA_CHANGED(0x456),
    ERROR_BUS_RESET(0x457),
    ERROR_NO_MEDIA_IN_DRIVE(0x458),
    ERROR_NO_UNICODE_TRANSLATION(0x459),
    ERROR_DLL_INIT_FAILED(0x45A),
    ERROR_SHUTDOWN_IN_PROGRESS(0x45B),
    ERROR_NO_SHUTDOWN_IN_PROGRESS(0x45C),
    ERROR_IO_DEVICE(0x45D),
    ERROR_SERIAL_NO_DEVICE(0x45E),
    ERROR_IRQ_BUSY(0x45F),
    ERROR_MORE_WRITES(0x460),
    ERROR_COUNTER_TIMEOUT(0x461),
    ERROR_FLOPPY_ID_MARK_NOT_FOUND(0x462),
    ERROR_FLOPPY_WRONG_CYLINDER(0x463),
    ERROR_FLOPPY_UNKNOWN_ERROR(0x464),
    ERROR_FLOPPY_BAD_REGISTERS(0x465),
    ERROR_DISK_RECALIBRATE_FAILED(0x466),
    ERROR_DISK_OPERATION_FAILED(0x467),
    ERROR_DISK_RESET_FAILED(0x468),
    ERROR_EOM_OVERFLOW(0x469),
    ERROR_NOT_ENOUGH_SERVER_MEMORY(0x46A),
    ERROR_POSSIBLE_DEADLOCK(0x46B),
    ERROR_MAPPED_ALIGNMENT(0x46C),
    ERROR_SET_POWER_STATE_VETOED(0x474),
    ERROR_SET_POWER_STATE_FAILED(0x475),
    ERROR_TOO_MANY_LINKS(0x476),
    ERROR_OLD_WIN_VERSION(0x47E),
    ERROR_APP_WRONG_OS(0x47F),
    ERROR_SINGLE_INSTANCE_APP(0x480),
    ERROR_RMODE_APP(0x481),
    ERROR_INVALID_DLL(0x482),
    ERROR_NO_ASSOCIATION(0x483),
    ERROR_DDE_FAIL(0x484),
    ERROR_DLL_NOT_FOUND(0x485),
    ERROR_NO_MORE_USER_HANDLES(0x486),
    ERROR_MESSAGE_SYNC_ONLY(0x487),
    ERROR_SOURCE_ELEMENT_EMPTY(0x488),
    ERROR_DESTINATION_ELEMENT_FULL(0x489),
    ERROR_ILLEGAL_ELEMENT_ADDRESS(0x48A),
    ERROR_MAGAZINE_NOT_PRESENT(0x48B),
    ERROR_DEVICE_REINITIALIZATION_NEEDED(0x48C),
    ERROR_DEVICE_REQUIRES_CLEANING(0x48D),
    ERROR_DEVICE_DOOR_OPEN(0x48E),
    ERROR_DEVICE_NOT_CONNECTED(0x48F),
    ERROR_NOT_FOUND(0x490),
    ERROR_NO_MATCH(0x491),
    ERROR_SET_NOT_FOUND(0x492),
    ERROR_POINT_NOT_FOUND(0x493),
    ERROR_NO_TRACKING_SERVICE(0x494),
    ERROR_NO_VOLUME_ID(0x495),
    ERROR_UNABLE_TO_REMOVE_REPLACED(0x497),
    ERROR_UNABLE_TO_MOVE_REPLACEMENT(0x498),
    ERROR_UNABLE_TO_MOVE_REPLACEMENT_2(0x499),
    ERROR_JOURNAL_DELETE_IN_PROGRESS(0x49A),
    ERROR_JOURNAL_NOT_ACTIVE(0x49B),
    ERROR_POTENTIAL_FILE_FOUND(0x49C),
    ERROR_JOURNAL_ENTRY_DELETED(0x49D),
    ERROR_SHUTDOWN_IS_SCHEDULED(0x4A6),
    ERROR_SHUTDOWN_USERS_LOGGED_ON(0x4A7),
    ERROR_BAD_DEVICE(0x4B0),
    ERROR_CONNECTION_UNAVAIL(0x4B1),
    ERROR_DEVICE_ALREADY_REMEMBERED(0x4B2),
    ERROR_NO_NET_OR_BAD_PATH(0x4B3),
    ERROR_BAD_PROVIDER(0x4B4),
    ERROR_CANNOT_OPEN_PROFILE(0x4B5),
    ERROR_BAD_PROFILE(0x4B6),
    ERROR_NOT_CONTAINER(0x4B7),
    ERROR_EXTENDED_ERROR(0x4B8),
    ERROR_INVALID_GROUPNAME(0x4B9),
    ERROR_INVALID_COMPUTERNAME(0x4BA),
    ERROR_INVALID_EVENTNAME(0x4BB),
    ERROR_INVALID_DOMAINNAME(0x4BC),
    ERROR_INVALID_SERVICENAME(0x4BD),
    ERROR_INVALID_NETNAME(0x4BE),
    ERROR_INVALID_SHARENAME(0x4BF),
    ERROR_INVALID_PASSWORDNAME(0x4C0),
    ERROR_INVALID_MESSAGENAME(0x4C1),
    ERROR_INVALID_MESSAGEDEST(0x4C2),
    ERROR_SESSION_CREDENTIAL_CONFLICT(0x4C3),
    ERROR_REMOTE_SESSION_LIMIT_EXCEEDED(0x4C4),
    ERROR_DUP_DOMAINNAME(0x4C5),
    ERROR_NO_NETWORK(0x4C6),
    ERROR_CANCELLED(0x4C7),
    ERROR_USER_MAPPED_FILE(0x4C8),
    ERROR_CONNECTION_REFUSED(0x4C9),
    ERROR_GRACEFUL_DISCONNECT(0x4CA),
    ERROR_ADDRESS_ALREADY_ASSOCIATED(0x4CB),
    ERROR_ADDRESS_NOT_ASSOCIATED(0x4CC),
    ERROR_CONNECTION_INVALID(0x4CD),
    ERROR_CONNECTION_ACTIVE(0x4CE),
    ERROR_NETWORK_UNREACHABLE(0x4CF),
    ERROR_HOST_UNREACHABLE(0x4D0),
    ERROR_PROTOCOL_UNREACHABLE(0x4D1),
    ERROR_PORT_UNREACHABLE(0x4D2),
    ERROR_REQUEST_ABORTED(0x4D3),
    ERROR_CONNECTION_ABORTED(0x4D4),
    ERROR_RETRY(0x4D5),
    ERROR_CONNECTION_COUNT_LIMIT(0x4D6),
    ERROR_LOGIN_TIME_RESTRICTION(0x4D7),
    ERROR_LOGIN_WKSTA_RESTRICTION(0x4D8),
    ERROR_INCORRECT_ADDRESS(0x4D9),
    ERROR_ALREADY_REGISTERED(0x4DA),
    ERROR_SERVICE_NOT_FOUND(0x4DB),
    ERROR_NOT_AUTHENTICATED(0x4DC),
    ERROR_NOT_LOGGED_ON(0x4DD),
    ERROR_CONTINUE(0x4DE),
    ERROR_ALREADY_INITIALIZED(0x4DF),
    ERROR_NO_MORE_DEVICES(0x4E0),
    ERROR_NO_SUCH_SITE(0x4E1),
    ERROR_DOMAIN_CONTROLLER_EXISTS(0x4E2),
    ERROR_ONLY_IF_CONNECTED(0x4E3),
    ERROR_OVERRIDE_NOCHANGES(0x4E4),
    ERROR_BAD_USER_PROFILE(0x4E5),
    ERROR_NOT_SUPPORTED_ON_SBS(0x4E6),
    ERROR_SERVER_SHUTDOWN_IN_PROGRESS(0x4E7),
    ERROR_HOST_DOWN(0x4E8),
    ERROR_NON_ACCOUNT_SID(0x4E9),
    ERROR_NON_DOMAIN_SID(0x4EA),
    ERROR_APPHELP_BLOCK(0x4EB),
    ERROR_ACCESS_DISABLED_BY_POLICY(0x4EC),
    ERROR_REG_NAT_CONSUMPTION(0x4ED),
    ERROR_CSCSHARE_OFFLINE(0x4EE),
    ERROR_PKINIT_FAILURE(0x4EF),
    ERROR_SMARTCARD_SUBSYSTEM_FAILURE(0x4F0),
    ERROR_DOWNGRADE_DETECTED(0x4F1),
    ERROR_MACHINE_LOCKED(0x4F7),
    ERROR_CALLBACK_SUPPLIED_INVALID_DATA(0x4F9),
    ERROR_SYNC_FOREGROUND_REFRESH_REQUIRED(0x4FA),
    ERROR_DRIVER_BLOCKED(0x4FB),
    ERROR_INVALID_IMPORT_OF_NON_DLL(0x4FC),
    ERROR_ACCESS_DISABLED_WEBBLADE(0x4FD),
    ERROR_ACCESS_DISABLED_WEBBLADE_TAMPER(0x4FE),
    ERROR_RECOVERY_FAILURE(0x4FF),
    ERROR_ALREADY_FIBER(0x500),
    ERROR_ALREADY_THREAD(0x501),
    ERROR_STACK_BUFFER_OVERRUN(0x502),
    ERROR_PARAMETER_QUOTA_EXCEEDED(0x503),
    ERROR_DEBUGGER_INACTIVE(0x504),
    ERROR_DELAY_LOAD_FAILED(0x505),
    ERROR_VDM_DISALLOWED(0x506),
    ERROR_UNIDENTIFIED_ERROR(0x507),
    ERROR_INVALID_CRUNTIME_PARAMETER(0x508),
    ERROR_BEYOND_VDL(0x509),
    ERROR_INCOMPATIBLE_SERVICE_SID_TYPE(0x50A),
    ERROR_DRIVER_PROCESS_TERMINATED(0x50B),
    ERROR_IMPLEMENTATION_LIMIT(0x50C),
    ERROR_PROCESS_IS_PROTECTED(0x50D),
    ERROR_SERVICE_NOTIFY_CLIENT_LAGGING(0x50E),
    ERROR_DISK_QUOTA_EXCEEDED(0x50F),
    ERROR_CONTENT_BLOCKED(0x510),
    ERROR_INCOMPATIBLE_SERVICE_PRIVILEGE(0x511),
    ERROR_APP_HANG(0x512),
    ERROR_INVALID_LABEL(0x513),
    ERROR_NOT_ALL_ASSIGNED(0x514),
    ERROR_SOME_NOT_MAPPED(0x515),
    ERROR_NO_QUOTAS_FOR_ACCOUNT(0x516),
    ERROR_LOCAL_USER_SESSION_KEY(0x517),
    ERROR_NULL_LM_PASSWORD(0x518),
    ERROR_UNKNOWN_REVISION(0x519),
    ERROR_REVISION_MISMATCH(0x51A),
    ERROR_INVALID_OWNER(0x51B),
    ERROR_INVALID_PRIMARY_GROUP(0x51C),
    ERROR_NO_IMPERSONATION_TOKEN(0x51D),
    ERROR_CANT_DISABLE_MANDATORY(0x51E),
    ERROR_NO_LOGON_SERVERS(0x51F),
    ERROR_NO_SUCH_LOGON_SESSION(0x520),
    ERROR_NO_SUCH_PRIVILEGE(0x521),
    ERROR_PRIVILEGE_NOT_HELD(0x522),
    ERROR_INVALID_ACCOUNT_NAME(0x523),
    ERROR_USER_EXISTS(0x524),
    ERROR_NO_SUCH_USER(0x525),
    ERROR_GROUP_EXISTS(0x526),
    ERROR_NO_SUCH_GROUP(0x527),
    ERROR_MEMBER_IN_GROUP(0x528),
    ERROR_MEMBER_NOT_IN_GROUP(0x529),
    ERROR_LAST_ADMIN(0x52A),
    ERROR_WRONG_PASSWORD(0x52B),
    ERROR_ILL_FORMED_PASSWORD(0x52C),
    ERROR_PASSWORD_RESTRICTION(0x52D),
    ERROR_LOGON_FAILURE(0x52E),
    ERROR_ACCOUNT_RESTRICTION(0x52F),
    ERROR_INVALID_LOGON_HOURS(0x530),
    ERROR_INVALID_WORKSTATION(0x531),
    ERROR_PASSWORD_EXPIRED(0x532),
    ERROR_ACCOUNT_DISABLED(0x533),
    ERROR_NONE_MAPPED(0x534),
    ERROR_TOO_MANY_LUIDS_REQUESTED(0x535),
    ERROR_LUIDS_EXHAUSTED(0x536),
    ERROR_INVALID_SUB_AUTHORITY(0x537),
    ERROR_INVALID_ACL(0x538),
    ERROR_INVALID_SID(0x539),
    ERROR_INVALID_SECURITY_DESCR(0x53A),
    ERROR_BAD_INHERITANCE_ACL(0x53C),
    ERROR_SERVER_DISABLED(0x53D),
    ERROR_SERVER_NOT_DISABLED(0x53E),
    ERROR_INVALID_ID_AUTHORITY(0x53F),
    ERROR_ALLOTTED_SPACE_EXCEEDED(0x540),
    ERROR_INVALID_GROUP_ATTRIBUTES(0x541),
    ERROR_BAD_IMPERSONATION_LEVEL(0x542),
    ERROR_CANT_OPEN_ANONYMOUS(0x543),
    ERROR_BAD_VALIDATION_CLASS(0x544),
    ERROR_BAD_TOKEN_TYPE(0x545),
    ERROR_NO_SECURITY_ON_OBJECT(0x546),
    ERROR_CANT_ACCESS_DOMAIN_INFO(0x547),
    ERROR_INVALID_SERVER_STATE(0x548),
    ERROR_INVALID_DOMAIN_STATE(0x549),
    ERROR_INVALID_DOMAIN_ROLE(0x54A),
    ERROR_NO_SUCH_DOMAIN(0x54B),
    ERROR_DOMAIN_EXISTS(0x54C),
    ERROR_DOMAIN_LIMIT_EXCEEDED(0x54D),
    ERROR_INTERNAL_DB_CORRUPTION(0x54E),
    ERROR_INTERNAL_ERROR(0x54F),
    ERROR_GENERIC_NOT_MAPPED(0x550),
    ERROR_BAD_DESCRIPTOR_FORMAT(0x551),
    ERROR_NOT_LOGON_PROCESS(0x552),
    ERROR_LOGON_SESSION_EXISTS(0x553),
    ERROR_NO_SUCH_PACKAGE(0x554),
    ERROR_BAD_LOGON_SESSION_STATE(0x555),
    ERROR_LOGON_SESSION_COLLISION(0x556),
    ERROR_INVALID_LOGON_TYPE(0x557),
    ERROR_CANNOT_IMPERSONATE(0x558),
    ERROR_RXACT_INVALID_STATE(0x559),
    ERROR_RXACT_COMMIT_FAILURE(0x55A),
    ERROR_SPECIAL_ACCOUNT(0x55B),
    ERROR_SPECIAL_GROUP(0x55C),
    ERROR_SPECIAL_USER(0x55D),
    ERROR_MEMBERS_PRIMARY_GROUP(0x55E),
    ERROR_TOKEN_ALREADY_IN_USE(0x55F),
    ERROR_NO_SUCH_ALIAS(0x560),
    ERROR_MEMBER_NOT_IN_ALIAS(0x561),
    ERROR_MEMBER_IN_ALIAS(0x562),
    ERROR_ALIAS_EXISTS(0x563),
    ERROR_LOGON_NOT_GRANTED(0x564),
    ERROR_TOO_MANY_SECRETS(0x565),
    ERROR_SECRET_TOO_LONG(0x566),
    ERROR_INTERNAL_DB_ERROR(0x567),
    ERROR_TOO_MANY_CONTEXT_IDS(0x568),
    ERROR_LOGON_TYPE_NOT_GRANTED(0x569),
    ERROR_NT_CROSS_ENCRYPTION_REQUIRED(0x56A),
    ERROR_NO_SUCH_MEMBER(0x56B),
    ERROR_INVALID_MEMBER(0x56C),
    ERROR_TOO_MANY_SIDS(0x56D),
    ERROR_LM_CROSS_ENCRYPTION_REQUIRED(0x56E),
    ERROR_NO_INHERITANCE(0x56F),
    ERROR_FILE_CORRUPT(0x570),
    ERROR_DISK_CORRUPT(0x571),
    ERROR_NO_USER_SESSION_KEY(0x572),
    ERROR_LICENSE_QUOTA_EXCEEDED(0x573),
    ERROR_WRONG_TARGET_NAME(0x574),
    ERROR_MUTUAL_AUTH_FAILED(0x575),
    ERROR_TIME_SKEW(0x576),
    ERROR_CURRENT_DOMAIN_NOT_ALLOWED(0x577),
    ERROR_INVALID_WINDOW_HANDLE(0x578),
    ERROR_INVALID_MENU_HANDLE(0x579),
    ERROR_INVALID_CURSOR_HANDLE(0x57A),
    ERROR_INVALID_ACCEL_HANDLE(0x57B),
    ERROR_INVALID_HOOK_HANDLE(0x57C),
    ERROR_INVALID_DWP_HANDLE(0x57D),
    ERROR_TLW_WITH_WSCHILD(0x57E),
    ERROR_CANNOT_FIND_WND_CLASS(0x57F),
    ERROR_WINDOW_OF_OTHER_THREAD(0x580),
    ERROR_HOTKEY_ALREADY_REGISTERED(0x581),
    ERROR_CLASS_ALREADY_EXISTS(0x582),
    ERROR_CLASS_DOES_NOT_EXIST(0x583),
    ERROR_CLASS_HAS_WINDOWS(0x584),
    ERROR_INVALID_INDEX(0x585),
    ERROR_INVALID_ICON_HANDLE(0x586),
    ERROR_PRIVATE_DIALOG_INDEX(0x587),
    ERROR_LISTBOX_ID_NOT_FOUND(0x588),
    ERROR_NO_WILDCARD_CHARACTERS(0x589),
    ERROR_CLIPBOARD_NOT_OPEN(0x58A),
    ERROR_HOTKEY_NOT_REGISTERED(0x58B),
    ERROR_WINDOW_NOT_DIALOG(0x58C),
    ERROR_CONTROL_ID_NOT_FOUND(0x58D),
    ERROR_INVALID_COMBOBOX_MESSAGE(0x58E),
    ERROR_WINDOW_NOT_COMBOBOX(0x58F),
    ERROR_INVALID_EDIT_HEIGHT(0x590),
    ERROR_DC_NOT_FOUND(0x591),
    ERROR_INVALID_HOOK_FILTER(0x592),
    ERROR_INVALID_FILTER_PROC(0x593),
    ERROR_HOOK_NEEDS_HMOD(0x594),
    ERROR_GLOBAL_ONLY_HOOK(0x595),
    ERROR_JOURNAL_HOOK_SET(0x596),
    ERROR_HOOK_NOT_INSTALLED(0x597),
    ERROR_INVALID_LB_MESSAGE(0x598),
    ERROR_SETCOUNT_ON_BAD_LB(0x599),
    ERROR_LB_WITHOUT_TABSTOPS(0x59A),
    ERROR_DESTROY_OBJECT_OF_OTHER_THREAD(0x59B),
    ERROR_CHILD_WINDOW_MENU(0x59C),
    ERROR_NO_SYSTEM_MENU(0x59D),
    ERROR_INVALID_MSGBOX_STYLE(0x59E),
    ERROR_INVALID_SPI_VALUE(0x59F),
    ERROR_SCREEN_ALREADY_LOCKED(0x5A0),
    ERROR_HWNDS_HAVE_DIFF_PARENT(0x5A1),
    ERROR_NOT_CHILD_WINDOW(0x5A2),
    ERROR_INVALID_GW_COMMAND(0x5A3),
    ERROR_INVALID_THREAD_ID(0x5A4),
    ERROR_NON_MDICHILD_WINDOW(0x5A5),
    ERROR_POPUP_ALREADY_ACTIVE(0x5A6),
    ERROR_NO_SCROLLBARS(0x5A7),
    ERROR_INVALID_SCROLLBAR_RANGE(0x5A8),
    ERROR_INVALID_SHOWWIN_COMMAND(0x5A9),
    ERROR_NO_SYSTEM_RESOURCES(0x5AA),
    ERROR_NONPAGED_SYSTEM_RESOURCES(0x5AB),
    ERROR_PAGED_SYSTEM_RESOURCES(0x5AC),
    ERROR_WORKING_SET_QUOTA(0x5AD),
    ERROR_PAGEFILE_QUOTA(0x5AE),
    ERROR_COMMITMENT_LIMIT(0x5AF),
    ERROR_MENU_ITEM_NOT_FOUND(0x5B0),
    ERROR_INVALID_KEYBOARD_HANDLE(0x5B1),
    ERROR_HOOK_TYPE_NOT_ALLOWED(0x5B2),
    ERROR_REQUIRES_INTERACTIVE_WINDOWSTATION(0x5B3),
    ERROR_TIMEOUT(0x5B4),
    ERROR_INVALID_MONITOR_HANDLE(0x5B5),
    ERROR_INCORRECT_SIZE(0x5B6),
    ERROR_SYMLINK_CLASS_DISABLED(0x5B7),
    ERROR_SYMLINK_NOT_SUPPORTED(0x5B8),
    ERROR_XML_PARSE_ERROR(0x5B9),
    ERROR_XMLDSIG_ERROR(0x5BA),
    ERROR_RESTART_APPLICATION(0x5BB),
    ERROR_WRONG_COMPARTMENT(0x5BC),
    ERROR_AUTHIP_FAILURE(0x5BD),
    ERROR_NO_NVRAM_RESOURCES(0x5BE),
    ERROR_NOT_GUI_PROCESS(0x5BF),
    ERROR_EVENTLOG_FILE_CORRUPT(0x5DC),
    ERROR_EVENTLOG_CANT_START(0x5DD),
    ERROR_LOG_FILE_FULL(0x5DE),
    ERROR_EVENTLOG_FILE_CHANGED(0x5DF),
    ERROR_INVALID_TASK_NAME(0x60E),
    ERROR_INVALID_TASK_INDEX(0x60F),
    ERROR_THREAD_ALREADY_IN_TASK(0x610),
    ERROR_INSTALL_SERVICE_FAILURE(0x641),
    ERROR_INSTALL_USEREXIT(0x642),
    ERROR_INSTALL_FAILURE(0x643),
    ERROR_INSTALL_SUSPEND(0x644),
    ERROR_UNKNOWN_PRODUCT(0x645),
    ERROR_UNKNOWN_FEATURE(0x646),
    ERROR_UNKNOWN_COMPONENT(0x647),
    ERROR_UNKNOWN_PROPERTY(0x648),
    ERROR_INVALID_HANDLE_STATE(0x649),
    ERROR_BAD_CONFIGURATION(0x64A),
    ERROR_INDEX_ABSENT(0x64B),
    ERROR_INSTALL_SOURCE_ABSENT(0x64C),
    ERROR_INSTALL_PACKAGE_VERSION(0x64D),
    ERROR_PRODUCT_UNINSTALLED(0x64E),
    ERROR_BAD_QUERY_SYNTAX(0x64F),
    ERROR_INVALID_FIELD(0x650),
    ERROR_DEVICE_REMOVED(0x651),
    ERROR_INSTALL_ALREADY_RUNNING(0x652),
    ERROR_INSTALL_PACKAGE_OPEN_FAILED(0x653),
    ERROR_INSTALL_PACKAGE_INVALID(0x654),
    ERROR_INSTALL_UI_FAILURE(0x655),
    ERROR_INSTALL_LOG_FAILURE(0x656),
    ERROR_INSTALL_LANGUAGE_UNSUPPORTED(0x657),
    ERROR_INSTALL_TRANSFORM_FAILURE(0x658),
    ERROR_INSTALL_PACKAGE_REJECTED(0x659),
    ERROR_FUNCTION_NOT_CALLED(0x65A),
    ERROR_FUNCTION_FAILED(0x65B),
    ERROR_INVALID_TABLE(0x65C),
    ERROR_DATATYPE_MISMATCH(0x65D),
    ERROR_UNSUPPORTED_TYPE(0x65E),
    ERROR_CREATE_FAILED(0x65F),
    ERROR_INSTALL_TEMP_UNWRITABLE(0x660),
    ERROR_INSTALL_PLATFORM_UNSUPPORTED(0x661),
    ERROR_INSTALL_NOTUSED(0x662),
    ERROR_PATCH_PACKAGE_OPEN_FAILED(0x663),
    ERROR_PATCH_PACKAGE_INVALID(0x664),
    ERROR_PATCH_PACKAGE_UNSUPPORTED(0x665),
    ERROR_PRODUCT_VERSION(0x666),
    ERROR_INVALID_COMMAND_LINE(0x667),
    ERROR_INSTALL_REMOTE_DISALLOWED(0x668),
    ERROR_SUCCESS_REBOOT_INITIATED(0x669),
    ERROR_PATCH_TARGET_NOT_FOUND(0x66A),
    ERROR_PATCH_PACKAGE_REJECTED(0x66B),
    ERROR_INSTALL_TRANSFORM_REJECTED(0x66C),
    ERROR_INSTALL_REMOTE_PROHIBITED(0x66D),
    ERROR_PATCH_REMOVAL_UNSUPPORTED(0x66E),
    ERROR_UNKNOWN_PATCH(0x66F),
    ERROR_PATCH_NO_SEQUENCE(0x670),
    ERROR_PATCH_REMOVAL_DISALLOWED(0x671),
    ERROR_INVALID_PATCH_XML(0x672),
    ERROR_PATCH_MANAGED_ADVERTISED_PRODUCT(0x673),
    ERROR_INSTALL_SERVICE_SAFEBOOT(0x674),
    ERROR_FAIL_FAST_EXCEPTION(0x675),
    ERROR_INSTALL_REJECTED(0x676);

    private final int errorCode;
    private static final Map<Integer, SystemErrorCode> errorCodes = new HashMap<>();

    private SystemErrorCode(final int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public boolean is(final int errorCode) {
        return this.errorCode == errorCode;
    }

    public static SystemErrorCode getErrorCode(final int errorCode) {
        return errorCodes.get(errorCode);
    }

    static {
        for (final SystemErrorCode errorCode : SystemErrorCode.values()) {
            errorCodes.put(errorCode.getErrorCode(), errorCode);
        }
    }
}