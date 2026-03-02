import android.content.Intent;
import com.google.android.gms.nearby.sharing.RangingData;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class dcle implements dclv, dcnp {
    public final dcii a;
    public final Map b;
    public Intent c;
    public Intent d;
    private final dcmf e;
    private final gful_cronetEngineProvider f;

    public dcle(dcii dcii0, dcmf dcmf0, gful_cronetEngineProvider gful0) {
        this.b = new HashMap();
        this.c = null;
        this.d = null;
        this.a = dcii0;
        this.e = dcmf0;
        this.f = gful0;
    }

    @Override  // dclv
    public final void b(ShareTarget shareTarget0, int v, RangingData rangingData0) {
    }

    @Override  // dclv
    public final void c(ShareTarget shareTarget0) {
        this.b.remove(Long.valueOf(shareTarget0.a));
        ddly ddly0 = (ddly)this.f.mr();
        batl.s(ddly0);
        if(hvqs.P() <= 0L) {
            return;
        }
        jwo jwo0 = ddly0.a(shareTarget0);
        List list0 = ddly0.b;
        for(Object object0: list0) {
            ddlx ddlx0 = (ddlx)object0;
            jwo jwo1 = ddlx0.a;
            if(jwo1.b.equals(jwo0.b)) {
                list0.remove(ddlx0);
                if(ddlx0.b) {
                    gged_interceptors gged0 = gged_interceptors.l(jwo1.b);
                    ddly0.a.b(gged0);
                }
                break;
            }
        }
        ddly0.b();
        dcvz.a.b().h("ShortcutInfoManager removed shortcut %s", shareTarget0.b);
    }

    @Override  // dclv
    public final void d(ShareTarget shareTarget0) {
        long v = shareTarget0.a;
        Map map0 = this.b;
        ShareTarget shareTarget1 = (ShareTarget)map0.get(Long.valueOf(v));
        if(shareTarget1 == null) {
            dcvz.a.e().h("Update shortcut failed, because it can\'t find the old ShareTarget:%s", shareTarget0);
            return;
        }
        ddly ddly0 = (ddly)this.f.mr();
        batl.s(ddly0);
        if(hvqs.P() > 0L) {
            jwo jwo0 = ddly0.a(shareTarget1);
            jwo jwo1 = ddly0.a(shareTarget0);
            List list0 = ddly0.b;
            for(Object object0: list0) {
                ddlx ddlx0 = (ddlx)object0;
                jwo jwo2 = ddlx0.a;
                if(jwo2.b.equals(jwo0.b)) {
                    list0.remove(ddlx0);
                    list0.add(new ddlx(jwo1));
                    if(ddlx0.b) {
                        gged_interceptors gged0 = gged_interceptors.l(jwo2.b);
                        ddly0.a.b(gged0);
                    }
                    break;
                }
            }
            ddly0.b();
            dcvz.a.b().h("ShortcutInfoManager updated shortcut %s", shareTarget0.b);
        }
        map0.put(Long.valueOf(v), shareTarget0);
    }

    @Override  // dcnp
    public final void e(ShareTarget shareTarget0, TransferMetadata transferMetadata0) {
        evql evql0 = this.e.G();
        evql0.b(new dclb(this, shareTarget0, transferMetadata0));
        evql0.A(new dclc());
    }

    @Override  // dclv
    public final void jJ(ShareTarget shareTarget0) {
        this.b.put(Long.valueOf(shareTarget0.a), shareTarget0);
        ddly ddly0 = (ddly)this.f.mr();
        batl.s(ddly0);
        if(hvqs.P() <= 0L) {
            return;
        }
        String s = ddly.d(shareTarget0);
        List list0 = ddly0.b;
        for(Object object0: list0) {
            if(((ddlx)object0).a.b.equals(s)) {
                dcvz.a.e().h("ShortcutInfoManager.addShortcut is no-op as ShortcutId %s already exists in shortcutManager", s);
                return;
            }
        }
        list0.add(new ddlx(ddly0.a(shareTarget0)));
        ddly0.b();
        dcvz.a.b().h("ShortcutInfoManager added shortcut %s", shareTarget0.b);
    }
}

