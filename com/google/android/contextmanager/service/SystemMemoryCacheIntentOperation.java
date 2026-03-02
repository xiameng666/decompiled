package com.google.android.contextmanager.service;

import ProtoLiteMessage;
import a;
import android.content.Intent;
import baiw;
import bboh;
import bcth;
import bcxd;
import bcxe;
import bcxf;
import com.google.android.chimera.IntentOperation;
import ggtj;
import hftc;
import hfur;
import hrgt;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import xrn;
import xth;
import xuf;
import xug;
import xui;
import xuj;
import xvg;
import xxe;

public final class SystemMemoryCacheIntentOperation extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        Iterator iterator3;
        HashMap hashMap0;
        bboh bboh0;
        bcxd bcxd0;
        bcth bcth0;
        if("com.google.android.contextmanager.service.SystemMemoryCacheIntentOperation.INIT".equals(intent0.getAction())) {
            xuj xuj0 = xxe.A().b.e;
            baiw baiw0 = xuj0.e;
            if(!baiw0.o() && baiw.a(intent0) == 0) {
                baiw0.h(intent0);
                HashSet hashSet0 = new HashSet();
                HashSet hashSet1 = new HashSet();
                try {
                    bcth0 = xxe.U().b(null, 7);
                    if(bcth0 == null) {
                        goto label_9;
                    }
                    else {
                        goto label_29;
                    }
                    goto label_179;
                }
                catch(Throwable throwable0) {
                    goto label_140;
                }
            label_9:
                Set set0 = xuj0.c();
                boolean z = hrgt.D();
                if(z) {
                    hashSet1.removeAll(hashSet0);
                    set0.removeAll(hashSet1);
                }
                else {
                    set0.retainAll(hashSet0);
                    for(Object object0: hashSet0) {
                        String s = (String)object0;
                        if(!set0.contains(s)) {
                            a.ag(xth.a.h(), "[FencePendingIntentCache]%s not whitelisted", s, '\u008B');
                        }
                    }
                }
                Runnable runnable0 = xuj0.f;
                if(runnable0 != null && (z || !set0.isEmpty())) {
                    xxe.u().a(runnable0);
                }
                if(!set0.isEmpty()) {
                    xuj0.d(set0);
                    goto label_57;
                    try {
                        try {
                        label_29:
                            byte[] arr_b = bcth0.f();
                            hftc hftc0 = hftc.a();
                            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)bcxd.a), arr_b, 0, arr_b.length, hftc0);
                            ProtoLiteMessage.P_makeImmutable(hftv0);
                            bcxd0 = (bcxd)hftv0;
                            goto label_59;
                        }
                        catch(hfur hfur0) {
                        }
                        bboh0 = xth.a;
                        ((ggtj)((ggtj)((ggtj)bboh0.i()).s(hfur0)).ar(0x90)).B("%sCould not deserialize proto.", "[FencePendingIntentCache]");
                    }
                    catch(Throwable throwable0) {
                        goto label_140;
                    }
                    set0 = xuj0.c();
                    boolean z1 = hrgt.D();
                    if(z1) {
                        hashSet1.removeAll(hashSet0);
                        set0.removeAll(hashSet1);
                    }
                    else {
                        set0.retainAll(hashSet0);
                        for(Object object1: hashSet0) {
                            String s1 = (String)object1;
                            if(!set0.contains(s1)) {
                                a.ag(bboh0.h(), "[FencePendingIntentCache]%s not whitelisted", s1, '\u0091');
                            }
                        }
                    }
                    Runnable runnable1 = xuj0.f;
                    if(runnable1 != null && (z1 || !set0.isEmpty())) {
                        xxe.u().a(runnable1);
                    }
                    if(!set0.isEmpty()) {
                        xuj0.d(set0);
                    }
                }
            label_57:
                Collection collection0 = null;
                goto label_179;
            label_59:
                if(bcxd0 == null) {
                    set0 = xuj0.c();
                    boolean z2 = hrgt.D();
                    if(z2) {
                        hashSet1.removeAll(hashSet0);
                        set0.removeAll(hashSet1);
                    }
                    else {
                        set0.retainAll(hashSet0);
                        for(Object object2: hashSet0) {
                            String s2 = (String)object2;
                            if(!set0.contains(s2)) {
                                a.ag(xth.a.h(), "[FencePendingIntentCache]%s not whitelisted", s2, '\u008F');
                            }
                        }
                    }
                    Runnable runnable2 = xuj0.f;
                    if(runnable2 != null && (z2 || !set0.isEmpty())) {
                        xxe.u().a(runnable2);
                    }
                    if(!set0.isEmpty()) {
                        xuj0.d(set0);
                    }
                    collection0 = null;
                }
                else {
                    try {
                        if(!bcxd0.b.isEmpty()) {
                            hashMap0 = new HashMap();
                            iterator3 = bcxd0.b.iterator();
                            goto label_109;
                        }
                    }
                    catch(Throwable throwable0) {
                        goto label_140;
                    }
                    if(bcxd0.c.isEmpty()) {
                        set0 = xuj0.c();
                        boolean z3 = hrgt.D();
                        if(z3) {
                            hashSet1.removeAll(hashSet0);
                            set0.removeAll(hashSet1);
                        }
                        else {
                            set0.retainAll(hashSet0);
                            for(Object object3: hashSet0) {
                                String s3 = (String)object3;
                                if(!set0.contains(s3)) {
                                    a.ag(xth.a.h(), "[FencePendingIntentCache]%s not whitelisted", s3, '\u008E');
                                }
                            }
                        }
                        Runnable runnable3 = xuj0.f;
                        if(runnable3 != null && (z3 || !set0.isEmpty())) {
                            xxe.u().a(runnable3);
                        }
                        if(!set0.isEmpty()) {
                            xuj0.d(set0);
                        }
                        collection0 = null;
                    }
                    else {
                        try {
                            hashMap0 = new HashMap();
                            iterator3 = bcxd0.b.iterator();
                        label_109:
                            while(iterator3.hasNext()) {
                                Object object4 = iterator3.next();
                                bcxe bcxe0 = (bcxe)object4;
                                xug xug0 = (xug)hashMap0.get(bcxe0.c);
                                if(xug0 == null) {
                                    xug0 = xuj0.a(bcxe0.c);
                                    if(xug0 == null) {
                                        hashSet0.add(bcxe0.d);
                                        continue;
                                    }
                                    else {
                                        hashMap0.put(bcxe0.c, xug0);
                                    }
                                }
                                xug0.c(xvg.b(bcxe0.d, bcxe0.e, bcxe0.f, bcxe0.g), bcxe0);
                                hashSet1.add(bcxe0.d);
                            }
                            for(Object object5: bcxd0.c) {
                                bcxf bcxf0 = (bcxf)object5;
                                xug xug1 = (xug)hashMap0.get(bcxf0.c);
                                if(xug1 == null) {
                                    xug1 = xuj0.a(bcxf0.c);
                                    if(xug1 == null) {
                                        hashSet0.add(bcxf0.d);
                                        continue;
                                    }
                                    else {
                                        hashMap0.put(bcxf0.c, xug1);
                                    }
                                }
                                xug1.d = bcxf0;
                            }
                            collection0 = hashMap0.values();
                        }
                        catch(Throwable throwable0) {
                        label_140:
                            Set set1 = xuj0.c();
                            boolean z4 = hrgt.D();
                            if(z4) {
                                hashSet1.removeAll(hashSet0);
                                set1.removeAll(hashSet1);
                            }
                            else {
                                set1.retainAll(hashSet0);
                                for(Object object6: hashSet0) {
                                    String s4 = (String)object6;
                                    if(!set1.contains(s4)) {
                                        a.ag(xth.a.h(), "[FencePendingIntentCache]%s not whitelisted", s4, '\u008D');
                                    }
                                }
                            }
                            Runnable runnable4 = xuj0.f;
                            if(runnable4 != null && (z4 || !set1.isEmpty())) {
                                xxe.u().a(runnable4);
                            }
                            if(!set1.isEmpty()) {
                                xuj0.d(set1);
                            }
                            throw throwable0;
                        }
                        Set set2 = xuj0.c();
                        boolean z5 = hrgt.D();
                        if(z5) {
                            hashSet1.removeAll(hashSet0);
                            set2.removeAll(hashSet1);
                        }
                        else {
                            set2.retainAll(hashSet0);
                            for(Object object7: hashSet0) {
                                String s5 = (String)object7;
                                if(!set2.contains(s5)) {
                                    a.ag(xth.a.h(), "[FencePendingIntentCache]%s not whitelisted", s5, '\u008C');
                                }
                            }
                        }
                        Runnable runnable5 = xuj0.f;
                        if(runnable5 != null && (z5 || !set2.isEmpty())) {
                            xxe.u().a(runnable5);
                        }
                        if(!set2.isEmpty()) {
                            xuj0.d(set2);
                        }
                    }
                }
            label_179:
                xui xui0 = new xui(collection0);
                xuj0.a.a(xui0);
                if(xuj0.g) {
                    xxe.u().b(new xuf(xuj0), new xrn("delayedPersistCacheState", "com.google.android.gms", null));
                }
            }
        }
    }
}

