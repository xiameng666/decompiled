import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Spanned;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public final class nez implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = new Bundle();
        CharSequence charSequence0 = ((lyq)object0).u;
        if(charSequence0 != null) {
            ((Bundle)object1).putCharSequence(lyq.a, charSequence0);
            if((charSequence0 instanceof Spanned)) {
                ArrayList arrayList0 = new ArrayList();
                lyw[] arr_lyw = (lyw[])((Spanned)charSequence0).getSpans(0, ((Spanned)charSequence0).length(), lyw.class);
                for(int v = 0; v < arr_lyw.length; ++v) {
                    lyw lyw0 = arr_lyw[v];
                    Bundle bundle0 = new Bundle();
                    bundle0.putString(lyw.a, lyw0.c);
                    bundle0.putInt(lyw.b, lyw0.d);
                    arrayList0.add(lyt.a(((Spanned)charSequence0), lyw0, 1, bundle0));
                }
                lyy[] arr_lyy = (lyy[])((Spanned)charSequence0).getSpans(0, ((Spanned)charSequence0).length(), lyy.class);
                for(int v1 = 0; v1 < arr_lyy.length; ++v1) {
                    lyy lyy0 = arr_lyy[v1];
                    Bundle bundle1 = new Bundle();
                    bundle1.putInt(lyy.a, lyy0.d);
                    bundle1.putInt(lyy.b, lyy0.e);
                    bundle1.putInt(lyy.c, lyy0.f);
                    arrayList0.add(lyt.a(((Spanned)charSequence0), lyy0, 2, bundle1));
                }
                lyu[] arr_lyu = (lyu[])((Spanned)charSequence0).getSpans(0, ((Spanned)charSequence0).length(), lyu.class);
                for(int v2 = 0; v2 < arr_lyu.length; ++v2) {
                    arrayList0.add(lyt.a(((Spanned)charSequence0), arr_lyu[v2], 3, null));
                }
                lyz[] arr_lyz = (lyz[])((Spanned)charSequence0).getSpans(0, ((Spanned)charSequence0).length(), lyz.class);
                for(int v3 = 0; v3 < arr_lyz.length; ++v3) {
                    lyz lyz0 = arr_lyz[v3];
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(lyz.a, lyz0.b);
                    arrayList0.add(lyt.a(((Spanned)charSequence0), lyz0, 4, bundle2));
                }
                if(!arrayList0.isEmpty()) {
                    ((Bundle)object1).putParcelableArrayList(lyq.b, arrayList0);
                }
            }
        }
        ((Bundle)object1).putSerializable(lyq.c, ((lyq)object0).v);
        ((Bundle)object1).putSerializable(lyq.d, ((lyq)object0).w);
        ((Bundle)object1).putFloat(lyq.g, ((lyq)object0).y);
        ((Bundle)object1).putInt(lyq.h, ((lyq)object0).z);
        ((Bundle)object1).putInt(lyq.i, ((lyq)object0).A);
        ((Bundle)object1).putFloat(lyq.j, ((lyq)object0).B);
        ((Bundle)object1).putInt(lyq.k, ((lyq)object0).C);
        ((Bundle)object1).putInt(lyq.l, ((lyq)object0).H);
        ((Bundle)object1).putFloat(lyq.m, ((lyq)object0).I);
        ((Bundle)object1).putFloat(lyq.n, ((lyq)object0).D);
        ((Bundle)object1).putFloat(lyq.o, ((lyq)object0).E);
        ((Bundle)object1).putBoolean(lyq.q, ((lyq)object0).F);
        ((Bundle)object1).putInt(lyq.p, ((lyq)object0).G);
        ((Bundle)object1).putInt(lyq.r, ((lyq)object0).J);
        ((Bundle)object1).putFloat(lyq.s, ((lyq)object0).K);
        ((Bundle)object1).putInt(lyq.t, ((lyq)object0).L);
        Bitmap bitmap0 = ((lyq)object0).x;
        if(bitmap0 != null) {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            gftb.q(bitmap0.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream0));
            byte[] arr_b = byteArrayOutputStream0.toByteArray();
            ((Bundle)object1).putByteArray(lyq.f, arr_b);
        }
        return object1;
    }
}

