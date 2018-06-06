package com.crunchify.restjersey;

import org.json.HTTP;
import org.json.JSONException;
import org.json.JSONObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@Path("/ctofservice2")
public class CtoFService2 {
    @POST
    @Produces("application/xml")
    public String convertCtoF() {

        Double fahrenheit;
        Double celsius = 36.8;
        fahrenheit = ((celsius * 9) / 5) + 32;

        String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
        return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String createTrackInJSON(@FormParam("mobile_number") String debit_user_id) {
        return "<ctofservice2>" + "<celsius>" + 1 + "</celsius>" + "<ctofoutput>" + 2 + "</ctofoutput>" + "</ctofservice>";
    }

    @Path("{c2}")
    @POST
    @Produces("application/xml")
    public String convertCtoFfromInput2(@PathParam("c2") Double c2) {
        Double fahrenheit;
        Double celsius = c2;
        fahrenheit = ((celsius * 9) / 5) + 32;

        String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
        return "<ctofservice2>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
    }
    //curl http://w3.org/ -d "hello=there" --trace-ascii /dev/stdout
}