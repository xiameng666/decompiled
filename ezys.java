import android.content.Context;
import android.os.RecoverySystem;
import android.text.TextUtils;
import com.google.android.gms.update.SystemUpdateStatus;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

public final class ezys implements Callable {
    public final ezyv a;
    public final ggdy b;
    public final SystemUpdateStatus c;

    public ezys(ezyv ezyv0, ggdy ggdy0, SystemUpdateStatus systemUpdateStatus0) {
        this.a = ezyv0;
        this.b = ggdy0;
        this.c = systemUpdateStatus0;
    }

    @Override
    public final Object call() {
        ezxu ezxu0 = (ezxu)ezxu.a.b();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gigt.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        SystemUpdateStatus systemUpdateStatus0 = this.c;
        ggdy ggdy0 = this.b;
        ezyv ezyv0 = this.a;
        ((gigt)hftp0.b_message).c = 1;
        ((gigt)hftp0.b_message).b |= 1;
        gigt gigt0 = (gigt)hftp0.N_build();
        ezxu0.b.a(gigt0);
        String s = TextUtils.join(",", ggdy0.h());
        ezxl.a.h("Reboot with resume.", new Object[0]);
        ezxl ezxl0 = ezyv0.k;
        String s1 = String.valueOf(ezxl0.d());
        ezxl.a.d("Rebooting with update token: %s.", new Object[]{s1});
        gfss gfss0 = gfss.d(',');
        String s2 = new gfsp(gfss0, gfss0).g(gfta.a((systemUpdateStatus0.C ? hwcf.d() : hwcf.c())), gfta.a(s), new Object[0]);
        try {
            RecoverySystem.rebootAndApply(ezxl0.i, s1, s2);
            return null;
        }
        catch(IOException iOException0) {
            ezxl.a.g("Reboot with resume failed with exception.", iOException0, new Object[0]);
        }
        catch(Throwable throwable0) {
            if(!(throwable0 instanceof NoSuchMethodError)) {
                throw throwable0;
            }
            try {
                if(((Boolean)RecoverySystem.class.getMethod("rebootAndApply", new Class[]{Context.class, String.class, String.class}).invoke(null, new Object[]{ezxl0.i, s1, s2})).booleanValue()) {
                    return null;
                }
            }
            catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException exception0) {
                ezxl.a.g("Reboot with resume failed with exception.", exception0, new Object[0]);
            }
        }
        ezyv.g.f("Unable to reboot with resume.", new Object[0]);
        fabj fabj0 = ((ezxu)ezxu.a.b()).b;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gigt.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gigt)hftp1.b_message).c = 3;
        ((gigt)hftp1.b_message).b |= 1;
        fabj0.a(((gigt)hftp1.N_build()));
        ezxs ezxs0 = ezyv0.l;
        fagh[] arr_fagh = new fagh[1];
        Long long0 = (long)(((long)(((Long)ezxs0.n.b(ezxs.g)))) + 1L);
        arr_fagh[0] = new fagh(ezxs.g, long0);
        ezxs0.n.e(arr_fagh);
        if(systemUpdateStatus0.C) {
            gged_interceptors gged0 = ggdy0.h();
            ezyv0.k.h(gged0, true);
            return null;
        }
        ezxs0.p();
        ezxs0.u(0x210, -1.0);
        return null;
    }
}

