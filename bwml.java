import android.content.Context;
import android.content.res.Resources;
import j..util.Objects;
import java.util.List;
import java.util.Set;

public final class bwml extends bwzp {
    final String a;
    final bwmx b;

    public bwml(bwmx bwmx0, gltq gltq0, String s) {
        this.a = s;
        Objects.requireNonNull(bwmx0);
        this.b = bwmx0;
        super(gltq0);
    }

    @Override  // bwzp
    public final void w() {
        bwmx bwmx0 = this.b;
        Context context0 = bwmx0.b;
        String s = context0.getResources().getConfiguration().locale.getLanguage();
        if(this.a.equals(s)) {
            bwmx0.c.c(2);
            bwuc bwuc0 = bwmx0.l;
            if(bwuc0 == null) {
                bwne.f("Null \'clients\', can\'t retrieve corpus clients");
                return;
            }
            Set set0 = bwuc0.k();
            bwur bwur0 = bwmx0.e();
            for(Object object0: set0) {
                bwua bwua0 = (bwua)object0;
                Resources resources0 = bwua0.d();
                if(resources0 == null) {
                    bwne.g("Can\'t get resources for package: %s", bwua0.b);
                }
                else {
                    for(Object object1: bwua0.i()) {
                        bwuw bwuw0 = bwur0.k(((bwvl)object1));
                        if(bwuw0 != null) {
                            bwnr bwnr0 = (bwnr)bwuw0.e();
                            bwny bwny0 = bwnr0.d == null ? bwny.a : bwnr0.d;
                            if(bwnx.a(bwny0.d) == 0 || bwnx.a(bwny0.d) == 1) {
                                bwnq bwnq0 = bwnr0.c == null ? bwnq.a : bwnr0.c;
                                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwnq0).jf(5, null);
                                hftp0.X(((ProtoLiteMessage)bwnq0));
                                bwnp bwnp0 = (bwnp)hftp0;
                                if(!(bwnr0.c == null ? bwnq.a : bwnr0.c).l.isEmpty()) {
                                    bwnq bwnq1 = bwnr0.c;
                                    bwnq bwnq2 = bwnq1 == null ? bwnq.a : bwnq1;
                                    if(bwnq1 == null) {
                                        bwnq1 = bwnq.a;
                                    }
                                    bwvy bwvy0 = new bwvy(bwnq2, (bwsa.i(bwnq1.d) ? context0.getResources() : resources0));
                                    try {
                                        bwvy0.d();
                                        List list0 = bwvy0.c();
                                        if(!bwnp0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)bwnp0).ensureMutable();
                                        }
                                        ((bwnq)bwnp0.b_message).l = hfvv.a;
                                        if(list0 != null) {
                                            bwnp0.a(list0);
                                        }
                                    }
                                    catch(bwvp bwvp0) {
                                        bwne.h("Error while reparsing mapping for packageName = %s, corpusName = %s, error = %s", new Object[]{bwua0.b, (bwnr0.c == null ? bwnq.a : bwnr0.c).d, bwvp0.getMessage()});
                                        continue;
                                    }
                                    bwvl bwvl0 = new bwvl(bwua0.b, (bwnr0.c == null ? bwnq.a : bwnr0.c).d);
                                    try {
                                        bwur0.y(bwvl0, bwuw0.d(((bwnq)((ProtoLiteBuilder)bwnp0).N_build())));
                                    }
                                    catch(bwvo bwvo0) {
                                        bwne.j(bwvo0, "Failed to set corpus config on reparse", new Object[0]);
                                        bwmx0.r.d("reparse_sourcecheck_failed");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

