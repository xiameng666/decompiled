import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class alaa {
    public final byte[] a;
    public final String b;
    public static final int c;
    private static final ggfp d;
    private final String e;

    static {
        alaa.d = ggfp.L("auth", "magic_tether", "easy_unlock");
    }

    public alaa(String s, byte[] arr_b, String s1) {
        this.e = s;
        batl.s(arr_b);
        this.a = arr_b;
        batl.s(s1);
        this.b = s1;
    }

    public alaa(byte[] arr_b, String s) {
        this.e = null;
        batl.s(arr_b);
        this.a = arr_b;
        batl.s(s);
        this.b = s;
    }

    public final byte[] a() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            String s = this.e;
            if(s != null) {
                jSONObject0.put("permit_id", s);
            }
            jSONObject0.put("payload", Base64.encodeToString(this.a, 10));
            jSONObject0.put("feature", this.b);
            byte[] arr_b = jSONObject0.toString().getBytes("UTF-8");
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
            if(alaa.d.contains(this.b)) {
                dataOutputStream0.write(3);
                dataOutputStream0.writeShort(arr_b.length);
            }
            else {
                dataOutputStream0.write(4);
                dataOutputStream0.writeInt(arr_b.length);
            }
            dataOutputStream0.write(arr_b);
            return byteArrayOutputStream0.toByteArray();
        }
        catch(JSONException | IOException exception0) {
            throw new RuntimeException("Did not expect serialization to fail: ", exception0);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof alaa) && TextUtils.equals(this.e, ((alaa)object0).e) && Arrays.equals(this.a, ((alaa)object0).a) && TextUtils.equals(this.b, ((alaa)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.a, this.b});
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.a);
        return String.format("{\'%s\':\'%s\',\'%s\':\'%s\',\'%s\':\'%s\'}", "permit_id", this.e, "payload", s, "feature", this.b);
    }
}

