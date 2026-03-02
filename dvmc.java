import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.util.Pair;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.GenericCard;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;

public final class dvmc {
    private static final bboh a;
    private final String b;
    private final dvma c;
    private final dvlr d;
    private final String e;
    private final dmkp f;
    private final Context g;
    private final Uri h;

    static {
        dvmc.a = bboh.b("Pay", bbcu.cZ);
    }

    public dvmc(String s, dvma dvma0, dvlr dvlr0, String s1, dmkp dmkp0, Context context0) {
        this.b = s;
        this.c = dvma0;
        this.d = dvlr0;
        this.e = s1;
        this.f = dmkp0;
        this.g = context0;
        String s2 = hwkt.a.g().n();
        Uri uri0 = Uri.parse(dmgv.c(s1, 1)).buildUpon().path(s2).build();
        ibuq.e(uri0, "build(...)");
        this.h = uri0;
    }

    public final void a(Valuable valuable0) {
        int v7;
        String s5;
        byte[] arr_b;
        Integer integer0;
        ibuq.f(valuable0, "valuable");
        if(dvma.k(valuable0)) {
            ggdy ggdy0 = new ggdy();
            ggqk ggqk0 = ((GenericCard)valuable0).K.E();
            ibuq.e(ggqk0, "iterator(...)");
            while(ggqk0.hasNext()) {
                ggdy0.i(((gvcn)ggqk0.next()).b);
            }
            String s = ((GenericCard)valuable0).b;
            ibuq.e(s, "id");
            gged_interceptors gged0 = ggdy0.h();
            ibuq.e(gged0, "build(...)");
            ibuq.f(s, "valuableId");
            ibuq.f(gged0, "attachmentIds");
            if(dvma.i()) {
                Context context0 = this.g;
                ggfp ggfp0 = ggnj.a;
                ibuq.e(ggfp0, "of(...)");
                File file0 = this.c.e(s, context0);
                String[] arr_s = file0.list();
                if(file0.exists() && arr_s != null && arr_s.length != 0) {
                    ggfn ggfn0 = new ggfn();
                    for(int v = 0; v < arr_s.length; ++v) {
                        String s1 = arr_s[v];
                        ibuq.c(s1);
                        List list0 = gfud.g("_").c(2).n(s1);
                        ibuq.e(list0, "splitToList(...)");
                        if(list0.size() > 1) {
                            ggfn0.i(list0.get(1));
                        }
                    }
                    ggfp0 = ggfn0.h();
                    ibuq.e(ggfp0, "build(...)");
                }
                ggdy ggdy1 = new ggdy();
                int v1 = ((ggna)gged0).c;
                for(int v2 = 0; v2 < v1; ++v2) {
                    if(!ggfp0.contains(gged0.get(v2))) {
                        ggdy1.i(new Pair(gged0.get(v2), v2));
                    }
                }
                gged_interceptors gged1 = ggdy1.h();
                ibuq.e(gged1, "build(...)");
                int v3 = ((ggna)gged1).c;
                int v4 = 0;
                while(true) {
                    if(v4 >= v3) {
                        return;
                    }
                    Pair pair0 = (Pair)gged1.get(v4);
                    Object object0 = ((Pair)gged1.get(v4)).first;
                    ibuq.e(object0, "first");
                    String s2 = (String)object0;
                    Object object1 = ((Pair)gged1.get(v4)).second;
                    ibuq.e(object1, "second");
                    int v5 = ((Number)object1).intValue();
                    if(!dvma.i()) {
                        throw new dvfx();
                    }
                    ibuq.f(s2, "attachmentId");
                    ibuq.f(s, "valuableId");
                    Object object2 = context0.getSystemService("connectivity");
                    ibuq.d(object2, "null cannot be cast to non-null type android.net.ConnectivityManager");
                    ConnectivityManager connectivityManager0 = (ConnectivityManager)object2;
                    Network network0 = connectivityManager0.getActiveNetwork();
                    if(network0 != null) {
                        try {
                            NetworkCapabilities networkCapabilities0 = connectivityManager0.getNetworkCapabilities(network0);
                            if(networkCapabilities0 != null) {
                                integer0 = networkCapabilities0.getLinkDownstreamBandwidthKbps();
                                goto label_69;
                            }
                        }
                        catch(SecurityException securityException0) {
                            a.ae(dvmc.a.j(), "Fail to retrieve the network capability", securityException0);
                        }
                    }
                    integer0 = null;
                label_69:
                    String s3 = this.h.buildUpon().appendQueryParameter("attachmentId", s2).appendQueryParameter("valuableId", s).build().toString();
                    ibuq.e(s3, "toString(...)");
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    try {
                        long v6 = glxd.b(hwkt.e(), 0L, hwkt.e());
                        Account account0 = new Account(this.b, "com.google");
                        String s4 = dlnx.b(this.g, account0, dmgv.b(this.e));
                        ibuq.e(s4, "getTokenBlocking(...)");
                        this.f.d(s3, byteArrayOutputStream0, this.g, v6, 0x5200, s4);
                        arr_b = byteArrayOutputStream0.toByteArray();
                        s5 = s;
                        ibuq.e(arr_b, "toByteArray(...)");
                        v7 = arr_b.length;
                        s5 = s;
                        goto label_95;
                    }
                    catch(dvfx dvfx0) {
                        s5 = s;
                        this.b(dvfx0, s2, s5, integer0);
                    }
                    catch(eaqz eaqz0) {
                        s5 = s;
                        this.b(eaqz0, s2, s5, integer0);
                    }
                    catch(earn earn0) {
                        s5 = s;
                        this.b(earn0, s2, s5, integer0);
                    }
                    catch(IOException iOException0) {
                        s5 = s;
                        goto label_108;
                        try {
                        label_95:
                            Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, v7);
                            this.d.b(bitmap0, gjcw.c, gjcy.b, Integer.valueOf(v7), s5, integer0);
                            goto label_113;
                        }
                        catch(dvfx dvfx0) {
                        }
                        catch(eaqz eaqz0) {
                            this.b(eaqz0, s2, s5, integer0);
                            goto label_112;
                        }
                        catch(earn earn0) {
                            this.b(earn0, s2, s5, integer0);
                            goto label_112;
                        }
                        catch(IOException iOException0) {
                            goto label_108;
                        }
                        catch(dmhl dmhl0) {
                            goto label_111;
                        }
                        this.b(dvfx0, s2, s5, integer0);
                        goto label_112;
                    label_108:
                        this.b(iOException0, s2, s5, integer0);
                    }
                    catch(dmhl dmhl0) {
                    label_111:
                        this.b(dmhl0, s2, s5, integer0);
                    }
                label_112:
                    arr_b = null;
                label_113:
                    if(arr_b != null) {
                        Bitmap bitmap1 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
                        this.c.g(s5, v5, s2, bitmap1, context0);
                        s5 = s5;
                    }
                    ++v4;
                    s = s5;
                    continue;
                }
            }
            throw new dvfx();
        }
    }

    private final void b(Exception exception0, String s, String s1, Integer integer0) {
        this.d.b(null, gjcw.c, ((exception0.getCause() instanceof TimeoutException) ? gjcy.d : gjcy.c), null, s1, integer0);
        ((ggtj)((ggtj)dvmc.a.i()).s(exception0)).R("Failed to download attachments %s for valuable %s", s, s1);
    }
}

