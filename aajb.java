import android.content.Intent;

public final class aajb implements aacg {
    final aajq a;

    public aajb(aajq aajq0) {
        this.a = aajq0;
        super();
    }

    @Override  // aacg
    public final void a(aaby aaby0) {
        ibuq.f(aaby0, "message");
        if(aaby0.e) {
            this.a.z().d();
            return;
        }
        Intent intent0 = aaby0.f;
        if(intent0 != null) {
            this.a.startActivityForResult(intent0, 9);
        }
    }
}

