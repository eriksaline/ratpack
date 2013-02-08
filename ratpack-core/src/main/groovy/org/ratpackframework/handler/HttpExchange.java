/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ratpackframework.handler;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.handler.codec.http.Cookie;
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;

import java.io.File;
import java.util.Set;

public interface HttpExchange {

  File getTargetFile();

  void setTargetFile(File targetFile);

  HttpRequest getRequest();

  HttpResponse getResponse();

  void end(String contentType, String content);

  void end(ChannelBuffer channelBuffer);

  void end();

  void end(HttpResponseStatus status);

  void error(Exception e);

  Set<Cookie> getIncomingCookies();

  Set<Cookie> getOutgoingCookies();

  String getUri();

  String getQuery();

  String getPath();
}
