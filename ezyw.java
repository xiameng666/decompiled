import android.content.Context;
import android.os.DeadSystemException;
import android.os.UpdateEngine.AllocateSpaceResult;
import java.io.File;
import java.io.IOException;

public final class ezyw extends ezyn {
    static final fagu g;
    static final fagu h;
    static final fagp i;
    static final fagl j;
    private static final baun k;
    private final Context l;
    private final ezxs m;

    static {
        ezyw.g = new fagu("file_path", "");
        ezyw.h = new fagu("dir_path", "");
        ezyw.i = new fagp("device_corrupted_boot_token", ((long)-1L));
        ezyw.k = fabk.e("AbUpdatePrepAction");
        ezyw.j = new fagl("network_error_attempts", ((int)0));
    }

    public ezyw(Context context0, fagj fagj0) {
        super("ab-update-prep", fagj0);
        this.l = context0;
        this.m = (ezxs)ezxs.l.b();
    }

    @Override  // ezyj
    public final ezyi a() {
        ezyi ezyi1;
        ezyi ezyi0;
        Object object1;
        Object object0;
        gfsx gfsx1;
        if(((Boolean)ezwo.a(hwcl.m, Boolean.class)).booleanValue()) {
            if(hvyl.d() && this.m.b().c == 24 && ((long)(((Long)this.c(ezyw.i)))) == ((ezxl)ezxl.h.b()).b()) {
                ezze ezze0 = new ezze();
                ezze0.d("ab-update-prep", this.b());
                ezze0.f(hvyl.b());
                ezze0.c(false);
                return ezze0.a();
            }
            ezxs ezxs0 = this.m;
            ezxs0.u(0x913, -1.0);
            fage fage0 = fagt.a;
            fagt fagt0 = (fagt)fage0.b();
            fagf fagf0 = ezyq.o;
            Boolean boolean0 = (Boolean)fagt0.b(fagf0);
            boolean z = boolean0.booleanValue();
            gfsx gfsx0 = gfqx.a;
            try {
                gfsx1 = this.h();
                if(!gfsx1.i()) {
                    if(!z) {
                        String s = ezxs0.b().a;
                        z = faac.a(this.l, s);
                    }
                    if(!z) {
                        throw new fabo("Unable to download payload metadata.");
                    }
                    gfsx0 = this.g();
                    if(gfsx0.i()) {
                        object0 = gfsx0.d();
                        goto label_25;
                    }
                    goto label_28;
                }
                object1 = gfsx1.d();
                goto label_65;
            }
            catch(IOException iOException0) {
                goto label_34;
            }
            catch(Throwable throwable0) {
                goto label_62;
            }
        label_25:
            if(!ezwl.a().booleanValue() || !gfsx0.i()) {
                ((fagt)fagt.a.b()).e(new fagh[]{new fagh(ezyq.o, Boolean.valueOf(true))});
            }
            return (ezyi)object0;
        label_28:
            if(!ezwl.a().booleanValue() || !gfsx0.i()) {
                ((fagt)fagt.a.b()).e(new fagh[]{new fagh(ezyq.o, Boolean.valueOf(true))});
            }
            return this.f();
            try {
                try {
                    object1 = gfsx1.d();
                    goto label_65;
                }
                catch(IOException iOException0) {
                }
            label_34:
                ezyw.k.n("Unable to download payload metadata file.", iOException0, new Object[0]);
                if(!(iOException0 instanceof fabo) && !(iOException0 instanceof fabp) && !(iOException0 instanceof fabn)) {
                    this.m.u(0xA13, -1.0);
                    goto label_37;
                }
                goto label_46;
            }
            catch(Throwable throwable0) {
                goto label_62;
            }
            try {
            label_37:
                boolean z1 = ezwd.d();
                ezyi0 = ezzr.a(this.l, z1);
            }
            catch(Throwable throwable0) {
                z = false;
                goto label_62;
            }
            if(!ezwl.a().booleanValue() || !gfsx0.i()) {
                ((fagt)fagt.a.b()).e(new fagh[]{new fagh(ezyq.o, Boolean.valueOf(false))});
            }
            return ezyi0;
            try {
            label_46:
                fagi fagi0 = this.b().a();
                Integer integer0 = (int)(((int)(((Integer)this.c(ezyw.j)))) + 1);
                fagi0.e(ezyw.j, integer0);
                fagj fagj0 = fagi0.a();
                this.m.u(0xA13, -1.0);
                ezzb ezzb0 = new ezzb();
                ezzb0.f(hvzt.d(), ezwi.d().longValue());
                ezzb0.g(hvzt.b());
                ezzb0.h(((Integer)this.c(ezyw.j)).intValue());
                ezzb0.d("ab-update-prep", fagj0);
                ezzb0.e(gfsx.m(ezyy.g()));
                ezyi1 = ezzb0.a();
            }
            catch(Throwable throwable0) {
                goto label_62;
            }
            if(!ezwl.a().booleanValue() || !gfsx0.i()) {
                ((fagt)fagt.a.b()).e(new fagh[]{new fagh(ezyq.o, Boolean.valueOf(z))});
            }
            return ezyi1;
        label_62:
            if(!ezwl.a().booleanValue() || !gfsx0.i()) {
                ((fagt)fagt.a.b()).e(new fagh[]{new fagh(ezyq.o, Boolean.valueOf(z))});
            }
            throw throwable0;
        label_65:
            ezwl.a();
            ((fagt)fage0.b()).e(new fagh[]{new fagh(fagf0, boolean0)});
            return (ezyi)object1;
        }
        return this.f();
    }

