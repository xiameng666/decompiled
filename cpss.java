import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.maps.internal.CreatorImpl;
import com.google.android.gms.maps.model.PinConfig;
import j..util.Objects;

public final class cpss extends wby implements cpst {
    public cpst a;
    public final CreatorImpl b;

    public cpss() {
        super("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    public cpss(CreatorImpl creatorImpl0) {
        Objects.requireNonNull(creatorImpl0);
        this.b = creatorImpl0;
        super("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        this.a = null;
    }

    @Override  // cpst
    public final bjgw a() {
        cpol cpol0 = new cpol(this);
        return this.b.a(cpol0);
    }

    @Override  // cpst
    public final bjgw b(float f) {
        cpom cpom0 = new cpom(this, f);
        return this.b.a(cpom0);
    }

    @Override  // cpst
    public final bjgw c(String s) {
        cpoj cpoj0 = new cpoj(this, s);
        return this.b.a(cpoj0);
    }

    @Override  // cpst
    public final bjgw d(Bitmap bitmap0) {
        cpon cpon0 = new cpon(this, bitmap0);
        return this.b.a(cpon0);
    }

    @Override  // cpst
    public final bjgw e(String s) {
        cpok cpok0 = new cpok(this, s);
        return this.b.a(cpok0);
    }

    @Override  // cpst
    public final bjgw f(String s) {
        cpoo cpoo0 = new cpoo(this, s);
        return this.b.a(cpoo0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                int v1 = parcel0.readInt();
                cpss.gr(parcel0);
                bjgw bjgw0 = this.g(v1);
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw0);
                return true;
            }
            case 2: {
                String s = parcel0.readString();
                cpss.gr(parcel0);
                bjgw bjgw1 = this.c(s);
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw1);
                return true;
            }
            case 3: {
                String s1 = parcel0.readString();
                cpss.gr(parcel0);
                bjgw bjgw2 = this.e(s1);
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw2);
                return true;
            }
            case 4: {
                bjgw bjgw3 = this.a();
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw3);
                return true;
            }
            case 5: {
                float f = parcel0.readFloat();
                cpss.gr(parcel0);
                bjgw bjgw4 = this.b(f);
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw4);
                return true;
            }
            case 6: {
                Bitmap bitmap0 = (Bitmap)wbz.a(parcel0, Bitmap.CREATOR);
                cpss.gr(parcel0);
                bjgw bjgw5 = this.d(bitmap0);
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw5);
                return true;
            }
            case 7: {
                String s2 = parcel0.readString();
                cpss.gr(parcel0);
                bjgw bjgw6 = this.f(s2);
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw6);
                return true;
            }
            case 8: {
                PinConfig pinConfig0 = (PinConfig)wbz.a(parcel0, PinConfig.CREATOR);
                cpss.gr(parcel0);
                cpop cpop0 = new cpop(this);
                bjgw bjgw7 = this.b.a(cpop0);
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw7);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // cpst
    public final bjgw g(int v) {
        cpoi cpoi0 = new cpoi(this, v);
        return this.b.a(cpoi0);
    }
}

