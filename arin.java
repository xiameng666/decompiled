import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Environment;
import com.google.android.chimera.config.ModuleManager;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.EnumMap;
import jeb.synthetic.FIN;

public abstract class arin implements arlj {
    public static final aqql a;
    final Context b;
    final gmcg c;
    final WifiManager d;
    public arlk e;
    protected final gful_cronetEngineProvider f;
    protected final gful_cronetEngineProvider g;
    protected final gful_cronetEngineProvider h;
    protected final gful_cronetEngineProvider i;
    protected final gful_cronetEngineProvider j;
    protected final gful_cronetEngineProvider k;
    protected final gful_cronetEngineProvider l;
    protected final gful_cronetEngineProvider m;
    protected final gful_cronetEngineProvider n;
    protected final gful_cronetEngineProvider o;
    private final EnumMap p;

    static {
        arin.a = new aqql(new String[]{"Protocol"});
    }

    public arin(Context context0, gmcg gmcg0, WifiManager wifiManager0) {
        this.p = new EnumMap(hkyj.class);
        this.f = gfus.a(((gful_cronetEngineProvider)new aria()));
        this.g = gfus.a(((gful_cronetEngineProvider)new aric()));
        this.h = gfus.a(((gful_cronetEngineProvider)new arid()));
        this.i = gfus.a(((gful_cronetEngineProvider)new arie()));
        this.j = gfus.a(((gful_cronetEngineProvider)new arif()));
        this.k = gfus.a(((gful_cronetEngineProvider)new arig()));
        this.l = gfus.a(((gful_cronetEngineProvider)new arih()));
        this.m = gfus.a(((gful_cronetEngineProvider)new arii()));
        this.n = gfus.a(((gful_cronetEngineProvider)new arij()));
        this.o = gfus.a(((gful_cronetEngineProvider)new arik()));
        this.b = context0;
        this.c = gmcg0;
        this.d = wifiManager0;
    }

    @Override  // arlj
    public final arkq a(hkyj hkyj0) {
        arkq arkq1;
        synchronized(this) {
            EnumMap enumMap0 = this.p;
            if(enumMap0.containsKey(hkyj0)) {
                return (arkq)enumMap0.remove(hkyj0);
            }
            arin.a.f("Unexpected stream; ignoring.", new Object[0]);
            arkq1 = new aril(this, this, hkyj0);
        }
        return arkq1;
    }

