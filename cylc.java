import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public final class cylc implements Runnable {
    public final cylw a;
    public final PrintWriter b;
    public final CountDownLatch c;

    public cylc(cylw cylw0, PrintWriter printWriter0, CountDownLatch countDownLatch0) {
        this.a = cylw0;
        this.b = printWriter0;
        this.c = countDownLatch0;
    }

    @Override
    public final void run() {
        PrintWriter printWriter0 = this.b;
        printWriter0.println();
        printWriter0.println("NearbyDeviceManager");
        cylw cylw0 = this.a;
        printWriter0.printf("  Nearby Sass device count: %d\n", new Object[]{cylw0.a.size()});
        ArrayList arrayList0 = new ArrayList(cylw0.a);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            cyna cyna0 = (cyna)arrayList0.get(v1);
            printWriter0.printf("    ", new Object[0]).println(cyna0.toString().replace("\n", "\n    "));
        }
        printWriter0.printf("  Switch candidates:\n", new Object[0]);
        cyna cyna1 = cylw0.m(cyfb.g).a;
        String s = "null";
        printWriter0.printf("    A2DP-", new Object[0]).printf((cyna1 == null ? "null" : fgjo.c(cyna1.b.a)), new Object[0]).printf("\n", new Object[0]);
        cyna cyna2 = cylw0.m(cyfb.c).a;
        PrintWriter printWriter1 = printWriter0.printf("    HFP -", new Object[0]);
        if(cyna2 != null) {
            s = fgjo.c(cyna2.b.a);
        }
        printWriter1.printf(s, new Object[0]).printf("\n", new Object[0]);
        printWriter0.printf("\n", new Object[0]);
        this.c.countDown();
    }
}

