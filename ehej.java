import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.people.sync.focus.progressupdate.portal.SyncProgressPortalChimeraService;

public final class ehej implements ehdm {
    private final Context a;
    private final ehim b;
    private final String c;
    private final efur d;
    private ehee e;
    private int f;
    private int g;
    private int h;
    private gjgi i;
    private boolean j;
    private final boolean k;
    private final boolean l;
    private final eheh m;
    private final boolean n;
    private final boolean o;
    private int p;

    public ehej(Context context0, efur efur0, ehee ehee0, ehim ehim0, String s) {
        boolean z = hxcv.g();
        eheh eheh0 = eheh.a();
        boolean z1 = ehej.g(context0);
        super();
        this.i = gjgi.a;
        this.p = 0;
        this.j = true;
        this.o = hxcv.a.c().s();
        this.a = context0;
        this.e = ehee0;
        this.b = ehim0;
        this.c = s;
        this.d = efur0;
        this.k = z;
        this.l = ehej.h(context0);
        this.m = eheh0;
        this.n = z1;
    }

    @Override  // ehdm
    public final void a(boolean z) {
        if(this.j) {
            ehef.d(this.a);
        }
    }

    @Override  // ehdm
    public final void b() {
    }

    @Override  // ehdm
    public final void c(int v, boolean z) {
        if(this.m() && this.g > 0) {
            this.f += v;
            if(!z && this.l()) {
                try {
                    this.k(ehej.r(this.f * 100 / this.g));
                }
                catch(RemoteException remoteException0) {
                    egig.l("FSA2_PortalUpdater", "onSyncProgressed remoteException", remoteException0);
                }
            }
        }
    }

    @Override  // ehdm
    public final void d(int v, boolean z) {
        int v2;
        this.p = v;
        if(this.n()) {
            egig.e("FSA2_PortalUpdater", "onSyncCompleted");
            if(this.h > 0) {
                if(this.l()) {
                    try {
                        if(z) {
                            int v1 = this.h;
                            v2 = 2;
                            if(this.o()) {
                                gaef gaef0 = this.t();
                                if(gaef0 != null) {
                                    gaef0.a(ehef.a(this.a, 0x7F130050), v1, new int[]{v1});  // plurals:people_contacts_sync_succeed_title_in_portal
                                }
                            }
                            else if(this.p()) {
                                gaev gaev0 = this.u();
                                if(gaev0 != null) {
                                    String s = this.a.getResources().getResourceName(0x7F130050);  // plurals:people_contacts_sync_succeed_title_in_portal
                                    Parcel parcel0 = gaev0.jo();
                                    parcel0.writeString(s);
                                    parcel0.writeInt(v1);
                                    parcel0.writeIntArray(new int[]{v1});
                                    Parcel parcel1 = gaev0.hM(5, parcel0);
                                    Bundle bundle0 = (Bundle)wbz.a(parcel1, Bundle.CREATOR);
                                    parcel1.recycle();
                                }
                            }
                        }
                        else {
                            hxcv hxcv0 = hxcv.a;
                            if(hxcv0.c().q()) {
                            label_53:
                                v2 = 3;
                                if(this.o()) {
                                    gaef gaef2 = this.t();
                                    if(gaef2 != null) {
                                        gaef2.b(ehef.a(this.a, this.j()), this.h, this.q());
                                    }
                                }
                                else if(this.p()) {
                                    gaev gaev2 = this.u();
                                    if(gaev2 != null) {
                                        String s2 = this.a.getResources().getResourceName(this.j());
                                        int v3 = this.h;
                                        int[] arr_v = this.q();
                                        Parcel parcel4 = gaev2.jo();
                                        parcel4.writeString(s2);
                                        parcel4.writeInt(v3);
                                        parcel4.writeIntArray(arr_v);
                                        Parcel parcel5 = gaev2.hM(6, parcel4);
                                        Bundle bundle2 = (Bundle)wbz.a(parcel5, Bundle.CREATOR);
                                        parcel5.recycle();
                                    }
                                }
                            }
                            else if(hxcv0.c().r()) {
                                SyncResult syncResult0 = ((ehiv)this.b).a;
                                if(!syncResult0.hasHardError() || syncResult0.hasSoftError()) {
                                    goto label_30;
                                }
                                else {
                                    goto label_53;
                                }
                            }
                            else {
                            label_30:
                                v2 = 4;
                                if(!hxcv0.c().p()) {
                                }
                                else if(this.o()) {
                                    gaef gaef1 = this.t();
                                    if(gaef1 != null) {
                                        gaef1.c(0x7F15255D, 4);  // string:people_fsa_notification_title_for_first_full_sync_failure "Trouble getting 
                                                                 // contacts"
                                    }
                                }
                                else if(this.p()) {
                                    gaev gaev1 = this.u();
                                    if(gaev1 != null) {
                                        String s1 = this.a.getResources().getResourceName(0x7F15255D);  // string:people_fsa_notification_title_for_first_full_sync_failure "Trouble getting 
                                                                                                        // contacts"
                                        Parcel parcel2 = gaev1.jo();
                                        parcel2.writeString(s1);
                                        parcel2.writeInt(0);
                                        parcel2.writeIntArray(null);
                                        parcel2.writeInt(4);
                                        Parcel parcel3 = gaev1.hM(4, parcel2);
                                        Bundle bundle1 = (Bundle)wbz.a(parcel3, Bundle.CREATOR);
                                        parcel3.recycle();
                                    }
                                }
                                this.j = false;
                            }
                        }
                        this.i = gjgi.a;
                        this.s(v2);
                    }
                    catch(RemoteException remoteException0) {
                        egig.c("FSA2_PortalUpdater", "error", remoteException0);
                        if(hxcv.f()) {
                            ehej.i(6, this.n, this.b);
                            if(hxcv.i()) {
                                ehej.f(this.a, this.c);
                                return;
                            }
                        }
                    }
                    return;
                }
                if(z && v == 1) {
                    egig.k("FSA2_PortalUpdater", "First full sync completed, but callback is not ready.");
                    if(hxcv.f()) {
                        ehej.i(5, this.n, this.b);
                        if(hxcv.i()) {
                            ehej.f(this.a, this.c);
                        }
                    }
                }
            }
        }
    }

