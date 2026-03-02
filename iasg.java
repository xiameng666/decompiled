import android.os.Parcel;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;

public final class iasg {
    private static final ianx a;

    static {
        iasg.a = new iasf(null, true);
    }

    public static iaof_metadata a(Parcel parcel0, iakk iakk0) {
        int v = parcel0.readInt();
        if(v == 0) {
            return new iaof_metadata();
        }
        Object[] arr_object = new Object[v + v];
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(v1 < v) {
            int v4 = parcel0.readInt();
            int v5 = v1 + v1;
            arr_object[v5] = iasg.b(parcel0, v4, v2 + 4);
            int v6 = parcel0.readInt();
            v2 = v2 + 4 + v4 + 4;
            if(v6 == -1) {
                if(!((iaqs)iakk0.a(iarm.l)).b) {
                    throw new iapl(iapk.i.f("Parcelable metadata values not allowed"));
                }
                int v7 = parcel0.dataPosition();
                try {
                    Parcelable parcelable0 = parcel0.readParcelable(iasg.class.getClassLoader());
                    if(parcelable0 == null) {
                        throw new iapl(iapk.p.f("Read null parcelable in metadata"));
                    }
                    arr_object[v5 + 1] = new iaoc(iasg.a, parcelable0);
                }
                catch(AndroidRuntimeException androidRuntimeException0) {
                    throw new iapl(iapk.p.e(androidRuntimeException0).f("Failure reading parcelable in metadata"));
                }
                v3 += parcel0.dataPosition() - v7;
                if(v3 > 0x8000) {
                    throw new iapl(iapk.k.f("Inbound Parcelables too large according to policy (see InboundParcelablePolicy)"));
                }
                ++v1;
                continue;
            }
            if(v6 < 0) {
                throw new iapl(iapk.p.f("Unrecognized metadata sentinel"));
            }
            byte[] arr_b = iasg.b(parcel0, v6, v2);
            v2 += v6;
            arr_object[v5 + 1] = arr_b;
            ++v1;
            continue;
        }
        return new iaof_metadata(v, arr_object);
    }

    private static byte[] b(Parcel parcel0, int v, int v1) {
        if(v1 + v > 0x2000) {
            throw new iapl(iapk.k.f("Metadata too large"));
        }
        byte[] arr_b = new byte[v];
        if(v > 0) {
            parcel0.readByteArray(arr_b);
        }
        return arr_b;
    }
}

