import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

public class ejub extends bakp {
    protected final String d;
    protected int e;
    private final boolean f;

    public ejub(DataHolder dataHolder0, int v, String s) {
        super(dataHolder0, v);
        this.d = s;
        this.f = TextUtils.isEmpty(s);
    }

    protected static String G(String s, String s1) {
        return TextUtils.isEmpty(s) ? s1 : s + s1;
    }

    protected final List H(String s) {
        if(this.v(s)) {
            return new ArrayList(0);
        }
        String s1 = this.r(s);
        List list0 = new ArrayList();
        if(!TextUtils.isEmpty(s1)) {
            String[] arr_s = TextUtils.split(s1, ",");
            for(int v = 0; v < arr_s.length; ++v) {
                list0.add(Integer.valueOf(arr_s[v]));
            }
        }
        return list0;
    }

    protected final Double m(String s) {
        if(this.v(s)) {
            return null;
        }
        int v = this.b;
        int v1 = this.c;
        this.a.c(s, v);
        return this.a.e[v1].getDouble(v, this.a.d.getInt(s));
    }

    protected final Integer n(String s) {
        return this.v(s) ? null : this.q(s);
    }

    protected final Long o(String s) {
        if(this.v(s)) {
            return null;
        }
        int v = this.b;
        int v1 = this.c;
        this.a.c(s, v);
        return this.a.e[v1].getLong(v, this.a.d.getInt(s));
    }

    protected final String p(String s) {
        return this.f ? s : this.d + s;
    }

    @Override  // bakp
    protected final void s(int v) {
        super.s(v);
        this.e = this.a.a(this.b);
    }
}

