import com.google.android.gms.nearby.sharing.ShareTarget;
import j..util.Objects;
import java.io.IOException;
import java.util.concurrent.Callable;

public final class dfxd implements Callable {
    public final dfzz a;
    public final ShareTarget b;

    public dfxd(dfzz dfzz0, ShareTarget shareTarget0) {
        this.a = dfzz0;
        this.b = shareTarget0;
    }

    @Override
    public final Object call() {
        dfzz dfzz0 = this.a;
        ShareTarget shareTarget0 = this.b;
        dfum dfum0 = dfzz0.aa(shareTarget0);
        int v = 0;
        if(dfum0 == null) {
            dcvz.a.e().p("Deny invoked for unknown share target", new Object[0]);
            return (int)0x8AB7;
        }
        cunf cunf0 = dcvz.a;
        Objects.requireNonNull(dfum0);
        dfum0.b(new dfxc(dfzz0, cumn.d(cunf0, new dfxb(dfum0), hvqs.K(), dfzz0.g), shareTarget0));
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dciz.a).v_newBuilder();
        dciy dciy0 = dciy.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dciz)hftp0.b_message).c = dciy0.g;
        ((dciz)hftp0.b_message).b |= 1;
        dciz dciz0 = (dciz)hftp0.N_build();
        try {
            dfzz.bo(dfum0, dciz0);
            cunf0.b().p("Successfully wrote a rejection response frame", new Object[0]);
        }
        catch(IOException iOException0) {
            dcvz.a.e().f(iOException0).p("Failed to write the rejection response frame", new Object[0]);
            v = 35510;
        }
        dcnp dcnp0 = dfzz0.Y(shareTarget0);
        if(dcnp0 != null) {
            dcnp0.e(shareTarget0, new dcnn(0x3F0).a());
        }
        return v;
    }
}

