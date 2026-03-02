import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.SettingDisplayInfo;
import com.google.android.gms.udc.SettingState;
import j..util.DesugarCollections;
import java.io.IOException;

public final class eznf extends eznc {
    private static final gged_interceptors n;

    static {
        eznf.n = gged_interceptors.q(hfqt.b, hfqt.d, hfqt.f, hfqt.g, hfqt.j, hfqt.k);
    }

    public eznf(Context context0, ezpn ezpn0, baqr baqr0, String s, ezmy ezmy0, byte[] arr_b) {
        super(context0, ezpn0, baqr0, s, "FetchSettingDisplayInfoOperation", ezmy0, arr_b);
    }

    @Override  // eznd
    public final void f(Context context0) {
        hfqt hfqt0;
        super.f(context0);
        hfqk hfqk0 = (hfqk)((ProtoLiteMessage)hfql.a).v_newBuilder();
        try {
            this.h();
            hfqk0.A(this.b, hftc.a());
            Context context1 = this.c;
            String s = this.f;
            String s1 = this.k();
            String s2 = eznf.d(((hfql)hfqk0.b_message).d);
            if(!hfqk0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hfqk0).ensureMutable();
            }
            hfql hfql0 = (hfql)hfqk0.b_message;
            s2.getClass();
            hfql0.b |= 2;
            hfql0.d = s2;
            int v = 1;
            if(hzdo.c()) {
                ezqh.a().a();
                if(DesugarCollections.unmodifiableList(((hfql)hfqk0.b_message).e).size() != 1) {
                    throw new cjuh(4501, "FetchSettingDisplayInfoOperation requires exactly one setting ID.");
                }
                int v1 = ((hfql)hfqk0.b_message).e.d(0);
                switch(v1) {
                    case 0: {
                        hfqt0 = hfqt.a;
                        break;
                    }
                    case 1: {
                        hfqt0 = hfqt.g;
                        break;
                    }
                    case 2: {
                        hfqt0 = hfqt.d;
                        break;
                    }
                    default: {
                        if(v1 == 3) {
                            hfqt0 = hfqt.j;
                        }
                        else {
                            switch(v1) {
                                case 4: {
                                    hfqt0 = hfqt.k;
                                    break;
                                }
                                case 5: {
                                    hfqt0 = hfqt.f;
                                    break;
                                }
                                default: {
                                    if(v1 == 15) {
                                        hfqt0 = hfqt.e;
                                    }
                                    else {
                                        switch(v1) {
                                            case 7: {
                                                hfqt0 = hfqt.b;
                                                break;
                                            }
                                            case 8: {
                                                hfqt0 = hfqt.h;
                                                break;
                                            }
                                            case 9: {
                                                hfqt0 = hfqt.c;
                                                break;
                                            }
                                            case 10: {
                                                hfqt0 = hfqt.i;
                                                break;
                                            }
                                            default: {
                                                hfqt0 = null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if(hfqt0 == null || !eznf.n.contains(hfqt0)) {
                    throw new cjuh(4501, "Invalid setting ID, only top-level UDC settings are supported.");
                }
                SettingDisplayInfo settingDisplayInfo0 = new SettingDisplayInfo(new SettingState(v1, 999), "", "");
                boolean z = gfqz.e("me", ((hfql)hfqk0.b_message).d);
                String s3 = ((hfql)hfqk0.b_message).d;
                Intent intent0 = this.l(s, s3, (z ? null : s3), v1);
                this.d.g(new Status(0), settingDisplayInfo0, bbmq.g(context1, intent0, 0xA000000));
                return;
            }
            hfqy hfqy0 = ((hfql)hfqk0.b_message).f;
            if(hfqy0 == null) {
                hfqy0 = hfqy.a;
            }
            ProtoLiteBuilder hftp0 = this.g(hfqy0);
            hfqe hfqe0 = eztb.a(context1, s1);
            if(hfqe0 != null) {
                if(!hfqk0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hfqk0).ensureMutable();
                }
                ((hfql)hfqk0.b_message).c = hfqe0;
                ((hfql)hfqk0.b_message).b |= 1;
            }
            if(eznf.e(((hfql)hfqk0.b_message).d, s1)) {
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
            eztb.d((hfqm0.c == null ? hfqf.a : hfqm0.c), context1, s1);
            if(hfqm0.e.size() != 1) {
                throw new cjuh(4505, null);
            }
            hfqo hfqo0 = (hfqo)hfqm0.e.get(0);
            if(hfqq.a((hfqo0.c == null ? hfqr.a : hfqo0.c).d) == 5) {
                throw new cjuh(4501, null);
            }
            this.i(0);
            Intent intent1 = this.l(s, ((hfql)hfqk0.b_message).d, ((hfqm0.b & 8) == 0 ? null : (hfqm0.d == null ? hfqs.a : hfqm0.d).b), (hfqo0.c == null ? hfqr.a : hfqo0.c).b);
            hfqr hfqr0 = hfqo0.c;
            int v2 = (hfqr0 == null ? hfqr.a : hfqr0).b;
            if(hfqr0 == null) {
                hfqr0 = hfqr.a;
            }
            int v3 = hfqv.a(hfqr0.c);
            if(v3 != 0) {
                v = v3;
            }
            SettingDisplayInfo settingDisplayInfo1 = new SettingDisplayInfo(new SettingState(v2, v - 1), ((hfqo0.b & 0x20) == 0 ? null : (hfqo0.d == null ? hfqs.a : hfqo0.d).b), ((hfqo0.b & 0x40) == 0 ? null : (hfqo0.e == null ? hfqs.a : hfqo0.e).b));
            this.d.g(new Status(0), settingDisplayInfo1, bbmq.g(context1, intent1, 0xA000000));
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
        this.d.g(status0, null, null);
    }

    private final Intent l(String s, String s1, String s2, int v) {
        String s3;
        if(s2 != null) {
            Context context0 = this.c;
            switch(v) {
                case 2: {
                    s3 = "location";
                    break;
                }
                case 3: {
                    s3 = "ytsearch";
                    break;
                }
                case 4: {
                    s3 = "ytwatch";
                    break;
                }
                case 5: {
                    s3 = "audio";
                    break;
                }
                case 7: 
                case 9: {
                    s3 = "device";
                    break;
                }
                case 1: 
                case 8: 
                case 10: {
                    s3 = "app";
                    break;
                }
                default: {
                    s3 = "";
                }
            }
            String s4 = ezpz.a(context0);
            return new Intent("android.intent.action.VIEW").setData(eztn.a(s, Uri.parse(("https://myaccount.google.com/activitycontrols/" + s3)).buildUpon().appendQueryParameter("target_user_id", s1).appendQueryParameter("hl", s4).build().toString()));
        }
        Intent intent0 = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms");
        switch(v) {
            case 2: {
                return intent0.putExtra("extra.screenId", 0xE3).putExtra("extra.accountName", s);
            }
            case 3: {
                return intent0.putExtra("extra.screenId", 0xE4).putExtra("extra.accountName", s);
            }
            case 4: {
                return intent0.putExtra("extra.screenId", 0xE5).putExtra("extra.accountName", s);
            }
            case 5: {
                return intent0.putExtra("extra.screenId", 0xE1).putExtra("extra.accountName", s);
            }
            case 7: 
            case 9: {
                return intent0.putExtra("extra.screenId", 0xE2).putExtra("extra.accountName", s);
            }
            case 1: 
            case 8: 
            case 10: {
                return intent0.putExtra("extra.screenId", 0xE0).putExtra("extra.accountName", s);
            }
            default: {
                return intent0.putExtra("extra.screenId", 0xD4).putExtra("extra.accountName", s);
            }
        }
    }
}

