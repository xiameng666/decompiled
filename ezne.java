import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

public final class ezne extends eznc {
    public ezne(Context context0, ezpn ezpn0, baqr baqr0, String s, ezmy ezmy0, byte[] arr_b) {
        super(context0, ezpn0, baqr0, s, "FetchOverviewConfigOperation", ezmy0, arr_b);
    }

    @Override  // eznd
    public final void f(Context context0) {
        super.f(context0);
        if(hzdo.c()) {
            ezqh.a().a();
            return;
        }
        hfqk hfqk0 = (hfqk)((ProtoLiteMessage)hfql.a).v_newBuilder();
        try {
            this.h();
            hfqk0.A(this.b, hftc.a());
            hfqy hfqy0 = ((hfql)hfqk0.b_message).f;
            if(hfqy0 == null) {
                hfqy0 = hfqy.a;
            }
            ProtoLiteBuilder hftp0 = this.g(hfqy0);
            Context context1 = this.c;
            String s = this.k();
            hfqe hfqe0 = eztb.a(context1, s);
            if(hfqe0 != null) {
                if(!hfqk0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hfqk0).ensureMutable();
                }
                ((hfql)hfqk0.b_message).c = hfqe0;
                ((hfql)hfqk0.b_message).b |= 1;
            }
            String s1 = ezne.d(((hfql)hfqk0.b_message).d);
            if(!hfqk0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hfqk0).ensureMutable();
            }
            hfql hfql0 = (hfql)hfqk0.b_message;
            s1.getClass();
            hfql0.b |= 2;
            hfql0.d = s1;
            if(ezne.e(hfql0.d, s)) {
                ezog ezog0 = this.c();
                ezof ezof0 = ezog0.a();
                if(Status.b.equals(ezof0.a)) {
                    if(!hfqk0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hfqk0).ensureMutable();
                    }
                    ((hfql)hfqk0.b_message).g = hfvv.a;
                    hfqk0.a(ezof0.b);
                }
                hfqx hfqx0 = ezog0.c();
                if(hfqx0 == null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hfqy)hftp0.b_message).e = null;
                    ((hfqy)hftp0.b_message).b &= 0xFFFFFF7F;
                }
                else {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hfqy)hftp0.b_message).e = hfqx0;
                    ((hfqy)hftp0.b_message).b |= 0x80;
                }
            }
            if(!hfqk0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hfqk0).ensureMutable();
            }
            hfql hfql1 = (hfql)hfqk0.b_message;
            hfqy hfqy1 = (hfqy)hftp0.N_build();
            hfqy1.getClass();
            hfql1.f = hfqy1;
            hfql1.b |= 8;
            hfqm hfqm0 = this.a.a(this.e, ((hfql)((ProtoLiteBuilder)hfqk0).N_build()));
            eztb.d((hfqm0.c == null ? hfqf.a : hfqm0.c), context1, s);
            this.i(0);
            ezpn ezpn0 = this.d;
            byte[] arr_b = hfqm0.toBytesArray();
            ezpn0.e(Status.b, arr_b);
        }
        catch(acse unused_ex) {
            throw new cjuh(4504, null);
        }
        catch(VolleyError volleyError0) {
            throw this.b(volleyError0);
        }
        catch(hfur unused_ex) {
            throw new cjuh(4503, null);
        }
        catch(IOException unused_ex) {
            throw new cjuh(4505, null);
        }
        catch(eznt unused_ex) {
            throw new cjuh(10, null);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.i(status0.i);
        this.d.e(status0, null);
    }
}

