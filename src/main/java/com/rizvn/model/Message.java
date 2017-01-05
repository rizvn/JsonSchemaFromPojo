package com.rizvn.model;

import com.rizvn.model.request.Request;
import com.rizvn.model.response.Response;

import java.security.PublicKey;

/**
 * Created by Riz
 */
public class Message {
  public Request request;

  public Response response;

  public Request getRequest() {
    return request;
  }

  public void setRequest(Request request) {
    this.request = request;
  }

  public Response getResponse() {
    return response;
  }

  public void setResponse(Response response) {
    this.response = response;
  }
}
