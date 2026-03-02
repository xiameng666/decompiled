import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class txx extends uoq implements Cloneable {
    private Object A;
    private List B;
    private txx C;
    private txx D;
    private Float E;
    private boolean F;
    private boolean G;
    private boolean H;
    public final tyb a;
    private final Context w;
    private final Class x;
    private final txj y;
    private tyc z;

    static {
        uoy uoy0 = (uoy)((uoy)((uoy)new uoy().s(udf.c)).E(txn.d)).W();
    }

    protected txx(txc txc0, tyb tyb0, Class class0, Context context0) {
        this.F = true;
        this.a = tyb0;
        this.x = class0;
        this.w = context0;
        txj txj0 = tyb0.b.c;
        tyc tyc0 = (tyc)txj0.d.get(class0);
        if(tyc0 == null) {
            for(Object object0: txj0.d.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(((Class)map$Entry0.getKey()).isAssignableFrom(class0)) {
                    tyc0 = (tyc)map$Entry0.getValue();
                }
            }
        }
        if(tyc0 == null) {
            tyc0 = txj.a;
        }
        this.z = tyc0;
        this.y = txc0.c;
        for(Object object1: tyb0.e) {
            this.a(((uox)object1));
        }
        this.b(tyb0.i());
    }

    private final uot Y(Object object0, upn upn0, uox uox0, uov uov0, tyc tyc0, txn txn0, int v, int v1, uoq uoq0, Executor executor0) {
        uot uot2;
        txn txn1;
        uov uov2;
        uov uov1;
        txx txx0 = this;
        uoq uoq1 = uoq0;
        if(txx0.D == null) {
            uov2 = null;
            uov1 = uov0;
        }
        else {
            uov1 = new uor(object0, uov0);
            uov2 = uov1;
        }
        txx txx1 = txx0.C;
        if(txx1 == null) {
            uot2 = txx0.Z(object0, upn0, uox0, uoq1, uov1, tyc0, txn0, v, v1, executor0);
        }
        else {
            if(txx0.H) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            tyc tyc1 = txx1.F ? tyc0 : txx1.z;
            if(txx1.super.Q(8)) {
                txn1 = txx1.d;
            }
            else {
                switch(txn0) {
                    case 1: {
                        txn1 = txn.c;
                        break;
                    }
                    case 2: {
                        txn1 = txn.b;
                        break;
                    }
                    case 3: 
                    case 4: {
                        txn1 = txn.a;
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("unknown priority: " + txx0.d);
                    }
                }
            }
            int v2 = txx0.C.k;
            int v3 = txx0.C.j;
            if(uqq.n(v, v1) && !txx0.C.R()) {
                v2 = uoq1.k;
                v3 = uoq1.j;
            }
            upa upa0 = new upa(object0, uov1);
            uot uot0 = txx0.Z(object0, upn0, uox0, uoq1, upa0, tyc0, txn0, v, v1, executor0);
            txx0.H = true;
            uot uot1 = txx0.C.Y(object0, upn0, uox0, upa0, tyc1, txn1, v2, v3, txx0.C, executor0);
            uot2 = upa0;
            txx0.H = false;
            uot2.a = uot0;
            uot2.b = uot1;
            uoq1 = uoq0;
            txx0 = txx0;
        }
        if(uov2 == null) {
            return uot2;
        }
        int v4 = txx0.D.k;
        int v5 = txx0.D.j;
        if(uqq.n(v, v1) && !txx0.D.R()) {
            v4 = uoq1.k;
            v5 = uoq1.j;
        }
        uot uot3 = txx0.D.Y(object0, upn0, uox0, uov2, txx0.D.z, txx0.D.d, v4, v5, txx0.D, executor0);
        uov2.a = uot2;
        uov2.b = uot3;
        return uov2;
    }

    private final uot Z(Object object0, upn upn0, uox uox0, uoq uoq0, uov uov0, tyc tyc0, txn txn0, int v, int v1, Executor executor0) {
        return new uoz(this.w, this.y, object0, this.A, this.x, uoq0, v, v1, txn0, upn0, uox0, this.B, uov0, this.y.e, executor0);
    }

    public final txx a(uox uox0) {
        if(this.s) {
            return this.d().a(uox0);
        }
        if(uox0 != null) {
            if(this.B == null) {
                this.B = new ArrayList();
            }
            this.B.add(uox0);
        }
        this.V();
        return this;
    }

    public final txx b(uoq uoq0) {
        uqo.f(uoq0);
        return (txx)super.i(uoq0);
    }

    public final txx c(txx txx0) {
        PackageInfo packageInfo0;
        Context context0 = this.w;
        txx txx1 = (txx)txx0.J(context0.getTheme());
        uay uay0 = (uay)upu.a.get("com.google.android.gms");
        if(uay0 == null) {
            try {
                packageInfo0 = context0.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.e("AppVersionSignature", "Cannot resolve info forcom.google.android.gms", packageManager$NameNotFoundException0);
                packageInfo0 = null;
            }
            upw upw0 = new upw((packageInfo0 == null ? UUID.randomUUID().toString() : String.valueOf(packageInfo0.versionCode)));
            uay0 = (uay)upu.a.putIfAbsent("com.google.android.gms", upw0);
            if(uay0 == null) {
                uay0 = upw0;
            }
        }
        return (txx)txx1.I(new upt(context0.getResources().getConfiguration().uiMode & 0x30, uay0));
    }

    @Override  // uoq
    public final Object clone() {
        return this.d();
    }

    public final txx d() {
        txx txx0 = (txx)super.j();
        txx0.z = txx0.z.a();
        List list0 = txx0.B;
        if(list0 != null) {
            txx0.B = new ArrayList(list0);
        }
        txx txx1 = txx0.C;
        if(txx1 != null) {
            txx0.C = txx1.d();
        }
        txx txx2 = txx0.D;
        if(txx2 != null) {
            txx0.D = txx2.d();
        }
        return txx0;
    }

    public final txx e(uox uox0) {
        if(this.s) {
            return this.d().e(uox0);
        }
        this.B = null;
        return this.a(uox0);
    }

    @Override  // uoq
    public final boolean equals(Object object0) {
        return (object0 instanceof txx) && super.equals(((txx)object0)) && Objects.equals(this.x, ((txx)object0).x) && this.z.equals(((txx)object0).z) && Objects.equals(this.A, ((txx)object0).A) && Objects.equals(this.B, ((txx)object0).B) && Objects.equals(this.C, ((txx)object0).C) && Objects.equals(this.D, ((txx)object0).D) && Objects.equals(null, null) && this.F == ((txx)object0).F && this.G == ((txx)object0).G;
    }

    public final txx f(Uri uri0) {
        txx txx0 = this.h(uri0);
        return uri0 == null || !"android.resource".equals(uri0.getScheme()) ? txx0 : this.c(txx0);
    }

    public final txx g(byte[] arr_b) {
        txx txx0 = this.h(arr_b);
        if(!txx0.super.Q(4)) {
            txx0 = txx0.b(uoy.c(udf.b));
        }
        if(!txx0.super.Q(0x100)) {
            if(uoy.a == null) {
                uoy uoy0 = (uoy)new uoy().W();
                uoy0.X();
                uoy.a = uoy0;
            }
            return txx0.b(uoy.a);
        }
        return txx0;
    }

    public final txx h(Object object0) {
        if(this.s) {
            return this.d().h(object0);
        }
        this.A = object0;
        this.G = true;
        this.V();
        return this;
    }

    @Override  // uoq
    public final int hashCode() {
        return uqq.c(((int)this.G), uqq.c(((int)this.F), uqq.d(null, uqq.d(this.D, uqq.d(this.C, uqq.d(this.B, uqq.d(this.A, uqq.d(this.z, uqq.d(this.x, super.hashCode())))))))));
    }

    @Override  // uoq
    public final uoq i(uoq uoq0) {
        return this.b(uoq0);
    }

    @Override  // uoq
    public final uoq j() {
        return this.d();
    }

    public final upq k(ImageView imageView0) {
        upq upq0;
        uoq uoq0;
        uqq.h();
        uqo.f(imageView0);
        if(!super.Q(0x800) && this.n && imageView0.getScaleType() != null) {
            switch(imageView0.getScaleType()) {
                case 1: {
                    uoq0 = this.d().x();
                    break;
                }
                case 2: {
                    uoq0 = this.d().y();
                    break;
                }
                case 3: 
                case 4: 
                case 5: {
                    uoq0 = this.d().z();
                    break;
                }
                case 6: {
                    uoq0 = this.d().y();
                    break;
                }
                default: {
                    uoq0 = this;
                }
            }
        }
        else {
            uoq0 = this;
        }
        Class class0 = this.x;
        if(Bitmap.class.equals(class0)) {
            upq0 = new upc(imageView0);
            this.n(upq0, null, uoq0, uqg.a);
            return upq0;
        }
        if(!Drawable.class.isAssignableFrom(class0)) {
            throw new IllegalArgumentException(a.b(class0, "Unhandled class: ", ", try .as*(Class).transcode(ResourceTranscoder)"));
        }
        upq0 = new uph(imageView0);
        this.n(upq0, null, uoq0, uqg.a);
        return upq0;
    }

    public final uow l() {
        return this.m(0x80000000, 0x80000000);
    }

    public final uow m(int v, int v1) {
        uow uow0 = new uow(v, v1);
        this.n(uow0, uow0, this, uqg.b);
        return uow0;
    }

    public final void n(upn upn0, uox uox0, uoq uoq0, Executor executor0) {
        uqo.f(upn0);
        if(!this.G) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        uot uot0 = this.Y(new Object(), upn0, uox0, null, this.z, uoq0.d, uoq0.k, uoq0.j, uoq0, executor0);
        uot uot1 = upn0.d();
        if(uot0.m(uot1) && (uoq0.i || !uot1.l())) {
            uqo.f(uot1);
            if(!uot1.n()) {
                uot1.b();
            }
            return;
        }
        this.a.k(upn0);
        upn0.i(uot0);
        this.a.r(upn0, uot0);
    }

    public final void o() {
        this.p(new upl(this.a));
    }

    public final void p(upn upn0) {
        this.n(upn0, null, this, uqg.a);
    }
}