    @Override  // ehdm
    public final void e(int v, gjgi gjgi0, int v1) {
        this.i = gjgi0;
        this.p = v;
        if(this.m()) {
            egig.g("FSA2_PortalUpdater", "onSyncStageStart for dataTypeEnum=%s", gjgi0);
            int v2 = 0;
            int v3 = hxcv.d() ? ehef.a(this.a, 0x7F15253F) : 0;  // string:people_contacts_sync_progress_title_in_portal "Syncing with Google Contacts"
            switch(gjgi0.ordinal()) {
                case 1: {
                    this.f = 0;
                    this.g = this.o ? v1 : v1 + v1;
                    this.h = v1;
                    if(!hxcv.d()) {
                        v3 = ehef.a(this.a, 0x7F15253F);  // string:people_contacts_sync_progress_title_in_portal "Syncing with Google Contacts"
                    }
                    break;
                }
                case 3: {
                    if(this.o) {
                        this.f = 0;
                        this.g = v1;
                        v3 = ehef.a(this.a, 0x7F152513);  // string:people_contact_photos_sync_progress_title_in_portal "Syncing contact photos"
                    }
                    else if(v == 1) {
                        int v4 = this.h;
                        if(v4 >= v1) {
                            v2 = v4 - v1;
                        }
                        this.f += v2;
                    }
                    else {
                        this.g = this.g / 2 + v1;
                    }
                }
            }
            if(this.g > 0) {
                if(!this.l) {
                    if(this.o && gjgi0 == gjgi.d) {
                        if(this.e != null) {
                            ehef.d(this.a);
                        }
                        this.e = ehef.b(this.a, this.c, v3);
                    }
                    else if(this.e == null) {
                        this.e = ehef.b(this.a, this.c, v3);
                    }
                }
                else if(this.o && gjgi0 == gjgi.d) {
                    if(this.l()) {
                        this.m.e(this.a, this.c);
                    }
                    this.m.b(this.a, this.c, v3);
                }
                else if(!this.l()) {
                    this.m.b(this.a, this.c, v3);
                }
                if(this.l()) {
                    try {
                        if(v == 1 && (gjgi0 == gjgi.b && this.f == 0 && this.d.d(this.c) == 0)) {
                            this.k(ehej.r(this.f * 100 / this.g));
                        }
                        else if(this.o && gjgi0 == gjgi.d) {
                            this.k(ehej.r(this.f * 100 / this.g));
                        }
                        this.s(1);
                    }
                    catch(RemoteException remoteException0) {
                        egig.l("FSA2_PortalUpdater", "onSyncStageStart remoteException", remoteException0);
                    }
                }
            }
        }
    }

    public static void f(Context context0, String s) {
        if(ehej.h(context0)) {
            eheh.a().e(context0, s);
            return;
        }
        ehef.e(context0, s);
    }

    public static boolean g(Context context0) {
        try {
            return bbmn.t(context0) ^ 1;
        }
        catch(SecurityException unused_ex) {
            egig.k("FSA2_PortalUpdater", "SecurityException when checking isManagedProfile.");
            return false;
        }
    }