    public final asci b(int v, String s) {
        asci asci0 = arin.m(asch.m);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)asci0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)asci0));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ascj.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((ascj)hftv0).b |= 1;
        ((ascj)hftv0).c = v;
        String s1 = bbqr.c(s);
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ascj ascj0 = (ascj)hftp1.b_message;
        ascj0.b |= 2;
        ascj0.d = s1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asci asci1 = (asci)hftp0.b_message;
        ascj ascj1 = (ascj)hftp1.N_build();
        ascj1.getClass();
        asci1.f = ascj1;
        asci1.b |= 8;
        return (asci)hftp0.N_build();
    }

    @Override  // arlj
    public void c(hkyj hkyj0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(!hkyj0.equals(hkyj.a)) {
            EnumMap enumMap0 = this.p;
            if(enumMap0.containsKey(hkyj0)) {
                ((arkq)enumMap0.remove(hkyj0)).a(2);
                FIN.finallyCodeBegin$NT(v);
                return;
            }
            FIN.finallyExec$NT(v);
            return;
        }
        throw new IllegalArgumentException("Connection type is unspecified for Protcol.onDisconnect().");
    }

    public final void d(asch asch0) {
        this.f(arin.m(asch0));
    }

    final void e(String s, hkyf hkyf0, boolean z) {
        boolean z15;
        boolean z14;
        boolean z13;
        boolean z12;
        asci asci0 = arin.m(asch.b);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)asci0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)asci0));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)asbt.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        boolean z1 = true;
        ((asbt)hftv0).b |= 1;
        ((asbt)hftv0).d = 0xD2DB00DA;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((asbt)hftv1).b |= 2;
        ((asbt)hftv1).e = 1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((asbt)hftv2).b |= 4;
        ((asbt)hftv2).f = 5;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        asbt asbt0 = (asbt)hftp1.b_message;
        s.getClass();
        asbt0.b |= 0x80;
        asbt0.k = s;
        String s1 = Build.MODEL;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        asbt asbt1 = (asbt)hftp1.b_message;
        s1.getClass();
        asbt1.b |= 8;
        asbt1.g = s1;
        String s2 = Build.MANUFACTURER;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        asbt asbt2 = (asbt)hftp1.b_message;
        s2.getClass();
        asbt2.b |= 16;
        asbt2.h = s2;
        int v = Build.VERSION.SDK_INT;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((asbt)hftv3).b |= 0x4000;
        ((asbt)hftv3).r = v;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        asbt asbt3 = (asbt)hftp1.b_message;
        asbt3.b |= 0x2000;
        asbt3.q = false;
        int v2 = (int)hqnd.b();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        asbt asbt4 = (asbt)hftp1.b_message;
        asbt4.b |= 0x10000;
        asbt4.t = v2;
        boolean z2 = ((Boolean)this.g.mr()).booleanValue();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        asbt asbt5 = (asbt)hftp1.b_message;
        asbt5.b |= 0x1000000;
        asbt5.C = z2;
        boolean z3 = ((Boolean)this.h.mr()).booleanValue();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        asbt asbt6 = (asbt)hftp1.b_message;
        asbt6.b |= 0x8000000;
        asbt6.E = z3;
        boolean z4 = ((Boolean)this.i.mr()).booleanValue();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        asbt asbt7 = (asbt)hftp1.b_message;
        asbt7.b |= 0x10000000;
        asbt7.F = z4;
        boolean z5 = ((Boolean)this.j.mr()).booleanValue();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        asbt asbt8 = (asbt)hftp1.b_message;
        asbt8.b |= 0x80000000;
        asbt8.I = z5;
        boolean z6 = ((Boolean)this.k.mr()).booleanValue();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((asbt)hftp1.b_message).c |= 1;
        ((asbt)hftp1.b_message).J = z6;
        boolean z7 = ((Boolean)this.l.mr()).booleanValue();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        asbt asbt9 = (asbt)hftp1.b_message;
        asbt9.b |= 0x20000000;
        asbt9.G = z7;
        boolean z8 = ((Boolean)this.m.mr()).booleanValue();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        asbt asbt10 = (asbt)hftp1.b_message;
        asbt10.b |= 0x40000000;
        asbt10.H = z8;
        boolean z9 = ((Boolean)this.n.mr()).booleanValue();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((asbt)hftp1.b_message).c |= 2;
        ((asbt)hftp1.b_message).K = z9;
        boolean z10 = ((Boolean)this.o.mr()).booleanValue();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((asbt)hftp1.b_message).c |= 4;
        ((asbt)hftp1.b_message).L = z10;
        if(hqhq.a.j().bc()) {
            String s3 = Build.MODEL;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbt asbt11 = (asbt)hftp1.b_message;
            s3.getClass();
            asbt11.b |= 0x20;
            asbt11.i = s3;
        }
        boolean z11 = hqhq.v();
        arin.a.h("Setting throughputTestSupported to %b", new Object[]{Boolean.valueOf(z11)});
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        asbt asbt12 = (asbt)hftp1.b_message;
        asbt12.b |= 0x400000;
        asbt12.z = z11;
        try {
            ModuleManager moduleManager0 = ModuleManager.get(this.b);
            int v3 = moduleManager0.getCurrentModule().moduleVersion;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbt asbt13 = (asbt)hftp1.b_message;
            asbt13.b |= 0x400;
            asbt13.n = v3;
            int v4 = moduleManager0.getCurrentModuleApk().apkVersionCode;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbt asbt14 = (asbt)hftp1.b_message;
            asbt14.b |= 0x800;
            asbt14.o = v4;
        }
        catch(IllegalStateException illegalStateException0) {
            arin.a.g("Exception while getting module/policy version number.", illegalStateException0, new Object[0]);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp1.b_message;
            ((asbt)hftv4).b |= 0x400;
            ((asbt)hftv4).n = -1;
            if(!hftv4.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbt asbt15 = (asbt)hftp1.b_message;
            asbt15.b |= 0x800;
            asbt15.o = -1;
        }
        try {
            PackageInfo packageInfo0 = this.b.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            int v5 = packageInfo0.versionCode;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbt asbt16 = (asbt)hftp1.b_message;
            asbt16.b |= 0x100;
            asbt16.l = v5;
            String s4 = bbqr.c(packageInfo0.versionName);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbt asbt17 = (asbt)hftp1.b_message;
            asbt17.b |= 0x200;
            asbt17.m = s4;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            arin.a.g("Exception while getting GmsCore version number.", packageManager$NameNotFoundException0, new Object[0]);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbt asbt18 = (asbt)hftp1.b_message;
            asbt18.b |= 0x100;
            asbt18.l = -1;
        }
        if(hkyf0 != null) {
            ByteString hfsf0 = hkyf0.getDefaultInstanceForType();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbt asbt19 = (asbt)hftp1.b_message;
            asbt19.b |= 0x1000;
            asbt19.p = hfsf0;
        }
        if(z) {
            int v6 = arei.a(this.b);
            int v7 = arei.d(this.d);
            int v8 = arei.c(this.b);
            int v9 = arei.b(this.b);
            int v10 = arei.e(this.d);
            switch(v6) {
                case 3: {
                    z12 = false;
                    break;
                }
                case 4: {
                    z12 = true;
                    break;
                }
                default: {
                    goto label_194;
                }
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbt asbt20 = (asbt)hftp1.b_message;
            asbt20.b |= 0x200000;
            asbt20.y = z12;
        label_194:
            switch(v7) {
                case 3: {
                    z13 = false;
                    break;
                }
                case 4: {
                    z13 = true;
                    break;
                }
                default: {
                    goto label_204;
                }
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbt asbt21 = (asbt)hftp1.b_message;
            asbt21.b |= 0x40000;
            asbt21.v = z13;
        label_204:
            switch(v8) {
                case 3: {
                    z14 = false;
                    break;
                }
                case 4: {
                    z14 = true;
                    break;
                }
                default: {
                    goto label_214;
                }
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbt asbt22 = (asbt)hftp1.b_message;
            asbt22.b |= 0x100000;
            asbt22.x = z14;
        label_214:
            switch(v9) {
                case 3: {
                    z15 = false;
                    break;
                }
                case 4: {
                    z15 = true;
                    break;
                }
                default: {
                    goto label_224;
                }
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbt asbt23 = (asbt)hftp1.b_message;
            asbt23.b |= 0x80000;
            asbt23.w = z15;
        label_224:
            switch(v10) {
                case 3: {
                    z1 = false;
                    break;
                }
                case 4: {
                    break;
                }
                default: {
                    goto label_232;
                }
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbt asbt24 = (asbt)hftp1.b_message;
            asbt24.b |= 0x20000;
            asbt24.u = z1;
        }
    label_232:
        hqhq hqhq0 = hqhq.a;
        if(hqhq0.j().aL()) {
            ArrayList arrayList0 = ggia.d(new String[]{Environment.DIRECTORY_DCIM, Environment.DIRECTORY_PICTURES, Environment.DIRECTORY_MOVIES});
            int v11 = arrayList0.size();
            long v12 = 0L;
            for(int v1 = 0; v1 < v11; ++v1) {
                v12 += arin.n(Environment.getExternalStoragePublicDirectory(((String)arrayList0.get(v1))));
            }
            arin.a.h("Size computed to be: %s, rounded to %s mb", new Object[]{v12, ((int)(v12 / 0x100000L))});
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbt asbt25 = (asbt)hftp1.b_message;
            asbt25.b |= 0x800000;
            asbt25.A = (int)(v12 / 0x100000L);
        }
        if(((Boolean)this.f.mr()).booleanValue() && z) {
            hfuf hfuf0 = hqnd.a.c().j().b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbt asbt26 = (asbt)hftp1.b_message;
            hfuf hfuf1 = asbt26.B;
            if(!hfuf1.c()) {
                asbt26.B = ProtoLiteMessage.C(hfuf1);
            }
            hfrj.E(hfuf0, asbt26.B);
        }
        if(hqhq0.j().X()) {
            long v13 = bbmq.d(this.b);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asbt asbt27 = (asbt)hftp1.b_message;
            asbt27.b |= 0x2000000;
            asbt27.D = v13;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asci asci1 = (asci)hftp0.b_message;
        asbt asbt28 = (asbt)hftp1.N_build();
        asbt28.getClass();
        asci1.e = asbt28;
        asci1.b |= 4;
        this.f(((asci)hftp0.N_build()));
    }

    public final void f(asci asci0) {
        asch asch0 = asch.b(asci0.c) == null ? asch.a : asch.b(asci0.c);
        arin.a.d("Sending packet of type: %s", new Object[]{asch0});
        this.e.n(asci0.toBytesArray());
    }

    public final void g(MessageLite hfvm0) {
        this.i(hfvm0.getDefaultInstanceForType().newInput());
    }

    public void h(ascm ascm0, ascj ascj0) {
        throw null;
    }

    protected final void i(InputStream inputStream0) {
        this.e.p(inputStream0, new arib(this));
    }

    final void j(arkq arkq0) {
        synchronized(this) {
            batl.n(((boolean)(this.p.containsKey(arkq0.d) ^ 1)), "Unable to set stream expectation for %s - it was not null!", new Object[]{arkq0.d.name()});
            this.p.put(arkq0.d, arkq0);
        }
    }

    public static ascj k(int v, int v1, String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ascj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ascj)hftv0).b |= 1;
        ((ascj)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((ascj)hftv1).b |= 4;
        ((ascj)hftv1).e = v1 - 1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ascj ascj0 = (ascj)hftp0.b_message;
        ascj0.b |= 2;
        ascj0.d = s;
        return (ascj)hftp0.N_build();
    }

    public abstract void l(int arg1, String arg2, boolean arg3);

    public static final asci m(asch asch0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asci.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((asci)hftp0.b_message).c = asch0.y;
        ((asci)hftp0.b_message).b |= 1;
        return (asci)hftp0.N_build();
    }

    private static long n(File file0) {
        long v = 0L;
        if(file0 != null && file0.exists()) {
            if(file0.isDirectory()) {
                File[] arr_file = file0.listFiles();
                if(arr_file != null) {
                    for(int v1 = 0; v1 < arr_file.length; ++v1) {
                        v += arin.n(arr_file[v1]);
                    }
                }
                return v;
            }
            return file0.length();
        }
        return 0L;
    }
}

