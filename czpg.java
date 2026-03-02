import java.io.PrintWriter;

final class czpg extends czvg {
    public gyxo a;
    private final czrr b;

    public czpg(czrr czrr0) {
        super(22);
        this.a = gyxo.dI;
        this.b = czrr0;
    }

    @Override  // czvg
    public final czvf a() {
        czvf czvf0;
        synchronized(this) {
            czle czle0 = this.b.a();
            this.a = czle0.b;
            czvf0 = (czvf)czle0.a.d();
        }
        return czvf0;
    }

    @Override  // czvg
    public final void g() {
        synchronized(this) {
            this.b.i();
        }
    }

    @Override  // czvg
    public final void p(PrintWriter printWriter0) {
        super.p(printWriter0);
        printWriter0.write("    [BluetoothClassicScanner]:\n");
        printWriter0.write(String.format("      Scanning Clients : %s\n", this.b.a.keySet().toArray()));
        printWriter0.write(String.format("      Scanning window : %s ms\n", hvog.s()));
        printWriter0.write(String.format("      Scanning Interval : %s ms\n", hvog.r()));
        printWriter0.flush();
        printWriter0.flush();
    }
}

