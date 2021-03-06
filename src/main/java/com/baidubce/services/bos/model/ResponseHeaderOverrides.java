/*
 * Copyright 2014 Baidu, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.baidubce.services.bos.model;

import com.baidubce.auth.BceCredentials;
import com.baidubce.model.AbstractBceRequest;

/**
 * Container object for overriding headers on a GetObjectRequest or
 * GeneratePresignedUrlRequest response. Response headers can be set on
 * a GetObjectRequest or a GeneratePresignedUrlRequest in order
 * to control particular HTTP headers in the service response from those service
 * interfaces.
 * <p>
 * For example, a client could dynamically change the apparent
 * Content-Disposition header of a single object, so that it appears to have a
 * different file name for different callers. One client could be configured
 * return the object with
 * <pre>
 * Content-Disposition: attachment; filename=FileName1.exe
 * </pre>
 * while another could return that same object with headers
 * <pre>
 * Content-Disposition: attachment; filename=FileName2.pdf
 * </pre>
 */
public class ResponseHeaderOverrides extends AbstractBceRequest {

    private String contentType;
    private String contentLanguage;
    private String expires;
    private String cacheControl;
    private String contentDisposition;
    private String contentEncoding;

    public static final String RESPONSE_HEADER_CONTENT_TYPE = "responseContentType";
    public static final String RESPONSE_HEADER_CONTENT_LANGUAGE = "responseContentLanguage";
    public static final String RESPONSE_HEADER_EXPIRES = "responseExpires";
    public static final String RESPONSE_HEADER_CACHE_CONTROL = "responseCacheControl";
    public static final String RESPONSE_HEADER_CONTENT_DISPOSITION = "responseContentDisposition";
    public static final String RESPONSE_HEADER_CONTENT_ENCODING = "responseContentEncoding";

    /**
     * The canonical order of parameters for consistent requests, here for
     * reference only.
     */
    @SuppressWarnings("unused")
    private static final String[] PARAMETER_ORDER =
            new String[]{RESPONSE_HEADER_CACHE_CONTROL, RESPONSE_HEADER_CONTENT_DISPOSITION,
                    RESPONSE_HEADER_CONTENT_ENCODING, RESPONSE_HEADER_CONTENT_LANGUAGE,
                    RESPONSE_HEADER_CONTENT_TYPE, RESPONSE_HEADER_EXPIRES,};

    @Override
    public ResponseHeaderOverrides withRequestCredentials(BceCredentials credentials) {
        this.setRequestCredentials(credentials);
        return this;
    }

    /**
     * Returns the content type response header override if it has been
     * specified, or null otherwise.
     *
     * @return Returns the content type response header override if it has been
     * specified, or null otherwise.
     * @see ResponseHeaderOverrides#RESPONSE_HEADER_CONTENT_TYPE
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the content type response header override.
     *
     * @param contentType the content type response header
     * @see ResponseHeaderOverrides#RESPONSE_HEADER_CONTENT_TYPE
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Sets the content type response header override.
     *
     * @param contentType the content type response header
     * @return This {@link ResponseHeaderOverrides} object for method chaining.
     * @see ResponseHeaderOverrides#RESPONSE_HEADER_CONTENT_TYPE
     */
    public ResponseHeaderOverrides withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * Returns the content language response header override if it has been
     * specified, or null otherwise.
     *
     * @return Returns the content language response header override if it has
     * been specified, or null otherwise.
     * @see ResponseHeaderOverrides#RESPONSE_HEADER_CONTENT_LANGUAGE
     */
    public String getContentLanguage() {
        return contentLanguage;
    }

