import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.util.Base64;
import j..time.Duration;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class eyiv {
    public static final Duration a;
    public final bboh b;
    public final glxv c;
    private final Context d;
    private final exql e;

    static {
        Duration duration0 = Duration.ofSeconds(5L);
        ibuq.e(duration0, "ofSeconds(...)");
        eyiv.a = duration0;
    }

    public eyiv(Context context0, bboh bboh0, exql exql0, glxv glxv0) {
        this.d = context0;
        this.b = bboh0;
        this.e = exql0;
        this.c = glxv0;
    }

    public final exnf a(exne exne0, int v) {
        ibuq.f(exne0, "remoteIntentPayload");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)exnf.a).v_newBuilder();
        String s = exne0.g;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((exnf)hftv0).b |= 1;
        ((exnf)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((exnf)hftv1).b |= 2;
        ((exnf)hftv1).d = 1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((exnf)hftv2).b |= 4;
        ((exnf)hftv2).e = v;
        long v1 = exne0.j;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        exnf exnf0 = (exnf)hftp0.b_message;
        exnf0.b |= 8;
        exnf0.g = v1;
        ProtoLiteMessage hftv3 = hftp0.N_build();
        ibuq.e(hftv3, "build(...)");
        return (exnf)hftv3;
    }

    public final Object b(exne exne0, ibrl ibrl0) {
        int v2;
        ByteString hfsf0;
        exne exne2;
        eyiu eyiu0;
        exne exne1 = exne0;
        if((ibrl0 instanceof eyiu)) {
            eyiu0 = (eyiu)ibrl0;
            int v = eyiu0.c;
            if((v & 0x80000000) == 0) {
                eyiu0 = new eyiu(this, ibrl0);
            }
            else {
                eyiu0.c = v - 0x80000000;
            }
        }
        else {
            eyiu0 = new eyiu(this, ibrl0);
        }
        Object object0 = eyiu0.a;
        Object object1 = ibrx.a;
        switch(eyiu0.c) {
            case 0: {
                ibnx.b(object0);
                String s = exne1.e;
                ibuq.e(s, "getPackageName(...)");
                eyiu0.d = exne1;
                eyiu0.c = 1;
                object0 = this.e.c(s, exne1.h, eyiu0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_24;
            }
            case 1: {
                exne1 = eyiu0.d;
                ibnx.b(object0);
            label_24:
                exne2 = exne1;
                if(!((Boolean)object0).booleanValue() && !exne2.k) {
                    ((ggtj)this.b.j()).x("Remote intent payload did not show user prompt and app is not allowed");
                    String s1 = exne2.g;
                    ibuq.e(s1, "getInvocationId(...)");
                    eyiu0.d = null;
                    eyiu0.c = 2;
                    Object object2 = this.c(s1, 3, 0L, eyiu0);
                    return object2 == object1 ? object1 : object2;
                }
                String s2 = exne2.e;
                ibuq.e(s2, "getPackageName(...)");
                try {
                    bboh bboh0 = this.b;
                    ((ggtj)bboh0.h()).B("Getting package info for package: %s", s2);
                    gged_interceptors gged0 = bbms.d(this.d, s2, "SHA-256");
                    if(gged0 == null) {
                        ((ggtj)bboh0.j()).B("Failed to get certificate digests for package: %s", s2);
                        hfsf0 = ByteString.b;
                        ibuq.e(hfsf0, "EMPTY");
                    }
                    else {
                        MessageDigest messageDigest0 = bbms.g("SHA-256");
                        if(messageDigest0 == null) {
                            ((ggtj)bboh0.j()).x("Failed to get message digest for SHA-256");
                            hfsf0 = ByteString.b;
                            ibuq.e(hfsf0, "EMPTY");
                        }
                        else {
                            ggqk ggqk0 = gged0.E();
                            ibuq.e(ggqk0, "iterator(...)");
                            while(ggqk0.hasNext()) {
                                messageDigest0.update(((byte[])ggqk0.next()));
                            }
                            hfsf0 = ByteString.copyFrom(messageDigest0.digest());
                        }
                    }
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    a.e(this.b.j(), "Package not found: %s", s2, packageManager$NameNotFoundException0);
                    hfsf0 = ByteString.b;
                    ibuq.e(hfsf0, "EMPTY");
                }
                if(ibuq.m(hfsf0, ByteString.b)) {
                    ((ggtj)this.b.j()).B("Failed to get certificate digest for package: %s", exne2.e);
                    String s3 = exne2.g;
                    ibuq.e(s3, "getInvocationId(...)");
                    eyiu0.d = null;
                    eyiu0.c = 3;
                    Object object3 = this.c(s3, 7, exne2.j, eyiu0);
                    return object3 == object1 ? object1 : object3;
                }
                if(!ibuq.m(hfsf0, exne2.h)) {
                    ((ggtj)this.b.j()).X("Certificate digest mismatch for package: %s, payload: %s, actual: %s", exne2.e, Base64.encodeToString(exne2.h.toByteArray(), 0), Base64.encodeToString(hfsf0.toByteArray(), 0));
                    String s4 = exne2.g;
                    ibuq.e(s4, "getInvocationId(...)");
                    eyiu0.d = null;
                    eyiu0.c = 4;
                    Object object4 = this.c(s4, 6, exne2.j, eyiu0);
                    return object4 == object1 ? object1 : object4;
                }
                if(exne2.i) {
                    String s5 = exne2.e;
                    ibuq.e(s5, "getPackageName(...)");
                    eyiu0.d = exne2;
                    eyiu0.c = 5;
                    if(this.e.d(s5, true, hfsf0, eyiu0) == object1) {
                        return object1;
                    }
                }
                goto label_92;
            }
            case 2: {
                ibnx.b(object0);
                return object0;
            }
            case 3: {
                ibnx.b(object0);
                return object0;
            }
            case 4: {
                ibnx.b(object0);
                return object0;
            }
            case 5: {
                exne exne3 = eyiu0.d;
                ibnx.b(object0);
                exne2 = exne3;
            label_92:
                Intent intent0 = new Intent();
                if((exne2.b & 1) != 0) {
                    intent0.setAction(exne2.c);
                }
                int v1 = exne2.b & 8;
                if((exne2.b & 2) == 0) {
                    if(v1 != 0) {
                        intent0.setType(exne2.f);
                    }
                }
                else if(v1 != 0) {
                    String s6 = exne2.d;
                    ibuq.e(s6, "getUriData(...)");
                    intent0.setDataAndType(Uri.parse(s6), exne2.f);
                }
                else {
                    String s7 = exne2.d;
                    ibuq.e(s7, "getUriData(...)");
                    intent0.setData(Uri.parse(s7));
                }
                if((exne2.b & 4) != 0) {
                    intent0.setPackage(exne2.e);
                }
                intent0.addFlags(0x10000000);
                try {
                    this.d.startActivity(intent0);
                    v2 = 0;
                }
                catch(ActivityNotFoundException activityNotFoundException0) {
                    a.e(this.b.j(), "Cannot start activity for remote intent: %s", intent0, activityNotFoundException0);
                    v2 = 2;
                }
                String s8 = exne2.g;
                ibuq.e(s8, "getInvocationId(...)");
                eyiu0.d = null;
                eyiu0.c = 6;
                Object object5 = this.c(s8, v2, exne2.j, eyiu0);
                return object5 == object1 ? object1 : object5;
            }
            case 6: {
                ibnx.b(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object c(String s, int v, long v1, ibrl ibrl0) {
        Iterator iterator0;
        LinkedHashMap linkedHashMap0;
        ProtoLiteBuilder hftp2;
        ProtoLiteBuilder hftp1;
        eyit eyit0;
        if((ibrl0 instanceof eyit)) {
            eyit0 = (eyit)ibrl0;
            int v2 = eyit0.d;
            if((v2 & 0x80000000) == 0) {
                eyit0 = new eyit(this, ibrl0);
            }
            else {
                eyit0.d = v2 - 0x80000000;
            }
        }
        else {
            eyit0 = new eyit(this, ibrl0);
        }
        Object object0 = eyit0.b;
        Object object1 = ibrx.a;
        switch(eyit0.d) {
            case 0: {
                ibnx.b(object0);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)exnf.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                s.getClass();
                ((exnf)hftv0).b |= 1;
                ((exnf)hftv0).c = s;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((exnf)hftv1).b |= 2;
                ((exnf)hftv1).d = v;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                exnf exnf0 = (exnf)hftp0.b_message;
                exnf0.b |= 4;
                exnf0.e = 0;
                eyit0.e = hftp0;
                eyit0.a = v1;
                eyit0.d = 1;
                Object object2 = this.e.a(eyit0);
                if(object2 == object1) {
                    return object1;
                }
                object0 = object2;
                hftp1 = hftp0;
                goto label_42;
            }
            case 1: {
                v1 = eyit0.a;
                hftp1 = eyit0.e;
                ibnx.b(object0);
            label_42:
                long v3 = ((Number)object0).longValue();
                if(v3 != v1) {
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    exnf exnf1 = (exnf)hftp1.b_message;
                    exnf1.b |= 8;
                    exnf1.g = v3;
                    eyit0.e = hftp1;
                    eyit0.f = hftp1;
                    eyit0.d = 2;
                    object0 = this.e.b(eyit0);
                    if(object0 != object1) {
                        hftp2 = hftp1;
                        linkedHashMap0 = new LinkedHashMap();
                        iterator0 = ((Map)object0).entrySet().iterator();
                        goto label_64;
                    }
                    return object1;
                }
                break;
            }
            case 2: {
                hftp2 = eyit0.f;
                hftp1 = eyit0.e;
                ibnx.b(object0);
                linkedHashMap0 = new LinkedHashMap();
                iterator0 = ((Map)object0).entrySet().iterator();
            label_64:
                while(iterator0.hasNext()) {
                    Object object3 = iterator0.next();
                    Map.Entry map$Entry0 = (Map.Entry)object3;
                    if(((exqg)map$Entry0.getValue()).a) {
                        linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
                    }
                }
                Set set0 = linkedHashMap0.keySet();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                exnf exnf2 = (exnf)hftp2.b_message;
                hfuo hfuo0 = exnf2.f;
                if(!hfuo0.c()) {
                    exnf2.f = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(set0, exnf2.f);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object4 = hftp1.N_build();
        ibuq.e(object4, "build(...)");
        return object4;
    }
}

