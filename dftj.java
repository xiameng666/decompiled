import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.sharing.ContactFilter;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.QrCodeMetadata;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.internal.ProviderAcceptParams;
import com.google.android.gms.nearby.sharing.internal.ProviderCancelParams;
import com.google.android.gms.nearby.sharing.internal.ProviderDenyParams;
import com.google.android.gms.nearby.sharing.internal.ProviderOpenParams;
import com.google.android.gms.nearby.sharing.internal.ProviderSendParams;
import com.google.android.gms.nearby.sharing.internal.ProviderSetDownloadDirectoryParams;
import com.google.android.gms.nearby.sharing.internal.ProviderShutdownParams;
import com.google.android.gms.nearby.sharing.internal.ProviderStartAdvertisingParams;
import com.google.android.gms.nearby.sharing.internal.ProviderStartDiscoveryParams;
import com.google.android.gms.nearby.sharing.internal.ProviderStopAdvertisingParams;
import com.google.android.gms.nearby.sharing.internal.ProviderStopDiscoveryParams;
import com.google.android.gms.nearby.sharing.internal.ProviderUpdateAdvertisingParams;
import com.google.android.gms.nearby.sharing.internal.ProviderUpdateDiscoveryParams;
import com.google.android.gms.nearby.sharing.internal.UpdateSelectedContactsParams;
import j..util.Map.-EL;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

public final class dftj implements dfsu {
    public final String a;
    public final dggf b;
    public final dijm c;
    public final ibts d;
    public final dfss e;
    public final gfzc f;
    public final Map g;
    private final String h;
    private final dcwt i;
    private final ibtw j;
    private final ibtw k;
    private final ddoh l;

    public dftj(String s, String s1, ddoh ddoh0, dggf dggf0, dcwt dcwt0, dijm dijm0, BiConsumer biConsumer0, BiConsumer biConsumer1, Executor executor0, dfss dfss0) {
        ibuq.f(s, "packageName");
        ibuq.f(s1, "serviceId");
        ibuq.f(ddoh0, "iExternalProvider");
        ibuq.f(dggf0, "idGenerator");
        ibuq.f(dcwt0, "uriPermissionManager");
        ibuq.f(dijm0, "providerManager");
        dfsx dfsx0 = new dfsx(biConsumer0);
        dfsy dfsy0 = new dfsy(biConsumer1);
        dfsz dfsz0 = new dfsz(executor0);
        super();
        this.h = s;
        this.a = s1;
        this.l = ddoh0;
        this.b = dggf0;
        this.i = dcwt0;
        this.c = dijm0;
        this.j = dfsx0;
        this.k = dfsy0;
        this.d = dfsz0;
        this.e = dfss0;
        this.f = new ggpb(new ggdh(), null, null);
        this.g = new bxd();
    }

    @Override  // dftm
    public final void A() {
    }

    @Override  // dftm
    public final void B(byte[] arr_b) {
        throw new UnsupportedOperationException("startQrCodeSessionWithKey is not supported.");
    }

