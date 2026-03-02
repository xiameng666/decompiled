import android.content.Context;
import android.os.RecoverySystem;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public final class ezzw extends ezyn {
    public static final fagu g;
    private static final baun h;
    private final Context i;
    private final fagt j;
    private final ezxs k;

    static {
        ezzw.h = fabk.e("StreamingProcessPackageAction");
        ezzw.g = new fagu("dir_path", "");
    }

    public ezzw(Context context0, fagj fagj0) {
        super("streaming-process-package", fagj0);
        this.i = context0;
        this.j = (fagt)fagt.a.b();
        this.k = (ezxs)ezxs.l.b();
    }

    @Override  // ezyj
    public final ezyi a() {
        ghjq ghjq0;
        ArrayList arrayList0;
        ghjm ghjm0;
        fafm fafm0;
        ezxs ezxs0 = this.k;
        ezxs0.u(3, -1.0);
        try {
            if(!hvyr.c() || !((gfsx)this.j.b(ezyq.h)).i()) {
                hlnn hlnn0 = ezwr.c(((String)this.c(ezzw.g)));
                fagh[] arr_fagh = new fagh[1];
                gfsx gfsx0 = gfsx.m(hlnn0);
                arr_fagh[0] = new fagh(ezyq.h, gfsx0);
                this.j.e(arr_fagh);
            }
            gfsx gfsx1 = gggq.c(ezwt.b(gfta.b(ezwj.o())), new ezzv());
            if(!gfsx1.i()) {
                throw new IOException("Failed to find payload.bin entry.");
            }
            String s = ezxs0.b().a;
            long v = ((ezws)gfsx1.d()).b;
            long v1 = ((ezws)gfsx1.d()).c;
            File file0 = hrnt.i() ? new File(ccsb.a.d(((String)this.c(ezzw.g)), "payload_properties.txt")) : new File(((String)this.c(ezzw.g)), "payload_properties.txt");
            batl.q(s);
            fafm0 = (fafm)((ProtoLiteMessage)fafn.a).v_newBuilder();
            if(!fafm0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fafm0).ensureMutable();
            }
            fafn fafn0 = (fafn)fafm0.b_message;
            s.getClass();
            fafn0.c = s;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fafo.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fafo.b(((fafo)hftp0.b_message));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((fafo)hftv0).b = v;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fafo)hftp0.b_message).c = v1;
            if(!fafm0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fafm0).ensureMutable();
            }
            fafn fafn1 = (fafn)fafm0.b_message;
            fafo fafo0 = (fafo)hftp0.N_build();
            fafo0.getClass();
            fafn1.e = fafo0;
            fafn1.b |= 1;
            ghjm0 = ghju.a(file0, StandardCharsets.UTF_8);
            arrayList0 = new ArrayList();
            ghjq0 = new ghjq();
        }
        catch(IOException iOException0) {
            ezzw.h.g("Failed to parse package files.", iOException0, new Object[0]);
            this.k.u(274, -1.0);
            return ezzr.a(this.i, true);
        }
        try {
            Reader reader0 = ghjm0.a();
            ghjq0.b(reader0);
            ghjw ghjw0 = new ghjw(reader0);
            while(true) {
                String s1 = ghjw0.a();
                if(s1 == null) {
                    goto label_55;
                }
                arrayList0.add(s1);
            }
        }
        catch(Throwable throwable0) {
            try {
                throw ghjq0.a(throwable0);
            }
            catch(Throwable throwable1) {
                try {
                    ghjq0.close();
                    throw throwable1;
                label_55:
                    ghjq0.close();
                    fafm0.a(arrayList0);
                    fafn fafn2 = (fafn)((ProtoLiteBuilder)fafm0).N_build();
                    fagh[] arr_fagh1 = new fagh[1];
                    gfsx gfsx2 = gfsx.m(fafn2);
                    arr_fagh1[0] = new fagh(ezyq.i, gfsx2);
                    this.j.e(arr_fagh1);
                    goto label_67;
                }
                catch(IOException iOException0) {
                }
            }
        }
        ezzw.h.g("Failed to parse package files.", iOException0, new Object[0]);
        this.k.u(274, -1.0);
        return ezzr.a(this.i, true);
    label_67:
        if(((Boolean)ezwo.d(hvzy.P, Boolean.class)).booleanValue()) {
            File file1 = hrnt.i() ? new File(ccsb.a.d(((String)this.c(ezzw.g)), "compatibility.zip")) : new File(((String)this.c(ezzw.g)), "compatibility.zip");
            if(file1.exists()) {
                try {
                    if(!((Boolean)RecoverySystem.class.getMethod("verifyPackageCompatibility", new Class[]{File.class}).invoke(null, new Object[]{file1})).booleanValue()) {
                        goto label_74;
                    }
                    goto label_77;
                }
                catch(NoSuchMethodException | IllegalArgumentException | IllegalAccessException | InvocationTargetException exception0) {
                    ezzw.h.g("Failed to call RecoverySystem.verifyPackageCompatibility().", exception0, new Object[0]);
                }
            label_74:
                ezzw.h.f("Failed to verify package compatibility.", new Object[0]);
                this.k.u(274, -1.0);
                return new ezyi("finished-execution", fagj.b(new fagh[0]));
            }
        }
    label_77:
        File[] arr_file = (hrnt.i() ? new File(ccsb.a.a(((String)this.c(ezzw.g)))) : new File(((String)this.c(ezzw.g)))).listFiles();
        if(arr_file != null) {
            try {
                for(int v2 = 0; v2 < arr_file.length; ++v2) {
                    faab.f(arr_file[v2]);
                }
            }
            catch(IOException iOException1) {
                ezzw.h.g("Failed to parse package files.", iOException1, new Object[0]);
                this.k.u(274, -1.0);
                boolean z = ezwd.d();
                return ezzr.a(this.i, z);
            }
        }
        fagi fagi0 = new fagi();
        String s2 = (String)this.c(ezzw.g);
        fagi0.e(ezyw.h, s2);
        return new ezyi("ab-update-prep", fagi0.a());
    }
}

