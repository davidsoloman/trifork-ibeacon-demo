package com.trifork.ibeacon.eventbus;

import org.altbeacon.beacon.Region;

public class RequestBeaconScanEvent implements OttoEvent {

    private Region region;

    public RequestBeaconScanEvent(Region region) {
        this.region = region;
    }

    public Region getRegion() {
        return region;
    }
}
