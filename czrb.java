import java.util.Set;

final class czrb {
    private final Set a;
    private cump b;

    public czrb() {
        this.a = new bxf();
        this.b = new cump();
    }

    final cump a() {
        synchronized(this) {
        }
        return this.b;
    }

    final void b(String s) {
        synchronized(this) {
            Set set0 = this.a;
            if(set0.isEmpty()) {
                czkq.a.b().h("In ScanningCancellationFlag, %s has become the first scanner. The flag has been reset.", gxyf.b(gxye.k, s));
                this.b = new cump();
            }
            set0.add(s);
        }
    }

    final void c(String s) {
        synchronized(this) {
            Set set0 = this.a;
            if(!set0.contains(s)) {
                czkq.a.b().h("In ScanningCancellationFlag, %s attempted to cancel the scan but they were not registered as a scanner", gxyf.b(gxye.k, s));
                return;
            }
            set0.remove(s);
            if(set0.isEmpty()) {
                czkq.a.b().h("In ScanningCancellationFlag, %s is the last scanner to stop scanning. The flag has been cancelled.", gxyf.b(gxye.k, s));
                this.b.a();
            }
        }
    }
}

