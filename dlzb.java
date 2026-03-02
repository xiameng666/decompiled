import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Deprecated
public final class dlzb implements dmba {
    private static final bboh a;
    private final bavt b;
    private final cqxc c;

    static {
        dlzb.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlzb(bavt bavt0, cqxc cqxc0) {
        this.b = bavt0;
        this.c = cqxc0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        Object object0;
        gfsx gfsx0;
        int v = hjwe0.b;
        if(v == 25) {
            gfsx0 = gfsx.m(gtvs.i);
        }
        else if(v == 24) {
            gfsx0 = gfsx.m(gtvs.h);
        }
        else {
            gfsx0 = gfqx.a;
        }
        if(!gfsx0.i()) {
            ((ggtj)dlzb.a.i()).x("Cannot evaluate: does not have an mDL status filter");
            return false;
        }
        if(hwly.l()) {
            try {
                if(!((Boolean)evrg.o(dtzb.b(this.b), 10L, TimeUnit.SECONDS)).booleanValue()) {
                    ((ggtj)dlzb.a.h()).x("Mdocstore module not installed, not checking mdl status.");
                    return false;
                }
            }
            catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                a.ae(dlzb.a.j(), "Exception checking for mdocstore module when loading bulletins. Continuing.", exception0);
            }
        }
        try {
            object0 = ((gftm)gfsx.m(((gtxe)evrg.o(this.c.l(), 2L, TimeUnit.SECONDS)).b)).a;
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception1) {
            a.ae(dlzb.a.h(), "Not showing because of mDL fetch exception", exception1);
            return false;
        }
        if(((List)object0).isEmpty()) {
            return false;
        }
        gged_interceptors gged0 = gged_interceptors.i(((Collection)object0));
        Object object1 = gfsx0.d();
        int v1 = gged0.size();
        int v2 = 0;
        while(v2 < v1) {
            gtxg gtxg0 = (gtxg)gged0.get(v2);
            if((gtxf.b(gtxg0.h) == null ? gtxf.f : gtxf.b(gtxg0.h)) != gtxf.a) {
                break;
            }
            gtvs gtvs0 = gtvs.b(dtnn.c(gtxg0.f.toByteArray()).c);
            if(gtvs0 == null) {
                gtvs0 = gtvs.m;
            }
            ++v2;
            if(gtvs0 == object1) {
                ((ggtj)dlzb.a.h()).B("Showing because the user still has an mDL in the %s state", object1);
                return true;
            }
        }
        return false;
    }
}

