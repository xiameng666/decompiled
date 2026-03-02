import j..util.DesugarTimeZone;
import j..util.Objects;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class hmkx {
    public final hmlg a;
    private final hmkv b;
    private final hmkt c;

    public hmkx(hmlg hmlg0, hmqm hmqm0) {
        this.a = hmlg0;
        this.b = new hmkv(hmlg0);
        this.c = new hmkt(hmlg0);
    }

    public final int a(hmli hmli0, hmli hmli1) {
        if(hmli0 == null) {
            hmli0 = this.a.f.a().a();
        }
        return hmli0.b(hmli1.a);
    }

    public final hmli b(hmli hmli0, hmli hmli1) {
        String s;
        if(hmli0 == null) {
            hmli hmli2 = this.a.f.a().a();
            s = (String)this.b.b(hmli2, new String());
        }
        else {
            s = null;
        }
        String s1 = hmli0 == null ? "" + s : String.valueOf(hmli0.a);
        if(hmli1 != null) {
            s1 = s1 + hmli1.a;
        }
        return new hmli(s1);
    }

    public final hmli c(hmlf hmlf0, hmli hmli0) {
        Object object0 = hmli0.a;
        if((object0 instanceof String)) {
            String[] arr_s = ((String)object0).split(":");
            if(arr_s.length > 1 && arr_s[0].equals("cd")) {
                StringBuilder stringBuilder0 = new StringBuilder();
                for(int v = 1; v < arr_s.length; ++v) {
                    stringBuilder0.append(arr_s[v]);
                    stringBuilder0.append(":");
                }
                stringBuilder0.deleteCharAt(stringBuilder0.length() - 1);
                stringBuilder0.setLength(0);
                char[] arr_c = hmlf0.b;
                stringBuilder0.append(Arrays.copyOfRange(arr_c, 0, hmlf0.a + 1));
                this.n(hmlf0, stringBuilder0.toString().toCharArray(), stringBuilder0);
                stringBuilder0.append(Arrays.copyOfRange(arr_c, hmlf0.a + 1, arr_c.length));
                hmlf0.b = stringBuilder0.toString().toCharArray();
                return new hmli(Boolean.valueOf(true));
            }
            return new hmli(((String)object0));
        }
        return hmli0;
    }

    public final hmli d(JSONObject jSONObject0, String s) {
        hmli hmli0 = null;
        try {
            hmli0 = this.c.c(jSONObject0, s);
        }
        catch(Exception unused_ex) {
        }
        if(hmli0 != null && !hmli0.b) {
            Object object0 = hmli0.a;
            if((object0 instanceof JSONObject)) {
                if(((JSONObject)object0).length() > 0) {
                    return hmli0;
                }
            }
            else if(!(object0 instanceof JSONArray) || ((JSONArray)object0).length() > 0) {
                return hmli0;
            }
        }
        String[] arr_s = s.split("~");
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arr_s.length - 1; ++v) {
            stringBuilder0.append(arr_s[v]);
            stringBuilder0.append("~");
        }
        stringBuilder0.append("default");
        return this.c.c(jSONObject0, stringBuilder0.toString());
    }

    public final String e(ByteBuffer byteBuffer0, String s) {
        byte[] arr_b;
        if(byteBuffer0 == null) {
            hmli hmli0 = this.a.f.a().a();
            ByteBuffer byteBuffer1 = ByteBuffer.allocate(1);
            arr_b = ((ByteBuffer)this.b.b(hmli0, byteBuffer1)).array();
        }
        else {
            arr_b = byteBuffer0.array();
        }
        hmlx.g(arr_b);
        if(s != null && !s.isEmpty()) {
            String s1 = hmlx.i(s);
            if(s1 != null) {
                return s1.equals("none") ? new String(arr_b, StandardCharsets.US_ASCII) : new String(arr_b, Charset.forName(s1));
            }
            throw new hmki("Not supported string encoding : " + s);
        }
        return new String(arr_b, StandardCharsets.US_ASCII);
    }

    public final String f(hmkf hmkf0, String s, String s1, String s2) {
        if(hmkf0 == null) {
            hmli hmli0 = this.a.f.a().a();
            hmkf hmkf1 = new hmkf(1L);
            hmkf0 = (hmkf)this.b.b(hmli0, hmkf1);
        }
        if(s == null || s.isEmpty()) {
            s = "UTC";
        }
        if(s2 == null || s2.isEmpty()) {
            s2 = hmke.e.toString();
        }
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat(s1, hmlx.j(s2));
        simpleDateFormat0.setTimeZone(DesugarTimeZone.getTimeZone(s));
        return simpleDateFormat0.format(hmkf0.a.getTime());
    }

    public final ByteBuffer g(ByteBuffer byteBuffer0, String s) {
        byte[] arr_b;
        if(byteBuffer0 == null) {
            hmli hmli0 = this.a.f.a().a();
            ByteBuffer byteBuffer1 = ByteBuffer.allocate(1);
            arr_b = ((ByteBuffer)this.b.b(hmli0, byteBuffer1)).array();
        }
        else {
            arr_b = byteBuffer0.array();
        }
        hmlx.g(arr_b);
        switch(s) {
            case "base16": 
            case "hex": {
                hmlx.g(hmlx.m(arr_b));
                return ByteBuffer.wrap(hmlx.m(arr_b));
            }
            case "base64": {
                hmlx.g(hmql.a(arr_b));
                return ByteBuffer.wrap(hmql.a(arr_b));
            }
            case "none": {
                hmlx.g(arr_b);
                return byteBuffer0;
            }
            default: {
                throw new hmki("Not supported numeric encoding : " + s);
            }
        }
    }

    public final ByteBuffer h(ByteBuffer byteBuffer0, boolean z, boolean z1) {
        byte[] arr_b;
        if(byteBuffer0 == null) {
            hmli hmli0 = this.a.f.a().a();
            ByteBuffer byteBuffer1 = ByteBuffer.allocate(1);
            arr_b = ((ByteBuffer)this.b.b(hmli0, byteBuffer1)).array();
        }
        else {
            arr_b = byteBuffer0.array();
        }
        hmlx.g(arr_b);
        if(z) {
            arr_b = hmlx.o(arr_b);
            if(z1) {
                hmlx.p(arr_b);
            }
        }
        else if(z1) {
            hmlx.p(arr_b);
        }
        hmlx.g(arr_b);
        return ByteBuffer.wrap(arr_b);
    }

    public final boolean i(ByteBuffer byteBuffer0, int v) {
        byte[] arr_b;
        if(v == 0) {
            throw new hmki("Bit position should start from 1");
        }
        if(byteBuffer0 == null) {
            hmli hmli0 = this.a.f.a().a();
            ByteBuffer byteBuffer1 = ByteBuffer.allocate(1);
            arr_b = ((ByteBuffer)this.b.b(hmli0, byteBuffer1)).array();
        }
        else {
            arr_b = byteBuffer0.array();
        }
        hmlx.g(arr_b);
        int v1 = v % 8;
        int v2 = v / 8;
        if(v1 == 0) {
            --v2;
            v1 = 0;
        }
        int v3 = ((byte)v1) <= 0 ? 1 : 0x80 >> v1 - 1;
        return (arr_b[v2] & ((byte)v3)) == ((byte)v3);
    }

    public final boolean j(hmli hmli0, hmli hmli1) {
        if(hmli0 == null) {
            hmli0 = this.a.f.a().a();
        }
        return this.a(hmli0, hmli1) == 0;
    }

    public final void k(hmlf hmlf0, String s, String s1) {
        JSONArray jSONArray0;
        try {
            jSONArray0 = this.a.a.getJSONObject("minifiedFunctionMap").getJSONArray(s1);
        }
        catch(Exception unused_ex) {
            return;
        }
        if(jSONArray0 != null && jSONArray0.length() > 0) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("executeSequential(");
            if(s != null && !s.isEmpty()) {
                stringBuilder0.append(s);
                stringBuilder0.append(",");
            }
            for(int v = 0; v < jSONArray0.length(); ++v) {
                stringBuilder0.append(jSONArray0.getString(v));
                stringBuilder0.append(",");
            }
            stringBuilder0.deleteCharAt(stringBuilder0.length() - 1);
            stringBuilder0.append(")");
            char[] arr_c = hmlf0.b;
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(Arrays.copyOfRange(arr_c, 0, hmlf0.a + 1));
            this.n(hmlf0, stringBuilder0.toString().toCharArray(), stringBuilder1);
            stringBuilder1.append(Arrays.copyOfRange(arr_c, hmlf0.a + 1, arr_c.length));
            hmlf0.b = stringBuilder1.toString().toCharArray();
        }
    }

    public static final hmli l(int v, List list0) {
        return v < 0 || v >= list0.size() ? new hmli(Boolean.valueOf(true)) : ((hmli)list0.get(v));
    }

    public static final boolean m(hmli hmli0) {
        if(!hmli0.b && !hmli0.c) {
            return !(hmli0.a instanceof Boolean) || !hmli0.a.equals(Boolean.TRUE) ? !(hmli0.a instanceof Boolean) : true;
        }
        return false;
    }

    private final void n(hmlf hmlf0, char[] arr_c, StringBuilder stringBuilder0) {
        hmle hmle0;
        LinkedList linkedList0 = new LinkedList(this.a.f.b);
        while(true) {
            hmle0 = null;
            if(linkedList0.isEmpty()) {
                break;
            }
            if(!((hmle)linkedList0.peek()).h.isEmpty()) {
                hmle0 = (hmle)linkedList0.pop();
                break;
            }
            linkedList0.pop();
        }
        if(hmle0 != null) {
            Deque deque0 = hmle0.h;
            if(((hmlj)Objects.requireNonNull(((hmlj)deque0.peek()))).h <= 0) {
                hmlj hmlj0 = (hmlj)deque0.peek();
                hmlj0.h = hmlf0.a + 1;
            }
        }
        stringBuilder0.append('.');
        stringBuilder0.append(arr_c);
        if(hmle0 != null) {
            Deque deque1 = hmle0.h;
            if(!deque1.isEmpty()) {
                int v = ((hmlj)deque1.peek()).i;
                if(v == 0) {
                    hmlj hmlj1 = (hmlj)deque1.peek();
                    hmlj1.i = hmlf0.a + 1 + arr_c.length + 1;
                    return;
                }
                hmlj hmlj2 = (hmlj)deque1.peek();
                hmlj2.i = v + arr_c.length + 1;
            }
        }
    }
}

