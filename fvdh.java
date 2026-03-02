import android.content.Context;
import android.net.Uri;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class fvdh implements ibnf {
    private static final bboh a;
    private final Context b;
    private final ibnf c;

    static {
        fvdh.a = bboh.a("MddGeofenceProvider");
    }

    public fvdh(Context context0, ibnf ibnf0) {
        this.b = context0;
        this.c = ibnf0;
    }

    private final List a() {
        List list1;
        ccsd ccsd0 = hrnt.f() ? new ccsd(new csnw(this.b)) : new csnw(this.b);
        frga[] arr_frga = new frga[1];
        arr_frga[0] = ccsd0;
        frbx frbx0 = new frbx(Arrays.asList(arr_frga));
        evql evql0 = new cpvn(this.b).f("location_bluesky_geofence");
        try {
            evrg.o(evql0, 1000L, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | TimeoutException | InterruptedException exception0) {
            throw new IOException(exception0);
        }
        List list0 = ((FileGroupResponse)evql0.j()).c;
        if(list0.isEmpty()) {
            throw new FileNotFoundException();
        }
        try(InputStream inputStream0 = (InputStream)frbx0.d(Uri.parse(((MddFile)list0.get(0)).b), new frfr())) {
            hfsl hfsl0 = hfsl.N(inputStream0);
            ProtoLiteMessage hftv0 = ((ProtoLiteMessage)fvdi.a).x_newMutableInstance();
            try {
                hfwc hfwc0 = hfvu.a.c(hftv0);
                hfwc0.l(hftv0, hfsm.p(hfsl0), hftc.a);
                hfwc0.g(hftv0);
            }
            catch(hfur hfur0) {
                if(hfur0.b) {
                    hfur0 = new hfur(hfur0);
                }
                hfur0.a = hftv0;
                throw hfur0;
            }
            catch(hfwr hfwr0) {
                hfur hfur1 = hfwr0.a();
                hfur1.a = hftv0;
                throw hfur1;
            }
            catch(IOException iOException0) {
                if((iOException0.getCause() instanceof hfur)) {
                    throw (hfur)iOException0.getCause();
                }
                hfur hfur2 = new hfur(iOException0);
                hfur2.a = hftv0;
                throw hfur2;
            }
            catch(RuntimeException runtimeException0) {
                if((runtimeException0.getCause() instanceof hfur)) {
                    throw (hfur)runtimeException0.getCause();
                }
                throw runtimeException0;
            }
            ProtoLiteMessage.P_makeImmutable(hftv0);
            int v1 = ((fvdi)hftv0).b.size();
            list1 = new ArrayList(v1);
            for(int v = 0; true; ++v) {
                if(v >= v1) {
                    break;
                }
                list1.add(fvdg.b(((fvdi)hftv0).b.d(v)));
            }
        }
        return list1;
    }

    @Override  // ibnf
    public final Object get() {
        try {
            return this.a();
        }
        catch(IOException unused_ex) {
            ((ggtj)fvdh.a.h()).x("MDD read failed, using default.");
            return ((fvde)this.c).a();
        }
    }
}

