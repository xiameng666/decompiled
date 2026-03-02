package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

public interface Path extends r0, Comparable, Iterable {
    @Override  // j$.nio.file.r0
    l0 c(o0 arg1, c0[] arg2, f0[] arg3);

    @Override  // j$.nio.file.r0
    l0 e(o0 arg1, c0[] arg2);

    boolean endsWith(String arg1);

    @Override
    boolean equals(Object arg1);

    Path getFileName();

    i getFileSystem();

    Path getName(int arg1);

    int getNameCount();

    Path getParent();

    Path getRoot();

    Path h(LinkOption[] arg1);

    boolean isAbsolute();

    @Override
    Iterator iterator();

    int j(Path arg1);

    boolean l(Path arg1);

    boolean m(Path arg1);

    Path normalize();

    Path o(Path arg1);

    Path r(Path arg1);

    Path resolve(Path arg1);

    Path resolve(String arg1);

    Path resolveSibling(String arg1);

    boolean startsWith(String arg1);

    Path subpath(int arg1, int arg2);

    Path toAbsolutePath();

    File toFile();

    @Override
    String toString();

    URI toUri();
}

