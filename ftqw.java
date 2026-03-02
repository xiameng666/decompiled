import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.os.Parcel;
import com.google.android.libraries.tapandpay.riker.aidl.GetRikerProvisionPayloadRequestParcelable;
import j..time.Duration;
import java.io.Closeable;

final class ftqw extends ibsl implements ibtw {
    Object a;
    int b;
    final ftqz c;
    final Tag d;
    final Duration e;
    final ftra f;

    public ftqw(ftqz ftqz0, Tag tag0, Duration duration0, ftra ftra0, ibrl ibrl0) {
        this.c = ftqz0;
        this.d = tag0;
        this.e = duration0;
        this.f = ftra0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ftqw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ftqw(this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object4;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                this.b = 1;
                object0 = this.c.c.i(this);
                if(object0 != object1) {
                    goto label_11;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
            label_11:
                ftqs ftqs0 = (ftqs)object0;
                Object object3 = this.c.b.a(this.d);
                if(object3 == null) {
                    ftre ftre0 = ftrd.a(((ProtoLiteMessage)ftrc.a).v_newBuilder());
                    ftre0.c(ftrb.i);
                    ftre0.b("The card does not support the right NFC protocol");
                    return ftre0.a();
                }
                ((IsoDep)object3).connect();
                ((IsoDep)object3).setTimeout(((int)this.e.toMillis()));
                try {
                    this.a = object3;
                    this.b = 2;
                    icbk icbk0 = new icbk(ibsc.c(this), 1);
                    icbk0.z();
                    GetRikerProvisionPayloadRequestParcelable getRikerProvisionPayloadRequestParcelable0 = new GetRikerProvisionPayloadRequestParcelable(this.f.toBytesArray());
                    ftqq ftqq0 = new ftqq(((IsoDep)object3));
                    ftqr ftqr0 = new ftqr(icbk0);
                    Parcel parcel0 = ftqs0.jo();
                    wbz.f(parcel0, getRikerProvisionPayloadRequestParcelable0);
                    wbz.h(parcel0, ftqq0);
                    wbz.h(parcel0, ftqr0);
                    ftqs0.jp(2, parcel0);
                    object0 = icbk0.k();
                    if(object0 == object1) {
                        ibsi.b(this);
                    }
                }
                catch(Throwable throwable1) {
                    throwable0 = throwable1;
                    object2 = object3;
                    throw throwable0;
                }
                if(object0 != object1) {
                    object2 = object3;
                    try {
                        object4 = (ftrc)object0;
                        goto label_49;
                    }
                    catch(Throwable throwable0) {
                    }
                    try {
                        throw throwable0;
                    }
                    catch(Throwable throwable2) {
                        ibsx.a(((Closeable)object2), throwable0);
                        throw throwable2;
                    }
                label_49:
                    ibsx.a(((Closeable)object2), null);
                    return object4;
                }
                break;
            }
            default: {
                object2 = this.a;
                ibnx.b(object0);
                object4 = (ftrc)object0;
                goto label_49;
            }
        }
        return object1;
    }
}

