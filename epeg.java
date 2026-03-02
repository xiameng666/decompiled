import android.content.Context;

public abstract class epeg {
    private boolean a;
    private boolean b;
    private epcy c;
    public final Context d;

    protected epeg(Context context0) {
        this.c = null;
        this.b = false;
        this.d = context0;
        this.a = true;
    }

    protected abstract void a(boolean arg1);

    protected void b() {
        epcy epcy0 = this.c;
        if(epcy0 != null) {
            epcy0.a(this.a);
            this.c.a.he(true);
        }
    }

    public final void g() {
        if(!this.b) {
            throw new IllegalStateException(this.getClass() + ": onAccept was called before attachItem! Make sure that attachItem is called before the services are accepted!");
        }
        this.a(this.a);
    }

    public final void h(boolean z) {
        if(z != this.a) {
            this.a = z;
            epcy epcy0 = this.c;
            if(epcy0 != null) {
                epcy0.a(z);
            }
        }
    }

    public final void i(epcy epcy0) {
        this.b = true;
        this.c = epcy0;
        this.b();
    }
}

