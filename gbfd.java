import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

public final class gbfd {
    public static ColorStateList a(gbet gbet0, gbdq gbdq0) {
        return ColorStateList.valueOf(gbdq0.b(3, gbet0.d));
    }

    public static ColorStateList b(int v, int v1, int v2) {
        return new ColorStateList(new int[][]{new int[]{0xFEFEFF62}, new int[]{0x101009C, 0x101009E}, new int[0]}, new int[]{v, v1, v2});
    }

    public static void c(gbet gbet0, TextInputLayout textInputLayout0, hdlp hdlp0) {
        gbfj.d(gbet0, textInputLayout0);
        gbdp gbdp0 = gbet0.c;
        EditText editText0 = textInputLayout0.f;
        if(editText0 != null) {
            gbfe.f(gbet0, gbdp0.c(), editText0);
            gbdq gbdq0 = gbdp0.d().d(8);
            if(gbdq0 != null) {
                gbfe.e(gbet0, gbdq0, editText0);
            }
        }
        gbdq gbdq1 = gbdp0.d();
        gbdq gbdq2 = gbdq1.d(9);
        gbdq gbdq3 = gbdq1.d(11);
        if(gbdq2 != null) {
            if(gbet0.e(gbdq2, new int[]{3}) && gbdq2.l(3, gbet0.d)) {
                textInputLayout0.K(gbfd.a(gbet0, gbdq2));
            }
            AppCompatTextView appCompatTextView0 = (AppCompatTextView)textInputLayout0.findViewById(0x7F0B228E);  // id:textinput_error
            if(appCompatTextView0 != null) {
                gbfe.e(gbet0, gbdq2, appCompatTextView0);
            }
        }
        if(gbet0.e(gbdq1, new int[]{12}) && gbdq1.l(12, gbet0.d)) {
            int v = gbdq1.b(12, gbet0.d);
            textInputLayout0.w(v);
            textInputLayout0.S(ColorStateList.valueOf(v));
        }
        gbdq gbdq4 = gbdq1.d(10);
        if(gbdq4 != null) {
            int v1 = gbet0.d;
            if(gbdq4.l(3, v1) && gbet0.e(gbdq4, new int[]{3})) {
                ColorStateList colorStateList0 = textInputLayout0.s;
                ColorStateList colorStateList1 = ColorStateList.valueOf(gbdq4.b(3, v1));
                textInputLayout0.r = colorStateList1;
                textInputLayout0.s = colorStateList1;
                if(textInputLayout0.f != null) {
                    textInputLayout0.ai(false);
                }
                textInputLayout0.S(colorStateList0);
            }
        }
        if(gbdq3 != null) {
            if(gbet0.e(gbdq3, new int[]{3}) && gbdq3.l(3, gbet0.d)) {
                textInputLayout0.M(gbfd.a(gbet0, gbdq3));
            }
            AppCompatTextView appCompatTextView1 = (AppCompatTextView)textInputLayout0.findViewById(0x7F0B228F);  // id:textinput_helper_text
            if(appCompatTextView1 != null) {
                gbfe.e(gbet0, gbdq3, appCompatTextView1);
            }
        }
        if(gbet0.e(gbdq1, new int[]{3}) && gbdq1.l(3, gbet0.d)) {
            int v2 = gbdq1.b(3, gbet0.d);
            textInputLayout0.x(gbfd.b(v2, v2, v2));
            Drawable drawable0 = textInputLayout0.e.b();
            if(drawable0 != null) {
                drawable0.setColorFilter(new PorterDuffColorFilter(v2, PorterDuff.Mode.MULTIPLY));
            }
        }
        if(gbet0.e(gbdq1, new int[]{2}) && gbdq1.l(2, gbet0.d)) {
            int[] arr_v = gbdw.a(gbet0.d, gbdq1, false);
            switch(textInputLayout0.o) {
                case 1: {
                    if(hdlp0 == hdlp.e) {
                        textInputLayout0.v(((float)arr_v[0]), ((float)arr_v[1]), ((float)arr_v[2]), ((float)arr_v[3]));
                    }
                    else {
                        textInputLayout0.v(((float)arr_v[0]), ((float)arr_v[1]), 0.0f, 0.0f);
                    }
                    break;
                }
                case 2: {
                    textInputLayout0.v(((float)arr_v[0]), ((float)arr_v[1]), ((float)arr_v[2]), ((float)arr_v[3]));
                }
            }
        }
        gbdq gbdq5 = gbdp0.c().d(2);
        if(hdlp0 == hdlp.d || hdlp0 == hdlp.a) {
            int v3 = gbet0.b.getResources().getDimensionPixelSize(0x7F07152F);  // dimen:wallet_text_input_legacy_start_end_padding
            if(gbdq5 == null) {
                textInputLayout0.setPadding(v3, 0, v3, 0);
            }
            else if(gbet0.e(gbdq5, new int[]{1, 2, 3, 4})) {
                textInputLayout0.setPadding(textInputLayout0.getPaddingStart() + v3, textInputLayout0.getPaddingTop(), textInputLayout0.getPaddingEnd() + v3, textInputLayout0.getPaddingBottom());
            }
        }
        gbdq gbdq6 = gbdp0.b().d(16);
        if(gbdq6 != null) {
            EditText editText1 = textInputLayout0.f;
            if(editText1 != null) {
                gbdq gbdq7 = gbdq6.d(1);
                if(gbdq7 != null && gbet0.e(gbdq7, new int[]{1, 2, 3, 4})) {
                    int[] arr_v1 = gbez.e(gbet0, gbdq7);
                    editText1.setPaddingRelative(arr_v1[0], arr_v1[1], arr_v1[2], arr_v1[3]);
                }
                int v4 = gbet0.d;
                if(gbet0.e(gbdq6, new int[]{2}) && gbdq6.l(2, v4)) {
                    gawb.a(editText1, gbdq6.b(2, v4));
                }
            }
            int v5 = gbet0.d;
            if(gbet0.e(gbdq6, new int[]{3}) && gbdq6.l(3, v5)) {
                int v6 = gbez.c(gbdq6, 3, v5);
                if(hdlp0 != hdlp.e) {
                    if(v6 > 0) {
                        textInputLayout0.y(v6);
                        textInputLayout0.z(v6);
                    }
                }
                else if(v6 >= 0) {
                    textInputLayout0.y(v6);
                    textInputLayout0.z(v6);
                }
            }
            int v7 = gbet0.d;
            if(gbet0.e(gbdq6, new int[]{4}) && gbdq6.l(4, v7)) {
                int v8 = gbdq6.b(4, v7);
                if(textInputLayout0.p != v8) {
                    textInputLayout0.p = v8;
                    textInputLayout0.t = v8;
                    textInputLayout0.u = v8;
                    textInputLayout0.v = v8;
                    textInputLayout0.t();
                }
            }
        }
    }
}

