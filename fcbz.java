import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.ui.common.InfoMessageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class fcbz extends gdak {
    InfoMessageView a;
    private String ag;
    public gfbr b;
    public final gamj c;
    public static final int d;

    public fcbz() {
        this.c = new gamj(0x65F);
    }

    @Override  // gami
    public final gamj B() {
        return this.c;
    }

    @Override  // gdak
    protected final gewg C() {
        return null;
    }

    @Override  // gdak
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)gfbt.a).jf(7, null);
    }

    @Override  // gdcm
    protected final void M() {
        InfoMessageView infoMessageView0 = this.a;
        if(infoMessageView0 != null) {
            infoMessageView0.setEnabled(this.ca);
        }
    }

    public static fcbz Q(gfbt gfbt0, int v, LogContext logContext0) {
        fcbz fcbz0 = new fcbz();
        fcbz0.setArguments(fcbz.al(v, ((MessageLite)gfbt0), logContext0));
        return fcbz0;
    }

    public final void R(String s) {
        this.ag = s;
        this.b = this.S();
        InfoMessageView infoMessageView0 = this.a;
        if(infoMessageView0 != null) {
            infoMessageView0.n(this.U());
        }
    }

    private final gfbr S() {
        MessageLite hfvm0 = this.aA;
        if(hfvm0 == null) {
            return null;
        }
        gfbr gfbr0 = null;
        String s = this.ag;
        if(((gfbt)hfvm0).d.size() > 0 && !TextUtils.isEmpty(s)) {
            for(Object object0: ((gfbt)this.aA).d) {
                gfbs gfbs0 = (gfbs)object0;
                if(gfbs0 != null && s.equalsIgnoreCase(gfbs0.b)) {
                    gfbr0 = gfbs0.c;
                    if(gfbr0 != null) {
                        break;
                    }
                    gfbr0 = gfbr.a;
                    break;
                }
            }
        }
        if(gfbr0 == null) {
            gfbt gfbt0 = (gfbt)this.aA;
            if((gfbt0.b & 1) != 0) {
                return gfbt0.c == null ? gfbr.a : gfbt0.c;
            }
            return null;
        }
        return gfbr0;
    }

    private final gfgr U() {
        gfbr gfbr0 = this.b;
        if(gfbr0 != null && (gfbr0.b & 2) != 0) {
            return gfbr0.d == null ? gfgr.a : gfbr0.d;
        }
        return null;
    }

    @Override  // gdak
    public final long bs() {
        this.aj();
        return ((gfbt)this.aA).e;
    }

    @Override  // gdaa
    public final boolean la() {
        return true;
    }

    @Override  // gczu
    public final ArrayList lh() {
        return new ArrayList();
    }

    @Override  // gami
    public final List li() {
        return Collections.EMPTY_LIST;
    }

    @Override  // gdcm
    public final void lu() {
        throw new UnsupportedOperationException("UiNode doesn\'t support custom parents.");
    }

    @Override  // gdaa
    public final boolean ly(getg getg0) {
        return false;
    }

    @Override  // gdak
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 != null) {
            this.R(bundle0.getString("legalMessageRegionCode"));
            return;
        }
        this.b = this.S();
    }

    @Override  // gdak
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putString("legalMessageRegionCode", this.ag);
    }

    @Override  // gcyg
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0D3D, null, false);  // layout:wallet_fragment_legal_message_set
        InfoMessageView infoMessageView0 = (InfoMessageView)view0.findViewById(0x7F0B1717);  // id:info_message
        this.a = infoMessageView0;
        infoMessageView0.n(this.U());
        InfoMessageView infoMessageView1 = this.a;
        infoMessageView1.i = this;
        fbgn.E(this.getContext(), infoMessageView1, 0x7F16101A);  // style:UicWalletLegalMessageText
        return view0;
    }
}

