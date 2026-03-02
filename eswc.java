import android.content.Context;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation.NfcEventCallback;
import android.nfc.cardemulation.CardEmulation;
import android.os.SystemClock;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

public final class eswc implements CardEmulation.NfcEventCallback {
    public static final esvy a;
    public static volatile eswc b;
    public final ibpf c;
    private static final bboh d;
    private boolean e;
    private boolean f;

    static {
        eswc.a = new esvy();
        eswc.d = bboh.b("TapAndPay", bbcu.aM);
    }

    public eswc() {
        this.c = new ibpf();
    }

    public static final eswc a() {
        return eswc.a.a();
    }

    public final void b(Context context0) {
        synchronized(this) {
            ibuq.f(context0, "context");
            if(!this.e && hysu.c()) {
                NfcAdapter nfcAdapter0 = NfcAdapter.getDefaultAdapter(context0);
                if(nfcAdapter0 != null) {
                    CardEmulation cardEmulation0 = CardEmulation.getInstance(nfcAdapter0);
                    if(cardEmulation0 != null) {
                        cardEmulation0.registerNfcEventCallback(new bblp(1, 10), this);
                        this.e = true;
                    }
                }
            }
        }
    }

    public final void c(boolean z) {
        boolean z1 = false;
        if(bbqa.a()) {
            if(!rit.a) {
                rit.a();
            }
            if(rit.b && z) {
                z1 = true;
            }
        }
        this.f = z1;
    }

    private final void d(esvz esvz0) {
        ibpf ibpf0;
        while(true) {
            ibpf0 = this.c;
            if(ibpf0.a <= 50) {
                break;
            }
            ibpf0.removeFirst();
        }
        ibpf0.add(esvz0);
    }

    private static final etmv e() {
        Context context0 = AppContextProvider.a();
        if(context0 != null) {
            AccountInfo accountInfo0 = eset.e(context0);
            return accountInfo0 == null ? null : new etmv(context0, accountInfo0);
        }
        return null;
    }

    private static final boolean f() {
        switch(new dyct().g()) {
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public final void onAidConflictOccurred(String s) {
        ibuq.f(s, "aid");
        etmv etmv0 = eswc.e();
        if(etmv0 == null) {
            return;
        }
        gjqh gjqh0 = gjqg.a(((ProtoLiteMessage)gjvl.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjvf.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(s, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjvf gjvf0 = (gjvf)hftp0.b_message;
        s.getClass();
        gjvf0.b |= 1;
        gjvf0.c = s;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gjvf)hftv0), "value");
        ProtoLiteBuilder hftp1 = gjqh0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjvl gjvl0 = (gjvl)hftp1.b_message;
        ((gjvf)hftv0).getClass();
        gjvl0.d = (gjvf)hftv0;
        gjvl0.c = 3;
        gjqh0.c(eswc.f());
        gjqh0.b(esyj.a().m());
        etmv0.v(gjqh0.a());
    }

    public final void onAidNotRouted(String s) {
        ibuq.f(s, "aid");
        etmv etmv0 = eswc.e();
        if(etmv0 == null) {
            return;
        }
        gjqh gjqh0 = gjqg.a(((ProtoLiteMessage)gjvl.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjvg.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(s, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjvg gjvg0 = (gjvg)hftp0.b_message;
        s.getClass();
        gjvg0.b |= 1;
        gjvg0.c = s;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gjvg)hftv0), "value");
        ProtoLiteBuilder hftp1 = gjqh0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjvl gjvl0 = (gjvl)hftp1.b_message;
        ((gjvg)hftv0).getClass();
        gjvl0.d = (gjvg)hftv0;
        gjvl0.c = 4;
        gjqh0.c(eswc.f());
        gjqh0.b(esyj.a().m());
        etmv0.v(gjqh0.a());
    }

    public final void onInternalErrorReported(int v) {
        gjvi gjvi0;
        etmv etmv0 = eswc.e();
        if(etmv0 == null) {
            return;
        }
        switch(v) {
            case 1: {
                gjvi0 = gjvi.b;
                break;
            }
            case 2: {
                gjvi0 = gjvi.c;
                break;
            }
            case 3: {
                gjvi0 = gjvi.d;
                break;
            }
            default: {
                gjvi0 = gjvi.a;
            }
        }
        gjqh gjqh0 = gjqg.a(((ProtoLiteMessage)gjvl.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjvj.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(gjvi0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjvj)hftp0.b_message).c = gjvi0.e;
        ((gjvj)hftp0.b_message).b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gjvj)hftv0), "value");
        ProtoLiteBuilder hftp1 = gjqh0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjvl gjvl0 = (gjvl)hftp1.b_message;
        ((gjvj)hftv0).getClass();
        gjvl0.d = (gjvj)hftv0;
        gjvl0.c = 5;
        gjqh0.c(eswc.f());
        gjqh0.b(esyj.a().m());
        etmv0.v(gjqh0.a());
    }

    public final void onNfcStateChanged(int v) {
        gjve gjve0;
        etmv etmv0 = eswc.e();
        if(etmv0 == null) {
            return;
        }
        switch(v) {
            case 1: {
                gjve0 = gjve.b;
                break;
            }
            case 2: {
                gjve0 = gjve.c;
                break;
            }
            case 3: {
                gjve0 = gjve.d;
                break;
            }
            case 4: {
                gjve0 = gjve.e;
                break;
            }
            default: {
                gjve0 = gjve.a;
            }
        }
        gjqh gjqh0 = gjqg.a(((ProtoLiteMessage)gjvl.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjvk.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(gjve0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjvk)hftp0.b_message).c = gjve0.f;
        ((gjvk)hftp0.b_message).b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gjvk)hftv0), "value");
        ProtoLiteBuilder hftp1 = gjqh0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjvl gjvl0 = (gjvl)hftp1.b_message;
        ((gjvk)hftv0).getClass();
        gjvl0.d = (gjvk)hftv0;
        gjvl0.c = 2;
        gjqh0.c(eswc.f());
        gjqh0.b(esyj.a().m());
        etmv0.v(gjqh0.a());
    }

    public final void onOffHostAidSelected(String s, String s1) {
        ibuq.f(s, "aid");
        ibuq.f(s1, "offHostSecureElement");
        if(!this.f) {
            return;
        }
        this.d(new eswa(s, SystemClock.elapsedRealtime()));
    }

    public final void onPreferredServiceChanged(boolean z) {
        if(z) {
            ((ggtj)eswc.d.h()).x("Tapandpay is the Wallet Role holder");
        }
        else {
            ((ggtj)eswc.d.h()).x("Tapandpay no longer holds the Wallet Role");
        }
        if(hyuo.e()) {
            etts.a().c();
        }
    }

    public final void onRemoteFieldChanged(boolean z) {
        if(!this.f) {
            return;
        }
        this.d(new eswb(z, SystemClock.elapsedRealtime()));
    }
}

