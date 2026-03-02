package com.google.android.gms.backup.g1.notifications;

import ByteString;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.accounts.Account;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Base64;
import aqjk;
import aqnj;
import aqpj;
import aqpn;
import aqql;
import aqsl;
import aqso;
import aqvc;
import aqvd;
import aqvj;
import aqzi;
import arye;
import aryf;
import aryg;
import aryh;
import aryi;
import aryj;
import aryl;
import aryn;
import aryp;
import aryq;
import aryr;
import aryt;
import aryx;
import aryy;
import aryz;
import arzc;
import bayn;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.backup.g1.AppContextProvider;
import gfqx;
import gfsx;
import gfta;
import gftb;
import ghjc;
import ghyr;
import ghys;
import gidu;
import giei;
import gigl;
import heep;
import heeq;
import hejj;
import hejt;
import hfrn;
import hfsl;
import hfsm;
import hftc;
import hfuo;
import hfur;
import hfvh;
import hfvu;
import hfwc;
import hfwr;
import hqil;
import hqje;
import hqlb;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class NotificationProcessorIntentOperation extends IntentOperation {
    private final aqql a;
    private aryf b;
    private arzc c;
    private aryg d;
    private aryz e;

    public NotificationProcessorIntentOperation() {
        this.a = new aqql(new String[]{"NotificationProcessorIO"});
    }

    public NotificationProcessorIntentOperation(aryf aryf0, arzc arzc0, aryg aryg0, aryz aryz0) {
        this.a = new aqql(new String[]{"NotificationProcessorIO"});
        this.b = aryf0;
        this.c = arzc0;
        this.d = aryg0;
        this.e = aryz0;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        Iterator iterator5;
        boolean z1;
        gfsx gfsx7;
        PackageInfo packageInfo0;
        PackageManager packageManager0;
        aryq aryq7;
        Intent intent2;
        Iterator iterator1;
        heeq heeq0;
        ProtoLiteMessage hftv3;
        hfsl hfsl0;
        hftc hftc2;
        hejj hejj0;
        byte[] arr_b1;
        if(this.d == null) {
            this.d = new aryg(this);
        }
        Intent intent1 = (Intent)intent0.getParcelableExtra("notification_intent");
        if(intent1 == null) {
            this.a.f("Could not find notification intent", new Object[0]);
            return;
        }
        if(this.e == null) {
            this.e = new aryz(this);
        }
        if(hqje.B() && intent1.hasExtra("EXTRA_NOTIFICATION_RECEIVED_PAYLOAD")) {
            aqql aqql0 = this.a;
            aqql0.j("Successfully received broadcast from notification module.", new Object[0]);
            Bundle bundle0 = intent1.getExtras();
            if(bundle0 == null) {
                aqql0.f("Bundle is null.", new Object[0]);
                this.d.e(2);
                return;
            }
            String s = bundle0.getString("EXTRA_NOTIFICATION_RECEIVED_PAYLOAD");
            if(!gfta.c(s)) {
                try {
                    byte[] arr_b = ghjc.e.q(s);
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)aryq.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    aqql0.j("Successfully parse the notification payload from notification module.", new Object[0]);
                    aryg aryg0 = this.d;
                    String s1 = ((aryq)hftv0).j;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giei.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    ((giei)hftv1).b |= 1;
                    ((giei)hftv1).c = true;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    giei giei0 = (giei)hftp0.b_message;
                    s1.getClass();
                    giei0.b |= 2;
                    giei0.d = s1;
                    giei giei1 = (giei)hftp0.N_build();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ghys ghys0 = (ghys)hftp1.b_message;
                    giei1.getClass();
                    ghys0.W = giei1;
                    ghys0.c |= 0x4000000;
                    aryg0.a(((ghys)hftp1.N_build()), ghyr.aq);
                    for(Object object0: ((aryq)hftv0).f) {
                        this.e.a(((aryt)object0));
                    }
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    this.d.e(5);
                    this.a.f("Could not decode notification payload: error " + illegalArgumentException0.getMessage(), new Object[0]);
                    return;
                }
                catch(hfur hfur0) {
                    this.d.e(4);
                    this.a.f("Could not parse notification payload: error " + hfur0.getMessage(), new Object[0]);
                    return;
                }
                return;
            }
            aqql0.f("NotificationPayloadExtra is null or empty.", new Object[0]);
            this.d.e(3);
            return;
        }
        try {
            aryg aryg1 = this.d;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)aryq.a).v_newBuilder();
            Bundle bundle1 = intent1.getExtras();
            if(bundle1 == null) {
                aryg1.b(1, 2);
                throw new ParseException("The notification does not contain any extras", -1);
            }
            if(gfta.c(bundle1.getString("casp"))) {
                String s2 = bundle1.getString("type");
                if(gfta.c(s2)) {
                    aryx aryx1 = aryx.a;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((aryq)hftp2.b_message).d = aryx1.d;
                }
                else {
                    if(!s2.equals("etu")) {
                        aryg1.b(1, 3);
                        throw new ParseException("Unknown notification type", -1);
                    }
                    aryx aryx0 = aryx.b;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((aryq)hftp2.b_message).d = aryx0.d;
                }
            }
            else {
                aryx aryx2 = aryx.c;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((aryq)hftp2.b_message).d = aryx2.d;
            }
            ((aryq)hftp2.b_message).b |= 2;
            aryx aryx3 = aryx.b(((aryq)hftp2.b_message).d);
            if(aryx3 == null) {
                aryx3 = aryx.a;
            }
            if(aryx3.equals(aryx.b)) {
                String s7 = bundle1.getString("id");
                if(s7 == null) {
                    aryx aryx5 = aryx.b(((aryq)hftp2.b_message).d);
                    if(aryx5 == null) {
                        aryx5 = aryx.a;
                    }
                    if(aryx5.equals(aryx.b)) {
                        aryg1.b(2, 4);
                        throw new ParseException("Notification of type ETU must have an id field", -1);
                    }
                }
                else {
                    try {
                        long v1 = Long.parseLong(s7);
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        aryq aryq5 = (aryq)hftp2.b_message;
                        aryq5.b |= 1;
                        aryq5.c = v1;
                    }
                    catch(NumberFormatException numberFormatException1) {
                        aryg1.b(2, 5);
                        throw new ParseException("Invalid ID format for ETU push notification with error: " + numberFormatException1.toString(), -1);
                    }
                }
                String s8 = bundle1.getString("etu_enabled");
                if(gfta.c(s8)) {
                    aryx aryx6 = aryx.b(((aryq)hftp2.b_message).d);
                    if(aryx6 == null) {
                        aryx6 = aryx.a;
                    }
                    if(aryx6.equals(aryx.b)) {
                        aryg1.b(2, 6);
                        throw new ParseException("Notification of type ETU must have an enabled field", -1);
                    }
                }
                else {
                    boolean z = Boolean.parseBoolean(s8);
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    aryq aryq6 = (aryq)hftp2.b_message;
                    aryq6.b |= 4;
                    aryq6.g = z;
                }
                intent2 = intent1;
            }
            else {
                aryx aryx4 = aryx.b(((aryq)hftp2.b_message).d);
                if(aryx4 == null) {
                    aryx4 = aryx.a;
                }
                if(aryx4.equals(aryx.c)) {
                    String s3 = bundle1.getString("casp");
                    if(gfta.c(s3)) {
                        intent2 = intent1;
                    }
                    else {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        aryq aryq0 = (aryq)hftp2.b_message;
                        s3.getClass();
                        aryq0.b |= 8;
                        aryq0.h = s3;
                        try {
                            arr_b1 = Base64.decode(s3, 1);
                        }
                        catch(IllegalArgumentException illegalArgumentException1) {
                            aryg1.b(3, 8);
                            throw new ParseException("Unable to decode base64 with error : " + illegalArgumentException1.toString(), -1);
                        }
                        try {
                            hftc hftc1 = hftc.a();
                            intent2 = intent1;
                            ProtoLiteMessage hftv2 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hejj.a), arr_b1, 0, arr_b1.length, hftc1);
                            ProtoLiteMessage.P_makeImmutable(hftv2);
                            hejj0 = (hejj)hftv2;
                        }
                        catch(hfur hfur1) {
                            aryg1.b(3, 9);
                            throw new ParseException("Unable to parse AndroidPayload with error: " + hfur1.toString(), -1);
                        }
                        if((hejj0.b & 4) == 0) {
                            aryg1.b(3, 10);
                            throw new ParseException("AndroidPayload must have notification thread set", -1);
                        }
                        hejt hejt0 = hejj0.d == null ? hejt.a : hejj0.d;
                        if((hejt0.b & 0x2000) == 0) {
                            aryg1.b(3, 11);
                            throw new ParseException("AndroidIntent payload should be set", -1);
                        }
                        try {
                            ByteString hfsf0 = (hejt0.k == null ? hfrn.a : hejt0.k).c;
                            hftc2 = hftc.a();
                            hfsl0 = hfsf0.k();
                            hftv3 = ((ProtoLiteMessage)heeq.a).x_newMutableInstance();
                        }
                        catch(hfur hfur2) {
                            aryg1.b(3, 12);
                            throw new ParseException("Failed to parse Android Intent with error :" + hfur2.toString(), -1);
                        }
                        try {
                            hfwc hfwc0 = hfvu.a.c(hftv3);
                            hfwc0.l(hftv3, hfsm.p(hfsl0), hftc2);
                            hfwc0.g(hftv3);
                            goto label_152;
                        }
                        catch(hfur hfur3) {
                        }
                        catch(hfwr hfwr0) {
                            goto label_139;
                        }
                        catch(IOException iOException0) {
                            goto label_143;
                        }
                        catch(RuntimeException runtimeException0) {
                            goto label_149;
                        }
                        try {
                            if(hfur3.b) {
                                hfur3 = new hfur(hfur3);
                            }
                            hfur3.a = hftv3;
                            throw hfur3;
                        label_139:
                            hfur hfur4 = hfwr0.a();
                            hfur4.a = hftv3;
                            throw hfur4;
                        label_143:
                            if((iOException0.getCause() instanceof hfur)) {
                                throw (hfur)iOException0.getCause();
                            }
                            hfur hfur5 = new hfur(iOException0);
                            hfur5.a = hftv3;
                            throw hfur5;
                        label_149:
                            if((runtimeException0.getCause() instanceof hfur)) {
                                throw (hfur)runtimeException0.getCause();
                            }
                            throw runtimeException0;
                        }
                        catch(hfur hfur2) {
                            aryg1.b(3, 12);
                            throw new ParseException("Failed to parse Android Intent with error :" + hfur2.toString(), -1);
                        }
                        try {
                        label_152:
                            hfsl0.z(0);
                            goto label_157;
                        }
                        catch(hfur hfur6) {
                            try {
                                hfur6.a = hftv3;
                                throw hfur6;
                            label_157:
                                ProtoLiteMessage.P_makeImmutable(hftv3);
                                heeq0 = (heeq)hftv3;
                                goto label_163;
                            }
                            catch(hfur hfur2) {
                            }
                        }
                        aryg1.b(3, 12);
                        throw new ParseException("Failed to parse Android Intent with error :" + hfur2.toString(), -1);
                    label_163:
                        gfsx gfsx0 = aryl.a(heeq0.b, "conditions");
                        if(gfsx0.i()) {
                            iterator1 = Arrays.asList(((String)gfsx0.d()).split(",")).iterator();
                            while(true) {
                            label_166:
                                if(!iterator1.hasNext()) {
                                    goto label_167;
                                }
                                goto label_260;
                            }
                        }
                        else {
                        label_167:
                            gfsx gfsx1 = aryl.a(heeq0.b, "ui_notification_name");
                            if(gfsx1.i()) {
                                Object object1 = gfsx1.d();
                                if(!hftp2.b_message.isImmutable()) {
                                    hftp2.ensureMutable();
                                }
                                aryq aryq1 = (aryq)hftp2.b_message;
                                aryq1.b |= 0x20;
                                aryq1.j = (String)object1;
                            }
                            gfsx gfsx2 = aryl.a(heeq0.b, "special_actions");
                            if(gfsx2.i()) {
                                for(Object object2: Arrays.asList(((String)gfsx2.d()).split(","))) {
                                    String s4 = (String)object2;
                                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)aryt.a).v_newBuilder();
                                    if(s4.hashCode() == 0x48DFF1BF && s4.equals("turn_mms_on_in_days")) {
                                        if(!hftp3.b_message.isImmutable()) {
                                            hftp3.ensureMutable();
                                        }
                                        ((aryt)hftp3.b_message).c = 1;
                                        ((aryt)hftp3.b_message).b |= 1;
                                        Iterator iterator3 = heeq0.b.iterator();
                                        while(iterator3.hasNext()) {
                                            Object object3 = iterator3.next();
                                            heep heep0 = (heep)object3;
                                            if(heep0.b.startsWith("special_action_parameter::turn_mms_on_in_days")) {
                                                List list0 = Arrays.asList(heep0.b.split("::"));
                                                if(list0.size() != 3) {
                                                    aryg1.b(3, 7);
                                                    throw new ParseException("The special action parameter" + heep0.b + "must have exactly three parts", -1);
                                                }
                                                String s5 = (String)list0.get(2);
                                                String s6 = heep0.c;
                                                s5.getClass();
                                                s6.getClass();
                                                if(!hftp3.b_message.isImmutable()) {
                                                    hftp3.ensureMutable();
                                                }
                                                aryt aryt0 = (aryt)hftp3.b_message;
                                                hfvh hfvh0 = aryt0.d;
                                                if(!hfvh0.b) {
                                                    aryt0.d = hfvh0.a();
                                                }
                                                aryt0.d.put(s5, s6);
                                                iterator3 = iterator3;
                                            }
                                        }
                                        aryt aryt1 = (aryt)hftp3.N_build();
                                        if(!hftp2.b_message.isImmutable()) {
                                            hftp2.ensureMutable();
                                        }
                                        aryq aryq2 = (aryq)hftp2.b_message;
                                        aryt1.getClass();
                                        hfuo hfuo0 = aryq2.f;
                                        if(!hfuo0.c()) {
                                            aryq2.f = ProtoLiteMessage.E(hfuo0);
                                        }
                                        aryq2.f.add(aryt1);
                                    }
                                    else {
                                        if(!hftp3.b_message.isImmutable()) {
                                            hftp3.ensureMutable();
                                        }
                                        ((aryt)hftp3.b_message).c = 0;
                                        ((aryt)hftp3.b_message).b |= 1;
                                    }
                                }
                            }
                            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)aryr.a).v_newBuilder();
                            gfsx gfsx3 = aryl.a(heeq0.b, "notification_channel");
                            if(gfsx3.i()) {
                                Object object4 = gfsx3.d();
                                if(!hftp4.b_message.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                aryr aryr0 = (aryr)hftp4.b_message;
                                aryr0.b |= 1;
                                aryr0.c = (String)object4;
                            }
                            gfsx gfsx4 = aryl.a(heeq0.b, "action");
                            if(gfsx4.i()) {
                                Object object5 = gfsx4.d();
                                if(!hftp4.b_message.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                aryr aryr1 = (aryr)hftp4.b_message;
                                aryr1.b |= 2;
                                aryr1.d = (String)object5;
                            }
                            aryr aryr2 = (aryr)hftp4.N_build();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            aryq aryq3 = (aryq)hftp2.b_message;
                            aryr2.getClass();
                            aryq3.i = aryr2;
                            aryq3.b |= 16;
                            gfsx gfsx5 = aryl.a(heeq0.b, "id");
                            if(gfsx5.i()) {
                                try {
                                    long v = Long.parseLong(((String)gfsx5.d()));
                                    if(!hftp2.b_message.isImmutable()) {
                                        hftp2.ensureMutable();
                                    }
                                    aryq aryq4 = (aryq)hftp2.b_message;
                                    aryq4.b |= 1;
                                    aryq4.c = v;
                                    goto label_357;
                                }
                                catch(NumberFormatException numberFormatException0) {
                                    aryg1.b(3, 5);
                                    throw new ParseException("Invalid ID format for UI push notification with error: " + numberFormatException0.toString(), -1);
                                }
                            label_260:
                                Object object6 = iterator1.next();
                                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)aryn.a).v_newBuilder();
                                switch(((String)object6)) {
                                    case "backup_is_on": {
                                        if(!hftp5.b_message.isImmutable()) {
                                            hftp5.ensureMutable();
                                        }
                                        ((aryn)hftp5.b_message).c = 1;
                                        ((aryn)hftp5.b_message).b |= 1;
                                        hftp2.cT(((aryn)hftp5.N_build()));
                                        break;
                                    }
                                    case "device_is_etu": {
                                        if(!hftp5.b_message.isImmutable()) {
                                            hftp5.ensureMutable();
                                        }
                                        ((aryn)hftp5.b_message).c = 3;
                                        ((aryn)hftp5.b_message).b |= 1;
                                        hftp2.cT(((aryn)hftp5.N_build()));
                                        break;
                                    }
                                    case "mms_backup_is_off": {
                                        if(!hftp5.b_message.isImmutable()) {
                                            hftp5.ensureMutable();
                                        }
                                        ((aryn)hftp5.b_message).c = 2;
                                        ((aryn)hftp5.b_message).b |= 1;
                                        hftp2.cT(((aryn)hftp5.N_build()));
                                        break;
                                    }
                                    case "msa_was_not_shown": {
                                        if(!hftp5.b_message.isImmutable()) {
                                            hftp5.ensureMutable();
                                        }
                                        ((aryn)hftp5.b_message).c = 4;
                                        ((aryn)hftp5.b_message).b |= 1;
                                        hftp2.cT(((aryn)hftp5.N_build()));
                                        break;
                                    }
                                    case "no_photos_opt_in_option_in_suw": {
                                        if(!hftp5.b_message.isImmutable()) {
                                            hftp5.ensureMutable();
                                        }
                                        ((aryn)hftp5.b_message).c = 9;
                                        ((aryn)hftp5.b_message).b |= 1;
                                        hftp2.cT(((aryn)hftp5.N_build()));
                                        break;
                                    }
                                    case "photos_app_permission_granted": {
                                        if(!hqje.x()) {
                                            break;
                                        }
                                        if(!hftp5.b_message.isImmutable()) {
                                            hftp5.ensureMutable();
                                        }
                                        ((aryn)hftp5.b_message).c = 7;
                                        ((aryn)hftp5.b_message).b |= 1;
                                        hftp2.cT(((aryn)hftp5.N_build()));
                                        break;
                                    }
                                    case "photos_app_up_to_date_and_enabled": {
                                        if(!hftp5.b_message.isImmutable()) {
                                            hftp5.ensureMutable();
                                        }
                                        ((aryn)hftp5.b_message).c = 6;
                                        ((aryn)hftp5.b_message).b |= 1;
                                        hftp2.cT(((aryn)hftp5.N_build()));
                                        break;
                                    }
                                    case "photos_backup_is_off": {
                                        if(!hftp5.b_message.isImmutable()) {
                                            hftp5.ensureMutable();
                                        }
                                        ((aryn)hftp5.b_message).c = 5;
                                        ((aryn)hftp5.b_message).b |= 1;
                                        hftp2.cT(((aryn)hftp5.N_build()));
                                        break;
                                    }
                                    case "show_photos_on_the_opt_in_screen": {
                                        if(!hqje.y()) {
                                            break;
                                        }
                                        if(!hftp5.b_message.isImmutable()) {
                                            hftp5.ensureMutable();
                                        }
                                        ((aryn)hftp5.b_message).c = 8;
                                        ((aryn)hftp5.b_message).b |= 1;
                                        hftp2.cT(((aryn)hftp5.N_build()));
                                        break;
                                    }
                                    default: {
                                        aryl.a.j("Encountered an unexpected condition", new Object[0]);
                                    }
                                }
                                goto label_166;
                            }
                        }
                    }
                }
                else {
                    intent2 = intent1;
                }
            }
        label_357:
            aryx aryx7 = aryx.b(((aryq)hftp2.b_message).d);
            if(aryx7 == null) {
                aryx7 = aryx.a;
            }
            if(aryx7.equals(aryx.b)) {
                aryg1.c(2);
            }
            else {
                aryx aryx8 = aryx.b(((aryq)hftp2.b_message).d);
                if(aryx8 == null) {
                    aryx8 = aryx.a;
                }
                if(aryx8.equals(aryx.c)) {
                    aryg1.c(3);
                }
            }
            aryq7 = (aryq)hftp2.N_build();
        }
        catch(ParseException parseException0) {
            this.a.g("Failed to parse the intent to a valid notification payload", parseException0, new Object[0]);
            return;
        }
        switch((aryx.b(aryq7.d) == null ? aryx.a : aryx.b(aryq7.d)).ordinal()) {
            case 1: {
                if(this.b == null) {
                    this.b = new aryf(this.getApplicationContext(), this.d);
                }
                aryf aryf0 = this.b;
                gfsx gfsx6 = aryh.a(aryq7.c, aryf0.e.getApplicationContext());
                if(!gfsx6.i()) {
                    aryf.a.f("The account targeted for notification is not present on the device.", new Object[0]);
                    return;
                }
                String s9 = "targeted account : " + ((Account)gfsx6.d()).name;
                aryf.a.j(s9, new Object[0]);
                arye arye0 = new arye(aryf0, ((Account)gfsx6.d()), (aryq7.b & 4) != 0);
                new aqzi(aryf0.b).b(arye0);
                return;
            }
            case 2: {
                if(this.c == null) {
                    aryj aryj0 = new aryj(new aqjk(this), new aqnj(this), aqso.a(this), new aqpj(this), new aqpn(this));
                    aryz aryz0 = this.e;
                    aryg aryg2 = this.d;
                    bayn bayn0 = bayn.f(this);
                    gftb.check(bayn0);
                    this.c = new arzc(aryj0, aryz0, new aryy(this, intent2, aryg2, bayn0), this.d, new aryi(this));
                }
                arzc arzc0 = this.c;
                if(hqje.I() && arzc0.b(aryq7)) {
                    aryi aryi0 = arzc0.d;
                    ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gidu.a).v_newBuilder();
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    ((gidu)hftp6.b_message).c = 6;
                    ((gidu)hftp6.b_message).b |= 1;
                    gidu gidu0 = (gidu)hftp6.N_build();
                    ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    ghys ghys1 = (ghys)hftp7.b_message;
                    gidu0.getClass();
                    ghys1.X = gidu0;
                    ghys1.c |= 0x8000000;
                    aryi0.a(((ghys)hftp7.N_build()));
                }
                Iterator iterator4 = aryq7.e.iterator();
                while(iterator4.hasNext()) {
                    Object object7 = iterator4.next();
                    aryn aryn0 = (aryn)object7;
                    aryj aryj1 = arzc0.b;
                    String s10 = aryp.a((aryp.b(aryn0.c) == 0 ? 1 : aryp.b(aryn0.c))).toLowerCase(Locale.US);
                    switch(s10.hashCode()) {
                        case 0xADBC0DC4: {
                            if(!s10.equals("photos_app_up_to_date_and_enabled") || !hqje.a.m().Q()) {
                                iterator5 = iterator4;
                            }
                            else {
                                long v2 = hqil.d();
                                try {
                                    packageManager0 = AppContextProvider.a().getPackageManager();
                                }
                                catch(NullPointerException | PackageManager.NameNotFoundException unused_ex) {
                                    iterator5 = iterator4;
                                    aryj.a.f("Name not found for photos package.", new Object[0]);
                                    gfsx7 = gfqx.a;
                                    goto label_443;
                                }
                                try {
                                    packageInfo0 = packageManager0.getPackageInfo("com.google.android.apps.photos", 0);
                                }
                                catch(NullPointerException | PackageManager.NameNotFoundException unused_ex) {
                                    iterator5 = iterator4;
                                    aryj.a.f("Name not found for photos package.", new Object[0]);
                                    gfsx7 = gfqx.a;
                                    goto label_443;
                                }
                                try {
                                    iterator5 = iterator4;
                                    ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("com.google.android.apps.photos", 0);
                                    if(applicationInfo0 != null && applicationInfo0.enabled && packageInfo0 != null) {
                                        gfsx7 = gfsx.m(Long.valueOf(packageInfo0.getLongVersionCode()));
                                    }
                                    else {
                                        goto label_442;
                                    }
                                }
                                catch(NullPointerException | PackageManager.NameNotFoundException unused_ex) {
                                    aryj.a.f("Name not found for photos package.", new Object[0]);
                                    gfsx7 = gfqx.a;
                                }
                                goto label_443;
                            label_442:
                                gfsx7 = gfqx.a;
                            label_443:
                                if(v2 > 0L && gfsx7.i() && ((long)(((Long)gfsx7.d()))) >= v2) {
                                    z1 = true;
                                    goto label_509;
                                }
                            }
                            break;
                        }
                        case 0xB53A531A: {
                            if(s10.equals("device_is_etu")) {
                                iterator5 = iterator4;
                                z1 = aryj.c(aryj1.e);
                                goto label_509;
                            }
                            else {
                                iterator5 = iterator4;
                                break;
                            }
                            goto label_452;
                        }
                        case 0xE155A8A7: {
                        label_452:
                            if(!s10.equals("photos_app_permission_granted")) {
                            }
                            else if(hqje.x()) {
                                iterator5 = iterator4;
                                z1 = aqsl.a(AppContextProvider.a().getPackageManager()).e();
                                goto label_509;
                            }
                            else {
                                iterator5 = iterator4;
                                break;
                            }
                            iterator5 = iterator4;
                            break;
                        }
                        case 0xAD1B98B: {
                            if(s10.equals("mms_backup_is_off")) {
                                iterator5 = iterator4;
                                z1 = aryj.d(aryj1.c);
                                goto label_509;
                            }
                            else {
                                iterator5 = iterator4;
                                break;
                            }
                            goto label_467;
                        }
                        case 0x14675C57: {
                        label_467:
                            if(s10.equals("backup_is_on")) {
                                iterator5 = iterator4;
                                z1 = aryj.b(aryj1.b);
                                goto label_509;
                            }
                            else {
                                iterator5 = iterator4;
                                break;
                            }
                            goto label_473;
                        }
                        case 0x1FC10F48: {
                        label_473:
                            if(!s10.equals("show_photos_on_the_opt_in_screen")) {
                            }
                            else if(hqje.y()) {
                                if(aryj.c(aryj1.e)) {
                                    iterator5 = iterator4;
                                    z1 = true;
                                    goto label_509;
                                }
                                else if(hqil.A()) {
                                    continue;
                                }
                            }
                            iterator5 = iterator4;
                            break;
                        }
                        case 0x21E112B9: {
                            if(s10.equals("photos_backup_is_off")) {
                                aqvc aqvc0 = aqvd.a();
                                aqvc0.c(11);
                                aqvd aqvd0 = aqvc0.a();
                                if(aryj1.d.b(aqvd0).a == aqvj.b) {
                                    iterator5 = iterator4;
                                    z1 = true;
                                    goto label_509;
                                }
                                else {
                                    iterator5 = iterator4;
                                    break;
                                }
                            }
                            iterator5 = iterator4;
                            break;
                        }
                        case 0x3E7F250B: {
                            if(!s10.equals("msa_was_not_shown")) {
                            }
                            else if(!aryj.a(aryj1.f)) {
                                continue;
                            }
                            iterator5 = iterator4;
                            break;
                        }
                        case 0x43F80D37: {
                            if(!s10.equals("no_photos_opt_in_option_in_suw")) {
                            }
                            else if(!hqlb.g()) {
                                continue;
                            }
                            iterator5 = iterator4;
                            break;
                        }
                        default: {
                            iterator5 = iterator4;
                        }
                    }
                    z1 = false;
                label_509:
                    if(!z1) {
                        aqql aqql1 = arzc.a;
                        aqql1.m("Condition not satisfied: " + aryp.a((aryp.b(aryn0.c) == 0 ? 1 : aryp.b(aryn0.c))), new Object[0]);
                        aryg aryg3 = arzc0.c;
                        String s11 = aryq7.j;
                        int v3 = aryp.b(aryn0.c) == 0 ? 1 : aryp.b(aryn0.c);
                        ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)gigl.a).v_newBuilder();
                        if(!hftp8.b_message.isImmutable()) {
                            hftp8.ensureMutable();
                        }
                        ProtoLiteMessage hftv4 = hftp8.b_message;
                        s11.getClass();
                        ((gigl)hftv4).b |= 8;
                        ((gigl)hftv4).f = s11;
                        if(!hftv4.isImmutable()) {
                            hftp8.ensureMutable();
                        }
                        ProtoLiteMessage hftv5 = hftp8.b_message;
                        ((gigl)hftv5).b |= 1;
                        ((gigl)hftv5).c = false;
                        if(!hftv5.isImmutable()) {
                            hftp8.ensureMutable();
                        }
                        gigl gigl0 = (gigl)hftp8.b_message;
                        gigl0.b |= 16;
                        gigl0.g = aryp.a(v3);
                        gigl gigl1 = (gigl)hftp8.N_build();
                        ghys ghys2 = ghys.a;
                        ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)ghys2).v_newBuilder();
                        if(!hftp9.b_message.isImmutable()) {
                            hftp9.ensureMutable();
                        }
                        ghys ghys3 = (ghys)hftp9.b_message;
                        gigl1.getClass();
                        ghys3.U = gigl1;
                        ghys3.c |= 0x1000000;
                        aryg3.a(((ghys)hftp9.N_build()), ghyr.ad);
                        aqql1.f("The conditions for the notification are not satisfied, aborting.", new Object[0]);
                        if(!hqje.I() || !arzc0.b(aryq7)) {
                            return;
                        }
                        aryi aryi1 = arzc0.d;
                        ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)gidu.a).v_newBuilder();
                        if(!hftp10.b_message.isImmutable()) {
                            hftp10.ensureMutable();
                        }
                        ((gidu)hftp10.b_message).c = 7;
                        ((gidu)hftp10.b_message).b |= 1;
                        gidu gidu1 = (gidu)hftp10.N_build();
                        ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)ghys2).v_newBuilder();
                        if(!hftp11.b_message.isImmutable()) {
                            hftp11.ensureMutable();
                        }
                        ghys ghys4 = (ghys)hftp11.b_message;
                        gidu1.getClass();
                        ghys4.X = gidu1;
                        ghys4.c |= 0x8000000;
                        aryi1.a(((ghys)hftp11.N_build()));
                        return;
                    }
                    iterator4 = iterator5;
                }
                if(!hqje.B()) {
                    if(hqje.a.m().aa()) {
                        if(arzc0.c(aryq7)) {
                            arzc0.a(aryq7);
                        }
                        try {
                        }
                        catch(IllegalArgumentException illegalArgumentException0) {
                            this.d.e(5);
                            this.a.f("Could not decode notification payload: error " + illegalArgumentException0.getMessage(), new Object[0]);
                        }
                        catch(hfur hfur0) {
                            this.d.e(4);
                            this.a.f("Could not parse notification payload: error " + hfur0.getMessage(), new Object[0]);
                        }
                        return;
                    }
                    arzc0.a(aryq7);
                    arzc0.c(aryq7);
                    return;
                }
                arzc0.c(aryq7);
                return;
            }
            default: {
                aryx aryx9 = aryx.b(aryq7.d) == null ? aryx.a : aryx.b(aryq7.d);
                this.a.f("Unsupported gcm notification type: %s", new Object[]{aryx9});
            }
        }
    }
}

