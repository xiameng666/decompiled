package com.google.android.gms.nearby.discovery.fastpair.halfsheet.fragments;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.discovery.fastpair.HalfSheetChimeraActivity;
import cxbk;
import cxdj;
import cxdn;
import cxjq;
import cxjr;
import cxjs;
import gftb;
import ggtj;
import gxye;
import gxyf;
import hftc;
import hfur;
import j..util.Objects;

public class DevicePairingFragmentForInitialPairingHearingAid.2 extends TracingBroadcastReceiver {
    final cxbk a;

    public DevicePairingFragmentForInitialPairingHearingAid.2(cxbk cxbk0) {
        Objects.requireNonNull(cxbk0);
        this.a = cxbk0;
        super("HalfSheetStateChange");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        cxjs cxjs0;
        HalfSheetChimeraActivity halfSheetChimeraActivity0;
        try {
            halfSheetChimeraActivity0 = (HalfSheetChimeraActivity)this.a.requireContext();
        }
        catch(IllegalStateException | ClassCastException exception0) {
            ((ggtj)this.a.ah.e().s(exception0)).x("DevicePairingFragment: Fragment not attached to an Activity when expecting context.");
            return;
        }
        if(Objects.equals(intent0.getAction(), "com.google.android.gms.discovery.fastpair.ACTION_HALF_SHEET_STATUS_CHANGE")) {
            cxbk cxbk0 = this.a;
            if(cxbk0.c != null && cxbk0.ai != null) {
                if(intent0.hasExtra("EXTRA_HEARING_AID_UI_STATUS")) {
                    String s = intent0.getStringExtra("EXTRA_HEARING_AID_UI_STATUS");
                    if(s == null) {
                        cxbk0.ah.g().x("DevicePairingFragment: receive null hearing aid UI status");
                        return;
                    }
                    cxbk0.ah.d().B("DevicePairingFragment: receive hearing aid status: %s", s);
                    switch(s) {
                        case "INCREMENTAL_PAIRING_CONNECTING": {
                            byte[] arr_b = intent0.getByteArrayExtra("com.google.android.gms.nearby.discovery.HALF_SHEET");
                            if(arr_b == null) {
                                cxbk0.ah.g().x("DevicePairingFragment: no half sheet info extra for update item");
                            }
                            else {
                                try {
                                    hftc hftc0 = hftc.a();
                                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)cxjs.b), arr_b, 0, arr_b.length, hftc0);
                                    ProtoLiteMessage.P_makeImmutable(hftv0);
                                    cxjs0 = (cxjs)hftv0;
                                    goto label_37;
                                }
                                catch(hfur unused_ex) {
                                    cxbk0.ah.g().x("DevicePairingFragment: invalid byte data for update item");
                                }
                            }
                            this.a.ai.e(cxdj.r);
                            return;
                        label_37:
                            cxbk0.ah.d().R("DevicePairingFragment: change target address, from-%s, to-%s", gxyf.b(gxye.a, cxbk0.c.l), gxyf.b(gxye.a, cxjs0.l));
                            cxdn cxdn0 = cxbk0.ai;
                            cxjs cxjs1 = cxbk0.c;
                            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)cxjs1).jf(5, null);
                            hftp0.X(((ProtoLiteMessage)cxjs1));
                            String s1 = cxjs0.l;
                            if(!((cxjq)hftp0).b_message.isImmutable()) {
                                ((ProtoLiteBuilder)(((cxjq)hftp0))).ensureMutable();
                            }
                            cxjs cxjs2 = (cxjs)((cxjq)hftp0).b_message;
                            s1.getClass();
                            cxjs2.c |= 0x80;
                            cxjs2.l = s1;
                            cxjr cxjr0 = cxjs0.Q == null ? cxjr.a : cxjs0.Q;
                            if(!((cxjq)hftp0).b_message.isImmutable()) {
                                ((ProtoLiteBuilder)(((cxjq)hftp0))).ensureMutable();
                            }
                            cxjs cxjs3 = (cxjs)((cxjq)hftp0).b_message;
                            cxjr0.getClass();
                            cxjs3.Q = cxjr0;
                            cxjs3.d |= 0x20;
                            cxdn0.d = (cxjs)((ProtoLiteBuilder)(((cxjq)hftp0))).N_build();
                            cxbk0.c = cxbk0.ai.d;
                            this.a.ai.e(cxdj.q);
                            this.a.J(halfSheetChimeraActivity0, true);
                            return;
                        }
                        case "INCREMENTAL_PAIRING_ENTRY_POINT": {
                            this.a.ai.g = intent0;
                            this.a.ai.e(cxdj.o);
                            return;
                        }
                        case "ON_MEMBER_TYPE_OBTAINED": {
                            int v = intent0.getByteExtra("MEMBER_TYPE", -1);
                            cxbk cxbk1 = this.a;
                            if(cxbk1.ai.b.e()) {
                                cxbk1.ai.e((cxbk1.ai.b.d(((byte)v)) ? cxdj.m : cxdj.n));
                                return;
                            }
                            cxbk1.ai.b.c(((byte)v));
                            cxbk1.ai.e(cxdj.m);
                            return;
                        }
                        default: {
                            this.a.ah.g().B("DevicePairingFragment: receive unknown hearing aid UI status: %s", s);
                            return;
                        }
                    }
                }
                if(intent0.hasExtra("FINISHED_STATE") && intent0.getStringExtra("FINISHED_STATE") != null) {
                    String s2 = intent0.getStringExtra("FINISHED_STATE");
                    gftb.check(s2);
                    switch(s2) {
                        case "DISMISS": {
                            this.a.ah.d().B("DevicePairingFragment: halfsheet timeout dismiss, %s", gxyf.b(gxye.q, "END"));
                            halfSheetChimeraActivity0.finish();
                            return;
                        }
                        case "FAIL": {
                            cxbk cxbk2 = this.a;
                            if(cxbk2.ai.e.ij() != cxdj.p && cxbk2.ai.e.ij() != cxdj.q) {
                                cxbk2.ai.e(cxdj.x);
                                return;
                            }
                            cxbk2.ai.e(cxdj.r);
                            return;
                        }
                        case "SUCCESS": {
                            this.a.ai.e(cxdj.w);
                            return;
                        }
                        default: {
                            this.a.ah.g().B("DevicePairingFragment: receive unknown finished state: %s", intent0.getStringExtra("FINISHED_STATE"));
                        }
                    }
                }
            }
        }
    }
}