    /**
     * Sets the content language response header override
     *
     * @param contentLanguage the content language response
     * @see ResponseHeaderOverrides#RESPONSE_HEADER_CONTENT_LANGUAGE
     */
    public void setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
    }

    /**
     * Sets the content language response header override
     *
     * @param contentLanguage the content language response
     * @return This {@link ResponseHeaderOverrides} object for method chaining.
     * @see ResponseHeaderOverrides#RESPONSE_HEADER_CONTENT_LANGUAGE
     */
    public ResponseHeaderOverrides withContentLanguage(String contentLanguage) {
        setContentLanguage(contentLanguage);
        return this;
    }

    /**
     * Returns the expires response header override if it has been specified, or
     * null otherwise.
     *
     * @return Returns the expires response header override if it has been
     * specified, or null otherwise.
     * @see ResponseHeaderOverrides#RESPONSE_HEADER_EXPIRES
     */
    public String getExpires() {
        return expires;
    }

    /**
     * Sets the expires response header override.
     *
     * @param expires the expires response header
     * @see ResponseHeaderOverrides#RESPONSE_HEADER_EXPIRES
     */
    public void setExpires(String expires) {
        this.expires = expires;
    }

    /**
     * Sets the expires response header override.
     *
     * @param expires the expires response header
     * @return This {@link ResponseHeaderOverrides} object for method chaining.
     * @see ResponseHeaderOverrides#RESPONSE_HEADER_EXPIRES
     */
    public ResponseHeaderOverrides withExpires(String expires) {
        setExpires(expires);
        return this;
    }

    /**
     * Returns the cache control response header override if it has been
     * specified, or null otherwise.
     *
     * @return Returns the cache control response header override if it has been
     * specified, or null otherwise.
     * @see ResponseHeaderOverrides#RESPONSE_HEADER_CACHE_CONTROL
     */
    public String getCacheControl() {
        return cacheControl;
    }

    /**
     * Sets the cache control response header.
     *
     * @param cacheControl the cache control response header
     * @see ResponseHeaderOverrides#RESPONSE_HEADER_CACHE_CONTROL
     */
    public void setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
    }

    /**
     * Sets the cache control response header.
     *
     * @param cacheControl the cache control response header
     * @return This {@link ResponseHeaderOverrides} object for method chaining.
     * @see ResponseHeaderOverrides#RESPONSE_HEADER_CACHE_CONTROL
     */
    public ResponseHeaderOverrides withCacheControl(String cacheControl) {
        setCacheControl(cacheControl);
        return this;
    }

    /**
     * Returns the content disposition response header override if it has been
     * specified, or null otherwise.
     *
     * @return Returns the content disposition response header override if it
     * has been specified, or null otherwise.
     * @see ResponseHeaderOverrides#RESPONSE_HEADER_CONTENT_DISPOSITION
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /**
     * Sets the content disposition response header override.
     *
     * @param contentDisposition the content disposition response header
     * @see ResponseHeaderOverrides#RESPONSE_HEADER_CONTENT_DISPOSITION
     */
    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    /**
     * Sets the content disposition response header override.
     *
     * @param contentDisposition the content disposition response header
     * @return This {@link ResponseHeaderOverrides} object for method chaining.
     * @see ResponseHeaderOverrides#RESPONSE_HEADER_CONTENT_DISPOSITION
     */
    public ResponseHeaderOverrides withContentDisposition(String contentDisposition) {
        setContentDisposition(contentDisposition);
        return this;
    }

    /**
     * Returns the content encoding response header override if it has been
     * specified, or null otherwise.
     *
     * @return Returns the content encoding response header override if it has
     * been specified, or null otherwise.
     * @see ResponseHeaderOverrides#RESPONSE_HEADER_CONTENT_ENCODING
     */
    public String getContentEncoding() {
        return contentEncoding;
    }

    /**
     * Sets the content encoding response header override.
     *
     * @param contentEncoding the content encoding response header
     * @see ResponseHeaderOverrides#RESPONSE_HEADER_CONTENT_ENCODING
     */
    public void setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    /**
     * Sets the content encoding response header override.
     *
     * @param contentEncoding the content encoding response header
     * @return This {@link ResponseHeaderOverrides} object for method chaining.
     * @see ResponseHeaderOverrides#RESPONSE_HEADER_CONTENT_ENCODING
     */
    public ResponseHeaderOverrides withContentEncoding(String contentEncoding) {
        setContentEncoding(contentEncoding);
        return this;
    }

}
