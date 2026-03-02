public final class akpu implements lqj {
    public final akpv a;

    public akpu(akpv akpv0) {
        this.a = akpv0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        akpv akpv0 = this.a;
        switch(((akqg)object0).ordinal()) {
            case 0: {
                akpv0.b("UnmanagedWorkProfileLoadingScreen");
                return;
            }
            case 1: {
                akpv0.b("UnmanagedWorkProfileSeparateAppsScreen");
                return;
            }
            case 2: {
                akpv0.b("UnmanagedWorkProfileBriefcaseBadgeScreen");
                return;
            }
            case 3: {
                akpv0.b.a(-1);
                return;
            }
            case 4: {
                akpv0.b.a(0);
            }
        }
    }
}

