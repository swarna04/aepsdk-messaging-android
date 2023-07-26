/*
  Copyright 2023 Adobe. All rights reserved.
  This file is licensed to you under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software distributed under
  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
  OF ANY KIND, either express or implied. See the License for the specific language
  governing permissions and limitations under the License.
*/

package com.adobe.marketing.mobile;

import java.net.URI;

/**
 * An entity uniquely defined by a URI that can be interacted with.
 */
public class Surface {
    private static final String SURFACE_BASE = "mobileapp";

    private final String uri;

    public Surface(final String surfaceUri) {
        this.uri = surfaceUri;
    }

    public String getUri() {
        return uri;
    }

    public boolean isValid() {
        final URI uri = URI.create(this.uri);
        return SURFACE_BASE.equals(uri.getScheme());
    }
}