package com.google.android.gms.setupservices.item;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import com.google.android.setupdesign.items.SwitchItem;
import epdd;
import epdr;
import epel;
import grmb;
import grmf;
import grmi;
import grno;
import grnp;

public class GoogleServicesSwitchItem extends SwitchItem implements epdd {
    public epdr a;
    public epdr b;

    @Override  // epdd
    public final int b() {
        return 0x7F0B1F73;  // id:section_device_maintenance
    }

    @Override  // epdd
    public final epel h() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grmb.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
        grno grno0 = this.p ? grno.b : grno.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((grnp)hftp1.b_message).c = grno0.d;
        ((grnp)hftp1.b_message).b |= 1;
        grnp grnp0 = (grnp)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grmb grmb0 = (grmb)hftp0.b_message;
        grnp0.getClass();
        grmb0.d = grnp0;
        grmb0.b |= 2;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grmi.a).v_newBuilder();
        epdr epdr0 = this.a;
        if(epdr0 != null) {
            grmf grmf0 = epdr0.d();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            grmi grmi0 = (grmi)hftp2.b_message;
            grmf0.getClass();
            grmi0.d = grmf0;
            grmi0.b |= 2;
        }
        epdr epdr1 = this.b;
        if(epdr1 != null) {
            grmf grmf1 = epdr1.d();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            grmi grmi1 = (grmi)hftp2.b_message;
            grmf1.getClass();
            grmi1.e = grmf1;
            grmi1.b |= 4;
        }
        return new epel(((grmb)hftp0.N_build()), ((grmi)hftp2.N_build()));
    }

    @Override  // com.google.android.setupdesign.items.Item
    public final CharSequence k() {
        return this.a == null ? null : this.a.a;
    }

    @Override  // com.google.android.setupdesign.items.Item
    public final CharSequence kv() {
        return this.b == null ? null : this.b.a;
    }
}

