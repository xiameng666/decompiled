import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.List;

public final class devq {
    public static final Object a(dfeo dfeo0) {
        ibuq.f(dfeo0, "<this>");
        if((dfeo0 instanceof dfem)) {
            return null;
        }
        if((dfeo0 instanceof dfen)) {
            return ((dfen)dfeo0).a;
        }
        throw new ibnq();
    }

    public static final boolean b(dffz dffz0) {
        return (dffz0 instanceof dffl) || (dffz0 instanceof dffk) || (dffz0 instanceof dffn) || (dffz0 instanceof dffp) || (dffz0 instanceof dffw);
    }

    public static final boolean c(dffz dffz0) {
        ibuq.f(dffz0, "<this>");
        return (dffz0 instanceof dffo) || (dffz0 instanceof dffm) || (dffz0 instanceof dffu) || (dffz0 instanceof dffs) || (dffz0 instanceof dfft) || (dffz0 instanceof dffr) || (dffz0 instanceof dffy);
    }

    public static dffg d(ShareTarget shareTarget0, dffz dffz0, boolean z, List list0, int v) {
        dffz dffz1 = (v & 1) == 0 ? dffz0 : new dffq(null);
        List list1 = (v & 4) == 0 ? list0 : ibps.a;
        ibuq.f(shareTarget0, "<this>");
        ibuq.f(dffz1, "status");
        ibuq.f(list1, "previews");
        ibuq.e(shareTarget0.b, "getDeviceName(...)");
        return new dffg(shareTarget0.a, shareTarget0.d, shareTarget0.b, shareTarget0.c, shareTarget0.n, shareTarget0.f, shareTarget0.h, dffz1, ((boolean)(((v & 2) == 0 ? 1 : 0) & ((int)z))), list1, shareTarget0);
    }
}

