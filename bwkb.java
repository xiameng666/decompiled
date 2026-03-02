import com.google.android.gms.icing.nativeindex.NativeIndex;

public final class bwkb {
    static void a(NativeIndex nativeIndex0, bwor bwor0, bxgk bxgk0, bwka bwka0) {
        if(NativeIndex.nativeAddUsageReport(nativeIndex0.b, bwor0.toBytesArray())) {
            ++bwka0.a;
            bxgk0.b("usage report");
            return;
        }
        ++bwka0.b;
        bxgk0.b("failed usage report");
    }
}

