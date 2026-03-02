import android.content.Context;
import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;
import com.google.android.gms.personalsafety.detection.FinderTagInfo;
import j..time.Duration;
import java.io.ByteArrayOutputStream;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

public final class ehwi {
    public final HashMap a;
    public final Map b;
    public final gfvb c;
    public final gfvb d;
    public final Executor e;
    public final eicb f;
    public final ArrayDeque g;
    private static ehwi h;
    private final eiiq i;

    public ehwi(Executor executor0, eicb eicb0, eiiq eiiq0) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.g = new ArrayDeque();
        this.e = executor0;
        this.f = eicb0;
        this.i = eiiq0;
        gfvh gfvh0 = new gfvh();
        gfvh0.m(Duration.ofSeconds(3600L));
        gfvh0.h(100L);
        this.c = gfvh0.b();
        gfvh gfvh1 = new gfvh();
        gfvh1.m(Duration.ofSeconds(3600L));
        gfvh1.h(100L);
        this.d = gfvh1.b();
    }

    public static ehwi a(Context context0) {
        Context context1 = context0.getApplicationContext();
        if(ehwi.h == null) {
            bblp bblp0 = new bblp(0x7FFFFFFF, 9);
            if(ehwa.a == null) {
                ehwa.a = new ehwa();
            }
            ehwi.h = new ehwi(bblp0, eicb.a(context1), new eiiq());
        }
        return ehwi.h;
    }

    public final gmcd b(String s) {
        gmcd gmcd0;
        if(gfta.c(s)) {
            return gmbu.h(new IllegalArgumentException("macAddress is null or empty"));
        }
        FinderTagInfo finderTagInfo0 = (FinderTagInfo)this.c.d(s);
        if(finderTagInfo0 != null) {
            return gmbu.i(finderTagInfo0);
        }
        HashMap hashMap0 = this.a;
        synchronized(hashMap0) {
            if(hashMap0.containsKey(s)) {
                return (gmcd)hashMap0.get(s);
            }
            goto label_14;
        }
        return (gmcd)hashMap0.get(s);
    label_14:
        gwhg gwhg0 = (gwhg)this.d.d(s);
        if(gwhg0 != null) {
            String s1 = "DeviceData cache hit for: " + eice.c(s);
            eica.a(this.g, s1);
            return glzd.g(gmbu.i(gwhg0), new ehwc(this, s), this.e);
        }
        Map map0 = this.b;
        synchronized(map0) {
            if(map0.containsKey(s)) {
                String s2 = eice.c(s);
                eica.a(this.g, "DeviceData fetch from tag already in progress for: " + s2);
                gmcd0 = (gmcd)map0.get(s);
                return glzd.g(gmcd0, new ehwc(this, s), this.e);
            }
            String s3 = eice.c(s);
            eica.a(this.g, "Initiating tag read for: " + s3);
            gmcd0 = glzd.g(this.i.a(s), new ehwd(this, s), this.e);
            map0.put(s, gmcd0);
            gmbu.t(gmcd0, new ehwg(this, s), this.e);
        }
        return glzd.g(gmcd0, new ehwc(this, s), this.e);
    }

    public final gmcd c(String s, String s1) {
        gmcd gmcd0;
        if(gfta.c(s1)) {
            return gmbu.h(new NullPointerException("Cannot fetch Dult info because productData is null or empty, likely resulting from a bad advertisement"));
        }
        FinderTagInfo finderTagInfo0 = (FinderTagInfo)this.c.d(s);
        if(finderTagInfo0 != null) {
            String s2 = "Server FinderTagInfo cache hit for: " + eice.c(s);
            eica.a(this.g, s2);
            return gmbu.i(finderTagInfo0);
        }
        HashMap hashMap0 = this.a;
        if(hashMap0.containsKey(s)) {
            return (gmcd)hashMap0.get(s);
        }
        this.f.g(gwni.e);
        String s3 = "Fetch call for:" + eice.c(s);
        eica.b(this.g, s3);
        String s4 = gfqz.c(s1);
        Executor executor0 = this.e;
        if(s4 != null && s4.length() == 16) {
            clbs clbs0 = clbv.a(AppContextProvider.a());
            ehvy ehvy0 = new ehvy(new ByteArrayOutputStream());
            clbc clbc0 = new clbc(null);
            clbc0.c(hrtd.a.I().aq());
            clcj clcj0 = clbs0.e(clcg.a(new clbd(clbc0), cktc.b), ehvy0, executor0, -1, 0xD10D7912);
            clcj0.n("POST");
            claw claw0 = new claw(null);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eict.a).v_newBuilder();
            String s5 = Locale.getDefault().toLanguageTag();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            eict eict0 = (eict)hftp0.b_message;
            s5.getClass();
            hfuo hfuo0 = eict0.b;
            if(!hfuo0.c()) {
                eict0.b = ProtoLiteMessage.E(hfuo0);
            }
            eict0.b.add(s5);
            eict eict1 = (eict)hftp0.N_build();
            AppContextProvider.a();
            claw0.b(((MessageLite)eict1), cktc.d, eicu.a);
            claw0.a("Accept", " application/json");
            claw0.a("Content-Type", "application/x-www-form-urlencoded");
            claw0.a("X-GFE-SSL", "yes");
            clcj0.m(new clax(claw0));
            Context context0 = AppContextProvider.a();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwgs.a).v_newBuilder();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwgr.a).v_newBuilder();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gwgq.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp3.b_message;
            ((gwgq)hftv0).b |= 1;
            ((gwgq)hftv0).c = "1.0.0";
            if(!hftv0.isImmutable()) {
                hftp3.ensureMutable();
            }
            gwgq gwgq0 = (gwgq)hftp3.b_message;
            gwgq0.b |= 2;
            gwgq0.d = 1;
            gwgq gwgq1 = (gwgq)hftp3.N_build();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp2.b_message;
            gwgq1.getClass();
            ((gwgr)hftv1).c = gwgq1;
            ((gwgr)hftv1).b |= 1;
            if(!hftv1.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp2.b_message;
            ((gwgr)hftv2).b |= 2;
            ((gwgr)hftv2).d = "1";
            if(!hftv2.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwgr gwgr0 = (gwgr)hftp2.b_message;
            gwgr0.b |= 4;
            gwgr0.e = s4;
            gwgr gwgr1 = (gwgr)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwgs gwgs0 = (gwgs)hftp1.b_message;
            gwgr1.getClass();
            hfuo hfuo1 = gwgs0.b;
            if(!hfuo1.c()) {
                gwgs0.b = ProtoLiteMessage.E(hfuo1);
            }
            gwgs0.b.add(gwgr1);
            clcj0.p(context0, ((MessageLite)(((gwgs)hftp1.N_build()))), cktc.c, ehwa.b);
            gmcd0 = glzd.f(clcj0.e().a(), new ehvx(ehvy0), executor0);
        }
        else {
            gmcd0 = gmbu.h(new IllegalArgumentException("Invalid productData: " + s4));
        }
        gmcd gmcd1 = glzd.f(gmcd0, new ehwe(s), executor0);
        hashMap0.put(s, gmcd1);
        gmbu.t(gmcd1, new ehwf(this, s), executor0);
        return gmcd1;
    }

    public final Map d() {
        return ((gfwl)this.c).a;
    }
}

