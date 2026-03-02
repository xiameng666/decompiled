import android.content.ContentProviderOperation;
import android.content.ContentUris;
import java.util.ArrayList;

final class ejwp {
    public static final int a;

    static {
        bboh.b("RemindersSync", bbcu.s);
    }

    public static final ContentProviderOperation a(long v, ejth ejth0) {
        return ContentProviderOperation.newUpdate(ContentUris.withAppendedId(ejtu.a, ejth0.a)).withValue("storage_version", Long.valueOf(v)).build();
    }

    public static final boolean b(ejwt ejwt0, baqr baqr0, ejth ejth0, ejwq ejwq0) {
        geea geea0 = null;
        Long long0 = null;
        for(boolean z = true; true; z = false) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geey.a).v_newBuilder();
            if(ejwq0.d() != null) {
                gefz gefz0 = ejwq0.d();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                geey geey0 = (geey)hftp0.b_message;
                gefz0.getClass();
                geey0.c = gefz0;
                geey0.b |= 1;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geey.b(((geey)hftp0.b_message));
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gefn.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gefn)hftp1.b_message).c = 2;
            ((gefn)hftp1.b_message).b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geey geey1 = (geey)hftp0.b_message;
            gefn gefn0 = (gefn)hftp1.N_build();
            gefn0.getClass();
            geey1.e = gefn0;
            geey1.b |= 0x100000;
            if(geea0 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((geey)hftp0.b_message).f = geea0;
                ((geey)hftp0.b_message).b |= 0x800000;
            }
            geez geez0 = new ejwt(ejwt0, cmlp.a, cktx.b).c(baqr0, ((geey)hftp0.N_build()));
            if(z) {
                long0 = (geez0.b & 4) == 0 ? null : ((long)geez0.e);
            }
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: geez0.c) {
                arrayList0.add(ejwq0.c(((gefy)object0)));
            }
            boolean z1 = ejwq0.e(arrayList0);
            if((geez0.b & 2) == 0) {
                geea0 = null;
            }
            else {
                geea geea1 = geez0.d;
                geea0 = geea1 == null ? geea.a : geea1;
            }
            if(!z1) {
                return false;
            }
            if(geea0 == null) {
                break;
            }
        }
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(ejwp.a(long0.longValue(), ejth0));
        arrayList1.add(ejwq0.a());
        return ejwq0.e(arrayList1);
    }
}

