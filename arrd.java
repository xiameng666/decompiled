import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class arrd extends arqo {
    public static final baun a;
    public final Context b;
    public Long c;
    public final List d;
    private final etgl e;
    private final azts f;

    static {
        arrd.a = aqql.a("WalletFlavorHandler");
    }

    public arrd(Context context0, azts azts0, etgl etgl0) {
        this.c = null;
        this.d = new ArrayList();
        this.b = context0;
        this.f = azts0;
        this.e = etgl0;
    }

    @Override  // arqo
    public final File a(asby asby0) {
        throw new IOException("Wallet flavor should not use file payload");
    }

    @Override  // arqo
    public final InputStream b(asby asby0) {
        ascx ascx0 = asby0.c == 106 ? ((ascx)asby0.d) : ascx.a;
        if((ascs.b(ascx0.e) == null ? ascs.a : ascs.b(ascx0.e)) == ascs.c) {
            Long long0 = this.c;
            if(long0 == null) {
                arrd.a.m("Missing target device Android ID. Could not restore Felica item", new Object[0]);
                return new arrh(new arrb());
            }
            arrc arrc0 = new arrc();
            this.f.aY(arre.a(long0.longValue(), gged_interceptors.l(asby0)).toBytesArray()).A(arrc0);
            return new arrh(new arrb());
        }
        this.d.add(asby0);
        return new arrh(new arrb());
    }

    @Override  // arqo
    public final List c() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fsxb.a).v_newBuilder();
        fszn fszn0 = fszn.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fsxb fsxb0 = (fsxb)hftp0.b_message;
        fszn0.getClass();
        fsxb0.c = fszn0;
        fsxb0.b = 1;
        fsxc fsxc0 = arre.b(((fsxb)hftp0.N_build()), this.f);
        if(fsxc0 == null) {
            return ggna.a;
        }
        return fsxc0.b == 2 ? ((fszo)fsxc0.c).b : fszo.a.b;
    }

    @Override  // arqo
    public final void d(asby asby0, InputStream inputStream0) {
        bbpb.b(inputStream0);
    }

    @Override  // arqo
    public final asbm k() {
        evql evql0 = this.e.j();
        String s = null;
        try {
            AccountInfo accountInfo0 = (AccountInfo)evrg.n(evql0);
            if(accountInfo0 != null) {
                s = accountInfo0.b;
            }
        }
        catch(ExecutionException | InterruptedException exception0) {
            arrd.a.i("Framework error while getting active wallet account", exception0, new Object[0]);
        }
        if(s != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asbm.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)asct.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asct asct0 = (asct)hftp1.b_message;
            asct0.b |= 1;
            asct0.c = s;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            asbm asbm0 = (asbm)hftp0.b_message;
            asct asct1 = (asct)hftp1.N_build();
            asct1.getClass();
            asbm0.c = asct1;
            asbm0.b = 1;
            return (asbm)hftp0.N_build();
        }
        return asbm.a;
    }
}

