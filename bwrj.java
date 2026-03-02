import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.MutateRequest;
import j..util.Objects;

public final class bwrj extends bwsu implements bwrp {
    public final bwsi a;
    final goqq b;
    private final Context c;
    private final bwqt d;
    private final bwrc e;
    private final bwtc f;
    private final azxs g;
    private bwrr h;

    public bwrj(goqq goqq0, Context context0, bwry bwry0, azxs azxs0, MutateRequest mutateRequest0, bwqt bwqt0, bwrc bwrc0, bwtc bwtc0, long v) {
        Objects.requireNonNull(goqq0);
        bwss bwss1;
        bwss bwss0;
        this.b = goqq0;
        super(bwry0, goqq0.b, goqq0.d, goqq0.g);
        batl.b(bwqt0 != null || bwrc0 != null);
        this.c = context0;
        switch(mutateRequest0.a) {
            case 1: {
                bwss0 = new bwss(mutateRequest0.b, v);
                bwss1 = bwss0;
                goto label_28;
            }
            case 2: {
                bwss0 = new bwsj(mutateRequest0.b, v);
                bwss1 = bwss0;
                goto label_28;
            }
            case 3: {
                bwss0 = new bwsn(mutateRequest0.c, v);
                bwss1 = bwss0;
                goto label_28;
            }
            case 4: {
                bwss1 = new bwsl(v);
                goto label_28;
            }
            case 6: {
                goto label_16;
            }
            case 7: {
                goto label_21;
            }
        }
        throw new IllegalArgumentException();
    label_16:
        String[] arr_s = mutateRequest0.d;
        if(arr_s == null) {
            throw new IllegalArgumentException();
        }
        bwss1 = new bwsp(arr_s, v);
        goto label_28;
    label_21:
        ActionImpl actionImpl0 = mutateRequest0.e;
        if(actionImpl0 != null) {
            String s = mutateRequest0.f;
            if(s != null) {
                String s1 = mutateRequest0.g;
                if(s1 != null) {
                    bwss1 = new bwsr(actionImpl0, s, s1);
                label_28:
                    this.a = bwss1;
                    this.d = bwqt0;
                    this.e = bwrc0;
                    this.f = bwtc0;
                    this.g = azxs0;
                    return;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    @Override  // bwsu
    protected final Object a() {
        goqq goqq0 = this.b;
        if(goqq0.g) {
            bwmx bwmx0 = goqq0.a.a();
            this.a.i(goqq0.f, bwmx0, this.f);
            this.a.b(bwmx0, goqq0.f);
            return null;
        }
        if(this.e != null && ("*".equals(hubx.d()) || bbmt.e(hubx.d().split(","), goqq0.e))) {
            batl.t(this.e, "rqManager can NOT be null in executeUsingRequestQueue()");
            bwmx bwmx1 = this.b.a.a();
            this.a.i(this.b.f, bwmx1, this.f);
            this.a.h(bwmx1, this.b.f, this.e);
            return null;
        }
        bwqt bwqt0 = this.d;
        if(bwqt0 != null) {
            bwtc bwtc0 = this.f;
            goqq0.g(bwqt0, bwtc0);
            bwsi bwsi0 = this.a;
            bwud bwud0 = goqq0.f;
            bwmx bwmx2 = goqq0.a.a();
            bwsi0.i(bwud0, bwmx2, bwtc0);
            bwsi0.e(bwmx2);
            SQLiteDatabase sQLiteDatabase0 = bwqt0.getWritableDatabase();
            sQLiteDatabase0.beginTransaction();
            try {
                int v = bwsi0.a();
                if(v > 0) {
                    bwqt0.g(sQLiteDatabase0, bwud0, bwmx2, bwtc0, v);
                }
                try {
                    bwsi0.f(this.c, sQLiteDatabase0, bwqt0, bwud0, bwtc0);
                    sQLiteDatabase0 = sQLiteDatabase0;
                }
                catch(Throwable throwable0) {
                    sQLiteDatabase0 = sQLiteDatabase0;
                    goto label_35;
                }
                sQLiteDatabase0.setTransactionSuccessful();
                goto label_37;
            }
            catch(Throwable throwable0) {
            }
        label_35:
            sQLiteDatabase0.endTransaction();
            throw throwable0;
        label_37:
            sQLiteDatabase0.endTransaction();
            this.a.d(this.d, this.b.f, bwmx2);
            return null;
        }
        return null;
    }

    @Override  // bwsu
    protected final void b(Status status0, Object object0) {
        Void void0 = (Void)object0;
        this.g.a(status0);
    }

    @Override  // bwsu
    protected final void c(String s, glrs glrs0, Object object0) {
        if(aztk.h(bwsz.b(glrs0)) && (this.h != null && this.h.b())) {
            return;
        }
        bwrr bwrr0 = this.h;
        if(bwrr0 != null) {
            bwrr0.a();
        }
        super.c(s, glrs0, ((Void)object0));
    }

    public final void d(String s, glrs glrs0) {
        super.c(s, glrs0, null);
    }

    @Override  // bwrp
    public final void g(bwrr bwrr0) {
        this.h = bwrr0;
        this.f();
        this.h = null;
    }
}

