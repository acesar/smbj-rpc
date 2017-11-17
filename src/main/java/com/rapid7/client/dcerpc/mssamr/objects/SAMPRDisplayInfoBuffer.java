/**
 * Copyright 2017, Rapid7, Inc.
 *
 * License: BSD-3-clause
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of the copyright holder nor the names of its contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 */
package com.rapid7.client.dcerpc.mssamr.objects;

import java.io.IOException;
import com.rapid7.client.dcerpc.io.PacketInput;
import com.rapid7.client.dcerpc.io.ndr.Unmarshallable;

/**
 * <pre>
 * typedef
 * [switch_type(DOMAIN_DISPLAY_INFORMATION)]
 * union _SAMPR_DISPLAY_INFO_BUFFER {
 *   [case(DomainDisplayUser)]
 *     SAMPR_DOMAIN_DISPLAY_USER_BUFFER UserInformation;
 *   [case(DomainDisplayMachine)]
 *     SAMPR_DOMAIN_DISPLAY_MACHINE_BUFFER MachineInformation;
 *   [case(DomainDisplayGroup)]
 *     SAMPR_DOMAIN_DISPLAY_GROUP_BUFFER GroupInformation;
 *   [case(DomainDisplayOemUser)]
 *     SAMPR_DOMAIN_DISPLAY_OEM_USER_BUFFER OemUserInformation;
 *   [case(DomainDisplayOemGroup)]
 *     SAMPR_DOMAIN_DISPLAY_OEM_GROUP_BUFFER OemGroupInformation;
 * } SAMPR_DISPLAY_INFO_BUFFER,
 *  *PSAMPR_DISPLAY_INFO_BUFFER;
 * </pre>
 */
public abstract class SAMPRDisplayInfoBuffer<T extends Unmarshallable> extends SAMPREnumerationBuffer<T>
        implements Unmarshallable {
    protected DisplayInformationClass infoClass;

    @Override
    public void unmarshalEntity(PacketInput in) throws IOException {
        // The struct that references this struct is exclusively aligned to 4.
        // in.align(Alignment.FOUR);
        int infoLevel = in.readInt();
        infoClass = DisplayInformationClass.values()[infoLevel - 1];
        super.unmarshalEntity(in);
    }
}