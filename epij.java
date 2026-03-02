import android.os.Bundle;

public abstract class epij extends xob {
    public int a() {
        throw null;
    }

    public abstract iw b(iv arg1);

    public boolean c() {
        throw null;
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        epil.c(this);
        fyhn.b(this.getContainerActivity());
        iw iw0 = this.b(new fyju(this, this.a()));
        if(iw0 == null) {
            epil.b(this);
            return;
        }
        if(this.c()) {
            iw0.setOnShowListener(new epih(iw0));
        }
        iw0.setOnCancelListener(new epii(this));
        iw0.show();
    }

    @Override  // xoi
    protected final void onStart() {
        super.onStart();
        epil.d(this);
    }

    @Override  // xoi
    protected final void onStop() {
        epil.e(this);
        super.onStop();
    }
}

