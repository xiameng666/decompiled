import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.backup.extension.backup.ClientInfo;
import com.google.android.gms.backup.extension.backup.CustomBackupRequest;
import com.google.android.gms.backup.extension.backup.CustomBackupResult;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Map;

public final class arsp extends wby implements arsq {
    final asgb a;
    final asfv b;
    final asgc c;
    final asgu d;

    public arsp() {
        super("com.google.android.gms.backup.extension.backup.ICustomBackupCallback");
    }

    public arsp(asgu asgu0, asgb asgb0, asfv asfv0, asgc asgc0) {
        this.a = asgb0;
        this.b = asfv0;
        this.c = asgc0;
        Objects.requireNonNull(asgu0);
        this.d = asgu0;
        super("com.google.android.gms.backup.extension.backup.ICustomBackupCallback");
    }

    @Override  // arsq
    public final void a(CustomBackupResult customBackupResult0) {
        asgu.a.j("onComplete, result: %s", new Object[]{(customBackupResult0 == null ? "null" : customBackupResult0.toString())});
        asgu asgu0 = this.d;
        if(!asgu0.h.get()) {
            asgb asgb0 = this.a;
            int v = asgb0.b(1.0f);
            if(v != -1) {
                this.b.b(asgb0.c, v);
                this.c.g(((float)v) / ((float)asgb0.c));
            }
        }
        if(asgu0.g.getAndSet(true)) {
            asgu0.e.c(asgu0.b, customBackupResult0);
        }
        else {
            asgu0.e.d(asgu0.b, customBackupResult0);
        }
        asgu0.d.q(Boolean.valueOf(customBackupResult0.a));
    }

    @Override  // arsq
    public final void b(ClientInfo clientInfo0) {
        asgu.a.j("Handshake done", new Object[0]);
        ghys ghys0 = ghys.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghys0).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gica.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        asgu asgu0 = this.d;
        ProtoLiteMessage hftv0 = hftp1.b_message;
        String s = asgu0.b;
        s.getClass();
        ((gica)hftv0).b |= 1;
        ((gica)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gica)hftv1).b |= 4;
        ((gica)hftv1).e = clientInfo0.a;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gica gica0 = (gica)hftp1.b_message;
        gica0.b |= 2;
        gica0.d = 1;
        gica gica1 = (gica)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asfu asfu0 = asgu0.e;
        ghys ghys1 = (ghys)hftp0.b_message;
        gica1.getClass();
        ghys1.ad = gica1;
        ghys1.d |= 8;
        asfu0.e(((ghys)hftp0.N_build()), ghyr.am);
        try {
            CustomBackupRequest customBackupRequest0 = asgu0.c;
            asgu0.j.c(asgu0.i, customBackupRequest0);
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gicd.a).v_newBuilder();
            boolean z = customBackupRequest0.c;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp2.b_message;
            ((gicd)hftv2).b |= 4;
            ((gicd)hftv2).e = z;
            int v = customBackupRequest0.a == 0 ? 3 : 2;
            if(!hftv2.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp2.b_message;
            ((gicd)hftv3).d = v - 1;
            ((gicd)hftv3).b |= 2;
            if(!hftv3.isImmutable()) {
                hftp2.ensureMutable();
            }
            gicd gicd0 = (gicd)hftp2.b_message;
            s.getClass();
            gicd0.b |= 1;
            gicd0.c = s;
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)ghys0).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ghys ghys2 = (ghys)hftp3.b_message;
            gicd gicd1 = (gicd)hftp2.N_build();
            gicd1.getClass();
            ghys2.M = gicd1;
            ghys2.c |= 0x10000;
            asfu0.e(((ghys)hftp3.N_build()), ghyr.U);
        }
        catch(RemoteException remoteException0) {
            asgu.a.g("Exception while trying to do custom backup for package on handshake done: %s", remoteException0, new Object[]{this.d.b});
            this.d.b();
        }
    }

    @Override  // arsq
    public final void c(float f, int v) {
        ggca ggca0;
        ArrayList arrayList0;
        baun baun0 = asgu.a;
        baun0.j("Backup progress fraction %s, total items %d", new Object[]{String.valueOf(f), v});
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gibx.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gibx)hftv0).b |= 1;
        ((gibx)hftv0).c = f;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        asgu asgu0 = this.d;
        gibx gibx0 = (gibx)hftp0.b_message;
        gibx0.b |= 2;
        gibx0.d = v;
        gibx gibx1 = (gibx)hftp0.N_build();
        hqil hqil0 = hqil.a;
        int v1 = (int)hqil0.j().u();
        asfu asfu0 = asgu0.e;
        Map map0 = asfu0.d;
        String s = asgu0.b;
        if(map0.containsKey(s)) {
            arrayList0 = (ArrayList)map0.get(s);
        }
        else {
            ArrayList arrayList1 = new ArrayList(v1);
            map0.put(s, arrayList1);
            arrayList0 = arrayList1;
        }
        if(arrayList0.size() < v1) {
            arrayList0.add(gibx1);
        }
        Map map1 = asfu0.c;
        if(map1.containsKey(s)) {
            ggca0 = (ggca)map1.get(s);
        }
        else {
            ggca ggca1 = new ggca(((int)hqil0.j().t()));
            map1.put(s, ggca1);
            ggca0 = ggca1;
        }
        ggca0.add(gibx1);
        if(!asgu0.h.get()) {
            int v2 = Float.compare(f, 0.0f) < 0 || !(f <= 1.0f) ? 0 : 1;
            if(hqkm.a.b().i()) {
                v2 &= (f > asgu0.k || v > asgu0.l ? 1 : 0);
            }
            if(v2 == 0) {
                baun0.m("Service reported illegal progress fraction.", new Object[0]);
                return;
            }
            asgu0.f = true;
            asgu0.k = f;
            asgu0.l = v;
            asgb asgb0 = this.a;
            int v3 = asgb0.b(f);
            if(v3 != -1) {
                this.b.b(asgb0.c, v3);
                this.c.g(((float)v3) / ((float)asgb0.c));
            }
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                ClientInfo clientInfo0 = (ClientInfo)wbz.a(parcel0, ClientInfo.CREATOR);
                arsp.gr(parcel0);
                this.b(clientInfo0);
                return true;
            }
            case 2: {
                float f = parcel0.readFloat();
                int v1 = parcel0.readInt();
                Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                arsp.gr(parcel0);
                this.c(f, v1);
                return true;
            }
            case 3: {
                CustomBackupResult customBackupResult0 = (CustomBackupResult)wbz.a(parcel0, CustomBackupResult.CREATOR);
                arsp.gr(parcel0);
                this.a(customBackupResult0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

