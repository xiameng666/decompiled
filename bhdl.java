import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

public final class bhdl implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Bundle bundle0;
        Object object1 = new Intent(((bhcn)object0).b).setPackage("com.google.android.gms").setFlags(0x10000000);
        if(!((bhcn)object0).c.isEmpty()) {
            ((Intent)object1).setData(Uri.parse(((bhcn)object0).c));
        }
        if(!((bhcn)object0).d.isEmpty()) {
            byte[] arr_b = ((bhcn)object0).d.toByteArray();
            Parcel parcel0 = Parcel.obtain();
            try {
                parcel0.unmarshall(arr_b, 0, arr_b.length);
                parcel0.setDataPosition(0);
                bundle0 = (Bundle)Bundle.CREATOR.createFromParcel(parcel0);
            }
            finally {
                parcel0.recycle();
            }
            ((Intent)object1).putExtras(bundle0);
            return object1;
        }
        return object1;
    }
}

