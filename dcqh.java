import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.ExecutorService;

public final class dcqh {
    public final Context a;
    public bbvk b;
    private final ExecutorService c;

    public dcqh(Context context0) {
        this.a = context0;
        this.c = cuui.b();
    }

    public final List a() {
        Context context0 = this.a;
        dbxb dbxb0 = (dbxb)cuuc.f("getCachedVerifiedPhoneNumber", dcqh.e(context0).a());
        if(dbxb0 == null) {
            dbxb0 = dbxb.a;
        }
        if(System.currentTimeMillis() - dbxb0.d <= hvqs.ak() && !dbxb0.c.isEmpty()) {
            dcvz.a.b().p("Retrieved cached verified phone numbers.", new Object[0]);
            return dbxb0.c;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("policy_id", "nearbysharing");
        List list0 = (List)cuuc.h("getFreshPhoneNumbers", jqy.a(new dcqg(this, bundle0)), hvqs.a.aT().aI());
        if(list0 != null) {
            long v = System.currentTimeMillis();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dbxb.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbxb dbxb1 = (dbxb)hftp0.b_message;
            hfuo hfuo0 = dbxb1.c;
            if(!hfuo0.c()) {
                dbxb1.c = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(list0, dbxb1.c);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbxb dbxb2 = (dbxb)hftp0.b_message;
            dbxb2.b |= 1;
            dbxb2.d = v;
            dbxb dbxb3 = (dbxb)hftp0.N_build();
            cuuc.h("cacheVerifiedPhoneNumber", dcqh.e(context0).b(new dcqc(dbxb3), gmap.a), hvqs.ag());
        }
        return list0;
    }

    public final void b() {
        cuuc.h("clearCachedVerifiedPhoneNumber", dcqh.e(this.a).b(new dcqb(), gmap.a), hvqs.ag());
    }

    public final void c() {
        this.c.shutdown();
        dcvz.a.b().p("ConstellationClient has been shutdown.", new Object[0]);
    }

    public final void d() {
        dcqd dcqd0 = new dcqd(this);
        this.c.execute(dcqd0);
    }

    private static frli e(Context context0) {
        frce frce0 = new frce(context0);
        frce0.d("nearby");
        frce0.e("sharing.clients.ConstellationClient.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)dbxb.a));
        frif frif0 = frie0.a();
        return cjtb.a.a(frif0);
    }
}

