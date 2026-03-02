import android.accounts.Account;
import j..util.DesugarCollections;

public final class cbxp implements fktx {
    @Override  // fktx
    public final gmcd a() {
        cbyf cbyf0 = cbyf.a();
        if(huln.h() && huln.i()) {
            gfsx gfsx0 = cbxc.b();
            if(gfsx0.i()) {
                ggfq ggfq0 = new ggfq();
                Account[] arr_account = (Account[])gfsx0.d();
                for(int v = 0; v < arr_account.length; ++v) {
                    Account account0 = arr_account[v];
                    gqhc gqhc0 = cbyf0.g(account0.name);
                    for(Object object0: DesugarCollections.unmodifiableList(((gqhd)gqhc0.b_message).b)) {
                        ggfq0.b(((gqhv)object0).c, ((gqhv)object0));
                    }
                    String s = account0.name;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqhf.a).v_newBuilder();
                    boolean z = ((gqhd)gqhc0.b_message).c;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((gqhf)hftv0).b = z;
                    long v1 = ((gqhd)gqhc0.b_message).d;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gqhf)hftp0.b_message).c = v1;
                    cbyf0.n(s, ((gqhf)hftp0.N_build()));
                }
                ggft ggft0 = ggfq0.a();
                ggqj ggqj0 = ggft0.r().om();
                while(ggqj0.hasNext()) {
                    Object object1 = ggqj0.next();
                    String s1 = (String)object1;
                    ggfp ggfp0 = ggft0.e(s1);
                    if(ggfp0.size() > 1) {
                        ((ggtj)cbyf.a.j()).B("Found differing language settings for application %s", s1);
                    }
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqhe.a).v_newBuilder();
                    gqhv gqhv0 = (gqhv)ggfp0.om().next();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gqhe gqhe0 = (gqhe)hftp1.b_message;
                    gqhv0.getClass();
                    gqhe0.c = gqhv0;
                    gqhe0.b |= 1;
                    cbyf0.o(s1, ((gqhe)hftp1.N_build()));
                }
            }
        }
        return gmbx.a;
    }
}

