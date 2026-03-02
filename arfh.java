import android.content.Intent;
import j..util.Objects;

final class arfh {
    public int a;
    String b;
    int c;
    final arfi d;

    public arfh(arfi arfi0) {
        Objects.requireNonNull(arfi0);
        this.d = arfi0;
        super();
        this.d();
    }

    public final void a() {
        if(this.a == 0) {
            arfi.a.d("finishBackup from: " + this.a + "; initializeDevice has cleared data already.", new Object[0]);
            return;
        }
        aqql aqql0 = arfi.a;
        aqql0.d("finishBackup from: " + this.a + ", package: " + this.b, new Object[0]);
        if(this.a == 1) {
            int v = this.c;
            if(v != 0) {
                aqql0.h("Deleting partial backup data file: %s due to error: %d", new Object[]{this.b, v});
                this.d.c(this.b).delete();
            }
        }
        int v1 = this.a;
        String s = this.b;
        int v2 = this.c;
        Intent intent0 = new Intent("com.google.android.gms.backup.ACTION_OPERATION_DONE");
        intent0.putExtra("operation", v1);
        intent0.putExtra("package_name", s);
        intent0.putExtra("error", v2);
        intent0.setPackage("com.google.android.gms");
        this.d.b.sendBroadcast(intent0);
        this.d();
    }

    public final void b(int v) {
        arfi.a.d("Moved from state " + this.a + " to " + v, new Object[0]);
        this.a = v;
    }

    public final void c(String s) {
        switch(this.a) {
            case 0: {
                break;
            }
            case 3: {
                if(!"@pm@".equals(s)) {
                    arfi.a.f("Movement to illegal state performBackup.", new Object[0]);
                }
                break;
            }
            default: {
                arfi.a.f("Movement to illegal state performBackup.", new Object[0]);
            }
        }
        this.b = s;
        this.c = 0;
        this.b(1);
    }

    private final void d() {
        this.b(0);
        this.b = null;
    }
}

