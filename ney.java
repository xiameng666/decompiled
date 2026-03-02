import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import java.util.ArrayList;

public final class ney implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        lyp lyp0 = new lyp();
        CharSequence charSequence0 = ((Bundle)object0).getCharSequence(lyq.a);
        if(charSequence0 != null) {
            lyp0.e(charSequence0);
            ArrayList arrayList0 = ((Bundle)object0).getParcelableArrayList(lyq.b);
            if(arrayList0 != null) {
                SpannableString spannableString0 = SpannableString.valueOf(charSequence0);
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    Bundle bundle0 = (Bundle)arrayList0.get(v1);
                    int v2 = bundle0.getInt(lyt.a);
                    int v3 = bundle0.getInt(lyt.b);
                    int v4 = bundle0.getInt(lyt.c);
                    int v5 = bundle0.getInt(lyt.d, -1);
                    Bundle bundle1 = bundle0.getBundle(lyt.e);
                    switch(v5) {
                        case 1: {
                            gftb.check(bundle1);
                            String s = bundle1.getString(lyw.a);
                            gftb.check(s);
                            spannableString0.setSpan(new lyw(s, bundle1.getInt(lyw.b)), v2, v3, v4);
                            break;
                        }
                        case 2: {
                            gftb.check(bundle1);
                            spannableString0.setSpan(new lyy(bundle1.getInt(lyy.a), bundle1.getInt(lyy.b), bundle1.getInt(lyy.c)), v2, v3, v4);
                            break;
                        }
                        case 3: {
                            spannableString0.setSpan(new lyu(), v2, v3, v4);
                            break;
                        }
                        case 4: {
                            gftb.check(bundle1);
                            String s1 = bundle1.getString(lyz.a);
                            gftb.check(s1);
                            spannableString0.setSpan(new lyz(s1), v2, v3, v4);
                        }
                    }
                }
                lyp0.e(spannableString0);
            }
        }
        Layout.Alignment layout$Alignment0 = (Layout.Alignment)((Bundle)object0).getSerializable(lyq.c);
        if(layout$Alignment0 != null) {
            lyp0.b = layout$Alignment0;
        }
        Layout.Alignment layout$Alignment1 = (Layout.Alignment)((Bundle)object0).getSerializable(lyq.d);
        if(layout$Alignment1 != null) {
            lyp0.c = layout$Alignment1;
        }
        Bitmap bitmap0 = (Bitmap)((Bundle)object0).getParcelable(lyq.e);
        if(bitmap0 == null) {
            byte[] arr_b = ((Bundle)object0).getByteArray(lyq.f);
            if(arr_b != null) {
                lyp0.c(BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length));
            }
        }
        else {
            lyp0.c(bitmap0);
        }
        String s2 = lyq.g;
        if(((Bundle)object0).containsKey(s2)) {
            String s3 = lyq.h;
            if(((Bundle)object0).containsKey(s3)) {
                lyp0.d(((Bundle)object0).getFloat(s2), ((Bundle)object0).getInt(s3));
            }
        }
        String s4 = lyq.i;
        if(((Bundle)object0).containsKey(s4)) {
            lyp0.d = ((Bundle)object0).getInt(s4);
        }
        String s5 = lyq.j;
        if(((Bundle)object0).containsKey(s5)) {
            lyp0.e = ((Bundle)object0).getFloat(s5);
        }
        String s6 = lyq.k;
        if(((Bundle)object0).containsKey(s6)) {
            lyp0.f = ((Bundle)object0).getInt(s6);
        }
        String s7 = lyq.m;
        if(((Bundle)object0).containsKey(s7)) {
            String s8 = lyq.l;
            if(((Bundle)object0).containsKey(s8)) {
                lyp0.f(((Bundle)object0).getFloat(s7), ((Bundle)object0).getInt(s8));
            }
        }
        String s9 = lyq.n;
        if(((Bundle)object0).containsKey(s9)) {
            lyp0.g = ((Bundle)object0).getFloat(s9);
        }
        String s10 = lyq.o;
        if(((Bundle)object0).containsKey(s10)) {
            lyp0.h = ((Bundle)object0).getFloat(s10);
        }
        String s11 = lyq.p;
        if(((Bundle)object0).containsKey(s11)) {
            lyp0.g(((Bundle)object0).getInt(s11));
        }
        if(!((Bundle)object0).getBoolean(lyq.q, false)) {
            lyp0.b();
        }
        String s12 = lyq.r;
        if(((Bundle)object0).containsKey(s12)) {
            lyp0.i = ((Bundle)object0).getInt(s12);
        }
        String s13 = lyq.s;
        if(((Bundle)object0).containsKey(s13)) {
            lyp0.j = ((Bundle)object0).getFloat(s13);
        }
        String s14 = lyq.t;
        if(((Bundle)object0).containsKey(s14)) {
            lyp0.k = ((Bundle)object0).getInt(s14);
        }
        return lyp0.a();
    }
}

