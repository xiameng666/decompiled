import android.accounts.Account;
import android.content.Context;
import android.database.CursorWindow;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class bgja extends bggt {
    private final bdhz a;
    private final CredentialManagerInvocationParams b;

    public bgja(bdhz bdhz0, CredentialManagerInvocationParams credentialManagerInvocationParams0, azug azug0) {
        super("runPasswordCheckupAndGetResult", azug0);
        this.a = bdhz0;
        this.b = credentialManagerInvocationParams0;
    }

    @Override  // bggt
    protected final void b(Context context0) {
        Bundle bundle0;
        gfsx gfsx1;
        Account account0 = new Account(this.b.a.a, "com.google");
        gfsx gfsx0 = bgkz.a(account0, context0);
        if(!gfsx0.i()) {
            throw new bebz(0xA9F3, "Checkup for local passwords needs a synced account to run.");
        }
        bggq bggq0 = bgid.c(account0, ((Account)gfsx0.d()), context0, grck.c);
        bgic bgic0 = (bgic)evrg.n(bggq0.f.a().g(new bggi(bggq0)));
        ggdy ggdy0 = new ggdy();
        gged_interceptors gged0 = bgic0.b;
        int v = ((ggna)gged0).c;
        int v1 = 0;
        while(v1 < v) {
            bggc bggc0 = (bggc)gged0.get(v1);
            gged_interceptors gged1 = bggc0.b;
            graz graz0 = bggc0.a;
            grbf grbf0 = (grbf)((ProtoLiteMessage)grbg.a).v_newBuilder();
            int v2 = gged1.size();
            int v3 = 0;
            int v4 = 0;
            while(v3 < v2) {
                bgiw bgiw0 = (bgiw)gged1.get(v3);
                gged_interceptors gged2 = bgiw0.a;
                v4 += gged2.size();
                gged_interceptors gged3 = bgiw0.b;
                grbb grbb0 = (grbb)((ProtoLiteMessage)grbe.b).v_newBuilder();
                int v5 = gged2.size();
                int v6 = 0;
                while(v6 < v5) {
                    bedh bedh0 = (bedh)gged2.get(v6);
                    gged_interceptors gged4 = bedh0.a.c();
                    gqmd gqmd0 = bedh0.a;
                    gged_interceptors gged5 = ggch.j(gged4).l(new bggu()).n();
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grax.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    grax grax0 = (grax)hftp0.b_message;
                    grax0.b();
                    hfrj.E(gged5, grax0.c);
                    hhyo hhyo0 = bedh0.b;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((grax)hftp0.b_message).d = hhyo0;
                    ((grax)hftp0.b_message).b |= 1;
                    ggfp ggfp0 = gqmd0.d();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    grax grax1 = (grax)hftp0.b_message;
                    hfuo hfuo0 = grax1.e;
                    if(!hfuo0.c()) {
                        grax1.e = ProtoLiteMessage.E(hfuo0);
                    }
                    hfrj.E(ggfp0, grax1.e);
                    if(gqmd0.a().i()) {
                        Object object0 = gqmd0.a().d();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        grax grax2 = (grax)hftp0.b_message;
                        grax2.b |= 2;
                        grax2.f = (String)object0;
                    }
                    if(!gged5.isEmpty()) {
                        heqb heqb0 = (heqb)gged5.get(0);
                        switch(graz0.ordinal()) {
                            case 1: {
                                hept hept0 = heqb0.s == null ? hept.a : heqb0.s;
                                gfsx1 = bggv.a((hept0.c == null ? heps.a : hept0.c));
                                hept hept1 = heqb0.s == null ? hept.a : heqb0.s;
                                gfsx gfsx2 = bggv.a((hept1.f == null ? heps.a : hept1.f));
                                if(gfsx2.i() && gfsx1.i()) {
                                    gfsx1 = gfsx.m(Boolean.valueOf(((Boolean)gfsx2.d()).booleanValue() || ((Boolean)gfsx1.d()).booleanValue()));
                                }
                                else if(gfsx2.i()) {
                                    gfsx1 = gfsx2;
                                }
                                else if(!gfsx1.i()) {
                                    gfsx1 = gfqx.a;
                                }
                                break;
                            }
                            case 2: {
                                hept hept2 = heqb0.s == null ? hept.a : heqb0.s;
                                gfsx1 = bggv.a((hept2.e == null ? heps.a : hept2.e));
                                break;
                            }
                            case 3: {
                                hept hept3 = heqb0.s == null ? hept.a : heqb0.s;
                                gfsx1 = bggv.a((hept3.d == null ? heps.a : hept3.d));
                                break;
                            }
                            default: {
                                gfsx1 = gfqx.a;
                            }
                        }
                        if(gfsx1.i()) {
                            boolean z = ((Boolean)gfsx1.d()).booleanValue();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            grax grax3 = (grax)hftp0.b_message;
                            grax3.b |= 4;
                            grax3.g = z;
                        }
                    }
                    if(!grbb0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)grbb0).ensureMutable();
                    }
                    grbe grbe0 = (grbe)grbb0.b_message;
                    grax grax4 = (grax)hftp0.N_build();
                    grax4.getClass();
                    grbe0.b();
                    grbe0.c.add(grax4);
                    ++v6;
                    v = v;
                    v5 = v5;
                    v1 = v1;
                    gged1 = gged1;
                }
                if(!gged3.isEmpty()) {
                    grbb0.a(gged3);
                }
                grbf0.a(((grbe)((ProtoLiteBuilder)grbb0).N_build()));
                ++v3;
                gged0 = gged0;
                v = v;
                v1 = v1;
                gged1 = gged1;
            }
            if(!grbf0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)grbf0).ensureMutable();
            }
            grbg grbg0 = (grbg)grbf0.b_message;
            grbg0.b |= 2;
            grbg0.d = v4;
            if(!grbf0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)grbf0).ensureMutable();
            }
            ((grbg)grbf0.b_message).c = graz0.e;
            ((grbg)grbf0.b_message).b |= 1;
            ggdy0.i(((grbg)((ProtoLiteBuilder)grbf0).N_build()));
            ++v1;
            gged0 = gged0;
            v = v;
        }
        graw graw0 = (graw)((ProtoLiteMessage)grbi.a).v_newBuilder();
        grbh grbh0 = grbh.a;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grbh0).v_newBuilder();
        int v7 = bgic0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grbh grbh1 = (grbh)hftp1.b_message;
        grbh1.b |= 1;
        grbh1.c = v7;
        grbh grbh2 = (grbh)hftp1.N_build();
        if(!graw0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)graw0).ensureMutable();
        }
        grbi grbi0 = (grbi)graw0.b_message;
        grbh2.getClass();
        grbi0.c = grbh2;
        grbi0.b |= 1;
        graw0.a(ggdy0.h());
        grbi grbi1 = (grbi)((ProtoLiteBuilder)graw0).N_build();
        List list0 = null;
        grbh grbh3 = grbi1.c;
        if(grbh3 != null) {
            grbh0 = grbh3;
        }
        try {
            try {
                bdik bdik0 = new bdik(Status.b, ((MessageLite)grbh0));
                bundle0 = new Bundle();
                bxom.b(bundle0, "status", bdik0.a);
                bundle0.putByteArray("entity", bdik0.b.toBytesArray());
            }
            catch(IOException iOException0) {
                throw new bebz(0xA9F2, "Error while serializing checkup result summary.", null, iOException0);
            }
            ggdy ggdy1 = new ggdy();
            for(Object object1: grbi1.d) {
                gged_interceptors gged6 = gged_interceptors.l(((grbg)object1).toBytesArray());
                ArrayList arrayList0 = new ArrayList();
                CursorWindow cursorWindow0 = bghs.b(0, arrayList0);
                for(int v8 = 0; true; ++v8) {
                    int v9 = ((ggna)gged6).c;
                    if(v8 >= v9) {
                        break;
                    }
                    if(!bghs.a(cursorWindow0, v8, ((byte[])gged6.get(v8)))) {
                        cursorWindow0 = bghs.b(v8, arrayList0);
                        if(!bghs.a(cursorWindow0, v8, ((byte[])gged6.get(v8)))) {
                            throw new bebz(0xA9F1, String.format(Locale.US, "Error while creating data holder. Failed to allocate memory at index %d of %d rows in CursorWindow %d", v8, v9, arrayList0.size()));
                        }
                    }
                }
                Bundle bundle1 = new Bundle();
                ggdy1.i(new DataHolder(new String[]{"value"}, ((CursorWindow[])arrayList0.toArray(new CursorWindow[arrayList0.size()])), 0, bundle1));
            }
            list0 = ggdy1.h();
            ApiMetadata apiMetadata0 = cckf.d(bbdp.aX);
            this.a.a(Status.b, bundle0, list0, apiMetadata0);
        }
        catch(Throwable throwable0) {
            if(list0 != null) {
                for(int v10 = 0; v10 < ((ggna)list0).c; ++v10) {
                    ((DataHolder)list0.get(v10)).close();
                }
            }
            throw throwable0;
        }
        if(list0 != null) {
            for(int v11 = 0; v11 < ((ggna)list0).c; ++v11) {
                ((DataHolder)list0.get(v11)).close();
            }
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, null, null, ApiMetadata.b);
    }
}

