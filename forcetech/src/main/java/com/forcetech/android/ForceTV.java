package com.forcetech.android;

import com.github.catvod.utils.GithubDown;

public class ForceTV {

    public void start(String lib, int port) {
        try {
            System.load(GithubDown.getSo(lib));
            start(port, 20 * 1024 * 1024);
        } catch (Throwable ignored) {
        }
    }

    public native int start(int port, int size);

    public native int stop();
}