    public static boolean h(Context context0) {
        hxcv hxcv0 = hxcv.a;
        if(hxcv0.c().f()) {
            return ehej.g(context0) ? hxcv0.c().g() : !hxcv.h();
        }
        return false;
    }

    public static void i(int v, boolean z, ehim ehim0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)girs.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v1 = 2;
        ((girs)hftv0).c = 2;
        ((girs)hftv0).b |= 1;
        gjhn gjhn0 = gjhn.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((girs)hftv1).d = gjhn0.h;
        ((girs)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((girs)hftv2).e = v - 1;
        ((girs)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((girs)hftp0.b_message).f = 10;
        ((girs)hftp0.b_message).b |= 8;
        if(hxcv.e()) {
            if(!z) {
                v1 = 3;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((girs)hftp0.b_message).g = v1 - 1;
            ((girs)hftp0.b_message).b |= 0x20;
        }
        ehim0.f(4, "PORTAL", ((girs)hftp0.N_build()));
    }

    private final int j() {
        return this.i == gjgi.b ? 0x7F130046 : 0x7F130047;  // plurals:people_contacts_sync_failure_in_contacts_title_in_portal
    }

    private final void k(int v) {
        if(this.o()) {
            gaef gaef0 = this.t();
            if(gaef0 != null) {
                Parcel parcel0 = gaef0.jo();
                parcel0.writeInt(v);
                Parcel parcel1 = gaef0.hM(2, parcel0);
                Bundle bundle0 = (Bundle)wbz.a(parcel1, Bundle.CREATOR);
                parcel1.recycle();
            }
        }
        else if(this.p()) {
            gaev gaev0 = this.u();
            if(gaev0 != null) {
                Parcel parcel2 = gaev0.jo();
                parcel2.writeInt(v);
                Parcel parcel3 = gaev0.hM(2, parcel2);
                Bundle bundle1 = (Bundle)wbz.a(parcel3, Bundle.CREATOR);
                parcel3.recycle();
            }
        }
    }

    private final boolean l() {
        return this.l ? SyncProgressPortalChimeraService.c != null : this.e.c != null;
    }

    private final boolean m() {
        return this.i != gjgi.c && this.n();
    }

    private final boolean n() {
        return !this.k || this.p == 1;
    }

    private final boolean o() {
        return this.l ? true : this.e != null && this.e.a == 1.0;
    }

    private final boolean p() {
        return this.l ? true : this.e != null && this.e.a == 1.1;
    }

    private final int[] q() {
        return this.i == gjgi.b ? new int[]{this.h - this.f, this.h} : new int[]{this.g - this.f, this.h};
    }

    private static final int r(int v) {
        if(v < 0) {
            return 0;
        }
        return v <= 100 ? v : 100;
    }

    private final void s(int v) {
        gjhn gjhn0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)girs.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        int v1 = 2;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((girs)hftv0).c = (v == 1 ? 2 : 3) - 1;
        ((girs)hftv0).b |= 1;
        gjgi gjgi0 = this.i;
        if(gjgi.c != gjgi0) {
            if(gjgi.b != gjgi0) {
                if(gjgi.d != gjgi0) {
                    gjhn0 = gjhn.a;
                }
                else if(this.p == 3) {
                    gjhn0 = gjhn.g;
                }
                else {
                    gjhn0 = gjhn.d;
                }
            }
            else if(this.p == 3) {
                gjhn0 = gjhn.f;
            }
            else {
                gjhn0 = gjhn.c;
            }
        }
        else if(this.p == 3) {
            gjhn0 = gjhn.e;
        }
        else {
            gjhn0 = gjhn.b;
        }
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((girs)hftv1).d = gjhn0.h;
        ((girs)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((girs)hftv2).e = v - 1;
        ((girs)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((girs)hftp0.b_message).f = 4;
        ((girs)hftp0.b_message).b |= 8;
        if(hxcv.e()) {
            if(!this.n) {
                v1 = 3;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((girs)hftp0.b_message).g = v1 - 1;
            ((girs)hftp0.b_message).b |= 0x20;
        }
        girs girs0 = (girs)hftp0.N_build();
        this.b.f(4, "PORTAL", girs0);
    }

    private final gaef t() {
        if(this.l) {
            return SyncProgressPortalChimeraService.c;
        }
        return this.e == null || this.e.a != 1.0 ? null : ((gaef)this.e.c);
    }

    private final gaev u() {
        return this.e == null || this.e.a != 1.1 ? null : ((gaev)this.e.c);
    }
}

