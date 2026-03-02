import android.os.Parcel;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

final class iasn extends iaso {
    private final gRPCMethodDescriptor b;
    private final iaof_metadata c;
    private final ibfn d;

    public iasn(iarm iarm0, int v, gRPCMethodDescriptor iaoj0, iaof_metadata iaof0, ibfn ibfn0) {
        super(iarm0, v, ibfn0);
        this.b = iaoj0;
        this.c = iaof0;
        this.d = ibfn0;
    }

    @Override  // iaso
    protected final int a(Parcel parcel0) {
        gRPCMethodDescriptor iaoj0 = this.b;
        parcel0.writeString(iaoj0.fullMethodName_);
        iaof_metadata iaof0 = this.c;
        int v = iaof0 == null ? 0 : iaof0.f;
        if(v == 0) {
            parcel0.writeInt(0);
            return iaoj0.type_ == gRPCMethodType.a || iaoj0.type_ == gRPCMethodType.b ? 16 : 0;
        }
        Object[] arr_object = new Object[iaof0.a()];
        for(int v1 = 0; v1 < iaof0.f; ++v1) {
            int v2 = v1 + v1;
            arr_object[v2] = iaof0.k(v1);
            Object object0 = iaof0.e(v1);
            if(!(object0 instanceof byte[])) {
                object0 = ((iaoc)object0).b();
            }
            arr_object[v2 + 1] = object0;
        }
        parcel0.writeInt(v);
        int v3 = 0;
        while(v3 < v) {
            int v4 = v3 + v3;
            byte[] arr_b = (byte[])arr_object[v4];
            parcel0.writeInt(arr_b.length);
            parcel0.writeByteArray(arr_b);
            Object object1 = arr_object[v4 + 1];
            if((object1 instanceof byte[])) {
                parcel0.writeInt(((byte[])object1).length);
                parcel0.writeByteArray(((byte[])object1));
                goto label_49;
            }
            if((object1 instanceof iasq)) {
                parcel0.writeInt(-1);
                ((iasq)object1).a(parcel0);
                goto label_49;
            }
            byte[] arr_b1 = iaro.b();
            int v5 = FIN.finallyOpen$NT();
            int v6;
            for(v6 = 0; v6 < arr_b1.length; v6 += v7) {
                int v7 = ((InputStream)object1).read(arr_b1, v6, arr_b1.length - v6);
                if(v7 == -1) {
                    break;
                }
            }
            if(v6 != arr_b1.length) {
                parcel0.writeInt(v6);
                if(v6 > 0) {
                    parcel0.writeByteArray(arr_b1, 0, v6);
                }
                FIN.finallyCodeBegin$NT(v5);
            label_49:
                ++v3;
                continue;
            }
            throw new iapl(iapk.k.f("Metadata value too large"));
        }
        return iaoj0.type_ == gRPCMethodType.a || iaoj0.type_ == gRPCMethodType.b ? 16 : 0;
    }

    final void b(ials ials0) {
        this.c.g(iayh.a);
        Long long0 = ials0.b(TimeUnit.NANOSECONDS);
        this.c.i(iayh.a, long0);
    }
}

