package com.google.android.gms.identitycredentials.credentialexchange;

import hmxq;
import hmxv;
import hmxw;
import hmxy;
import hmyd;
import hmys;
import hmzr;
import ibod;
import ibpu;
import ibuq;

public final class CredentialExchangeFormat_Credential_FileCredentialJsonAdapter extends hmxq {
    private final hmxw a;
    private final hmxq b;
    private final hmxq c;

    public CredentialExchangeFormat_Credential_FileCredentialJsonAdapter(hmys hmys0) {
        ibuq.f(hmys0, "moshi");
        super();
        this.a = hmxv.a(new String[]{"id", "name", "decryptedSize", "integrityHash"});
        this.b = hmys0.d(String.class, ibpu.a, "id");
        this.c = hmys0.d(ibod.class, ibpu.a, "decryptedSize");
    }

    @Override  // hmxq
    public final Object a(hmxy hmxy0) {
        hmxy0.i();
        String s = null;
        String s1 = null;
        ibod ibod0 = null;
        String s2 = null;
        while(hmxy0.o()) {
            switch(hmxy0.c(this.a)) {
                case -1: {
                    hmxy0.m();
                    hmxy0.n();
                    continue;
                }
                case 0: {
                    s = (String)this.b.a(hmxy0);
                    if(s != null) {
                        continue;
                    }
                    throw hmzr.c("id", "id", hmxy0);
                }
                case 1: {
                    s1 = (String)this.b.a(hmxy0);
                    if(s1 != null) {
                        continue;
                    }
                    throw hmzr.c("name", "name", hmxy0);
                }
                case 2: {
                    ibod0 = (ibod)this.c.a(hmxy0);
                    if(ibod0 != null) {
                        continue;
                    }
                    throw hmzr.c("decryptedSize", "decryptedSize", hmxy0);
                }
                case 3: {
                    s2 = (String)this.b.a(hmxy0);
                    if(s2 == null) {
                        throw hmzr.c("integrityHash", "integrityHash", hmxy0);
                    }
                }
            }
        }
        hmxy0.k();
        if(s == null) {
            throw hmzr.b("id", "id", hmxy0);
        }
        if(s1 == null) {
            throw hmzr.b("name", "name", hmxy0);
        }
        if(ibod0 == null) {
            throw hmzr.b("decryptedSize", "decryptedSize", hmxy0);
        }
        if(s2 != null) {
            return new CredentialExchangeFormat.Credential.FileCredential(s, s1, ibod0.a, s2);
        }
        throw hmzr.b("integrityHash", "integrityHash", hmxy0);
    }

    @Override  // hmxq
    public final void b(hmyd hmyd0, Object object0) {
        if(((CredentialExchangeFormat.Credential.FileCredential)object0) == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        hmyd0.d();
        hmyd0.j("id");
        this.b.b(hmyd0, ((CredentialExchangeFormat.Credential.FileCredential)object0).a);
        hmyd0.j("name");
        this.b.b(hmyd0, ((CredentialExchangeFormat.Credential.FileCredential)object0).b);
        hmyd0.j("decryptedSize");
        ibod ibod0 = new ibod(((CredentialExchangeFormat.Credential.FileCredential)object0).c);
        this.c.b(hmyd0, ibod0);
        hmyd0.j("integrityHash");
        this.b.b(hmyd0, ((CredentialExchangeFormat.Credential.FileCredential)object0).d);
        hmyd0.f();
    }

    @Override
    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Credential.FileCredential)";
    }
}

