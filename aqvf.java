import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.RemoteException;
import java.util.concurrent.TimeoutException;

public final class aqvf {
    private static final baun a;
    private final aqqk b;
    private final gful_cronetEngineProvider c;
    private final int d;

    static {
        aqvf.a = aqql.a("PhotosApiRequestLogger");
    }

    public aqvf(aqqk aqqk0, int v) {
        this.c = gfus.a(((gful_cronetEngineProvider)new aqve()));
        this.b = aqqk0;
        this.d = v;
    }

    public final Long a() {
        return System.currentTimeMillis();
    }

    public static aqvf b(Context context0, int v) {
        return context0 == null ? new aqvf(null, v) : new aqvf(new aqqk(context0), v);
    }

    public static int c(Context context0) {
        try {
            return context0.getPackageManager().getApplicationInfo("com.google.android.apps.photos", 0).enabled ? 3 : 4;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return 5;
        }
        catch(NullPointerException unused_ex) {
            return 6;
        }
        return 3;
    }

    public static int d(boolean z, Throwable throwable0) {
        if(!z) {
            return 0;
        }
        if((throwable0 instanceof InterruptedException)) {
            return 3;
        }
        if((throwable0 instanceof RemoteException)) {
            return 5;
        }
        if((throwable0 instanceof TimeoutException)) {
            return 4;
        }
        if((throwable0 instanceof SecurityException)) {
            return 6;
        }
        return (throwable0 instanceof IllegalArgumentException) ? 7 : 2;
    }

    public final void e(int v, aqvd aqvd0, int v1, Long long0) {
        this.i(v, false, aqvd0, null, v1, 0, aqvf.h(long0));
    }

    public final void f(int v, aqvd aqvd0, int v1, Long long0) {
        this.i(v, false, aqvd0, null, 0, v1, aqvf.h(long0));
    }

    public final void g(int v, aqvd aqvd0, Object object0, Long long0) {
        this.i(v, true, aqvd0, object0, 0, 0, aqvf.h(long0));
    }

    private static final Integer h(Long long0) {
        return long0 == null ? null : ((int)(System.currentTimeMillis() - ((long)long0)));
    }

    private final void i(int v, boolean z, aqvd aqvd0, Object object0, int v1, int v2, Integer integer0) {
        aqqk aqqk0 = this.b;
        if(aqqk0 == null) {
            aqvf.a.j("Clearcut logger is not provided; not logging anything", new Object[0]);
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giey.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giey)hftv0).g = v - 1;
        ((giey)hftv0).b |= 1;
        int v3 = aqvd0.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        if(v3 == 0) {
            throw null;
        }
        ((giey)hftv1).h = v3 - 1;
        ((giey)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        giey giey0 = (giey)hftp0.b_message;
        giey0.b |= 4;
        giey0.i = z;
        if(((Boolean)this.c.mr()).booleanValue()) {
            int v4 = this.d;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((giey)hftp0.b_message).k = v4 - 1;
            ((giey)hftp0.b_message).b |= 16;
        }
        if((object0 instanceof Boolean)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((giey)hftp0.b_message).c = 4;
            ((giey)hftp0.b_message).d = (Boolean)object0;
        }
        else if((object0 instanceof Integer) && v == 10) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((giey)hftp0.b_message).c = 5;
            ((giey)hftp0.b_message).d = (Integer)object0;
        }
        if(v1 != 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((giey)hftp0.b_message).f = (int)(v1 - 1);
            ((giey)hftp0.b_message).e = 6;
        }
        else if(v2 != 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((giey)hftp0.b_message).f = (int)(v2 - 1);
            ((giey)hftp0.b_message).e = 8;
        }
        if(integer0 != null) {
            int v5 = (int)integer0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giey giey1 = (giey)hftp0.b_message;
            giey1.b |= 8;
            giey1.j = v5;
        }
        ProtoLiteBuilder hftp1 = aqra.b();
        giey giey2 = (giey)hftp0.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        giey2.getClass();
        ghys0.ae = giey2;
        ghys0.d |= 16;
        aqqk0.a(((ghys)hftp1.N_build()), ghyr.an);
    }
}

