import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.wallet.analytics.events.TapAndPayCallEvent;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

public final class fbwo extends gchu {
    public fbwo(Context context0, etgl etgl0) {
        super(context0, etgl0);
    }

    @Override  // gchu
    protected final gcib a(Object object0) {
        if(!(object0 instanceof BuyFlowConfig)) {
            throw new IllegalArgumentException("Expect a BuyFlowConfig object");
        }
        ApplicationParameters applicationParameters0 = ((BuyFlowConfig)object0).b;
        return (applicationParameters0 == null || applicationParameters0.a != 22) && !hzhp.a.b().h() ? this.b : this.c;
    }

    @Override  // gchu
    protected final boolean b(Object object0) {
        if((object0 instanceof BuyFlowConfig)) {
            return ((BuyFlowConfig)object0).b.a == 3;
        }
        throw new IllegalArgumentException("Expect a BuyFlowConfig object");
    }

    @Override  // gchu
    protected final void c(int v, String s, String s1, long v1, azuj azuj0, int v2, Object object0) {
        if(!(object0 instanceof BuyFlowConfig)) {
            throw new IllegalArgumentException("Expect a BuyFlowConfig object");
        }
        int v3 = 6;
        int v4 = 3;
        switch(v - 1) {
            case 0: {
                v3 = 2;
                break;
            }
            case 2: {
                v3 = 4;
                break;
            }
            default: {
                if(v - 1 == 3) {
                    v3 = 5;
                }
                else {
                    switch(v - 1) {
                        case 4: {
                            break;
                        }
                        case 5: {
                            v3 = 7;
                            break;
                        }
                        case 6: {
                            v3 = 8;
                            break;
                        }
                        default: {
                            v3 = 3;
                        }
                    }
                }
            }
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkmz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gkmz)hftp0.b_message).c = v3 - 1;
        ((gkmz)hftp0.b_message).b |= 1;
        long v5 = SystemClock.elapsedRealtime() - v1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkmz gkmz0 = (gkmz)hftp0.b_message;
        gkmz0.b |= 2;
        gkmz0.d = (int)v5;
        int v6 = azuj0.a().i;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gkmz)hftv0).b |= 8;
        ((gkmz)hftv0).e = v6;
        if(s1 != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkmz gkmz1 = (gkmz)hftp0.b_message;
            gkmz1.b |= 16;
            gkmz1.f = s1;
        }
        gkmz gkmz2 = (gkmz)hftp0.N_build();
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gkmz2).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gkmz2));
        switch(v - 1) {
            case 0: {
                if(azuj0.a().e()) {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gkmt.a).v_newBuilder();
                    boolean z = ((azth)azuj0).b;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gkmt gkmt0 = (gkmt)hftp2.b_message;
                    gkmt0.b |= 1;
                    gkmt0.c = z;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gkmz gkmz3 = (gkmz)hftp1.b_message;
                    gkmt gkmt1 = (gkmt)hftp2.N_build();
                    gkmt1.getClass();
                    gkmz3.g = gkmt1;
                    gkmz3.b |= 0x20;
                }
                break;
            }
            case 1: {
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gkmy.a).v_newBuilder();
                switch(v2) {
                    case 2: {
                        v4 = 4;
                        break;
                    }
                    case 3: {
                        v4 = 2;
                        break;
                    }
                    case 4: {
                        break;
                    }
                    case 5: {
                        v4 = 5;
                        break;
                    }
                    default: {
                        v4 = 1;
                    }
                }
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((gkmy)hftp3.b_message).c = v4 - 1;
                ((gkmy)hftp3.b_message).b |= 1;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gkmz gkmz4 = (gkmz)hftp1.b_message;
                gkmy gkmy0 = (gkmy)hftp3.N_build();
                gkmy0.getClass();
                gkmz4.h = gkmy0;
                gkmz4.b |= 0x40;
                break;
            }
            case 2: {
                if(azuj0.a().e()) {
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gkms.a).v_newBuilder();
                    int v7 = ((eskv)azuj0).b().a.length;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gkms gkms0 = (gkms)hftp4.b_message;
                    gkms0.b |= 1;
                    gkms0.c = v7;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gkmz gkmz5 = (gkmz)hftp1.b_message;
                    gkms gkms1 = (gkms)hftp4.N_build();
                    gkms1.getClass();
                    gkmz5.i = gkms1;
                    gkmz5.b |= 0x80;
                }
                break;
            }
            case 4: {
                if(azuj0.a().e()) {
                    ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gkmu.a).v_newBuilder();
                    boolean z1 = ((azth)azuj0).b;
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    gkmu gkmu0 = (gkmu)hftp5.b_message;
                    gkmu0.b |= 1;
                    gkmu0.c = z1;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gkmz gkmz6 = (gkmz)hftp1.b_message;
                    gkmu gkmu1 = (gkmu)hftp5.N_build();
                    gkmu1.getClass();
                    gkmz6.j = gkmu1;
                    gkmz6.b |= 0x200;
                }
            }
        }
        fbpb.a(this.a, new TapAndPayCallEvent(((BuyFlowConfig)object0), s, ((gkmz)hftp1.N_build())));
    }
}

