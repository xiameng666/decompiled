import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.nearby.sharing.ContactFilter;
import com.google.android.gms.nearby.sharing.QrCodeMetadata;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.UpdateSelectedContactsParams;
import j..util.concurrent.ConcurrentHashMap;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class dcus implements dfsu {
    public final dcrd a;
    public final dijm b;
    public final dctg c;
    public final icck d;
    public final ConcurrentHashMap e;
    public dcnp f;
    public final icnl g;

    public dcus(dcrd dcrd0, dijm dijm0, dctg dctg0, icck icck0) {
        ibuq.f(dijm0, "providerManager");
        super();
        this.a = dcrd0;
        this.b = dijm0;
        this.c = dctg0;
        this.d = icck0;
        this.e = new ConcurrentHashMap();
        this.g = icnm.a(null);
        icbb.b(icck0, null, null, new dcuj(this, null), 3);
    }

    @Override  // dftm
    public final void A() {
    }

    @Override  // dftm
    public final void B(byte[] arr_b) {
        dfst.c();
    }

    @Override  // dftm
    public final void C() {
    }

    @Override  // dftm
    public final void D() {
        this.g.g(null);
    }

    @Override  // dftm
    public final void E(dcpv dcpv0) {
    }

    @Override  // dftm
    public final void F(String s, dfso dfso0, QrCodeMetadata qrCodeMetadata0) {
    }

    @Override  // dftm
    public final void G(dfsq dfsq0) {
    }

    @Override  // dftm
    public final void H(String s, ShareTarget shareTarget0, dcnp dcnp0, boolean z) {
        ibuq.f(s, "localDeviceName");
        throw new UnsupportedOperationException("Sending directly to a cloud sharing target is not supported");
    }

    @Override  // dftm
    public final int a(ShareTarget shareTarget0) {
        throw new UnsupportedOperationException("Accepting transfer from a cloud sharing target is not supported");
    }

    @Override  // dftm
    public final int b(ShareTarget shareTarget0) {
        ibuq.f(shareTarget0, "shareTarget");
        ConcurrentHashMap concurrentHashMap0 = this.e;
        Collection collection0 = concurrentHashMap0.values();
        ibuq.e(collection0, "<get-values>(...)");
        for(Object object0: collection0) {
            if(!ibuq.m(((dcuk)object0).b, shareTarget0)) {
                continue;
            }
            goto label_10;
        }
        object0 = null;
    label_10:
        dcsl dcsl0 = ((dcuk)object0) == null ? null : ((dcuk)object0).a;
        if(dcsl0 == null) {
            dcvz.a.e().i("Failed to cancel share target %s. No matching cloud receiver found. Active receivers: %s", shareTarget0, concurrentHashMap0.keySet());
            return 13;
        }
        dcul dcul0 = new dcul(this, dcsl0, null);
        icbb.b(this.d, null, null, dcul0, 3);
        return 0;
    }

    @Override  // dftm
    public final int c(ShareTarget shareTarget0) {
        throw new UnsupportedOperationException("Denying transfer from a cloud sharing target is not supported");
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
        ibuq.f(shareTarget0, "shareTarget");
        throw new UnsupportedOperationException("Installing attachments from a cloud sharing target is not supported");
    }

    @Override  // dftm
    @ibni
    public final int g(ShareTarget shareTarget0) {
        ibuq.f(shareTarget0, "shareTarget");
        throw new UnsupportedOperationException("Cloud sharing does not support incoming targets");
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
        return dfst.b();
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
        return new bxd();
    }

    @Override  // dftm
    public final void o(PrintWriter printWriter0) {
        ibuq.f(printWriter0, "writer");
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
    }

    @Override  // dftm
    public final void u(int v) {
    }

    @Override  // dftm
    public final void v(int v) {
    }

    @Override  // dftm
    public final void w() {
    }

    @Override  // dftm
    public final void x(String s, dcnp dcnp0, dfso dfso0) {
        throw null;
    }

    @Override  // dftm
    public final void y(String s, dcnp dcnp0, dfso dfso0, QrCodeMetadata qrCodeMetadata0) {
    }

    @Override  // dftm
    public final void z(dclv dclv0, dfsq dfsq0) {
        this.g.g(dclv0);
    }
}

