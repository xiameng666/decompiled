import android.accounts.Account;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import j..util.DesugarCollections;
import j..util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.List;

public final class dwkl extends lsb {
    public static final bboh a;
    public final Account b;
    public final dvgq c;
    public final domj d;
    public final Valuable e;
    public final lqi f;
    public final lqi g;
    public final lqi h;
    public final azts i;

    static {
        dwkl.a = bboh.b("Pay", bbcu.cZ);
    }

    public dwkl(lrf lrf0, azts azts0, Account account0, dvgq dvgq0, domj domj0) {
        this.i = azts0;
        this.b = account0;
        this.c = dvgq0;
        this.d = domj0;
        this.f = new lqi(ggna.a);
        this.g = new lqi();
        this.h = new lqi();
        Valuable valuable0 = (Valuable)lrf0.d("VALUABLE");
        if(valuable0 == null) {
            throw new IllegalArgumentException("Valuable is missing");
        }
        this.e = valuable0;
        icbb.b(lsc.a(this), null, null, new dwkk(this, null), 3);
    }

    public final int a() {
        if(this.l()) {
            Valuable valuable0 = this.e;
            if(valuable0.k().i()) {
                return ((Number)valuable0.k().d()).intValue();
            }
        }
        return this.l() ? 0 : 18;
    }

    public final gjce b(List list0, gkad gkad0, gkaf gkaf0) {
        ibuq.f(list0, "formFieldStateList");
        ibuq.f(gkad0, "endingState");
        gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
        gjzs gjzs0 = gjzr.a(((ProtoLiteMessage)gkbe.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkag.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        int v = this.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkag gkag0 = (gkag)hftp0.b_message;
        gkag0.b |= 1;
        gkag0.c = v;
        String s = this.e.b;
        ibuq.e(s, "id");
        ibuq.f(s, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkag gkag1 = (gkag)hftp0.b_message;
        s.getClass();
        gkag1.b |= 2;
        gkag1.d = s;
        List list1 = DesugarCollections.unmodifiableList(gkag1.e);
        ibuq.e(list1, "getFormFieldStatesList(...)");
        new hfxu(list1);
        ibuq.f(list0, "values");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkag gkag2 = (gkag)hftp0.b_message;
        hfuo hfuo0 = gkag2.e;
        if(!hfuo0.c()) {
            gkag2.e = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(list0, gkag2.e);
        ibuq.f(gkad0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gkag)hftv0).f = gkad0.e;
        ((gkag)hftv0).b |= 4;
        if(gkaf0 != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gkag)hftp0.b_message).g = gkaf0.f;
            ((gkag)hftp0.b_message).b |= 8;
        }
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((gkag)hftv1), "value");
        ProtoLiteBuilder hftp1 = gjzs0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkbe gkbe0 = (gkbe)hftp1.b_message;
        ((gkag)hftv1).getClass();
        gkbe0.s = (gkag)hftv1;
        gkbe0.b |= 0x10000;
        gjca0.f(gjzs0.a());
        String s1 = this.d.a();
        gjca0.b(ghfs.a.c(s1, StandardCharsets.UTF_8).c());
        return gjca0.a();
    }

    public final gvcd c() {
        return (gvcd)this.e.i().g();
    }

    public final String e() {
        String s;
        if(this.l()) {
            Valuable valuable0 = this.e;
            if(valuable0.i().i()) {
                s = ((gvcd)valuable0.i().d()).f;
            }
            else {
                s = this.l() ? "" : this.h();
            }
        }
        else {
            s = this.l() ? "" : this.h();
        }
        ibuq.c(s);
        return s;
    }

    public final String f() {
        String s;
        if(this.l()) {
            Valuable valuable0 = this.e;
            if(valuable0.i().i()) {
                s = ((gvcd)valuable0.i().d()).e;
            }
            else {
                s = this.l() ? "" : this.i();
            }
        }
        else {
            s = this.l() ? "" : this.i();
        }
        ibuq.c(s);
        return s;
    }

    public final String g() {
        String s = this.e.p.c;
        ibuq.e(s, "getGroupingId(...)");
        return s;
    }

    public final String h() {
        String s = this.e.p.f;
        ibuq.e(s, "getGroupingSubtitle(...)");
        return s;
    }

    public final String i() {
        String s = this.e.p.e;
        ibuq.e(s, "getGroupingTitle(...)");
        return s;
    }

    public final void j(guxv guxv0) {
        if((guxv0.b & 1) != 0) {
            evql evql0 = this.i.aS(this.b);
            evql0.b(new dwkb(new dwjy(this, guxv0)));
            evql0.A(new dwkc(this));
            return;
        }
        ((ggtj)dwkl.a.i()).x("No valuable found in the response");
        this.g.l(gkaf.c);
    }

    public final void k(gvcd gvcd0) {
        ibuq.f(gvcd0, "updatedInputForm");
        if(gvcd0.g) {
            dvgq dvgq0 = this.c;
            gveu gveu0 = this.e.a;
            gvci gvci0 = gveu0.b == 11 ? ((gvci)gveu0.c) : gvci.a;
            dwkd dwkd0 = new dwkd(this);
            dwke dwke0 = new dwke(this);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvcl.a).v_newBuilder();
            String s = gvci0.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((gvcl)hftv0).c = s;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            gvcd0.getClass();
            ((gvcl)hftv1).d = gvcd0;
            ((gvcl)hftv1).b |= 1;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvcl gvcl0 = (gvcl)hftp0.b_message;
            gvci0.getClass();
            gvcl0.e = gvci0;
            gvcl0.b |= 2;
            int v = gvci0.i.size();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((gvcl)hftv2).g = v;
            ggfp ggfp0 = dvgq0.b;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvcl gvcl1 = (gvcl)hftp0.b_message;
            hfuf hfuf0 = gvcl1.f;
            if(!hfuf0.c()) {
                gvcl1.f = ProtoLiteMessage.C(hfuf0);
            }
            for(Object object0: ggfp0) {
                gvcl1.f.i(((guwh)object0).a());
            }
            gvcl gvcl2 = (gvcl)hftp0.N_build();
            dptv.m(dvgq0.a, dpuj.bl, ((MessageLite)gvcl2), ((MessageLite)gvcm.a), dwkd0, dwke0);
            return;
        }
        gveu gveu1 = this.e.a;
        this.c.a((gveu1.b == 8 ? ((guxp)gveu1.c) : guxp.a).c, Optional.empty(), Optional.empty(), Optional.of(gvcd0), new dwkh(this), new dwki(this));
    }

    public final boolean l() {
        return this.e.r == guvj.g;
    }

    public static gjce m(dwkl dwkl0, List list0, gkad gkad0) {
        return dwkl0.b(list0, gkad0, null);
    }
}