    @Override  // dftm
    public final void C() {
        dfta dfta0 = new dfta("stopAdvertising");
        try {
            ProviderStopAdvertisingParams providerStopAdvertisingParams0 = new ProviderStopAdvertisingParams();
            providerStopAdvertisingParams0.a = dfta0;
            Parcel parcel0 = this.l.jo();
            wbz.f(parcel0, providerStopAdvertisingParams0);
            this.l.jq(6, parcel0);
            Status status0 = dfta0.c();
            cunf cunf0 = dcvz.a;
            cunf0.b().h("External sharing provider has received status %s for stopAdvertising", Integer.valueOf(status0.i));
            if(status0.e()) {
                cunf0.b().p("External sharing provider has stopped advertising", new Object[0]);
            }
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).h("Failed to call external provider stopAdvertising for %s", this.l);
        }
    }

    @Override  // dftm
    public final void D() {
        dfta dfta0 = new dfta("stopDiscovery");
        try {
            ProviderStopDiscoveryParams providerStopDiscoveryParams0 = new ProviderStopDiscoveryParams();
            providerStopDiscoveryParams0.a = dfta0;
            Parcel parcel0 = this.l.jo();
            wbz.f(parcel0, providerStopDiscoveryParams0);
            this.l.jq(3, parcel0);
            Status status0 = dfta0.c();
            cunf cunf0 = dcvz.a;
            cunf0.b().h("External sharing provider has received status %s for stopDiscovery", Integer.valueOf(status0.i));
            if(status0.e()) {
                cunf0.b().p("External sharing provider has stopped discovery", new Object[0]);
            }
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).h("Failed to call external provider stopDiscovery for %s", this.l);
        }
    }

    @Override  // dftm
    public final void E(dcpv dcpv0) {
    }

    @Override  // dftm
    public final void F(String s, dfso dfso0, QrCodeMetadata qrCodeMetadata0) {
        dfta dfta0 = new dfta("updateAdvertisingOptions");
        try {
            ProviderUpdateAdvertisingParams providerUpdateAdvertisingParams0 = new ProviderUpdateAdvertisingParams();
            providerUpdateAdvertisingParams0.a = dftk.a(dfso0, s);
            providerUpdateAdvertisingParams0.b = dfta0;
            Parcel parcel0 = this.l.jo();
            wbz.f(parcel0, providerUpdateAdvertisingParams0);
            this.l.jq(5, parcel0);
            Status status0 = dfta0.c();
            cunf cunf0 = dcvz.a;
            cunf0.b().h("External sharing provider has received status %s for updateAdvertisingOptions", Integer.valueOf(status0.i));
            if(status0.e()) {
                cunf0.b().p("External sharing provider has updated advertising options", new Object[0]);
            }
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).h("Failed to call external provider updateAdvertisingOptions for %s", this.l);
        }
    }

    @Override  // dftm
    public final void G(dfsq dfsq0) {
        dfta dfta0 = new dfta("updateDiscoveryOptions");
        ProviderUpdateDiscoveryParams providerUpdateDiscoveryParams0 = new ProviderUpdateDiscoveryParams();
        providerUpdateDiscoveryParams0.a = dftk.b(dfsq0);
        providerUpdateDiscoveryParams0.b = dfta0;
        try {
            Parcel parcel0 = this.l.jo();
            wbz.f(parcel0, providerUpdateDiscoveryParams0);
            this.l.jq(2, parcel0);
            Status status0 = dfta0.c();
            cunf cunf0 = dcvz.a;
            cunf0.b().h("External sharing provider has received status %s for updateDiscoveryOptions", Integer.valueOf(status0.i));
            if(status0.e()) {
                cunf0.b().p("External sharing provider has updated discovery options", new Object[0]);
            }
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).h("Failed to call external provider updateDiscoveryOptions for %s", this.l);
        }
    }

    @Override  // dftm
    public final void H(String s, ShareTarget shareTarget0, dcnp dcnp0, boolean z) {
        List list0 = shareTarget0.f();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            Uri uri0 = ((FileAttachment)object0).d;
            if(uri0 != null) {
                arrayList0.add(uri0);
            }
        }
        for(Object object1: arrayList0) {
            this.i.b(this.h, ((Uri)object1));
        }
        dfta dfta0 = new dfta("send");
        try {
            ProviderSendParams providerSendParams0 = new ProviderSendParams();
            providerSendParams0.a = s;
            providerSendParams0.b = this.J(shareTarget0);
            providerSendParams0.c = new dftb(this, dcnp0);
            providerSendParams0.d = dfta0;
            Parcel parcel0 = this.l.jo();
            wbz.f(parcel0, providerSendParams0);
            this.l.jq(7, parcel0);
            Status status0 = dfta0.c();
            dcvz.a.b().h("External sharing provider has received status %s for send", Integer.valueOf(status0.i));
            dfss dfss0 = this.e;
            List list1 = shareTarget0.e();
            dfss0.a.a(new dhcl(shareTarget0.a, dfsr.b(shareTarget0), true, false, list1));
            if(!status0.e()) {
                TransferMetadata transferMetadata0 = new dcnn(1007).a();
                this.k.a(shareTarget0, transferMetadata0);
                dfss0.a(shareTarget0, new dcnn(1007).a());
            }
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).h("Failed to call external provider send for %s", this.l);
            TransferMetadata transferMetadata1 = new dcnn(1007).a();
            this.k.a(shareTarget0, transferMetadata1);
        }
    }

    public final ShareTarget I(ShareTarget shareTarget0) {
        dcls dcls0 = shareTarget0.b();
        dfsw dfsw0 = new dfsw(new dfsv(this));
        Object object0 = Map.-EL.computeIfAbsent(this.f, Long.valueOf(shareTarget0.a), dfsw0);
        ibuq.e(object0, "computeIfAbsent(...)");
        dcwa.a(dcls0, ((Number)object0).longValue());
        dcwa.b(dcls0);
        return dcls0.a();
    }

    private final ShareTarget J(ShareTarget shareTarget0) {
        gfzc gfzc0 = this.f.a();
        Long long0 = (long)shareTarget0.a;
        Long long1 = (Long)gfzc0.get(long0);
        if(long1 != null) {
            long v = long1.longValue();
            dcls dcls0 = shareTarget0.b();
            dcwa.a(dcls0, v);
            return dcls0.a();
        }
        dcvz.a.e().h("Failed to find external ID for internal target ID %s.", long0);
        return shareTarget0;
    }

    private final void K(ShareTarget shareTarget0) {
        if(shareTarget0.f) {
            TransferMetadata transferMetadata0 = new dcnn(1007).a();
            this.j.a(shareTarget0, transferMetadata0);
        }
        else {
            TransferMetadata transferMetadata1 = new dcnn(1007).a();
            this.k.a(shareTarget0, transferMetadata1);
        }
        TransferMetadata transferMetadata2 = new dcnn(1007).a();
        this.g.put(Long.valueOf(shareTarget0.a), transferMetadata2);
    }

    @Override  // dftm
    public final int a(ShareTarget shareTarget0) {
        dfta dfta0 = new dfta("accept");
        try {
            ProviderAcceptParams providerAcceptParams0 = new ProviderAcceptParams();
            providerAcceptParams0.a = this.J(shareTarget0);
            providerAcceptParams0.b = dfta0;
            Parcel parcel0 = this.l.jo();
            wbz.f(parcel0, providerAcceptParams0);
            this.l.jq(8, parcel0);
            Status status0 = dfta0.c();
            cunf cunf0 = dcvz.a.b();
            int v = status0.i;
            cunf0.h("External sharing provider has received status %s for accept", Integer.valueOf(v));
            if(!status0.e()) {
                TransferMetadata transferMetadata0 = new dcnn(1007).a();
                this.e.a(shareTarget0, transferMetadata0);
                this.K(shareTarget0);
                return 13;
            }
            dgzt dgzt0 = new dgzt(shareTarget0.a);
            this.e.a.a(dgzt0);
            return v;
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).h("Failed to call external provider accept for %s", this.l);
            this.K(shareTarget0);
            return 13;
        }
    }

    @Override  // dftm
    public final int b(ShareTarget shareTarget0) {
        ibuq.f(shareTarget0, "shareTarget");
        dfta dfta0 = new dfta("cancel");
        try {
            ProviderCancelParams providerCancelParams0 = new ProviderCancelParams();
            providerCancelParams0.a = this.J(shareTarget0);
            providerCancelParams0.b = dfta0;
            Parcel parcel0 = this.l.jo();
            wbz.f(parcel0, providerCancelParams0);
            this.l.jq(10, parcel0);
            Status status0 = dfta0.c();
            cunf cunf0 = dcvz.a.b();
            int v = status0.i;
            cunf0.h("External sharing provider has received status %s for cancel", Integer.valueOf(v));
            if(!status0.e()) {
                this.K(shareTarget0);
                return 13;
            }
            return v;
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).h("Failed to call external provider cancel for %s", this.l);
            this.K(shareTarget0);
            return 13;
        }
    }

    @Override  // dftm
    public final int c(ShareTarget shareTarget0) {
        dfta dfta0 = new dfta("deny");
        try {
            ProviderDenyParams providerDenyParams0 = new ProviderDenyParams();
            providerDenyParams0.a = this.J(shareTarget0);
            providerDenyParams0.b = dfta0;
            Parcel parcel0 = this.l.jo();
            wbz.f(parcel0, providerDenyParams0);
            this.l.jq(9, parcel0);
            Status status0 = dfta0.c();
            cunf cunf0 = dcvz.a.b();
            int v = status0.i;
            cunf0.h("External sharing provider has received status %s for deny", Integer.valueOf(v));
            if(!status0.e()) {
                this.K(shareTarget0);
                return 13;
            }
            return v;
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).h("Failed to call external provider deny for %s", this.l);
            this.K(shareTarget0);
            return 13;
        }
    }

    @Override  // dftm
    public final int d(ContactFilter contactFilter0) {
        return dfst.a(this, contactFilter0);
    }

    @Override  // dftm
    public final int e(Account account0) {
        return 0;
    }

    @Override  // dftm
    public final int f(ShareTarget shareTarget0, long v, dbzg dbzg0) {
        return 13;
    }

    @Override  // dftm
    public final int g(ShareTarget shareTarget0) {
        ibuq.f(shareTarget0, "shareTarget");
        dfta dfta0 = new dfta("open");
        try {
            ProviderOpenParams providerOpenParams0 = new ProviderOpenParams();
            providerOpenParams0.a = this.J(shareTarget0);
            providerOpenParams0.b = dfta0;
            Parcel parcel0 = this.l.jo();
            wbz.f(parcel0, providerOpenParams0);
            this.l.jq(11, parcel0);
            Status status0 = dfta0.c();
            cunf cunf0 = dcvz.a.b();
            int v = status0.i;
            cunf0.h("External sharing provider has received status %s for open", Integer.valueOf(v));
            if(!status0.e()) {
                this.K(shareTarget0);
                return 13;
            }
            return v;
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).h("Failed to call external provider open for %s", this.l);
            this.K(shareTarget0);
            return 13;
        }
    }

    @Override  // dftm
    public final int h() {
        return 13;
    }

    @Override  // dftm
    public final int i(UpdateSelectedContactsParams updateSelectedContactsParams0) {
        return 13;
    }

    @Override  // dftm
    public final QrCodeMetadata j() {
        throw new UnsupportedOperationException("startQrCodeSession is not supported.");
    }

    @Override  // dftm
    public final List k(ShareTarget shareTarget0) {
        return new ArrayList();
    }

    @Override  // dfsu
    public final List l(int v, int v1, ContactFilter contactFilter0) {
        return new ArrayList();
    }

    @Override  // dftm
    public final List m(Account account0) {
        return new ArrayList();
    }

    @Override  // dftm
    public final Map n(int v) {
        Map map0 = new bxd();
        gged_interceptors gged0 = this.c.g();
        ibuq.e(gged0, "getShareTargets(...)");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: gged0) {
            ShareTarget shareTarget0 = (ShareTarget)object0;
            if(v != 0) {
                if(v == 1 && !shareTarget0.f) {
                    goto label_12;
                }
                continue;
            }
            else if(!shareTarget0.f) {
                continue;
            }
        label_12:
            arrayList0.add(object0);
        }
        for(Object object1: arrayList0) {
            ibuq.e(object1, "next(...)");
            ShareTarget shareTarget1 = (ShareTarget)object1;
            TransferMetadata transferMetadata0 = (TransferMetadata)this.g.get(Long.valueOf(shareTarget1.a));
            if(transferMetadata0 != null) {
                map0.put(shareTarget1, transferMetadata0);
            }
        }
        return map0;
    }

    @Override  // dftm
    public final void o(PrintWriter printWriter0) {
    }

    @Override  // dftm
    public final void p(dcpv dcpv0) {
    }

    @Override  // dftm
    public final void q(Intent intent0) {
    }

    @Override  // dftm
    public final void r() {
    }

    @Override  // dftm
    public final void s() {
    }

    @Override  // dftm
    public final void t(String s) {
        ibuq.f(s, "downloadDirectory");
        dfta dfta0 = new dfta("setDownloadDirectory");
        try {
            ProviderSetDownloadDirectoryParams providerSetDownloadDirectoryParams0 = new ProviderSetDownloadDirectoryParams();
            providerSetDownloadDirectoryParams0.a = s;
            providerSetDownloadDirectoryParams0.b = dfta0;
            Parcel parcel0 = this.l.jo();
            wbz.f(parcel0, providerSetDownloadDirectoryParams0);
            this.l.jq(12, parcel0);
            Status status0 = dfta0.c();
            cunf cunf0 = dcvz.a;
            cunf0.b().h("External sharing provider has received status %s for setDownloadDirectory", Integer.valueOf(status0.i));
            if(status0.e()) {
                cunf0.b().h("External sharing provider has set download directory to %s", s);
            }
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).h("Failed to call external provider setDownloadDirectory for %s", this.l);
        }
    }

    @Override  // dftm
    public final void u(int v) {
    }

    @Override  // dftm
    public final void v(int v) {
    }

    @Override  // dftm
    public final void w() {
        dfta dfta0 = new dfta("shutdown");
        try {
            ProviderShutdownParams providerShutdownParams0 = new ProviderShutdownParams();
            providerShutdownParams0.a = dfta0;
            Parcel parcel0 = this.l.jo();
            wbz.f(parcel0, providerShutdownParams0);
            this.l.jq(13, parcel0);
            Status status0 = dfta0.c();
            cunf cunf0 = dcvz.a;
            cunf0.b().h("External sharing provider has received status %s for shutdown", Integer.valueOf(status0.i));
            if(status0.e()) {
                cunf0.b().p("External sharing provider has shutdown", new Object[0]);
            }
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).h("Failed to call external provider shutdown for %s", this.l);
        }
        this.e.b.clear();
        this.g.clear();
    }

    @Override  // dftm
    public final void x(String s, dcnp dcnp0, dfso dfso0) {
        dfta dfta0 = new dfta("startAdvertising");
        try {
            ProviderStartAdvertisingParams providerStartAdvertisingParams0 = new ProviderStartAdvertisingParams();
            providerStartAdvertisingParams0.a = dftk.a(dfso0, s);
            providerStartAdvertisingParams0.b = new dftd(this, dcnp0);
            providerStartAdvertisingParams0.c = dfta0;
            Parcel parcel0 = this.l.jo();
            wbz.f(parcel0, providerStartAdvertisingParams0);
            this.l.jq(4, parcel0);
            Status status0 = dfta0.c();
            cunf cunf0 = dcvz.a;
            cunf0.b().h("External sharing provider has received status %s for startAdvertising", Integer.valueOf(status0.i));
            if(status0.e()) {
                cunf0.b().p("External sharing provider has started advertising", new Object[0]);
            }
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).h("Failed to call external provider startAdvertising for %s", this.l);
        }
    }

    @Override  // dftm
    public final void y(String s, dcnp dcnp0, dfso dfso0, QrCodeMetadata qrCodeMetadata0) {
        this.x(s, dcnp0, dfso0);
    }

    @Override  // dftm
    public final void z(dclv dclv0, dfsq dfsq0) {
        dfti dfti0 = new dfti(this, dclv0);
        dfta dfta0 = new dfta("startDiscovery");
        ProviderStartDiscoveryParams providerStartDiscoveryParams0 = new ProviderStartDiscoveryParams();
        providerStartDiscoveryParams0.a = dfti0;
        providerStartDiscoveryParams0.b = dftk.b(dfsq0);
        providerStartDiscoveryParams0.c = dfta0;
        try {
            Parcel parcel0 = this.l.jo();
            wbz.f(parcel0, providerStartDiscoveryParams0);
            this.l.jq(1, parcel0);
            Status status0 = dfta0.c();
            cunf cunf0 = dcvz.a;
            cunf0.b().h("External sharing provider has received status %s for startDiscovery", Integer.valueOf(status0.i));
            if(status0.e()) {
                cunf0.b().p("External sharing provider has started discovery", new Object[0]);
            }
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).h("Failed to call external provider startDiscovery for %s", this.l);
        }
    }
}

