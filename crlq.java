import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import j..util.DesugarCollections;
import j..util.Objects;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

final class crlq implements Callable {
    final EventParcel a;
    final String b;
    final crih c;

    public crlq(crih crih0, EventParcel eventParcel0, String s) {
        this.a = eventParcel0;
        this.b = s;
        Objects.requireNonNull(crih0);
        this.c = crih0;
        super();
    }

    @Override
    public final Object call() {
        long v8;
        crca crca1;
        crdn crdn1;
        crqv crqv0;
        byte[] arr_b;
        this.c.a.F();
        crnn crnn0 = this.c.a.f;
        crqq.aq(crnn0);
        crnn0.n();
        crkt crkt0 = crnn0.y;
        crkt0.r();
        EventParcel eventParcel0 = this.a;
        batl.s(eventParcel0);
        String s = this.b;
        batl.q(s);
        if(!"_iap".equals(eventParcel0.a) && !"_iapx".equals(eventParcel0.a)) {
            crnn0.aJ().j.c("Generating a payload for this event is not available. package_name, event_name", s, eventParcel0.a);
            return null;
        }
        crsr crsr0 = (crsr)((ProtoLiteMessage)crss.a).v_newBuilder();
        crnn0.at().C();
        try {
            crca crca0 = crnn0.at().i(s);
            if(crca0 == null) {
                goto label_407;
            }
            else {
                if(crca0.al()) {
                    crst crst0 = (crst)((ProtoLiteMessage)crsu.a).v_newBuilder();
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    crsu.e(((crsu)crst0.b_message));
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    crsu.d(((crsu)crst0.b_message));
                    if(!TextUtils.isEmpty(crca0.t())) {
                        String s1 = crca0.t();
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu0 = (crsu)crst0.b_message;
                        s1.getClass();
                        crsu0.b |= 0x1000;
                        crsu0.r = s1;
                    }
                    if(!TextUtils.isEmpty(crca0.v())) {
                        String s2 = crca0.v();
                        batl.s(s2);
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu1 = (crsu)crst0.b_message;
                        crsu1.b |= 0x800;
                        crsu1.q = s2;
                    }
                    if(!TextUtils.isEmpty(crca0.w())) {
                        String s3 = crca0.w();
                        batl.s(s3);
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu2 = (crsu)crst0.b_message;
                        crsu2.b |= 0x2000;
                        crsu2.s = s3;
                    }
                    if(crca0.c() != 0xFFFFFFFF80000000L) {
                        int v1 = (int)crca0.c();
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu3 = (crsu)crst0.b_message;
                        crsu3.b |= 0x2000000;
                        crsu3.F = v1;
                    }
                    long v2 = crca0.i();
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    crsu crsu4 = (crsu)crst0.b_message;
                    crsu4.b |= 0x4000;
                    crsu4.t = v2;
                    long v3 = crca0.g();
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    ((crsu)crst0.b_message).c |= 16;
                    ((crsu)crst0.b_message).L = v3;
                    String s4 = crca0.y();
                    if(!TextUtils.isEmpty(s4)) {
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu5 = (crsu)crst0.b_message;
                        s4.getClass();
                        crsu5.b |= 0x400000;
                        crsu5.B = s4;
                    }
                    long v4 = crca0.o();
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    ((crsu)crst0.b_message).c |= 0x8000;
                    ((crsu)crst0.b_message).R = v4;
                    crqq crqq0 = crnn0.m;
                    crmb crmb0 = crqq0.w(s);
                    long v5 = crca0.f();
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    crsu crsu6 = (crsu)crst0.b_message;
                    crsu6.b |= 0x80000;
                    crsu6.y = v5;
                    if(crkt0.v() && crnn0.am().v(((crsu)crst0.b_message).r) && crmb0.o()) {
                        String s5 = crqq0.a(s, 50L, crmb0);
                        if(!TextUtils.isEmpty(s5)) {
                            if(!crst0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crst0).ensureMutable();
                            }
                            crsu crsu7 = (crsu)crst0.b_message;
                            s5.getClass();
                            crsu7.b |= 0x80000000;
                            crsu7.I = s5;
                        }
                    }
                    String s6 = crmb0.m();
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    ((crsu)crst0.b_message).c |= 0x80;
                    ((crsu)crst0.b_message).N = s6;
                    if(crmb0.o() && crca0.ak()) {
                        Pair pair0 = crnn0.av().d(crca0.t(), crmb0);
                        if(crca0.ak() && !TextUtils.isEmpty(((CharSequence)pair0.first))) {
                            try {
                                String s7 = crnn0.b(((String)pair0.first), Long.toString(eventParcel0.d));
                                if(!crst0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)crst0).ensureMutable();
                                }
                                crsu crsu8 = (crsu)crst0.b_message;
                                s7.getClass();
                                crsu8.b |= 0x10000;
                                crsu8.v = s7;
                            }
                            catch(SecurityException securityException0) {
                                crnn0.aJ().j.b("Resettable device id encryption failed", securityException0.getMessage());
                                arr_b = new byte[0];
                                goto label_413;
                            }
                            if(pair0.second != null) {
                                boolean z = ((Boolean)pair0.second).booleanValue();
                                if(!crst0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)crst0).ensureMutable();
                                }
                                crsu crsu9 = (crsu)crst0.b_message;
                                crsu9.b |= 0x20000;
                                crsu9.w = z;
                            }
                        }
                    }
                    String s8 = crnn0.an().b();
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    crsu crsu10 = (crsu)crst0.b_message;
                    s8.getClass();
                    crsu10.b |= 0x100;
                    crsu10.n = s8;
                    String s9 = crnn0.an().c();
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    crsu crsu11 = (crsu)crst0.b_message;
                    s9.getClass();
                    crsu11.b |= 0x80;
                    crsu11.m = s9;
                    int v6 = (int)crnn0.an().a();
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    crsu crsu12 = (crsu)crst0.b_message;
                    crsu12.b |= 0x400;
                    crsu12.p = v6;
                    String s10 = crnn0.an().d();
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    crsu crsu13 = (crsu)crst0.b_message;
                    s10.getClass();
                    crsu13.b |= 0x200;
                    crsu13.o = s10;
                    try {
                        if(crmb0.q() && crca0.u() != null) {
                            String s11 = crca0.u();
                            batl.s(s11);
                            String s12 = crnn0.b(s11, Long.toString(eventParcel0.d));
                            if(!crst0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)crst0).ensureMutable();
                            }
                            crsu crsu14 = (crsu)crst0.b_message;
                            s12.getClass();
                            crsu14.b |= 0x40000;
                            crsu14.x = s12;
                        }
                    }
                    catch(SecurityException securityException1) {
                        crnn0.aJ().j.b("app instance id encryption failed", securityException1.getMessage());
                        arr_b = new byte[0];
                        goto label_413;
                    }
                    if(!TextUtils.isEmpty(crca0.x())) {
                        String s13 = crca0.x();
                        batl.s(s13);
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu15 = (crsu)crst0.b_message;
                        crsu15.b |= 0x1000000;
                        crsu15.E = s13;
                    }
                    String s14 = crca0.t();
                    List list0 = crnn0.at().z(s14);
                    for(Object object0: list0) {
                        crqv0 = (crqv)object0;
                        if(!"_lte".equals(crqv0.c)) {
                            continue;
                        }
                        goto label_184;
                    }
                    crqv0 = null;
                label_184:
                    if(crqv0 == null) {
                        crqv crqv1 = new crqv(s14, "auto", "_lte", System.currentTimeMillis(), ((long)0L));
                        list0.add(crqv1);
                        crnn0.at().Y(crqv1);
                    }
                    crtg[] arr_crtg = new crtg[list0.size()];
                    for(int v = 0; v < list0.size(); ++v) {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)crtg.a).v_newBuilder();
                        String s15 = ((crqv)list0.get(v)).c;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        crtg crtg0 = (crtg)hftp0.b_message;
                        s15.getClass();
                        crtg0.b |= 2;
                        crtg0.d = s15;
                        long v7 = ((crqv)list0.get(v)).d;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        crtg crtg1 = (crtg)hftp0.b_message;
                        crtg1.b |= 1;
                        crtg1.c = v7;
                        crnn0.aw().H(hftp0, ((crqv)list0.get(v)).e);
                        arr_crtg[v] = (crtg)hftp0.N_build();
                    }
                    List list1 = Arrays.asList(arr_crtg);
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    crsu crsu16 = (crsu)crst0.b_message;
                    crsu16.c();
                    hfrj.E(list1, crsu16.f);
                    crqq crqq1 = crnn0.m;
                    crqq1.L(crca0, crst0);
                    crqq1.T(crca0, crst0);
                    crjj crjj0 = crjj.b(eventParcel0);
                    crqx crqx0 = crnn0.aq();
                    Bundle bundle0 = crjj0.e;
                    crqx0.I(bundle0, crnn0.at().h(s));
                    crnn0.aq().J(crjj0, crnn0.am().d(s));
                    bundle0.putLong("_c", 1L);
                    crnn0.aJ().j.a("Marking in-app purchase as real-time");
                    bundle0.putLong("_r", 1L);
                    String s16 = eventParcel0.c;
                    bundle0.putString("_o", s16);
                    if(crnn0.aq().Z(((crsu)crst0.b_message).r, crca0.C())) {
                        Long long0 = (long)1L;
                        crnn0.aq().L(bundle0, "_dbg", long0);
                        crnn0.aq().L(bundle0, "_r", long0);
                    }
                    crdg crdg0 = crnn0.at();
                    String s17 = eventParcel0.a;
                    crdn crdn0 = crdg0.o(s, s17);
                    if(crdn0 == null) {
                        crdn1 = new crdn(s, s17, eventParcel0.d);
                        crca1 = crca0;
                        v8 = 0L;
                    }
                    else {
                        v8 = crdn0.f;
                        crca1 = crca0;
                        crdn1 = crdn0.c(eventParcel0.d);
                    }
                    crnn0.at().Q(crdn1);
                    crdm crdm0 = new crdm(crnn0.y, s16, s, s17, eventParcel0.d, v8, bundle0);
                    crsn crsn0 = (crsn)((ProtoLiteMessage)crso.a).v_newBuilder();
                    long v9 = crdm0.d;
                    if(!crsn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crsn0).ensureMutable();
                    }
                    crso crso0 = (crso)crsn0.b_message;
                    crso0.b |= 2;
                    crso0.e = v9;
                    String s18 = crdm0.b;
                    if(!crsn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crsn0).ensureMutable();
                    }
                    crso crso1 = (crso)crsn0.b_message;
                    s18.getClass();
                    crso1.b |= 1;
                    crso1.d = s18;
                    long v10 = crdm0.e;
                    if(!crsn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crsn0).ensureMutable();
                    }
                    crso crso2 = (crso)crsn0.b_message;
                    crso2.b |= 4;
                    crso2.f = v10;
                    EventParams eventParams0 = crdm0.f;
                    crdo crdo0 = new crdo(eventParams0);
                    while(crdo0.hasNext()) {
                        String s19 = crdo0.a();
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)crsq.a).v_newBuilder();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        crsq crsq0 = (crsq)hftp1.b_message;
                        s19.getClass();
                        crsq0.b |= 1;
                        crsq0.c = s19;
                        Object object1 = eventParams0.c(s19);
                        if(object1 != null) {
                            crnn0.aw().L(hftp1, object1);
                            crsn0.n(hftp1);
                        }
                    }
                    crst0.m(crsn0);
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)crsv.a).v_newBuilder();
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)crsp.a).v_newBuilder();
                    long v11 = crdn1.c;
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp3.b_message;
                    ((crsp)hftv0).b |= 2;
                    ((crsp)hftv0).d = v11;
                    if(!hftv0.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    crsp crsp0 = (crsp)hftp3.b_message;
                    s17.getClass();
                    crsp0.b |= 1;
                    crsp0.c = s17;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    crsv crsv0 = (crsv)hftp2.b_message;
                    crsp crsp1 = (crsp)hftp3.N_build();
                    crsp1.getClass();
                    hfuo hfuo0 = crsv0.b;
                    if(!hfuo0.c()) {
                        crsv0.b = ProtoLiteMessage.E(hfuo0);
                    }
                    crsv0.b.add(crsp1);
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    crsu crsu17 = (crsu)crst0.b_message;
                    crsv crsv1 = (crsv)hftp2.N_build();
                    crsv1.getClass();
                    crsu17.K = crsv1;
                    crsu17.c |= 8;
                    crcm crcm0 = crnn0.m.l();
                    String s20 = crca1.t();
                    List list2 = Collections.EMPTY_LIST;
                    List list3 = DesugarCollections.unmodifiableList(((crsu)crst0.b_message).f);
                    Long long1 = (long)((crso)crsn0.b_message).e;
                    crso crso3 = (crso)crsn0.b_message;
                    crst0.k(crcm0.b(s20, list2, list3, long1, false));
                    crso crso4 = (crso)crsn0.b_message;
                    if((crso4.b & 2) != 0) {
                        long v12 = crso4.e;
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu18 = (crsu)crst0.b_message;
                        crsu18.b |= 4;
                        crsu18.h = v12;
                        long v13 = ((crso)crsn0.b_message).e;
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu19 = (crsu)crst0.b_message;
                        crsu19.b |= 8;
                        crsu19.i = v13;
                    }
                    long v14 = crca1.k();
                    if(v14 == 0L) {
                        v14 = 0L;
                    }
                    else {
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu20 = (crsu)crst0.b_message;
                        crsu20.b |= 0x20;
                        crsu20.k = v14;
                    }
                    long v15 = crca1.m();
                    if(v15 != 0L) {
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu21 = (crsu)crst0.b_message;
                        crsu21.b |= 16;
                        crsu21.j = v15;
                    }
                    else if(v14 != 0L) {
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        crsu crsu22 = (crsu)crst0.b_message;
                        crsu22.b |= 16;
                        crsu22.j = v14;
                    }
                    String s21 = crca1.B();
                    hvih.c();
                    if(crnn0.am().u(s, crif.az) && s21 != null) {
                        if(!crst0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)crst0).ensureMutable();
                        }
                        ((crsu)crst0.b_message).c |= 0x2000;
                        ((crsu)crst0.b_message).O = s21;
                    }
                    crkt crkt1 = crca1.a;
                    crkt1.s();
                    long v16 = crca1.c + 1L;
                    if(v16 > 0x7FFFFFFFL) {
                        crkt1.aJ().f.b("Bundle index overflow. appId", crji.a(crca1.b));
                        v16 = 0L;
                    }
                    crca1.p = true;
                    crca1.c = v16;
                    int v17 = (int)crca1.l();
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    crsu crsu23 = (crsu)crst0.b_message;
                    crsu23.b |= 0x100000;
                    crsu23.z = v17;
                    long v18 = crnn0.am().i();
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    crsu crsu24 = (crsu)crst0.b_message;
                    crsu24.b |= 0x8000;
                    crsu24.u = v18;
                    long v19 = System.currentTimeMillis();
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    crsu crsu25 = (crsu)crst0.b_message;
                    crsu25.b |= 2;
                    crsu25.g = v19;
                    if(!crst0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)crst0).ensureMutable();
                    }
                    crsu crsu26 = (crsu)crst0.b_message;
                    crsu26.b |= 0x800000;
                    crsu26.C = true;
                    ((crqq)crdm0).I(crsu26.r, crst0);
                    crsr0.k(crst0);
                    crca1.X(((crsu)crst0.b_message).h);
                    crca1.V(((crsu)crst0.b_message).i);
                    crnn0.at().P(crca1);
                    crnn0.at().O();
                    goto label_399;
                }
                goto label_404;
            }
            goto label_413;
        }
        catch(Throwable throwable0) {
            crnn0.at().J();
            throw throwable0;
        }
    label_399:
        crnn0.at().J();
        try {
            return crnn0.aw().y(((crss)((ProtoLiteBuilder)crsr0).N_build()).toBytesArray());
        }
        catch(IOException iOException0) {
            crnn0.aJ().c.c("Data loss. Failed to bundle and serialize. appId", crji.a(s), iOException0);
            return null;
        }
        try {
        label_404:
            crnn0.aJ().j.b("Log and bundle disabled. package_name", s);
            arr_b = new byte[0];
            goto label_413;
        label_407:
            crnn0.aJ().j.b("Log and bundle not available. package_name", s);
            arr_b = new byte[0];
        }
        catch(Throwable throwable0) {
            crnn0.at().J();
            throw throwable0;
        }
    label_413:
        crnn0.at().J();
        return arr_b;
    }
}

