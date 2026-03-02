import java.io.OutputStream;

public abstract class arkq implements arli {
    private boolean a;
    final arin c;
    public final hkyj d;

    protected arkq(arin arin0, hkyj hkyj0) {
        this.a = false;
        this.c = arin0;
        this.d = hkyj0;
    }

    @Override  // arli
    public final void a(int v) {
        switch(v - 1) {
            case 0: {
                this.c();
                return;
            }
            case 2: {
                if(!this.a) {
                    this.a = true;
                    this.d();
                }
            }
        }
    }

    public abstract OutputStream b();

    protected abstract void c();

    protected abstract void d();
}

