import android.os.Bundle;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse;
import j..util.Map.-EL;
import java.util.concurrent.CancellationException;

public final class buli extends lsb {
    public hiwq a;
    public hiwv b;
    public hiwt c;
    public String d;
    public long e;
    public final lqi f;
    private final bujj g;
    private final bula h;
    private final ibrt i;
    private final burh j;

    static {
        bboh.b("DetailsPageViewModel", bbcu.hd);
    }

    public buli(bujj bujj0, burh burh0, bula bula0, ibrt ibrt0, lrf lrf0) {
        ibuq.f(burh0, "getSmuiDetailsPageRpc");
        ProtoParsers.InternalDontUse protoParsers$InternalDontUse0;
        ibuq.f(bula0, "cache");
        ibuq.f(lrf0, "savedStateHandle");
        super();
        this.g = bujj0;
        this.j = burh0;
        this.h = bula0;
        this.i = ibrt0;
        buhn buhn0 = buho.a(((ProtoLiteMessage)buhn.a).v_newBuilder()).a();
        hftc hftc0 = hftc.a();
        Parcelable parcelable0 = (Parcelable)lrf0.d("smuiDetailsPageFragmentArgs");
        if((parcelable0 instanceof Bundle)) {
            ((Bundle)parcelable0).setClassLoader(ProtoParsers.InternalDontUse.class.getClassLoader());
            protoParsers$InternalDontUse0 = (ProtoParsers.InternalDontUse)((Bundle)parcelable0).getParcelable("protoparsers");
        }
        else {
            protoParsers$InternalDontUse0 = (ProtoParsers.InternalDontUse)parcelable0;
        }
        buhn buhn1 = (buhn)hfxk.b(protoParsers$InternalDontUse0, ((MessageLite)buhn0), hftc0);
        hiwq hiwq0 = buhn1.c == null ? hiwq.a : buhn1.c;
        ibuq.e(hiwq0, "getCategory(...)");
        this.a = hiwq0;
        hiwv hiwv0 = buhn1.d == null ? hiwv.a : buhn1.d;
        ibuq.e(hiwv0, "getSorting(...)");
        this.b = hiwv0;
        hiwt hiwt0 = buhn1.e == null ? hiwt.a : buhn1.e;
        ibuq.e(hiwt0, "getFilter(...)");
        this.c = hiwt0;
        this.d = "";
        this.f = new lqi(bule.a);
    }

    public final hiux a() {
        int v1;
        hiuz hiuz0 = hiuy.a(((ProtoLiteMessage)hiux.a).v_newBuilder());
        hiwq hiwq0 = this.a;
        ibuq.f(hiwq0, "value");
        ProtoLiteBuilder hftp0 = hiuz0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hiux hiux0 = (hiux)hftp0.b_message;
        hiwq0.getClass();
        hiux0.d = hiwq0;
        hiux0.b |= 2;
        hiwv hiwv0 = this.b;
        int v = hiwv0.b;
        if(v == 0) {
            v1 = 2;
        }
        else {
            v1 = 3;
            switch(v) {
                case 1: {
                    break;
                }
                case 2: {
                    v1 = 4;
                    break;
                }
                case 3: {
                    v1 = 5;
                    break;
                }
                default: {
                    v1 = 0;
                }
            }
        }
        if(v1 != 2) {
            ibuq.f(hiwv0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hiux hiux1 = (hiux)hftp0.b_message;
            hiwv0.getClass();
            hiux1.e = hiwv0;
            hiux1.b |= 4;
        }
        hiwt hiwt0 = this.c;
        String s = hiwt0.b;
        ibuq.e(s, "getFilterLabel(...)");
        if(s.length() != 0) {
            ibuq.f(hiwt0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hiux hiux2 = (hiux)hftp0.b_message;
            hiwt0.getClass();
            hiux2.f = hiwt0;
            hiux2.b |= 8;
        }
        if(this.d.length() != 0) {
            String s1 = this.d;
            ibuq.f(s1, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hiux hiux3 = (hiux)hftp0.b_message;
            s1.getClass();
            hiux3.g = s1;
        }
        return hiuz0.a();
    }

    public final Object b(ibrl ibrl0) {
        bulg bulg0;
        if((ibrl0 instanceof bulg)) {
            bulg0 = (bulg)ibrl0;
            int v = bulg0.c;
            if((v & 0x80000000) == 0) {
                bulg0 = new bulg(this, ibrl0);
            }
            else {
                bulg0.c = v - 0x80000000;
            }
        }
        else {
            bulg0 = new bulg(this, ibrl0);
        }
        Object object0 = bulg0.a;
        Object object1 = ibrx.a;
        switch(bulg0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    hiux hiux0 = this.a();
                    bulg0.c = 1;
                    hixg hixg0 = bure.a(bure.b(((hixg)this.j.b.a().q(cmlp.a, ckhl.b))), this.j.a);
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hiux0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)hiux0));
                    hiuz hiuz0 = hiuy.a(hftp0);
                    hiwm hiwm0 = busb.a;
                    ibuq.f(hiwm0, "value");
                    ProtoLiteBuilder hftp1 = hiuz0.a;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hiux hiux1 = (hiux)hftp1.b_message;
                    hiwm0.getClass();
                    hiux1.c = hiwm0;
                    hiux1.b |= 1;
                    object0 = hixg0.c(hiuz0.a(), new iaof_metadata(), bulg0);
                    if(object0 == object1) {
                        return object1;
                    label_32:
                        ibnx.b(object0);
                    }
                    this.e = ((hivl)object0).f;
                    if(ibuq.m(this.d, "")) {
                        bula bula0 = this.h;
                        hivd hivd0 = ((hivl)object0).e;
                        if(hivd0 == null) {
                            hivd0 = hivd.a;
                        }
                        ibuq.e(hivd0, "getDeletionDialog(...)");
                        ibuq.f(hivd0, "<set-?>");
                        bula0.b = hivd0;
                    }
                    hiux hiux2 = this.a();
                    bukx bukx0 = buky.a(this.g.a, hiux2);
                    ibuq.f(((hivl)object0), "response");
                    this.h.a.put(bukx0, ((hivl)object0));
                    return new buld(((hivl)object0));
                }
                catch(iapl | iapn | CancellationException exception0) {
                    break;
                }
            }
            case 1: {
                goto label_32;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return new bulb(exception0);
    }

    public final void c() {
        lqi lqi0 = this.f;
        lqi0.ii(bulc.a);
        hiux hiux0 = this.a();
        bukx bukx0 = buky.a(this.g.a, hiux0);
        hivl hivl0 = (hivl)Map.-EL.getOrDefault(this.h.a, bukx0, null);
        if(hivl0 != null) {
            lqi0.ii(new buld(hivl0));
            return;
        }
        icck icck0 = lsc.a(this);
        bulh bulh0 = new bulh(this, null);
        icbb.b(icck0, this.i, null, bulh0, 2);
    }

    public final void e() {
        this.d = "";
    }
}

