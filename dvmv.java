import android.util.Base64;
import com.google.android.gms.pay.pass.valuable.model.prompt.UserDataPrompt;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

public final class dvmv {
    public static gged_interceptors a(List list0) {
        dvmx dvmx0;
        guxi guxi0;
        ggdy ggdy0 = gged_interceptors.e(list0.size());
        for(Object object0: list0) {
            guxm guxm0 = (guxm)object0;
            Integer integer0 = null;
            switch(guxm0.d) {
                case 0: {
                    guxi0 = guxi.a;
                    break;
                }
                case 1: {
                    guxi0 = guxi.b;
                    break;
                }
                case 2: {
                    guxi0 = guxi.c;
                    break;
                }
                case 3: {
                    guxi0 = guxi.d;
                    break;
                }
                case 4: {
                    guxi0 = guxi.e;
                    break;
                }
                default: {
                    guxi0 = null;
                }
            }
            if(guxi0 == null) {
                guxi0 = guxi.f;
            }
            switch(((guxi)MoreObjects.firstNonNull(guxi0, guxi.a)).ordinal()) {
                case 1: {
                    dvmx0 = dvmx.a;
                    break;
                }
                case 2: {
                    dvmx0 = (guxo.b(guxm0.c) == null ? guxo.x : guxo.b(guxm0.c)) == guxo.i ? dvmx.c : dvmx.b;
                    break;
                }
                case 3: {
                    dvmx0 = dvmx.d;
                    break;
                }
                case 4: {
                    dvmx0 = dvmx.e;
                    break;
                }
                default: {
                    dvmx0 = dvmx.f;
                }
            }
            String s = "";
            if(dvmx0 != dvmx.d) {
                if(dvmx0 != dvmx.e) {
                    s = guxm0.f;
                }
                else if((guxm0.b & 2) != 0) {
                    s = dshy.a((guxm0.h == null ? guut.a : guxm0.h));
                }
            }
            else if((guxm0.b & 1) != 0) {
                s = fscd.i((guxm0.g == null ? gtlg.a : guxm0.g));
            }
            if((guxo.b(guxm0.c) == null ? guxo.x : guxo.b(guxm0.c)) == guxo.h) {
                integer0 = (int)7;
            }
            guxo guxo0 = guxo.b(guxm0.c) == null ? guxo.x : guxo.b(guxm0.c);
            ggdy0.i(new UserDataPrompt(ftqn.a(guxo.class, guxo0), dvmx0, guxm0.e, s, guxm0.k, guxm0.i, guxm0.j, integer0));
        }
        return ggdy0.h();
    }

    public static gged_interceptors b(List list0, String s) {
        return gged_interceptors.i(ggia.h(list0, new dvmu(s)));
    }

    public static gtlg c(String s, String s1) {
        DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getInstance();
        decimalFormat0.setParseBigDecimal(true);
        try {
            return edok.a(((long)(((BigDecimal)decimalFormat0.parse(s1)).doubleValue() * 1000000.0)), s);
        }
        catch(ParseException parseException0) {
            throw new IllegalArgumentException(parseException0);
        }
    }

    public static byte[] d(List list0) {
        gpzt gpzt0 = new gpzt();
        for(Object object0: list0) {
            guxn guxn0 = (guxn)object0;
            if(!guxn0.d.isEmpty()) {
                gpzt0.m(guxn0.g, guxn0.d);
            }
        }
        Charset charset0 = Charset.forName("UTF-8");
        return ("userProfile=" + Base64.encodeToString(gpzt0.toString().getBytes(), 10)).getBytes(charset0);
    }
}

