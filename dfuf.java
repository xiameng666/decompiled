import android.content.Context;
import com.google.android.gms.nearby.sharing.QrCodeMetadata;
import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dfuf extends dfzz {
    public dfuf(Context context0, dfsk dfsk0, dcqh dcqh0, dgaf dgaf0, dhtl dhtl0, dcpn dcpn0, gful_cronetEngineProvider gful0) {
        super(context0, dfsk0, dcqh0, dgaf0, dhtl0, dcpn0, gful0);
        this.x.l();
    }

    @Override  // dfzz
    public final void C() {
        dcvz.a.e().p("Cannot stop advertising on DisabledNearbySharingProvider.", new Object[0]);
    }

    @Override  // dfzz
    public final void D() {
        dcvz.a.e().p("Cannot stop discovery on DisabledNearbySharingProvider.", new Object[0]);
    }

    @Override  // dfzz
    public final void E(dcpv dcpv0) {
        dcvz.a.e().p("Cannot sync on DisabledNearbySharingProvider.", new Object[0]);
    }

    @Override  // dfzz
    public final void F(String s, dfso dfso0, QrCodeMetadata qrCodeMetadata0) {
        dcvz.a.e().p("Cannot update advertising on DisabledNearbySharingProvider.", new Object[0]);
    }

    @Override  // dfzz
    public final void G(dfsq dfsq0) {
        dcvz.a.e().p("Cannot update discovery on DisabledNearbySharingProvider.", new Object[0]);
    }

    @Override  // dfzz
    public final int a(ShareTarget shareTarget0) {
        dcvz.a.e().p("Cannot accept on DisabledNearbySharingProvider.", new Object[0]);
        return 35501;
    }

    @Override  // dfzz
    public final int b(ShareTarget shareTarget0) {
        dcvz.a.e().p("Cannot cancel on DisabledNearbySharingProvider.", new Object[0]);
        return 35501;
    }

    @Override  // dfzz
    public final int c(ShareTarget shareTarget0) {
        dcvz.a.e().p("Cannot deny on DisabledNearbySharingProvider.", new Object[0]);
        return 35501;
    }

    @Override  // dfzz
    public final int g(ShareTarget shareTarget0) {
        dcvz.a.e().p("Cannot open on DisabledNearbySharingProvider.", new Object[0]);
        return 35501;
    }

    @Override  // dfzz
    public final void v(int v) {
        dcvz.a.e().p("Cannot set visibility on DisabledNearbySharingProvider.", new Object[0]);
    }

    @Override  // dfzz
    public final void y(String s, dcnp dcnp0, dfso dfso0, QrCodeMetadata qrCodeMetadata0) {
        dcvz.a.e().p("Cannot start advertising on DisabledNearbySharingProvider.", new Object[0]);
    }

    @Override  // dfzz
    public final void z(dclv dclv0, dfsq dfsq0) {
        dcvz.a.e().p("Cannot start discovery on DisabledNearbySharingProvider.", new Object[0]);
    }
}

