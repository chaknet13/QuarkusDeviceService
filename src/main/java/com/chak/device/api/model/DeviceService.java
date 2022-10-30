package com.chak.device.api.model;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.lang.annotation.Target;

@Path("/device")
public class DeviceService {
    @GET
    public Response getDevice() {
        Device device = new Device();
        device.setName("LG Gram");
        device.setType("Ultraportable");
        return Response.ok(device).build();
    }
}
