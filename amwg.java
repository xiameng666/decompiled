import android.text.TextUtils;
import j..util.function.Function.-CC;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

public final class amwg implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        amoi amoi6;
        amwt amwt0 = (amwt)object0;
        try {
            JSONObject jSONObject0 = (JSONObject)amwt0.b.get();
            String s = amwt0.a;
            String s1 = jSONObject0.getString("status");
            if(gfqz.e(s1, "OK")) {
                String s2 = jSONObject0.getJSONObject("result").getString("adr_address");
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)amoi.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                amoi amoi0 = (amoi)hftp0.b_message;
                amoi0.b |= 0x80;
                amoi0.j = s;
                Matcher matcher0 = amww.c.matcher(s2);
                boolean z = false;
                while(matcher0.find()) {
                    String s3 = matcher0.group(1);
                    String s4 = matcher0.group(2);
                    if(!TextUtils.isEmpty(s3) && !TextUtils.isEmpty(s4)) {
                        String s5 = amww.d(s4);
                        if("country-name".equals(s3)) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            amoi amoi1 = (amoi)hftp0.b_message;
                            s5.getClass();
                            amoi1.b |= 2;
                            amoi1.d = s5;
                        }
                        else if("postal-code".equals(s3)) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            amoi amoi2 = (amoi)hftp0.b_message;
                            s5.getClass();
                            amoi2.b |= 4;
                            amoi2.e = s5;
                        }
                        else if("region".equals(s3)) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            amoi amoi3 = (amoi)hftp0.b_message;
                            s5.getClass();
                            amoi3.b |= 16;
                            amoi3.g = s5;
                        }
                        else if("locality".equals(s3)) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            amoi amoi4 = (amoi)hftp0.b_message;
                            s5.getClass();
                            amoi4.b |= 0x20;
                            amoi4.h = s5;
                        }
                        else {
                            if(!"street-address".equals(s3)) {
                                continue;
                            }
                            hftp0.cf(s5);
                        }
                        z = true;
                    }
                }
                if(z) {
                    String s6 = amww.d(matcher0.replaceAll("$2"));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    amoi amoi5 = (amoi)hftp0.b_message;
                    s6.getClass();
                    amoi5.b |= 1;
                    amoi5.c = s6;
                    amoi6 = (amoi)hftp0.N_build();
                }
                else {
                    amoi6 = null;
                }
            }
            else {
                ((ggtj)amww.a.i()).B("Status not OK %s when retrieving postal address.", s1);
                amoi6 = null;
            }
            if(amoi6 == null) {
                ((ggtj)amww.a.j()).x("Failed to retrieve postal address.");
                return null;
            }
            return new amwu(s, amoi6);
        }
        catch(ExecutionException | InterruptedException | JSONException exception0) {
            a.ae(amww.a.j(), "Failed to retrieve postal address.", exception0);
            return null;
        }
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

