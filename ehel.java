import android.content.ContentValues;
import android.content.Context;
import android.content.SyncStats;
import java.util.List;
import org.json.JSONException;

public abstract class ehel {
    protected final girk a;
    protected final Context b;
    protected final ehfu c;
    protected final ehab d;
    protected final ehim e;
    protected final ehco f;
    protected final ehfj g;

    protected ehel(Context context0, girk girk0, ehfu ehfu0, ehab ehab0, ehim ehim0, ehco ehco0, ehfj ehfj0) {
        this.b = context0;
        this.a = girk0;
        this.c = ehfu0;
        this.d = ehab0;
        this.e = ehim0;
        this.f = ehco0;
        this.g = ehfj0;
    }

    protected static eggf a(girk girk0) {
        switch(girk0.ordinal()) {
            case 1: {
                return eggf.b;
            }
            case 2: {
                return eggf.c;
            }
            case 3: {
                return eggf.d;
            }
            default: {
                return eggf.a;
            }
        }
    }

    protected final void b(egzv egzv0) {
        this.d.b.d(egzv0.d, true);
        this.d.f();
        if(hxdh.d()) {
            String s = egzv0.a;
            if(s != null) {
                this.e.g(s);
            }
        }
    }

    protected final void c(List list0) {
        for(Object object0: list0) {
            this.d.b.d(((egzv)object0).d, true);
        }
        this.d.f();
    }

    protected final void d(egzv egzv0, egzv egzv1) {
        this.c.a(this.b, egzv0, egzv1);
        this.d.f();
        if(hxdh.d()) {
            this.e.g(egzv0.a);
        }
    }

    protected abstract void e(egzv arg1, List arg2);

    protected abstract void f(egzv arg1);

    public final boolean g(egzv egzv0) {
        if(ehhz.d(egzv0.m, egzv0.f)) {
            SyncStats syncStats0 = ((ehiv)this.e).a.stats;
            ++syncStats0.numParseExceptions;
            this.e.h(this.a, gjgi.b, false, 8, 1);
            egig.k("FSA2_BaseContactUpSyncer", "The contact failed to sync up before and should not retry.");
            return false;
        }
        try {
            this.f(egzv0);
            return true;
        }
        catch(ArrayStoreException | acse | JSONException | ehfd | iapl exception0) {
            if(hxco.d() && (egzv0.e != null && ((long)egzv0.e) == 1L)) {
                this.d.b.m(egzv0.d);
                ContentValues contentValues0 = new ContentValues();
                contentValues0.putNull("sync3");
                this.d.b.e(this.d.b.a, egzv0.d, contentValues0, true);
                this.d.f();
                ehil ehil0 = new ehil(1, gjhf.c, 1);
                this.e.t((egzv0 == null ? girk.b : girk.c), gjgi.b, false, ehil0, 2);
                return true;
            }
            if((exception0 instanceof iapl)) {
                girk girk0 = this.a;
                eggf eggf0 = ehel.a(girk0);
                switch(this.g.c(eggf0, ((iapl)exception0).a.t.r, ((iapl)exception0).a.u) - 1) {
                    case 1: {
                        this.b(egzv0);
                        this.e.h(girk0, gjgi.b, false, 3, 1);
                        return true;
                    }
                    case 5: {
                        return this.i(egzv0, ehfl.b(((iapl)exception0).getMessage()));
                    }
                }
                if(ehhz.e(exception0)) {
                    this.c.b(egzv0);
                    this.d.f();
                }
            }
            if(ehfl.a(false, gjgi.b, this.a, exception0, this.e, 1) == girk.d) {
                this.b(egzv0);
                return true;
            }
            return false;
        }
    }

    protected static final girx h(egzv egzv0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)girx.a).v_newBuilder();
        long v = (long)egzv0.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        girx girx0 = (girx)hftp0.b_message;
        girx0.b |= 1;
        girx0.c = v;
        return (girx)hftp0.N_build();
    }

    private final boolean i(egzv egzv0, List list0) {
        try {
            this.e(egzv0, list0);
            return true;
        }
        catch(ArrayStoreException | acse | JSONException | ehfd | iapl exception0) {
            if(ehhz.e(exception0)) {
                this.c.b(egzv0);
                this.d.f();
            }
            if(ehfl.a(false, gjgi.b, this.a, exception0, this.e, 1) == girk.d) {
                this.b(egzv0);
                return true;
            }
        }
        catch(UnsupportedOperationException unused_ex) {
        }
        return false;
    }
}

