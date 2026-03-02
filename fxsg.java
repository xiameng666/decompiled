import android.accounts.Account;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class fxsg {
    static final int a;
    static final String b;
    static final String c;
    static final String d;
    static final String e;
    static final String f;
    static final String g;
    static final String h;
    public static fxsp i;
    public final Context j;
    private final int k;
    private final int l;
    private final int m;
    private final Boolean n;

    static {
        fxsg.a = Build.VERSION.SDK_INT;
        fxsg.b = fvni.a;
        fxsg.c = Build.MODEL;
        fxsg.d = Build.DEVICE;
        fxsg.e = Build.PRODUCT;
        fxsg.f = Build.BRAND;
        fxsg.g = Build.MODEL;
        fxsg.h = Build.MANUFACTURER;
    }

    public fxsg() {
        throw null;
    }

    public fxsg(Context context0, fxsp fxsp0, int v, int v1, int v2, Boolean boolean0) {
        this.j = context0;
        fxsg.i = fxsp0;
        this.k = v;
        this.l = v1;
        this.m = v2;
        this.n = boolean0;
    }

    public static baqr a(Context context0, Account account0) {
        baqr baqr0 = new baqr(Process.myUid(), account0.name, account0.name, "com.google.android.gms", "com.google.android.gms");
        baqr0.l("https://www.googleapis.com/auth/userlocation.reporting");
        return baqr0;
    }

    // This method was un-flattened
    public final fxsf b(Account account0, int v, String s, fxqp fxqp0, long v1) {
        ProtoLiteBuilder hftp8;
        int v29;
        long v19;
        gzwd gzwd0;
        boolean z1;
        int v17;
        ProtoLiteBuilder hftp6;
        fxsd fxsd0;
        Iterator iterator5;
        ArrayList arrayList7;
        Iterator iterator4;
        ArrayList arrayList5;
        ArrayList arrayList4;
        int v5;
        ArrayList arrayList2;
        hzee hzee0 = hzee.a;
        int v2 = hzee0.b().b() ^ 1;
        ArrayList arrayList0 = fxqp0.a;
        batl.c(((boolean)(arrayList0.isEmpty() ^ 1)), "Must have at least 1 location to upload");
        ProtoLiteBuilder hftp0 = this.c(s, ((boolean)v2));
        int v3 = bbnp.o(this.j.getResources()) ? 2 : 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gzsx)hftp0.b_message).j = v3 - 1;
        ((gzsx)hftp0.b_message).b |= 0x4000;
        gzsx gzsx0 = (gzsx)hftp0.N_build();
        ArrayList arrayList1 = fxqp0.b;
        long v4 = System.currentTimeMillis();
        if(arrayList1.isEmpty()) {
            arrayList2 = null;
        }
        else {
            arrayList2 = new ArrayList(arrayList1.size());
            Iterator iterator0 = arrayList1.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                ActivityRecognitionResult activityRecognitionResult0 = (ActivityRecognitionResult)object0;
                List list0 = activityRecognitionResult0.a;
                Bundle bundle0 = activityRecognitionResult0.b();
                if(!list0.isEmpty() || bundle0 != null && bundle0.size() > 0) {
                    ArrayList arrayList3 = new ArrayList();
                    if(!list0.isEmpty()) {
                        Iterator iterator1 = list0.iterator();
                        while(iterator1.hasNext()) {
                            Object object1 = iterator1.next();
                            DetectedActivity detectedActivity0 = (DetectedActivity)object1;
                            switch(detectedActivity0.a()) {
                                case 0: {
                                    break;
                                }
                                case 1: {
                                    v5 = 2;
                                    break;
                                }
                                case 2: {
                                    v5 = 3;
                                    break;
                                }
                                case 3: {
                                    v5 = 4;
                                    break;
                                }
                                case 4: {
                                    v5 = 5;
                                    break;
                                }
                                case 5: {
                                    v5 = 6;
                                    break;
                                }
                                case 6: {
                                    v5 = 7;
                                    break;
                                }
                                case 7: {
                                    v5 = 8;
                                    break;
                                }
                                case 8: {
                                    v5 = 9;
                                    break;
                                }
                                case 16: {
                                    v5 = 10;
                                    break;
                                }
                                case 17: {
                                    v5 = 11;
                                    break;
                                }
                                case 18: {
                                    v5 = 12;
                                    break;
                                }
                                case 19: {
                                    v5 = 13;
                                    break;
                                }
                                case 20: {
                                    v5 = 14;
                                    break;
                                }
                                case 21: {
                                    v5 = 15;
                                    break;
                                }
                                default: {
                                    v5 = 0;
                                    continue;
                                }
                            }
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzsm.a).v_newBuilder();
                            int v6 = detectedActivity0.e;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp1.b_message;
                            ((gzsm)hftv0).b |= 2;
                            ((gzsm)hftv0).d = v6;
                            if(!hftv0.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((gzsm)hftp1.b_message).c = v5 - 1;
                            ((gzsm)hftp1.b_message).b |= 1;
                            arrayList3.add(((gzsm)hftp1.N_build()));
                            iterator1 = iterator1;
                            arrayList0 = arrayList0;
                        }
                    }
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gzsp.a).v_newBuilder();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gzsp gzsp0 = (gzsp)hftp2.b_message;
                    gzsp0.b();
                    hfrj.E(arrayList3, gzsp0.d);
                    if(bundle0 != null && bundle0.size() != 0) {
                        arrayList4 = new ArrayList(bundle0.size());
                        Iterator iterator2 = bundle0.keySet().iterator();
                        while(iterator2.hasNext()) {
                            Object object2 = iterator2.next();
                            String s1 = (String)object2;
                            Object object3 = bundle0.get(s1);
                            if(object3 != null) {
                                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gzso.a).v_newBuilder();
                                if((object3 instanceof Integer)) {
                                    if(!hftp3.b_message.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    ((gzso)hftp3.b_message).c = 3;
                                    ((gzso)hftp3.b_message).d = (Integer)object3;
                                    goto label_123;
                                }
                                else if((object3 instanceof Boolean)) {
                                    if(!hftp3.b_message.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    ((gzso)hftp3.b_message).c = 8;
                                    ((gzso)hftp3.b_message).d = (Boolean)object3;
                                    goto label_123;
                                }
                                else if((object3 instanceof Double)) {
                                    if(!hftp3.b_message.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    ((gzso)hftp3.b_message).c = 6;
                                    ((gzso)hftp3.b_message).d = (Double)object3;
                                    goto label_123;
                                }
                                else if((object3 instanceof Float)) {
                                    if(!hftp3.b_message.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    ((gzso)hftp3.b_message).c = 5;
                                    ((gzso)hftp3.b_message).d = (Float)object3;
                                    goto label_123;
                                }
                                else if((object3 instanceof Long)) {
                                    if(!hftp3.b_message.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    ((gzso)hftp3.b_message).c = 4;
                                    ((gzso)hftp3.b_message).d = (Long)object3;
                                    goto label_123;
                                }
                                else if((object3 instanceof String)) {
                                    if(!hftp3.b_message.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    ((gzso)hftp3.b_message).c = 7;
                                    ((gzso)hftp3.b_message).d = (String)object3;
                                label_123:
                                    if(!hftp3.b_message.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv1 = hftp3.b_message;
                                    ((gzso)hftv1).e = 1;
                                    ((gzso)hftv1).b |= 1;
                                    if(!hftv1.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    gzso gzso0 = (gzso)hftp3.b_message;
                                    s1.getClass();
                                    gzso0.b |= 2;
                                    gzso0.f = s1;
                                    arrayList4.add(((gzso)hftp3.N_build()));
                                }
                                else {
                                    fxqw.m(27, String.format(Locale.US, "ActivityRecognitionResult extras bundle contains object (%s) with unsupported type.", object3.toString()));
                                }
                                bundle0 = bundle0;
                                iterator2 = iterator2;
                            }
                        }
                    }
                    else {
                        arrayList4 = null;
                    }
                    if(arrayList4 != null) {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gzsp gzsp1 = (gzsp)hftp2.b_message;
                        hfuo hfuo0 = gzsp1.e;
                        if(!hfuo0.c()) {
                            gzsp1.e = ProtoLiteMessage.E(hfuo0);
                        }
                        hfrj.E(arrayList4, gzsp1.e);
                    }
                    long v7 = activityRecognitionResult0.b;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gzsp gzsp2 = (gzsp)hftp2.b_message;
                    gzsp2.b |= 1;
                    gzsp2.c = v7;
                    arrayList2.add(((gzsp)hftp2.N_build()));
                    iterator0 = iterator0;
                    hzee0 = hzee0;
                    arrayList0 = arrayList0;
                }
            }
        }
        if(arrayList0.isEmpty()) {
            arrayList5 = null;
        }
        else {
            arrayList5 = new ArrayList(arrayList0.size());
            Iterator iterator3 = arrayList0.iterator();
            while(iterator3.hasNext()) {
                Object object4 = iterator3.next();
                fxrv fxrv0 = (fxrv)object4;
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gzts.a).v_newBuilder();
                if((fxrv0.b & 0x20) != 0) {
                    int v8 = (int)Math.round(fxrv0.h);
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gzts gzts0 = (gzts)hftp4.b_message;
                    gzts0.b |= 16;
                    gzts0.g = v8;
                }
                if((fxrv0.b & 0x400) != 0) {
                    boolean z = fxrv0.l;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gzts gzts1 = (gzts)hftp4.b_message;
                    gzts1.b |= 0x400;
                    gzts1.l = z;
                }
                if((fxrv0.b & 16) != 0) {
                    int v9 = (int)fxrv0.g;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gzts gzts2 = (gzts)hftp4.b_message;
                    gzts2.b |= 8;
                    gzts2.f = v9;
                }
                if((fxrv0.b & 0x40) != 0) {
                    int v10 = (int)fxrv0.i;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gzts gzts3 = (gzts)hftp4.b_message;
                    gzts3.b |= 0x80;
                    gzts3.j = v10;
                }
                if((fxrv0.b & 0x40000) != 0) {
                    int v11 = Math.round(fxrv0.t);
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gzts gzts4 = (gzts)hftp4.b_message;
                    gzts4.b |= 0x100;
                    gzts4.k = v11;
                }
                if((fxrv0.b & 0x1000) != 0) {
                    int v12 = fxrv0.n;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gzts gzts5 = (gzts)hftp4.b_message;
                    gzts5.b |= 0x20;
                    gzts5.h = v12;
                }
                if((fxrv0.b & 0x800) != 0) {
                    String s2 = fxrv0.m;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gzts gzts6 = (gzts)hftp4.b_message;
                    s2.getClass();
                    gzts6.b |= 0x40;
                    gzts6.i = s2;
                }
                if((fxrv0.b & 1) == 0) {
                    iterator4 = iterator3;
                    fxqw.h(new IllegalStateException("Location missing position; timestamp=" + fxrv0.e + "; source=" + ((fxru.a(fxrv0.d) == 0 ? 1 : fxru.a(fxrv0.d)) - 1)));
                }
                else {
                    fxry fxry0 = fxrv0.c == null ? fxry.a : fxrv0.c;
                    int v13 = fxry0.c;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp4.b_message;
                    iterator4 = iterator3;
                    ((gzts)hftv2).b |= 1;
                    ((gzts)hftv2).c = v13;
                    int v14 = fxry0.d;
                    if(!hftv2.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gzts gzts7 = (gzts)hftp4.b_message;
                    gzts7.b |= 2;
                    gzts7.d = v14;
                }
                if((fxrv0.b & 8) != 0) {
                    int v15 = (int)fxrv0.f;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gzts gzts8 = (gzts)hftp4.b_message;
                    gzts8.b |= 4;
                    gzts8.e = v15;
                }
                gzts gzts9 = (gzts)hftp4.N_build();
                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gzuk.a).v_newBuilder();
                if((fxrv0.b & 2) != 0) {
                    int v16 = gzuj.a((fxru.a(fxrv0.d) == 0 ? 1 : fxru.a(fxrv0.d)) - 1);
                    if(v16 != 0) {
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ((gzuk)hftp5.b_message).c = v16 - 1;
                        ((gzuk)hftp5.b_message).b |= 1;
                    }
                }
                ArrayList arrayList6 = fxvd.a;
                if(fxrv0.o.size() > 0) {
                    hfuo hfuo1 = fxrv0.o;
                    if(hfuo1 != null && !hfuo1.isEmpty()) {
                        try {
                            arrayList7 = new ArrayList(hfuo1.size());
                            iterator5 = hfuo1.iterator();
                            while(true) {
                            label_260:
                                if(!iterator5.hasNext()) {
                                    v19 = v4;
                                    goto label_373;
                                }
                                Object object5 = iterator5.next();
                                fxsd0 = (fxsd)object5;
                                if((fxsd0.b & 1) != 0 && (fxsd0.b & 2) != 0) {
                                    hftp6 = ((ProtoLiteMessage)gzwd.a).v_newBuilder();
                                    if((fxsd0.b & 4) == 0) {
                                        v17 = 1;
                                    }
                                    else {
                                        int v18 = fxsd0.e;
                                        v17 = gzwc.a((fxsc.a(v18) == 0 ? 1 : fxsc.a(v18)) - 1);
                                        if(v17 == 0) {
                                            fxqw.m(28, "Unknown value for wifi auth type: " + ((fxsc.a(v18) == 0 ? 1 : fxsc.a(v18)) - 1));
                                        }
                                    }
                                    if(v17 != 0) {
                                        if(!hftp6.b_message.isImmutable()) {
                                            hftp6.ensureMutable();
                                        }
                                        ((gzwd)hftp6.b_message).e = v17 - 1;
                                        ((gzwd)hftp6.b_message).b |= 4;
                                    }
                                    if((fxsd0.b & 8) == 0) {
                                        goto label_290;
                                    }
                                    else {
                                        z1 = fxsd0.f;
                                        if(!hftp6.b_message.isImmutable()) {
                                            hftp6.ensureMutable();
                                        }
                                        gzwd0 = (gzwd)hftp6.b_message;
                                        v19 = v4;
                                        break;
                                    }
                                    goto label_291;
                                }
                                iterator5 = iterator5;
                            }
                        }
                        catch(RuntimeException runtimeException0) {
                            v19 = v4;
                            fxqw.g("Best-effort Wifi scan conversion failed", runtimeException0);
                            goto label_372;
                        }
                        try {
                            gzwd0.b |= 8;
                            gzwd0.f = z1;
                            goto label_291;
                        label_290:
                            v19 = v4;
                        label_291:
                            if(fxsd0.h != 0) {
                                ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)gzwe.a).v_newBuilder();
                                int v20 = fxsd0.h;
                                if(!hftp7.b_message.isImmutable()) {
                                    hftp7.ensureMutable();
                                }
                                ProtoLiteMessage hftv3 = hftp7.b_message;
                                ((gzwe)hftv3).b |= 1;
                                ((gzwe)hftv3).c = v20;
                                int v21 = fxsd0.i;
                                if(!hftv3.isImmutable()) {
                                    hftp7.ensureMutable();
                                }
                                ProtoLiteMessage hftv4 = hftp7.b_message;
                                ((gzwe)hftv4).b |= 2;
                                ((gzwe)hftv4).d = v21;
                                int v22 = fxsd0.j;
                                if(!hftv4.isImmutable()) {
                                    hftp7.ensureMutable();
                                }
                                ProtoLiteMessage hftv5 = hftp7.b_message;
                                ((gzwe)hftv5).b |= 4;
                                ((gzwe)hftv5).e = v22;
                                int v23 = fxsd0.k;
                                if(!hftv5.isImmutable()) {
                                    hftp7.ensureMutable();
                                }
                                ProtoLiteMessage hftv6 = hftp7.b_message;
                                ((gzwe)hftv6).b |= 8;
                                ((gzwe)hftv6).f = v23;
                                int v24 = fxsd0.l;
                                if(!hftv6.isImmutable()) {
                                    hftp7.ensureMutable();
                                }
                                gzwe gzwe0 = (gzwe)hftp7.b_message;
                                gzwe0.b |= 16;
                                gzwe0.g = v24;
                                gzwe gzwe1 = (gzwe)hftp7.N_build();
                                if(!hftp6.b_message.isImmutable()) {
                                    hftp6.ensureMutable();
                                }
                                gzwd gzwd1 = (gzwd)hftp6.b_message;
                                gzwe1.getClass();
                                gzwd1.h = gzwe1;
                                gzwd1.b |= 0x20;
                            }
                            String s3 = fxsd0.m;
                            if(hzee0.b().d()) {
                                s3 = (fxsd0.b & 0x400) == 0 ? null : fxsd0.m;
                            }
                            if(s3 != null) {
                                if(!hftp6.b_message.isImmutable()) {
                                    hftp6.ensureMutable();
                                }
                                gzwd gzwd2 = (gzwd)hftp6.b_message;
                                gzwd2.b |= 0x40;
                                gzwd2.i = s3;
                            }
                            if((fxsd0.b & 16) != 0) {
                                int v25 = fxsd0.g;
                                if(!hftp6.b_message.isImmutable()) {
                                    hftp6.ensureMutable();
                                }
                                gzwd gzwd3 = (gzwd)hftp6.b_message;
                                gzwd3.b |= 16;
                                gzwd3.g = v25;
                            }
                            if((fxsd0.b & 1) != 0) {
                                long v26 = fxsd0.c;
                                if(!hftp6.b_message.isImmutable()) {
                                    hftp6.ensureMutable();
                                }
                                gzwd gzwd4 = (gzwd)hftp6.b_message;
                                gzwd4.b |= 1;
                                gzwd4.c = v26;
                            }
                            if((fxsd0.b & 2) != 0) {
                                int v27 = fxsd0.d;
                                if(!hftp6.b_message.isImmutable()) {
                                    hftp6.ensureMutable();
                                }
                                gzwd gzwd5 = (gzwd)hftp6.b_message;
                                gzwd5.b |= 2;
                                gzwd5.d = v27;
                            }
                            arrayList7.add(((gzwd)hftp6.N_build()));
                            iterator5 = iterator5;
                            v4 = v19;
                            goto label_260;
                        }
                        catch(RuntimeException runtimeException0) {
                        }
                        fxqw.g("Best-effort Wifi scan conversion failed", runtimeException0);
                        goto label_372;
                    }
                }
                v19 = v4;
            label_372:
                arrayList7 = null;
            label_373:
                if(arrayList7 != null) {
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    gzuk gzuk0 = (gzuk)hftp5.b_message;
                    hfuo hfuo2 = gzuk0.f;
                    if(!hfuo2.c()) {
                        gzuk0.f = ProtoLiteMessage.E(hfuo2);
                    }
                    hfrj.E(arrayList7, gzuk0.f);
                }
                if((fxrv0.b & 0x200) != 0) {
                    boolean z2 = fxrv0.k;
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    gzuk gzuk1 = (gzuk)hftp5.b_message;
                    gzuk1.b |= 4;
                    gzuk1.d = z2;
                }
                if((fxrv0.b & 0x2000) != 0) {
                    fxro fxro0 = fxrv0.p == null ? fxro.a : fxrv0.p;
                    if((fxro0.b & 1) == 0) {
                    label_411:
                        hftp8 = ((ProtoLiteMessage)gzsu.a).v_newBuilder();
                    }
                    else {
                        int v28 = fxrn.a(fxro0.c) == 0 ? 1 : fxrn.a(fxro0.c);
                        switch(v28 - 1) {
                            case 0: {
                                v29 = 1;
                                hftp8 = ((ProtoLiteMessage)gzsu.a).v_newBuilder();
                                break;
                            }
                            case 1: {
                                v29 = 4;
                                hftp8 = ((ProtoLiteMessage)gzsu.a).v_newBuilder();
                                break;
                            }
                            default: {
                                switch(v28 - 1) {
                                    case 2: {
                                        v29 = 2;
                                        hftp8 = ((ProtoLiteMessage)gzsu.a).v_newBuilder();
                                        break;
                                    }
                                    case 4: {
                                        v29 = 3;
                                        hftp8 = ((ProtoLiteMessage)gzsu.a).v_newBuilder();
                                        break;
                                    }
                                    default: {
                                        goto label_411;
                                    }
                                }
                            }
                        }
                        if(!hftp8.b_message.isImmutable()) {
                            hftp8.ensureMutable();
                        }
                        ((gzsu)hftp8.b_message).f = v29 - 1;
                        ((gzsu)hftp8.b_message).b |= 8;
                    }
                    int v30 = fxro0.e;
                    if(!hftp8.b_message.isImmutable()) {
                        hftp8.ensureMutable();
                    }
                    ProtoLiteMessage hftv7 = hftp8.b_message;
                    ((gzsu)hftv7).b |= 1;
                    ((gzsu)hftv7).c = v30;
                    int v31 = fxro0.d;
                    if(!hftv7.isImmutable()) {
                        hftp8.ensureMutable();
                    }
                    ProtoLiteMessage hftv8 = hftp8.b_message;
                    ((gzsu)hftv8).b |= 2;
                    ((gzsu)hftv8).d = v31;
                    int v32 = fxro0.f;
                    if(!hftv8.isImmutable()) {
                        hftp8.ensureMutable();
                    }
                    gzsu gzsu0 = (gzsu)hftp8.b_message;
                    gzsu0.b |= 4;
                    gzsu0.e = v32;
                    gzsu gzsu1 = (gzsu)hftp8.N_build();
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    gzuk gzuk2 = (gzuk)hftp5.b_message;
                    gzsu1.getClass();
                    gzuk2.e = gzsu1;
                    gzuk2.b |= 8;
                }
                gzuk gzuk3 = (gzuk)hftp5.N_build();
                ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)gztu.a).v_newBuilder();
                if((fxrv0.b & 0x10000) != 0) {
                    long v33 = fxrv0.s;
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    gztu gztu0 = (gztu)hftp9.b_message;
                    gztu0.b |= 0x20;
                    gztu0.i = v33;
                }
                if((fxrv0.b & 4) == 0) {
                    fxqw.h(new IllegalStateException(a.as(((byte)(fxru.a(fxrv0.d) == 0 ? 1 : fxru.a(fxrv0.d))), ((byte)-1), ((byte)"Location missing timestamp; source="))));
                }
                else {
                    long v34 = fxrv0.e;
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    gztu gztu1 = (gztu)hftp9.b_message;
                    gztu1.b |= 1;
                    gztu1.c = v34;
                }
                if((fxrv0.b & 0x4000) != 0) {
                    int v35 = fxrv0.q;
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    gztu gztu2 = (gztu)hftp9.b_message;
                    gztu2.b |= 8;
                    gztu2.g = v35;
                }
                if((fxrv0.b & 0x8000) != 0) {
                    int v36 = fxrv0.r;
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    gztu gztu3 = (gztu)hftp9.b_message;
                    gztu3.b |= 16;
                    gztu3.h = v36;
                }
                if(arrayList6 != null) {
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    gztu gztu4 = (gztu)hftp9.b_message;
                    hfuo hfuo3 = gztu4.f;
                    if(!hfuo3.c()) {
                        gztu4.f = ProtoLiteMessage.E(hfuo3);
                    }
                    hfrj.E(arrayList6, gztu4.f);
                }
                if(!hftp9.b_message.isImmutable()) {
                    hftp9.ensureMutable();
                }
                ProtoLiteMessage hftv9 = hftp9.b_message;
                gzts9.getClass();
                ((gztu)hftv9).e = gzts9;
                ((gztu)hftv9).b |= 4;
                if(!hftv9.isImmutable()) {
                    hftp9.ensureMutable();
                }
                gztu gztu5 = (gztu)hftp9.b_message;
                gzuk3.getClass();
                gztu5.d = gzuk3;
                gztu5.b |= 2;
                arrayList5.add(((gztu)hftp9.N_build()));
                iterator3 = iterator4;
                v4 = v19;
            }
        }
        gzss gzss0 = this.d(fxqp0, arrayList2, arrayList5);
        gzvw gzvw0 = gzvw.a;
        ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)gzvw0).v_newBuilder();
        if(!hftp10.b_message.isImmutable()) {
            hftp10.ensureMutable();
        }
        ProtoLiteMessage hftv10 = hftp10.b_message;
        ((gzvw)hftv10).b |= 1;
        ((gzvw)hftv10).c = v;
        if(!hftv10.isImmutable()) {
            hftp10.ensureMutable();
        }
        ProtoLiteMessage hftv11 = hftp10.b_message;
        gzsx0.getClass();
        ((gzvw)hftv11).d = gzsx0;
        ((gzvw)hftv11).b |= 2;
        if(!hftv11.isImmutable()) {
            hftp10.ensureMutable();
        }
        ProtoLiteMessage hftv12 = hftp10.b_message;
        gzss0.getClass();
        ((gzvw)hftv12).f = gzss0;
        ((gzvw)hftv12).b |= 8;
        if(!hftv12.isImmutable()) {
            hftp10.ensureMutable();
        }
        ProtoLiteMessage hftv13 = hftp10.b_message;
        ((gzvw)hftv13).b |= 4;
        ((gzvw)hftv13).e = v1;
        if(!hftv13.isImmutable()) {
            hftp10.ensureMutable();
        }
        gzvw gzvw1 = (gzvw)hftp10.b_message;
        gzvw1.b |= 16;
        gzvw1.g = v4;
        gzvw gzvw2 = (gzvw)hftp10.N_build();
        try {
            long v37 = 0x8000000000000000L;
            long v38 = 0x7FFFFFFFFFFFFFFFL;
            for(Object object6: fxqp0.a) {
                v38 = Math.min(v38, ((fxrv)object6).e);
                v37 = Math.max(v37, ((fxrv)object6).e);
            }
            fxrd.a("UlrRpcDevReportLocations", "UlrRpcBetaReportLocations", "UlrRpcProdReportLocations", 3);
            if(fxrc.q()) {
                fxrc.a.t(v4 - v38 - v38, v38, v37);
            }
            fxsp fxsp0 = new fxsp(fxsg.i, cmlp.a, ckim.b);
            baqr baqr0 = fxsg.a(this.j, account0);
            if(fxsp.e == null) {
                ibjh ibjh0 = new ibjh(((MessageLite)gzvw0));
                ibjh ibjh1 = new ibjh(((MessageLite)gzvv.a));
                fxsp.e = new gRPCMethodDescriptor(gRPCMethodType.a, "userlocation.UserLocationReportingService/ReportApiBatch", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
            }
            gzvv gzvv0 = (gzvv)fxsp0.g.callUnaryWithAuth(fxsp.e, baqr0, gzvw2, 10000L, TimeUnit.MILLISECONDS, fxsp0.h);
            if(arrayList5 != null) {
                int v39 = arrayList5.size() - gzvv0.d;
                if(v39 > 0) {
                    fxra.l("UlrServerLocationsMissing", ((long)v39));
                }
                else if(v39 < 0) {
                    fxra.l("UlrServerLocationsExtra", ((long)(-v39)));
                }
            }
            fxrd.a("UlrRpcDevReportLocations", "UlrRpcBetaReportLocations", "UlrRpcProdReportLocations", 1);
            fxrc.l(true);
            return (gzvv0.b & 1) == 0 ? null : fxsf.b(account0, (gzvv0.c == null ? gzvd.a : gzvv0.c));
        }
        catch(iapl | acse exception0) {
            fxrd.a("UlrRpcDevReportLocations", "UlrRpcBetaReportLocations", "UlrRpcProdReportLocations", 2);
            if(!hzeq.f()) {
                fxrc.l(false);
            }
            else if(fxrc.t()) {
                fxrc.a.x(fxrc.w(exception0));
            }
            throw exception0;
        }
    }

    public final ProtoLiteBuilder c(String s, boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzsa.a).v_newBuilder();
        String s1 = fxsg.d;
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzsa gzsa0 = (gzsa)hftp0.b_message;
            gzsa0.b |= 8;
            gzsa0.f = s1;
        }
        String s2 = fxsg.h;
        if(s2 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzsa gzsa1 = (gzsa)hftp0.b_message;
            gzsa1.b |= 1;
            gzsa1.c = s2;
        }
        String s3 = fxsg.f;
        if(s3 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzsa gzsa2 = (gzsa)hftp0.b_message;
            gzsa2.b |= 2;
            gzsa2.d = s3;
        }
        String s4 = fxsg.e;
        if(s4 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzsa gzsa3 = (gzsa)hftp0.b_message;
            gzsa3.b |= 4;
            gzsa3.e = s4;
        }
        String s5 = fxsg.g;
        if(s5 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzsa gzsa4 = (gzsa)hftp0.b_message;
            gzsa4.b |= 16;
            gzsa4.g = s5;
        }
        boolean z1 = this.n.booleanValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzsa gzsa5 = (gzsa)hftp0.b_message;
        gzsa5.b |= 0x40;
        gzsa5.h = z1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzsx.a).v_newBuilder();
        gzsa gzsa6 = (gzsa)hftp0.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gzsa6.getClass();
        ((gzsx)hftv0).m = gzsa6;
        ((gzsx)hftv0).b |= 0x20000;
        int v = this.k;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gzsx gzsx0 = (gzsx)hftp1.b_message;
        gzsx0.b |= 0x8000;
        gzsx0.k = v;
        if(hzee.a.b().g()) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gzsx)hftp1.b_message).d = 1;
            ((gzsx)hftp1.b_message).b |= 2;
        }
        if(z) {
            String s6 = fxsg.c;
            if(s6 != null) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gzsx gzsx1 = (gzsx)hftp1.b_message;
                gzsx1.b |= 0x800;
                gzsx1.g = s6;
            }
            String s7 = fxsg.b;
            if(s7 != null) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gzsx gzsx2 = (gzsx)hftp1.b_message;
                gzsx2.b |= 1;
                gzsx2.c = s7;
            }
            if(s != null) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gzsx gzsx3 = (gzsx)hftp1.b_message;
                gzsx3.b |= 0x2000;
                gzsx3.i = s;
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((gzsx)hftv1).h = 0;
            ((gzsx)hftv1).b |= 0x1000;
            int v1 = this.m;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp1.b_message;
            ((gzsx)hftv2).b |= 0x40000;
            ((gzsx)hftv2).n = v1;
            if(!hftv2.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp1.b_message;
            ((gzsx)hftv3).b |= 4;
            ((gzsx)hftv3).e = 2023;
            int v2 = fxsg.a;
            if(!hftv3.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp1.b_message;
            ((gzsx)hftv4).b |= 0x200;
            ((gzsx)hftv4).f = v2;
            int v3 = this.l;
            if(!hftv4.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzsx gzsx4 = (gzsx)hftp1.b_message;
            gzsx4.b |= 0x10000;
            gzsx4.l = v3;
        }
        return hftp1;
    }

    private final gzss d(fxqp fxqp0, ArrayList arrayList0, ArrayList arrayList1) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = fxqp0.d;
        int v = arrayList3.size();
        for(int v2 = 0; v2 < v; ++v2) {
            arrayList2.addAll(((gzuw)arrayList3.get(v2)).b);
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzuw.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzuw gzuw0 = (gzuw)hftp0.b_message;
        hfuo hfuo0 = gzuw0.b;
        if(!hfuo0.c()) {
            gzuw0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(arrayList2, gzuw0.b);
        gzuw gzuw1 = (gzuw)hftp0.N_build();
        ArrayList arrayList4 = fxqp0.e;
        Context context0 = this.j;
        gztn gztn0 = fxvd.d == null ? null : fxvd.d.a(context0);
        gztn gztn1 = fxvd.c == null ? null : fxvd.c.a(context0);
        gztn gztn2 = fxvd.b == null ? null : fxvd.b.a(context0);
        gzsr gzsr0 = (gzsr)((ProtoLiteMessage)gzss.a).v_newBuilder();
        gzsr0.a(fxqp0.c);
        if(!gzsr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gzsr0).ensureMutable();
        }
        gzss gzss0 = (gzss)gzsr0.b_message;
        hfuo hfuo1 = gzss0.g;
        if(!hfuo1.c()) {
            gzss0.g = ProtoLiteMessage.E(hfuo1);
        }
        hfrj.E(arrayList4, gzss0.g);
        ArrayList arrayList5 = new ArrayList();
        int v3 = arrayList1.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            gztu gztu0 = (gztu)arrayList1.get(v1);
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzty.a).v_newBuilder();
            long v4 = gztu0.c;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzty gzty0 = (gzty)hftp1.b_message;
            gzty0.b |= 1;
            gzty0.c = v4;
            boolean z = hzdy.c();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzty gzty1 = (gzty)hftp1.b_message;
            gzty1.b |= 0x10000;
            gzty1.p = z;
            boolean z1 = hyac.X();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzty gzty2 = (gzty)hftp1.b_message;
            gzty2.b |= 0x20000;
            gzty2.q = z1;
            arrayList5.add(((gzty)hftp1.N_build()));
        }
        gzsr0.a(arrayList5);
        if(arrayList0 != null) {
            if(!gzsr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gzsr0).ensureMutable();
            }
            gzss gzss1 = (gzss)gzsr0.b_message;
            hfuo hfuo2 = gzss1.d;
            if(!hfuo2.c()) {
                gzss1.d = ProtoLiteMessage.E(hfuo2);
            }
            hfrj.E(arrayList0, gzss1.d);
        }
        if(!gzsr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gzsr0).ensureMutable();
        }
        gzss gzss2 = (gzss)gzsr0.b_message;
        hfuo hfuo3 = gzss2.c;
        if(!hfuo3.c()) {
            gzss2.c = ProtoLiteMessage.E(hfuo3);
        }
        hfrj.E(arrayList1, gzss2.c);
        if(gzuw1 != null) {
            if(!gzsr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gzsr0).ensureMutable();
            }
            ((gzss)gzsr0.b_message).f = gzuw1;
            ((gzss)gzsr0.b_message).b |= 1;
        }
        if(gztn0 != null) {
            if(!gzsr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gzsr0).ensureMutable();
            }
            ((gzss)gzsr0.b_message).j = gztn0;
            ((gzss)gzsr0.b_message).b |= 8;
        }
        if(gztn1 != null) {
            if(!gzsr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gzsr0).ensureMutable();
            }
            ((gzss)gzsr0.b_message).h = gztn1;
            ((gzss)gzsr0.b_message).b |= 2;
        }
        if(gztn2 != null) {
            if(!gzsr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gzsr0).ensureMutable();
            }
            ((gzss)gzsr0.b_message).i = gztn2;
            ((gzss)gzsr0.b_message).b |= 4;
        }
        gztn gztn3 = fxvd.e == null ? null : fxvd.e.a(context0);
        if(gztn3 != null) {
            if(!gzsr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gzsr0).ensureMutable();
            }
            ((gzss)gzsr0.b_message).k = gztn3;
            ((gzss)gzsr0.b_message).b |= 16;
        }
        return (gzss)((ProtoLiteBuilder)gzsr0).N_build();
    }
}

