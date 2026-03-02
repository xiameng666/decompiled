import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.BatchUploadStatusParcel;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.ConsentParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UploadBatchesCriteria;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class crih extends wby implements crii {
    public final crqq a;
    private Boolean b;
    private String c;

    public crih() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public crih(crqq crqq0, String s) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        batl.s(crqq0);
        this.a = crqq0;
        this.c = s;
    }

    @Override  // crii
    public final ConsentParcel a(AppMetadata appMetadata0) {
        this.z(appMetadata0);
        batl.q(appMetadata0.a);
        Future future0 = this.a.aK().b(new crln(this, appMetadata0));
        try {
            return (ConsentParcel)future0.get(10000L, TimeUnit.MILLISECONDS);
        }
        catch(TimeoutException | InterruptedException | ExecutionException exception0) {
            this.a.aJ().c.c("Failed to get consent. appId", crji.a(appMetadata0.a), exception0);
            return new ConsentParcel(null);
        }
    }

    @Override  // crii
    public final String b(AppMetadata appMetadata0) {
        this.z(appMetadata0);
        return this.a.C(appMetadata0);
    }

    @Override  // crii
    public final List c(String s, String s1, AppMetadata appMetadata0) {
        this.z(appMetadata0);
        batl.s(appMetadata0.a);
        Future future0 = this.a.aK().a(new crli(this, appMetadata0.a, s, s1));
        try {
            return (List)future0.get();
        }
        catch(InterruptedException | ExecutionException exception0) {
            this.a.aJ().c.b("Failed to get conditional user properties", exception0);
            return Collections.EMPTY_LIST;
        }
    }

    @Override  // crii
    public final List d(String s, String s1, String s2) {
        this.y(s, true);
        Future future0 = this.a.aK().a(new crlj(this, s, s1, s2));
        try {
            return (List)future0.get();
        }
        catch(InterruptedException | ExecutionException exception0) {
            this.a.aJ().c.b("Failed to get conditional user properties as", exception0);
            return Collections.EMPTY_LIST;
        }
    }

    @Override  // crii
    public final List e(String s, String s1, boolean z, AppMetadata appMetadata0) {
        this.z(appMetadata0);
        batl.s(appMetadata0.a);
        Future future0 = this.a.aK().a(new crlg(this, appMetadata0.a, s, s1));
        try {
            List list0 = (List)future0.get();
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                crqv crqv0 = (crqv)object0;
                if(z || !crqx.ac(crqv0.c)) {
                    list1.add(new UserAttributeParcel(crqv0));
                }
            }
            return list1;
        }
        catch(InterruptedException | ExecutionException exception0) {
            this.a.aJ().c.c("Failed to query user properties. appId", crji.a(appMetadata0.a), exception0);
            return Collections.EMPTY_LIST;
        }
    }

    @Override  // crii
    public final List f(String s, String s1, String s2, boolean z) {
        this.y(s, true);
        Future future0 = this.a.aK().a(new crlh(this, s, s1, s2));
        try {
            List list0 = (List)future0.get();
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                crqv crqv0 = (crqv)object0;
                if(z || !crqx.ac(crqv0.c)) {
                    list1.add(new UserAttributeParcel(crqv0));
                }
            }
            return list1;
        }
        catch(InterruptedException | ExecutionException exception0) {
            this.a.aJ().c.c("Failed to get user properties as. appId", crji.a(s), exception0);
            return Collections.EMPTY_LIST;
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        crim crim0 = null;
        switch(v) {
            case 1: {
                EventParcel eventParcel0 = (EventParcel)wbz.a(parcel0, EventParcel.CREATOR);
                AppMetadata appMetadata0 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                crih.gr(parcel0);
                this.i(eventParcel0, appMetadata0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                UserAttributeParcel userAttributeParcel0 = (UserAttributeParcel)wbz.a(parcel0, UserAttributeParcel.CREATOR);
                AppMetadata appMetadata1 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                crih.gr(parcel0);
                this.x(userAttributeParcel0, appMetadata1);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                AppMetadata appMetadata2 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                crih.gr(parcel0);
                this.h(appMetadata2);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                EventParcel eventParcel1 = (EventParcel)wbz.a(parcel0, EventParcel.CREATOR);
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                crih.gr(parcel0);
                this.j(eventParcel1, s, s1);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                AppMetadata appMetadata3 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                crih.gr(parcel0);
                this.v(appMetadata3);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                AppMetadata appMetadata4 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                boolean z = wbz.i(parcel0);
                crih.gr(parcel0);
                this.z(appMetadata4);
                batl.s(appMetadata4.a);
                Future future0 = this.a.aK().a(new crla(this, appMetadata4.a));
                try {
                    List list0 = (List)future0.get();
                    ArrayList arrayList0 = new ArrayList(list0.size());
                    for(Object object0: list0) {
                        crqv crqv0 = (crqv)object0;
                        if(z || !crqx.ac(crqv0.c)) {
                            arrayList0.add(new UserAttributeParcel(crqv0));
                        }
                    }
                    crim0 = arrayList0;
                }
                catch(InterruptedException | ExecutionException exception0) {
                    this.a.aJ().c.c("Failed to get user properties. appId", crji.a(appMetadata4.a), exception0);
                }
                parcel1.writeNoException();
                parcel1.writeTypedList(((List)crim0));
                return true;
            }
            case 9: {
                EventParcel eventParcel2 = (EventParcel)wbz.a(parcel0, EventParcel.CREATOR);
                String s2 = parcel0.readString();
                crih.gr(parcel0);
                batl.q(s2);
                batl.s(eventParcel2);
                this.y(s2, true);
                crqq crqq0 = this.a;
                crjg crjg0 = crqq0.aJ().j;
                String s3 = eventParcel2.a;
                crjg0.b("Log and bundle. event", crqq0.s().c(s3));
                crqq0.av();
                long v1 = System.nanoTime() / 1000000L;
                Future future1 = crqq0.aK().b(new crlq(this, eventParcel2, s2));
                try {
                    byte[] arr_b = (byte[])future1.get();
                    if(arr_b == null) {
                        crqq0.aJ().c.b("Log and bundle returned null. appId", crji.a(s2));
                        arr_b = new byte[0];
                    }
                    crqq0.av();
                    crqq0.aJ().j.d("Log and bundle processed. event, size, time_ms", crqq0.s().c(s3), Integer.valueOf(arr_b.length), Long.valueOf(System.nanoTime() / 1000000L - v1));
                    crim0 = arr_b;
                }
                catch(InterruptedException | ExecutionException exception1) {
                    this.a.aJ().c.d("Failed to log and bundle. appId, event, error", crji.a(s2), this.a.s().c(eventParcel2.a), exception1);
                }
                parcel1.writeNoException();
                parcel1.writeByteArray(((byte[])crim0));
                return true;
            }
            case 10: {
                long v2 = parcel0.readLong();
                String s4 = parcel0.readString();
                String s5 = parcel0.readString();
                String s6 = parcel0.readString();
                crih.gr(parcel0);
                this.o(v2, s4, s5, s6);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                AppMetadata appMetadata5 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                crih.gr(parcel0);
                String s7 = this.b(appMetadata5);
                parcel1.writeNoException();
                parcel1.writeString(s7);
                return true;
            }
            case 12: {
                ConditionalUserPropertyParcel conditionalUserPropertyParcel0 = (ConditionalUserPropertyParcel)wbz.a(parcel0, ConditionalUserPropertyParcel.CREATOR);
                AppMetadata appMetadata6 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                crih.gr(parcel0);
                this.l(conditionalUserPropertyParcel0, appMetadata6);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                ConditionalUserPropertyParcel conditionalUserPropertyParcel1 = (ConditionalUserPropertyParcel)wbz.a(parcel0, ConditionalUserPropertyParcel.CREATOR);
                crih.gr(parcel0);
                this.m(conditionalUserPropertyParcel1);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                String s8 = parcel0.readString();
                String s9 = parcel0.readString();
                boolean z1 = wbz.i(parcel0);
                AppMetadata appMetadata7 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                crih.gr(parcel0);
                List list1 = this.e(s8, s9, z1, appMetadata7);
                parcel1.writeNoException();
                parcel1.writeTypedList(list1);
                return true;
            }
            case 15: {
                String s10 = parcel0.readString();
                String s11 = parcel0.readString();
                String s12 = parcel0.readString();
                boolean z2 = wbz.i(parcel0);
                crih.gr(parcel0);
                List list2 = this.f(s10, s11, s12, z2);
                parcel1.writeNoException();
                parcel1.writeTypedList(list2);
                return true;
            }
            case 16: {
                String s13 = parcel0.readString();
                String s14 = parcel0.readString();
                AppMetadata appMetadata8 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                crih.gr(parcel0);
                List list3 = this.c(s13, s14, appMetadata8);
                parcel1.writeNoException();
                parcel1.writeTypedList(list3);
                return true;
            }
            case 17: {
                String s15 = parcel0.readString();
                String s16 = parcel0.readString();
                String s17 = parcel0.readString();
                crih.gr(parcel0);
                List list4 = this.d(s15, s16, s17);
                parcel1.writeNoException();
                parcel1.writeTypedList(list4);
                return true;
            }
            case 18: {
                AppMetadata appMetadata9 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                crih.gr(parcel0);
                batl.q(appMetadata9.a);
                this.y(appMetadata9.a, false);
                this.u(new crll(this, appMetadata9));
                parcel1.writeNoException();
                return true;
            }
            case 19: {
                Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                AppMetadata appMetadata10 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                crih.gr(parcel0);
                this.p(bundle0, appMetadata10);
                parcel1.writeNoException();
                return true;
            }
            case 20: {
                AppMetadata appMetadata11 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                crih.gr(parcel0);
                this.n(appMetadata11);
                parcel1.writeNoException();
                return true;
            }
            case 21: {
                AppMetadata appMetadata12 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                crih.gr(parcel0);
                ConsentParcel consentParcel0 = this.a(appMetadata12);
                parcel1.writeNoException();
                wbz.g(parcel1, consentParcel0);
                return true;
            }
            case 24: {
                AppMetadata appMetadata13 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                Bundle bundle1 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                crih.gr(parcel0);
                List list5 = this.r(appMetadata13, bundle1);
                parcel1.writeNoException();
                parcel1.writeTypedList(list5);
                return true;
            }
            case 25: {
                AppMetadata appMetadata14 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                crih.gr(parcel0);
                this.w(appMetadata14);
                parcel1.writeNoException();
                return true;
            }
            case 26: {
                AppMetadata appMetadata15 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                crih.gr(parcel0);
                this.q(appMetadata15);
                parcel1.writeNoException();
                return true;
            }
            case 27: {
                AppMetadata appMetadata16 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                crih.gr(parcel0);
                this.g(appMetadata16);
                parcel1.writeNoException();
                return true;
            }
            case 29: {
                AppMetadata appMetadata17 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                UploadBatchesCriteria uploadBatchesCriteria0 = (UploadBatchesCriteria)wbz.a(parcel0, UploadBatchesCriteria.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    crim0 = (iInterface0 instanceof crim) ? ((crim)iInterface0) : new crim(iBinder0);
                }
                crih.gr(parcel0);
                this.z(appMetadata17);
                batl.s(appMetadata17.a);
                this.a.aK().f(new crkx(this, appMetadata17.a, uploadBatchesCriteria0, crim0));
                parcel1.writeNoException();
                return true;
            }
            case 30: {
                AppMetadata appMetadata18 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                BatchUploadStatusParcel batchUploadStatusParcel0 = (BatchUploadStatusParcel)wbz.a(parcel0, BatchUploadStatusParcel.CREATOR);
                crih.gr(parcel0);
                this.z(appMetadata18);
                this.u(new crku(this, appMetadata18, batchUploadStatusParcel0));
                parcel1.writeNoException();
                return true;
            }
            case 0x1F: {
                AppMetadata appMetadata19 = (AppMetadata)wbz.a(parcel0, AppMetadata.CREATOR);
                Bundle bundle2 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    crim0 = (iInterface1 instanceof cril) ? ((cril)iInterface1) : new crij(iBinder1);
                }
                crih.gr(parcel0);
                this.k(appMetadata19, bundle2, ((cril)crim0));
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // crii
    public final void g(AppMetadata appMetadata0) {
        this.z(appMetadata0);
        this.u(new crlc(this, appMetadata0));
    }

    @Override  // crii
    public final void h(AppMetadata appMetadata0) {
        this.z(appMetadata0);
        this.u(new crlb(this, appMetadata0));
    }

    @Override  // crii
    public final void i(EventParcel eventParcel0, AppMetadata appMetadata0) {
        batl.s(eventParcel0);
        this.z(appMetadata0);
        this.u(new crlo(this, eventParcel0, appMetadata0));
    }

    @Override  // crii
    public final void j(EventParcel eventParcel0, String s, String s1) {
        batl.s(eventParcel0);
        batl.q(s);
        this.y(s, true);
        this.u(new crlp(this, eventParcel0, s));
    }

    @Override  // crii
    public final void k(AppMetadata appMetadata0, Bundle bundle0, cril cril0) {
        this.z(appMetadata0);
        batl.s(appMetadata0.a);
        this.a.aK().f(new crkv(this, appMetadata0, bundle0, cril0, appMetadata0.a));
    }

    @Override  // crii
    public final void l(ConditionalUserPropertyParcel conditionalUserPropertyParcel0, AppMetadata appMetadata0) {
        batl.s(conditionalUserPropertyParcel0);
        batl.s(conditionalUserPropertyParcel0.c);
        this.z(appMetadata0);
        ConditionalUserPropertyParcel conditionalUserPropertyParcel1 = new ConditionalUserPropertyParcel(conditionalUserPropertyParcel0);
        conditionalUserPropertyParcel1.a = appMetadata0.a;
        this.u(new crle(this, conditionalUserPropertyParcel1, appMetadata0));
    }

    @Override  // crii
    public final void m(ConditionalUserPropertyParcel conditionalUserPropertyParcel0) {
        batl.s(conditionalUserPropertyParcel0);
        batl.s(conditionalUserPropertyParcel0.c);
        batl.q(conditionalUserPropertyParcel0.a);
        this.y(conditionalUserPropertyParcel0.a, true);
        this.u(new crlf(this, new ConditionalUserPropertyParcel(conditionalUserPropertyParcel0)));
    }

    @Override  // crii
    public final void n(AppMetadata appMetadata0) {
        batl.q(appMetadata0.a);
        batl.s(appMetadata0.s);
        this.t(new crlm(this, appMetadata0));
    }

    @Override  // crii
    public final void o(long v, String s, String s1, String s2) {
        this.u(new crld(this, s1, s2, s, v));
    }

    @Override  // crii
    public final void p(Bundle bundle0, AppMetadata appMetadata0) {
        this.z(appMetadata0);
        batl.s(appMetadata0.a);
        this.u(new crkz(this, bundle0, appMetadata0.a, appMetadata0));
    }

    @Override  // crii
    public final void q(AppMetadata appMetadata0) {
        batl.q(appMetadata0.a);
        batl.s(appMetadata0.s);
        this.t(new crky(this, appMetadata0));
    }

    public final List r(AppMetadata appMetadata0, Bundle bundle0) {
        this.z(appMetadata0);
        batl.s(appMetadata0.a);
        crqq crqq0 = this.a;
        if(crqq0.n().t(crif.aJ)) {
            Future future0 = crqq0.aK().b(new crls(this, appMetadata0, bundle0));
            try {
                return (List)future0.get(10000L, TimeUnit.MILLISECONDS);
            }
            catch(TimeoutException | InterruptedException | ExecutionException exception0) {
                this.a.aJ().c.c("Failed to get trigger URIs. appId", crji.a(appMetadata0.a), exception0);
                return Collections.EMPTY_LIST;
            }
        }
        Future future1 = this.a.aK().a(new crlt(this, appMetadata0, bundle0));
        try {
            return (List)future1.get();
        }
        catch(InterruptedException | ExecutionException exception1) {
            this.a.aJ().c.c("Failed to get trigger URIs. appId", crji.a(appMetadata0.a), exception1);
            return Collections.EMPTY_LIST;
        }
    }

    public final void s(EventParcel eventParcel0, AppMetadata appMetadata0) {
        this.a.F();
        this.a.N(eventParcel0, appMetadata0);
    }

    public final void t(Runnable runnable0) {
        crqq crqq0 = this.a;
        if(crqq0.aK().i()) {
            runnable0.run();
            return;
        }
        crqq0.aK().g(runnable0);
    }

    public final void u(Runnable runnable0) {
        crqq crqq0 = this.a;
        if(crqq0.aK().i()) {
            runnable0.run();
            return;
        }
        crqq0.aK().f(runnable0);
    }

    @Override  // crii
    public final void v(AppMetadata appMetadata0) {
        this.z(appMetadata0);
        this.u(new crlk(this, appMetadata0));
    }

    @Override  // crii
    public final void w(AppMetadata appMetadata0) {
        batl.q(appMetadata0.a);
        batl.s(appMetadata0.s);
        this.t(new crkw(this, appMetadata0));
    }

    @Override  // crii
    public final void x(UserAttributeParcel userAttributeParcel0, AppMetadata appMetadata0) {
        batl.s(userAttributeParcel0);
        this.z(appMetadata0);
        this.u(new crlr(this, userAttributeParcel0, appMetadata0));
    }

    private final void y(String s, boolean z) {
        boolean z1 = true;
        if(!TextUtils.isEmpty(s)) {
            try {
                if(z) {
                    if(this.b == null) {
                        if(!"com.google.android.gms".equals(this.c) && (!bbqw.a(this.a.e(), Binder.getCallingUid()) && !azql.c(this.a.e()).i(Binder.getCallingUid()))) {
                            z1 = false;
                        }
                        this.b = Boolean.valueOf(z1);
                    }
                    if(!this.b.booleanValue()) {
                        goto label_8;
                    }
                    return;
                }
            label_8:
                if(this.c == null && bbqw.b(this.a.e(), Binder.getCallingUid(), s)) {
                    this.c = s;
                }
                if(s.equals(this.c)) {
                    return;
                }
                throw new SecurityException(String.format("Unknown calling package name \'%s\'.", s));
            }
            catch(SecurityException securityException0) {
                this.a.aJ().c.b("Measurement Service called with invalid calling package. appId", crji.a(s));
                throw securityException0;
            }
        }
        this.a.aJ().c.a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    private final void z(AppMetadata appMetadata0) {
        batl.s(appMetadata0);
        batl.q(appMetadata0.a);
        this.y(appMetadata0.a, false);
        this.a.A().Q(appMetadata0.b);
    }
}

