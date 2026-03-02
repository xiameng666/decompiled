import com.google.android.gms.nearby.fastpair.service.FastPairChimeraService;
import java.io.PrintWriter;
import java.util.List;

public final class cysg implements bbnw {
    public final FastPairChimeraService a;

    public cysg(FastPairChimeraService fastPairChimeraService0) {
        this.a = fastPairChimeraService0;
    }

    @Override  // bbnw
    public final void a(PrintWriter printWriter0, String[] arr_s) {
        printWriter0.println();
        printWriter0.println("FastPairChimeraService");
        printWriter0.println("Flags:");
        printWriter0.printf("  enableApiForWearOs=%s\n", new Object[]{Boolean.valueOf(hvpp.D())});
        printWriter0.printf("  enableWearablePeripheralApi=%s\n", new Object[]{Boolean.valueOf(hvpp.aH())});
        printWriter0.printf("  enableSassApi=%s\n", new Object[]{Boolean.valueOf(hvpp.al())});
        printWriter0.printf("  enableValidatorConnectionApi=%s\n", new Object[]{Boolean.valueOf(hvpp.aB())});
        printWriter0.println();
        printWriter0.println("PeripheralCallbackManager");
        cysk cysk0 = this.a.a;
        printWriter0.printf("  registered callback count %s\n", new Object[]{cysk0.e.size()});
        int v = 0;
        printWriter0.printf("  last connected peripherals count %d\n", new Object[]{((int)(cysk0.f == null ? 0 : cysk0.f.size()))});
        List list0 = cysk0.f;
        if(list0 != null) {
            for(Object object0: list0) {
                printWriter0.printf("    %s\n", new Object[]{cyus.i(((cyxd)object0))});
            }
        }
        List list1 = cysk0.g;
        if(list1 != null) {
            v = list1.size();
        }
        printWriter0.printf("  last active peripherals count %d\n", new Object[]{v});
        List list2 = cysk0.g;
        if(list2 != null) {
            for(Object object1: list2) {
                printWriter0.printf("    %s\n", new Object[]{cyus.i(((cyxd)object1))});
            }
        }
    }
}

