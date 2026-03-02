import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import dagger.internal.Preconditions;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class dvlu implements dnqb {
    public static final String a = "EXTRA_VALUABLE_ID";
    public static final String b = "ACCOUNT_NAME";
    public dvlt c;
    public dvgv d;
    private static final bboh e;

    static {
        dvlu.e = bboh.b("Pay", bbcu.cZ);
    }

    @Override  // dnqb
    public final int a(cllr cllr0, Context context0) {
        String s3;
        if(!ibuq.m(cllr0.a, "imagemigration.oneoff")) {
            ((ggtj)dvlu.e.j()).x("Bad task tag received");
            return 2;
        }
        Bundle bundle0 = cllr0.b;
        if(bundle0 != null) {
            String s = dvlu.b;
            if(bundle0.containsKey(s)) {
                String s1 = dvlu.a;
                if(bundle0.containsKey(s1)) {
                    String s2 = bundle0.getString(s);
                    try {
                        s3 = acso.e(context0, s2);
                        ibuq.c(s3);
                    }
                    catch(acse acse0) {
                        a.ae(dvlu.e.j(), "Failed to fetch account ID, unable to migrate the image.", acse0);
                        return 2;
                    }
                    catch(IOException iOException0) {
                        a.ae(dvlu.e.j(), "Failed to fetch account ID, unable to migrate the image.", iOException0);
                        return 2;
                    }
                    Context context1 = AppContextProvider.a();
                    ibuq.e(context1, "getApplicationContext(...)");
                    if(s2 == null) {
                        s2 = "";
                    }
                    dola dola0 = dlmg.a(context1, s2, s3);
                    edop edop0 = new edop();
                    domv domv0 = domu.a(AppContextProvider.a());
                    Preconditions.b(domv0);
                    new dvln(dola0, edop0, domv0).inject(this);
                    String[] arr_s = bundle0.getStringArray(s1);
                    if(arr_s != null && arr_s.length != 0) {
                        Iterator iterator0 = ibug.a(arr_s);
                        while(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            String s4 = (String)object0;
                            try {
                                ibuq.c(s4);
                                dvlt dvlt0 = this.c;
                                dvgv dvgv0 = null;
                                if(dvlt0 == null) {
                                    ibuq.j("imageMigrationHelper");
                                    dvlt0 = null;
                                }
                                ibuq.f(s4, "valuableId");
                                List list0 = dvlt0.b(s4);
                                List list1 = list0.isEmpty() ? ibps.a : ibpo.ao(list0, new dvls(s4));
                                ggdy ggdy0 = new ggdy();
                                for(Object object1: list1) {
                                    File file0 = (File)object1;
                                    gfsx gfsx0 = dvlt0.b.b(dvlt0.a, s4, file0);
                                    if(gfsx0.i()) {
                                        String s5 = dvlt0.a(file0);
                                        Object object2 = gfsx0.d();
                                        ggdy0.i(new Pair(s5, dvlt0.c.a(((byte[])object2), gjcw.d, s4)));
                                    }
                                }
                                gged_interceptors gged0 = ggdy0.h();
                                ibuq.e(gged0, "build(...)");
                                if(gged0.isEmpty()) {
                                    continue;
                                }
                                ggdy ggdy1 = new ggdy();
                                ggqk ggqk0 = gged0.E();
                                ibuq.e(ggqk0, "iterator(...)");
                                while(ggqk0.hasNext()) {
                                    Pair pair0 = (Pair)ggqk0.next();
                                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvco.a).v_newBuilder();
                                    ibuq.f(hftp0, "builder");
                                    Object object3 = pair0.first;
                                    ibuq.e(object3, "first");
                                    String s6 = (String)object3;
                                    ibuq.f(s6, "value");
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    gvco gvco0 = (gvco)hftp0.b_message;
                                    s6.getClass();
                                    gvco0.c = s6;
                                    Object object4 = pair0.second;
                                    ibuq.e(object4, "second");
                                    String s7 = (String)object4;
                                    ibuq.f(s7, "value");
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    gvco gvco1 = (gvco)hftp0.b_message;
                                    s7.getClass();
                                    gvco1.b = s7;
                                    ProtoLiteMessage hftv0 = hftp0.N_build();
                                    ibuq.e(hftv0, "build(...)");
                                    ggdy1.i(((gvco)hftv0));
                                }
                                dvgv dvgv1 = this.d;
                                if(dvgv1 == null) {
                                    ibuq.j("valuableClient");
                                }
                                else {
                                    dvgv0 = dvgv1;
                                }
                                gged_interceptors gged1 = ggdy1.h();
                                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gvcp.a).v_newBuilder();
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ProtoLiteMessage hftv1 = hftp1.b_message;
                                s4.getClass();
                                ((gvcp)hftv1).b = s4;
                                if(!hftv1.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                gvcp gvcp0 = (gvcp)hftp1.b_message;
                                hfuo hfuo0 = gvcp0.c;
                                if(!hfuo0.c()) {
                                    gvcp0.c = ProtoLiteMessage.E(hfuo0);
                                }
                                hfrj.E(gged1, gvcp0.c);
                                gvcp gvcp1 = (gvcp)hftp1.N_build();
                                gvcq gvcq0 = (gvcq)dptv.e(dvgv0.d, dpuj.aQ, ((MessageLite)gvcp1), ((MessageLite)gvcq.a));
                            }
                            catch(dydz dydz0) {
                                a.e(dvlu.e.j(), "Failed to migrate images for %s", s4, dydz0);
                            }
                            catch(dpuk dpuk0) {
                                a.e(dvlu.e.j(), "Failed to migrate images for %s", s4, dpuk0);
                            }
                            catch(IOException iOException1) {
                                a.e(dvlu.e.j(), "Failed to migrate images for %s", s4, iOException1);
                            }
                            catch(ExecutionException executionException0) {
                                a.e(dvlu.e.j(), "Failed to migrate images for %s", s4, executionException0);
                            }
                            catch(InterruptedException interruptedException0) {
                                a.e(dvlu.e.j(), "Failed to migrate images for %s", s4, interruptedException0);
                            }
                            catch(TimeoutException timeoutException0) {
                                a.e(dvlu.e.j(), "Failed to migrate images for %s", s4, timeoutException0);
                            }
                            catch(eaqz eaqz0) {
                                a.e(dvlu.e.j(), "Failed to migrate images for %s", s4, eaqz0);
                            }
                            catch(earn earn0) {
                                a.e(dvlu.e.j(), "Failed to migrate images for %s", s4, earn0);
                            }
                            catch(dmhl dmhl0) {
                                a.e(dvlu.e.j(), "Failed to migrate images for %s", s4, dmhl0);
                            }
                        }
                        return 0;
                    }
                    ((ggtj)dvlu.e.j()).x("Failed to fetch valuable ID, unable to migrate the image.");
                    return 2;
                }
            }
        }
        ((ggtj)dvlu.e.j()).x("No extras found in the task params. Unable to proceed with the image migration.");
        return 2;
    }

    @Override  // dnqb
    public final void b(Context context0) {
        ibuq.f(context0, "context");
    }
}

