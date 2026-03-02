import android.accounts.Account;
import android.net.Uri;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dyau {
    private final Account a;
    private final String b;
    private gfsx c;

    public dyau(Account account0, String s) {
        this.c = gfqx.a;
        this.a = account0;
        this.b = s;
    }

    // This method was un-flattened
    public final gged_interceptors a() {
        int v1;
        try {
            hfuo hfuo0 = ((dydl)this.b().a().get(10L, TimeUnit.SECONDS)).b;
            ggdy ggdy0 = new ggdy();
            for(Object object0: hfuo0) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvdw.a).v_newBuilder();
                int v = 4;
                switch(((dydk)object0).b) {
                    case 0: {
                        break;
                    }
                    case 1: {
                        v1 = 3;
                        break;
                    }
                    case 2: {
                        v1 = 4;
                        break;
                    }
                    default: {
                        v1 = 1;
                    }
                }
                switch(v1 - 2) {
                    case 1: {
                        v = 3;
                        break;
                    }
                    case 2: {
                        break;
                    }
                    default: {
                        v = 2;
                    }
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gvdw)hftv0).b = v - 2;
                String s = ((dydk)object0).c;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gvdw gvdw0 = (gvdw)hftp0.b_message;
                s.getClass();
                gvdw0.c = s;
                ggdy0.i(((gvdw)hftp0.N_build()));
            }
            return ggdy0.h();
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return ggna.a;
        }
    }

    public final frli b() {
        frli frli1;
        synchronized(this) {
            if(this.c.i()) {
                return (frli)this.c.d();
            }
            frce frce0 = new frce(AppContextProvider.a());
            frce0.d("pay");
            frce0.c(this.a);
            frce0.e("recentlocalvaluableaction/" + this.b + ".pb");
            Uri uri0 = frce0.a();
            frie frie0 = frif.a();
            frie0.f(uri0);
            frie0.e(((MessageLite)dydl.a));
            frie0.h(new frjp(cjtd.a));
            frif frif0 = frie0.a();
            gfsx gfsx0 = gfsx.m(cjtb.a.a(frif0));
            this.c = gfsx0;
            frli1 = (frli)gfsx0.d();
        }
        return frli1;
    }

    public final void c(gvdw gvdw0) {
        this.b().b(new dyas(gvdw0), gmap.a);
    }

    public static final dydk d(gvdw gvdw0) {
        int v1;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dydk.a).v_newBuilder();
        int v = 4;
        switch(gvdw0.b) {
            case 0: {
                v1 = 2;
                break;
            }
            case 1: {
                v1 = 3;
                break;
            }
            case 2: {
                v1 = 4;
                break;
            }
            default: {
                v1 = 0;
            }
        }
        if(v1 == 0) {
            v1 = 1;
        }
        switch(v1 - 2) {
            case 1: {
                v = 3;
                break;
            }
            case 2: {
                break;
            }
            default: {
                v = 2;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((dydk)hftv0).b = v - 2;
        String s = gvdw0.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        dydk dydk0 = (dydk)hftp0.b_message;
        s.getClass();
        dydk0.c = s;
        return (dydk)hftp0.N_build();
    }
}