    private final ezyi f() {
        if(ezwd.d()) {
            fagi fagi0 = new fagi();
            String s = (String)this.c(ezyw.h);
            fagi0.e(ezzs.g, s);
            return new ezyi("streaming-apply", fagi0.a());
        }
        fagi fagi1 = new fagi();
        fagh[] arr_fagh = new fagh[1];
        String s1 = (String)this.b().c(ezyw.g);
        arr_fagh[0] = new fagh(ezzl.g, s1);
        fagi1.d(arr_fagh);
        return new ezyi("non-streaming-ab-apply", fagi1.a());
    }

    private final gfsx g() {
        gfsx gfsx0 = (gfsx)((fagt)fagt.a.b()).b(ezyq.i);
        gftb.b(gfsx0.i(), "Unable to allocate space due to missing AbPayloadSpec.");
        fafn fafn0 = (fafn)gfsx0.d();
        File file0 = hrnt.i() ? new File(ccsb.a.d(faab.b().getAbsolutePath(), "payload_metadata.bin")) : new File(faab.b().getAbsolutePath(), "payload_metadata.bin");
        faab.f(file0);
        try {
            fabh fabh0 = (fabh)fabh.b.b();
            String s = file0.getAbsolutePath();
            String[] arr_s = (String[])gggq.A(fafn0.d, String.class);
            fabh.a.h("allocateSpace()", new Object[0]);
            gfsx gfsx1 = (gfsx)fabh0.f(new fabc(fabh0, s, arr_s));
            if(gfsx1.i()) {
                switch(((UpdateEngine.AllocateSpaceResult)gfsx1.d()).getErrorCode()) {
                    case 1: {
                        break;
                    }
                    case 60: {
                        goto label_17;
                    }
                    default: {
                        return gfqx.a;
                    }
                }
            }
        }
        catch(DeadSystemException deadSystemException0) {
            ezyw.k.n("Error while update engine allocating space. \n%s", deadSystemException0, new Object[0]);
        }
        goto label_22;
    label_17:
        this.m.u(0x613, -1.0);
        ezze ezze0 = new ezze();
        ezze0.f(ezwl.b().longValue());
        ezze0.d("ab-update-prep", this.b());
        return gfsx.m(ezze0.a());
    label_22:
        this.m.u(0x713, -1.0);
        if(ezwl.a().booleanValue()) {
            ezyw.k.h("Update engine allocate space for A/B update failed. Re-downloading OTA payload metadata", new Object[0]);
            faab.e(this.l);
            fagt fagt0 = (fagt)fagt.a.b();
            fagl fagl0 = ezyq.e;
            int v = (int)(((Integer)fagt0.b(fagl0)));
            if(((long)v) >= ((long)(((Long)ezwo.a(hwcl.h, Long.class))))) {
                return gfsx.m(new ezyi("finished-execution", fagj.b(new fagh[0])));
            }
            fagt0.e(new fagh[]{new fagh(fagl0, ((int)(v + 1)))});
            ezzb ezzb0 = new ezzb();
            ezzb0.f(((Long)ezwo.a(hwcl.d, Long.class)).longValue(), ((Long)ezwo.a(hwcl.e, Long.class)).longValue());
            ezzb0.g(((Double)ezwo.a(hwcl.f, Double.class)).doubleValue());
            ezzb0.c(false);
            ezzb0.h(v);
            ezzb0.d("pre-download-validate", fagj.b(new fagh[0]));
            ezzb0.e(gfsx.m(ezyy.g()));
            return gfsx.m(ezzb0.a());
        }
        ezze ezze1 = new ezze();
        ezze1.f(ezwl.b().longValue());
        ezze1.d("ab-update-prep", this.b());
        return gfsx.m(ezze1.a());
    }

    private final gfsx h() {
        try {
            switch(((fabh)fabh.b.b()).a()) {
                case 1: {
                    goto label_6;
                }
                case 61: {
                    goto label_11;
                }
            }
        }
        catch(DeadSystemException | fabe exception0) {
            ezyw.k.n("Error while update engine cleaning up previously applied payload. \n%s", exception0, new Object[0]);
            goto label_6;
        }
        return gfqx.a;
    label_6:
        this.m.u(2067, -1.0);
        ezze ezze0 = new ezze();
        ezze0.f(((Long)ezwo.a(hwcl.l, Long.class)).longValue());
        ezze0.d("ab-update-prep", this.b().a().a());
        return gfsx.m(ezze0.a());
    label_11:
        this.m.u(24, -1.0);
        if(hvyl.d()) {
            ezze ezze1 = new ezze();
            fagi fagi0 = this.b().a();
            Long long0 = ((ezxl)ezxl.h.b()).b();
            fagi0.e(ezyw.i, long0);
            ezze1.d("ab-update-prep", fagi0.a());
            ezze1.f(hvyl.b());
            ezze1.c(false);
            return gfsx.m(ezze1.a());
        }
        return gfsx.m(new ezyi("finished-execution", fagj.b(new fagh[0])));
    }
}

