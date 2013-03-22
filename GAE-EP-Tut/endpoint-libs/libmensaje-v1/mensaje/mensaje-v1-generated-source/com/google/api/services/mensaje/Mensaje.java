/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This file was generated.
 *  with google-apis-code-generator 1.2.0 (build: 2013-03-04 17:44:07 UTC)
 *  on 2013-03-18 at 00:30:57 UTC 
 */

package com.google.api.services.mensaje;

import com.google.api.client.googleapis.GoogleUtils;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.common.base.Preconditions;

/**
 * Service definition for Mensaje (v1).
 *
 * <p>
 * 
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link MensajeRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * <p>
 * Upgrade warning: this class now extends {@link AbstractGoogleJsonClient}, whereas in prior
 * version 1.8 it extended {@link com.google.api.client.googleapis.services.GoogleClient}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Mensaje extends AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    Preconditions.checkState(GoogleUtils.VERSION.equals("1.13.2-beta"),
        "You are currently running with version %s of google-api-client. " +
        "You need version 1.13.2-beta of google-api-client to run version " +
        "1.13.2-beta of the  library.", GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://gae-ep-tut.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "mensaje/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   * @deprecated (scheduled to be removed in 1.13)
   */
  @Deprecated
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport
   * @param jsonFactory JSON factory
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Mensaje(HttpTransport transport, JsonFactory jsonFactory,
      HttpRequestInitializer httpRequestInitializer) {
    super(transport,
        jsonFactory,
        DEFAULT_ROOT_URL,
        DEFAULT_SERVICE_PATH,
        httpRequestInitializer,
        false);
  }

  /**
   * @param transport HTTP transport
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @param rootUrl root URL of the service
   * @param servicePath service path
   * @param jsonObjectParser JSON object parser
   * @param googleClientRequestInitializer Google request initializer or {@code null} for none
   * @param applicationName application name to be sent in the User-Agent header of requests or
   *        {@code null} for none
   * @param suppressPatternChecks whether discovery pattern checks should be suppressed on required
   *        parameters
   */
  Mensaje(HttpTransport transport,
      HttpRequestInitializer httpRequestInitializer,
      String rootUrl,
      String servicePath,
      JsonObjectParser jsonObjectParser,
      GoogleClientRequestInitializer googleClientRequestInitializer,
      String applicationName,
      boolean suppressPatternChecks) {
    super(transport,
        httpRequestInitializer,
        rootUrl,
        servicePath,
        jsonObjectParser,
        googleClientRequestInitializer,
        applicationName,
        suppressPatternChecks);
  }

  @Override
  protected void initialize(AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getMensaje".
   *
   * This request holds the parameters needed by the the mensaje server.  After setting any optional
   * parameters, call the {@link GetMensaje#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetMensaje getMensaje(String id) throws java.io.IOException {
    GetMensaje result = new GetMensaje(id);
    initialize(result);
    return result;
  }

  public class GetMensaje extends MensajeRequest<com.google.api.services.mensaje.model.Mensaje> {

    private static final String REST_PATH = "mensaje/{id}";

    /**
     * Create a request for the method "getMensaje".
     *
     * This request holds the parameters needed by the the mensaje server.  After setting any optional
     * parameters, call the {@link GetMensaje#execute()} method to invoke the remote operation. <p>
     * {@link GetMensaje#initialize(AbstractGoogleClientRequest)} must be called to initialize this
     * instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetMensaje(String id) {
      super(Mensaje.this, "GET", REST_PATH, null, com.google.api.services.mensaje.model.Mensaje.class);
      this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetMensaje setAlt(String alt) {
      return (GetMensaje) super.setAlt(alt);
    }

    @Override
    public GetMensaje setFields(String fields) {
      return (GetMensaje) super.setFields(fields);
    }

    @Override
    public GetMensaje setKey(String key) {
      return (GetMensaje) super.setKey(key);
    }

    @Override
    public GetMensaje setOauthToken(String oauthToken) {
      return (GetMensaje) super.setOauthToken(oauthToken);
    }

    @Override
    public GetMensaje setPrettyPrint(Boolean prettyPrint) {
      return (GetMensaje) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetMensaje setQuotaUser(String quotaUser) {
      return (GetMensaje) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetMensaje setUserIp(String userIp) {
      return (GetMensaje) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private String id;

    /**

     */
    public String getId() {
      return id;
    }

    public GetMensaje setId(String id) {
      this.id = id;
      return this;
    }

  }

  /**
   * Create a request for the method "insertMensaje".
   *
   * This request holds the parameters needed by the the mensaje server.  After setting any optional
   * parameters, call the {@link InsertMensaje#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.google.api.services.mensaje.model.Mensaje}
   * @return the request
   */
  public InsertMensaje insertMensaje(com.google.api.services.mensaje.model.Mensaje content) throws java.io.IOException {
    InsertMensaje result = new InsertMensaje(content);
    initialize(result);
    return result;
  }

  public class InsertMensaje extends MensajeRequest<com.google.api.services.mensaje.model.Mensaje> {

    private static final String REST_PATH = "mensaje";

    /**
     * Create a request for the method "insertMensaje".
     *
     * This request holds the parameters needed by the the mensaje server.  After setting any optional
     * parameters, call the {@link InsertMensaje#execute()} method to invoke the remote operation. <p>
     * {@link InsertMensaje#initialize(AbstractGoogleClientRequest)} must be called to initialize this
     * instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.google.api.services.mensaje.model.Mensaje}
     * @since 1.13
     */
    protected InsertMensaje(com.google.api.services.mensaje.model.Mensaje content) {
      super(Mensaje.this, "POST", REST_PATH, content, com.google.api.services.mensaje.model.Mensaje.class);
    }

    @Override
    public InsertMensaje setAlt(String alt) {
      return (InsertMensaje) super.setAlt(alt);
    }

    @Override
    public InsertMensaje setFields(String fields) {
      return (InsertMensaje) super.setFields(fields);
    }

    @Override
    public InsertMensaje setKey(String key) {
      return (InsertMensaje) super.setKey(key);
    }

    @Override
    public InsertMensaje setOauthToken(String oauthToken) {
      return (InsertMensaje) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertMensaje setPrettyPrint(Boolean prettyPrint) {
      return (InsertMensaje) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertMensaje setQuotaUser(String quotaUser) {
      return (InsertMensaje) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertMensaje setUserIp(String userIp) {
      return (InsertMensaje) super.setUserIp(userIp);
    }

  }

  /**
   * Create a request for the method "listMensaje".
   *
   * This request holds the parameters needed by the the mensaje server.  After setting any optional
   * parameters, call the {@link ListMensaje#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public ListMensaje listMensaje() throws java.io.IOException {
    ListMensaje result = new ListMensaje();
    initialize(result);
    return result;
  }

  public class ListMensaje extends MensajeRequest<com.google.api.services.mensaje.model.Mensajes> {

    private static final String REST_PATH = "mensaje";

    /**
     * Create a request for the method "listMensaje".
     *
     * This request holds the parameters needed by the the mensaje server.  After setting any optional
     * parameters, call the {@link ListMensaje#execute()} method to invoke the remote operation. <p>
     * {@link ListMensaje#initialize(AbstractGoogleClientRequest)} must be called to initialize this
     * instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListMensaje() {
      super(Mensaje.this, "GET", REST_PATH, null, com.google.api.services.mensaje.model.Mensajes.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListMensaje setAlt(String alt) {
      return (ListMensaje) super.setAlt(alt);
    }

    @Override
    public ListMensaje setFields(String fields) {
      return (ListMensaje) super.setFields(fields);
    }

    @Override
    public ListMensaje setKey(String key) {
      return (ListMensaje) super.setKey(key);
    }

    @Override
    public ListMensaje setOauthToken(String oauthToken) {
      return (ListMensaje) super.setOauthToken(oauthToken);
    }

    @Override
    public ListMensaje setPrettyPrint(Boolean prettyPrint) {
      return (ListMensaje) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListMensaje setQuotaUser(String quotaUser) {
      return (ListMensaje) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListMensaje setUserIp(String userIp) {
      return (ListMensaje) super.setUserIp(userIp);
    }

  }

  /**
   * Create a request for the method "removeMensaje".
   *
   * This request holds the parameters needed by the the mensaje server.  After setting any optional
   * parameters, call the {@link RemoveMensaje#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public RemoveMensaje removeMensaje(String id) throws java.io.IOException {
    RemoveMensaje result = new RemoveMensaje(id);
    initialize(result);
    return result;
  }

  public class RemoveMensaje extends MensajeRequest<com.google.api.services.mensaje.model.Mensaje> {

    private static final String REST_PATH = "mensaje/{id}";

    /**
     * Create a request for the method "removeMensaje".
     *
     * This request holds the parameters needed by the the mensaje server.  After setting any optional
     * parameters, call the {@link RemoveMensaje#execute()} method to invoke the remote operation. <p>
     * {@link RemoveMensaje#initialize(AbstractGoogleClientRequest)} must be called to initialize this
     * instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveMensaje(String id) {
      super(Mensaje.this, "DELETE", REST_PATH, null, com.google.api.services.mensaje.model.Mensaje.class);
      this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveMensaje setAlt(String alt) {
      return (RemoveMensaje) super.setAlt(alt);
    }

    @Override
    public RemoveMensaje setFields(String fields) {
      return (RemoveMensaje) super.setFields(fields);
    }

    @Override
    public RemoveMensaje setKey(String key) {
      return (RemoveMensaje) super.setKey(key);
    }

    @Override
    public RemoveMensaje setOauthToken(String oauthToken) {
      return (RemoveMensaje) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveMensaje setPrettyPrint(Boolean prettyPrint) {
      return (RemoveMensaje) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveMensaje setQuotaUser(String quotaUser) {
      return (RemoveMensaje) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveMensaje setUserIp(String userIp) {
      return (RemoveMensaje) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private String id;

    /**

     */
    public String getId() {
      return id;
    }

    public RemoveMensaje setId(String id) {
      this.id = id;
      return this;
    }

  }

  /**
   * Create a request for the method "updateMensaje".
   *
   * This request holds the parameters needed by the the mensaje server.  After setting any optional
   * parameters, call the {@link UpdateMensaje#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.google.api.services.mensaje.model.Mensaje}
   * @return the request
   */
  public UpdateMensaje updateMensaje(com.google.api.services.mensaje.model.Mensaje content) throws java.io.IOException {
    UpdateMensaje result = new UpdateMensaje(content);
    initialize(result);
    return result;
  }

  public class UpdateMensaje extends MensajeRequest<com.google.api.services.mensaje.model.Mensaje> {

    private static final String REST_PATH = "mensaje";

    /**
     * Create a request for the method "updateMensaje".
     *
     * This request holds the parameters needed by the the mensaje server.  After setting any optional
     * parameters, call the {@link UpdateMensaje#execute()} method to invoke the remote operation. <p>
     * {@link UpdateMensaje#initialize(AbstractGoogleClientRequest)} must be called to initialize this
     * instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.google.api.services.mensaje.model.Mensaje}
     * @since 1.13
     */
    protected UpdateMensaje(com.google.api.services.mensaje.model.Mensaje content) {
      super(Mensaje.this, "PUT", REST_PATH, content, com.google.api.services.mensaje.model.Mensaje.class);
    }

    @Override
    public UpdateMensaje setAlt(String alt) {
      return (UpdateMensaje) super.setAlt(alt);
    }

    @Override
    public UpdateMensaje setFields(String fields) {
      return (UpdateMensaje) super.setFields(fields);
    }

    @Override
    public UpdateMensaje setKey(String key) {
      return (UpdateMensaje) super.setKey(key);
    }

    @Override
    public UpdateMensaje setOauthToken(String oauthToken) {
      return (UpdateMensaje) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateMensaje setPrettyPrint(Boolean prettyPrint) {
      return (UpdateMensaje) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateMensaje setQuotaUser(String quotaUser) {
      return (UpdateMensaje) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateMensaje setUserIp(String userIp) {
      return (UpdateMensaje) super.setUserIp(userIp);
    }

  }

  /**
   * Builder for {@link Mensaje}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport
     * @param jsonFactory JSON factory
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(HttpTransport transport, JsonFactory jsonFactory,
        HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Mensaje}. */
    @Override
    public Mensaje build() {
      return new Mensaje(getTransport(),
          getHttpRequestInitializer(),
          getRootUrl(),
          getServicePath(),
          getObjectParser(),
          getGoogleClientRequestInitializer(),
          getApplicationName(),
          getSuppressPatternChecks());
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    /**
     * Set the {@link MensajeRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setMensajeRequestInitializer(
        MensajeRequestInitializer mensajeRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(mensajeRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
