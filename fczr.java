import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.ConnectionDelayFilters;
import com.google.android.gms.wearable.ConnectionRestrictions;
import com.google.android.gms.wearable.DataItemFilter;
import j..util.Objects;
import java.util.List;

public final class fczr {
    public static fczq a(ConnectionConfiguration connectionConfiguration0, String s) {
        gged_interceptors gged0;
        feyx feyx0;
        fczp fczp0 = fczq.a();
        fczp0.a = connectionConfiguration0.a;
        fczp0.b = connectionConfiguration0.b;
        fczp0.n(connectionConfiguration0.c);
        fczp0.k(connectionConfiguration0.d);
        fczp0.c(connectionConfiguration0.e);
        fczp0.f(connectionConfiguration0.f);
        fczp0.c = connectionConfiguration0.g;
        fczp0.b(connectionConfiguration0.h);
        fczp0.d = connectionConfiguration0.i;
        fczp0.e = connectionConfiguration0.j;
        fczp0.d(connectionConfiguration0.k);
        fczp0.f = connectionConfiguration0.l;
        fczp0.g(connectionConfiguration0.m);
        fczp0.e(connectionConfiguration0.n);
        fczp0.j(connectionConfiguration0.p);
        fczp0.h(connectionConfiguration0.r);
        fczp0.l(connectionConfiguration0.s);
        fczp0.m(connectionConfiguration0.t);
        ConnectionRestrictions connectionRestrictions0 = connectionConfiguration0.o;
        if(connectionRestrictions0 != null) {
            ffbk ffbk0 = ffbk.a;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffbk0).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffbk ffbk1 = (ffbk)hftp0.b_message;
            s.getClass();
            ffbk1.b |= 1;
            ffbk1.c = s;
            List list0 = connectionRestrictions0.a;
            feyb feyb0 = null;
            if(list0 == null) {
                feyx0 = null;
            }
            else {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)feyx.a).v_newBuilder();
                for(Object object0: list0) {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)feyu.a).v_newBuilder();
                    String s1 = (String)Objects.requireNonNull(((DataItemFilter)object0).a.toString());
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    feyu feyu0 = (feyu)hftp2.b_message;
                    s1.getClass();
                    feyu0.b |= 2;
                    feyu0.d = s1;
                    int v = fczs.b(((DataItemFilter)object0).b);
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((feyu)hftp2.b_message).c = v - 1;
                    ((feyu)hftp2.b_message).b |= 1;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    feyx feyx1 = (feyx)hftp1.b_message;
                    feyu feyu1 = (feyu)hftp2.N_build();
                    feyu1.getClass();
                    feyx1.b();
                    feyx1.b.add(feyu1);
                }
                feyx0 = (feyx)hftp1.N_build();
            }
            if(feyx0 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ffbk)hftp0.b_message).d = feyx0;
                ((ffbk)hftp0.b_message).b |= 2;
            }
            List list1 = connectionRestrictions0.b;
            if(list1 != null) {
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)feyb.a).v_newBuilder();
                for(Object object1: list1) {
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)feya.a).v_newBuilder();
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    feya feya0 = (feya)hftp4.b_message;
                    ((String)object1).getClass();
                    feya0.b |= 1;
                    feya0.c = (String)object1;
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    feyb feyb1 = (feyb)hftp3.b_message;
                    feya feya1 = (feya)hftp4.N_build();
                    feya1.getClass();
                    hfuo hfuo0 = feyb1.b;
                    if(!hfuo0.c()) {
                        feyb1.b = ProtoLiteMessage.E(hfuo0);
                    }
                    feyb1.b.add(feya1);
                }
                feyb0 = (feyb)hftp3.N_build();
            }
            if(feyb0 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ffbk)hftp0.b_message).e = feyb0;
                ((ffbk)hftp0.b_message).b |= 4;
            }
            ffay ffay0 = (ffay)((ProtoLiteMessage)ffaz.a).v_newBuilder();
            ffbk ffbk2 = (ffbk)hftp0.N_build();
            if(!ffay0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)ffay0).ensureMutable();
            }
            ffaz ffaz0 = (ffaz)ffay0.b_message;
            ffbk2.getClass();
            ffaz0.b();
            ffaz0.b.add(ffbk2);
            List list2 = connectionRestrictions0.c;
            if(list2 == null) {
                gged0 = ggna.a;
            }
            else {
                ggdy ggdy0 = new ggdy();
                for(Object object2: list2) {
                    ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)ffbk0).v_newBuilder();
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ffbk ffbk3 = (ffbk)hftp5.b_message;
                    ((String)object2).getClass();
                    ffbk3.b |= 1;
                    ffbk3.c = (String)object2;
                    ggdy0.i(((ffbk)hftp5.N_build()));
                }
                gged0 = ggdy0.h();
            }
            ffay0.a(gged0);
            fczp0.g = (ffaz)((ProtoLiteBuilder)ffay0).N_build();
        }
        ConnectionDelayFilters connectionDelayFilters0 = connectionConfiguration0.q;
        if(connectionDelayFilters0 != null) {
            ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)feym.a).v_newBuilder();
            List list3 = connectionDelayFilters0.a;
            if(list3 != null) {
                ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)feyx.a).v_newBuilder();
                for(Object object3: list3) {
                    ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)feyu.a).v_newBuilder();
                    int v1 = fczs.b(((DataItemFilter)object3).b);
                    if(!hftp8.b_message.isImmutable()) {
                        hftp8.ensureMutable();
                    }
                    ((feyu)hftp8.b_message).c = v1 - 1;
                    ((feyu)hftp8.b_message).b |= 1;
                    String s2 = ((DataItemFilter)object3).a.toString();
                    if(!hftp8.b_message.isImmutable()) {
                        hftp8.ensureMutable();
                    }
                    feyu feyu2 = (feyu)hftp8.b_message;
                    s2.getClass();
                    feyu2.b |= 2;
                    feyu2.d = s2;
                    feyu feyu3 = (feyu)hftp8.N_build();
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    feyx feyx2 = (feyx)hftp7.b_message;
                    feyu3.getClass();
                    feyx2.b();
                    feyx2.b.add(feyu3);
                }
                feyx feyx3 = (feyx)hftp7.N_build();
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                feym feym0 = (feym)hftp6.b_message;
                feyx3.getClass();
                feym0.c = feyx3;
                feym0.b |= 1;
            }
            fczp0.h = (feym)hftp6.N_build();
        }
        return fczp0.a();
    }

    public static ConnectionConfiguration[] b(fczq[] arr_fczq) {
        gged_interceptors gged1;
        gged_interceptors gged0;
        ffbk ffbk0;
        fczq[] arr_fczq1 = arr_fczq;
        ConnectionConfiguration[] arr_connectionConfiguration = new ConnectionConfiguration[arr_fczq1.length];
        int v = 0;
        while(v < arr_fczq1.length) {
            fczq fczq0 = arr_fczq1[v];
            fcek fcek0 = new fcek();
            List list0 = null;
            fcek0.a = null;
            fcek0.b = null;
            fcek0.e(false);
            fcek0.b(true);
            fcek0.g = null;
            fcek0.a(true);
            fcek0.i = null;
            fcek0.j = null;
            fcek0.c(0);
            fcek0.l = null;
            fcek0.f(false);
            fcek0.d(true);
            fcek0.o = null;
            fcek0.h(true);
            fcek0.g(0);
            fcek0.i(0);
            fcek0.j(false);
            fcek0.a = fczq0.b;
            fcek0.b = fczq0.c;
            fcek0.c = fczq0.d;
            int v1 = fcek0.u;
            fcek0.u = (short)(v1 | 1);
            fcek0.d = fczq0.e;
            fcek0.u = (short)(v1 | 3);
            fcek0.b(fczq0.f);
            fcek0.e(fczq0.g);
            fcek0.g = fczq0.h;
            fcek0.a(fczq0.i);
            fcek0.i = fczq0.j;
            fcek0.j = fczq0.k;
            fcek0.c(fczq0.l);
            fcek0.l = fczq0.m;
            fcek0.f(fczq0.n);
            fcek0.d(fczq0.o);
            fcek0.h(fczq0.q);
            fcek0.g(fczq0.s);
            fcek0.i(fczq0.u);
            fcek0.j(fczq0.t);
            ffaz ffaz0 = fczq0.p;
            if(ffaz0 != null) {
                String s = fczq0.k;
                if(s == null) {
                    Log.w("ConnectionConfigAdapter", "Dropping restrictions, packageName is null");
                }
                else {
                    for(Object object0: ffaz0.b) {
                        ffbk0 = (ffbk)object0;
                        if(!s.equals(ffbk0.c)) {
                            continue;
                        }
                        goto label_56;
                    }
                    ffbk0 = null;
                label_56:
                    if(ffbk0 == null) {
                        gged0 = null;
                    }
                    else {
                        ggdy ggdy0 = new ggdy();
                        for(Object object1: (ffbk0.d == null ? feyx.a : ffbk0.d).b) {
                            fcex fcex0 = new fcex();
                            fcex0.c(Uri.parse(((feyu)object1).d));
                            int v2 = feyw.a(((feyu)object1).c);
                            if(v2 == 0) {
                                v2 = 1;
                            }
                            fcex0.b(fczs.a(v2));
                            ggdy0.i(fcex0.a());
                        }
                        gged0 = ggdy0.h();
                    }
                    if(ffbk0 != null) {
                        ggdy ggdy1 = new ggdy();
                        for(Object object2: (ffbk0.e == null ? feyb.a : ffbk0.e).b) {
                            ggdy1.i(((feya)object2).c);
                        }
                        list0 = ggdy1.h();
                    }
                    ggdy ggdy2 = new ggdy();
                    for(Object object3: ffaz0.b) {
                        ffbk ffbk1 = (ffbk)object3;
                        if(!s.equals(ffbk1.c)) {
                            ggdy2.i(ffbk1.c);
                        }
                    }
                    fcek0.o = new ConnectionRestrictions(gged0, list0, ggdy2.h());
                }
            }
            feym feym0 = fczq0.r;
            if(feym0 != null) {
                feyx feyx0 = feym0.c == null ? feyx.a : feym0.c;
                if(feyx0 == null) {
                    gged1 = ggna.a;
                }
                else {
                    ggdy ggdy3 = new ggdy();
                    for(Object object4: feyx0.b) {
                        fcex fcex1 = new fcex();
                        int v3 = feyw.a(((feyu)object4).c);
                        if(v3 == 0) {
                            v3 = 1;
                        }
                        fcex1.b(fczs.a(v3));
                        fcex1.c(Uri.parse(((feyu)object4).d));
                        ggdy3.i(fcex1.a());
                    }
                    gged1 = ggdy3.h();
                }
                fcek0.q = new ConnectionDelayFilters(gged1);
            }
            if(fcek0.u != 0xFFF) {
                StringBuilder stringBuilder0 = new StringBuilder();
                if((fcek0.u & 1) == 0) {
                    stringBuilder0.append(" type");
                }
                if((fcek0.u & 2) == 0) {
                    stringBuilder0.append(" role");
                }
                if((fcek0.u & 4) == 0) {
                    stringBuilder0.append(" connectionEnabled");
                }
                if((fcek0.u & 8) == 0) {
                    stringBuilder0.append(" isConnected");
                }
                if((fcek0.u & 16) == 0) {
                    stringBuilder0.append(" btlePriority");
                }
                if((fcek0.u & 0x20) == 0) {
                    stringBuilder0.append(" connectionRetryStrategy");
                }
                if((fcek0.u & 0x40) == 0) {
                    stringBuilder0.append(" isMigrating");
                }
                if((fcek0.u & 0x80) == 0) {
                    stringBuilder0.append(" dataItemSyncEnabled");
                }
                if((fcek0.u & 0x100) == 0) {
                    stringBuilder0.append(" removeConnectionWhenBondRemovedByUser");
                }
                if((fcek0.u & 0x200) == 0) {
                    stringBuilder0.append(" maxSupportedRemoteAndroidSdkVersion");
                }
                if((fcek0.u & 0x400) == 0) {
                    stringBuilder0.append(" runtimeType");
                }
                if((fcek0.u & 0x800) == 0) {
                    stringBuilder0.append(" skipConnectingIfDeviceNotBonded");
                }
                throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
            }
            arr_connectionConfiguration[v] = new ConnectionConfiguration(fcek0.a, fcek0.b, fcek0.c, fcek0.d, fcek0.e, fcek0.f, fcek0.g, fcek0.h, fcek0.i, fcek0.j, fcek0.k, fcek0.l, fcek0.m, fcek0.n, fcek0.o, fcek0.p, fcek0.q, fcek0.r, fcek0.s, fcek0.t);
            ++v;
            arr_fczq1 = arr_fczq;
        }
        return arr_connectionConfiguration;
    }
}

