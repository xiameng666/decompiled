import android.content.Intent;
import j..util.Objects;

final class aajo implements aacg {
    final aajp a;

    public aajo(aajp aajp0) {
        Objects.requireNonNull(aajp0);
        this.a = aajp0;
        super();
    }

    @Override  // aacg
    public final void a(aaby aaby0) {
        if(aaby0.e) {
            this.a.a.d();
            return;
        }
        Intent intent0 = aaby0.f;
        if(hoju.o()) {
            acp acp0 = this.a.c;
            if(acp0 != null && intent0 != null) {
                acp0.b(intent0);
                return;
            }
        }
        if(intent0 != null) {
            this.a.startActivityForResult(intent0, 9);
        }
    }
}

