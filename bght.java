import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;
import com.google.android.gms.credential.manager.invocationparams.IssueType;

public final class bght extends bggt {
    private final IssueType a;
    private final CredentialManagerInvocationParams b;
    private final bdhw c;

    public bght(bdhw bdhw0, IssueType issueType0, CredentialManagerInvocationParams credentialManagerInvocationParams0, azug azug0) {
        super("getNumberOfCredentialsWithIssueOperation", azug0);
        this.c = bdhw0;
        this.a = issueType0;
        this.b = credentialManagerInvocationParams0;
    }

    @Override  // bggt
    protected final void b(Context context0) {
        int v1 = this.a.a;
        if(!gged_interceptors.n(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2)).contains(Integer.valueOf(v1))) {
            Status status0 = new Status(10, "Other issues count is not implemented.");
            ApiMetadata apiMetadata0 = cckf.d(bbdp.aX);
            this.c.a(status0, -1, apiMetadata0);
        }
        Account account0 = new Account(this.b.a.a, "com.google");
        gged_interceptors gged0 = (gged_interceptors)evrg.n(bgid.a(account0, context0).a());
        if(v1 == 0) {
            bdhw bdhw0 = this.c;
            Status status1 = Status.b;
            int v2 = gged0.size();
            int v3 = 0;
            int v4 = 0;
            while(v3 < v2) {
                gged_interceptors gged1 = ((gqlt)gged0.get(v3)).c;
                int v5 = ((ggna)gged1).c;
                int v6 = 0;
                while(v6 < v5) {
                    heqb heqb0 = ((bedg)((gqmd)gged1.get(v6)).j()).e;
                    if((heqb0.b & 0x40000) != 0) {
                        if(((heqb0.s == null ? hept.a : heqb0.s).b & 8) == 0) {
                        label_31:
                            hept hept2 = heqb0.s;
                            if(((hept2 == null ? hept.a : hept2).b & 8) != 0) {
                                if(hept2 == null) {
                                    hept2 = hept.a;
                                }
                                if(!(hept2.f == null ? heps.a : hept2.f).d) {
                                    ++v4;
                                    goto label_44;
                                }
                            }
                            hept hept3 = heqb0.s;
                            if(((hept3 == null ? hept.a : hept3).b & 1) != 0) {
                                if(hept3 == null) {
                                    hept3 = hept.a;
                                }
                                if(!(hept3.c == null ? heps.a : hept3.c).d) {
                                    ++v4;
                                }
                            }
                        }
                        else {
                            hept hept0 = heqb0.s;
                            if(((hept0 == null ? hept.a : hept0).b & 1) == 0) {
                                goto label_31;
                            }
                            else {
                                if(hept0 == null) {
                                    hept0 = hept.a;
                                }
                                if(!(hept0.f == null ? heps.a : hept0.f).d) {
                                    hept hept1 = heqb0.s == null ? hept.a : heqb0.s;
                                    if(!(hept1.c == null ? heps.a : hept1.c).d) {
                                        ++v4;
                                    }
                                }
                            }
                        }
                    }
                label_44:
                    ++v6;
                }
                ++v3;
            }
            bdhw0.a(status1, v4, cckf.d(bbdp.aX));
            return;
        }
        gged_interceptors gged2 = bgga.a(gged0);
        gged_interceptors gged3 = ((bggc)evrg.n((v1 == 1 ? bgid.b(account0, context0).a(gged2) : bgiy.a(gged2)))).b;
        int v7 = gged3.size();
        int v8 = 0;
        for(int v = 0; v < v7; ++v) {
            v8 += ((bgiw)gged3.get(v)).a.size();
        }
        ApiMetadata apiMetadata1 = cckf.d(bbdp.aX);
        this.c.a(Status.b, v8, apiMetadata1);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ApiMetadata apiMetadata0 = cckf.d(bbdp.aX);
        this.c.a(status0, -1, apiMetadata0);
    }
}

