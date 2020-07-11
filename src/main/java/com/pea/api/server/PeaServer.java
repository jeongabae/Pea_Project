package com.pea.api.server;

import com.pea.api.daily.DailyFactory;
import com.pea.api.hospital.HospitalFactory;

public class PeaServer {

    public PeaServer() {
        init();
    }

    private void init() {
        new DailyFactory();
        new HospitalFactory();
    }
}
